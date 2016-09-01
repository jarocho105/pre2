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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.OrdenDetaProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class OrdenDetaProduJInternalFrame extends OrdenDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarOrdenDetaProdu;
	
	protected JMenuBar jmenuBarOrdenDetaProdu;
	
	protected JMenu jmenuOrdenDetaProdu;
	protected JMenu jmenuDatosOrdenDetaProdu;
	protected JMenu jmenuArchivoOrdenDetaProdu;
	protected JMenu jmenuAccionesOrdenDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenDetaProdu;	
	protected GridBagConstraints gridBagConstraintsOrdenDetaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public OrdenDetaProduDetalleFormJInternalFrame jInternalFrameDetalleFormOrdenDetaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoOrdenDetaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionOrdenDetaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordenprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegadestino="";

	protected TipoProcesoProduBeanSwingJInternalFrame tipoprocesoproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoprodu="";
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public OrdenProduSessionBean ordenproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<OrdenDetaProdu> ordendetaprodus;		
	public List<OrdenDetaProdu> ordendetaprodusEliminados;	
	public List<OrdenDetaProdu> ordendetaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByOrdenDetaProdu;		
	protected JButton jButtonAbrirOrderByOrdenDetaProdu;
	
	
	//protected JPanel jPanelOrderByOrdenDetaProdu;
	//public JScrollPane jScrollPanelOrderByOrdenDetaProdu;	
	//protected JButton jButtonCerrarOrderByOrdenDetaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralOrdenDetaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosOrdenDetaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoOrdenDetaProdu;
	//public JScrollPane jScrollPanelImportacionOrdenDetaProdu;
	
	
	
	protected JPanel jPanelAccionesOrdenDetaProdu;
	
    protected JPanel jPanelPaginacionOrdenDetaProdu;
    protected JPanel jPanelParametrosReportesOrdenDetaProdu;
	protected JPanel jPanelParametrosReportesAccionesOrdenDetaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1OrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar2OrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar3OrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar4OrdenDetaProdu;
	//protected JPanel jPanelParametrosAuxiliar5OrdenDetaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoOrdenDetaProdu;
	//protected JPanel jPanelImportacionOrdenDetaProdu;
	
	
	public JTable jTableDatosOrdenDetaProdu;
	
	
	
	//public JTable jTableDatosOrdenDetaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoOrdenDetaProdu;
	protected JButton jButtonDuplicarOrdenDetaProdu;
	protected JButton jButtonCopiarOrdenDetaProdu;
	protected JButton jButtonVerFormOrdenDetaProdu;
	protected JButton jButtonNuevoRelacionesOrdenDetaProdu;
	protected JButton jButtonModificarOrdenDetaProdu;
	
    protected JButton jButtonGuardarCambiosTablaOrdenDetaProdu;
	protected JButton jButtonCerrarOrdenDetaProdu;
	
	
	protected JButton jButtonRecargarInformacionOrdenDetaProdu;
	protected JButton jButtonProcesarInformacionOrdenDetaProdu;
	
	
	protected JButton jButtonAnterioresOrdenDetaProdu;
	protected JButton jButtonSiguientesOrdenDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosOrdenDetaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoOrdenDetaProdu;
	//protected JButton jButtonCerrarReporteDinamicoOrdenDetaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoOrdenDetaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionOrdenDetaProdu;
	//protected JButton jButtonGenerarImportacionOrdenDetaProdu;
	//protected JButton jButtonCerrarImportacionOrdenDetaProdu;
	//protected JFileChooser jFileChooserImportacionOrdenDetaProdu;
	//protected File fileImportacionOrdenDetaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenDetaProdu;
	protected JButton jButtonDuplicarToolBarOrdenDetaProdu;
	protected JButton jButtonNuevoRelacionesToolBarOrdenDetaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarOrdenDetaProdu;
	protected JButton jButtonCopiarToolBarOrdenDetaProdu;
	protected JButton jButtonVerFormToolBarOrdenDetaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarOrdenDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenDetaProdu;
	protected JButton jButtonCerrarToolBarOrdenDetaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarOrdenDetaProdu;
	protected JButton jButtonProcesarInformacionToolBarOrdenDetaProdu;
	protected JButton jButtonAnterioresToolBarOrdenDetaProdu;
	protected JButton jButtonSiguientesToolBarOrdenDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarOrdenDetaProdu;
	protected JButton jButtonAbrirOrderByToolBarOrdenDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenDetaProdu;
	protected JMenuItem jMenuItemDuplicarOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesOrdenDetaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosOrdenDetaProdu;
	protected JMenuItem jMenuItemCopiarOrdenDetaProdu;
	protected JMenuItem jMenuItemVerFormOrdenDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenDetaProdu;
	protected JMenuItem jMenuItemCerrarOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenDetaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionOrdenDetaProdu;
	protected JMenuItem jMenuItemProcesarInformacionOrdenDetaProdu;
	protected JMenuItem jMenuItemAnterioresOrdenDetaProdu;
	protected JMenuItem jMenuItemSiguientesOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenDetaProdu;
	protected JMenuItem jMenuItemAbrirOrderByOrdenDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarOrdenDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesOrdenDetaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosOrdenDetaProdu;
	protected JCheckBox jCheckBoxSeleccionadosOrdenDetaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaOrdenDetaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarOrdenDetaProdu;
	protected JTextField jTextFieldValorCampoGeneralOrdenDetaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteOrdenDetaProdu;
	//public JList<Reporte> jListColumnasSelectReporteOrdenDetaProdu;
	//public JScrollPane jScrollColumnasSelectReporteOrdenDetaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteOrdenDetaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteOrdenDetaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteOrdenDetaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoOrdenDetaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoOrdenDetaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoOrdenDetaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoOrdenDetaProdu;
	
		
	//public JLabel jLabelArchivoImportacionOrdenDetaProdu;	
	//public JLabel jLabelPathArchivoImportacionOrdenDetaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionOrdenDetaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoOrdenDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoOrdenDetaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorOrdenDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorOrdenDetaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoOrdenDetaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoOrdenDetaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoOrdenDetaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoOrdenDetaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasOrdenDetaProdu;
	public JPanel jPanelFK_IdBodegaOrdenDetaProdu;
	public JButton jButtonFK_IdBodegaOrdenDetaProdu;
	public JPanel jPanelFK_IdBodegaDestinoOrdenDetaProdu;
	public JButton jButtonFK_IdBodegaDestinoOrdenDetaProdu;
	public JPanel jPanelFK_IdOrdenProduOrdenDetaProdu;
	public JButton jButtonFK_IdOrdenProduOrdenDetaProdu;
	public JPanel jPanelFK_IdProductoOrdenDetaProdu;
	public JButton jButtonFK_IdProductoOrdenDetaProdu;
	public JPanel jPanelFK_IdTipoProcesoProduOrdenDetaProdu;
	public JButton jButtonFK_IdTipoProcesoProduOrdenDetaProdu;
	public JPanel jPanelFK_IdUnidadUnadOrdenDetaProdu;
	public JButton jButtonFK_IdUnidadUnadOrdenDetaProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaOrdenDetaProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu;
	public JButton jButtonid_bodegaFK_IdBodegaOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu;
	public JLabel jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu;
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_produFK_IdOrdenProduOrdenDetaProdu;
	public JLabel jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu;
	public JButton jButtonid_orden_produFK_IdOrdenProduOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_orden_produFK_IdOrdenProduOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_orden_produFK_IdOrdenProduOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoOrdenDetaProdu;
	public JLabel jLabelid_productoFK_IdProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoOrdenDetaProdu;
	public JButton jButtonid_productoFK_IdProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu;
	
	public JPanel jPanelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu;
	public JLabel jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu;
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadUnadOrdenDetaProdu;
	public JLabel jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu;
	public JButton jButtonid_unidadFK_IdUnidadUnadOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadOrdenDetaProduBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public OrdenDetaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionOrdenDetaProdu)	{
		this.jButtonRecargarInformacionOrdenDetaProdu = jButtonRecargarInformacionOrdenDetaProdu;
	}
	
	public JButton getjButtonProcesarInformacionOrdenDetaProdu() {
		return this.jButtonProcesarInformacionOrdenDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenDetaProdu)	{
		this.jButtonProcesarInformacionOrdenDetaProdu = jButtonProcesarInformacionOrdenDetaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionOrdenDetaProdu() {
		return this.jButtonRecargarInformacionOrdenDetaProdu;
	}
	
	
	public List<OrdenDetaProdu> getordendetaprodus() {
		return this.ordendetaprodus;
	}

	public void setordendetaprodus(List<OrdenDetaProdu> ordendetaprodus) {
		this.ordendetaprodus = ordendetaprodus;
	}
	
	public List<OrdenDetaProdu> getordendetaprodusAux() {
		return this.ordendetaprodusAux;
	}

	public void setordendetaprodusAux(List<OrdenDetaProdu> ordendetaprodusAux) {
		this.ordendetaprodusAux = ordendetaprodusAux;
	}
	
	public List<OrdenDetaProdu> getordendetaprodusEliminados() {
		return this.ordendetaprodusEliminados;
	}

	public void setOrdenDetaProdusEliminados(List<OrdenDetaProdu> ordendetaprodusEliminados) {
		this.ordendetaprodusEliminados = ordendetaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarOrdenDetaProdu() {
		return jComboBoxTiposSeleccionarOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarOrdenDetaProdu(
			JComboBox jComboBoxTiposSeleccionarOrdenDetaProdu) {
		this.jComboBoxTiposSeleccionarOrdenDetaProdu = jComboBoxTiposSeleccionarOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralOrdenDetaProdu() {
		return jTextFieldValorCampoGeneralOrdenDetaProdu;
	}

	public void setjTextFieldValorCampoGeneralOrdenDetaProdu(
			JTextField jTextFieldValorCampoGeneralOrdenDetaProdu) {
		this.jTextFieldValorCampoGeneralOrdenDetaProdu = jTextFieldValorCampoGeneralOrdenDetaProdu;
	}

	public void setBorderResaltarValorCampoGeneralOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralOrdenDetaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosOrdenDetaProdu() {
		return this.jCheckBoxSeleccionarTodosOrdenDetaProdu;
	}

	public void setjCheckBoxSeleccionarTodosOrdenDetaProdu(
			JCheckBox jCheckBoxSeleccionarTodosOrdenDetaProdu) {
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu = jCheckBoxSeleccionarTodosOrdenDetaProdu;
	}

	public void setBorderResaltarSeleccionarTodosOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosOrdenDetaProdu() {
		return this.jCheckBoxSeleccionadosOrdenDetaProdu;
	}

	public void setjCheckBoxSeleccionadosOrdenDetaProdu(
			JCheckBox jCheckBoxSeleccionadosOrdenDetaProdu) {
		this.jCheckBoxSeleccionadosOrdenDetaProdu = jCheckBoxSeleccionadosOrdenDetaProdu;
	}
	
	public void setBorderResaltarSeleccionadosOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesOrdenDetaProdu() {
		return this.jComboBoxTiposArchivosReportesOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesOrdenDetaProdu(
			JComboBox jComboBoxTiposArchivosReportesOrdenDetaProdu) {
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu = jComboBoxTiposArchivosReportesOrdenDetaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesOrdenDetaProdu() {
		return this.jComboBoxTiposReportesOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesOrdenDetaProdu(
			JComboBox jComboBoxTiposReportesOrdenDetaProdu) {
		this.jComboBoxTiposReportesOrdenDetaProdu = jComboBoxTiposReportesOrdenDetaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoOrdenDetaProdu() {
	//	return jComboBoxTiposReportesDinamicoOrdenDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoOrdenDetaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoOrdenDetaProdu) {
	//	this.jComboBoxTiposReportesDinamicoOrdenDetaProdu = jComboBoxTiposReportesDinamicoOrdenDetaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu = jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu;
	//}
	
	public void setBorderResaltarTiposReportesOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesOrdenDetaProdu() {
		return this.jComboBoxTiposGraficosReportesOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesOrdenDetaProdu(
			JComboBox jComboBoxTiposGraficosReportesOrdenDetaProdu) {
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu = jComboBoxTiposGraficosReportesOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionOrdenDetaProdu() {
		return this.jComboBoxTiposPaginacionOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionOrdenDetaProdu(
			JComboBox jComboBoxTiposPaginacionOrdenDetaProdu) {
		this.jComboBoxTiposPaginacionOrdenDetaProdu = jComboBoxTiposPaginacionOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesOrdenDetaProdu() {
		return this.jComboBoxTiposRelacionesOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenDetaProdu(
			JComboBox jComboBoxTiposRelacionesOrdenDetaProdu) {
		this.jComboBoxTiposRelacionesOrdenDetaProdu = jComboBoxTiposRelacionesOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesOrdenDetaProdu) {
		this.jComboBoxTiposAccionesOrdenDetaProdu = jComboBoxTiposAccionesOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoOrdenDetaProdu() {
	//	return jCheckBoxConGraficoDinamicoOrdenDetaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoOrdenDetaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoOrdenDetaProdu) {
	//	this.jCheckBoxConGraficoDinamicoOrdenDetaProdu = jCheckBoxConGraficoDinamicoOrdenDetaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoOrdenDetaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarOrdenDetaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoOrdenDetaProdu .setBorder(borderResaltar);		
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
		this.ordendetaproduSessionBean=new OrdenDetaProduSessionBean();
		
		this.ordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordendetaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Detalle Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarOrdenDetaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"nuevo","nuevo","Nuevo"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"duplicar","duplicar","Duplicar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"copiar","copiar","Copiar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"ver_form","ver_form","Ver"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"recargar","recargar","Recargar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarOrdenDetaProdu,this.jTtoolBarOrdenDetaProdu,
							"cerrar","cerrar","Salir"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarOrdenDetaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarOrdenDetaProdu;
			
				this.jButtonProcesarInformacionToolBarOrdenDetaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarOrdenDetaProdu;
				
		//protected JButton jButtonModificarToolBarOrdenDetaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarOrdenDetaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuOrdenDetaProdu=new JMenuMe("General");
		this.jmenuArchivoOrdenDetaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesOrdenDetaProdu=new JMenuMe("Acciones");
		this.jmenuDatosOrdenDetaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarOrdenDetaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarOrdenDetaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarOrdenDetaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesOrdenDetaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesOrdenDetaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesOrdenDetaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosOrdenDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarOrdenDetaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarOrdenDetaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarOrdenDetaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormOrdenDetaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormOrdenDetaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormOrdenDetaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaOrdenDetaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaOrdenDetaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaOrdenDetaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionOrdenDetaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionOrdenDetaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionOrdenDetaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionOrdenDetaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionOrdenDetaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionOrdenDetaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresOrdenDetaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresOrdenDetaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresOrdenDetaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesOrdenDetaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesOrdenDetaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesOrdenDetaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByOrdenDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByOrdenDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByOrdenDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByOrdenDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByOrdenDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByOrdenDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosOrdenDetaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosOrdenDetaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosOrdenDetaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoOrdenDetaProdu.add(this.jMenuItemCerrarOrdenDetaProdu);
			
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemNuevoOrdenDetaProdu);
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemNuevoGuardarCambiosOrdenDetaProdu);
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemNuevoRelacionesOrdenDetaProdu);
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemGuardarCambiosTablaOrdenDetaProdu);		
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemDuplicarOrdenDetaProdu);		
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemCopiarOrdenDetaProdu);		
			this.jmenuAccionesOrdenDetaProdu.add(this.jMenuItemVerFormOrdenDetaProdu);		
			
			this.jmenuDatosOrdenDetaProdu.add(this.jMenuItemRecargarInformacionOrdenDetaProdu);				
			this.jmenuDatosOrdenDetaProdu.add(this.jMenuItemAnterioresOrdenDetaProdu);				
			this.jmenuDatosOrdenDetaProdu.add(this.jMenuItemSiguientesOrdenDetaProdu);				
			this.jmenuDatosOrdenDetaProdu.add(this.jMenuItemAbrirOrderByOrdenDetaProdu);				
			this.jmenuDatosOrdenDetaProdu.add(this.jMenuItemMostrarOcultarOrdenDetaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesOrdenDetaProdu.add(this.jMenuItemGuardarCambiosOrdenDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarOrdenDetaProdu.add(this.jmenuArchivoOrdenDetaProdu);		
			this.jmenuBarOrdenDetaProdu.add(this.jmenuAccionesOrdenDetaProdu);		
			this.jmenuBarOrdenDetaProdu.add(this.jmenuDatosOrdenDetaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarOrdenDetaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasOrdenDetaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaOrdenDetaProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdBodegaOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdBodegaOrdenDetaProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaOrdenDetaProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaDestinoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDestinoOrdenDetaProdu.setToolTipText("Buscar Por Bodega Destino ");
		this.jButtonFK_IdBodegaDestinoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdBodegaDestinoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdBodegaDestinoOrdenDetaProdu.setToolTipText("Buscar Por Bodega Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDestinoOrdenDetaProdu,"buscar_button","Buscar Por Bodega Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDestinoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu = new JLabelMe();
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setText("Bodega Destino :");
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setToolTipText("Bodega Destino");
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenProduOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenProduOrdenDetaProdu.setToolTipText("Buscar Por Orden Produ ");
		this.jButtonFK_IdOrdenProduOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdOrdenProduOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdOrdenProduOrdenDetaProdu.setToolTipText("Buscar Por Orden Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenProduOrdenDetaProdu,"buscar_button","Buscar Por Orden Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenProduOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu = new JLabelMe();
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu.setText("Orden Produ :");
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu.setToolTipText("Orden Produ");
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoOrdenDetaProdu.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdProductoOrdenDetaProdu.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoOrdenDetaProdu,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoOrdenDetaProdu = new JLabelMe();
		jLabelid_productoFK_IdProductoOrdenDetaProdu.setText("Producto :");
		jLabelid_productoFK_IdProductoOrdenDetaProdu.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu.setFocusable(false);

		this.jPanelFK_IdTipoProcesoProduOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoProduOrdenDetaProdu.setToolTipText("Buscar Por Tipo Proceso Produ ");
		this.jButtonFK_IdTipoProcesoProduOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdTipoProcesoProduOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdTipoProcesoProduOrdenDetaProdu.setToolTipText("Buscar Por Tipo Proceso Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoProduOrdenDetaProdu,"buscar_button","Buscar Por Tipo Proceso Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoProduOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu = new JLabelMe();
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setText("Tipo Proceso Produ :");
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setToolTipText("Tipo Proceso Produ");
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadUnadOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadUnadOrdenDetaProdu.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadUnadOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdUnidadUnadOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdUnidadUnadOrdenDetaProdu.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadUnadOrdenDetaProdu,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadUnadOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu = new JLabelMe();
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu.setText("Unad :");
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasOrdenDetaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasOrdenDetaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenDetaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenDetaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleOrdenDetaProdu = new OrdenDetaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden Detalle Produccion DATOS");
			this.jInternalFrameDetalleFormOrdenDetaProdu = new OrdenDetaProduDetalleFormJInternalFrame(jDesktopPane,this.ordendetaproduSessionBean.getConGuardarRelaciones(),this.ordendetaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormOrdenDetaProdu = null;//new OrdenDetaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenDetaProdu= new GridBagLayout();
		
		
		this.jTableDatosOrdenDetaProdu = new JTableMe();      
		
		String sToolTipOrdenDetaProdu="";
		sToolTipOrdenDetaProdu=OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenDetaProdu+="(Produccion.OrdenDetaProdu)";
		}
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenDetaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosOrdenDetaProdu.setToolTipText(sToolTipOrdenDetaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosOrdenDetaProdu);
		this.jTableDatosOrdenDetaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosOrdenDetaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosOrdenDetaProdu.setRowSelectionAllowed(true);
		this.jTableDatosOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoOrdenDetaProdu = new JButtonMe();
		this.jButtonDuplicarOrdenDetaProdu = new JButtonMe();
		this.jButtonCopiarOrdenDetaProdu = new JButtonMe();
		this.jButtonVerFormOrdenDetaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesOrdenDetaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarOrdenDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosOrdenDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralOrdenDetaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Detalle Produccion";
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesOrdenDetaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoOrdenDetaProdu=new ReporteDinamicoJInternalFrame(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoOrdenDetaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionOrdenDetaProdu=new ImportacionJInternalFrame(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionOrdenDetaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByOrdenDetaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByOrdenDetaProdu.setText("Orden");
		this.jButtonAbrirOrderByOrdenDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenDetaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenDetaProdu,false,this);
			
			//this.cargarOrderByOrdenDetaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenDetaProdu,true,this);
			
			//this.cargarOrderByOrdenDetaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosOrdenDetaProdu.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosOrdenDetaProdu.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosOrdenDetaProdu.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosOrdenDetaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenDetaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenDetaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoOrdenDetaProdu.setText("Nuevo");
		this.jButtonDuplicarOrdenDetaProdu.setText("Duplicar");
		this.jButtonCopiarOrdenDetaProdu.setText("Copiar");
		this.jButtonVerFormOrdenDetaProdu.setText("Ver");
		this.jButtonNuevoRelacionesOrdenDetaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.setText("Guardar");
		this.jButtonCerrarOrdenDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenDetaProdu,"nuevo_button","Nuevo",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarOrdenDetaProdu,"duplicar_button","Duplicar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarOrdenDetaProdu,"copiar_button","Copiar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormOrdenDetaProdu,"ver_form","Ver",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesOrdenDetaProdu,"nuevorelaciones_button","Nuevo Rel",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenDetaProdu,"guardarcambiostabla_button","Guardar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenDetaProdu,"cerrar_button","Salir",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoOrdenDetaProdu.setToolTipText("Nuevo"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarOrdenDetaProdu.setToolTipText("Duplicar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarOrdenDetaProdu.setToolTipText("Copiar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormOrdenDetaProdu.setToolTipText("Ver"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesOrdenDetaProdu.setToolTipText("Nuevo Rel"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.setToolTipText("Guardar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenDetaProdu.setToolTipText("Salir"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenDetaProdu";
		inputMap = this.jButtonNuevoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenDetaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarOrdenDetaProdu";
		inputMap = this.jButtonDuplicarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarOrdenDetaProdu"));
		
		//COPIAR
		sMapKey = "CopiarOrdenDetaProdu";
		inputMap = this.jButtonCopiarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarOrdenDetaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormOrdenDetaProdu";
		inputMap = this.jButtonVerFormOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormOrdenDetaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesOrdenDetaProdu";
		inputMap = this.jButtonNuevoRelacionesOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesOrdenDetaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarOrdenDetaProdu";
		inputMap = this.jButtonModificarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarOrdenDetaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarOrdenDetaProdu";
		inputMap = this.jButtonCerrarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenDetaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1OrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2OrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3OrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4OrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5OrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesOrdenDetaProdu.setName("jPanelParametrosReportesOrdenDetaProdu"); 
		
		this.jPanelParametrosReportesAccionesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesOrdenDetaProdu.setName("jPanelParametrosReportesAccionesOrdenDetaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionOrdenDetaProdu = new JButtonMe();
		this.jButtonRecargarInformacionOrdenDetaProdu.setText("Recargar");
		this.jButtonRecargarInformacionOrdenDetaProdu.setToolTipText("Recargar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionOrdenDetaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionOrdenDetaProdu = new JButtonMe();
		this.jButtonProcesarInformacionOrdenDetaProdu.setText("Procesar");
		this.jButtonProcesarInformacionOrdenDetaProdu.setToolTipText("Procesar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionOrdenDetaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionOrdenDetaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenDetaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenDetaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesOrdenDetaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionOrdenDetaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionOrdenDetaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesOrdenDetaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesOrdenDetaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralOrdenDetaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralOrdenDetaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenDetaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenDetaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesOrdenDetaProdu = new JLabelMe();
		
		this.jLabelAccionesOrdenDetaProdu.setText("Acciones");		
		this.jLabelAccionesOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosOrdenDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosOrdenDetaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosOrdenDetaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteOrdenDetaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteOrdenDetaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresOrdenDetaProdu = new JButtonMe();
		//this.jButtonAnterioresOrdenDetaProdu.setText("<<");
        this.jButtonAnterioresOrdenDetaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresOrdenDetaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesOrdenDetaProdu = new JButtonMe();
		//this.jButtonSiguientesOrdenDetaProdu.setText(">>");
        this.jButtonSiguientesOrdenDetaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesOrdenDetaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosOrdenDetaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosOrdenDetaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosOrdenDetaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosOrdenDetaProdu,"nuevoguardarcambios_button","Nue",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosOrdenDetaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosOrdenDetaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionOrdenDetaProdu";
		inputMap = this.jButtonRecargarInformacionOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionOrdenDetaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesOrdenDetaProdu";
		inputMap = this.jButtonSiguientesOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesOrdenDetaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresOrdenDetaProdu";
		inputMap = this.jButtonAnterioresOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresOrdenDetaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasOrdenDetaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesOrdenDetaProdu.setMinimumSize(new Dimension(this.getWidth(),OrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenDetaProdu.setMaximumSize(new Dimension(this.getWidth(),OrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenDetaProdu.setPreferredSize(new Dimension(this.getWidth(),OrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionOrdenDetaProdu = new GridBagLayout();

			this.jPanelPaginacionOrdenDetaProdu.setLayout(gridaBagLayoutPaginacionOrdenDetaProdu);						
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonAnterioresOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					
						
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
			
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonNuevoGuardarCambiosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
						
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonSiguientesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonNuevoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
				this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonNuevoRelacionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			}
			
			
			if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
				this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonGuardarCambiosTablaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			}
			
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonDuplicarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonCopiarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonVerFormOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionOrdenDetaProdu.add(this.jButtonCerrarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
		
		
		this.jButtonRecargarInformacionOrdenDetaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenDetaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenDetaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenDetaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionOrdenDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteOrdenDetaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenDetaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenDetaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenDetaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosOrdenDetaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenDetaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenDetaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesOrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesOrdenDetaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1OrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2OrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3OrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4OrdenDetaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesOrdenDetaProdu.setLayout(gridaBagParametrosReportesOrdenDetaProdu);
			this.jPanelParametrosReportesAccionesOrdenDetaProdu.setLayout(gridaBagParametrosReportesAccionesOrdenDetaProdu);
			
			
			this.jPanelParametrosAuxiliar1OrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar1OrdenDetaProdu);
			this.jPanelParametrosAuxiliar2OrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar2OrdenDetaProdu);
			this.jPanelParametrosAuxiliar3OrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar3OrdenDetaProdu);
			this.jPanelParametrosAuxiliar4OrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar4OrdenDetaProdu);
			//this.jPanelParametrosAuxiliar5OrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar2OrdenDetaProdu);			
			
			
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jButtonRecargarInformacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenDetaProdu.add(this.jComboBoxTiposPaginacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenDetaProdu.add(this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenDetaProdu.add(this.jComboBoxTiposArchivosReportesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jPanelParametrosAuxiliar1OrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4OrdenDetaProdu.add(this.jComboBoxTiposReportesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jPanelParametrosAuxiliar4OrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jComboBoxTiposReportesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jCheckBoxGenerarReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jPanelParametrosAuxiliar2OrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jLabelAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesOrdenDetaProdu.add(this.jButtonAbrirOrderByOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jComboBoxTiposSeleccionarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			
			
			/*
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jCheckBoxSeleccionarTodosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenDetaProdu.add(this.jCheckBoxSeleccionarTodosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);															
				
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenDetaProdu.add(this.jCheckBoxSeleccionadosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jPanelParametrosAuxiliar3OrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jComboBoxTiposRelacionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
				
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jComboBoxTiposAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
	
				
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenDetaProdu.add(this.jTextFieldValorCampoGeneralOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosOrdenDetaProdu = new GridBagLayout();

			this.jScrollPanelDatosOrdenDetaProdu.setLayout(gridaBagLayoutDatosOrdenDetaProdu);
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
			
			this.jScrollPanelDatosOrdenDetaProdu.add(this.jTableDatosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosOrdenDetaProdu.setViewportView(this.jTableDatosOrdenDetaProdu);
		this.jTableDatosOrdenDetaProdu.setFillsViewportHeight(true);
		this.jTableDatosOrdenDetaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesOrdenDetaProdu.setLayout(gridaBagLayoutAccionesOrdenDetaProdu);
		
		
		/*	
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
			
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonNuevoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdBodegaOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdBodegaOrdenDetaProdu.add(jLabelid_bodegaFK_IdBodegaOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdBodegaOrdenDetaProdu.add(jComboBoxid_bodegaFK_IdBodegaOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdBodegaOrdenDetaProdu.add(jButtonFK_IdBodegaOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("1.-Por Bodega ", jPanelFK_IdBodegaOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDestinoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdBodegaDestinoOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdBodegaDestinoOrdenDetaProdu.add(jLabelid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdBodegaDestinoOrdenDetaProdu.add(jComboBoxid_bodega_destinoFK_IdBodegaDestinoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdBodegaDestinoOrdenDetaProdu.add(jButtonFK_IdBodegaDestinoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("2.-Por Bodega Destino ", jPanelFK_IdBodegaDestinoOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenProduOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdOrdenProduOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdOrdenProduOrdenDetaProdu.add(jLabelid_orden_produFK_IdOrdenProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdOrdenProduOrdenDetaProdu.add(jComboBoxid_orden_produFK_IdOrdenProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdOrdenProduOrdenDetaProdu.add(jButtonFK_IdOrdenProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("3.-Por Orden Produ ", jPanelFK_IdOrdenProduOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdProductoOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdProductoOrdenDetaProdu.add(jLabelid_productoFK_IdProductoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdProductoOrdenDetaProdu.add(jComboBoxid_productoFK_IdProductoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);


		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdProductoOrdenDetaProdu.add(this.jButtonBuscarFK_IdProductoid_productoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdProductoOrdenDetaProdu.add(jButtonFK_IdProductoOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("4.-Por Producto ", jPanelFK_IdProductoOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoProduOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdTipoProcesoProduOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdTipoProcesoProduOrdenDetaProdu.add(jLabelid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdTipoProcesoProduOrdenDetaProdu.add(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdTipoProcesoProduOrdenDetaProdu.add(jButtonFK_IdTipoProcesoProduOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("5.-Por Tipo Proceso Produ ", jPanelFK_IdTipoProcesoProduOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadUnadOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdUnidadUnadOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 0;
		jPanelFK_IdUnidadUnadOrdenDetaProdu.add(jLabelid_unidadFK_IdUnidadUnadOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 0;
		gridBagConstraintsOrdenDetaProdu.gridx = 1;
		jPanelFK_IdUnidadUnadOrdenDetaProdu.add(jComboBoxid_unidadFK_IdUnidadUnadOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenDetaProdu.gridy = 1;
		gridBagConstraintsOrdenDetaProdu.gridx =1;
		jPanelFK_IdUnidadUnadOrdenDetaProdu.add(jButtonFK_IdUnidadUnadOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);

		jTabbedPaneBusquedasOrdenDetaProdu.addTab("6.-Por Unad ", jPanelFK_IdUnidadUnadOrdenDetaProdu);
		jTabbedPaneBusquedasOrdenDetaProdu.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenDetaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;		
			//this.gridBagConstraintsOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenDetaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;		
		//this.gridBagConstraintsOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsOrdenDetaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;		
			this.gridBagConstraintsOrdenDetaProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsOrdenDetaProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);								
		
		
		/*
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		*/		
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenDetaProdu.gridx =0;
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
				
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(OrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenDetaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosOrdenDetaProdu.setLayout(gridaBagLayoutBusquedasParametrosOrdenDetaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralOrdenDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralOrdenDetaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoOrdenDetaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoOrdenDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoOrdenDetaProdu.setName("jPanelReporteDinamicoOrdenDetaProdu"); 
		
		this.jPanelReporteDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoOrdenDetaProdu.setLayout(gridaBagLayoutReporteDinamicoOrdenDetaProdu);
		
		
		this.jInternalFrameReporteDinamicoOrdenDetaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoOrdenDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoOrdenDetaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoOrdenDetaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteOrdenDetaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteOrdenDetaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jLabelColumnasSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteOrdenDetaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteOrdenDetaProdu=new JScrollPane(this.jListColumnasSelectReporteOrdenDetaProdu);
			
			this.jScrollColumnasSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jListColumnasSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jScrollColumnasSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteOrdenDetaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteOrdenDetaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jLabelRelacionesSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteOrdenDetaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteOrdenDetaProdu=new JScrollPane(this.jListRelacionesSelectReporteOrdenDetaProdu);
			
			this.jScrollRelacionesSelectReporteOrdenDetaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenDetaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenDetaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jListRelacionesSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jScrollRelacionesSelectReporteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoOrdenDetaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoOrdenDetaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoOrdenDetaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoOrdenDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoOrdenDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jLabelGenerarExcelReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoOrdenDetaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoOrdenDetaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoOrdenDetaProdu.setToolTipText("Generar EXCEL"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jButtonGenerarExcelReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jComboBoxTiposReportesDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jLabelTiposArchivoReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoOrdenDetaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoOrdenDetaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoOrdenDetaProdu.setToolTipText("Generar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jButtonGenerarReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoOrdenDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoOrdenDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoOrdenDetaProdu.setToolTipText("Cancelar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenDetaProdu.add(this.jButtonCerrarReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalOrdenDetaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoOrdenDetaProdu= new JScrollPane(jPanelReporteDinamicoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalOrdenDetaProdu);
		this.jInternalFrameReporteDinamicoOrdenDetaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionOrdenDetaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionOrdenDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionOrdenDetaProdu.setName("jPanelImportacionOrdenDetaProdu"); 
		
		this.jPanelImportacionOrdenDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionOrdenDetaProdu.setLayout(gridaBagLayoutImportacionOrdenDetaProdu);
		
		
		this.jInternalFrameImportacionOrdenDetaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionOrdenDetaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionOrdenDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionOrdenDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionOrdenDetaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenDetaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionOrdenDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionOrdenDetaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionOrdenDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionOrdenDetaProdu = new JLabelMe();

		this.jLabelArchivoImportacionOrdenDetaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenDetaProdu.add(this.jLabelArchivoImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionOrdenDetaProdu = new JFileChooser();		
		this.jFileChooserImportacionOrdenDetaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionOrdenDetaProdu = new JButtonMe();
		this.jButtonAbrirImportacionOrdenDetaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionOrdenDetaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionOrdenDetaProdu.setToolTipText("Generar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenDetaProdu.add(this.jButtonAbrirImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionOrdenDetaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionOrdenDetaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenDetaProdu.add(this.jLabelPathArchivoImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionOrdenDetaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionOrdenDetaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenDetaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenDetaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenDetaProdu.add(this.jTextFieldPathArchivoImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarImportacionOrdenDetaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionOrdenDetaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionOrdenDetaProdu.setToolTipText("Generar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenDetaProdu.add(this.jButtonGenerarImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarImportacionOrdenDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionOrdenDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionOrdenDetaProdu.setToolTipText("Cancelar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenDetaProdu.add(this.jButtonCerrarImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalOrdenDetaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionOrdenDetaProdu= new JScrollPane(jPanelImportacionOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalOrdenDetaProdu);
		this.jInternalFrameImportacionOrdenDetaProdu.getContentPane().add(this.jScrollPanelImportacionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByOrdenDetaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByOrdenDetaProdu = new JButtonMe();
			this.jButtonAbrirOrderByOrdenDetaProdu.setText("Orden");
			this.jButtonAbrirOrderByOrdenDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenDetaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByOrdenDetaProdu";
			inputMap = this.jButtonAbrirOrderByOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByOrdenDetaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByOrdenDetaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByOrdenDetaProdu.setName("jPanelOrderByOrdenDetaProdu"); 
			
			this.jPanelOrderByOrdenDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByOrdenDetaProdu.setLayout(gridaBagLayoutOrderByOrdenDetaProdu);
			
			
			this.jTableDatosOrdenDetaProduOrderBy = new JTableMe();        
			this.jTableDatosOrdenDetaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosOrdenDetaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosOrdenDetaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOrdenDetaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOrdenDetaProduOrderBy.setViewportView(this.jTableDatosOrdenDetaProduOrderBy);
			this.jTableDatosOrdenDetaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosOrdenDetaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByOrdenDetaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByOrdenDetaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByOrdenDetaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteOrdenDetaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByOrdenDetaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByOrdenDetaProdu.setTitle("Orden");
			this.jInternalFrameOrderByOrdenDetaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByOrdenDetaProdu.setResizable(true);
			this.jInternalFrameOrderByOrdenDetaProdu.setClosable(true);
			this.jInternalFrameOrderByOrdenDetaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByOrdenDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsOrdenDetaProdu.ipady =150;
				
			this.jPanelOrderByOrdenDetaProdu.add(jScrollPanelDatosOrdenDetaProduOrderBy, this.gridBagConstraintsOrdenDetaProdu);//this.jTableDatosOrdenDetaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByOrdenDetaProdu = new JButtonMe();
			this.jButtonCerrarOrderByOrdenDetaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByOrdenDetaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByOrdenDetaProdu.setToolTipText("Cancelar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByOrdenDetaProdu.add(this.jButtonCerrarOrderByOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalOrdenDetaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByOrdenDetaProdu= new JScrollPane(jPanelOrderByOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalOrdenDetaProdu);
			
			this.jInternalFrameOrderByOrdenDetaProdu.getContentPane().add(this.jScrollPanelOrderByOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
		
		} else {
			this.jButtonAbrirOrderByOrdenDetaProdu = new JButtonMe();
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
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ordendetaproduSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosOrdenDetaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosOrdenDetaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosOrdenDetaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosOrdenDetaProdu.getRowHeight();//OrdenDetaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.isSelected()) {
					iHeightTable=OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenDetaProdu.isSelected()) {
					iHeightTable=OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByOrdenDetaProdu!=null && this.jInternalFrameOrderByOrdenDetaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByOrdenDetaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByOrdenDetaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByOrdenDetaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByOrdenDetaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByOrdenDetaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByOrdenDetaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByOrdenDetaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ordendetaproduLogic.getOrdenDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ordendetaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<OrdenDetaProdu> TraerOrdenDetaProduBeans(List<OrdenDetaProdu> ordendetaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(OrdenDetaProdu ordendetaprodu:ordendetaprodus) {
					
				if(!(OrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || OrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ordendetaprodu.setsDetalleGeneralEntityReporte(OrdenDetaProduConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaprodu));
										
						
					
					

					if(ordendetaprodu.getProductoOrdenDetaProduGastos()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduGasto.class)) {
						try{ordendetaprodu.setproductoordendetaprodugastosDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduGastoJInternalFrame.TraerProductoOrdenDetaProduGastoBeans(ordendetaprodu.getProductoOrdenDetaProduGastos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ordendetaprodu.getProductoOrdenDetaProduManos()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMano.class)) {
						try{ordendetaprodu.setproductoordendetaprodumanosDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduManoJInternalFrame.TraerProductoOrdenDetaProduManoBeans(ordendetaprodu.getProductoOrdenDetaProduManos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ordendetaprodu.getProductoOrdenDetaProdus()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProdu.class)) {
						try{ordendetaprodu.setproductoordendetaprodusDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduJInternalFrame.TraerProductoOrdenDetaProduBeans(ordendetaprodu.getProductoOrdenDetaProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ordendetaprodu.getProductoOrdenDetaProduMaquinas()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMaquina.class)) {
						try{ordendetaprodu.setproductoordendetaprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduMaquinaJInternalFrame.TraerProductoOrdenDetaProduMaquinaBeans(ordendetaprodu.getProductoOrdenDetaProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ordendetaprodu.getProductoOrdenDetaProduMermas()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMerma.class)) {
						try{ordendetaprodu.setproductoordendetaprodumermasDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduMermaJInternalFrame.TraerProductoOrdenDetaProduMermaBeans(ordendetaprodu.getProductoOrdenDetaProduMermas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//ordendetaprodu.setsDetalleGeneralEntityReporte(ordendetaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//ordendetaprodubeans.add(ordendetaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ordendetaprodus;
    }
	//PARA REPORTES FIN
}
