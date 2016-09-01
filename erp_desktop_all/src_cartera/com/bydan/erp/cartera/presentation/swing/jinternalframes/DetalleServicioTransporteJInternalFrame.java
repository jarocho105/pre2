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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleServicioTransporteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleServicioTransporteJInternalFrame extends DetalleServicioTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleServicioTransporte;
	
	protected JMenuBar jmenuBarDetalleServicioTransporte;
	
	protected JMenu jmenuDetalleServicioTransporte;
	protected JMenu jmenuDatosDetalleServicioTransporte;
	protected JMenu jmenuArchivoDetalleServicioTransporte;
	protected JMenu jmenuAccionesDetalleServicioTransporte;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleServicioTransporte;	
	protected GridBagConstraints gridBagConstraintsDetalleServicioTransporte;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleServicioTransporteDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleServicioTransporte;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleServicioTransporte;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleServicioTransporte;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_serviciotransporte="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean;
		
	
	
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleServicioTransporte> detalleserviciotransportes;		
	public List<DetalleServicioTransporte> detalleserviciotransportesEliminados;	
	public List<DetalleServicioTransporte> detalleserviciotransportesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleServicioTransporte;		
	protected JButton jButtonAbrirOrderByDetalleServicioTransporte;
	
	
	//protected JPanel jPanelOrderByDetalleServicioTransporte;
	//public JScrollPane jScrollPanelOrderByDetalleServicioTransporte;	
	//protected JButton jButtonCerrarOrderByDetalleServicioTransporte;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleServicioTransporteLogic detalleserviciotransporteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleServicioTransporte;
	public JScrollPane jScrollPanelDatosEdicionDetalleServicioTransporte;
	public JScrollPane jScrollPanelDatosGeneralDetalleServicioTransporte;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleServicioTransporteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleServicioTransporte;
	//public JScrollPane jScrollPanelImportacionDetalleServicioTransporte;
	
	
	
	protected JPanel jPanelAccionesDetalleServicioTransporte;
	
    protected JPanel jPanelPaginacionDetalleServicioTransporte;
    protected JPanel jPanelParametrosReportesDetalleServicioTransporte;
	protected JPanel jPanelParametrosReportesAccionesDetalleServicioTransporte;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar2DetalleServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar3DetalleServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar4DetalleServicioTransporte;
	//protected JPanel jPanelParametrosAuxiliar5DetalleServicioTransporte;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleServicioTransporte;
	//protected JPanel jPanelImportacionDetalleServicioTransporte;
	
	
	public JTable jTableDatosDetalleServicioTransporte;
	
	
	
	//public JTable jTableDatosDetalleServicioTransporteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleServicioTransporte;
	protected JButton jButtonDuplicarDetalleServicioTransporte;
	protected JButton jButtonCopiarDetalleServicioTransporte;
	protected JButton jButtonVerFormDetalleServicioTransporte;
	protected JButton jButtonNuevoRelacionesDetalleServicioTransporte;
	protected JButton jButtonModificarDetalleServicioTransporte;
	
    protected JButton jButtonGuardarCambiosTablaDetalleServicioTransporte;
	protected JButton jButtonCerrarDetalleServicioTransporte;
	
	
	protected JButton jButtonRecargarInformacionDetalleServicioTransporte;
	protected JButton jButtonProcesarInformacionDetalleServicioTransporte;
	
	
	protected JButton jButtonAnterioresDetalleServicioTransporte;
	protected JButton jButtonSiguientesDetalleServicioTransporte;
	protected JButton jButtonNuevoGuardarCambiosDetalleServicioTransporte;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleServicioTransporte;
	//protected JButton jButtonCerrarReporteDinamicoDetalleServicioTransporte;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleServicioTransporte;
	//protected JButton jButtonGenerarImportacionDetalleServicioTransporte;
	//protected JButton jButtonCerrarImportacionDetalleServicioTransporte;
	//protected JFileChooser jFileChooserImportacionDetalleServicioTransporte;
	//protected File fileImportacionDetalleServicioTransporte;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleServicioTransporte;
	protected JButton jButtonDuplicarToolBarDetalleServicioTransporte;
	protected JButton jButtonNuevoRelacionesToolBarDetalleServicioTransporte;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleServicioTransporte;
	protected JButton jButtonCopiarToolBarDetalleServicioTransporte;
	protected JButton jButtonVerFormToolBarDetalleServicioTransporte;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleServicioTransporte;
	protected JButton jButtonCerrarToolBarDetalleServicioTransporte;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleServicioTransporte;
	protected JButton jButtonProcesarInformacionToolBarDetalleServicioTransporte;
	protected JButton jButtonAnterioresToolBarDetalleServicioTransporte;
	protected JButton jButtonSiguientesToolBarDetalleServicioTransporte;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte;
	protected JButton jButtonAbrirOrderByToolBarDetalleServicioTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleServicioTransporte;
	protected JMenuItem jMenuItemDuplicarDetalleServicioTransporte;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleServicioTransporte;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleServicioTransporte;
	protected JMenuItem jMenuItemCopiarDetalleServicioTransporte;
	protected JMenuItem jMenuItemVerFormDetalleServicioTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleServicioTransporte;
	protected JMenuItem jMenuItemCerrarDetalleServicioTransporte;
	protected JMenuItem jMenuItemDetalleCerrarDetalleServicioTransporte;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleServicioTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleServicioTransporte;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleServicioTransporte;
	protected JMenuItem jMenuItemProcesarInformacionDetalleServicioTransporte;
	protected JMenuItem jMenuItemAnterioresDetalleServicioTransporte;
	protected JMenuItem jMenuItemSiguientesDetalleServicioTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleServicioTransporte;
	protected JMenuItem jMenuItemAbrirOrderByDetalleServicioTransporte;
	protected JMenuItem jMenuItemMostrarOcultarDetalleServicioTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleServicioTransporte;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleServicioTransporte;
	protected JCheckBox jCheckBoxSeleccionadosDetalleServicioTransporte;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleServicioTransporte;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleServicioTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleServicioTransporte;
	protected JTextField jTextFieldValorCampoGeneralDetalleServicioTransporte;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleServicioTransporte;
	//public JList<Reporte> jListColumnasSelectReporteDetalleServicioTransporte;
	//public JScrollPane jScrollColumnasSelectReporteDetalleServicioTransporte;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleServicioTransporte;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleServicioTransporte;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleServicioTransporte;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleServicioTransporte;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleServicioTransporte;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte;
	
		
	//public JLabel jLabelArchivoImportacionDetalleServicioTransporte;	
	//public JLabel jLabelPathArchivoImportacionDetalleServicioTransporte;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleServicioTransporte;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleServicioTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleServicioTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleServicioTransporte;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleServicioTransporte;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleServicioTransporte;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleServicioTransporte;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleServicioTransporte;
	public JPanel jPanelFK_IdBodegaDetalleServicioTransporte;
	public JButton jButtonFK_IdBodegaDetalleServicioTransporte;
	public JPanel jPanelFK_IdCentroCostoDetalleServicioTransporte;
	public JButton jButtonFK_IdCentroCostoDetalleServicioTransporte;
	public JPanel jPanelFK_IdProductoDetalleServicioTransporte;
	public JButton jButtonFK_IdProductoDetalleServicioTransporte;
	public JPanel jPanelFK_IdServicioTransporteDetalleServicioTransporte;
	public JButton jButtonFK_IdServicioTransporteDetalleServicioTransporte;
	public JPanel jPanelFK_IdUnidadDetalleServicioTransporte;
	public JButton jButtonFK_IdUnidadDetalleServicioTransporte;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleServicioTransporte;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleServicioTransporteBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleServicioTransporteArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleServicioTransporte;
	public JLabel jLabelid_productoFK_IdProductoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleServicioTransporte;
	public JButton jButtonid_productoFK_IdProductoDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleServicioTransporteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte;
	
	public JPanel jPanelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte;
	public JLabel jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte;
	public JButton jButtonid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleServicioTransporte;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte;
	public JButton jButtonid_unidadFK_IdUnidadDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleServicioTransporteBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleServicioTransporteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleServicioTransporte)	{
		this.jButtonRecargarInformacionDetalleServicioTransporte = jButtonRecargarInformacionDetalleServicioTransporte;
	}
	
	public JButton getjButtonProcesarInformacionDetalleServicioTransporte() {
		return this.jButtonProcesarInformacionDetalleServicioTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleServicioTransporte)	{
		this.jButtonProcesarInformacionDetalleServicioTransporte = jButtonProcesarInformacionDetalleServicioTransporte;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleServicioTransporte() {
		return this.jButtonRecargarInformacionDetalleServicioTransporte;
	}
	
	
	public List<DetalleServicioTransporte> getdetalleserviciotransportes() {
		return this.detalleserviciotransportes;
	}

	public void setdetalleserviciotransportes(List<DetalleServicioTransporte> detalleserviciotransportes) {
		this.detalleserviciotransportes = detalleserviciotransportes;
	}
	
	public List<DetalleServicioTransporte> getdetalleserviciotransportesAux() {
		return this.detalleserviciotransportesAux;
	}

	public void setdetalleserviciotransportesAux(List<DetalleServicioTransporte> detalleserviciotransportesAux) {
		this.detalleserviciotransportesAux = detalleserviciotransportesAux;
	}
	
	public List<DetalleServicioTransporte> getdetalleserviciotransportesEliminados() {
		return this.detalleserviciotransportesEliminados;
	}

	public void setDetalleServicioTransportesEliminados(List<DetalleServicioTransporte> detalleserviciotransportesEliminados) {
		this.detalleserviciotransportesEliminados = detalleserviciotransportesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleServicioTransporte() {
		return jComboBoxTiposSeleccionarDetalleServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleServicioTransporte(
			JComboBox jComboBoxTiposSeleccionarDetalleServicioTransporte) {
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte = jComboBoxTiposSeleccionarDetalleServicioTransporte;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleServicioTransporte() {
		return jTextFieldValorCampoGeneralDetalleServicioTransporte;
	}

	public void setjTextFieldValorCampoGeneralDetalleServicioTransporte(
			JTextField jTextFieldValorCampoGeneralDetalleServicioTransporte) {
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte = jTextFieldValorCampoGeneralDetalleServicioTransporte;
	}

	public void setBorderResaltarValorCampoGeneralDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleServicioTransporte() {
		return this.jCheckBoxSeleccionarTodosDetalleServicioTransporte;
	}

	public void setjCheckBoxSeleccionarTodosDetalleServicioTransporte(
			JCheckBox jCheckBoxSeleccionarTodosDetalleServicioTransporte) {
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte = jCheckBoxSeleccionarTodosDetalleServicioTransporte;
	}

	public void setBorderResaltarSeleccionarTodosDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleServicioTransporte() {
		return this.jCheckBoxSeleccionadosDetalleServicioTransporte;
	}

	public void setjCheckBoxSeleccionadosDetalleServicioTransporte(
			JCheckBox jCheckBoxSeleccionadosDetalleServicioTransporte) {
		this.jCheckBoxSeleccionadosDetalleServicioTransporte = jCheckBoxSeleccionadosDetalleServicioTransporte;
	}
	
	public void setBorderResaltarSeleccionadosDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleServicioTransporte() {
		return this.jComboBoxTiposArchivosReportesDetalleServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleServicioTransporte(
			JComboBox jComboBoxTiposArchivosReportesDetalleServicioTransporte) {
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte = jComboBoxTiposArchivosReportesDetalleServicioTransporte;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleServicioTransporte() {
		return this.jComboBoxTiposReportesDetalleServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleServicioTransporte(
			JComboBox jComboBoxTiposReportesDetalleServicioTransporte) {
		this.jComboBoxTiposReportesDetalleServicioTransporte = jComboBoxTiposReportesDetalleServicioTransporte;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleServicioTransporte() {
	//	return jComboBoxTiposReportesDinamicoDetalleServicioTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleServicioTransporte(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleServicioTransporte) {
	//	this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte = jComboBoxTiposReportesDinamicoDetalleServicioTransporte;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte = jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte;
	//}
	
	public void setBorderResaltarTiposReportesDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleServicioTransporte() {
		return this.jComboBoxTiposGraficosReportesDetalleServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleServicioTransporte(
			JComboBox jComboBoxTiposGraficosReportesDetalleServicioTransporte) {
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte = jComboBoxTiposGraficosReportesDetalleServicioTransporte;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleServicioTransporte() {
		return this.jComboBoxTiposPaginacionDetalleServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleServicioTransporte(
			JComboBox jComboBoxTiposPaginacionDetalleServicioTransporte) {
		this.jComboBoxTiposPaginacionDetalleServicioTransporte = jComboBoxTiposPaginacionDetalleServicioTransporte;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleServicioTransporte() {
		return this.jComboBoxTiposRelacionesDetalleServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleServicioTransporte() {
		return this.jComboBoxTiposAccionesDetalleServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleServicioTransporte(
			JComboBox jComboBoxTiposRelacionesDetalleServicioTransporte) {
		this.jComboBoxTiposRelacionesDetalleServicioTransporte = jComboBoxTiposRelacionesDetalleServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleServicioTransporte(
			JComboBox jComboBoxTiposAccionesDetalleServicioTransporte) {
		this.jComboBoxTiposAccionesDetalleServicioTransporte = jComboBoxTiposAccionesDetalleServicioTransporte;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleServicioTransporte .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleServicioTransporte() {
	//	return jCheckBoxConGraficoDinamicoDetalleServicioTransporte;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleServicioTransporte(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleServicioTransporte) {
	//	this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte = jCheckBoxConGraficoDinamicoDetalleServicioTransporte;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleServicioTransporte() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleServicioTransporte.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte .setBorder(borderResaltar);		
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
		this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		
		this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleServicioTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Servicio Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleServicioTransporte= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"nuevo","nuevo","Nuevo"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"duplicar","duplicar","Duplicar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"copiar","copiar","Copiar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"ver_form","ver_form","Ver"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"recargar","recargar","Recargar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,
							"cerrar","cerrar","Salir"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleServicioTransporte;
			
				this.jButtonProcesarInformacionToolBarDetalleServicioTransporte=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleServicioTransporte;
				
		//protected JButton jButtonModificarToolBarDetalleServicioTransporte;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleServicioTransporte=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleServicioTransporte=new JMenuMe("General");
		this.jmenuArchivoDetalleServicioTransporte=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleServicioTransporte=new JMenuMe("Acciones");
		this.jmenuDatosDetalleServicioTransporte=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleServicioTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleServicioTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleServicioTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleServicioTransporte= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleServicioTransporte.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleServicioTransporte,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleServicioTransporte= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleServicioTransporte.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleServicioTransporte,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleServicioTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleServicioTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleServicioTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleServicioTransporte= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleServicioTransporte.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleServicioTransporte,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleServicioTransporte= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleServicioTransporte.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleServicioTransporte,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleServicioTransporte= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleServicioTransporte.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleServicioTransporte,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleServicioTransporte= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleServicioTransporte.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleServicioTransporte,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleServicioTransporte= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleServicioTransporte.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleServicioTransporte,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleServicioTransporte= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleServicioTransporte.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleServicioTransporte,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleServicioTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleServicioTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleServicioTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleServicioTransporte.add(this.jMenuItemCerrarDetalleServicioTransporte);
			
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemNuevoDetalleServicioTransporte);
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte);
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemNuevoRelacionesDetalleServicioTransporte);
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte);		
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemDuplicarDetalleServicioTransporte);		
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemCopiarDetalleServicioTransporte);		
			this.jmenuAccionesDetalleServicioTransporte.add(this.jMenuItemVerFormDetalleServicioTransporte);		
			
			this.jmenuDatosDetalleServicioTransporte.add(this.jMenuItemRecargarInformacionDetalleServicioTransporte);				
			this.jmenuDatosDetalleServicioTransporte.add(this.jMenuItemAnterioresDetalleServicioTransporte);				
			this.jmenuDatosDetalleServicioTransporte.add(this.jMenuItemSiguientesDetalleServicioTransporte);				
			this.jmenuDatosDetalleServicioTransporte.add(this.jMenuItemAbrirOrderByDetalleServicioTransporte);				
			this.jmenuDatosDetalleServicioTransporte.add(this.jMenuItemMostrarOcultarDetalleServicioTransporte);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleServicioTransporte.add(this.jMenuItemGuardarCambiosDetalleServicioTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleServicioTransporte.add(this.jmenuArchivoDetalleServicioTransporte);		
			this.jmenuBarDetalleServicioTransporte.add(this.jmenuAccionesDetalleServicioTransporte);		
			this.jmenuBarDetalleServicioTransporte.add(this.jmenuDatosDetalleServicioTransporte);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleServicioTransporte);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleServicioTransporte() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleServicioTransporte.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleServicioTransporte= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleServicioTransporte.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleServicioTransporte.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleServicioTransporte,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleServicioTransporte.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleServicioTransporte= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleServicioTransporte.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleServicioTransporte.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleServicioTransporte,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleServicioTransporte.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleServicioTransporte= new JButtonMe();
		this.jButtonFK_IdProductoDetalleServicioTransporte.setText("Buscar");
		this.jButtonFK_IdProductoDetalleServicioTransporte.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleServicioTransporte,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleServicioTransporte = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleServicioTransporte.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleServicioTransporte.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.setFocusable(false);

		this.jPanelFK_IdServicioTransporteDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdServicioTransporteDetalleServicioTransporte.setToolTipText("Buscar Por Servicio Transporte ");
		this.jButtonFK_IdServicioTransporteDetalleServicioTransporte= new JButtonMe();
		this.jButtonFK_IdServicioTransporteDetalleServicioTransporte.setText("Buscar");
		this.jButtonFK_IdServicioTransporteDetalleServicioTransporte.setToolTipText("Buscar Por Servicio Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdServicioTransporteDetalleServicioTransporte,"buscar_button","Buscar Por Servicio Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdServicioTransporteDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte = new JLabelMe();
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setText("Servicio Transporte :");
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setToolTipText("Servicio Transporte");
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleServicioTransporte.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadDetalleServicioTransporte= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleServicioTransporte.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleServicioTransporte.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleServicioTransporte,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte.setText("Unad :");
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleServicioTransporte=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleServicioTransporte.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleServicioTransporte.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleServicioTransporte.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleServicioTransporte = new DetalleServicioTransporteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Servicio Transporte DATOS");
			this.jInternalFrameDetalleFormDetalleServicioTransporte = new DetalleServicioTransporteDetalleFormJInternalFrame(jDesktopPane,this.detalleserviciotransporteSessionBean.getConGuardarRelaciones(),this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleServicioTransporte = null;//new DetalleServicioTransporteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleServicioTransporte= new GridBagLayout();
		
		
		this.jTableDatosDetalleServicioTransporte = new JTableMe();      
		
		String sToolTipDetalleServicioTransporte="";
		sToolTipDetalleServicioTransporte=DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleServicioTransporte+="(Cartera.DetalleServicioTransporte)";
		}
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleServicioTransporte+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleServicioTransporte.setToolTipText(sToolTipDetalleServicioTransporte);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleServicioTransporte);
		this.jTableDatosDetalleServicioTransporte.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleServicioTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleServicioTransporte.setRowSelectionAllowed(true);
		this.jTableDatosDetalleServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleServicioTransporte = new JButtonMe();
		this.jButtonDuplicarDetalleServicioTransporte = new JButtonMe();
		this.jButtonCopiarDetalleServicioTransporte = new JButtonMe();
		this.jButtonVerFormDetalleServicioTransporte = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleServicioTransporte = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte = new JButtonMe();
		this.jButtonCerrarDetalleServicioTransporte = new JButtonMe();
		
		this.jScrollPanelDatosDetalleServicioTransporte = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleServicioTransporte = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Servicio Transporte";
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesDetalleServicioTransporte.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleServicioTransporte=new ReporteDinamicoJInternalFrame(DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleServicioTransporte();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleServicioTransporte=new ImportacionJInternalFrame(DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleServicioTransporte();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleServicioTransporte = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleServicioTransporte.setText("Orden");
		this.jButtonAbrirOrderByDetalleServicioTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleServicioTransporte,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleServicioTransporte,false,this);
			
			//this.cargarOrderByDetalleServicioTransporte(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleServicioTransporte,true,this);
			
			//this.cargarOrderByDetalleServicioTransporte(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleServicioTransporte.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDetalleServicioTransporte.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDetalleServicioTransporte.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDetalleServicioTransporte.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleServicioTransporte.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleServicioTransporte.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleServicioTransporte.setText("Nuevo");
		this.jButtonDuplicarDetalleServicioTransporte.setText("Duplicar");
		this.jButtonCopiarDetalleServicioTransporte.setText("Copiar");
		this.jButtonVerFormDetalleServicioTransporte.setText("Ver");
		this.jButtonNuevoRelacionesDetalleServicioTransporte.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setText("Guardar");
		this.jButtonCerrarDetalleServicioTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleServicioTransporte,"nuevo_button","Nuevo",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleServicioTransporte,"duplicar_button","Duplicar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleServicioTransporte,"copiar_button","Copiar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleServicioTransporte,"ver_form","Ver",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleServicioTransporte,"nuevorelaciones_button","Nuevo Rel",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleServicioTransporte,"guardarcambiostabla_button","Guardar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleServicioTransporte,"cerrar_button","Salir",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleServicioTransporte.setToolTipText("Nuevo"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleServicioTransporte.setToolTipText("Duplicar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleServicioTransporte.setToolTipText("Copiar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleServicioTransporte.setToolTipText("Ver"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleServicioTransporte.setToolTipText("Nuevo Rel"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setToolTipText("Guardar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleServicioTransporte.setToolTipText("Salir"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleServicioTransporte";
		inputMap = this.jButtonNuevoDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleServicioTransporte"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleServicioTransporte";
		inputMap = this.jButtonDuplicarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleServicioTransporte"));
		
		//COPIAR
		sMapKey = "CopiarDetalleServicioTransporte";
		inputMap = this.jButtonCopiarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleServicioTransporte"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleServicioTransporte";
		inputMap = this.jButtonVerFormDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleServicioTransporte"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleServicioTransporte";
		inputMap = this.jButtonNuevoRelacionesDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleServicioTransporte"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleServicioTransporte";
		inputMap = this.jButtonModificarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleServicioTransporte"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleServicioTransporte";
		inputMap = this.jButtonCerrarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleServicioTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleServicioTransporte";
		inputMap = this.jButtonGuardarCambiosTablaDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleServicioTransporte"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleServicioTransporte.setName("jPanelParametrosReportesDetalleServicioTransporte"); 
		
		this.jPanelParametrosReportesAccionesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleServicioTransporte.setName("jPanelParametrosReportesAccionesDetalleServicioTransporte"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleServicioTransporte = new JButtonMe();
		this.jButtonRecargarInformacionDetalleServicioTransporte.setText("Recargar");
		this.jButtonRecargarInformacionDetalleServicioTransporte.setToolTipText("Recargar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleServicioTransporte,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleServicioTransporte = new JButtonMe();
		this.jButtonProcesarInformacionDetalleServicioTransporte.setText("Procesar");
		this.jButtonProcesarInformacionDetalleServicioTransporte.setToolTipText("Procesar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleServicioTransporte.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleServicioTransporte.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleServicioTransporte.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleServicioTransporte.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleServicioTransporte.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleServicioTransporte.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleServicioTransporte.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleServicioTransporte.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleServicioTransporte.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleServicioTransporte.setText("Accion");
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleServicioTransporte = new JLabelMe();
		
		this.jLabelAccionesDetalleServicioTransporte.setText("Acciones");		
		this.jLabelAccionesDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleServicioTransporte = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleServicioTransporte.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleServicioTransporte.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleServicioTransporte = new JButtonMe();
		//this.jButtonAnterioresDetalleServicioTransporte.setText("<<");
        this.jButtonAnterioresDetalleServicioTransporte.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleServicioTransporte,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleServicioTransporte = new JButtonMe();
		//this.jButtonSiguientesDetalleServicioTransporte.setText(">>");
        this.jButtonSiguientesDetalleServicioTransporte.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleServicioTransporte,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleServicioTransporte = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleServicioTransporte,"nuevoguardarcambios_button","Nue",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleServicioTransporte";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleServicioTransporte"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleServicioTransporte";
		inputMap = this.jButtonRecargarInformacionDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleServicioTransporte"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleServicioTransporte";
		inputMap = this.jButtonSiguientesDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleServicioTransporte"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleServicioTransporte";
		inputMap = this.jButtonAnterioresDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleServicioTransporte"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleServicioTransporte();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleServicioTransporte.setMinimumSize(new Dimension(this.getWidth(),DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleServicioTransporte.setMaximumSize(new Dimension(this.getWidth(),DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleServicioTransporte.setPreferredSize(new Dimension(this.getWidth(),DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleServicioTransporte = new GridBagLayout();

			this.jPanelPaginacionDetalleServicioTransporte.setLayout(gridaBagLayoutPaginacionDetalleServicioTransporte);						
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonAnterioresDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					
						
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
			
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonNuevoGuardarCambiosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
						
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonSiguientesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonNuevoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
						
			
			
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
				this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonGuardarCambiosTablaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			}
			
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonDuplicarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonCopiarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonVerFormDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 1;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleServicioTransporte.add(this.jButtonCerrarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		
		this.jButtonRecargarInformacionDetalleServicioTransporte.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleServicioTransporte.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleServicioTransporte.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleServicioTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleServicioTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleServicioTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleServicioTransporte.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleServicioTransporte.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleServicioTransporte.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleServicioTransporte = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleServicioTransporte = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleServicioTransporte.setLayout(gridaBagParametrosReportesDetalleServicioTransporte);
			this.jPanelParametrosReportesAccionesDetalleServicioTransporte.setLayout(gridaBagParametrosReportesAccionesDetalleServicioTransporte);
			
			
			this.jPanelParametrosAuxiliar1DetalleServicioTransporte.setLayout(gridaBagParametrosAuxiliar1DetalleServicioTransporte);
			this.jPanelParametrosAuxiliar2DetalleServicioTransporte.setLayout(gridaBagParametrosAuxiliar2DetalleServicioTransporte);
			this.jPanelParametrosAuxiliar3DetalleServicioTransporte.setLayout(gridaBagParametrosAuxiliar3DetalleServicioTransporte);
			this.jPanelParametrosAuxiliar4DetalleServicioTransporte.setLayout(gridaBagParametrosAuxiliar4DetalleServicioTransporte);
			//this.jPanelParametrosAuxiliar5DetalleServicioTransporte.setLayout(gridaBagParametrosAuxiliar2DetalleServicioTransporte);			
			
			
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jButtonRecargarInformacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleServicioTransporte.add(this.jComboBoxTiposPaginacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleServicioTransporte.add(this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleServicioTransporte.add(this.jComboBoxTiposArchivosReportesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jPanelParametrosAuxiliar1DetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleServicioTransporte.add(this.jComboBoxTiposReportesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);																		
			
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleServicioTransporte.add(this.jComboBoxTiposGraficosReportesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jPanelParametrosAuxiliar4DetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jComboBoxTiposReportesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jCheckBoxGenerarReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jPanelParametrosAuxiliar2DetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jLabelAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jButtonAbrirOrderByDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jComboBoxTiposSeleccionarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			
			
			/*
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jCheckBoxSeleccionarTodosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jCheckBoxConGraficoReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleServicioTransporte.add(this.jCheckBoxSeleccionarTodosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);															
				
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleServicioTransporte.add(this.jCheckBoxSeleccionadosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);															
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleServicioTransporte.add(this.jCheckBoxConGraficoReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jPanelParametrosAuxiliar3DetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jComboBoxTiposAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
	
				
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleServicioTransporte.add(this.jTextFieldValorCampoGeneralDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleServicioTransporte = new GridBagLayout();

			this.jScrollPanelDatosDetalleServicioTransporte.setLayout(gridaBagLayoutDatosDetalleServicioTransporte);
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
			
			this.jScrollPanelDatosDetalleServicioTransporte.add(this.jTableDatosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleServicioTransporte.setViewportView(this.jTableDatosDetalleServicioTransporte);
		this.jTableDatosDetalleServicioTransporte.setFillsViewportHeight(true);
		this.jTableDatosDetalleServicioTransporte.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleServicioTransporte= new GridBagLayout();
		this.jPanelAccionesDetalleServicioTransporte.setLayout(gridaBagLayoutAccionesDetalleServicioTransporte);
		
		
		/*	
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
			
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonNuevoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleServicioTransporte.setLayout(gridaBagLayoutFK_IdBodegaDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdBodegaDetalleServicioTransporte.add(jLabelid_bodegaFK_IdBodegaDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 1;
		jPanelFK_IdBodegaDetalleServicioTransporte.add(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 1;
		gridBagConstraintsDetalleServicioTransporte.gridx =1;
		jPanelFK_IdBodegaDetalleServicioTransporte.add(jButtonFK_IdBodegaDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		jTabbedPaneBusquedasDetalleServicioTransporte.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleServicioTransporte);
		jTabbedPaneBusquedasDetalleServicioTransporte.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleServicioTransporte.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdCentroCostoDetalleServicioTransporte.add(jLabelid_centro_costoFK_IdCentroCostoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 1;
		jPanelFK_IdCentroCostoDetalleServicioTransporte.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 1;
		gridBagConstraintsDetalleServicioTransporte.gridx =1;
		jPanelFK_IdCentroCostoDetalleServicioTransporte.add(jButtonFK_IdCentroCostoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		jTabbedPaneBusquedasDetalleServicioTransporte.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleServicioTransporte);
		jTabbedPaneBusquedasDetalleServicioTransporte.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleServicioTransporte.setLayout(gridaBagLayoutFK_IdProductoDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdProductoDetalleServicioTransporte.add(jLabelid_productoFK_IdProductoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 1;
		jPanelFK_IdProductoDetalleServicioTransporte.add(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);


		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdProductoDetalleServicioTransporte.add(this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 1;
		gridBagConstraintsDetalleServicioTransporte.gridx =1;
		jPanelFK_IdProductoDetalleServicioTransporte.add(jButtonFK_IdProductoDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		jTabbedPaneBusquedasDetalleServicioTransporte.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleServicioTransporte);
		jTabbedPaneBusquedasDetalleServicioTransporte.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdServicioTransporteDetalleServicioTransporte.setLayout(gridaBagLayoutFK_IdServicioTransporteDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdServicioTransporteDetalleServicioTransporte.add(jLabelid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 1;
		jPanelFK_IdServicioTransporteDetalleServicioTransporte.add(jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 1;
		gridBagConstraintsDetalleServicioTransporte.gridx =1;
		jPanelFK_IdServicioTransporteDetalleServicioTransporte.add(jButtonFK_IdServicioTransporteDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		jTabbedPaneBusquedasDetalleServicioTransporte.addTab("4.-Por Servicio Transporte ", jPanelFK_IdServicioTransporteDetalleServicioTransporte);
		jTabbedPaneBusquedasDetalleServicioTransporte.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleServicioTransporte.setLayout(gridaBagLayoutFK_IdUnidadDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		jPanelFK_IdUnidadDetalleServicioTransporte.add(jLabelid_unidadFK_IdUnidadDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		gridBagConstraintsDetalleServicioTransporte.gridx = 1;
		jPanelFK_IdUnidadDetalleServicioTransporte.add(jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleServicioTransporte.gridy = 1;
		gridBagConstraintsDetalleServicioTransporte.gridx =1;
		jPanelFK_IdUnidadDetalleServicioTransporte.add(jButtonFK_IdUnidadDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);

		jTabbedPaneBusquedasDetalleServicioTransporte.addTab("5.-Por Unad ", jPanelFK_IdUnidadDetalleServicioTransporte);
		jTabbedPaneBusquedasDetalleServicioTransporte.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleServicioTransporte);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();						
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;		
			//this.gridBagConstraintsDetalleServicioTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleServicioTransporte.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;		
		//this.gridBagConstraintsDetalleServicioTransporte.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleServicioTransporte);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;		
			this.gridBagConstraintsDetalleServicioTransporte.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleServicioTransporte.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);								
		
		
		/*
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		*/		
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleServicioTransporte.gridx =0;
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleServicioTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
				
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleServicioTransporte = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleServicioTransporte.setLayout(gridaBagLayoutBusquedasParametrosDetalleServicioTransporte);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleServicioTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleServicioTransporte;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleServicioTransporte() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleServicioTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleServicioTransporte.setName("jPanelReporteDinamicoDetalleServicioTransporte"); 
		
		this.jPanelReporteDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleServicioTransporte.setLayout(gridaBagLayoutReporteDinamicoDetalleServicioTransporte);
		
		
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleServicioTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleServicioTransporte = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleServicioTransporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelColumnasSelectReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleServicioTransporte = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleServicioTransporte=new JScrollPane(this.jListColumnasSelectReporteDetalleServicioTransporte);
			
			this.jScrollColumnasSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jListColumnasSelectReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jScrollColumnasSelectReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleServicioTransporte = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleServicioTransporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleServicioTransporte = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleServicioTransporte=new JScrollPane(this.jListRelacionesSelectReporteDetalleServicioTransporte);
			
			this.jScrollRelacionesSelectReporteDetalleServicioTransporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleServicioTransporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleServicioTransporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleServicioTransporte = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleServicioTransporte = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleServicioTransporte.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelConGraficoDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jCheckBoxConGraficoDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelColumnaCategoriaGraficoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleServicioTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleServicioTransporte.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelColumnaCategoriaValorDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jComboBoxColumnaCategoriaValorDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleServicioTransporte = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleServicioTransporte.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelColumnasValoresGraficoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleServicioTransporte = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleServicioTransporte.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleServicioTransporte=new JScrollPane(this.jListColumnasValoresGraficoDetalleServicioTransporte);
			
			this.jScrollColumnasValoresGraficoDetalleServicioTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleServicioTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleServicioTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jListColumnasSelectReporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jScrollColumnasValoresGraficoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelTiposGraficosReportesDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleServicioTransporte.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelGenerarExcelReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte.setToolTipText("Generar EXCEL"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jComboBoxTiposReportesDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jLabelTiposArchivoReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleServicioTransporte = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleServicioTransporte.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleServicioTransporte,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleServicioTransporte.setToolTipText("Generar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jButtonGenerarReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleServicioTransporte = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleServicioTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleServicioTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleServicioTransporte.setToolTipText("Cancelar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleServicioTransporte.add(this.jButtonCerrarReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleServicioTransporte = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte= new JScrollPane(jPanelReporteDinamicoDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleServicioTransporte);
		this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleServicioTransporte() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleServicioTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleServicioTransporte.setName("jPanelImportacionDetalleServicioTransporte"); 
		
		this.jPanelImportacionDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleServicioTransporte.setLayout(gridaBagLayoutImportacionDetalleServicioTransporte);
		
		
		this.jInternalFrameImportacionDetalleServicioTransporte= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleServicioTransporte= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleServicioTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleServicioTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleServicioTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleServicioTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleServicioTransporte.setResizable(true);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setClosable(true);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleServicioTransporte.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleServicioTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleServicioTransporte.setResizable(true);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setClosable(true);
	    this.jInternalFrameImportacionDetalleServicioTransporte.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleServicioTransporte = new JLabelMe();

		this.jLabelArchivoImportacionDetalleServicioTransporte.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleServicioTransporte.add(this.jLabelArchivoImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleServicioTransporte = new JFileChooser();		
		this.jFileChooserImportacionDetalleServicioTransporte.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleServicioTransporte = new JButtonMe();
		this.jButtonAbrirImportacionDetalleServicioTransporte.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleServicioTransporte,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleServicioTransporte.setToolTipText("Generar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleServicioTransporte.add(this.jButtonAbrirImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleServicioTransporte = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleServicioTransporte.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleServicioTransporte.add(this.jLabelPathArchivoImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleServicioTransporte=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleServicioTransporte.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleServicioTransporte.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleServicioTransporte.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleServicioTransporte.add(this.jTextFieldPathArchivoImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleServicioTransporte = new JButtonMe();
		this.jButtonGenerarImportacionDetalleServicioTransporte.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleServicioTransporte,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleServicioTransporte.setToolTipText("Generar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleServicioTransporte.add(this.jButtonGenerarImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleServicioTransporte = new JButtonMe();
		this.jButtonCerrarImportacionDetalleServicioTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleServicioTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleServicioTransporte.setToolTipText("Cancelar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleServicioTransporte.add(this.jButtonCerrarImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleServicioTransporte = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleServicioTransporte= new JScrollPane(jPanelImportacionDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleServicioTransporte.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleServicioTransporte);
		this.jInternalFrameImportacionDetalleServicioTransporte.getContentPane().add(this.jScrollPanelImportacionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleServicioTransporte(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleServicioTransporte = new JButtonMe();
			this.jButtonAbrirOrderByDetalleServicioTransporte.setText("Orden");
			this.jButtonAbrirOrderByDetalleServicioTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleServicioTransporte,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleServicioTransporte";
			inputMap = this.jButtonAbrirOrderByDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleServicioTransporte"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleServicioTransporte = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleServicioTransporte.setName("jPanelOrderByDetalleServicioTransporte"); 
			
			this.jPanelOrderByDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleServicioTransporte.setLayout(gridaBagLayoutOrderByDetalleServicioTransporte);
			
			
			this.jTableDatosDetalleServicioTransporteOrderBy = new JTableMe();        
			this.jTableDatosDetalleServicioTransporteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleServicioTransporteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleServicioTransporteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleServicioTransporteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleServicioTransporteOrderBy.setViewportView(this.jTableDatosDetalleServicioTransporteOrderBy);
			this.jTableDatosDetalleServicioTransporteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleServicioTransporteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleServicioTransporte= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleServicioTransporte= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleServicioTransporte = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleServicioTransporte= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleServicioTransporte.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleServicioTransporte.setTitle("Orden");
			this.jInternalFrameOrderByDetalleServicioTransporte.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleServicioTransporte.setResizable(true);
			this.jInternalFrameOrderByDetalleServicioTransporte.setClosable(true);
			this.jInternalFrameOrderByDetalleServicioTransporte.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleServicioTransporte.ipady =150;
				
			this.jPanelOrderByDetalleServicioTransporte.add(jScrollPanelDatosDetalleServicioTransporteOrderBy, this.gridBagConstraintsDetalleServicioTransporte);//this.jTableDatosDetalleServicioTransporteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleServicioTransporte = new JButtonMe();
			this.jButtonCerrarOrderByDetalleServicioTransporte.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleServicioTransporte,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleServicioTransporte.setToolTipText("Cancelar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleServicioTransporte.add(this.jButtonCerrarOrderByDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleServicioTransporte = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleServicioTransporte= new JScrollPane(jPanelOrderByDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleServicioTransporte.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleServicioTransporte);
			
			this.jInternalFrameOrderByDetalleServicioTransporte.getContentPane().add(this.jScrollPanelOrderByDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
		
		} else {
			this.jButtonAbrirOrderByDetalleServicioTransporte = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleServicioTransporte.getRowHeight();//DetalleServicioTransporteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.isSelected()) {
					iHeightTable=DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleServicioTransporte.isSelected()) {
					iHeightTable=DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleServicioTransporte!=null && this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleServicioTransporte.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleServicioTransporte.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleServicioTransporte.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleserviciotransporteLogic.getDetalleServicioTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserviciotransportes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleServicioTransporte> TraerDetalleServicioTransporteBeans(List<DetalleServicioTransporte> detalleserviciotransportes,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportes) {
					
				if(!(DetalleServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleserviciotransporte.setsDetalleGeneralEntityReporte(DetalleServicioTransporteConstantesFunciones.getDetalleServicioTransporteDescripcion(detalleserviciotransporte));
										
						
					
						
					
				} else  {
							
					//detalleserviciotransporte.setsDetalleGeneralEntityReporte(detalleserviciotransporte.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleserviciotransportebeans.add(detalleserviciotransportebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleserviciotransportes;
    }
	//PARA REPORTES FIN
}
