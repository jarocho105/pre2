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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.RequisicionCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class RequisicionCompraJInternalFrame extends RequisicionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRequisicionCompra;
	
	protected JMenuBar jmenuBarRequisicionCompra;
	
	protected JMenu jmenuRequisicionCompra;
	protected JMenu jmenuDatosRequisicionCompra;
	protected JMenu jmenuArchivoRequisicionCompra;
	protected JMenu jmenuAccionesRequisicionCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRequisicionCompra;	
	protected GridBagConstraints gridBagConstraintsRequisicionCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RequisicionCompraDetalleFormJInternalFrame jInternalFrameDetalleFormRequisicionCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRequisicionCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRequisicionCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EstadoRequisicionBeanSwingJInternalFrame estadorequisicioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorequisicioncompra="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public RequisicionCompraSessionBean requisicioncompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EstadoRequisicionSessionBean estadorequisicioncompraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RequisicionCompra> requisicioncompras;		
	public List<RequisicionCompra> requisicioncomprasEliminados;	
	public List<RequisicionCompra> requisicioncomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRequisicionCompra;		
	protected JButton jButtonAbrirOrderByRequisicionCompra;
	
	
	//protected JPanel jPanelOrderByRequisicionCompra;
	//public JScrollPane jScrollPanelOrderByRequisicionCompra;	
	//protected JButton jButtonCerrarOrderByRequisicionCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RequisicionCompraLogic requisicioncompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRequisicionCompra;
	public JScrollPane jScrollPanelDatosEdicionRequisicionCompra;
	public JScrollPane jScrollPanelDatosGeneralRequisicionCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosRequisicionCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRequisicionCompra;
	//public JScrollPane jScrollPanelImportacionRequisicionCompra;
	
	
	
	protected JPanel jPanelAccionesRequisicionCompra;
	
    protected JPanel jPanelPaginacionRequisicionCompra;
    protected JPanel jPanelParametrosReportesRequisicionCompra;
	protected JPanel jPanelParametrosReportesAccionesRequisicionCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar2RequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar3RequisicionCompra;
	protected JPanel jPanelParametrosAuxiliar4RequisicionCompra;
	//protected JPanel jPanelParametrosAuxiliar5RequisicionCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoRequisicionCompra;
	//protected JPanel jPanelImportacionRequisicionCompra;
	
	
	public JTable jTableDatosRequisicionCompra;
	
	
	
	//public JTable jTableDatosRequisicionCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRequisicionCompra;
	protected JButton jButtonDuplicarRequisicionCompra;
	protected JButton jButtonCopiarRequisicionCompra;
	protected JButton jButtonVerFormRequisicionCompra;
	protected JButton jButtonNuevoRelacionesRequisicionCompra;
	protected JButton jButtonModificarRequisicionCompra;
	
    protected JButton jButtonGuardarCambiosTablaRequisicionCompra;
	protected JButton jButtonCerrarRequisicionCompra;
	
	
	protected JButton jButtonRecargarInformacionRequisicionCompra;
	protected JButton jButtonProcesarInformacionRequisicionCompra;
	
	
	protected JButton jButtonAnterioresRequisicionCompra;
	protected JButton jButtonSiguientesRequisicionCompra;
	protected JButton jButtonNuevoGuardarCambiosRequisicionCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRequisicionCompra;
	//protected JButton jButtonCerrarReporteDinamicoRequisicionCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoRequisicionCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionRequisicionCompra;
	//protected JButton jButtonGenerarImportacionRequisicionCompra;
	//protected JButton jButtonCerrarImportacionRequisicionCompra;
	//protected JFileChooser jFileChooserImportacionRequisicionCompra;
	//protected File fileImportacionRequisicionCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRequisicionCompra;
	protected JButton jButtonDuplicarToolBarRequisicionCompra;
	protected JButton jButtonNuevoRelacionesToolBarRequisicionCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarRequisicionCompra;
	protected JButton jButtonCopiarToolBarRequisicionCompra;
	protected JButton jButtonVerFormToolBarRequisicionCompra;
	public JButton jButtonGuardarCambiosTablaToolBarRequisicionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarRequisicionCompra;
	protected JButton jButtonCerrarToolBarRequisicionCompra;
	
	protected JButton jButtonRecargarInformacionToolBarRequisicionCompra;
	protected JButton jButtonProcesarInformacionToolBarRequisicionCompra;
	protected JButton jButtonAnterioresToolBarRequisicionCompra;
	protected JButton jButtonSiguientesToolBarRequisicionCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarRequisicionCompra;
	protected JButton jButtonAbrirOrderByToolBarRequisicionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRequisicionCompra;
	protected JMenuItem jMenuItemDuplicarRequisicionCompra;
	protected JMenuItem jMenuItemNuevoRelacionesRequisicionCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRequisicionCompra;
	protected JMenuItem jMenuItemCopiarRequisicionCompra;
	protected JMenuItem jMenuItemVerFormRequisicionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaRequisicionCompra;
	protected JMenuItem jMenuItemCerrarRequisicionCompra;
	protected JMenuItem jMenuItemDetalleCerrarRequisicionCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRequisicionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarRequisicionCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionRequisicionCompra;
	protected JMenuItem jMenuItemProcesarInformacionRequisicionCompra;
	protected JMenuItem jMenuItemAnterioresRequisicionCompra;
	protected JMenuItem jMenuItemSiguientesRequisicionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRequisicionCompra;
	protected JMenuItem jMenuItemAbrirOrderByRequisicionCompra;
	protected JMenuItem jMenuItemMostrarOcultarRequisicionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRequisicionCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRequisicionCompra;
	protected JCheckBox jCheckBoxSeleccionadosRequisicionCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRequisicionCompra;
	protected JCheckBox jCheckBoxConGraficoReporteRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRequisicionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRequisicionCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRequisicionCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRequisicionCompra;
	protected JTextField jTextFieldValorCampoGeneralRequisicionCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRequisicionCompra;
	//public JList<Reporte> jListColumnasSelectReporteRequisicionCompra;
	//public JScrollPane jScrollColumnasSelectReporteRequisicionCompra;
	
	//public JLabel jLabelRelacionesSelectReporteRequisicionCompra;
	//public JList<Reporte> jListRelacionesSelectReporteRequisicionCompra;
	//public JScrollPane jScrollRelacionesSelectReporteRequisicionCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRequisicionCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRequisicionCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRequisicionCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoRequisicionCompra;
	
		
	//public JLabel jLabelArchivoImportacionRequisicionCompra;	
	//public JLabel jLabelPathArchivoImportacionRequisicionCompra;
	//protected JTextField jTextFieldPathArchivoImportacionRequisicionCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRequisicionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRequisicionCompra;
	
	//public JLabel jLabelColumnaCategoriaValorRequisicionCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRequisicionCompra;
	
	//public JLabel jLabelColumnasValoresGraficoRequisicionCompra;
	//public JList<Reporte> jListColumnasValoresGraficoRequisicionCompra;
	//public JScrollPane jScrollColumnasValoresGraficoRequisicionCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRequisicionCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRequisicionCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRequisicionCompra;
	public JPanel jPanelFK_IdClienteRequisicionCompra;
	public JButton jButtonFK_IdClienteRequisicionCompra;
	public JPanel jPanelFK_IdEmpleadoRequisicionCompra;
	public JButton jButtonFK_IdEmpleadoRequisicionCompra;
	public JPanel jPanelFK_IdEstadoRequisicionCompraRequisicionCompra;
	public JButton jButtonFK_IdEstadoRequisicionCompraRequisicionCompra;
	
	public JPanel jPanelid_clienteFK_IdClienteRequisicionCompra;
	public JLabel jLabelid_clienteFK_IdClienteRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteRequisicionCompra;
	public JButton jButtonid_clienteFK_IdClienteRequisicionCompra= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRequisicionCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteRequisicionCompra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoRequisicionCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicionCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicionCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra;
	
	public JPanel jPanelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra;
	public JLabel jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra;
	public JButton jButtonid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra= new JButtonMe();
	public JButton jButtonid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompraBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=579;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RequisicionCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRequisicionCompra)	{
		this.jButtonRecargarInformacionRequisicionCompra = jButtonRecargarInformacionRequisicionCompra;
	}
	
	public JButton getjButtonProcesarInformacionRequisicionCompra() {
		return this.jButtonProcesarInformacionRequisicionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRequisicionCompra)	{
		this.jButtonProcesarInformacionRequisicionCompra = jButtonProcesarInformacionRequisicionCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionRequisicionCompra() {
		return this.jButtonRecargarInformacionRequisicionCompra;
	}
	
	
	public List<RequisicionCompra> getrequisicioncompras() {
		return this.requisicioncompras;
	}

	public void setrequisicioncompras(List<RequisicionCompra> requisicioncompras) {
		this.requisicioncompras = requisicioncompras;
	}
	
	public List<RequisicionCompra> getrequisicioncomprasAux() {
		return this.requisicioncomprasAux;
	}

	public void setrequisicioncomprasAux(List<RequisicionCompra> requisicioncomprasAux) {
		this.requisicioncomprasAux = requisicioncomprasAux;
	}
	
	public List<RequisicionCompra> getrequisicioncomprasEliminados() {
		return this.requisicioncomprasEliminados;
	}

	public void setRequisicionComprasEliminados(List<RequisicionCompra> requisicioncomprasEliminados) {
		this.requisicioncomprasEliminados = requisicioncomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRequisicionCompra() {
		return jComboBoxTiposSeleccionarRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRequisicionCompra(
			JComboBox jComboBoxTiposSeleccionarRequisicionCompra) {
		this.jComboBoxTiposSeleccionarRequisicionCompra = jComboBoxTiposSeleccionarRequisicionCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRequisicionCompra() {
		return jTextFieldValorCampoGeneralRequisicionCompra;
	}

	public void setjTextFieldValorCampoGeneralRequisicionCompra(
			JTextField jTextFieldValorCampoGeneralRequisicionCompra) {
		this.jTextFieldValorCampoGeneralRequisicionCompra = jTextFieldValorCampoGeneralRequisicionCompra;
	}

	public void setBorderResaltarValorCampoGeneralRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRequisicionCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRequisicionCompra() {
		return this.jCheckBoxSeleccionarTodosRequisicionCompra;
	}

	public void setjCheckBoxSeleccionarTodosRequisicionCompra(
			JCheckBox jCheckBoxSeleccionarTodosRequisicionCompra) {
		this.jCheckBoxSeleccionarTodosRequisicionCompra = jCheckBoxSeleccionarTodosRequisicionCompra;
	}

	public void setBorderResaltarSeleccionarTodosRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRequisicionCompra() {
		return this.jCheckBoxSeleccionadosRequisicionCompra;
	}

	public void setjCheckBoxSeleccionadosRequisicionCompra(
			JCheckBox jCheckBoxSeleccionadosRequisicionCompra) {
		this.jCheckBoxSeleccionadosRequisicionCompra = jCheckBoxSeleccionadosRequisicionCompra;
	}
	
	public void setBorderResaltarSeleccionadosRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRequisicionCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRequisicionCompra() {
		return this.jComboBoxTiposArchivosReportesRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRequisicionCompra(
			JComboBox jComboBoxTiposArchivosReportesRequisicionCompra) {
		this.jComboBoxTiposArchivosReportesRequisicionCompra = jComboBoxTiposArchivosReportesRequisicionCompra;
	}

	public void setBorderResaltarTiposArchivosReportesRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRequisicionCompra() {
		return this.jComboBoxTiposReportesRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRequisicionCompra(
			JComboBox jComboBoxTiposReportesRequisicionCompra) {
		this.jComboBoxTiposReportesRequisicionCompra = jComboBoxTiposReportesRequisicionCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRequisicionCompra() {
	//	return jComboBoxTiposReportesDinamicoRequisicionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRequisicionCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoRequisicionCompra) {
	//	this.jComboBoxTiposReportesDinamicoRequisicionCompra = jComboBoxTiposReportesDinamicoRequisicionCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRequisicionCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoRequisicionCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRequisicionCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRequisicionCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra = jComboBoxTiposArchivosReportesDinamicoRequisicionCompra;
	//}
	
	public void setBorderResaltarTiposReportesRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRequisicionCompra() {
		return this.jComboBoxTiposGraficosReportesRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRequisicionCompra(
			JComboBox jComboBoxTiposGraficosReportesRequisicionCompra) {
		this.jComboBoxTiposGraficosReportesRequisicionCompra = jComboBoxTiposGraficosReportesRequisicionCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRequisicionCompra() {
		return this.jComboBoxTiposPaginacionRequisicionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRequisicionCompra(
			JComboBox jComboBoxTiposPaginacionRequisicionCompra) {
		this.jComboBoxTiposPaginacionRequisicionCompra = jComboBoxTiposPaginacionRequisicionCompra;
	}
	
	public void setBorderResaltarTiposPaginacionRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRequisicionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRequisicionCompra() {
		return this.jComboBoxTiposRelacionesRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRequisicionCompra() {
		return this.jComboBoxTiposAccionesRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRequisicionCompra(
			JComboBox jComboBoxTiposRelacionesRequisicionCompra) {
		this.jComboBoxTiposRelacionesRequisicionCompra = jComboBoxTiposRelacionesRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRequisicionCompra(
			JComboBox jComboBoxTiposAccionesRequisicionCompra) {
		this.jComboBoxTiposAccionesRequisicionCompra = jComboBoxTiposAccionesRequisicionCompra;
	}
	
	public void setBorderResaltarTiposRelacionesRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRequisicionCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRequisicionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRequisicionCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRequisicionCompra() {
	//	return jCheckBoxConGraficoDinamicoRequisicionCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoRequisicionCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoRequisicionCompra) {
	//	this.jCheckBoxConGraficoDinamicoRequisicionCompra = jCheckBoxConGraficoDinamicoRequisicionCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRequisicionCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRequisicionCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRequisicionCompra .setBorder(borderResaltar);		
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
		this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		
		this.requisicioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.requisicioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.requisicioncompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RequisicionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Requisicion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
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
		
		RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRequisicionCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"nuevo","nuevo","Nuevo"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"duplicar","duplicar","Duplicar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"copiar","copiar","Copiar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"ver_form","ver_form","Ver"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"recargar","recargar","Recargar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRequisicionCompra,this.jTtoolBarRequisicionCompra,
							"cerrar","cerrar","Salir"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRequisicionCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRequisicionCompra;
			
				this.jButtonProcesarInformacionToolBarRequisicionCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRequisicionCompra;
				
		//protected JButton jButtonModificarToolBarRequisicionCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRequisicionCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRequisicionCompra=new JMenuMe("General");
		this.jmenuArchivoRequisicionCompra=new JMenuMe("Archivo");
		this.jmenuAccionesRequisicionCompra=new JMenuMe("Acciones");
		this.jmenuDatosRequisicionCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRequisicionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRequisicionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRequisicionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRequisicionCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRequisicionCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRequisicionCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRequisicionCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRequisicionCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRequisicionCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRequisicionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRequisicionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRequisicionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRequisicionCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRequisicionCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRequisicionCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRequisicionCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRequisicionCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRequisicionCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRequisicionCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRequisicionCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRequisicionCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRequisicionCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRequisicionCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRequisicionCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRequisicionCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRequisicionCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRequisicionCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRequisicionCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRequisicionCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRequisicionCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRequisicionCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRequisicionCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRequisicionCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRequisicionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRequisicionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRequisicionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRequisicionCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRequisicionCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRequisicionCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRequisicionCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRequisicionCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRequisicionCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRequisicionCompra.add(this.jMenuItemCerrarRequisicionCompra);
			
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemNuevoRequisicionCompra);
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemNuevoGuardarCambiosRequisicionCompra);
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemNuevoRelacionesRequisicionCompra);
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemGuardarCambiosTablaRequisicionCompra);		
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemDuplicarRequisicionCompra);		
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemCopiarRequisicionCompra);		
			this.jmenuAccionesRequisicionCompra.add(this.jMenuItemVerFormRequisicionCompra);		
			
			this.jmenuDatosRequisicionCompra.add(this.jMenuItemRecargarInformacionRequisicionCompra);				
			this.jmenuDatosRequisicionCompra.add(this.jMenuItemAnterioresRequisicionCompra);				
			this.jmenuDatosRequisicionCompra.add(this.jMenuItemSiguientesRequisicionCompra);				
			this.jmenuDatosRequisicionCompra.add(this.jMenuItemAbrirOrderByRequisicionCompra);				
			this.jmenuDatosRequisicionCompra.add(this.jMenuItemMostrarOcultarRequisicionCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRequisicionCompra.add(this.jMenuItemGuardarCambiosRequisicionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRequisicionCompra.add(this.jmenuArchivoRequisicionCompra);		
			this.jmenuBarRequisicionCompra.add(this.jmenuAccionesRequisicionCompra);		
			this.jmenuBarRequisicionCompra.add(this.jmenuDatosRequisicionCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRequisicionCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRequisicionCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteRequisicionCompra.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdClienteRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdClienteRequisicionCompra.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteRequisicionCompra,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteRequisicionCompra = new JLabelMe();
		jLabelid_clienteFK_IdClienteRequisicionCompra.setText("Cliente :");
		jLabelid_clienteFK_IdClienteRequisicionCompra.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteRequisicionCompra= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra.setFocusable(false);

		this.jPanelFK_IdEmpleadoRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoRequisicionCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoRequisicionCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoRequisicionCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra.setFocusable(false);

		this.jPanelFK_IdEstadoRequisicionCompraRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoRequisicionCompraRequisicionCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoRequisicionCompraRequisicionCompra= new JButtonMe();
		this.jButtonFK_IdEstadoRequisicionCompraRequisicionCompra.setText("Buscar");
		this.jButtonFK_IdEstadoRequisicionCompraRequisicionCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoRequisicionCompraRequisicionCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoRequisicionCompraRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra = new JLabelMe();
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setText("Estado :");
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setToolTipText("Estado");
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra= new JComboBoxMe();
		jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRequisicionCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasRequisicionCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRequisicionCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRequisicionCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleRequisicionCompra = new RequisicionCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Requisicion Compra DATOS");
			this.jInternalFrameDetalleFormRequisicionCompra = new RequisicionCompraDetalleFormJInternalFrame(jDesktopPane,this.requisicioncompraSessionBean.getConGuardarRelaciones(),this.requisicioncompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRequisicionCompra = null;//new RequisicionCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRequisicionCompra= new GridBagLayout();
		
		
		this.jTableDatosRequisicionCompra = new JTableMe();      
		
		String sToolTipRequisicionCompra="";
		sToolTipRequisicionCompra=RequisicionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRequisicionCompra+="(Inventario.RequisicionCompra)";
		}
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRequisicionCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRequisicionCompra.setToolTipText(sToolTipRequisicionCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRequisicionCompra);
		this.jTableDatosRequisicionCompra.setAutoCreateRowSorter(true);
		this.jTableDatosRequisicionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRequisicionCompra.setRowSelectionAllowed(true);
		this.jTableDatosRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRequisicionCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRequisicionCompra = new JButtonMe();
		this.jButtonDuplicarRequisicionCompra = new JButtonMe();
		this.jButtonCopiarRequisicionCompra = new JButtonMe();
		this.jButtonVerFormRequisicionCompra = new JButtonMe();
		this.jButtonNuevoRelacionesRequisicionCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRequisicionCompra = new JButtonMe();
		this.jButtonCerrarRequisicionCompra = new JButtonMe();
		
		this.jScrollPanelDatosRequisicionCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralRequisicionCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Requisicion Compra";
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesRequisicionCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRequisicionCompra=new ReporteDinamicoJInternalFrame(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRequisicionCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRequisicionCompra=new ImportacionJInternalFrame(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRequisicionCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRequisicionCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByRequisicionCompra.setText("Orden");
		this.jButtonAbrirOrderByRequisicionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRequisicionCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRequisicionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicionCompra,false,this);
			
			//this.cargarOrderByRequisicionCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRequisicionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicionCompra,true,this);
			
			//this.cargarOrderByRequisicionCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRequisicionCompra.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosRequisicionCompra.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosRequisicionCompra.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosRequisicionCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRequisicionCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRequisicionCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRequisicionCompra.setText("Nuevo");
		this.jButtonDuplicarRequisicionCompra.setText("Duplicar");
		this.jButtonCopiarRequisicionCompra.setText("Copiar");
		this.jButtonVerFormRequisicionCompra.setText("Ver");
		this.jButtonNuevoRelacionesRequisicionCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRequisicionCompra.setText("Guardar");
		this.jButtonCerrarRequisicionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRequisicionCompra,"nuevo_button","Nuevo",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRequisicionCompra,"duplicar_button","Duplicar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRequisicionCompra,"copiar_button","Copiar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRequisicionCompra,"ver_form","Ver",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRequisicionCompra,"nuevorelaciones_button","Nuevo Rel",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRequisicionCompra,"guardarcambiostabla_button","Guardar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRequisicionCompra,"cerrar_button","Salir",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRequisicionCompra.setToolTipText("Nuevo"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRequisicionCompra.setToolTipText("Duplicar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRequisicionCompra.setToolTipText("Copiar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRequisicionCompra.setToolTipText("Ver"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRequisicionCompra.setToolTipText("Nuevo Rel"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRequisicionCompra.setToolTipText("Guardar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRequisicionCompra.setToolTipText("Salir"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRequisicionCompra";
		inputMap = this.jButtonNuevoRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRequisicionCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarRequisicionCompra";
		inputMap = this.jButtonDuplicarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRequisicionCompra"));
		
		//COPIAR
		sMapKey = "CopiarRequisicionCompra";
		inputMap = this.jButtonCopiarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRequisicionCompra"));
		
		//VEr FORM
		sMapKey = "VerFormRequisicionCompra";
		inputMap = this.jButtonVerFormRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRequisicionCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRequisicionCompra";
		inputMap = this.jButtonNuevoRelacionesRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRequisicionCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRequisicionCompra";
		inputMap = this.jButtonModificarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRequisicionCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRequisicionCompra";
		inputMap = this.jButtonCerrarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRequisicionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRequisicionCompra";
		inputMap = this.jButtonGuardarCambiosTablaRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRequisicionCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRequisicionCompra.setName("jPanelParametrosReportesRequisicionCompra"); 
		
		this.jPanelParametrosReportesAccionesRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRequisicionCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRequisicionCompra.setName("jPanelParametrosReportesAccionesRequisicionCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRequisicionCompra = new JButtonMe();
		this.jButtonRecargarInformacionRequisicionCompra.setText("Recargar");
		this.jButtonRecargarInformacionRequisicionCompra.setToolTipText("Recargar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRequisicionCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRequisicionCompra = new JButtonMe();
		this.jButtonProcesarInformacionRequisicionCompra.setText("Procesar");
		this.jButtonProcesarInformacionRequisicionCompra.setToolTipText("Procesar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRequisicionCompra.setVisible(false);
			
		this.jButtonProcesarInformacionRequisicionCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRequisicionCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRequisicionCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRequisicionCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposReportesRequisicionCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicionCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRequisicionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRequisicionCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionRequisicionCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRequisicionCompra.setText("Accion");
		this.jComboBoxTiposRelacionesRequisicionCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRequisicionCompra.setText("Accion");
		this.jComboBoxTiposAccionesRequisicionCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRequisicionCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarRequisicionCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRequisicionCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRequisicionCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRequisicionCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRequisicionCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRequisicionCompra = new JLabelMe();
		
		this.jLabelAccionesRequisicionCompra.setText("Acciones");		
		this.jLabelAccionesRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRequisicionCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRequisicionCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRequisicionCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRequisicionCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRequisicionCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRequisicionCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRequisicionCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRequisicionCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRequisicionCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteRequisicionCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRequisicionCompra = new JButtonMe();
		//this.jButtonAnterioresRequisicionCompra.setText("<<");
        this.jButtonAnterioresRequisicionCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRequisicionCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRequisicionCompra = new JButtonMe();
		//this.jButtonSiguientesRequisicionCompra.setText(">>");
        this.jButtonSiguientesRequisicionCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRequisicionCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRequisicionCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRequisicionCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosRequisicionCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRequisicionCompra,"nuevoguardarcambios_button","Nue",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRequisicionCompra";
		inputMap = this.jButtonNuevoGuardarCambiosRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRequisicionCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRequisicionCompra";
		inputMap = this.jButtonRecargarInformacionRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRequisicionCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRequisicionCompra";
		inputMap = this.jButtonSiguientesRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRequisicionCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRequisicionCompra";
		inputMap = this.jButtonAnterioresRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRequisicionCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRequisicionCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRequisicionCompra.setMinimumSize(new Dimension(this.getWidth(),RequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRequisicionCompra.setMaximumSize(new Dimension(this.getWidth(),RequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRequisicionCompra.setPreferredSize(new Dimension(this.getWidth(),RequisicionCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRequisicionCompra = new GridBagLayout();

			this.jPanelPaginacionRequisicionCompra.setLayout(gridaBagLayoutPaginacionRequisicionCompra);						
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = 0;
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonAnterioresRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					
						
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsRequisicionCompra.gridy = 0;//
			
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonNuevoGuardarCambiosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
						
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRequisicionCompra.gridy = 0;
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonSiguientesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicionCompra.gridy = 1;//
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonNuevoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
				this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRequisicionCompra.gridy = 1;
				this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRequisicionCompra.add(this.jButtonNuevoRelacionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			}
			
			
			if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
				this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsRequisicionCompra.gridy = 1;//
				this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionRequisicionCompra.add(this.jButtonGuardarCambiosTablaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
			}
			
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicionCompra.gridy = 1;//
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonDuplicarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicionCompra.gridy = 1;//
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonCopiarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
		
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();//
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicionCompra.gridy = 1;//
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonVerFormRequisicionCompra, this.gridBagConstraintsRequisicionCompra);//
		
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = 1;
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRequisicionCompra.add(this.jButtonCerrarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		
		this.jButtonRecargarInformacionRequisicionCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRequisicionCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRequisicionCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRequisicionCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRequisicionCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRequisicionCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRequisicionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRequisicionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRequisicionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRequisicionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRequisicionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRequisicionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRequisicionCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRequisicionCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRequisicionCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRequisicionCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRequisicionCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRequisicionCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRequisicionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRequisicionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRequisicionCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRequisicionCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRequisicionCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRequisicionCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRequisicionCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RequisicionCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RequisicionCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRequisicionCompra.setLayout(gridaBagParametrosReportesRequisicionCompra);
			this.jPanelParametrosReportesAccionesRequisicionCompra.setLayout(gridaBagParametrosReportesAccionesRequisicionCompra);
			
			
			this.jPanelParametrosAuxiliar1RequisicionCompra.setLayout(gridaBagParametrosAuxiliar1RequisicionCompra);
			this.jPanelParametrosAuxiliar2RequisicionCompra.setLayout(gridaBagParametrosAuxiliar2RequisicionCompra);
			this.jPanelParametrosAuxiliar3RequisicionCompra.setLayout(gridaBagParametrosAuxiliar3RequisicionCompra);
			this.jPanelParametrosAuxiliar4RequisicionCompra.setLayout(gridaBagParametrosAuxiliar4RequisicionCompra);
			//this.jPanelParametrosAuxiliar5RequisicionCompra.setLayout(gridaBagParametrosAuxiliar2RequisicionCompra);			
			
			
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicionCompra.add(this.jButtonRecargarInformacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RequisicionCompra.add(this.jComboBoxTiposPaginacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RequisicionCompra.add(this.jCheckBoxConAltoMaximoTablaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RequisicionCompra.add(this.jComboBoxTiposArchivosReportesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicionCompra.add(this.jPanelParametrosAuxiliar1RequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RequisicionCompra.add(this.jComboBoxTiposReportesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);																		
			
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RequisicionCompra.add(this.jComboBoxTiposGraficosReportesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicionCompra.add(this.jPanelParametrosAuxiliar4RequisicionCompra, this.gridBagConstraintsRequisicionCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicionCompra.add(this.jComboBoxTiposReportesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicionCompra.add(this.jCheckBoxGenerarReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicionCompra.add(this.jPanelParametrosAuxiliar2RequisicionCompra, this.gridBagConstraintsRequisicionCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicionCompra.add(this.jLabelAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
				this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRequisicionCompra.add(this.jButtonAbrirOrderByRequisicionCompra, this.gridBagConstraintsRequisicionCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicionCompra.add(this.jComboBoxTiposSeleccionarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			
			
			/*
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicionCompra.add(this.jCheckBoxSeleccionarTodosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicionCompra.add(this.jCheckBoxConGraficoReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RequisicionCompra.add(this.jCheckBoxSeleccionarTodosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);															
				
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RequisicionCompra.add(this.jCheckBoxSeleccionadosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);															
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicionCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RequisicionCompra.add(this.jCheckBoxConGraficoReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicionCompra.add(this.jPanelParametrosAuxiliar3RequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicionCompra.add(this.jComboBoxTiposRelacionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
				
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicionCompra.add(this.jComboBoxTiposAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
	
				
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicionCompra.add(this.jTextFieldValorCampoGeneralRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRequisicionCompra = new GridBagLayout();

			this.jScrollPanelDatosRequisicionCompra.setLayout(gridaBagLayoutDatosRequisicionCompra);
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = 0;
			this.gridBagConstraintsRequisicionCompra.gridx = 0;
			
			this.jScrollPanelDatosRequisicionCompra.add(this.jTableDatosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRequisicionCompra.setViewportView(this.jTableDatosRequisicionCompra);
		this.jTableDatosRequisicionCompra.setFillsViewportHeight(true);
		this.jTableDatosRequisicionCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesRequisicionCompra.setLayout(gridaBagLayoutAccionesRequisicionCompra);
		
		
		/*	
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
			
		this.jPanelAccionesRequisicionCompra.add(this.jButtonNuevoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdClienteRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteRequisicionCompra.setLayout(gridaBagLayoutFK_IdClienteRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 0;
		jPanelFK_IdClienteRequisicionCompra.add(jLabelid_clienteFK_IdClienteRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 1;
		jPanelFK_IdClienteRequisicionCompra.add(jComboBoxid_clienteFK_IdClienteRequisicionCompra, gridBagConstraintsRequisicionCompra);


		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 0;
		jPanelFK_IdClienteRequisicionCompra.add(this.jButtonBuscarFK_IdClienteid_clienteRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 1;
		gridBagConstraintsRequisicionCompra.gridx =1;
		jPanelFK_IdClienteRequisicionCompra.add(jButtonFK_IdClienteRequisicionCompra, gridBagConstraintsRequisicionCompra);

		jTabbedPaneBusquedasRequisicionCompra.addTab("1.-Por Cliente ", jPanelFK_IdClienteRequisicionCompra);
		jTabbedPaneBusquedasRequisicionCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoRequisicionCompra.setLayout(gridaBagLayoutFK_IdEmpleadoRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 0;
		jPanelFK_IdEmpleadoRequisicionCompra.add(jLabelid_empleadoFK_IdEmpleadoRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 1;
		jPanelFK_IdEmpleadoRequisicionCompra.add(jComboBoxid_empleadoFK_IdEmpleadoRequisicionCompra, gridBagConstraintsRequisicionCompra);


		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 0;
		jPanelFK_IdEmpleadoRequisicionCompra.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 1;
		gridBagConstraintsRequisicionCompra.gridx =1;
		jPanelFK_IdEmpleadoRequisicionCompra.add(jButtonFK_IdEmpleadoRequisicionCompra, gridBagConstraintsRequisicionCompra);

		jTabbedPaneBusquedasRequisicionCompra.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoRequisicionCompra);
		jTabbedPaneBusquedasRequisicionCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoRequisicionCompraRequisicionCompra.setLayout(gridaBagLayoutFK_IdEstadoRequisicionCompraRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 0;
		jPanelFK_IdEstadoRequisicionCompraRequisicionCompra.add(jLabelid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 0;
		gridBagConstraintsRequisicionCompra.gridx = 1;
		jPanelFK_IdEstadoRequisicionCompraRequisicionCompra.add(jComboBoxid_estado_requisicion_compraFK_IdEstadoRequisicionCompraRequisicionCompra, gridBagConstraintsRequisicionCompra);

		gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicionCompra.gridy = 1;
		gridBagConstraintsRequisicionCompra.gridx =1;
		jPanelFK_IdEstadoRequisicionCompraRequisicionCompra.add(jButtonFK_IdEstadoRequisicionCompraRequisicionCompra, gridBagConstraintsRequisicionCompra);

		jTabbedPaneBusquedasRequisicionCompra.addTab("3.-Por Estado ", jPanelFK_IdEstadoRequisicionCompraRequisicionCompra);
		jTabbedPaneBusquedasRequisicionCompra.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRequisicionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRequisicionCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();						
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicionCompra.gridx = 0;		
			//this.gridBagConstraintsRequisicionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRequisicionCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRequisicionCompra.gridx = 0;		
		//this.gridBagConstraintsRequisicionCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRequisicionCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRequisicionCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicionCompra.gridx = 0;		
			this.gridBagConstraintsRequisicionCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRequisicionCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRequisicionCompra, this.gridBagConstraintsRequisicionCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);								
		
		
		/*
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		*/		
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRequisicionCompra.gridx =0;
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRequisicionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
				
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RequisicionCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRequisicionCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRequisicionCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosRequisicionCompra.setLayout(gridaBagLayoutBusquedasParametrosRequisicionCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRequisicionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRequisicionCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRequisicionCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRequisicionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRequisicionCompra.setName("jPanelReporteDinamicoRequisicionCompra"); 
		
		this.jPanelReporteDinamicoRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRequisicionCompra.setLayout(gridaBagLayoutReporteDinamicoRequisicionCompra);
		
		
		this.jInternalFrameReporteDinamicoRequisicionCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRequisicionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRequisicionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRequisicionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRequisicionCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRequisicionCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoRequisicionCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoRequisicionCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRequisicionCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteRequisicionCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelColumnasSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRequisicionCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRequisicionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRequisicionCompra=new JScrollPane(this.jListColumnasSelectReporteRequisicionCompra);
			
			this.jScrollColumnasSelectReporteRequisicionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRequisicionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRequisicionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRequisicionCompra.add(this.jListColumnasSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jScrollColumnasSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRequisicionCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteRequisicionCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelRelacionesSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRequisicionCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRequisicionCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRequisicionCompra=new JScrollPane(this.jListRelacionesSelectReporteRequisicionCompra);
			
			this.jScrollRelacionesSelectReporteRequisicionCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRequisicionCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRequisicionCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRequisicionCompra.add(this.jListRelacionesSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jScrollRelacionesSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRequisicionCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRequisicionCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoRequisicionCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRequisicionCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRequisicionCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRequisicionCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoRequisicionCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelConGraficoDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRequisicionCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRequisicionCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRequisicionCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRequisicionCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRequisicionCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jCheckBoxConGraficoDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRequisicionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRequisicionCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelColumnaCategoriaGraficoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jComboBoxColumnaCategoriaGraficoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRequisicionCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorRequisicionCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelColumnaCategoriaValorRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRequisicionCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jComboBoxColumnaCategoriaValorRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRequisicionCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoRequisicionCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelColumnasValoresGraficoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRequisicionCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoRequisicionCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRequisicionCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRequisicionCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRequisicionCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRequisicionCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRequisicionCompra=new JScrollPane(this.jListColumnasValoresGraficoRequisicionCompra);
			
			this.jScrollColumnasValoresGraficoRequisicionCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRequisicionCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRequisicionCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRequisicionCompra.add(this.jListColumnasSelectReporteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jScrollColumnasValoresGraficoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRequisicionCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRequisicionCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelTiposGraficosReportesDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRequisicionCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jComboBoxTiposGraficosReportesDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRequisicionCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRequisicionCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelGenerarExcelReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRequisicionCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRequisicionCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRequisicionCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRequisicionCompra.setToolTipText("Generar EXCEL"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRequisicionCompra.add(this.jButtonGenerarExcelReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jComboBoxTiposReportesDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRequisicionCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRequisicionCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jLabelTiposArchivoReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jComboBoxTiposArchivosReportesDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRequisicionCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRequisicionCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRequisicionCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRequisicionCompra.setToolTipText("Generar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jButtonGenerarReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRequisicionCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRequisicionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRequisicionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRequisicionCompra.setToolTipText("Cancelar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicionCompra.add(this.jButtonCerrarReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRequisicionCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRequisicionCompra= new JScrollPane(jPanelReporteDinamicoRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRequisicionCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRequisicionCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRequisicionCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRequisicionCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRequisicionCompra);
		this.jInternalFrameReporteDinamicoRequisicionCompra.getContentPane().add(this.jScrollPanelReporteDinamicoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRequisicionCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRequisicionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRequisicionCompra.setName("jPanelImportacionRequisicionCompra"); 
		
		this.jPanelImportacionRequisicionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRequisicionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRequisicionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRequisicionCompra.setLayout(gridaBagLayoutImportacionRequisicionCompra);
		
		
		this.jInternalFrameImportacionRequisicionCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRequisicionCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRequisicionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRequisicionCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRequisicionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRequisicionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRequisicionCompra.setResizable(true);
	    this.jInternalFrameImportacionRequisicionCompra.setClosable(true);
	    this.jInternalFrameImportacionRequisicionCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRequisicionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRequisicionCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRequisicionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRequisicionCompra.setResizable(true);
	    this.jInternalFrameImportacionRequisicionCompra.setClosable(true);
	    this.jInternalFrameImportacionRequisicionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRequisicionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRequisicionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRequisicionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRequisicionCompra = new JLabelMe();

		this.jLabelArchivoImportacionRequisicionCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRequisicionCompra.add(this.jLabelArchivoImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRequisicionCompra = new JFileChooser();		
		this.jFileChooserImportacionRequisicionCompra.setToolTipText("ESCOGER ARCHIVO"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRequisicionCompra = new JButtonMe();
		this.jButtonAbrirImportacionRequisicionCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRequisicionCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRequisicionCompra.setToolTipText("Generar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicionCompra.add(this.jButtonAbrirImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRequisicionCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionRequisicionCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRequisicionCompra.add(this.jLabelPathArchivoImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRequisicionCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRequisicionCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRequisicionCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRequisicionCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicionCompra.add(this.jTextFieldPathArchivoImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRequisicionCompra = new JButtonMe();
		this.jButtonGenerarImportacionRequisicionCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRequisicionCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRequisicionCompra.setToolTipText("Generar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicionCompra.add(this.jButtonGenerarImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRequisicionCompra = new JButtonMe();
		this.jButtonCerrarImportacionRequisicionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRequisicionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRequisicionCompra.setToolTipText("Cancelar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicionCompra.add(this.jButtonCerrarImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRequisicionCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionRequisicionCompra= new JScrollPane(jPanelImportacionRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsRequisicionCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRequisicionCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRequisicionCompra);
		this.jInternalFrameImportacionRequisicionCompra.getContentPane().add(this.jScrollPanelImportacionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRequisicionCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRequisicionCompra = new JButtonMe();
			this.jButtonAbrirOrderByRequisicionCompra.setText("Orden");
			this.jButtonAbrirOrderByRequisicionCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRequisicionCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRequisicionCompra";
			inputMap = this.jButtonAbrirOrderByRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRequisicionCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByRequisicionCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRequisicionCompra.setName("jPanelOrderByRequisicionCompra"); 
			
			this.jPanelOrderByRequisicionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRequisicionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRequisicionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRequisicionCompra.setLayout(gridaBagLayoutOrderByRequisicionCompra);
			
			
			this.jTableDatosRequisicionCompraOrderBy = new JTableMe();        
			this.jTableDatosRequisicionCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRequisicionCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRequisicionCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRequisicionCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRequisicionCompraOrderBy.setViewportView(this.jTableDatosRequisicionCompraOrderBy);
			this.jTableDatosRequisicionCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRequisicionCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRequisicionCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRequisicionCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRequisicionCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRequisicionCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRequisicionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRequisicionCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRequisicionCompra.setTitle("Orden");
			this.jInternalFrameOrderByRequisicionCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRequisicionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRequisicionCompra.setResizable(true);
			this.jInternalFrameOrderByRequisicionCompra.setClosable(true);
			this.jInternalFrameOrderByRequisicionCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRequisicionCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRequisicionCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRequisicionCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRequisicionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRequisicionCompra.ipady =150;
				
			this.jPanelOrderByRequisicionCompra.add(jScrollPanelDatosRequisicionCompraOrderBy, this.gridBagConstraintsRequisicionCompra);//this.jTableDatosRequisicionCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRequisicionCompra = new JButtonMe();
			this.jButtonCerrarOrderByRequisicionCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRequisicionCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRequisicionCompra.setToolTipText("Cancelar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRequisicionCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRequisicionCompra.add(this.jButtonCerrarOrderByRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRequisicionCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByRequisicionCompra= new JScrollPane(jPanelOrderByRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsRequisicionCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRequisicionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRequisicionCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRequisicionCompra);
			
			this.jInternalFrameOrderByRequisicionCompra.getContentPane().add(this.jScrollPanelOrderByRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
		
		} else {
			this.jButtonAbrirOrderByRequisicionCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.requisicioncompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRequisicionCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRequisicionCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRequisicionCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRequisicionCompra.getRowHeight();//RequisicionCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRequisicionCompra.isSelected()) {
					iHeightTable=RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRequisicionCompra.isSelected()) {
					iHeightTable=RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RequisicionCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRequisicionCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRequisicionCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRequisicionCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRequisicionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRequisicionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRequisicionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRequisicionCompra!=null && this.jInternalFrameOrderByRequisicionCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRequisicionCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRequisicionCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRequisicionCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRequisicionCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRequisicionCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRequisicionCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRequisicionCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRequisicionCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRequisicionCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRequisicionCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=requisicioncompraLogic.getRequisicionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=requisicioncompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<RequisicionCompra> TraerRequisicionCompraBeans(List<RequisicionCompra> requisicioncompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(RequisicionCompra requisicioncompra:requisicioncompras) {
					
				if(!(RequisicionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RequisicionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					requisicioncompra.setsDetalleGeneralEntityReporte(RequisicionCompraConstantesFunciones.getRequisicionCompraDescripcion(requisicioncompra));
										
						
					
					

					if(requisicioncompra.getDetalleRequisicionCompras()!=null && Funciones.existeClass(classes,DetalleRequisicionCompra.class)) {
						try{requisicioncompra.setdetallerequisicioncomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleRequisicionCompraJInternalFrame.TraerDetalleRequisicionCompraBeans(requisicioncompra.getDetalleRequisicionCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//requisicioncompra.setsDetalleGeneralEntityReporte(requisicioncompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//requisicioncomprabeans.add(requisicioncomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return requisicioncompras;
    }
	//PARA REPORTES FIN
}
