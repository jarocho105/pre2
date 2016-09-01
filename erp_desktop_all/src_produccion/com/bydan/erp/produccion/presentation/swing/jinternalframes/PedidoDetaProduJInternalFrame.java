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
import com.bydan.erp.produccion.util.PedidoDetaProduConstantesFunciones;

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
public class PedidoDetaProduJInternalFrame extends PedidoDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoDetaProdu;
	
	protected JMenuBar jmenuBarPedidoDetaProdu;
	
	protected JMenu jmenuPedidoDetaProdu;
	protected JMenu jmenuDatosPedidoDetaProdu;
	protected JMenu jmenuArchivoPedidoDetaProdu;
	protected JMenu jmenuAccionesPedidoDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoDetaProdu;	
	protected GridBagConstraints gridBagConstraintsPedidoDetaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoDetaProduDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoDetaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoDetaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoDetaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidoprodu="";

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
	
	public PedidoDetaProduSessionBean pedidodetaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PedidoProduSessionBean pedidoproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoDetaProdu> pedidodetaprodus;		
	public List<PedidoDetaProdu> pedidodetaprodusEliminados;	
	public List<PedidoDetaProdu> pedidodetaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoDetaProdu;		
	protected JButton jButtonAbrirOrderByPedidoDetaProdu;
	
	
	//protected JPanel jPanelOrderByPedidoDetaProdu;
	//public JScrollPane jScrollPanelOrderByPedidoDetaProdu;	
	//protected JButton jButtonCerrarOrderByPedidoDetaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoDetaProduLogic pedidodetaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionPedidoDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralPedidoDetaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoDetaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoDetaProdu;
	//public JScrollPane jScrollPanelImportacionPedidoDetaProdu;
	
	
	
	protected JPanel jPanelAccionesPedidoDetaProdu;
	
    protected JPanel jPanelPaginacionPedidoDetaProdu;
    protected JPanel jPanelParametrosReportesPedidoDetaProdu;
	protected JPanel jPanelParametrosReportesAccionesPedidoDetaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoDetaProdu;
	protected JPanel jPanelParametrosAuxiliar2PedidoDetaProdu;
	protected JPanel jPanelParametrosAuxiliar3PedidoDetaProdu;
	protected JPanel jPanelParametrosAuxiliar4PedidoDetaProdu;
	//protected JPanel jPanelParametrosAuxiliar5PedidoDetaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoDetaProdu;
	//protected JPanel jPanelImportacionPedidoDetaProdu;
	
	
	public JTable jTableDatosPedidoDetaProdu;
	
	
	
	//public JTable jTableDatosPedidoDetaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoDetaProdu;
	protected JButton jButtonDuplicarPedidoDetaProdu;
	protected JButton jButtonCopiarPedidoDetaProdu;
	protected JButton jButtonVerFormPedidoDetaProdu;
	protected JButton jButtonNuevoRelacionesPedidoDetaProdu;
	protected JButton jButtonModificarPedidoDetaProdu;
	
    protected JButton jButtonGuardarCambiosTablaPedidoDetaProdu;
	protected JButton jButtonCerrarPedidoDetaProdu;
	
	
	protected JButton jButtonRecargarInformacionPedidoDetaProdu;
	protected JButton jButtonProcesarInformacionPedidoDetaProdu;
	
	
	protected JButton jButtonAnterioresPedidoDetaProdu;
	protected JButton jButtonSiguientesPedidoDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosPedidoDetaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoDetaProdu;
	//protected JButton jButtonCerrarReporteDinamicoPedidoDetaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoDetaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoDetaProdu;
	//protected JButton jButtonGenerarImportacionPedidoDetaProdu;
	//protected JButton jButtonCerrarImportacionPedidoDetaProdu;
	//protected JFileChooser jFileChooserImportacionPedidoDetaProdu;
	//protected File fileImportacionPedidoDetaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoDetaProdu;
	protected JButton jButtonDuplicarToolBarPedidoDetaProdu;
	protected JButton jButtonNuevoRelacionesToolBarPedidoDetaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoDetaProdu;
	protected JButton jButtonCopiarToolBarPedidoDetaProdu;
	protected JButton jButtonVerFormToolBarPedidoDetaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoDetaProdu;
	protected JButton jButtonCerrarToolBarPedidoDetaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoDetaProdu;
	protected JButton jButtonProcesarInformacionToolBarPedidoDetaProdu;
	protected JButton jButtonAnterioresToolBarPedidoDetaProdu;
	protected JButton jButtonSiguientesToolBarPedidoDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu;
	protected JButton jButtonAbrirOrderByToolBarPedidoDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoDetaProdu;
	protected JMenuItem jMenuItemDuplicarPedidoDetaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoDetaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoDetaProdu;
	protected JMenuItem jMenuItemCopiarPedidoDetaProdu;
	protected JMenuItem jMenuItemVerFormPedidoDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoDetaProdu;
	protected JMenuItem jMenuItemCerrarPedidoDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarPedidoDetaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoDetaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoDetaProdu;
	protected JMenuItem jMenuItemProcesarInformacionPedidoDetaProdu;
	protected JMenuItem jMenuItemAnterioresPedidoDetaProdu;
	protected JMenuItem jMenuItemSiguientesPedidoDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoDetaProdu;
	protected JMenuItem jMenuItemAbrirOrderByPedidoDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarPedidoDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoDetaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoDetaProdu;
	protected JCheckBox jCheckBoxSeleccionadosPedidoDetaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoDetaProdu;
	protected JCheckBox jCheckBoxConGraficoReportePedidoDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoDetaProdu;
	protected JTextField jTextFieldValorCampoGeneralPedidoDetaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoDetaProdu;
	//public JList<Reporte> jListColumnasSelectReportePedidoDetaProdu;
	//public JScrollPane jScrollColumnasSelectReportePedidoDetaProdu;
	
	//public JLabel jLabelRelacionesSelectReportePedidoDetaProdu;
	//public JList<Reporte> jListRelacionesSelectReportePedidoDetaProdu;
	//public JScrollPane jScrollRelacionesSelectReportePedidoDetaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoDetaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoDetaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoDetaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoDetaProdu;
	
		
	//public JLabel jLabelArchivoImportacionPedidoDetaProdu;	
	//public JLabel jLabelPathArchivoImportacionPedidoDetaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoDetaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoDetaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoDetaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoDetaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoDetaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoDetaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoDetaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoDetaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoDetaProdu;
	public JPanel jPanelFK_IdBodegaPedidoDetaProdu;
	public JButton jButtonFK_IdBodegaPedidoDetaProdu;
	public JPanel jPanelFK_IdBodegaDestinoPedidoDetaProdu;
	public JButton jButtonFK_IdBodegaDestinoPedidoDetaProdu;
	public JPanel jPanelFK_IdPedidoProduPedidoDetaProdu;
	public JButton jButtonFK_IdPedidoProduPedidoDetaProdu;
	public JPanel jPanelFK_IdProductoPedidoDetaProdu;
	public JButton jButtonFK_IdProductoPedidoDetaProdu;
	public JPanel jPanelFK_IdTipoProcesoProduPedidoDetaProdu;
	public JButton jButtonFK_IdTipoProcesoProduPedidoDetaProdu;
	public JPanel jPanelFK_IdUnidadPedidoDetaProdu;
	public JButton jButtonFK_IdUnidadPedidoDetaProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaPedidoDetaProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu;
	public JButton jButtonid_bodegaFK_IdBodegaPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPedidoDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu;
	public JLabel jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu;
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_produFK_IdPedidoProduPedidoDetaProdu;
	public JLabel jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu;
	public JButton jButtonid_pedido_produFK_IdPedidoProduPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_pedido_produFK_IdPedidoProduPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_pedido_produFK_IdPedidoProduPedidoDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPedidoDetaProdu;
	public JLabel jLabelid_productoFK_IdProductoPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPedidoDetaProdu;
	public JButton jButtonid_productoFK_IdProductoPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPedidoDetaProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu;
	
	public JPanel jPanelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu;
	public JLabel jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu;
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadPedidoDetaProdu;
	public JLabel jLabelid_unidadFK_IdUnidadPedidoDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu;
	public JButton jButtonid_unidadFK_IdUnidadPedidoDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadPedidoDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadPedidoDetaProduBusqueda= new JButtonMe();

	
	
	
	
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
	public PedidoDetaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoDetaProdu)	{
		this.jButtonRecargarInformacionPedidoDetaProdu = jButtonRecargarInformacionPedidoDetaProdu;
	}
	
	public JButton getjButtonProcesarInformacionPedidoDetaProdu() {
		return this.jButtonProcesarInformacionPedidoDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoDetaProdu)	{
		this.jButtonProcesarInformacionPedidoDetaProdu = jButtonProcesarInformacionPedidoDetaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoDetaProdu() {
		return this.jButtonRecargarInformacionPedidoDetaProdu;
	}
	
	
	public List<PedidoDetaProdu> getpedidodetaprodus() {
		return this.pedidodetaprodus;
	}

	public void setpedidodetaprodus(List<PedidoDetaProdu> pedidodetaprodus) {
		this.pedidodetaprodus = pedidodetaprodus;
	}
	
	public List<PedidoDetaProdu> getpedidodetaprodusAux() {
		return this.pedidodetaprodusAux;
	}

	public void setpedidodetaprodusAux(List<PedidoDetaProdu> pedidodetaprodusAux) {
		this.pedidodetaprodusAux = pedidodetaprodusAux;
	}
	
	public List<PedidoDetaProdu> getpedidodetaprodusEliminados() {
		return this.pedidodetaprodusEliminados;
	}

	public void setPedidoDetaProdusEliminados(List<PedidoDetaProdu> pedidodetaprodusEliminados) {
		this.pedidodetaprodusEliminados = pedidodetaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoDetaProdu() {
		return jComboBoxTiposSeleccionarPedidoDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoDetaProdu(
			JComboBox jComboBoxTiposSeleccionarPedidoDetaProdu) {
		this.jComboBoxTiposSeleccionarPedidoDetaProdu = jComboBoxTiposSeleccionarPedidoDetaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoDetaProdu() {
		return jTextFieldValorCampoGeneralPedidoDetaProdu;
	}

	public void setjTextFieldValorCampoGeneralPedidoDetaProdu(
			JTextField jTextFieldValorCampoGeneralPedidoDetaProdu) {
		this.jTextFieldValorCampoGeneralPedidoDetaProdu = jTextFieldValorCampoGeneralPedidoDetaProdu;
	}

	public void setBorderResaltarValorCampoGeneralPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoDetaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoDetaProdu() {
		return this.jCheckBoxSeleccionarTodosPedidoDetaProdu;
	}

	public void setjCheckBoxSeleccionarTodosPedidoDetaProdu(
			JCheckBox jCheckBoxSeleccionarTodosPedidoDetaProdu) {
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu = jCheckBoxSeleccionarTodosPedidoDetaProdu;
	}

	public void setBorderResaltarSeleccionarTodosPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoDetaProdu() {
		return this.jCheckBoxSeleccionadosPedidoDetaProdu;
	}

	public void setjCheckBoxSeleccionadosPedidoDetaProdu(
			JCheckBox jCheckBoxSeleccionadosPedidoDetaProdu) {
		this.jCheckBoxSeleccionadosPedidoDetaProdu = jCheckBoxSeleccionadosPedidoDetaProdu;
	}
	
	public void setBorderResaltarSeleccionadosPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoDetaProdu() {
		return this.jComboBoxTiposArchivosReportesPedidoDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoDetaProdu(
			JComboBox jComboBoxTiposArchivosReportesPedidoDetaProdu) {
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu = jComboBoxTiposArchivosReportesPedidoDetaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoDetaProdu() {
		return this.jComboBoxTiposReportesPedidoDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoDetaProdu(
			JComboBox jComboBoxTiposReportesPedidoDetaProdu) {
		this.jComboBoxTiposReportesPedidoDetaProdu = jComboBoxTiposReportesPedidoDetaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoDetaProdu() {
	//	return jComboBoxTiposReportesDinamicoPedidoDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoDetaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoDetaProdu) {
	//	this.jComboBoxTiposReportesDinamicoPedidoDetaProdu = jComboBoxTiposReportesDinamicoPedidoDetaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu = jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu;
	//}
	
	public void setBorderResaltarTiposReportesPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoDetaProdu() {
		return this.jComboBoxTiposGraficosReportesPedidoDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoDetaProdu(
			JComboBox jComboBoxTiposGraficosReportesPedidoDetaProdu) {
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu = jComboBoxTiposGraficosReportesPedidoDetaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoDetaProdu() {
		return this.jComboBoxTiposPaginacionPedidoDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoDetaProdu(
			JComboBox jComboBoxTiposPaginacionPedidoDetaProdu) {
		this.jComboBoxTiposPaginacionPedidoDetaProdu = jComboBoxTiposPaginacionPedidoDetaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoDetaProdu() {
		return this.jComboBoxTiposRelacionesPedidoDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoDetaProdu() {
		return this.jComboBoxTiposAccionesPedidoDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoDetaProdu(
			JComboBox jComboBoxTiposRelacionesPedidoDetaProdu) {
		this.jComboBoxTiposRelacionesPedidoDetaProdu = jComboBoxTiposRelacionesPedidoDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoDetaProdu(
			JComboBox jComboBoxTiposAccionesPedidoDetaProdu) {
		this.jComboBoxTiposAccionesPedidoDetaProdu = jComboBoxTiposAccionesPedidoDetaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoDetaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoDetaProdu() {
	//	return jCheckBoxConGraficoDinamicoPedidoDetaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoDetaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoDetaProdu) {
	//	this.jCheckBoxConGraficoDinamicoPedidoDetaProdu = jCheckBoxConGraficoDinamicoPedidoDetaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoDetaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoDetaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoDetaProdu .setBorder(borderResaltar);		
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
		this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		
		this.pedidodetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidodetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidodetaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Detalle Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoDetaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"nuevo","nuevo","Nuevo"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"duplicar","duplicar","Duplicar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"copiar","copiar","Copiar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"ver_form","ver_form","Ver"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"recargar","recargar","Recargar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,
							"cerrar","cerrar","Salir"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoDetaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoDetaProdu;
			
				this.jButtonProcesarInformacionToolBarPedidoDetaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoDetaProdu;
				
		//protected JButton jButtonModificarToolBarPedidoDetaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoDetaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoDetaProdu=new JMenuMe("General");
		this.jmenuArchivoPedidoDetaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoDetaProdu=new JMenuMe("Acciones");
		this.jmenuDatosPedidoDetaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoDetaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoDetaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoDetaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoDetaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoDetaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoDetaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoDetaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoDetaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoDetaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoDetaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoDetaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoDetaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoDetaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoDetaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoDetaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoDetaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoDetaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoDetaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoDetaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoDetaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoDetaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoDetaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoDetaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoDetaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoDetaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoDetaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoDetaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoDetaProdu.add(this.jMenuItemCerrarPedidoDetaProdu);
			
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemNuevoPedidoDetaProdu);
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu);
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemNuevoRelacionesPedidoDetaProdu);
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemGuardarCambiosTablaPedidoDetaProdu);		
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemDuplicarPedidoDetaProdu);		
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemCopiarPedidoDetaProdu);		
			this.jmenuAccionesPedidoDetaProdu.add(this.jMenuItemVerFormPedidoDetaProdu);		
			
			this.jmenuDatosPedidoDetaProdu.add(this.jMenuItemRecargarInformacionPedidoDetaProdu);				
			this.jmenuDatosPedidoDetaProdu.add(this.jMenuItemAnterioresPedidoDetaProdu);				
			this.jmenuDatosPedidoDetaProdu.add(this.jMenuItemSiguientesPedidoDetaProdu);				
			this.jmenuDatosPedidoDetaProdu.add(this.jMenuItemAbrirOrderByPedidoDetaProdu);				
			this.jmenuDatosPedidoDetaProdu.add(this.jMenuItemMostrarOcultarPedidoDetaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoDetaProdu.add(this.jMenuItemGuardarCambiosPedidoDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoDetaProdu.add(this.jmenuArchivoPedidoDetaProdu);		
			this.jmenuBarPedidoDetaProdu.add(this.jmenuAccionesPedidoDetaProdu);		
			this.jmenuBarPedidoDetaProdu.add(this.jmenuDatosPedidoDetaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoDetaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoDetaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaPedidoDetaProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdBodegaPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdBodegaPedidoDetaProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaPedidoDetaProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaDestinoPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDestinoPedidoDetaProdu.setToolTipText("Buscar Por Bodega Destino ");
		this.jButtonFK_IdBodegaDestinoPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdBodegaDestinoPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdBodegaDestinoPedidoDetaProdu.setToolTipText("Buscar Por Bodega Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDestinoPedidoDetaProdu,"buscar_button","Buscar Por Bodega Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDestinoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu = new JLabelMe();
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setText("Bodega Destino :");
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setToolTipText("Bodega Destino");
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPedidoProduPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoProduPedidoDetaProdu.setToolTipText("Buscar Por Pedido Produ ");
		this.jButtonFK_IdPedidoProduPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdPedidoProduPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdPedidoProduPedidoDetaProdu.setToolTipText("Buscar Por Pedido Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoProduPedidoDetaProdu,"buscar_button","Buscar Por Pedido Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoProduPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu = new JLabelMe();
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setText("Pedido Produ :");
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setToolTipText("Pedido Produ");
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPedidoDetaProdu.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdProductoPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdProductoPedidoDetaProdu.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPedidoDetaProdu,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPedidoDetaProdu = new JLabelMe();
		jLabelid_productoFK_IdProductoPedidoDetaProdu.setText("Producto :");
		jLabelid_productoFK_IdProductoPedidoDetaProdu.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.setFocusable(false);

		this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu.setToolTipText("Buscar Por Tipo Proceso Produ ");
		this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu.setToolTipText("Buscar Por Tipo Proceso Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu,"buscar_button","Buscar Por Tipo Proceso Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu = new JLabelMe();
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setText("Tipo Proceso Produ :");
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setToolTipText("Tipo Proceso Produ");
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadPedidoDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadPedidoDetaProdu.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadPedidoDetaProdu= new JButtonMe();
		this.jButtonFK_IdUnidadPedidoDetaProdu.setText("Buscar");
		this.jButtonFK_IdUnidadPedidoDetaProdu.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadPedidoDetaProdu,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu = new JLabelMe();
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu.setText("Unad :");
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedidoDetaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoDetaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoDetaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoDetaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidoDetaProdu = new PedidoDetaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Detalle Produccion DATOS");
			this.jInternalFrameDetalleFormPedidoDetaProdu = new PedidoDetaProduDetalleFormJInternalFrame(jDesktopPane,this.pedidodetaproduSessionBean.getConGuardarRelaciones(),this.pedidodetaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoDetaProdu = null;//new PedidoDetaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoDetaProdu= new GridBagLayout();
		
		
		this.jTableDatosPedidoDetaProdu = new JTableMe();      
		
		String sToolTipPedidoDetaProdu="";
		sToolTipPedidoDetaProdu=PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoDetaProdu+="(Produccion.PedidoDetaProdu)";
		}
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoDetaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoDetaProdu.setToolTipText(sToolTipPedidoDetaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoDetaProdu);
		this.jTableDatosPedidoDetaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoDetaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoDetaProdu.setRowSelectionAllowed(true);
		this.jTableDatosPedidoDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoDetaProdu = new JButtonMe();
		this.jButtonDuplicarPedidoDetaProdu = new JButtonMe();
		this.jButtonCopiarPedidoDetaProdu = new JButtonMe();
		this.jButtonVerFormPedidoDetaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoDetaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu = new JButtonMe();
		this.jButtonCerrarPedidoDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosPedidoDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoDetaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Detalle Produccion";
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesPedidoDetaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidoDetaProdu=new ReporteDinamicoJInternalFrame(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoDetaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoDetaProdu=new ImportacionJInternalFrame(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoDetaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoDetaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoDetaProdu.setText("Orden");
		this.jButtonAbrirOrderByPedidoDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoDetaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoDetaProdu,false,this);
			
			//this.cargarOrderByPedidoDetaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoDetaProdu,true,this);
			
			//this.cargarOrderByPedidoDetaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoDetaProdu.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosPedidoDetaProdu.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosPedidoDetaProdu.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosPedidoDetaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoDetaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoDetaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoDetaProdu.setText("Nuevo");
		this.jButtonDuplicarPedidoDetaProdu.setText("Duplicar");
		this.jButtonCopiarPedidoDetaProdu.setText("Copiar");
		this.jButtonVerFormPedidoDetaProdu.setText("Ver");
		this.jButtonNuevoRelacionesPedidoDetaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.setText("Guardar");
		this.jButtonCerrarPedidoDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoDetaProdu,"nuevo_button","Nuevo",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoDetaProdu,"duplicar_button","Duplicar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoDetaProdu,"copiar_button","Copiar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoDetaProdu,"ver_form","Ver",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoDetaProdu,"nuevorelaciones_button","Nuevo Rel",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoDetaProdu,"guardarcambiostabla_button","Guardar",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoDetaProdu,"cerrar_button","Salir",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoDetaProdu.setToolTipText("Nuevo"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoDetaProdu.setToolTipText("Duplicar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoDetaProdu.setToolTipText("Copiar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoDetaProdu.setToolTipText("Ver"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoDetaProdu.setToolTipText("Nuevo Rel"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.setToolTipText("Guardar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoDetaProdu.setToolTipText("Salir"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoDetaProdu";
		inputMap = this.jButtonNuevoPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoDetaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoDetaProdu";
		inputMap = this.jButtonDuplicarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoDetaProdu"));
		
		//COPIAR
		sMapKey = "CopiarPedidoDetaProdu";
		inputMap = this.jButtonCopiarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoDetaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoDetaProdu";
		inputMap = this.jButtonVerFormPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoDetaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoDetaProdu";
		inputMap = this.jButtonNuevoRelacionesPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoDetaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoDetaProdu";
		inputMap = this.jButtonModificarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoDetaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoDetaProdu";
		inputMap = this.jButtonCerrarPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoDetaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoDetaProdu.setName("jPanelParametrosReportesPedidoDetaProdu"); 
		
		this.jPanelParametrosReportesAccionesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoDetaProdu.setName("jPanelParametrosReportesAccionesPedidoDetaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoDetaProdu = new JButtonMe();
		this.jButtonRecargarInformacionPedidoDetaProdu.setText("Recargar");
		this.jButtonRecargarInformacionPedidoDetaProdu.setToolTipText("Recargar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoDetaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoDetaProdu = new JButtonMe();
		this.jButtonProcesarInformacionPedidoDetaProdu.setText("Procesar");
		this.jButtonProcesarInformacionPedidoDetaProdu.setToolTipText("Procesar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoDetaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoDetaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoDetaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoDetaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoDetaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoDetaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoDetaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoDetaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoDetaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesPedidoDetaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoDetaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoDetaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoDetaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoDetaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoDetaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoDetaProdu = new JLabelMe();
		
		this.jLabelAccionesPedidoDetaProdu.setText("Acciones");		
		this.jLabelAccionesPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoDetaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoDetaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoDetaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoDetaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoDetaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoDetaProdu = new JButtonMe();
		//this.jButtonAnterioresPedidoDetaProdu.setText("<<");
        this.jButtonAnterioresPedidoDetaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoDetaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoDetaProdu = new JButtonMe();
		//this.jButtonSiguientesPedidoDetaProdu.setText(">>");
        this.jButtonSiguientesPedidoDetaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoDetaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoDetaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoDetaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoDetaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoDetaProdu,"nuevoguardarcambios_button","Nue",this.pedidodetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoDetaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoDetaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoDetaProdu";
		inputMap = this.jButtonRecargarInformacionPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoDetaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoDetaProdu";
		inputMap = this.jButtonSiguientesPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoDetaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoDetaProdu";
		inputMap = this.jButtonAnterioresPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoDetaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoDetaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoDetaProdu.setMinimumSize(new Dimension(this.getWidth(),PedidoDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoDetaProdu.setMaximumSize(new Dimension(this.getWidth(),PedidoDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoDetaProdu.setPreferredSize(new Dimension(this.getWidth(),PedidoDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoDetaProdu = new GridBagLayout();

			this.jPanelPaginacionPedidoDetaProdu.setLayout(gridaBagLayoutPaginacionPedidoDetaProdu);						
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonAnterioresPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					
						
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
			
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonNuevoGuardarCambiosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
						
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonSiguientesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonNuevoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
						
			
			
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
				this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonGuardarCambiosTablaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			}
			
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonDuplicarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonCopiarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonVerFormPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 1;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoDetaProdu.add(this.jButtonCerrarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
		
		
		this.jButtonRecargarInformacionPedidoDetaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoDetaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoDetaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoDetaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoDetaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoDetaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoDetaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoDetaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoDetaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoDetaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoDetaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoDetaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoDetaProdu.setLayout(gridaBagParametrosReportesPedidoDetaProdu);
			this.jPanelParametrosReportesAccionesPedidoDetaProdu.setLayout(gridaBagParametrosReportesAccionesPedidoDetaProdu);
			
			
			this.jPanelParametrosAuxiliar1PedidoDetaProdu.setLayout(gridaBagParametrosAuxiliar1PedidoDetaProdu);
			this.jPanelParametrosAuxiliar2PedidoDetaProdu.setLayout(gridaBagParametrosAuxiliar2PedidoDetaProdu);
			this.jPanelParametrosAuxiliar3PedidoDetaProdu.setLayout(gridaBagParametrosAuxiliar3PedidoDetaProdu);
			this.jPanelParametrosAuxiliar4PedidoDetaProdu.setLayout(gridaBagParametrosAuxiliar4PedidoDetaProdu);
			//this.jPanelParametrosAuxiliar5PedidoDetaProdu.setLayout(gridaBagParametrosAuxiliar2PedidoDetaProdu);			
			
			
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jButtonRecargarInformacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoDetaProdu.add(this.jComboBoxTiposPaginacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoDetaProdu.add(this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoDetaProdu.add(this.jComboBoxTiposArchivosReportesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jPanelParametrosAuxiliar1PedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoDetaProdu.add(this.jComboBoxTiposReportesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jPanelParametrosAuxiliar4PedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jComboBoxTiposReportesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jCheckBoxGenerarReportePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jPanelParametrosAuxiliar2PedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jLabelAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoDetaProdu.add(this.jButtonAbrirOrderByPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jComboBoxTiposSeleccionarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			
			
			/*
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jCheckBoxSeleccionarTodosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoDetaProdu.add(this.jCheckBoxSeleccionarTodosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);															
				
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoDetaProdu.add(this.jCheckBoxSeleccionadosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jPanelParametrosAuxiliar3PedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jComboBoxTiposAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
	
				
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoDetaProdu.add(this.jTextFieldValorCampoGeneralPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoDetaProdu = new GridBagLayout();

			this.jScrollPanelDatosPedidoDetaProdu.setLayout(gridaBagLayoutDatosPedidoDetaProdu);
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
			
			this.jScrollPanelDatosPedidoDetaProdu.add(this.jTableDatosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoDetaProdu.setViewportView(this.jTableDatosPedidoDetaProdu);
		this.jTableDatosPedidoDetaProdu.setFillsViewportHeight(true);
		this.jTableDatosPedidoDetaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoDetaProdu= new GridBagLayout();
		this.jPanelAccionesPedidoDetaProdu.setLayout(gridaBagLayoutAccionesPedidoDetaProdu);
		
		
		/*	
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = 0;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
			
		this.jPanelAccionesPedidoDetaProdu.add(this.jButtonNuevoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdBodegaPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdBodegaPedidoDetaProdu.add(jLabelid_bodegaFK_IdBodegaPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdBodegaPedidoDetaProdu.add(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdBodegaPedidoDetaProdu.add(jButtonFK_IdBodegaPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("1.-Por Bodega ", jPanelFK_IdBodegaPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDestinoPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdBodegaDestinoPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdBodegaDestinoPedidoDetaProdu.add(jLabelid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdBodegaDestinoPedidoDetaProdu.add(jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdBodegaDestinoPedidoDetaProdu.add(jButtonFK_IdBodegaDestinoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("2.-Por Bodega Destino ", jPanelFK_IdBodegaDestinoPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoProduPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdPedidoProduPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdPedidoProduPedidoDetaProdu.add(jLabelid_pedido_produFK_IdPedidoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdPedidoProduPedidoDetaProdu.add(jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdPedidoProduPedidoDetaProdu.add(jButtonFK_IdPedidoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("3.-Por Pedido Produ ", jPanelFK_IdPedidoProduPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdProductoPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdProductoPedidoDetaProdu.add(jLabelid_productoFK_IdProductoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdProductoPedidoDetaProdu.add(jComboBoxid_productoFK_IdProductoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);


		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdProductoPedidoDetaProdu.add(this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdProductoPedidoDetaProdu.add(jButtonFK_IdProductoPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("4.-Por Producto ", jPanelFK_IdProductoPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoProduPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdTipoProcesoProduPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdTipoProcesoProduPedidoDetaProdu.add(jLabelid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdTipoProcesoProduPedidoDetaProdu.add(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdTipoProcesoProduPedidoDetaProdu.add(jButtonFK_IdTipoProcesoProduPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("5.-Por Tipo Proceso Produ ", jPanelFK_IdTipoProcesoProduPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdUnidadPedidoDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadPedidoDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadPedidoDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadPedidoDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadPedidoDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadPedidoDetaProdu.setLayout(gridaBagLayoutFK_IdUnidadPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 0;
		jPanelFK_IdUnidadPedidoDetaProdu.add(jLabelid_unidadFK_IdUnidadPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 0;
		gridBagConstraintsPedidoDetaProdu.gridx = 1;
		jPanelFK_IdUnidadPedidoDetaProdu.add(jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoDetaProdu.gridy = 1;
		gridBagConstraintsPedidoDetaProdu.gridx =1;
		jPanelFK_IdUnidadPedidoDetaProdu.add(jButtonFK_IdUnidadPedidoDetaProdu, gridBagConstraintsPedidoDetaProdu);

		jTabbedPaneBusquedasPedidoDetaProdu.addTab("6.-Por Unad ", jPanelFK_IdUnidadPedidoDetaProdu);
		jTabbedPaneBusquedasPedidoDetaProdu.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoDetaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;		
			//this.gridBagConstraintsPedidoDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoDetaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;		
		//this.gridBagConstraintsPedidoDetaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoDetaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoDetaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoDetaProdu.gridx = 0;		
			this.gridBagConstraintsPedidoDetaProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoDetaProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);								
		
		
		/*
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		*/		
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoDetaProdu.gridx =0;
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
				
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoDetaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoDetaProdu.setLayout(gridaBagLayoutBusquedasParametrosPedidoDetaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
			
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoDetaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoDetaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoDetaProdu.setName("jPanelReporteDinamicoPedidoDetaProdu"); 
		
		this.jPanelReporteDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoDetaProdu.setLayout(gridaBagLayoutReporteDinamicoPedidoDetaProdu);
		
		
		this.jInternalFrameReporteDinamicoPedidoDetaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoDetaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoDetaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoDetaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoDetaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoDetaProdu = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoDetaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jLabelColumnasSelectReportePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoDetaProdu = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoDetaProdu=new JScrollPane(this.jListColumnasSelectReportePedidoDetaProdu);
			
			this.jScrollColumnasSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jListColumnasSelectReportePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jScrollColumnasSelectReportePedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoDetaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoDetaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoDetaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoDetaProdu=new JScrollPane(this.jListRelacionesSelectReportePedidoDetaProdu);
			
			this.jScrollRelacionesSelectReportePedidoDetaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoDetaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoDetaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPedidoDetaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoDetaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoDetaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jLabelGenerarExcelReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu.setToolTipText("Generar EXCEL"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jComboBoxTiposReportesDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jLabelTiposArchivoReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoDetaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoDetaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoDetaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoDetaProdu.setToolTipText("Generar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jButtonGenerarReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoDetaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoDetaProdu.setToolTipText("Cancelar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoDetaProdu.add(this.jButtonCerrarReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoDetaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoDetaProdu= new JScrollPane(jPanelReporteDinamicoPedidoDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoDetaProdu);
		this.jInternalFrameReporteDinamicoPedidoDetaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoDetaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoDetaProdu.setName("jPanelImportacionPedidoDetaProdu"); 
		
		this.jPanelImportacionPedidoDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoDetaProdu.setLayout(gridaBagLayoutImportacionPedidoDetaProdu);
		
		
		this.jInternalFrameImportacionPedidoDetaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoDetaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionPedidoDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionPedidoDetaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoDetaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionPedidoDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionPedidoDetaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoDetaProdu = new JLabelMe();

		this.jLabelArchivoImportacionPedidoDetaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoDetaProdu.add(this.jLabelArchivoImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoDetaProdu = new JFileChooser();		
		this.jFileChooserImportacionPedidoDetaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoDetaProdu = new JButtonMe();
		this.jButtonAbrirImportacionPedidoDetaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoDetaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoDetaProdu.setToolTipText("Generar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoDetaProdu.add(this.jButtonAbrirImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoDetaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoDetaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoDetaProdu.add(this.jLabelPathArchivoImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoDetaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoDetaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoDetaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoDetaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoDetaProdu.add(this.jTextFieldPathArchivoImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoDetaProdu = new JButtonMe();
		this.jButtonGenerarImportacionPedidoDetaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoDetaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoDetaProdu.setToolTipText("Generar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoDetaProdu.add(this.jButtonGenerarImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoDetaProdu = new JButtonMe();
		this.jButtonCerrarImportacionPedidoDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoDetaProdu.setToolTipText("Cancelar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoDetaProdu.add(this.jButtonCerrarImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoDetaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoDetaProdu= new JScrollPane(jPanelImportacionPedidoDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoDetaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoDetaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoDetaProdu);
		this.jInternalFrameImportacionPedidoDetaProdu.getContentPane().add(this.jScrollPanelImportacionPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoDetaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoDetaProdu = new JButtonMe();
			this.jButtonAbrirOrderByPedidoDetaProdu.setText("Orden");
			this.jButtonAbrirOrderByPedidoDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoDetaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoDetaProdu";
			inputMap = this.jButtonAbrirOrderByPedidoDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoDetaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoDetaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoDetaProdu.setName("jPanelOrderByPedidoDetaProdu"); 
			
			this.jPanelOrderByPedidoDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoDetaProdu.setLayout(gridaBagLayoutOrderByPedidoDetaProdu);
			
			
			this.jTableDatosPedidoDetaProduOrderBy = new JTableMe();        
			this.jTableDatosPedidoDetaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoDetaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoDetaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoDetaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoDetaProduOrderBy.setViewportView(this.jTableDatosPedidoDetaProduOrderBy);
			this.jTableDatosPedidoDetaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoDetaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoDetaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoDetaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoDetaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoDetaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoDetaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoDetaProdu.setTitle("Orden");
			this.jInternalFrameOrderByPedidoDetaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoDetaProdu.setResizable(true);
			this.jInternalFrameOrderByPedidoDetaProdu.setClosable(true);
			this.jInternalFrameOrderByPedidoDetaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Detalle Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoDetaProdu.ipady =150;
				
			this.jPanelOrderByPedidoDetaProdu.add(jScrollPanelDatosPedidoDetaProduOrderBy, this.gridBagConstraintsPedidoDetaProdu);//this.jTableDatosPedidoDetaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoDetaProdu = new JButtonMe();
			this.jButtonCerrarOrderByPedidoDetaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoDetaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoDetaProdu.setToolTipText("Cancelar"+" "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoDetaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoDetaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoDetaProdu.add(this.jButtonCerrarOrderByPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoDetaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoDetaProdu= new JScrollPane(jPanelOrderByPedidoDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoDetaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoDetaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoDetaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoDetaProdu);
			
			this.jInternalFrameOrderByPedidoDetaProdu.getContentPane().add(this.jScrollPanelOrderByPedidoDetaProdu, this.gridBagConstraintsPedidoDetaProdu);			
		
		} else {
			this.jButtonAbrirOrderByPedidoDetaProdu = new JButtonMe();
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
			&& this.pedidodetaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoDetaProdu.getRowHeight();//PedidoDetaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.isSelected()) {
					iHeightTable=PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoDetaProdu.isSelected()) {
					iHeightTable=PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoDetaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoDetaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoDetaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoDetaProdu!=null && this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoDetaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoDetaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoDetaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidodetaproduLogic.getPedidoDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidodetaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PedidoDetaProdu> TraerPedidoDetaProduBeans(List<PedidoDetaProdu> pedidodetaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodus) {
					
				if(!(PedidoDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidodetaprodu.setsDetalleGeneralEntityReporte(PedidoDetaProduConstantesFunciones.getPedidoDetaProduDescripcion(pedidodetaprodu));
										
						
					
						
					
				} else  {
							
					//pedidodetaprodu.setsDetalleGeneralEntityReporte(pedidodetaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidodetaprodubeans.add(pedidodetaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidodetaprodus;
    }
	//PARA REPORTES FIN
}
