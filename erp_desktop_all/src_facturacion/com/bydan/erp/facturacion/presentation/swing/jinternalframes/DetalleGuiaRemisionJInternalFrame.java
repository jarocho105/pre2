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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetalleGuiaRemisionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetalleGuiaRemisionJInternalFrame extends DetalleGuiaRemisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleGuiaRemision;
	
	protected JMenuBar jmenuBarDetalleGuiaRemision;
	
	protected JMenu jmenuDetalleGuiaRemision;
	protected JMenu jmenuDatosDetalleGuiaRemision;
	protected JMenu jmenuArchivoDetalleGuiaRemision;
	protected JMenu jmenuAccionesDetalleGuiaRemision;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleGuiaRemision;	
	protected GridBagConstraints gridBagConstraintsDetalleGuiaRemision;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleGuiaRemision;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleGuiaRemision;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleGuiaRemision;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_guiaremision="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleGuiaRemisionSessionBean detalleguiaremisionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public GuiaRemisionSessionBean guiaremisionSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleGuiaRemision> detalleguiaremisions;		
	public List<DetalleGuiaRemision> detalleguiaremisionsEliminados;	
	public List<DetalleGuiaRemision> detalleguiaremisionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleGuiaRemision;		
	protected JButton jButtonAbrirOrderByDetalleGuiaRemision;
	
	
	//protected JPanel jPanelOrderByDetalleGuiaRemision;
	//public JScrollPane jScrollPanelOrderByDetalleGuiaRemision;	
	//protected JButton jButtonCerrarOrderByDetalleGuiaRemision;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleGuiaRemisionLogic detalleguiaremisionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleGuiaRemision;
	public JScrollPane jScrollPanelDatosEdicionDetalleGuiaRemision;
	public JScrollPane jScrollPanelDatosGeneralDetalleGuiaRemision;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleGuiaRemisionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleGuiaRemision;
	//public JScrollPane jScrollPanelImportacionDetalleGuiaRemision;
	
	
	
	protected JPanel jPanelAccionesDetalleGuiaRemision;
	
    protected JPanel jPanelPaginacionDetalleGuiaRemision;
    protected JPanel jPanelParametrosReportesDetalleGuiaRemision;
	protected JPanel jPanelParametrosReportesAccionesDetalleGuiaRemision;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleGuiaRemision;
	protected Integer iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
	protected Integer iYPanelCamposIniciogeneralDetalleGuiaRemision=0;

	protected JPanel jPanelCamposIniciovaloresDetalleGuiaRemision;
	protected Integer iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
	protected Integer iYPanelCamposIniciovaloresDetalleGuiaRemision=0;

	protected JPanel jPanelCamposInicioextraDetalleGuiaRemision;
	protected Integer iXPanelCamposInicioextraDetalleGuiaRemision=0;
	protected Integer iYPanelCamposInicioextraDetalleGuiaRemision=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleGuiaRemision;
	protected JPanel jPanelParametrosAuxiliar2DetalleGuiaRemision;
	protected JPanel jPanelParametrosAuxiliar3DetalleGuiaRemision;
	protected JPanel jPanelParametrosAuxiliar4DetalleGuiaRemision;
	//protected JPanel jPanelParametrosAuxiliar5DetalleGuiaRemision;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleGuiaRemision;
	//protected JPanel jPanelImportacionDetalleGuiaRemision;
	
	
	public JTable jTableDatosDetalleGuiaRemision;
	
	
	
	//public JTable jTableDatosDetalleGuiaRemisionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleGuiaRemision;
	protected JButton jButtonDuplicarDetalleGuiaRemision;
	protected JButton jButtonCopiarDetalleGuiaRemision;
	protected JButton jButtonVerFormDetalleGuiaRemision;
	protected JButton jButtonNuevoRelacionesDetalleGuiaRemision;
	protected JButton jButtonModificarDetalleGuiaRemision;
	
    protected JButton jButtonGuardarCambiosTablaDetalleGuiaRemision;
	protected JButton jButtonCerrarDetalleGuiaRemision;
	
	
	protected JButton jButtonRecargarInformacionDetalleGuiaRemision;
	protected JButton jButtonProcesarInformacionDetalleGuiaRemision;
	
	
	protected JButton jButtonAnterioresDetalleGuiaRemision;
	protected JButton jButtonSiguientesDetalleGuiaRemision;
	protected JButton jButtonNuevoGuardarCambiosDetalleGuiaRemision;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleGuiaRemision;
	//protected JButton jButtonCerrarReporteDinamicoDetalleGuiaRemision;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleGuiaRemision;
	//protected JButton jButtonGenerarImportacionDetalleGuiaRemision;
	//protected JButton jButtonCerrarImportacionDetalleGuiaRemision;
	//protected JFileChooser jFileChooserImportacionDetalleGuiaRemision;
	//protected File fileImportacionDetalleGuiaRemision;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleGuiaRemision;
	protected JButton jButtonDuplicarToolBarDetalleGuiaRemision;
	protected JButton jButtonNuevoRelacionesToolBarDetalleGuiaRemision;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleGuiaRemision;
	protected JButton jButtonCopiarToolBarDetalleGuiaRemision;
	protected JButton jButtonVerFormToolBarDetalleGuiaRemision;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleGuiaRemision;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleGuiaRemision;
	protected JButton jButtonCerrarToolBarDetalleGuiaRemision;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleGuiaRemision;
	protected JButton jButtonProcesarInformacionToolBarDetalleGuiaRemision;
	protected JButton jButtonAnterioresToolBarDetalleGuiaRemision;
	protected JButton jButtonSiguientesToolBarDetalleGuiaRemision;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleGuiaRemision;
	protected JButton jButtonAbrirOrderByToolBarDetalleGuiaRemision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleGuiaRemision;
	protected JMenuItem jMenuItemDuplicarDetalleGuiaRemision;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleGuiaRemision;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleGuiaRemision;
	protected JMenuItem jMenuItemCopiarDetalleGuiaRemision;
	protected JMenuItem jMenuItemVerFormDetalleGuiaRemision;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleGuiaRemision;
	protected JMenuItem jMenuItemCerrarDetalleGuiaRemision;
	protected JMenuItem jMenuItemDetalleCerrarDetalleGuiaRemision;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleGuiaRemision;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleGuiaRemision;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleGuiaRemision;
	protected JMenuItem jMenuItemProcesarInformacionDetalleGuiaRemision;
	protected JMenuItem jMenuItemAnterioresDetalleGuiaRemision;
	protected JMenuItem jMenuItemSiguientesDetalleGuiaRemision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleGuiaRemision;
	protected JMenuItem jMenuItemAbrirOrderByDetalleGuiaRemision;
	protected JMenuItem jMenuItemMostrarOcultarDetalleGuiaRemision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleGuiaRemision;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleGuiaRemision;
	protected JCheckBox jCheckBoxSeleccionadosDetalleGuiaRemision;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleGuiaRemision;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleGuiaRemision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleGuiaRemision;
	protected JTextField jTextFieldValorCampoGeneralDetalleGuiaRemision;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleGuiaRemision;
	//public JList<Reporte> jListColumnasSelectReporteDetalleGuiaRemision;
	//public JScrollPane jScrollColumnasSelectReporteDetalleGuiaRemision;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleGuiaRemision;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleGuiaRemision;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleGuiaRemision;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleGuiaRemision;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleGuiaRemision;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision;
	
		
	//public JLabel jLabelArchivoImportacionDetalleGuiaRemision;	
	//public JLabel jLabelPathArchivoImportacionDetalleGuiaRemision;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleGuiaRemision;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleGuiaRemision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleGuiaRemision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleGuiaRemision;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleGuiaRemision;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleGuiaRemision;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleGuiaRemision;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleGuiaRemision;
	public JPanel jPanelFK_IdBodegaDetalleGuiaRemision;
	public JButton jButtonFK_IdBodegaDetalleGuiaRemision;
	public JPanel jPanelFK_IdCentroCostoDetalleGuiaRemision;
	public JButton jButtonFK_IdCentroCostoDetalleGuiaRemision;
	public JPanel jPanelFK_IdGuiaRemisionDetalleGuiaRemision;
	public JButton jButtonFK_IdGuiaRemisionDetalleGuiaRemision;
	public JPanel jPanelFK_IdProductoDetalleGuiaRemision;
	public JButton jButtonFK_IdProductoDetalleGuiaRemision;
	public JPanel jPanelFK_IdUnidadDetalleGuiaRemision;
	public JButton jButtonFK_IdUnidadDetalleGuiaRemision;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleGuiaRemision;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleGuiaRemisionBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleGuiaRemisionArbol= new JButtonMe();

	
	public JPanel jPanelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision;
	public JLabel jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision;
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleGuiaRemision;
	public JLabel jLabelid_productoFK_IdProductoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleGuiaRemision;
	public JButton jButtonid_productoFK_IdProductoDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleGuiaRemision;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision;
	public JButton jButtonid_unidadFK_IdUnidadDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleGuiaRemisionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=2090;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleGuiaRemisionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleGuiaRemision)	{
		this.jButtonRecargarInformacionDetalleGuiaRemision = jButtonRecargarInformacionDetalleGuiaRemision;
	}
	
	public JButton getjButtonProcesarInformacionDetalleGuiaRemision() {
		return this.jButtonProcesarInformacionDetalleGuiaRemision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleGuiaRemision)	{
		this.jButtonProcesarInformacionDetalleGuiaRemision = jButtonProcesarInformacionDetalleGuiaRemision;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleGuiaRemision() {
		return this.jButtonRecargarInformacionDetalleGuiaRemision;
	}
	
	
	public List<DetalleGuiaRemision> getdetalleguiaremisions() {
		return this.detalleguiaremisions;
	}

	public void setdetalleguiaremisions(List<DetalleGuiaRemision> detalleguiaremisions) {
		this.detalleguiaremisions = detalleguiaremisions;
	}
	
	public List<DetalleGuiaRemision> getdetalleguiaremisionsAux() {
		return this.detalleguiaremisionsAux;
	}

	public void setdetalleguiaremisionsAux(List<DetalleGuiaRemision> detalleguiaremisionsAux) {
		this.detalleguiaremisionsAux = detalleguiaremisionsAux;
	}
	
	public List<DetalleGuiaRemision> getdetalleguiaremisionsEliminados() {
		return this.detalleguiaremisionsEliminados;
	}

	public void setDetalleGuiaRemisionsEliminados(List<DetalleGuiaRemision> detalleguiaremisionsEliminados) {
		this.detalleguiaremisionsEliminados = detalleguiaremisionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleGuiaRemision() {
		return jComboBoxTiposSeleccionarDetalleGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleGuiaRemision(
			JComboBox jComboBoxTiposSeleccionarDetalleGuiaRemision) {
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision = jComboBoxTiposSeleccionarDetalleGuiaRemision;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleGuiaRemision() {
		return jTextFieldValorCampoGeneralDetalleGuiaRemision;
	}

	public void setjTextFieldValorCampoGeneralDetalleGuiaRemision(
			JTextField jTextFieldValorCampoGeneralDetalleGuiaRemision) {
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision = jTextFieldValorCampoGeneralDetalleGuiaRemision;
	}

	public void setBorderResaltarValorCampoGeneralDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleGuiaRemision() {
		return this.jCheckBoxSeleccionarTodosDetalleGuiaRemision;
	}

	public void setjCheckBoxSeleccionarTodosDetalleGuiaRemision(
			JCheckBox jCheckBoxSeleccionarTodosDetalleGuiaRemision) {
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision = jCheckBoxSeleccionarTodosDetalleGuiaRemision;
	}

	public void setBorderResaltarSeleccionarTodosDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleGuiaRemision() {
		return this.jCheckBoxSeleccionadosDetalleGuiaRemision;
	}

	public void setjCheckBoxSeleccionadosDetalleGuiaRemision(
			JCheckBox jCheckBoxSeleccionadosDetalleGuiaRemision) {
		this.jCheckBoxSeleccionadosDetalleGuiaRemision = jCheckBoxSeleccionadosDetalleGuiaRemision;
	}
	
	public void setBorderResaltarSeleccionadosDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleGuiaRemision() {
		return this.jComboBoxTiposArchivosReportesDetalleGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleGuiaRemision(
			JComboBox jComboBoxTiposArchivosReportesDetalleGuiaRemision) {
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision = jComboBoxTiposArchivosReportesDetalleGuiaRemision;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleGuiaRemision() {
		return this.jComboBoxTiposReportesDetalleGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleGuiaRemision(
			JComboBox jComboBoxTiposReportesDetalleGuiaRemision) {
		this.jComboBoxTiposReportesDetalleGuiaRemision = jComboBoxTiposReportesDetalleGuiaRemision;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleGuiaRemision() {
	//	return jComboBoxTiposReportesDinamicoDetalleGuiaRemision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleGuiaRemision(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleGuiaRemision) {
	//	this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision = jComboBoxTiposReportesDinamicoDetalleGuiaRemision;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision = jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision;
	//}
	
	public void setBorderResaltarTiposReportesDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleGuiaRemision() {
		return this.jComboBoxTiposGraficosReportesDetalleGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleGuiaRemision(
			JComboBox jComboBoxTiposGraficosReportesDetalleGuiaRemision) {
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision = jComboBoxTiposGraficosReportesDetalleGuiaRemision;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleGuiaRemision() {
		return this.jComboBoxTiposPaginacionDetalleGuiaRemision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleGuiaRemision(
			JComboBox jComboBoxTiposPaginacionDetalleGuiaRemision) {
		this.jComboBoxTiposPaginacionDetalleGuiaRemision = jComboBoxTiposPaginacionDetalleGuiaRemision;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleGuiaRemision() {
		return this.jComboBoxTiposRelacionesDetalleGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleGuiaRemision() {
		return this.jComboBoxTiposAccionesDetalleGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleGuiaRemision(
			JComboBox jComboBoxTiposRelacionesDetalleGuiaRemision) {
		this.jComboBoxTiposRelacionesDetalleGuiaRemision = jComboBoxTiposRelacionesDetalleGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleGuiaRemision(
			JComboBox jComboBoxTiposAccionesDetalleGuiaRemision) {
		this.jComboBoxTiposAccionesDetalleGuiaRemision = jComboBoxTiposAccionesDetalleGuiaRemision;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleGuiaRemision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleGuiaRemision .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleGuiaRemision() {
	//	return jCheckBoxConGraficoDinamicoDetalleGuiaRemision;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleGuiaRemision(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleGuiaRemision) {
	//	this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision = jCheckBoxConGraficoDinamicoDetalleGuiaRemision;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleGuiaRemision() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleGuiaRemision.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision .setBorder(borderResaltar);		
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
		this.detalleguiaremisionSessionBean=new DetalleGuiaRemisionSessionBean();
		
		this.detalleguiaremisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleguiaremisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleguiaremisionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleGuiaRemisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Guia Remision MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleGuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGuiaRemision= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"nuevo","nuevo","Nuevo"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"duplicar","duplicar","Duplicar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"copiar","copiar","Copiar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"ver_form","ver_form","Ver"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"recargar","recargar","Recargar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"cerrar","cerrar","Salir"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleGuiaRemision=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleGuiaRemision;
			
				this.jButtonProcesarInformacionToolBarDetalleGuiaRemision=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleGuiaRemision;
				
		//protected JButton jButtonModificarToolBarDetalleGuiaRemision;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleGuiaRemision=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleGuiaRemision=new JMenuMe("General");
		this.jmenuArchivoDetalleGuiaRemision=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleGuiaRemision=new JMenuMe("Acciones");
		this.jmenuDatosDetalleGuiaRemision=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleGuiaRemision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleGuiaRemision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleGuiaRemision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleGuiaRemision= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleGuiaRemision.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleGuiaRemision,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleGuiaRemision= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleGuiaRemision.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleGuiaRemision,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleGuiaRemision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleGuiaRemision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleGuiaRemision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleGuiaRemision= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleGuiaRemision.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleGuiaRemision,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleGuiaRemision= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleGuiaRemision.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleGuiaRemision,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleGuiaRemision= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleGuiaRemision.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleGuiaRemision,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleGuiaRemision= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleGuiaRemision.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleGuiaRemision,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleGuiaRemision= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleGuiaRemision.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleGuiaRemision,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleGuiaRemision= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleGuiaRemision.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleGuiaRemision,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleGuiaRemision= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleGuiaRemision.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleGuiaRemision,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleGuiaRemision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleGuiaRemision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleGuiaRemision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleGuiaRemision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleGuiaRemision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleGuiaRemision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleGuiaRemision= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleGuiaRemision.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleGuiaRemision,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleGuiaRemision.add(this.jMenuItemCerrarDetalleGuiaRemision);
			
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemNuevoDetalleGuiaRemision);
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemNuevoGuardarCambiosDetalleGuiaRemision);
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemNuevoRelacionesDetalleGuiaRemision);
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemGuardarCambiosTablaDetalleGuiaRemision);		
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemDuplicarDetalleGuiaRemision);		
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemCopiarDetalleGuiaRemision);		
			this.jmenuAccionesDetalleGuiaRemision.add(this.jMenuItemVerFormDetalleGuiaRemision);		
			
			this.jmenuDatosDetalleGuiaRemision.add(this.jMenuItemRecargarInformacionDetalleGuiaRemision);				
			this.jmenuDatosDetalleGuiaRemision.add(this.jMenuItemAnterioresDetalleGuiaRemision);				
			this.jmenuDatosDetalleGuiaRemision.add(this.jMenuItemSiguientesDetalleGuiaRemision);				
			this.jmenuDatosDetalleGuiaRemision.add(this.jMenuItemAbrirOrderByDetalleGuiaRemision);				
			this.jmenuDatosDetalleGuiaRemision.add(this.jMenuItemMostrarOcultarDetalleGuiaRemision);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleGuiaRemision.add(this.jMenuItemGuardarCambiosDetalleGuiaRemision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGuiaRemision.add(this.jmenuArchivoDetalleGuiaRemision);		
			this.jmenuBarDetalleGuiaRemision.add(this.jmenuAccionesDetalleGuiaRemision);		
			this.jmenuBarDetalleGuiaRemision.add(this.jmenuDatosDetalleGuiaRemision);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleGuiaRemision);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleGuiaRemision() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleGuiaRemision.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleGuiaRemision= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleGuiaRemision.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleGuiaRemision.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleGuiaRemision,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleGuiaRemision.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleGuiaRemision= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleGuiaRemision.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleGuiaRemision.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleGuiaRemision,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGuiaRemisionDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGuiaRemisionDetalleGuiaRemision.setToolTipText("Buscar Por Guia Remision ");
		this.jButtonFK_IdGuiaRemisionDetalleGuiaRemision= new JButtonMe();
		this.jButtonFK_IdGuiaRemisionDetalleGuiaRemision.setText("Buscar");
		this.jButtonFK_IdGuiaRemisionDetalleGuiaRemision.setToolTipText("Buscar Por Guia Remision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGuiaRemisionDetalleGuiaRemision,"buscar_button","Buscar Por Guia Remision ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGuiaRemisionDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision = new JLabelMe();
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setText("Guia Remision :");
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setToolTipText("Guia Remision");
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleGuiaRemision.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleGuiaRemision= new JButtonMe();
		this.jButtonFK_IdProductoDetalleGuiaRemision.setText("Buscar");
		this.jButtonFK_IdProductoDetalleGuiaRemision.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleGuiaRemision,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleGuiaRemision = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleGuiaRemision.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleGuiaRemision.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleGuiaRemision.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleGuiaRemision= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleGuiaRemision.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleGuiaRemision.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleGuiaRemision,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleGuiaRemision=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleGuiaRemision.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleGuiaRemision.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleGuiaRemision.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleGuiaRemision = new DetalleGuiaRemisionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Guia Remision DATOS");
			this.jInternalFrameDetalleFormDetalleGuiaRemision = new DetalleGuiaRemisionDetalleFormJInternalFrame(jDesktopPane,this.detalleguiaremisionSessionBean.getConGuardarRelaciones(),this.detalleguiaremisionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleGuiaRemision = null;//new DetalleGuiaRemisionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleGuiaRemision= new GridBagLayout();
		
		
		this.jTableDatosDetalleGuiaRemision = new JTableMe();      
		
		String sToolTipDetalleGuiaRemision="";
		sToolTipDetalleGuiaRemision=DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleGuiaRemision+="(Facturacion.DetalleGuiaRemision)";
		}
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleGuiaRemision+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleGuiaRemision.setToolTipText(sToolTipDetalleGuiaRemision);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleGuiaRemision);
		this.jTableDatosDetalleGuiaRemision.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleGuiaRemision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleGuiaRemision.setRowSelectionAllowed(true);
		this.jTableDatosDetalleGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleGuiaRemision = new JButtonMe();
		this.jButtonDuplicarDetalleGuiaRemision = new JButtonMe();
		this.jButtonCopiarDetalleGuiaRemision = new JButtonMe();
		this.jButtonVerFormDetalleGuiaRemision = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleGuiaRemision = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision = new JButtonMe();
		this.jButtonCerrarDetalleGuiaRemision = new JButtonMe();
		
		this.jScrollPanelDatosDetalleGuiaRemision = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleGuiaRemision = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioextraDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Guia Remision";
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesDetalleGuiaRemision.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setName("jPanelCamposFingeneralDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setName("jPanelCamposFinvaloresDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioextraDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra"));
		this.jPanelCamposInicioextraDetalleGuiaRemision.setName("jPanelCamposFinextraDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioextraDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleGuiaRemision=new ReporteDinamicoJInternalFrame(DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleGuiaRemision();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleGuiaRemision=new ImportacionJInternalFrame(DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleGuiaRemision();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleGuiaRemision = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleGuiaRemision.setText("Orden");
		this.jButtonAbrirOrderByDetalleGuiaRemision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleGuiaRemision,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleGuiaRemision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGuiaRemision,false,this);
			
			//this.cargarOrderByDetalleGuiaRemision(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleGuiaRemision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGuiaRemision,true,this);
			
			//this.cargarOrderByDetalleGuiaRemision(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleGuiaRemision.setMinimumSize(new Dimension(400,50));//3030
		this.jTableDatosDetalleGuiaRemision.setMaximumSize(new Dimension(400,50));//3030
		this.jTableDatosDetalleGuiaRemision.setPreferredSize(new Dimension(400,50));//3030
		
		this.jScrollPanelDatosDetalleGuiaRemision.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleGuiaRemision.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleGuiaRemision.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleGuiaRemision.setText("Nuevo");
		this.jButtonDuplicarDetalleGuiaRemision.setText("Duplicar");
		this.jButtonCopiarDetalleGuiaRemision.setText("Copiar");
		this.jButtonVerFormDetalleGuiaRemision.setText("Ver");
		this.jButtonNuevoRelacionesDetalleGuiaRemision.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.setText("Guardar");
		this.jButtonCerrarDetalleGuiaRemision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleGuiaRemision,"nuevo_button","Nuevo",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleGuiaRemision,"duplicar_button","Duplicar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleGuiaRemision,"copiar_button","Copiar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleGuiaRemision,"ver_form","Ver",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleGuiaRemision,"nuevorelaciones_button","Nuevo Rel",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleGuiaRemision,"guardarcambiostabla_button","Guardar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleGuiaRemision,"cerrar_button","Salir",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleGuiaRemision.setToolTipText("Nuevo"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleGuiaRemision.setToolTipText("Duplicar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleGuiaRemision.setToolTipText("Copiar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleGuiaRemision.setToolTipText("Ver"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleGuiaRemision.setToolTipText("Nuevo Rel"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.setToolTipText("Guardar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleGuiaRemision.setToolTipText("Salir"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleGuiaRemision";
		inputMap = this.jButtonNuevoDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleGuiaRemision"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleGuiaRemision";
		inputMap = this.jButtonDuplicarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleGuiaRemision"));
		
		//COPIAR
		sMapKey = "CopiarDetalleGuiaRemision";
		inputMap = this.jButtonCopiarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleGuiaRemision"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleGuiaRemision";
		inputMap = this.jButtonVerFormDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleGuiaRemision"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleGuiaRemision";
		inputMap = this.jButtonNuevoRelacionesDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleGuiaRemision"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleGuiaRemision";
		inputMap = this.jButtonModificarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleGuiaRemision"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleGuiaRemision";
		inputMap = this.jButtonCerrarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleGuiaRemision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleGuiaRemision";
		inputMap = this.jButtonGuardarCambiosTablaDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleGuiaRemision"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleGuiaRemision.setName("jPanelParametrosReportesDetalleGuiaRemision"); 
		
		this.jPanelParametrosReportesAccionesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleGuiaRemision.setName("jPanelParametrosReportesAccionesDetalleGuiaRemision"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleGuiaRemision = new JButtonMe();
		this.jButtonRecargarInformacionDetalleGuiaRemision.setText("Recargar");
		this.jButtonRecargarInformacionDetalleGuiaRemision.setToolTipText("Recargar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleGuiaRemision,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleGuiaRemision = new JButtonMe();
		this.jButtonProcesarInformacionDetalleGuiaRemision.setText("Procesar");
		this.jButtonProcesarInformacionDetalleGuiaRemision.setToolTipText("Procesar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleGuiaRemision.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleGuiaRemision.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleGuiaRemision.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleGuiaRemision.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleGuiaRemision.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleGuiaRemision.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleGuiaRemision.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleGuiaRemision.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleGuiaRemision.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleGuiaRemision.setText("Accion");
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleGuiaRemision.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleGuiaRemision.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleGuiaRemision = new JLabelMe();
		
		this.jLabelAccionesDetalleGuiaRemision.setText("Acciones");		
		this.jLabelAccionesDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleGuiaRemision = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleGuiaRemision.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleGuiaRemision.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleGuiaRemision = new JButtonMe();
		//this.jButtonAnterioresDetalleGuiaRemision.setText("<<");
        this.jButtonAnterioresDetalleGuiaRemision.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleGuiaRemision,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleGuiaRemision = new JButtonMe();
		//this.jButtonSiguientesDetalleGuiaRemision.setText(">>");
        this.jButtonSiguientesDetalleGuiaRemision.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleGuiaRemision,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleGuiaRemision = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleGuiaRemision.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleGuiaRemision.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleGuiaRemision,"nuevoguardarcambios_button","Nue",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleGuiaRemision";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleGuiaRemision"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleGuiaRemision";
		inputMap = this.jButtonRecargarInformacionDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleGuiaRemision"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleGuiaRemision";
		inputMap = this.jButtonSiguientesDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleGuiaRemision"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleGuiaRemision";
		inputMap = this.jButtonAnterioresDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleGuiaRemision"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleGuiaRemision();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleGuiaRemision.setMinimumSize(new Dimension(this.getWidth(),DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleGuiaRemision.setMaximumSize(new Dimension(this.getWidth(),DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleGuiaRemision.setPreferredSize(new Dimension(this.getWidth(),DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleGuiaRemisionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleGuiaRemision = new GridBagLayout();

			this.jPanelPaginacionDetalleGuiaRemision.setLayout(gridaBagLayoutPaginacionDetalleGuiaRemision);						
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonAnterioresDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					
						
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
			
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonNuevoGuardarCambiosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
						
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonSiguientesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonNuevoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
						
			
			
			if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
				this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
				this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonGuardarCambiosTablaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			}
			
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonDuplicarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonCopiarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonVerFormDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleGuiaRemision.add(this.jButtonCerrarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		
		this.jButtonRecargarInformacionDetalleGuiaRemision.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleGuiaRemision.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleGuiaRemision.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleGuiaRemision.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleGuiaRemision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleGuiaRemision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleGuiaRemision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleGuiaRemision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleGuiaRemision.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleGuiaRemision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleGuiaRemision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleGuiaRemision.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleGuiaRemision.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleGuiaRemision.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleGuiaRemision.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleGuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleGuiaRemision = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleGuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleGuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleGuiaRemision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleGuiaRemision = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleGuiaRemision.setLayout(gridaBagParametrosReportesDetalleGuiaRemision);
			this.jPanelParametrosReportesAccionesDetalleGuiaRemision.setLayout(gridaBagParametrosReportesAccionesDetalleGuiaRemision);
			
			
			this.jPanelParametrosAuxiliar1DetalleGuiaRemision.setLayout(gridaBagParametrosAuxiliar1DetalleGuiaRemision);
			this.jPanelParametrosAuxiliar2DetalleGuiaRemision.setLayout(gridaBagParametrosAuxiliar2DetalleGuiaRemision);
			this.jPanelParametrosAuxiliar3DetalleGuiaRemision.setLayout(gridaBagParametrosAuxiliar3DetalleGuiaRemision);
			this.jPanelParametrosAuxiliar4DetalleGuiaRemision.setLayout(gridaBagParametrosAuxiliar4DetalleGuiaRemision);
			//this.jPanelParametrosAuxiliar5DetalleGuiaRemision.setLayout(gridaBagParametrosAuxiliar2DetalleGuiaRemision);			
			
			
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jButtonRecargarInformacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGuiaRemision.add(this.jComboBoxTiposPaginacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGuiaRemision.add(this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleGuiaRemision.add(this.jComboBoxTiposArchivosReportesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jPanelParametrosAuxiliar1DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleGuiaRemision.add(this.jComboBoxTiposReportesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);																		
			
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleGuiaRemision.add(this.jComboBoxTiposGraficosReportesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jPanelParametrosAuxiliar4DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jComboBoxTiposReportesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jCheckBoxGenerarReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jPanelParametrosAuxiliar2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jLabelAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
				this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jButtonAbrirOrderByDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jComboBoxTiposSeleccionarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			
			
			/*
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jCheckBoxSeleccionarTodosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jCheckBoxConGraficoReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleGuiaRemision.add(this.jCheckBoxSeleccionarTodosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);															
				
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleGuiaRemision.add(this.jCheckBoxSeleccionadosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);															
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleGuiaRemision.add(this.jCheckBoxConGraficoReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jPanelParametrosAuxiliar3DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jComboBoxTiposAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
	
				
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleGuiaRemision.add(this.jTextFieldValorCampoGeneralDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setLayout(gridaBagLayoutCamposIniciogeneralDetalleGuiaRemision);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setLayout(gridaBagLayoutCamposIniciovaloresDetalleGuiaRemision);

		GridBagLayout gridaBagLayoutCamposInicioextraDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposInicioextraDetalleGuiaRemision.setLayout(gridaBagLayoutCamposInicioextraDetalleGuiaRemision);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleGuiaRemision = new GridBagLayout();

			this.jScrollPanelDatosDetalleGuiaRemision.setLayout(gridaBagLayoutDatosDetalleGuiaRemision);
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
			
			this.jScrollPanelDatosDetalleGuiaRemision.add(this.jTableDatosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleGuiaRemision.setViewportView(this.jTableDatosDetalleGuiaRemision);
		this.jTableDatosDetalleGuiaRemision.setFillsViewportHeight(true);
		this.jTableDatosDetalleGuiaRemision.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleGuiaRemision= new GridBagLayout();
		this.jPanelAccionesDetalleGuiaRemision.setLayout(gridaBagLayoutAccionesDetalleGuiaRemision);
		
		
		/*	
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
			
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonNuevoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleGuiaRemision.setLayout(gridaBagLayoutFK_IdBodegaDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdBodegaDetalleGuiaRemision.add(jLabelid_bodegaFK_IdBodegaDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		jPanelFK_IdBodegaDetalleGuiaRemision.add(jComboBoxid_bodegaFK_IdBodegaDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		gridBagConstraintsDetalleGuiaRemision.gridx =1;
		jPanelFK_IdBodegaDetalleGuiaRemision.add(jButtonFK_IdBodegaDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		jTabbedPaneBusquedasDetalleGuiaRemision.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleGuiaRemision);
		jTabbedPaneBusquedasDetalleGuiaRemision.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleGuiaRemision.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdCentroCostoDetalleGuiaRemision.add(jLabelid_centro_costoFK_IdCentroCostoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		jPanelFK_IdCentroCostoDetalleGuiaRemision.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		gridBagConstraintsDetalleGuiaRemision.gridx =1;
		jPanelFK_IdCentroCostoDetalleGuiaRemision.add(jButtonFK_IdCentroCostoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		jTabbedPaneBusquedasDetalleGuiaRemision.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleGuiaRemision);
		jTabbedPaneBusquedasDetalleGuiaRemision.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGuiaRemisionDetalleGuiaRemision.setLayout(gridaBagLayoutFK_IdGuiaRemisionDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdGuiaRemisionDetalleGuiaRemision.add(jLabelid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		jPanelFK_IdGuiaRemisionDetalleGuiaRemision.add(jComboBoxid_guia_remisionFK_IdGuiaRemisionDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		gridBagConstraintsDetalleGuiaRemision.gridx =1;
		jPanelFK_IdGuiaRemisionDetalleGuiaRemision.add(jButtonFK_IdGuiaRemisionDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		jTabbedPaneBusquedasDetalleGuiaRemision.addTab("3.-Por Guia Remision ", jPanelFK_IdGuiaRemisionDetalleGuiaRemision);
		jTabbedPaneBusquedasDetalleGuiaRemision.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleGuiaRemision.setLayout(gridaBagLayoutFK_IdProductoDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdProductoDetalleGuiaRemision.add(jLabelid_productoFK_IdProductoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		jPanelFK_IdProductoDetalleGuiaRemision.add(jComboBoxid_productoFK_IdProductoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);


		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdProductoDetalleGuiaRemision.add(this.jButtonBuscarFK_IdProductoid_productoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		gridBagConstraintsDetalleGuiaRemision.gridx =1;
		jPanelFK_IdProductoDetalleGuiaRemision.add(jButtonFK_IdProductoDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		jTabbedPaneBusquedasDetalleGuiaRemision.addTab("4.-Por Producto ", jPanelFK_IdProductoDetalleGuiaRemision);
		jTabbedPaneBusquedasDetalleGuiaRemision.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleGuiaRemision= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleGuiaRemision.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleGuiaRemision.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleGuiaRemision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleGuiaRemision.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleGuiaRemision.setLayout(gridaBagLayoutFK_IdUnidadDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		jPanelFK_IdUnidadDetalleGuiaRemision.add(jLabelid_unidadFK_IdUnidadDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		jPanelFK_IdUnidadDetalleGuiaRemision.add(jComboBoxid_unidadFK_IdUnidadDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		gridBagConstraintsDetalleGuiaRemision.gridx =1;
		jPanelFK_IdUnidadDetalleGuiaRemision.add(jButtonFK_IdUnidadDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);

		jTabbedPaneBusquedasDetalleGuiaRemision.addTab("5.-Por Unidad ", jPanelFK_IdUnidadDetalleGuiaRemision);
		jTabbedPaneBusquedasDetalleGuiaRemision.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleGuiaRemision);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();						
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;		
			//this.gridBagConstraintsDetalleGuiaRemision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleGuiaRemision.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;		
		//this.gridBagConstraintsDetalleGuiaRemision.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleGuiaRemision);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;		
			this.gridBagConstraintsDetalleGuiaRemision.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleGuiaRemision.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);								
		
		
		/*
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		*/		
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleGuiaRemision.gridx =0;
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleGuiaRemision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
				
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleGuiaRemisionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleGuiaRemision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleGuiaRemision = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleGuiaRemision.setLayout(gridaBagLayoutBusquedasParametrosDetalleGuiaRemision);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleGuiaRemision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleGuiaRemision;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleGuiaRemision() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleGuiaRemision = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleGuiaRemision.setName("jPanelReporteDinamicoDetalleGuiaRemision"); 
		
		this.jPanelReporteDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleGuiaRemision.setLayout(gridaBagLayoutReporteDinamicoDetalleGuiaRemision);
		
		
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleGuiaRemision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleGuiaRemision = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleGuiaRemision.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelColumnasSelectReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleGuiaRemision = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleGuiaRemision=new JScrollPane(this.jListColumnasSelectReporteDetalleGuiaRemision);
			
			this.jScrollColumnasSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jListColumnasSelectReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jScrollColumnasSelectReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleGuiaRemision = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleGuiaRemision.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleGuiaRemision = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleGuiaRemision=new JScrollPane(this.jListRelacionesSelectReporteDetalleGuiaRemision);
			
			this.jScrollRelacionesSelectReporteDetalleGuiaRemision.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleGuiaRemision.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleGuiaRemision.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleGuiaRemision = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleGuiaRemision = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleGuiaRemision.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelConGraficoDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jCheckBoxConGraficoDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelColumnaCategoriaGraficoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleGuiaRemision = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleGuiaRemision.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelColumnaCategoriaValorDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jComboBoxColumnaCategoriaValorDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleGuiaRemision = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleGuiaRemision.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelColumnasValoresGraficoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleGuiaRemision = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleGuiaRemision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleGuiaRemision.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleGuiaRemision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleGuiaRemision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleGuiaRemision.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleGuiaRemision=new JScrollPane(this.jListColumnasValoresGraficoDetalleGuiaRemision);
			
			this.jScrollColumnasValoresGraficoDetalleGuiaRemision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleGuiaRemision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleGuiaRemision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jListColumnasSelectReporteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jScrollColumnasValoresGraficoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelTiposGraficosReportesDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleGuiaRemision.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelGenerarExcelReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision.setToolTipText("Generar EXCEL"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jButtonGenerarExcelReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jComboBoxTiposReportesDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jLabelTiposArchivoReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleGuiaRemision = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleGuiaRemision.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleGuiaRemision,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleGuiaRemision.setToolTipText("Generar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jButtonGenerarReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleGuiaRemision = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleGuiaRemision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleGuiaRemision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleGuiaRemision.setToolTipText("Cancelar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleGuiaRemision.add(this.jButtonCerrarReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleGuiaRemision = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision= new JScrollPane(jPanelReporteDinamicoDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleGuiaRemision);
		this.jInternalFrameReporteDinamicoDetalleGuiaRemision.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleGuiaRemision() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleGuiaRemision = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleGuiaRemision.setName("jPanelImportacionDetalleGuiaRemision"); 
		
		this.jPanelImportacionDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleGuiaRemision.setLayout(gridaBagLayoutImportacionDetalleGuiaRemision);
		
		
		this.jInternalFrameImportacionDetalleGuiaRemision= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleGuiaRemision= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleGuiaRemision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleGuiaRemision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleGuiaRemision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleGuiaRemision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleGuiaRemision.setResizable(true);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setClosable(true);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleGuiaRemision.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleGuiaRemision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleGuiaRemision.setResizable(true);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setClosable(true);
	    this.jInternalFrameImportacionDetalleGuiaRemision.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleGuiaRemision = new JLabelMe();

		this.jLabelArchivoImportacionDetalleGuiaRemision.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleGuiaRemision.add(this.jLabelArchivoImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleGuiaRemision = new JFileChooser();		
		this.jFileChooserImportacionDetalleGuiaRemision.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleGuiaRemision = new JButtonMe();
		this.jButtonAbrirImportacionDetalleGuiaRemision.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleGuiaRemision,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleGuiaRemision.setToolTipText("Generar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGuiaRemision.add(this.jButtonAbrirImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleGuiaRemision = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleGuiaRemision.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleGuiaRemision.add(this.jLabelPathArchivoImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleGuiaRemision=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleGuiaRemision.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleGuiaRemision.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleGuiaRemision.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGuiaRemision.add(this.jTextFieldPathArchivoImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleGuiaRemision = new JButtonMe();
		this.jButtonGenerarImportacionDetalleGuiaRemision.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleGuiaRemision,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleGuiaRemision.setToolTipText("Generar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGuiaRemision.add(this.jButtonGenerarImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleGuiaRemision = new JButtonMe();
		this.jButtonCerrarImportacionDetalleGuiaRemision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleGuiaRemision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleGuiaRemision.setToolTipText("Cancelar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleGuiaRemision.add(this.jButtonCerrarImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleGuiaRemision = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleGuiaRemision= new JScrollPane(jPanelImportacionDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleGuiaRemision.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleGuiaRemision);
		this.jInternalFrameImportacionDetalleGuiaRemision.getContentPane().add(this.jScrollPanelImportacionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleGuiaRemision(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleGuiaRemision = new JButtonMe();
			this.jButtonAbrirOrderByDetalleGuiaRemision.setText("Orden");
			this.jButtonAbrirOrderByDetalleGuiaRemision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleGuiaRemision,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleGuiaRemision";
			inputMap = this.jButtonAbrirOrderByDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleGuiaRemision"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleGuiaRemision = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleGuiaRemision.setName("jPanelOrderByDetalleGuiaRemision"); 
			
			this.jPanelOrderByDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleGuiaRemision.setLayout(gridaBagLayoutOrderByDetalleGuiaRemision);
			
			
			this.jTableDatosDetalleGuiaRemisionOrderBy = new JTableMe();        
			this.jTableDatosDetalleGuiaRemisionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleGuiaRemisionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleGuiaRemisionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleGuiaRemisionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleGuiaRemisionOrderBy.setViewportView(this.jTableDatosDetalleGuiaRemisionOrderBy);
			this.jTableDatosDetalleGuiaRemisionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleGuiaRemisionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleGuiaRemision= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleGuiaRemision= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleGuiaRemision = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleGuiaRemision= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleGuiaRemision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleGuiaRemision.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleGuiaRemision.setTitle("Orden");
			this.jInternalFrameOrderByDetalleGuiaRemision.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleGuiaRemision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleGuiaRemision.setResizable(true);
			this.jInternalFrameOrderByDetalleGuiaRemision.setClosable(true);
			this.jInternalFrameOrderByDetalleGuiaRemision.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleGuiaRemision.ipady =150;
				
			this.jPanelOrderByDetalleGuiaRemision.add(jScrollPanelDatosDetalleGuiaRemisionOrderBy, this.gridBagConstraintsDetalleGuiaRemision);//this.jTableDatosDetalleGuiaRemisionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleGuiaRemision = new JButtonMe();
			this.jButtonCerrarOrderByDetalleGuiaRemision.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleGuiaRemision,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleGuiaRemision.setToolTipText("Cancelar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleGuiaRemision.add(this.jButtonCerrarOrderByDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleGuiaRemision = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleGuiaRemision= new JScrollPane(jPanelOrderByDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleGuiaRemision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleGuiaRemision.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleGuiaRemision);
			
			this.jInternalFrameOrderByDetalleGuiaRemision.getContentPane().add(this.jScrollPanelOrderByDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
		
		} else {
			this.jButtonAbrirOrderByDetalleGuiaRemision = new JButtonMe();
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
		int iWidthTableCalculado=0;//6330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleguiaremisionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleGuiaRemision.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleGuiaRemision.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleGuiaRemision.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleGuiaRemision.getRowHeight();//DetalleGuiaRemisionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.isSelected()) {
					iHeightTable=DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleGuiaRemision.isSelected()) {
					iHeightTable=DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleGuiaRemisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleGuiaRemision!=null && this.jInternalFrameOrderByDetalleGuiaRemision.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleGuiaRemision.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleGuiaRemision.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleGuiaRemision.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleGuiaRemision.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleGuiaRemision.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleGuiaRemision.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleGuiaRemision.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleguiaremisionLogic.getDetalleGuiaRemisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleguiaremisions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleGuiaRemision> TraerDetalleGuiaRemisionBeans(List<DetalleGuiaRemision> detalleguiaremisions,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleGuiaRemision detalleguiaremision:detalleguiaremisions) {
					
				if(!(DetalleGuiaRemisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleGuiaRemisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleguiaremision.setsDetalleGeneralEntityReporte(DetalleGuiaRemisionConstantesFunciones.getDetalleGuiaRemisionDescripcion(detalleguiaremision));
										
						
					
						
					
				} else  {
							
					//detalleguiaremision.setsDetalleGeneralEntityReporte(detalleguiaremision.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleguiaremisionbeans.add(detalleguiaremisionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleguiaremisions;
    }
	//PARA REPORTES FIN
}
