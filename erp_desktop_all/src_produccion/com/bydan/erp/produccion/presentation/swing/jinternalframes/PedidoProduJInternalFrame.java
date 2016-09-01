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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.produccion.util.PedidoProduConstantesFunciones;

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
public class PedidoProduJInternalFrame extends PedidoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoProdu;
	
	protected JMenuBar jmenuBarPedidoProdu;
	
	protected JMenu jmenuPedidoProdu;
	protected JMenu jmenuDatosPedidoProdu;
	protected JMenu jmenuArchivoPedidoProdu;
	protected JMenu jmenuAccionesPedidoProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoProdu;	
	protected GridBagConstraints gridBagConstraintsPedidoProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoProduDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprioridadempresaprodu="";

	protected EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoresponsable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordenprodu="";
	
	public PedidoProduSessionBean pedidoproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
	public EmpleadoSessionBean empleadoresponsableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoProdu> pedidoprodus;		
	public List<PedidoProdu> pedidoprodusEliminados;	
	public List<PedidoProdu> pedidoprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoProdu;		
	protected JButton jButtonAbrirOrderByPedidoProdu;
	
	
	//protected JPanel jPanelOrderByPedidoProdu;
	//public JScrollPane jScrollPanelOrderByPedidoProdu;	
	//protected JButton jButtonCerrarOrderByPedidoProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoProduLogic pedidoproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoProdu;
	public JScrollPane jScrollPanelDatosEdicionPedidoProdu;
	public JScrollPane jScrollPanelDatosGeneralPedidoProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoProdu;
	//public JScrollPane jScrollPanelImportacionPedidoProdu;
	
	
	
	protected JPanel jPanelAccionesPedidoProdu;
	
    protected JPanel jPanelPaginacionPedidoProdu;
    protected JPanel jPanelParametrosReportesPedidoProdu;
	protected JPanel jPanelParametrosReportesAccionesPedidoProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoProdu;
	protected JPanel jPanelParametrosAuxiliar2PedidoProdu;
	protected JPanel jPanelParametrosAuxiliar3PedidoProdu;
	protected JPanel jPanelParametrosAuxiliar4PedidoProdu;
	//protected JPanel jPanelParametrosAuxiliar5PedidoProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoProdu;
	//protected JPanel jPanelImportacionPedidoProdu;
	
	
	public JTable jTableDatosPedidoProdu;
	
	
	
	//public JTable jTableDatosPedidoProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoProdu;
	protected JButton jButtonDuplicarPedidoProdu;
	protected JButton jButtonCopiarPedidoProdu;
	protected JButton jButtonVerFormPedidoProdu;
	protected JButton jButtonNuevoRelacionesPedidoProdu;
	protected JButton jButtonModificarPedidoProdu;
	
    protected JButton jButtonGuardarCambiosTablaPedidoProdu;
	protected JButton jButtonCerrarPedidoProdu;
	
	
	protected JButton jButtonRecargarInformacionPedidoProdu;
	protected JButton jButtonProcesarInformacionPedidoProdu;
	
	
	protected JButton jButtonAnterioresPedidoProdu;
	protected JButton jButtonSiguientesPedidoProdu;
	protected JButton jButtonNuevoGuardarCambiosPedidoProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoProdu;
	//protected JButton jButtonCerrarReporteDinamicoPedidoProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoProdu;
	//protected JButton jButtonGenerarImportacionPedidoProdu;
	//protected JButton jButtonCerrarImportacionPedidoProdu;
	//protected JFileChooser jFileChooserImportacionPedidoProdu;
	//protected File fileImportacionPedidoProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoProdu;
	protected JButton jButtonDuplicarToolBarPedidoProdu;
	protected JButton jButtonNuevoRelacionesToolBarPedidoProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoProdu;
	protected JButton jButtonCopiarToolBarPedidoProdu;
	protected JButton jButtonVerFormToolBarPedidoProdu;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoProdu;
	protected JButton jButtonCerrarToolBarPedidoProdu;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoProdu;
	protected JButton jButtonProcesarInformacionToolBarPedidoProdu;
	protected JButton jButtonAnterioresToolBarPedidoProdu;
	protected JButton jButtonSiguientesToolBarPedidoProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoProdu;
	protected JButton jButtonAbrirOrderByToolBarPedidoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoProdu;
	protected JMenuItem jMenuItemDuplicarPedidoProdu;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoProdu;
	protected JMenuItem jMenuItemCopiarPedidoProdu;
	protected JMenuItem jMenuItemVerFormPedidoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoProdu;
	protected JMenuItem jMenuItemCerrarPedidoProdu;
	protected JMenuItem jMenuItemDetalleCerrarPedidoProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoProdu;
	protected JMenuItem jMenuItemProcesarInformacionPedidoProdu;
	protected JMenuItem jMenuItemAnterioresPedidoProdu;
	protected JMenuItem jMenuItemSiguientesPedidoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoProdu;
	protected JMenuItem jMenuItemAbrirOrderByPedidoProdu;
	protected JMenuItem jMenuItemMostrarOcultarPedidoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoProdu;
	protected JCheckBox jCheckBoxSeleccionadosPedidoProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoProdu;
	protected JCheckBox jCheckBoxConGraficoReportePedidoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoProdu;
	protected JTextField jTextFieldValorCampoGeneralPedidoProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoProdu;
	//public JList<Reporte> jListColumnasSelectReportePedidoProdu;
	//public JScrollPane jScrollColumnasSelectReportePedidoProdu;
	
	//public JLabel jLabelRelacionesSelectReportePedidoProdu;
	//public JList<Reporte> jListRelacionesSelectReportePedidoProdu;
	//public JScrollPane jScrollRelacionesSelectReportePedidoProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoProdu;
	
		
	//public JLabel jLabelArchivoImportacionPedidoProdu;	
	//public JLabel jLabelPathArchivoImportacionPedidoProdu;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoProdu;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoProdu;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoProdu;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoProdu;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoProdu;
	public JPanel jPanelFK_IdClientePedidoProdu;
	public JButton jButtonFK_IdClientePedidoProdu;
	public JPanel jPanelFK_IdEmpleadoResponsablePedidoProdu;
	public JButton jButtonFK_IdEmpleadoResponsablePedidoProdu;
	public JPanel jPanelFK_IdEstadoOrdenProduPedidoProdu;
	public JButton jButtonFK_IdEstadoOrdenProduPedidoProdu;
	public JPanel jPanelFK_IdFormatoPedidoProdu;
	public JButton jButtonFK_IdFormatoPedidoProdu;
	public JPanel jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu;
	public JButton jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu;
	
	public JPanel jPanelid_clienteFK_IdClientePedidoProdu;
	public JLabel jLabelid_clienteFK_IdClientePedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedidoProdu;
	public JButton jButtonid_clienteFK_IdClientePedidoProdu= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedidoProdu;
	
	public JPanel jPanelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu;
	public JLabel jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu;
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu= new JButtonMe();
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsablePedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsablePedidoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu;
	public JLabel jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu;
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu= new JButtonMe();
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduPedidoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoPedidoProdu;
	public JLabel jLabelid_formatoFK_IdFormatoPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoPedidoProdu;
	public JButton jButtonid_formatoFK_IdFormatoPedidoProdu= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu;
	public JLabel jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu;
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProduBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidoProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoProdu)	{
		this.jButtonRecargarInformacionPedidoProdu = jButtonRecargarInformacionPedidoProdu;
	}
	
	public JButton getjButtonProcesarInformacionPedidoProdu() {
		return this.jButtonProcesarInformacionPedidoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoProdu)	{
		this.jButtonProcesarInformacionPedidoProdu = jButtonProcesarInformacionPedidoProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoProdu() {
		return this.jButtonRecargarInformacionPedidoProdu;
	}
	
	
	public List<PedidoProdu> getpedidoprodus() {
		return this.pedidoprodus;
	}

	public void setpedidoprodus(List<PedidoProdu> pedidoprodus) {
		this.pedidoprodus = pedidoprodus;
	}
	
	public List<PedidoProdu> getpedidoprodusAux() {
		return this.pedidoprodusAux;
	}

	public void setpedidoprodusAux(List<PedidoProdu> pedidoprodusAux) {
		this.pedidoprodusAux = pedidoprodusAux;
	}
	
	public List<PedidoProdu> getpedidoprodusEliminados() {
		return this.pedidoprodusEliminados;
	}

	public void setPedidoProdusEliminados(List<PedidoProdu> pedidoprodusEliminados) {
		this.pedidoprodusEliminados = pedidoprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoProdu() {
		return jComboBoxTiposSeleccionarPedidoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoProdu(
			JComboBox jComboBoxTiposSeleccionarPedidoProdu) {
		this.jComboBoxTiposSeleccionarPedidoProdu = jComboBoxTiposSeleccionarPedidoProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoProdu() {
		return jTextFieldValorCampoGeneralPedidoProdu;
	}

	public void setjTextFieldValorCampoGeneralPedidoProdu(
			JTextField jTextFieldValorCampoGeneralPedidoProdu) {
		this.jTextFieldValorCampoGeneralPedidoProdu = jTextFieldValorCampoGeneralPedidoProdu;
	}

	public void setBorderResaltarValorCampoGeneralPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoProdu() {
		return this.jCheckBoxSeleccionarTodosPedidoProdu;
	}

	public void setjCheckBoxSeleccionarTodosPedidoProdu(
			JCheckBox jCheckBoxSeleccionarTodosPedidoProdu) {
		this.jCheckBoxSeleccionarTodosPedidoProdu = jCheckBoxSeleccionarTodosPedidoProdu;
	}

	public void setBorderResaltarSeleccionarTodosPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoProdu() {
		return this.jCheckBoxSeleccionadosPedidoProdu;
	}

	public void setjCheckBoxSeleccionadosPedidoProdu(
			JCheckBox jCheckBoxSeleccionadosPedidoProdu) {
		this.jCheckBoxSeleccionadosPedidoProdu = jCheckBoxSeleccionadosPedidoProdu;
	}
	
	public void setBorderResaltarSeleccionadosPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoProdu() {
		return this.jComboBoxTiposArchivosReportesPedidoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoProdu(
			JComboBox jComboBoxTiposArchivosReportesPedidoProdu) {
		this.jComboBoxTiposArchivosReportesPedidoProdu = jComboBoxTiposArchivosReportesPedidoProdu;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoProdu() {
		return this.jComboBoxTiposReportesPedidoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoProdu(
			JComboBox jComboBoxTiposReportesPedidoProdu) {
		this.jComboBoxTiposReportesPedidoProdu = jComboBoxTiposReportesPedidoProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoProdu() {
	//	return jComboBoxTiposReportesDinamicoPedidoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoProdu) {
	//	this.jComboBoxTiposReportesDinamicoPedidoProdu = jComboBoxTiposReportesDinamicoPedidoProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu = jComboBoxTiposArchivosReportesDinamicoPedidoProdu;
	//}
	
	public void setBorderResaltarTiposReportesPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoProdu() {
		return this.jComboBoxTiposGraficosReportesPedidoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoProdu(
			JComboBox jComboBoxTiposGraficosReportesPedidoProdu) {
		this.jComboBoxTiposGraficosReportesPedidoProdu = jComboBoxTiposGraficosReportesPedidoProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoProdu() {
		return this.jComboBoxTiposPaginacionPedidoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoProdu(
			JComboBox jComboBoxTiposPaginacionPedidoProdu) {
		this.jComboBoxTiposPaginacionPedidoProdu = jComboBoxTiposPaginacionPedidoProdu;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoProdu() {
		return this.jComboBoxTiposRelacionesPedidoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoProdu() {
		return this.jComboBoxTiposAccionesPedidoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoProdu(
			JComboBox jComboBoxTiposRelacionesPedidoProdu) {
		this.jComboBoxTiposRelacionesPedidoProdu = jComboBoxTiposRelacionesPedidoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoProdu(
			JComboBox jComboBoxTiposAccionesPedidoProdu) {
		this.jComboBoxTiposAccionesPedidoProdu = jComboBoxTiposAccionesPedidoProdu;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoProdu() {
	//	return jCheckBoxConGraficoDinamicoPedidoProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoProdu) {
	//	this.jCheckBoxConGraficoDinamicoPedidoProdu = jCheckBoxConGraficoDinamicoPedidoProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoProdu .setBorder(borderResaltar);		
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
		this.pedidoproduSessionBean=new PedidoProduSessionBean();
		
		this.pedidoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"nuevo","nuevo","Nuevo"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"duplicar","duplicar","Duplicar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"copiar","copiar","Copiar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"ver_form","ver_form","Ver"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"recargar","recargar","Recargar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoProdu,this.jTtoolBarPedidoProdu,
							"cerrar","cerrar","Salir"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoProdu;
			
				this.jButtonProcesarInformacionToolBarPedidoProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoProdu;
				
		//protected JButton jButtonModificarToolBarPedidoProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoProdu=new JMenuMe("General");
		this.jmenuArchivoPedidoProdu=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoProdu=new JMenuMe("Acciones");
		this.jmenuDatosPedidoProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoProdu.add(this.jMenuItemCerrarPedidoProdu);
			
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemNuevoPedidoProdu);
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemNuevoGuardarCambiosPedidoProdu);
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemNuevoRelacionesPedidoProdu);
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemGuardarCambiosTablaPedidoProdu);		
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemDuplicarPedidoProdu);		
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemCopiarPedidoProdu);		
			this.jmenuAccionesPedidoProdu.add(this.jMenuItemVerFormPedidoProdu);		
			
			this.jmenuDatosPedidoProdu.add(this.jMenuItemRecargarInformacionPedidoProdu);				
			this.jmenuDatosPedidoProdu.add(this.jMenuItemAnterioresPedidoProdu);				
			this.jmenuDatosPedidoProdu.add(this.jMenuItemSiguientesPedidoProdu);				
			this.jmenuDatosPedidoProdu.add(this.jMenuItemAbrirOrderByPedidoProdu);				
			this.jmenuDatosPedidoProdu.add(this.jMenuItemMostrarOcultarPedidoProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoProdu.add(this.jMenuItemGuardarCambiosPedidoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoProdu.add(this.jmenuArchivoPedidoProdu);		
			this.jmenuBarPedidoProdu.add(this.jmenuAccionesPedidoProdu);		
			this.jmenuBarPedidoProdu.add(this.jmenuDatosPedidoProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClientePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedidoProdu.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedidoProdu= new JButtonMe();
		this.jButtonFK_IdClientePedidoProdu.setText("Buscar");
		this.jButtonFK_IdClientePedidoProdu.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedidoProdu,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedidoProdu = new JLabelMe();
		jLabelid_clienteFK_IdClientePedidoProdu.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedidoProdu.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedidoProdu= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.setFocusable(false);

		this.jPanelFK_IdEmpleadoResponsablePedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoResponsablePedidoProdu.setToolTipText("Buscar Por Empleado Responsable ");
		this.jButtonFK_IdEmpleadoResponsablePedidoProdu= new JButtonMe();
		this.jButtonFK_IdEmpleadoResponsablePedidoProdu.setText("Buscar");
		this.jButtonFK_IdEmpleadoResponsablePedidoProdu.setToolTipText("Buscar Por Empleado Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoResponsablePedidoProdu,"buscar_button","Buscar Por Empleado Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoResponsablePedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu = new JLabelMe();
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setText("Empleado Responsable :");
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setToolTipText("Empleado Responsable");
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu= new JComboBoxMe();
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoOrdenProduPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoOrdenProduPedidoProdu.setToolTipText("Buscar Por Estado Orden Produ ");
		this.jButtonFK_IdEstadoOrdenProduPedidoProdu= new JButtonMe();
		this.jButtonFK_IdEstadoOrdenProduPedidoProdu.setText("Buscar");
		this.jButtonFK_IdEstadoOrdenProduPedidoProdu.setToolTipText("Buscar Por Estado Orden Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoOrdenProduPedidoProdu,"buscar_button","Buscar Por Estado Orden Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoOrdenProduPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu = new JLabelMe();
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setText("Estado Orden Produ :");
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setToolTipText("Estado Orden Produ");
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu= new JComboBoxMe();
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedidoProdu.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoPedidoProdu= new JButtonMe();
		this.jButtonFK_IdFormatoPedidoProdu.setText("Buscar");
		this.jButtonFK_IdFormatoPedidoProdu.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedidoProdu,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoPedidoProdu = new JLabelMe();
		jLabelid_formatoFK_IdFormatoPedidoProdu.setText("Formato :");
		jLabelid_formatoFK_IdFormatoPedidoProdu.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoPedidoProdu= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu.setToolTipText("Buscar Por Tipo Priorad Empresa Produ ");
		this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu= new JButtonMe();
		this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu.setText("Buscar");
		this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu.setToolTipText("Buscar Por Tipo Priorad Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu,"buscar_button","Buscar Por Tipo Priorad Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu = new JLabelMe();
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setText("Tipo Priorad Empresa Produ :");
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setToolTipText("Tipo Priorad Empresa Produ");
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu= new JComboBoxMe();
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedidoProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidoProdu = new PedidoProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Produccion DATOS");
			this.jInternalFrameDetalleFormPedidoProdu = new PedidoProduDetalleFormJInternalFrame(jDesktopPane,this.pedidoproduSessionBean.getConGuardarRelaciones(),this.pedidoproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoProdu = null;//new PedidoProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoProdu= new GridBagLayout();
		
		
		this.jTableDatosPedidoProdu = new JTableMe();      
		
		String sToolTipPedidoProdu="";
		sToolTipPedidoProdu=PedidoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoProdu+="(Produccion.PedidoProdu)";
		}
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoProdu.setToolTipText(sToolTipPedidoProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoProdu);
		this.jTableDatosPedidoProdu.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoProdu.setRowSelectionAllowed(true);
		this.jTableDatosPedidoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoProdu = new JButtonMe();
		this.jButtonDuplicarPedidoProdu = new JButtonMe();
		this.jButtonCopiarPedidoProdu = new JButtonMe();
		this.jButtonVerFormPedidoProdu = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoProdu = new JButtonMe();
		this.jButtonCerrarPedidoProdu = new JButtonMe();
		
		this.jScrollPanelDatosPedidoProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Produccion";
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoProdu.setToolTipText("Acciones");
        this.jPanelAccionesPedidoProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidoProdu=new ReporteDinamicoJInternalFrame(PedidoProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoProdu=new ImportacionJInternalFrame(PedidoProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoProdu.setText("Orden");
		this.jButtonAbrirOrderByPedidoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoProdu,false,this);
			
			//this.cargarOrderByPedidoProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoProdu,true,this);
			
			//this.cargarOrderByPedidoProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoProdu.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosPedidoProdu.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosPedidoProdu.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosPedidoProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoProdu.setText("Nuevo");
		this.jButtonDuplicarPedidoProdu.setText("Duplicar");
		this.jButtonCopiarPedidoProdu.setText("Copiar");
		this.jButtonVerFormPedidoProdu.setText("Ver");
		this.jButtonNuevoRelacionesPedidoProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoProdu.setText("Guardar");
		this.jButtonCerrarPedidoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoProdu,"nuevo_button","Nuevo",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoProdu,"duplicar_button","Duplicar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoProdu,"copiar_button","Copiar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoProdu,"ver_form","Ver",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoProdu,"nuevorelaciones_button","Nuevo Rel",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoProdu,"guardarcambiostabla_button","Guardar",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoProdu,"cerrar_button","Salir",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoProdu.setToolTipText("Nuevo"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoProdu.setToolTipText("Duplicar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoProdu.setToolTipText("Copiar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoProdu.setToolTipText("Ver"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoProdu.setToolTipText("Nuevo Rel"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoProdu.setToolTipText("Guardar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoProdu.setToolTipText("Salir"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoProdu";
		inputMap = this.jButtonNuevoPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoProdu";
		inputMap = this.jButtonDuplicarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoProdu"));
		
		//COPIAR
		sMapKey = "CopiarPedidoProdu";
		inputMap = this.jButtonCopiarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoProdu"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoProdu";
		inputMap = this.jButtonVerFormPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoProdu";
		inputMap = this.jButtonNuevoRelacionesPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoProdu";
		inputMap = this.jButtonModificarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoProdu";
		inputMap = this.jButtonCerrarPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoProdu";
		inputMap = this.jButtonGuardarCambiosTablaPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoProdu.setName("jPanelParametrosReportesPedidoProdu"); 
		
		this.jPanelParametrosReportesAccionesPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoProdu.setName("jPanelParametrosReportesAccionesPedidoProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoProdu = new JButtonMe();
		this.jButtonRecargarInformacionPedidoProdu.setText("Recargar");
		this.jButtonRecargarInformacionPedidoProdu.setToolTipText("Recargar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoProdu = new JButtonMe();
		this.jButtonProcesarInformacionPedidoProdu.setText("Procesar");
		this.jButtonProcesarInformacionPedidoProdu.setToolTipText("Procesar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoProdu.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoProdu.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoProdu.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoProdu.setText("Accion");
		this.jComboBoxTiposAccionesPedidoProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoProdu = new JLabelMe();
		
		this.jLabelAccionesPedidoProdu.setText("Acciones");		
		this.jLabelAccionesPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoProdu.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoProdu = new JButtonMe();
		//this.jButtonAnterioresPedidoProdu.setText("<<");
        this.jButtonAnterioresPedidoProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoProdu = new JButtonMe();
		//this.jButtonSiguientesPedidoProdu.setText(">>");
        this.jButtonSiguientesPedidoProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoProdu,"nuevoguardarcambios_button","Nue",this.pedidoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoProdu";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoProdu";
		inputMap = this.jButtonRecargarInformacionPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoProdu";
		inputMap = this.jButtonSiguientesPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoProdu";
		inputMap = this.jButtonAnterioresPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoProdu.setMinimumSize(new Dimension(this.getWidth(),PedidoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoProdu.setMaximumSize(new Dimension(this.getWidth(),PedidoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoProdu.setPreferredSize(new Dimension(this.getWidth(),PedidoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoProdu = new GridBagLayout();

			this.jPanelPaginacionPedidoProdu.setLayout(gridaBagLayoutPaginacionPedidoProdu);						
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 0;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoProdu.add(this.jButtonAnterioresPedidoProdu, this.gridBagConstraintsPedidoProdu);
					
						
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoProdu.gridy = 0;
			
			this.jPanelPaginacionPedidoProdu.add(this.jButtonNuevoGuardarCambiosPedidoProdu, this.gridBagConstraintsPedidoProdu);
						
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoProdu.gridy = 0;
			this.jPanelPaginacionPedidoProdu.add(this.jButtonSiguientesPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 1;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoProdu.add(this.jButtonNuevoPedidoProdu, this.gridBagConstraintsPedidoProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoProdu.gridy = 1;
				this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedidoProdu.add(this.jButtonNuevoRelacionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
			}
			
			
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoProdu.gridy = 1;
				this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPedidoProdu.add(this.jButtonGuardarCambiosTablaPedidoProdu, this.gridBagConstraintsPedidoProdu);
			}
			
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 1;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoProdu.add(this.jButtonDuplicarPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 1;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoProdu.add(this.jButtonCopiarPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 1;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPedidoProdu.add(this.jButtonVerFormPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 1;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoProdu.add(this.jButtonCerrarPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
		
		
		this.jButtonRecargarInformacionPedidoProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoProdu.setLayout(gridaBagParametrosReportesPedidoProdu);
			this.jPanelParametrosReportesAccionesPedidoProdu.setLayout(gridaBagParametrosReportesAccionesPedidoProdu);
			
			
			this.jPanelParametrosAuxiliar1PedidoProdu.setLayout(gridaBagParametrosAuxiliar1PedidoProdu);
			this.jPanelParametrosAuxiliar2PedidoProdu.setLayout(gridaBagParametrosAuxiliar2PedidoProdu);
			this.jPanelParametrosAuxiliar3PedidoProdu.setLayout(gridaBagParametrosAuxiliar3PedidoProdu);
			this.jPanelParametrosAuxiliar4PedidoProdu.setLayout(gridaBagParametrosAuxiliar4PedidoProdu);
			//this.jPanelParametrosAuxiliar5PedidoProdu.setLayout(gridaBagParametrosAuxiliar2PedidoProdu);			
			
			
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoProdu.add(this.jButtonRecargarInformacionPedidoProdu, this.gridBagConstraintsPedidoProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoProdu.add(this.jComboBoxTiposPaginacionPedidoProdu, this.gridBagConstraintsPedidoProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoProdu.add(this.jCheckBoxConAltoMaximoTablaPedidoProdu, this.gridBagConstraintsPedidoProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoProdu.add(this.jComboBoxTiposArchivosReportesPedidoProdu, this.gridBagConstraintsPedidoProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoProdu.add(this.jPanelParametrosAuxiliar1PedidoProdu, this.gridBagConstraintsPedidoProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoProdu.add(this.jComboBoxTiposReportesPedidoProdu, this.gridBagConstraintsPedidoProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoProdu.add(this.jPanelParametrosAuxiliar4PedidoProdu, this.gridBagConstraintsPedidoProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoProdu.add(this.jComboBoxTiposReportesPedidoProdu, this.gridBagConstraintsPedidoProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoProdu.add(this.jCheckBoxGenerarReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoProdu.add(this.jPanelParametrosAuxiliar2PedidoProdu, this.gridBagConstraintsPedidoProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoProdu.add(this.jLabelAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
				this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoProdu.add(this.jButtonAbrirOrderByPedidoProdu, this.gridBagConstraintsPedidoProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoProdu.add(this.jComboBoxTiposSeleccionarPedidoProdu, this.gridBagConstraintsPedidoProdu);			
			
			
			/*
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoProdu.add(this.jCheckBoxSeleccionarTodosPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoProdu.add(this.jCheckBoxSeleccionarTodosPedidoProdu, this.gridBagConstraintsPedidoProdu);															
				
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoProdu.add(this.jCheckBoxSeleccionadosPedidoProdu, this.gridBagConstraintsPedidoProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoProdu.add(this.jPanelParametrosAuxiliar3PedidoProdu, this.gridBagConstraintsPedidoProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoProdu.add(this.jComboBoxTiposRelacionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
				
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoProdu.add(this.jComboBoxTiposAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
	
				
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoProdu.add(this.jTextFieldValorCampoGeneralPedidoProdu, this.gridBagConstraintsPedidoProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoProdu = new GridBagLayout();

			this.jScrollPanelDatosPedidoProdu.setLayout(gridaBagLayoutDatosPedidoProdu);
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = 0;
			this.gridBagConstraintsPedidoProdu.gridx = 0;
			
			this.jScrollPanelDatosPedidoProdu.add(this.jTableDatosPedidoProdu, this.gridBagConstraintsPedidoProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoProdu.setViewportView(this.jTableDatosPedidoProdu);
		this.jTableDatosPedidoProdu.setFillsViewportHeight(true);
		this.jTableDatosPedidoProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoProdu= new GridBagLayout();
		this.jPanelAccionesPedidoProdu.setLayout(gridaBagLayoutAccionesPedidoProdu);
		
		
		/*	
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = 0;
		this.gridBagConstraintsPedidoProdu.gridx = 0;
			
		this.jPanelAccionesPedidoProdu.add(this.jButtonNuevoPedidoProdu, this.gridBagConstraintsPedidoProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClientePedidoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedidoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedidoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedidoProdu.setLayout(gridaBagLayoutFK_IdClientePedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdClientePedidoProdu.add(jLabelid_clienteFK_IdClientePedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 1;
		jPanelFK_IdClientePedidoProdu.add(jComboBoxid_clienteFK_IdClientePedidoProdu, gridBagConstraintsPedidoProdu);


		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdClientePedidoProdu.add(this.jButtonBuscarFK_IdClienteid_clientePedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 1;
		gridBagConstraintsPedidoProdu.gridx =1;
		jPanelFK_IdClientePedidoProdu.add(jButtonFK_IdClientePedidoProdu, gridBagConstraintsPedidoProdu);

		jTabbedPaneBusquedasPedidoProdu.addTab("1.-Por Cliente ", jPanelFK_IdClientePedidoProdu);
		jTabbedPaneBusquedasPedidoProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoResponsablePedidoProdu.setLayout(gridaBagLayoutFK_IdEmpleadoResponsablePedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdEmpleadoResponsablePedidoProdu.add(jLabelid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 1;
		jPanelFK_IdEmpleadoResponsablePedidoProdu.add(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 1;
		gridBagConstraintsPedidoProdu.gridx =1;
		jPanelFK_IdEmpleadoResponsablePedidoProdu.add(jButtonFK_IdEmpleadoResponsablePedidoProdu, gridBagConstraintsPedidoProdu);

		jTabbedPaneBusquedasPedidoProdu.addTab("2.-Por Empleado Responsable ", jPanelFK_IdEmpleadoResponsablePedidoProdu);
		jTabbedPaneBusquedasPedidoProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoOrdenProduPedidoProdu.setLayout(gridaBagLayoutFK_IdEstadoOrdenProduPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdEstadoOrdenProduPedidoProdu.add(jLabelid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 1;
		jPanelFK_IdEstadoOrdenProduPedidoProdu.add(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 1;
		gridBagConstraintsPedidoProdu.gridx =1;
		jPanelFK_IdEstadoOrdenProduPedidoProdu.add(jButtonFK_IdEstadoOrdenProduPedidoProdu, gridBagConstraintsPedidoProdu);

		jTabbedPaneBusquedasPedidoProdu.addTab("3.-Por Estado Orden Produ ", jPanelFK_IdEstadoOrdenProduPedidoProdu);
		jTabbedPaneBusquedasPedidoProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoPedidoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPedidoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedidoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedidoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPedidoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPedidoProdu.setLayout(gridaBagLayoutFK_IdFormatoPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdFormatoPedidoProdu.add(jLabelid_formatoFK_IdFormatoPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 1;
		jPanelFK_IdFormatoPedidoProdu.add(jComboBoxid_formatoFK_IdFormatoPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 1;
		gridBagConstraintsPedidoProdu.gridx =1;
		jPanelFK_IdFormatoPedidoProdu.add(jButtonFK_IdFormatoPedidoProdu, gridBagConstraintsPedidoProdu);

		jTabbedPaneBusquedasPedidoProdu.addTab("4.-Por Formato ", jPanelFK_IdFormatoPedidoProdu);
		jTabbedPaneBusquedasPedidoProdu.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu.setLayout(gridaBagLayoutFK_IdTipoPrioridadEmpresaProduPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 0;
		jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu.add(jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 0;
		gridBagConstraintsPedidoProdu.gridx = 1;
		jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu.add(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu, gridBagConstraintsPedidoProdu);

		gridBagConstraintsPedidoProdu = new GridBagConstraints();
		gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoProdu.gridy = 1;
		gridBagConstraintsPedidoProdu.gridx =1;
		jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu.add(jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu, gridBagConstraintsPedidoProdu);

		jTabbedPaneBusquedasPedidoProdu.addTab("5.-Por Tipo Priorad Empresa Produ ", jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);
		jTabbedPaneBusquedasPedidoProdu.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();						
			this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoProdu.gridx = 0;		
			//this.gridBagConstraintsPedidoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoProdu, this.gridBagConstraintsPedidoProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoProdu.gridx = 0;		
		//this.gridBagConstraintsPedidoProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoProdu.gridx = 0;		
			this.gridBagConstraintsPedidoProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoProdu, this.gridBagConstraintsPedidoProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoProdu, this.gridBagConstraintsPedidoProdu);								
		
		
		/*
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
		*/		
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoProdu.gridx =0;
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoProdu, this.gridBagConstraintsPedidoProdu);
				
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoProdu, this.gridBagConstraintsPedidoProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoProdu.setLayout(gridaBagLayoutBusquedasParametrosPedidoProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoProdu, this.gridBagConstraintsPedidoProdu);
			
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoProdu, this.gridBagConstraintsPedidoProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoProdu.setName("jPanelReporteDinamicoPedidoProdu"); 
		
		this.jPanelReporteDinamicoPedidoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoProdu.setLayout(gridaBagLayoutReporteDinamicoPedidoProdu);
		
		
		this.jInternalFrameReporteDinamicoPedidoProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoProdu = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoProdu.add(this.jLabelColumnasSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoProdu = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoProdu=new JScrollPane(this.jListColumnasSelectReportePedidoProdu);
			
			this.jScrollColumnasSelectReportePedidoProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoProdu.add(this.jListColumnasSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		this.jPanelReporteDinamicoPedidoProdu.add(this.jScrollColumnasSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoProdu = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoProdu.add(this.jLabelRelacionesSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoProdu = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoProdu=new JScrollPane(this.jListRelacionesSelectReportePedidoProdu);
			
			this.jScrollRelacionesSelectReportePedidoProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoProdu.add(this.jListRelacionesSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		this.jPanelReporteDinamicoPedidoProdu.add(this.jScrollRelacionesSelectReportePedidoProdu, this.gridBagConstraintsPedidoProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedidoProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoProdu.add(this.jLabelGenerarExcelReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoProdu.setToolTipText("Generar EXCEL"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		//this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoProdu.add(this.jButtonGenerarExcelReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoProdu.add(this.jComboBoxTiposReportesDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoProdu.add(this.jLabelTiposArchivoReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoProdu.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoProdu.setToolTipText("Generar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoProdu.add(this.jButtonGenerarReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoProdu.setToolTipText("Cancelar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoProdu.add(this.jButtonCerrarReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoProdu= new JScrollPane(jPanelReporteDinamicoPedidoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoProdu);
		this.jInternalFrameReporteDinamicoPedidoProdu.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoProdu, this.gridBagConstraintsPedidoProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoProdu.setName("jPanelImportacionPedidoProdu"); 
		
		this.jPanelImportacionPedidoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoProdu.setLayout(gridaBagLayoutImportacionPedidoProdu);
		
		
		this.jInternalFrameImportacionPedidoProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoProdu.setResizable(true);
	    this.jInternalFrameImportacionPedidoProdu.setClosable(true);
	    this.jInternalFrameImportacionPedidoProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoProdu.setResizable(true);
	    this.jInternalFrameImportacionPedidoProdu.setClosable(true);
	    this.jInternalFrameImportacionPedidoProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoProdu = new JLabelMe();

		this.jLabelArchivoImportacionPedidoProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoProdu.add(this.jLabelArchivoImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoProdu = new JFileChooser();		
		this.jFileChooserImportacionPedidoProdu.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoProdu = new JButtonMe();
		this.jButtonAbrirImportacionPedidoProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoProdu.setToolTipText("Generar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoProdu.add(this.jButtonAbrirImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoProdu.add(this.jLabelPathArchivoImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoProdu.add(this.jTextFieldPathArchivoImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoProdu = new JButtonMe();
		this.jButtonGenerarImportacionPedidoProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoProdu.setToolTipText("Generar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoProdu.add(this.jButtonGenerarImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoProdu = new JButtonMe();
		this.jButtonCerrarImportacionPedidoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoProdu.setToolTipText("Cancelar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoProdu.add(this.jButtonCerrarImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoProdu= new JScrollPane(jPanelImportacionPedidoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
		this.gridBagConstraintsPedidoProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoProdu);
		this.jInternalFrameImportacionPedidoProdu.getContentPane().add(this.jScrollPanelImportacionPedidoProdu, this.gridBagConstraintsPedidoProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoProdu = new JButtonMe();
			this.jButtonAbrirOrderByPedidoProdu.setText("Orden");
			this.jButtonAbrirOrderByPedidoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoProdu";
			inputMap = this.jButtonAbrirOrderByPedidoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoProdu.setName("jPanelOrderByPedidoProdu"); 
			
			this.jPanelOrderByPedidoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoProdu.setLayout(gridaBagLayoutOrderByPedidoProdu);
			
			
			this.jTableDatosPedidoProduOrderBy = new JTableMe();        
			this.jTableDatosPedidoProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoProduOrderBy.setViewportView(this.jTableDatosPedidoProduOrderBy);
			this.jTableDatosPedidoProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoProdu.setTitle("Orden");
			this.jInternalFrameOrderByPedidoProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoProdu.setResizable(true);
			this.jInternalFrameOrderByPedidoProdu.setClosable(true);
			this.jInternalFrameOrderByPedidoProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoProdu.ipady =150;
				
			this.jPanelOrderByPedidoProdu.add(jScrollPanelDatosPedidoProduOrderBy, this.gridBagConstraintsPedidoProdu);//this.jTableDatosPedidoProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoProdu = new JButtonMe();
			this.jButtonCerrarOrderByPedidoProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoProdu.setToolTipText("Cancelar"+" "+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoProdu.add(this.jButtonCerrarOrderByPedidoProdu, this.gridBagConstraintsPedidoProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoProdu= new JScrollPane(jPanelOrderByPedidoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoProdu = new GridBagConstraints();
			this.gridBagConstraintsPedidoProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoProdu);
			
			this.jInternalFrameOrderByPedidoProdu.getContentPane().add(this.jScrollPanelOrderByPedidoProdu, this.gridBagConstraintsPedidoProdu);			
		
		} else {
			this.jButtonAbrirOrderByPedidoProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidoproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidoProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoProdu.getRowHeight();//PedidoProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoProdu.isSelected()) {
					iHeightTable=PedidoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoProdu.isSelected()) {
					iHeightTable=PedidoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoProdu!=null && this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidoproduLogic.getPedidoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PedidoProdu> TraerPedidoProduBeans(List<PedidoProdu> pedidoprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoProdu pedidoprodu:pedidoprodus) {
					
				if(!(PedidoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidoprodu.setsDetalleGeneralEntityReporte(PedidoProduConstantesFunciones.getPedidoProduDescripcion(pedidoprodu));
										
					pedidoprodu.setes_uso_interno_descripcion(PedidoProduConstantesFunciones.getes_uso_internoDescripcion(pedidoprodu));	
					
					

					if(pedidoprodu.getPedidoDetaProdus()!=null && Funciones.existeClass(classes,PedidoDetaProdu.class)) {
						try{pedidoprodu.setpedidodetaprodusDescripcionReporte(new JRBeanCollectionDataSource(PedidoDetaProduJInternalFrame.TraerPedidoDetaProduBeans(pedidoprodu.getPedidoDetaProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedidoprodu.setsDetalleGeneralEntityReporte(pedidoprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidoprodubeans.add(pedidoprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidoprodus;
    }
	//PARA REPORTES FIN
}
