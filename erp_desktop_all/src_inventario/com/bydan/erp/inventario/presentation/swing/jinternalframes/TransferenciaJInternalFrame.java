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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
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
import com.bydan.erp.inventario.util.TransferenciaConstantesFunciones;

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
public class TransferenciaJInternalFrame extends TransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransferencia;
	
	protected JMenuBar jmenuBarTransferencia;
	
	protected JMenu jmenuTransferencia;
	protected JMenu jmenuDatosTransferencia;
	protected JMenu jmenuArchivoTransferencia;
	protected JMenu jmenuAccionesTransferencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferencia;	
	protected GridBagConstraints gridBagConstraintsTransferencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransferenciaDetalleFormJInternalFrame jInternalFrameDetalleFormTransferencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransferencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransferencia;	
	
	
	
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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoInventarioBeanSwingJInternalFrame estadoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoinventario="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public TransferenciaSessionBean transferenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoInventarioSessionBean estadoinventarioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Transferencia> transferencias;		
	public List<Transferencia> transferenciasEliminados;	
	public List<Transferencia> transferenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransferencia;		
	protected JButton jButtonAbrirOrderByTransferencia;
	
	
	//protected JPanel jPanelOrderByTransferencia;
	//public JScrollPane jScrollPanelOrderByTransferencia;	
	//protected JButton jButtonCerrarOrderByTransferencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransferenciaLogic transferenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransferencia;
	public JScrollPane jScrollPanelDatosEdicionTransferencia;
	public JScrollPane jScrollPanelDatosGeneralTransferencia;
    
	
	
	//public JScrollPane jScrollPanelDatosTransferenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransferencia;
	//public JScrollPane jScrollPanelImportacionTransferencia;
	
	
	
	protected JPanel jPanelAccionesTransferencia;
	
    protected JPanel jPanelPaginacionTransferencia;
    protected JPanel jPanelParametrosReportesTransferencia;
	protected JPanel jPanelParametrosReportesAccionesTransferencia;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalTransferencia;
	protected Integer iXPanelCamposFintotalTransferencia=0;
	protected Integer iYPanelCamposFintotalTransferencia=0;

	protected JPanel jPanelCamposIniciogeneralTransferencia;
	protected Integer iXPanelCamposIniciogeneralTransferencia=0;
	protected Integer iYPanelCamposIniciogeneralTransferencia=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Transferencia;
	protected JPanel jPanelParametrosAuxiliar2Transferencia;
	protected JPanel jPanelParametrosAuxiliar3Transferencia;
	protected JPanel jPanelParametrosAuxiliar4Transferencia;
	//protected JPanel jPanelParametrosAuxiliar5Transferencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransferencia;
	//protected JPanel jPanelImportacionTransferencia;
	
	
	public JTable jTableDatosTransferencia;
	
	
	
	//public JTable jTableDatosTransferenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransferencia;
	protected JButton jButtonDuplicarTransferencia;
	protected JButton jButtonCopiarTransferencia;
	protected JButton jButtonVerFormTransferencia;
	protected JButton jButtonNuevoRelacionesTransferencia;
	protected JButton jButtonModificarTransferencia;
	
    protected JButton jButtonGuardarCambiosTablaTransferencia;
	protected JButton jButtonCerrarTransferencia;
	
	
	protected JButton jButtonRecargarInformacionTransferencia;
	protected JButton jButtonProcesarInformacionTransferencia;
	
	
	protected JButton jButtonAnterioresTransferencia;
	protected JButton jButtonSiguientesTransferencia;
	protected JButton jButtonNuevoGuardarCambiosTransferencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransferencia;
	//protected JButton jButtonCerrarReporteDinamicoTransferencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransferencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransferencia;
	//protected JButton jButtonGenerarImportacionTransferencia;
	//protected JButton jButtonCerrarImportacionTransferencia;
	//protected JFileChooser jFileChooserImportacionTransferencia;
	//protected File fileImportacionTransferencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferencia;
	protected JButton jButtonDuplicarToolBarTransferencia;
	protected JButton jButtonNuevoRelacionesToolBarTransferencia;
	
	
	public JButton jButtonGuardarCambiosToolBarTransferencia;
	protected JButton jButtonCopiarToolBarTransferencia;
	protected JButton jButtonVerFormToolBarTransferencia;
	public JButton jButtonGuardarCambiosTablaToolBarTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferencia;
	protected JButton jButtonCerrarToolBarTransferencia;
	
	protected JButton jButtonRecargarInformacionToolBarTransferencia;
	protected JButton jButtonProcesarInformacionToolBarTransferencia;
	protected JButton jButtonAnterioresToolBarTransferencia;
	protected JButton jButtonSiguientesToolBarTransferencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransferencia;
	protected JButton jButtonAbrirOrderByToolBarTransferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferencia;
	protected JMenuItem jMenuItemDuplicarTransferencia;
	protected JMenuItem jMenuItemNuevoRelacionesTransferencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransferencia;
	protected JMenuItem jMenuItemCopiarTransferencia;
	protected JMenuItem jMenuItemVerFormTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferencia;
	protected JMenuItem jMenuItemCerrarTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarTransferencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferencia;
	
	protected JMenuItem jMenuItemRecargarInformacionTransferencia;
	protected JMenuItem jMenuItemProcesarInformacionTransferencia;
	protected JMenuItem jMenuItemAnterioresTransferencia;
	protected JMenuItem jMenuItemSiguientesTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferencia;
	protected JMenuItem jMenuItemAbrirOrderByTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarTransferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransferencia;
	protected JCheckBox jCheckBoxSeleccionadosTransferencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransferencia;
	protected JCheckBox jCheckBoxConGraficoReporteTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransferencia;
	protected JTextField jTextFieldValorCampoGeneralTransferencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransferencia;
	//public JList<Reporte> jListColumnasSelectReporteTransferencia;
	//public JScrollPane jScrollColumnasSelectReporteTransferencia;
	
	//public JLabel jLabelRelacionesSelectReporteTransferencia;
	//public JList<Reporte> jListRelacionesSelectReporteTransferencia;
	//public JScrollPane jScrollRelacionesSelectReporteTransferencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransferencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransferencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransferencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransferencia;
	
		
	//public JLabel jLabelArchivoImportacionTransferencia;	
	//public JLabel jLabelPathArchivoImportacionTransferencia;
	//protected JTextField jTextFieldPathArchivoImportacionTransferencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransferencia;
	
	//public JLabel jLabelColumnaCategoriaValorTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransferencia;
	
	//public JLabel jLabelColumnasValoresGraficoTransferencia;
	//public JList<Reporte> jListColumnasValoresGraficoTransferencia;
	//public JScrollPane jScrollColumnasValoresGraficoTransferencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransferencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransferencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransferencia;
	public JPanel jPanelFK_IdAsientoContableTransferencia;
	public JButton jButtonFK_IdAsientoContableTransferencia;
	public JPanel jPanelFK_IdEmpleadoTransferencia;
	public JButton jButtonFK_IdEmpleadoTransferencia;
	public JPanel jPanelFK_IdEstadoInventarioTransferencia;
	public JButton jButtonFK_IdEstadoInventarioTransferencia;
	public JPanel jPanelFK_IdTipoTransaccionModuloTransferencia;
	public JButton jButtonFK_IdTipoTransaccionModuloTransferencia;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableTransferencia;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransferencia= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransferenciaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoTransferencia;
	public JLabel jLabelid_empleadoFK_IdEmpleadoTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoTransferencia;
	public JButton jButtonid_empleadoFK_IdEmpleadoTransferencia= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTransferenciaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia;
	
	public JPanel jPanelid_estado_inventarioFK_IdEstadoInventarioTransferencia;
	public JLabel jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia;
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioTransferencia= new JButtonMe();
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferenciaBusqueda= new JButtonMe();

	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=520;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransferenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransferencia)	{
		this.jButtonRecargarInformacionTransferencia = jButtonRecargarInformacionTransferencia;
	}
	
	public JButton getjButtonProcesarInformacionTransferencia() {
		return this.jButtonProcesarInformacionTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferencia)	{
		this.jButtonProcesarInformacionTransferencia = jButtonProcesarInformacionTransferencia;
	}
	
	
	public JButton getjButtonRecargarInformacionTransferencia() {
		return this.jButtonRecargarInformacionTransferencia;
	}
	
	
	public List<Transferencia> gettransferencias() {
		return this.transferencias;
	}

	public void settransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}
	
	public List<Transferencia> gettransferenciasAux() {
		return this.transferenciasAux;
	}

	public void settransferenciasAux(List<Transferencia> transferenciasAux) {
		this.transferenciasAux = transferenciasAux;
	}
	
	public List<Transferencia> gettransferenciasEliminados() {
		return this.transferenciasEliminados;
	}

	public void setTransferenciasEliminados(List<Transferencia> transferenciasEliminados) {
		this.transferenciasEliminados = transferenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransferencia() {
		return jComboBoxTiposSeleccionarTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransferencia(
			JComboBox jComboBoxTiposSeleccionarTransferencia) {
		this.jComboBoxTiposSeleccionarTransferencia = jComboBoxTiposSeleccionarTransferencia;
	}
	
	public void setBorderResaltarTiposSeleccionarTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransferencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransferencia() {
		return jTextFieldValorCampoGeneralTransferencia;
	}

	public void setjTextFieldValorCampoGeneralTransferencia(
			JTextField jTextFieldValorCampoGeneralTransferencia) {
		this.jTextFieldValorCampoGeneralTransferencia = jTextFieldValorCampoGeneralTransferencia;
	}

	public void setBorderResaltarValorCampoGeneralTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransferencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransferencia() {
		return this.jCheckBoxSeleccionarTodosTransferencia;
	}

	public void setjCheckBoxSeleccionarTodosTransferencia(
			JCheckBox jCheckBoxSeleccionarTodosTransferencia) {
		this.jCheckBoxSeleccionarTodosTransferencia = jCheckBoxSeleccionarTodosTransferencia;
	}

	public void setBorderResaltarSeleccionarTodosTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransferencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransferencia() {
		return this.jCheckBoxSeleccionadosTransferencia;
	}

	public void setjCheckBoxSeleccionadosTransferencia(
			JCheckBox jCheckBoxSeleccionadosTransferencia) {
		this.jCheckBoxSeleccionadosTransferencia = jCheckBoxSeleccionadosTransferencia;
	}
	
	public void setBorderResaltarSeleccionadosTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransferencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransferencia() {
		return this.jComboBoxTiposArchivosReportesTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransferencia(
			JComboBox jComboBoxTiposArchivosReportesTransferencia) {
		this.jComboBoxTiposArchivosReportesTransferencia = jComboBoxTiposArchivosReportesTransferencia;
	}

	public void setBorderResaltarTiposArchivosReportesTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransferencia() {
		return this.jComboBoxTiposReportesTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransferencia(
			JComboBox jComboBoxTiposReportesTransferencia) {
		this.jComboBoxTiposReportesTransferencia = jComboBoxTiposReportesTransferencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransferencia() {
	//	return jComboBoxTiposReportesDinamicoTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransferencia(
	//		JComboBox jComboBoxTiposReportesDinamicoTransferencia) {
	//	this.jComboBoxTiposReportesDinamicoTransferencia = jComboBoxTiposReportesDinamicoTransferencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransferencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransferencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransferencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransferencia = jComboBoxTiposArchivosReportesDinamicoTransferencia;
	//}
	
	public void setBorderResaltarTiposReportesTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransferencia() {
		return this.jComboBoxTiposGraficosReportesTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransferencia(
			JComboBox jComboBoxTiposGraficosReportesTransferencia) {
		this.jComboBoxTiposGraficosReportesTransferencia = jComboBoxTiposGraficosReportesTransferencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransferencia() {
		return this.jComboBoxTiposPaginacionTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransferencia(
			JComboBox jComboBoxTiposPaginacionTransferencia) {
		this.jComboBoxTiposPaginacionTransferencia = jComboBoxTiposPaginacionTransferencia;
	}
	
	public void setBorderResaltarTiposPaginacionTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransferencia() {
		return this.jComboBoxTiposRelacionesTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferencia() {
		return this.jComboBoxTiposAccionesTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferencia(
			JComboBox jComboBoxTiposRelacionesTransferencia) {
		this.jComboBoxTiposRelacionesTransferencia = jComboBoxTiposRelacionesTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferencia(
			JComboBox jComboBoxTiposAccionesTransferencia) {
		this.jComboBoxTiposAccionesTransferencia = jComboBoxTiposAccionesTransferencia;
	}
	
	public void setBorderResaltarTiposRelacionesTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransferencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransferencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransferencia() {
	//	return jCheckBoxConGraficoDinamicoTransferencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransferencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransferencia) {
	//	this.jCheckBoxConGraficoDinamicoTransferencia = jCheckBoxConGraficoDinamicoTransferencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransferencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransferencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransferencia .setBorder(borderResaltar);		
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
		this.transferenciaSessionBean=new TransferenciaSessionBean();
		
		this.transferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransferencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransferencia,this.jTtoolBarTransferencia,
							"nuevo","nuevo","Nuevo"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransferencia,this.jTtoolBarTransferencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransferencia,this.jTtoolBarTransferencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransferencia,this.jTtoolBarTransferencia,
							"duplicar","duplicar","Duplicar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransferencia,this.jTtoolBarTransferencia,
							"copiar","copiar","Copiar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransferencia,this.jTtoolBarTransferencia,
							"ver_form","ver_form","Ver"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencia,this.jTtoolBarTransferencia,
							"recargar","recargar","Recargar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencia,this.jTtoolBarTransferencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencia,this.jTtoolBarTransferencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransferencia,this.jTtoolBarTransferencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransferencia,this.jTtoolBarTransferencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransferencia,this.jTtoolBarTransferencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransferencia,this.jTtoolBarTransferencia,
							"cerrar","cerrar","Salir"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransferencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransferencia;
			
				this.jButtonProcesarInformacionToolBarTransferencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransferencia;
				
		//protected JButton jButtonModificarToolBarTransferencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransferencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransferencia=new JMenuMe("General");
		this.jmenuArchivoTransferencia=new JMenuMe("Archivo");
		this.jmenuAccionesTransferencia=new JMenuMe("Acciones");
		this.jmenuDatosTransferencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransferencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransferencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransferencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransferencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransferencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransferencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransferencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransferencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransferencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransferencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransferencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransferencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransferencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransferencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransferencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransferencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransferencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransferencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransferencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransferencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransferencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransferencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransferencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransferencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransferencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransferencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransferencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransferencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransferencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransferencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransferencia.add(this.jMenuItemCerrarTransferencia);
			
			this.jmenuAccionesTransferencia.add(this.jMenuItemNuevoTransferencia);
			this.jmenuAccionesTransferencia.add(this.jMenuItemNuevoGuardarCambiosTransferencia);
			this.jmenuAccionesTransferencia.add(this.jMenuItemNuevoRelacionesTransferencia);
			this.jmenuAccionesTransferencia.add(this.jMenuItemGuardarCambiosTablaTransferencia);		
			this.jmenuAccionesTransferencia.add(this.jMenuItemDuplicarTransferencia);		
			this.jmenuAccionesTransferencia.add(this.jMenuItemCopiarTransferencia);		
			this.jmenuAccionesTransferencia.add(this.jMenuItemVerFormTransferencia);		
			
			this.jmenuDatosTransferencia.add(this.jMenuItemRecargarInformacionTransferencia);				
			this.jmenuDatosTransferencia.add(this.jMenuItemAnterioresTransferencia);				
			this.jmenuDatosTransferencia.add(this.jMenuItemSiguientesTransferencia);				
			this.jmenuDatosTransferencia.add(this.jMenuItemAbrirOrderByTransferencia);				
			this.jmenuDatosTransferencia.add(this.jMenuItemMostrarOcultarTransferencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransferencia.add(this.jMenuItemGuardarCambiosTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransferencia.add(this.jmenuArchivoTransferencia);		
			this.jmenuBarTransferencia.add(this.jmenuAccionesTransferencia);		
			this.jmenuBarTransferencia.add(this.jmenuDatosTransferencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransferencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransferencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableTransferencia.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableTransferencia= new JButtonMe();
		this.jButtonFK_IdAsientoContableTransferencia.setText("Buscar");
		this.jButtonFK_IdAsientoContableTransferencia.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableTransferencia,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia.setFocusable(false);

		this.jPanelFK_IdEmpleadoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoTransferencia.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoTransferencia= new JButtonMe();
		this.jButtonFK_IdEmpleadoTransferencia.setText("Buscar");
		this.jButtonFK_IdEmpleadoTransferencia.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoTransferencia,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoTransferencia = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoTransferencia.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoTransferencia.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoTransferencia= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia.setFocusable(false);

		this.jPanelFK_IdEstadoInventarioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoInventarioTransferencia.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoInventarioTransferencia= new JButtonMe();
		this.jButtonFK_IdEstadoInventarioTransferencia.setText("Buscar");
		this.jButtonFK_IdEstadoInventarioTransferencia.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoInventarioTransferencia,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoInventarioTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia = new JLabelMe();
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia.setText("Estado :");
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia.setToolTipText("Estado");
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia= new JComboBoxMe();
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloTransferencia.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloTransferencia= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloTransferencia.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloTransferencia.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloTransferencia,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransferencia=new JTabbedPane();


		this.jTabbedPaneBusquedasTransferencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransferencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransferencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransferencia = new TransferenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transferencia DATOS");
			this.jInternalFrameDetalleFormTransferencia = new TransferenciaDetalleFormJInternalFrame(jDesktopPane,this.transferenciaSessionBean.getConGuardarRelaciones(),this.transferenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransferencia = null;//new TransferenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferencia= new GridBagLayout();
		
		
		this.jTableDatosTransferencia = new JTableMe();      
		
		String sToolTipTransferencia="";
		sToolTipTransferencia=TransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferencia+="(Inventario.Transferencia)";
		}
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransferencia.setToolTipText(sToolTipTransferencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransferencia);
		this.jTableDatosTransferencia.setAutoCreateRowSorter(true);
		this.jTableDatosTransferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransferencia.setRowSelectionAllowed(true);
		this.jTableDatosTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransferencia = new JButtonMe();
		this.jButtonDuplicarTransferencia = new JButtonMe();
		this.jButtonCopiarTransferencia = new JButtonMe();
		this.jButtonVerFormTransferencia = new JButtonMe();
		this.jButtonNuevoRelacionesTransferencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransferencia = new JButtonMe();
		this.jButtonCerrarTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosTransferencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransferencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Transferencia";
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesTransferencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalTransferencia.setName("jPanelCamposFintotalTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralTransferencia.setName("jPanelCamposFingeneralTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoTransferencia=new ReporteDinamicoJInternalFrame(TransferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransferencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransferencia=new ImportacionJInternalFrame(TransferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransferencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransferencia = new JButtonMe();
		
		this.jButtonAbrirOrderByTransferencia.setText("Orden");
		this.jButtonAbrirOrderByTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencia,false,this);
			
			//this.cargarOrderByTransferencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencia,true,this);
			
			//this.cargarOrderByTransferencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransferencia.setMinimumSize(new Dimension(400,50));//2530
		this.jTableDatosTransferencia.setMaximumSize(new Dimension(400,50));//2530
		this.jTableDatosTransferencia.setPreferredSize(new Dimension(400,50));//2530
		
		this.jScrollPanelDatosTransferencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransferencia.setText("Nuevo");
		this.jButtonDuplicarTransferencia.setText("Duplicar");
		this.jButtonCopiarTransferencia.setText("Copiar");
		this.jButtonVerFormTransferencia.setText("Ver");
		this.jButtonNuevoRelacionesTransferencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransferencia.setText("Guardar");
		this.jButtonCerrarTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferencia,"nuevo_button","Nuevo",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransferencia,"duplicar_button","Duplicar",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransferencia,"copiar_button","Copiar",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransferencia,"ver_form","Ver",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransferencia,"nuevorelaciones_button","Nuevo Rel",this.transferenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferencia,"guardarcambiostabla_button","Guardar",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferencia,"cerrar_button","Salir",this.transferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransferencia.setToolTipText("Nuevo"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransferencia.setToolTipText("Duplicar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransferencia.setToolTipText("Copiar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransferencia.setToolTipText("Ver"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransferencia.setToolTipText("Nuevo Rel"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransferencia.setToolTipText("Guardar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferencia.setToolTipText("Salir"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferencia";
		inputMap = this.jButtonNuevoTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransferencia";
		inputMap = this.jButtonDuplicarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransferencia"));
		
		//COPIAR
		sMapKey = "CopiarTransferencia";
		inputMap = this.jButtonCopiarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransferencia"));
		
		//VEr FORM
		sMapKey = "VerFormTransferencia";
		inputMap = this.jButtonVerFormTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransferencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransferencia";
		inputMap = this.jButtonNuevoRelacionesTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransferencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransferencia";
		inputMap = this.jButtonModificarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransferencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransferencia";
		inputMap = this.jButtonCerrarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Transferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Transferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Transferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Transferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Transferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransferencia.setName("jPanelParametrosReportesTransferencia"); 
		
		this.jPanelParametrosReportesAccionesTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransferencia.setName("jPanelParametrosReportesAccionesTransferencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransferencia = new JButtonMe();
		this.jButtonRecargarInformacionTransferencia.setText("Recargar");
		this.jButtonRecargarInformacionTransferencia.setToolTipText("Recargar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransferencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransferencia = new JButtonMe();
		this.jButtonProcesarInformacionTransferencia.setText("Procesar");
		this.jButtonProcesarInformacionTransferencia.setToolTipText("Procesar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransferencia.setVisible(false);
			
		this.jButtonProcesarInformacionTransferencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransferencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencia.setText("TIPO");       
		this.jComboBoxTiposReportesTransferencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransferencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransferencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransferencia.setText("Accion");
		this.jComboBoxTiposRelacionesTransferencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesTransferencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransferencia.setText("Accion");
		this.jComboBoxTiposSeleccionarTransferencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransferencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransferencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransferencia = new JLabelMe();
		
		this.jLabelAccionesTransferencia.setText("Acciones");		
		this.jLabelAccionesTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransferencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransferencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransferencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransferencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransferencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransferencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransferencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransferencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransferencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransferencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransferencia = new JButtonMe();
		//this.jButtonAnterioresTransferencia.setText("<<");
        this.jButtonAnterioresTransferencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransferencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransferencia = new JButtonMe();
		//this.jButtonSiguientesTransferencia.setText(">>");
        this.jButtonSiguientesTransferencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransferencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransferencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransferencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransferencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransferencia,"nuevoguardarcambios_button","Nue",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransferencia";
		inputMap = this.jButtonNuevoGuardarCambiosTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransferencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransferencia";
		inputMap = this.jButtonRecargarInformacionTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransferencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransferencia";
		inputMap = this.jButtonSiguientesTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransferencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransferencia";
		inputMap = this.jButtonAnterioresTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransferencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransferencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransferencia.setMinimumSize(new Dimension(this.getWidth(),TransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferencia.setMaximumSize(new Dimension(this.getWidth(),TransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferencia.setPreferredSize(new Dimension(this.getWidth(),TransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransferencia = new GridBagLayout();

			this.jPanelPaginacionTransferencia.setLayout(gridaBagLayoutPaginacionTransferencia);						
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = 0;
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransferencia.add(this.jButtonAnterioresTransferencia, this.gridBagConstraintsTransferencia);
					
						
			this.gridBagConstraintsTransferencia = new GridBagConstraints();//
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsTransferencia.gridy = 0;//
			
			this.jPanelPaginacionTransferencia.add(this.jButtonNuevoGuardarCambiosTransferencia, this.gridBagConstraintsTransferencia);//
						
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransferencia.gridy = 0;
			this.jPanelPaginacionTransferencia.add(this.jButtonSiguientesTransferencia, this.gridBagConstraintsTransferencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();//
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTransferencia.gridy = 1;//
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTransferencia.add(this.jButtonNuevoTransferencia, this.gridBagConstraintsTransferencia);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTransferencia = new GridBagConstraints();
				this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransferencia.gridy = 1;
				this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTransferencia.add(this.jButtonNuevoRelacionesTransferencia, this.gridBagConstraintsTransferencia);
			}
			
			
			if(!this.transferenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransferencia = new GridBagConstraints();//
				this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsTransferencia.gridy = 1;//
				this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionTransferencia.add(this.jButtonGuardarCambiosTablaTransferencia, this.gridBagConstraintsTransferencia);//
			}
			
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();//
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTransferencia.gridy = 1;//
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTransferencia.add(this.jButtonDuplicarTransferencia, this.gridBagConstraintsTransferencia);//
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();//
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTransferencia.gridy = 1;//
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTransferencia.add(this.jButtonCopiarTransferencia, this.gridBagConstraintsTransferencia);//
		
			this.gridBagConstraintsTransferencia = new GridBagConstraints();//
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTransferencia.gridy = 1;//
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTransferencia.add(this.jButtonVerFormTransferencia, this.gridBagConstraintsTransferencia);//
		
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = 1;
			this.gridBagConstraintsTransferencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransferencia.add(this.jButtonCerrarTransferencia, this.gridBagConstraintsTransferencia);
		
		
		
		this.jButtonRecargarInformacionTransferencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransferencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransferencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransferencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransferencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransferencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Transferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Transferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Transferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Transferencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransferencia.setLayout(gridaBagParametrosReportesTransferencia);
			this.jPanelParametrosReportesAccionesTransferencia.setLayout(gridaBagParametrosReportesAccionesTransferencia);
			
			
			this.jPanelParametrosAuxiliar1Transferencia.setLayout(gridaBagParametrosAuxiliar1Transferencia);
			this.jPanelParametrosAuxiliar2Transferencia.setLayout(gridaBagParametrosAuxiliar2Transferencia);
			this.jPanelParametrosAuxiliar3Transferencia.setLayout(gridaBagParametrosAuxiliar3Transferencia);
			this.jPanelParametrosAuxiliar4Transferencia.setLayout(gridaBagParametrosAuxiliar4Transferencia);
			//this.jPanelParametrosAuxiliar5Transferencia.setLayout(gridaBagParametrosAuxiliar2Transferencia);			
			
			
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencia.add(this.jButtonRecargarInformacionTransferencia, this.gridBagConstraintsTransferencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencia.add(this.jComboBoxTiposPaginacionTransferencia, this.gridBagConstraintsTransferencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencia.add(this.jCheckBoxConAltoMaximoTablaTransferencia, this.gridBagConstraintsTransferencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencia.add(this.jComboBoxTiposArchivosReportesTransferencia, this.gridBagConstraintsTransferencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencia.add(this.jPanelParametrosAuxiliar1Transferencia, this.gridBagConstraintsTransferencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Transferencia.add(this.jComboBoxTiposReportesTransferencia, this.gridBagConstraintsTransferencia);																		
			
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Transferencia.add(this.jComboBoxTiposGraficosReportesTransferencia, this.gridBagConstraintsTransferencia);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencia.add(this.jPanelParametrosAuxiliar4Transferencia, this.gridBagConstraintsTransferencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencia.add(this.jComboBoxTiposReportesTransferencia, this.gridBagConstraintsTransferencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencia.add(this.jCheckBoxGenerarReporteTransferencia, this.gridBagConstraintsTransferencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencia.add(this.jPanelParametrosAuxiliar2Transferencia, this.gridBagConstraintsTransferencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencia.add(this.jLabelAccionesTransferencia, this.gridBagConstraintsTransferencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransferencia = new GridBagConstraints();
				this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransferencia.add(this.jButtonAbrirOrderByTransferencia, this.gridBagConstraintsTransferencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencia.add(this.jComboBoxTiposSeleccionarTransferencia, this.gridBagConstraintsTransferencia);			
			
			
			/*
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencia.add(this.jCheckBoxSeleccionarTodosTransferencia, this.gridBagConstraintsTransferencia);
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencia.add(this.jCheckBoxConGraficoReporteTransferencia, this.gridBagConstraintsTransferencia);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencia.add(this.jCheckBoxSeleccionarTodosTransferencia, this.gridBagConstraintsTransferencia);															
				
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencia.add(this.jCheckBoxSeleccionadosTransferencia, this.gridBagConstraintsTransferencia);															
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencia.add(this.jCheckBoxConGraficoReporteTransferencia, this.gridBagConstraintsTransferencia);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencia.add(this.jPanelParametrosAuxiliar3Transferencia, this.gridBagConstraintsTransferencia);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencia.add(this.jComboBoxTiposRelacionesTransferencia, this.gridBagConstraintsTransferencia);
				
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencia.add(this.jComboBoxTiposAccionesTransferencia, this.gridBagConstraintsTransferencia);
	
				
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencia.add(this.jTextFieldValorCampoGeneralTransferencia, this.gridBagConstraintsTransferencia);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalTransferencia= new GridBagLayout();
		this.jPanelCamposFintotalTransferencia.setLayout(gridaBagLayoutCamposFintotalTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciogeneralTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneralTransferencia.setLayout(gridaBagLayoutCamposIniciogeneralTransferencia);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransferencia = new GridBagLayout();

			this.jScrollPanelDatosTransferencia.setLayout(gridaBagLayoutDatosTransferencia);
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = 0;
			this.gridBagConstraintsTransferencia.gridx = 0;
			
			this.jScrollPanelDatosTransferencia.add(this.jTableDatosTransferencia, this.gridBagConstraintsTransferencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransferencia.setViewportView(this.jTableDatosTransferencia);
		this.jTableDatosTransferencia.setFillsViewportHeight(true);
		this.jTableDatosTransferencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransferencia= new GridBagLayout();
		this.jPanelAccionesTransferencia.setLayout(gridaBagLayoutAccionesTransferencia);
		
		
		/*	
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 0;
			
		this.jPanelAccionesTransferencia.add(this.jButtonNuevoTransferencia, this.gridBagConstraintsTransferencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableTransferencia.setLayout(gridaBagLayoutFK_IdAsientoContableTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdAsientoContableTransferencia.add(jLabelid_asiento_contableFK_IdAsientoContableTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 1;
		jPanelFK_IdAsientoContableTransferencia.add(jComboBoxid_asiento_contableFK_IdAsientoContableTransferencia, gridBagConstraintsTransferencia);


		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdAsientoContableTransferencia.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 1;
		gridBagConstraintsTransferencia.gridx =1;
		jPanelFK_IdAsientoContableTransferencia.add(jButtonFK_IdAsientoContableTransferencia, gridBagConstraintsTransferencia);

		jTabbedPaneBusquedasTransferencia.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableTransferencia);
		jTabbedPaneBusquedasTransferencia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoTransferencia.setLayout(gridaBagLayoutFK_IdEmpleadoTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdEmpleadoTransferencia.add(jLabelid_empleadoFK_IdEmpleadoTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 1;
		jPanelFK_IdEmpleadoTransferencia.add(jComboBoxid_empleadoFK_IdEmpleadoTransferencia, gridBagConstraintsTransferencia);


		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdEmpleadoTransferencia.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 1;
		gridBagConstraintsTransferencia.gridx =1;
		jPanelFK_IdEmpleadoTransferencia.add(jButtonFK_IdEmpleadoTransferencia, gridBagConstraintsTransferencia);

		jTabbedPaneBusquedasTransferencia.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoTransferencia);
		jTabbedPaneBusquedasTransferencia.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoInventarioTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoInventarioTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoInventarioTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoInventarioTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoInventarioTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoInventarioTransferencia.setLayout(gridaBagLayoutFK_IdEstadoInventarioTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdEstadoInventarioTransferencia.add(jLabelid_estado_inventarioFK_IdEstadoInventarioTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 1;
		jPanelFK_IdEstadoInventarioTransferencia.add(jComboBoxid_estado_inventarioFK_IdEstadoInventarioTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 1;
		gridBagConstraintsTransferencia.gridx =1;
		jPanelFK_IdEstadoInventarioTransferencia.add(jButtonFK_IdEstadoInventarioTransferencia, gridBagConstraintsTransferencia);

		jTabbedPaneBusquedasTransferencia.addTab("3.-Por Estado ", jPanelFK_IdEstadoInventarioTransferencia);
		jTabbedPaneBusquedasTransferencia.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloTransferencia.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloTransferencia.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 0;
		gridBagConstraintsTransferencia.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloTransferencia.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTransferencia, gridBagConstraintsTransferencia);

		gridBagConstraintsTransferencia = new GridBagConstraints();
		gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencia.gridy = 1;
		gridBagConstraintsTransferencia.gridx =1;
		jPanelFK_IdTipoTransaccionModuloTransferencia.add(jButtonFK_IdTipoTransaccionModuloTransferencia, gridBagConstraintsTransferencia);

		jTabbedPaneBusquedasTransferencia.addTab("4.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloTransferencia);
		jTabbedPaneBusquedasTransferencia.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencia.gridx = 0;		
			//this.gridBagConstraintsTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransferencia, this.gridBagConstraintsTransferencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransferencia.gridx = 0;		
		//this.gridBagConstraintsTransferencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransferencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransferencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencia.gridx = 0;		
			this.gridBagConstraintsTransferencia.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransferencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransferencia, this.gridBagConstraintsTransferencia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransferencia, this.gridBagConstraintsTransferencia);								
		
		
		/*
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransferencia, this.gridBagConstraintsTransferencia);
		*/		
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferencia.gridx =0;
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferencia, this.gridBagConstraintsTransferencia);
				
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransferencia, this.gridBagConstraintsTransferencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferencia = new GridBagLayout();
			this.jPanelBusquedasParametrosTransferencia.setLayout(gridaBagLayoutBusquedasParametrosTransferencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferencia, this.gridBagConstraintsTransferencia);
			
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferencia, this.gridBagConstraintsTransferencia);
		
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferencia, this.gridBagConstraintsTransferencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransferencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransferencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransferencia.setName("jPanelReporteDinamicoTransferencia"); 
		
		this.jPanelReporteDinamicoTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransferencia.setLayout(gridaBagLayoutReporteDinamicoTransferencia);
		
		
		this.jInternalFrameReporteDinamicoTransferencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransferencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransferencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransferencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransferencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransferencia = new JLabelMe();

		this.jLabelColumnasSelectReporteTransferencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelColumnasSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransferencia = new JList<Reporte>();
		this.jListColumnasSelectReporteTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransferencia=new JScrollPane(this.jListColumnasSelectReporteTransferencia);
			
			this.jScrollColumnasSelectReporteTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransferencia.add(this.jListColumnasSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		this.jPanelReporteDinamicoTransferencia.add(this.jScrollColumnasSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransferencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransferencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelRelacionesSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransferencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransferencia=new JScrollPane(this.jListRelacionesSelectReporteTransferencia);
			
			this.jScrollRelacionesSelectReporteTransferencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransferencia.add(this.jListRelacionesSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		this.jPanelReporteDinamicoTransferencia.add(this.jScrollRelacionesSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTransferencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransferencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransferencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransferencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransferencia = new JLabelMe();

		this.jLabelConGraficoDinamicoTransferencia.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelConGraficoDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransferencia.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferencia.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jCheckBoxConGraficoDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransferencia.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelColumnaCategoriaGraficoTransferencia, this.gridBagConstraintsTransferencia);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransferencia.add(this.jComboBoxColumnaCategoriaGraficoTransferencia, this.gridBagConstraintsTransferencia);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransferencia.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelColumnaCategoriaValorTransferencia, this.gridBagConstraintsTransferencia);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransferencia.add(this.jComboBoxColumnaCategoriaValorTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransferencia = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransferencia.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelColumnasValoresGraficoTransferencia, this.gridBagConstraintsTransferencia);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransferencia = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransferencia.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransferencia=new JScrollPane(this.jListColumnasValoresGraficoTransferencia);
			
			this.jScrollColumnasValoresGraficoTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransferencia.add(this.jListColumnasSelectReporteTransferencia, this.gridBagConstraintsTransferencia);
		this.jPanelReporteDinamicoTransferencia.add(this.jScrollColumnasValoresGraficoTransferencia, this.gridBagConstraintsTransferencia);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransferencia = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransferencia.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelTiposGraficosReportesDinamicoTransferencia, this.gridBagConstraintsTransferencia);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferencia.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jComboBoxTiposGraficosReportesDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransferencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransferencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelGenerarExcelReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransferencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransferencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransferencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransferencia.setToolTipText("Generar EXCEL"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransferencia.add(this.jButtonGenerarExcelReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencia.add(this.jComboBoxTiposReportesDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransferencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransferencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencia.add(this.jLabelTiposArchivoReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencia.add(this.jComboBoxTiposArchivosReportesDinamicoTransferencia, this.gridBagConstraintsTransferencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransferencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransferencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransferencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransferencia.setToolTipText("Generar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencia.add(this.jButtonGenerarReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransferencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransferencia.setToolTipText("Cancelar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencia.add(this.jButtonCerrarReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransferencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransferencia= new JScrollPane(jPanelReporteDinamicoTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransferencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransferencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransferencia);
		this.jInternalFrameReporteDinamicoTransferencia.getContentPane().add(this.jScrollPanelReporteDinamicoTransferencia, this.gridBagConstraintsTransferencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransferencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransferencia.setName("jPanelImportacionTransferencia"); 
		
		this.jPanelImportacionTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransferencia.setLayout(gridaBagLayoutImportacionTransferencia);
		
		
		this.jInternalFrameImportacionTransferencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransferencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferencia.setResizable(true);
	    this.jInternalFrameImportacionTransferencia.setClosable(true);
	    this.jInternalFrameImportacionTransferencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferencia.setResizable(true);
	    this.jInternalFrameImportacionTransferencia.setClosable(true);
	    this.jInternalFrameImportacionTransferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransferencia = new JLabelMe();

		this.jLabelArchivoImportacionTransferencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferencia.add(this.jLabelArchivoImportacionTransferencia, this.gridBagConstraintsTransferencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransferencia = new JFileChooser();		
		this.jFileChooserImportacionTransferencia.setToolTipText("ESCOGER ARCHIVO"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransferencia = new JButtonMe();
		this.jButtonAbrirImportacionTransferencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransferencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransferencia.setToolTipText("Generar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencia.add(this.jButtonAbrirImportacionTransferencia, this.gridBagConstraintsTransferencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransferencia = new JLabelMe();

		this.jLabelPathArchivoImportacionTransferencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferencia.add(this.jLabelPathArchivoImportacionTransferencia, this.gridBagConstraintsTransferencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransferencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransferencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencia.add(this.jTextFieldPathArchivoImportacionTransferencia, this.gridBagConstraintsTransferencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransferencia = new JButtonMe();
		this.jButtonGenerarImportacionTransferencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransferencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransferencia.setToolTipText("Generar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencia.add(this.jButtonGenerarImportacionTransferencia, this.gridBagConstraintsTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransferencia = new JButtonMe();
		this.jButtonCerrarImportacionTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransferencia.setToolTipText("Cancelar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencia.add(this.jButtonCerrarImportacionTransferencia, this.gridBagConstraintsTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransferencia = new GridBagLayout();
		
		this.jScrollPanelImportacionTransferencia= new JScrollPane(jPanelImportacionTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iPosYImportacion;
		this.gridBagConstraintsTransferencia.gridx =iPosXImportacion;
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransferencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransferencia);
		this.jInternalFrameImportacionTransferencia.getContentPane().add(this.jScrollPanelImportacionTransferencia, this.gridBagConstraintsTransferencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransferencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransferencia = new JButtonMe();
			this.jButtonAbrirOrderByTransferencia.setText("Orden");
			this.jButtonAbrirOrderByTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransferencia";
			inputMap = this.jButtonAbrirOrderByTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransferencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransferencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransferencia.setName("jPanelOrderByTransferencia"); 
			
			this.jPanelOrderByTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransferencia.setLayout(gridaBagLayoutOrderByTransferencia);
			
			
			this.jTableDatosTransferenciaOrderBy = new JTableMe();        
			this.jTableDatosTransferenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransferenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransferenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransferenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransferenciaOrderBy.setViewportView(this.jTableDatosTransferenciaOrderBy);
			this.jTableDatosTransferenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransferenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransferencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransferencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransferencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransferencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransferencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransferencia.setTitle("Orden");
			this.jInternalFrameOrderByTransferencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransferencia.setResizable(true);
			this.jInternalFrameOrderByTransferencia.setClosable(true);
			this.jInternalFrameOrderByTransferencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransferencia.ipady =150;
				
			this.jPanelOrderByTransferencia.add(jScrollPanelDatosTransferenciaOrderBy, this.gridBagConstraintsTransferencia);//this.jTableDatosTransferenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransferencia = new JButtonMe();
			this.jButtonCerrarOrderByTransferencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransferencia.setToolTipText("Cancelar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransferencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransferencia.add(this.jButtonCerrarOrderByTransferencia, this.gridBagConstraintsTransferencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransferencia = new GridBagLayout();
			
			this.jScrollPanelOrderByTransferencia= new JScrollPane(jPanelOrderByTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransferencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransferencia);
			
			this.jInternalFrameOrderByTransferencia.getContentPane().add(this.jScrollPanelOrderByTransferencia, this.gridBagConstraintsTransferencia);			
		
		} else {
			this.jButtonAbrirOrderByTransferencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//6430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transferenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransferencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransferencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransferencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransferencia.getRowHeight();//TransferenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferencia.isSelected()) {
					iHeightTable=TransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferencia.isSelected()) {
					iHeightTable=TransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransferencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransferencia!=null && this.jInternalFrameOrderByTransferencia.getjTableDatosOrderBy()!=null) {
			//if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransferencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransferencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransferencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransferencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransferencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransferencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransferencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transferenciaLogic.getTransferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferencias.size();
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
	public static List<Transferencia> TraerTransferenciaBeans(List<Transferencia> transferencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Transferencia transferencia:transferencias) {
					
				if(!(TransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transferencia.setsDetalleGeneralEntityReporte(TransferenciaConstantesFunciones.getTransferenciaDescripcion(transferencia));
										
						
					
					

					if(transferencia.getDetalleTransferencias()!=null && Funciones.existeClass(classes,DetalleTransferencia.class)) {
						try{transferencia.setdetalletransferenciasDescripcionReporte(new JRBeanCollectionDataSource(DetalleTransferenciaJInternalFrame.TraerDetalleTransferenciaBeans(transferencia.getDetalleTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//transferencia.setsDetalleGeneralEntityReporte(transferencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//transferenciabeans.add(transferenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transferencias;
    }
	//PARA REPORTES FIN
}
