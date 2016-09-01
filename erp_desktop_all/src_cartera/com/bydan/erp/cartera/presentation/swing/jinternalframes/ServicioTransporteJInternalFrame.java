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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.cartera.util.ServicioTransporteConstantesFunciones;

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
public class ServicioTransporteJInternalFrame extends ServicioTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarServicioTransporte;
	
	protected JMenuBar jmenuBarServicioTransporte;
	
	protected JMenu jmenuServicioTransporte;
	protected JMenu jmenuDatosServicioTransporte;
	protected JMenu jmenuArchivoServicioTransporte;
	protected JMenu jmenuAccionesServicioTransporte;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicioTransporte;	
	protected GridBagConstraints gridBagConstraintsServicioTransporte;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ServicioTransporteDetalleFormJInternalFrame jInternalFrameDetalleFormServicioTransporte;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoServicioTransporte;	
	protected ImportacionJInternalFrame jInternalFrameImportacionServicioTransporte;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vehiculo="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";
	
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public VehiculoSessionBean vehiculoSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ServicioTransporte> serviciotransportes;		
	public List<ServicioTransporte> serviciotransportesEliminados;	
	public List<ServicioTransporte> serviciotransportesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByServicioTransporte;		
	protected JButton jButtonAbrirOrderByServicioTransporte;
	
	
	//protected JPanel jPanelOrderByServicioTransporte;
	//public JScrollPane jScrollPanelOrderByServicioTransporte;	
	//protected JButton jButtonCerrarOrderByServicioTransporte;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ServicioTransporteLogic serviciotransporteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosServicioTransporte;
	public JScrollPane jScrollPanelDatosEdicionServicioTransporte;
	public JScrollPane jScrollPanelDatosGeneralServicioTransporte;
    
	
	
	//public JScrollPane jScrollPanelDatosServicioTransporteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoServicioTransporte;
	//public JScrollPane jScrollPanelImportacionServicioTransporte;
	
	
	
	protected JPanel jPanelAccionesServicioTransporte;
	
    protected JPanel jPanelPaginacionServicioTransporte;
    protected JPanel jPanelParametrosReportesServicioTransporte;
	protected JPanel jPanelParametrosReportesAccionesServicioTransporte;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar2ServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar3ServicioTransporte;
	protected JPanel jPanelParametrosAuxiliar4ServicioTransporte;
	//protected JPanel jPanelParametrosAuxiliar5ServicioTransporte;
	
	
	
	//protected JPanel jPanelReporteDinamicoServicioTransporte;
	//protected JPanel jPanelImportacionServicioTransporte;
	
	
	public JTable jTableDatosServicioTransporte;
	
	
	
	//public JTable jTableDatosServicioTransporteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoServicioTransporte;
	protected JButton jButtonDuplicarServicioTransporte;
	protected JButton jButtonCopiarServicioTransporte;
	protected JButton jButtonVerFormServicioTransporte;
	protected JButton jButtonNuevoRelacionesServicioTransporte;
	protected JButton jButtonModificarServicioTransporte;
	
    protected JButton jButtonGuardarCambiosTablaServicioTransporte;
	protected JButton jButtonCerrarServicioTransporte;
	
	
	protected JButton jButtonRecargarInformacionServicioTransporte;
	protected JButton jButtonProcesarInformacionServicioTransporte;
	
	
	protected JButton jButtonAnterioresServicioTransporte;
	protected JButton jButtonSiguientesServicioTransporte;
	protected JButton jButtonNuevoGuardarCambiosServicioTransporte;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoServicioTransporte;
	//protected JButton jButtonCerrarReporteDinamicoServicioTransporte;
	//protected JButton jButtonGenerarExcelReporteDinamicoServicioTransporte;	
	
	
	
	//protected JButton jButtonAbrirImportacionServicioTransporte;
	//protected JButton jButtonGenerarImportacionServicioTransporte;
	//protected JButton jButtonCerrarImportacionServicioTransporte;
	//protected JFileChooser jFileChooserImportacionServicioTransporte;
	//protected File fileImportacionServicioTransporte;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicioTransporte;
	protected JButton jButtonDuplicarToolBarServicioTransporte;
	protected JButton jButtonNuevoRelacionesToolBarServicioTransporte;
	
	
	public JButton jButtonGuardarCambiosToolBarServicioTransporte;
	protected JButton jButtonCopiarToolBarServicioTransporte;
	protected JButton jButtonVerFormToolBarServicioTransporte;
	public JButton jButtonGuardarCambiosTablaToolBarServicioTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarServicioTransporte;
	protected JButton jButtonCerrarToolBarServicioTransporte;
	
	protected JButton jButtonRecargarInformacionToolBarServicioTransporte;
	protected JButton jButtonProcesarInformacionToolBarServicioTransporte;
	protected JButton jButtonAnterioresToolBarServicioTransporte;
	protected JButton jButtonSiguientesToolBarServicioTransporte;
	protected JButton jButtonNuevoGuardarCambiosToolBarServicioTransporte;
	protected JButton jButtonAbrirOrderByToolBarServicioTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicioTransporte;
	protected JMenuItem jMenuItemDuplicarServicioTransporte;
	protected JMenuItem jMenuItemNuevoRelacionesServicioTransporte;
	
	
	protected JMenuItem jMenuItemGuardarCambiosServicioTransporte;
	protected JMenuItem jMenuItemCopiarServicioTransporte;
	protected JMenuItem jMenuItemVerFormServicioTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicioTransporte;
	protected JMenuItem jMenuItemCerrarServicioTransporte;
	protected JMenuItem jMenuItemDetalleCerrarServicioTransporte;
	protected JMenuItem jMenuItemDetalleAbrirOrderByServicioTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicioTransporte;
	
	protected JMenuItem jMenuItemRecargarInformacionServicioTransporte;
	protected JMenuItem jMenuItemProcesarInformacionServicioTransporte;
	protected JMenuItem jMenuItemAnterioresServicioTransporte;
	protected JMenuItem jMenuItemSiguientesServicioTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicioTransporte;
	protected JMenuItem jMenuItemAbrirOrderByServicioTransporte;
	protected JMenuItem jMenuItemMostrarOcultarServicioTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicioTransporte;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosServicioTransporte;
	protected JCheckBox jCheckBoxSeleccionadosServicioTransporte;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaServicioTransporte;
	protected JCheckBox jCheckBoxConGraficoReporteServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesServicioTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoServicioTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoServicioTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarServicioTransporte;
	protected JTextField jTextFieldValorCampoGeneralServicioTransporte;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteServicioTransporte;
	//public JList<Reporte> jListColumnasSelectReporteServicioTransporte;
	//public JScrollPane jScrollColumnasSelectReporteServicioTransporte;
	
	//public JLabel jLabelRelacionesSelectReporteServicioTransporte;
	//public JList<Reporte> jListRelacionesSelectReporteServicioTransporte;
	//public JScrollPane jScrollRelacionesSelectReporteServicioTransporte;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoServicioTransporte;
	//protected JCheckBox jCheckBoxConGraficoDinamicoServicioTransporte;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoServicioTransporte;
	//public JLabel jLabelTiposArchivoReporteDinamicoServicioTransporte;
	
		
	//public JLabel jLabelArchivoImportacionServicioTransporte;	
	//public JLabel jLabelPathArchivoImportacionServicioTransporte;
	//protected JTextField jTextFieldPathArchivoImportacionServicioTransporte;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoServicioTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoServicioTransporte;
	
	//public JLabel jLabelColumnaCategoriaValorServicioTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorServicioTransporte;
	
	//public JLabel jLabelColumnasValoresGraficoServicioTransporte;
	//public JList<Reporte> jListColumnasValoresGraficoServicioTransporte;
	//public JScrollPane jScrollColumnasValoresGraficoServicioTransporte;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoServicioTransporte;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoServicioTransporte;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasServicioTransporte;
	public JPanel jPanelFK_IdClienteServicioTransporte;
	public JButton jButtonFK_IdClienteServicioTransporte;
	public JPanel jPanelFK_IdClienteProveedorServicioTransporte;
	public JButton jButtonFK_IdClienteProveedorServicioTransporte;
	public JPanel jPanelFK_IdDetalleActivoFijoServicioTransporte;
	public JButton jButtonFK_IdDetalleActivoFijoServicioTransporte;
	public JPanel jPanelFK_IdRutaTransporteServicioTransporte;
	public JButton jButtonFK_IdRutaTransporteServicioTransporte;
	public JPanel jPanelFK_IdTransportistaServicioTransporte;
	public JButton jButtonFK_IdTransportistaServicioTransporte;
	public JPanel jPanelFK_IdVehiculoServicioTransporte;
	public JButton jButtonFK_IdVehiculoServicioTransporte;
	
	public JPanel jPanelid_clienteFK_IdClienteServicioTransporte;
	public JLabel jLabelid_clienteFK_IdClienteServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteServicioTransporte;
	public JButton jButtonid_clienteFK_IdClienteServicioTransporte= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteServicioTransporteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteServicioTransporte;
	
	public JPanel jPanelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte;
	public JLabel jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte;
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorServicioTransporte= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorServicioTransporteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte;
	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ruta_transporteFK_IdRutaTransporteServicioTransporte;
	public JLabel jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte;
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteServicioTransporte= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaServicioTransporte;
	public JLabel jLabelid_transportistaFK_IdTransportistaServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaServicioTransporte;
	public JButton jButtonid_transportistaFK_IdTransportistaServicioTransporte= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vehiculoFK_IdVehiculoServicioTransporte;
	public JLabel jLabelid_vehiculoFK_IdVehiculoServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte;
	public JButton jButtonid_vehiculoFK_IdVehiculoServicioTransporte= new JButtonMe();
	public JButton jButtonid_vehiculoFK_IdVehiculoServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_vehiculoFK_IdVehiculoServicioTransporteBusqueda= new JButtonMe();

	
	
	
	
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
	public ServicioTransporteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioTransporteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionServicioTransporte)	{
		this.jButtonRecargarInformacionServicioTransporte = jButtonRecargarInformacionServicioTransporte;
	}
	
	public JButton getjButtonProcesarInformacionServicioTransporte() {
		return this.jButtonProcesarInformacionServicioTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicioTransporte)	{
		this.jButtonProcesarInformacionServicioTransporte = jButtonProcesarInformacionServicioTransporte;
	}
	
	
	public JButton getjButtonRecargarInformacionServicioTransporte() {
		return this.jButtonRecargarInformacionServicioTransporte;
	}
	
	
	public List<ServicioTransporte> getserviciotransportes() {
		return this.serviciotransportes;
	}

	public void setserviciotransportes(List<ServicioTransporte> serviciotransportes) {
		this.serviciotransportes = serviciotransportes;
	}
	
	public List<ServicioTransporte> getserviciotransportesAux() {
		return this.serviciotransportesAux;
	}

	public void setserviciotransportesAux(List<ServicioTransporte> serviciotransportesAux) {
		this.serviciotransportesAux = serviciotransportesAux;
	}
	
	public List<ServicioTransporte> getserviciotransportesEliminados() {
		return this.serviciotransportesEliminados;
	}

	public void setServicioTransportesEliminados(List<ServicioTransporte> serviciotransportesEliminados) {
		this.serviciotransportesEliminados = serviciotransportesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarServicioTransporte() {
		return jComboBoxTiposSeleccionarServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarServicioTransporte(
			JComboBox jComboBoxTiposSeleccionarServicioTransporte) {
		this.jComboBoxTiposSeleccionarServicioTransporte = jComboBoxTiposSeleccionarServicioTransporte;
	}
	
	public void setBorderResaltarTiposSeleccionarServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarServicioTransporte .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralServicioTransporte() {
		return jTextFieldValorCampoGeneralServicioTransporte;
	}

	public void setjTextFieldValorCampoGeneralServicioTransporte(
			JTextField jTextFieldValorCampoGeneralServicioTransporte) {
		this.jTextFieldValorCampoGeneralServicioTransporte = jTextFieldValorCampoGeneralServicioTransporte;
	}

	public void setBorderResaltarValorCampoGeneralServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralServicioTransporte .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosServicioTransporte() {
		return this.jCheckBoxSeleccionarTodosServicioTransporte;
	}

	public void setjCheckBoxSeleccionarTodosServicioTransporte(
			JCheckBox jCheckBoxSeleccionarTodosServicioTransporte) {
		this.jCheckBoxSeleccionarTodosServicioTransporte = jCheckBoxSeleccionarTodosServicioTransporte;
	}

	public void setBorderResaltarSeleccionarTodosServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosServicioTransporte .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosServicioTransporte() {
		return this.jCheckBoxSeleccionadosServicioTransporte;
	}

	public void setjCheckBoxSeleccionadosServicioTransporte(
			JCheckBox jCheckBoxSeleccionadosServicioTransporte) {
		this.jCheckBoxSeleccionadosServicioTransporte = jCheckBoxSeleccionadosServicioTransporte;
	}
	
	public void setBorderResaltarSeleccionadosServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosServicioTransporte .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesServicioTransporte() {
		return this.jComboBoxTiposArchivosReportesServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesServicioTransporte(
			JComboBox jComboBoxTiposArchivosReportesServicioTransporte) {
		this.jComboBoxTiposArchivosReportesServicioTransporte = jComboBoxTiposArchivosReportesServicioTransporte;
	}

	public void setBorderResaltarTiposArchivosReportesServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesServicioTransporte() {
		return this.jComboBoxTiposReportesServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesServicioTransporte(
			JComboBox jComboBoxTiposReportesServicioTransporte) {
		this.jComboBoxTiposReportesServicioTransporte = jComboBoxTiposReportesServicioTransporte;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoServicioTransporte() {
	//	return jComboBoxTiposReportesDinamicoServicioTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoServicioTransporte(
	//		JComboBox jComboBoxTiposReportesDinamicoServicioTransporte) {
	//	this.jComboBoxTiposReportesDinamicoServicioTransporte = jComboBoxTiposReportesDinamicoServicioTransporte;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoServicioTransporte() {
	//	return jComboBoxTiposArchivosReportesDinamicoServicioTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoServicioTransporte(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoServicioTransporte) {
	//	this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte = jComboBoxTiposArchivosReportesDinamicoServicioTransporte;
	//}
	
	public void setBorderResaltarTiposReportesServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesServicioTransporte() {
		return this.jComboBoxTiposGraficosReportesServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesServicioTransporte(
			JComboBox jComboBoxTiposGraficosReportesServicioTransporte) {
		this.jComboBoxTiposGraficosReportesServicioTransporte = jComboBoxTiposGraficosReportesServicioTransporte;
	}
	
	public void setBorderResaltarTiposGraficosReportesServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionServicioTransporte() {
		return this.jComboBoxTiposPaginacionServicioTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionServicioTransporte(
			JComboBox jComboBoxTiposPaginacionServicioTransporte) {
		this.jComboBoxTiposPaginacionServicioTransporte = jComboBoxTiposPaginacionServicioTransporte;
	}
	
	public void setBorderResaltarTiposPaginacionServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionServicioTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesServicioTransporte() {
		return this.jComboBoxTiposRelacionesServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicioTransporte() {
		return this.jComboBoxTiposAccionesServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicioTransporte(
			JComboBox jComboBoxTiposRelacionesServicioTransporte) {
		this.jComboBoxTiposRelacionesServicioTransporte = jComboBoxTiposRelacionesServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicioTransporte(
			JComboBox jComboBoxTiposAccionesServicioTransporte) {
		this.jComboBoxTiposAccionesServicioTransporte = jComboBoxTiposAccionesServicioTransporte;
	}
	
	public void setBorderResaltarTiposRelacionesServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesServicioTransporte .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesServicioTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesServicioTransporte .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoServicioTransporte() {
	//	return jCheckBoxConGraficoDinamicoServicioTransporte;
	//}

	//public void setjCheckBoxConGraficoDinamicoServicioTransporte(
	//		JCheckBox jCheckBoxConGraficoDinamicoServicioTransporte) {
	//	this.jCheckBoxConGraficoDinamicoServicioTransporte = jCheckBoxConGraficoDinamicoServicioTransporte;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoServicioTransporte() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarServicioTransporte.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoServicioTransporte .setBorder(borderResaltar);		
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
		this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		
		this.serviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.serviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.serviciotransporteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
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
		
		ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarServicioTransporte= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"nuevo","nuevo","Nuevo"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"duplicar","duplicar","Duplicar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"copiar","copiar","Copiar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"ver_form","ver_form","Ver"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"recargar","recargar","Recargar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarServicioTransporte,this.jTtoolBarServicioTransporte,
							"cerrar","cerrar","Salir"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarServicioTransporte=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarServicioTransporte;
			
				this.jButtonProcesarInformacionToolBarServicioTransporte=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarServicioTransporte;
				
		//protected JButton jButtonModificarToolBarServicioTransporte;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarServicioTransporte=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuServicioTransporte=new JMenuMe("General");
		this.jmenuArchivoServicioTransporte=new JMenuMe("Archivo");
		this.jmenuAccionesServicioTransporte=new JMenuMe("Acciones");
		this.jmenuDatosServicioTransporte=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicioTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicioTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicioTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarServicioTransporte= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarServicioTransporte.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarServicioTransporte,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesServicioTransporte= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesServicioTransporte.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesServicioTransporte,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosServicioTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicioTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicioTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarServicioTransporte= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarServicioTransporte.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarServicioTransporte,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormServicioTransporte= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormServicioTransporte.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormServicioTransporte,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaServicioTransporte= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaServicioTransporte.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaServicioTransporte,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionServicioTransporte= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionServicioTransporte.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionServicioTransporte,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionServicioTransporte= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionServicioTransporte.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionServicioTransporte,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresServicioTransporte= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresServicioTransporte.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresServicioTransporte,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesServicioTransporte= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesServicioTransporte.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesServicioTransporte,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByServicioTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByServicioTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByServicioTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByServicioTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByServicioTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByServicioTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosServicioTransporte= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosServicioTransporte.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosServicioTransporte,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoServicioTransporte.add(this.jMenuItemCerrarServicioTransporte);
			
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemNuevoServicioTransporte);
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemNuevoGuardarCambiosServicioTransporte);
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemNuevoRelacionesServicioTransporte);
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemGuardarCambiosTablaServicioTransporte);		
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemDuplicarServicioTransporte);		
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemCopiarServicioTransporte);		
			this.jmenuAccionesServicioTransporte.add(this.jMenuItemVerFormServicioTransporte);		
			
			this.jmenuDatosServicioTransporte.add(this.jMenuItemRecargarInformacionServicioTransporte);				
			this.jmenuDatosServicioTransporte.add(this.jMenuItemAnterioresServicioTransporte);				
			this.jmenuDatosServicioTransporte.add(this.jMenuItemSiguientesServicioTransporte);				
			this.jmenuDatosServicioTransporte.add(this.jMenuItemAbrirOrderByServicioTransporte);				
			this.jmenuDatosServicioTransporte.add(this.jMenuItemMostrarOcultarServicioTransporte);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesServicioTransporte.add(this.jMenuItemGuardarCambiosServicioTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarServicioTransporte.add(this.jmenuArchivoServicioTransporte);		
			this.jmenuBarServicioTransporte.add(this.jmenuAccionesServicioTransporte);		
			this.jmenuBarServicioTransporte.add(this.jmenuDatosServicioTransporte);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarServicioTransporte);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasServicioTransporte() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteServicioTransporte.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteServicioTransporte= new JButtonMe();
		this.jButtonFK_IdClienteServicioTransporte.setText("Buscar");
		this.jButtonFK_IdClienteServicioTransporte.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteServicioTransporte,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteServicioTransporte = new JLabelMe();
		jLabelid_clienteFK_IdClienteServicioTransporte.setText("Cliente :");
		jLabelid_clienteFK_IdClienteServicioTransporte.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteServicioTransporte= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte.setFocusable(false);

		this.jPanelFK_IdClienteProveedorServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorServicioTransporte.setToolTipText("Buscar Por Cliente Proveedor ");
		this.jButtonFK_IdClienteProveedorServicioTransporte= new JButtonMe();
		this.jButtonFK_IdClienteProveedorServicioTransporte.setText("Buscar");
		this.jButtonFK_IdClienteProveedorServicioTransporte.setToolTipText("Buscar Por Cliente Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorServicioTransporte,"buscar_button","Buscar Por Cliente Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte = new JLabelMe();
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setText("Cliente Proveedor :");
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setToolTipText("Cliente Proveedor");
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte= new JComboBoxMe();
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte= new JButtonMe();
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte.setFocusable(false);

		this.jPanelFK_IdDetalleActivoFijoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoServicioTransporte.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoServicioTransporte= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoServicioTransporte.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoServicioTransporte.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoServicioTransporte,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRutaTransporteServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRutaTransporteServicioTransporte.setToolTipText("Buscar Por Ruta Transporte ");
		this.jButtonFK_IdRutaTransporteServicioTransporte= new JButtonMe();
		this.jButtonFK_IdRutaTransporteServicioTransporte.setText("Buscar");
		this.jButtonFK_IdRutaTransporteServicioTransporte.setToolTipText("Buscar Por Ruta Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRutaTransporteServicioTransporte,"buscar_button","Buscar Por Ruta Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRutaTransporteServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte = new JLabelMe();
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setText("Ruta Transporte :");
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setToolTipText("Ruta Transporte");
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte= new JComboBoxMe();
		jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaServicioTransporte.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaServicioTransporte= new JButtonMe();
		this.jButtonFK_IdTransportistaServicioTransporte.setText("Buscar");
		this.jButtonFK_IdTransportistaServicioTransporte.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaServicioTransporte,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaServicioTransporte = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaServicioTransporte.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaServicioTransporte.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaServicioTransporte= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVehiculoServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVehiculoServicioTransporte.setToolTipText("Buscar Por Vehiculo ");
		this.jButtonFK_IdVehiculoServicioTransporte= new JButtonMe();
		this.jButtonFK_IdVehiculoServicioTransporte.setText("Buscar");
		this.jButtonFK_IdVehiculoServicioTransporte.setToolTipText("Buscar Por Vehiculo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVehiculoServicioTransporte,"buscar_button","Buscar Por Vehiculo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVehiculoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte = new JLabelMe();
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte.setText("Vehiculo :");
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte.setToolTipText("Vehiculo");
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vehiculoFK_IdVehiculoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vehiculoFK_IdVehiculoServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte= new JComboBoxMe();
		jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasServicioTransporte=new JTabbedPane();


		this.jTabbedPaneBusquedasServicioTransporte.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicioTransporte.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicioTransporte.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleServicioTransporte = new ServicioTransporteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Servicio Transporte DATOS");
			this.jInternalFrameDetalleFormServicioTransporte = new ServicioTransporteDetalleFormJInternalFrame(jDesktopPane,this.serviciotransporteSessionBean.getConGuardarRelaciones(),this.serviciotransporteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormServicioTransporte = null;//new ServicioTransporteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicioTransporte= new GridBagLayout();
		
		
		this.jTableDatosServicioTransporte = new JTableMe();      
		
		String sToolTipServicioTransporte="";
		sToolTipServicioTransporte=ServicioTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicioTransporte+="(Cartera.ServicioTransporte)";
		}
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicioTransporte+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosServicioTransporte.setToolTipText(sToolTipServicioTransporte);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosServicioTransporte);
		this.jTableDatosServicioTransporte.setAutoCreateRowSorter(true);
		this.jTableDatosServicioTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosServicioTransporte.setRowSelectionAllowed(true);
		this.jTableDatosServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosServicioTransporte,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoServicioTransporte = new JButtonMe();
		this.jButtonDuplicarServicioTransporte = new JButtonMe();
		this.jButtonCopiarServicioTransporte = new JButtonMe();
		this.jButtonVerFormServicioTransporte = new JButtonMe();
		this.jButtonNuevoRelacionesServicioTransporte = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaServicioTransporte = new JButtonMe();
		this.jButtonCerrarServicioTransporte = new JButtonMe();
		
		this.jScrollPanelDatosServicioTransporte = new JScrollPane();   
        this.jScrollPanelDatosGeneralServicioTransporte = new JScrollPane();
		
				
		
		
		this.jPanelAccionesServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Servicio Transporte";
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesServicioTransporte.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoServicioTransporte=new ReporteDinamicoJInternalFrame(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoServicioTransporte();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionServicioTransporte=new ImportacionJInternalFrame(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionServicioTransporte();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByServicioTransporte = new JButtonMe();
		
		this.jButtonAbrirOrderByServicioTransporte.setText("Orden");
		this.jButtonAbrirOrderByServicioTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicioTransporte,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioTransporte,false,this);
			
			//this.cargarOrderByServicioTransporte(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioTransporte,true,this);
			
			//this.cargarOrderByServicioTransporte(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosServicioTransporte.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosServicioTransporte.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosServicioTransporte.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosServicioTransporte.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicioTransporte.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicioTransporte.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoServicioTransporte.setText("Nuevo");
		this.jButtonDuplicarServicioTransporte.setText("Duplicar");
		this.jButtonCopiarServicioTransporte.setText("Copiar");
		this.jButtonVerFormServicioTransporte.setText("Ver");
		this.jButtonNuevoRelacionesServicioTransporte.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaServicioTransporte.setText("Guardar");
		this.jButtonCerrarServicioTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicioTransporte,"nuevo_button","Nuevo",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarServicioTransporte,"duplicar_button","Duplicar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarServicioTransporte,"copiar_button","Copiar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormServicioTransporte,"ver_form","Ver",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesServicioTransporte,"nuevorelaciones_button","Nuevo Rel",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicioTransporte,"guardarcambiostabla_button","Guardar",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicioTransporte,"cerrar_button","Salir",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoServicioTransporte.setToolTipText("Nuevo"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarServicioTransporte.setToolTipText("Duplicar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarServicioTransporte.setToolTipText("Copiar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormServicioTransporte.setToolTipText("Ver"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesServicioTransporte.setToolTipText("Nuevo Rel"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaServicioTransporte.setToolTipText("Guardar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicioTransporte.setToolTipText("Salir"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicioTransporte";
		inputMap = this.jButtonNuevoServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicioTransporte"));
		
		//DUPLICAR
		sMapKey = "DuplicarServicioTransporte";
		inputMap = this.jButtonDuplicarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarServicioTransporte"));
		
		//COPIAR
		sMapKey = "CopiarServicioTransporte";
		inputMap = this.jButtonCopiarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarServicioTransporte"));
		
		//VEr FORM
		sMapKey = "VerFormServicioTransporte";
		inputMap = this.jButtonVerFormServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormServicioTransporte"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesServicioTransporte";
		inputMap = this.jButtonNuevoRelacionesServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesServicioTransporte"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarServicioTransporte";
		inputMap = this.jButtonModificarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarServicioTransporte"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarServicioTransporte";
		inputMap = this.jButtonCerrarServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicioTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicioTransporte";
		inputMap = this.jButtonGuardarCambiosTablaServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicioTransporte"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesServicioTransporte.setName("jPanelParametrosReportesServicioTransporte"); 
		
		this.jPanelParametrosReportesAccionesServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesServicioTransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesServicioTransporte.setName("jPanelParametrosReportesAccionesServicioTransporte"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionServicioTransporte = new JButtonMe();
		this.jButtonRecargarInformacionServicioTransporte.setText("Recargar");
		this.jButtonRecargarInformacionServicioTransporte.setToolTipText("Recargar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionServicioTransporte,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionServicioTransporte = new JButtonMe();
		this.jButtonProcesarInformacionServicioTransporte.setText("Procesar");
		this.jButtonProcesarInformacionServicioTransporte.setToolTipText("Procesar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionServicioTransporte.setVisible(false);
			
		this.jButtonProcesarInformacionServicioTransporte.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicioTransporte.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicioTransporte.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesServicioTransporte.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposReportesServicioTransporte.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicioTransporte.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesServicioTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionServicioTransporte.setText("Paginacion");
		this.jComboBoxTiposPaginacionServicioTransporte.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesServicioTransporte.setText("Accion");
		this.jComboBoxTiposRelacionesServicioTransporte.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicioTransporte.setText("Accion");
		this.jComboBoxTiposAccionesServicioTransporte.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarServicioTransporte.setText("Accion");
		this.jComboBoxTiposSeleccionarServicioTransporte.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralServicioTransporte=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralServicioTransporte.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicioTransporte.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicioTransporte.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesServicioTransporte = new JLabelMe();
		
		this.jLabelAccionesServicioTransporte.setText("Acciones");		
		this.jLabelAccionesServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosServicioTransporte.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosServicioTransporte.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosServicioTransporte = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosServicioTransporte.setText("Seleccionados");
		this.jCheckBoxSeleccionadosServicioTransporte.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaServicioTransporte = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaServicioTransporte.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaServicioTransporte.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteServicioTransporte.setText("Graf.");
		this.jCheckBoxConGraficoReporteServicioTransporte.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresServicioTransporte = new JButtonMe();
		//this.jButtonAnterioresServicioTransporte.setText("<<");
        this.jButtonAnterioresServicioTransporte.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresServicioTransporte,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesServicioTransporte = new JButtonMe();
		//this.jButtonSiguientesServicioTransporte.setText(">>");
        this.jButtonSiguientesServicioTransporte.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesServicioTransporte,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosServicioTransporte = new JButtonMe();
		this.jButtonNuevoGuardarCambiosServicioTransporte.setText("Nue");
        this.jButtonNuevoGuardarCambiosServicioTransporte.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosServicioTransporte,"nuevoguardarcambios_button","Nue",this.serviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosServicioTransporte";
		inputMap = this.jButtonNuevoGuardarCambiosServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosServicioTransporte"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionServicioTransporte";
		inputMap = this.jButtonRecargarInformacionServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionServicioTransporte"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesServicioTransporte";
		inputMap = this.jButtonSiguientesServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesServicioTransporte"));
		
		//ANTERIORES		
		sMapKey = "AnterioresServicioTransporte";
		inputMap = this.jButtonAnterioresServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresServicioTransporte"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasServicioTransporte();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesServicioTransporte.setMinimumSize(new Dimension(this.getWidth(),ServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicioTransporte.setMaximumSize(new Dimension(this.getWidth(),ServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicioTransporte.setPreferredSize(new Dimension(this.getWidth(),ServicioTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionServicioTransporte = new GridBagLayout();

			this.jPanelPaginacionServicioTransporte.setLayout(gridaBagLayoutPaginacionServicioTransporte);						
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 0;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionServicioTransporte.add(this.jButtonAnterioresServicioTransporte, this.gridBagConstraintsServicioTransporte);
					
						
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicioTransporte.gridy = 0;
			
			this.jPanelPaginacionServicioTransporte.add(this.jButtonNuevoGuardarCambiosServicioTransporte, this.gridBagConstraintsServicioTransporte);
						
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicioTransporte.gridy = 0;
			this.jPanelPaginacionServicioTransporte.add(this.jButtonSiguientesServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 1;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioTransporte.add(this.jButtonNuevoServicioTransporte, this.gridBagConstraintsServicioTransporte);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsServicioTransporte.gridy = 1;
				this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionServicioTransporte.add(this.jButtonNuevoRelacionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
			}
			
			
			if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsServicioTransporte.gridy = 1;
				this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionServicioTransporte.add(this.jButtonGuardarCambiosTablaServicioTransporte, this.gridBagConstraintsServicioTransporte);
			}
			
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 1;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioTransporte.add(this.jButtonDuplicarServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 1;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioTransporte.add(this.jButtonCopiarServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 1;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicioTransporte.add(this.jButtonVerFormServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 1;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionServicioTransporte.add(this.jButtonCerrarServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		
		this.jButtonRecargarInformacionServicioTransporte.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicioTransporte.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicioTransporte.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesServicioTransporte.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicioTransporte.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicioTransporte.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesServicioTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicioTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicioTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionServicioTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicioTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicioTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaServicioTransporte.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicioTransporte.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicioTransporte.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteServicioTransporte.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicioTransporte.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicioTransporte.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosServicioTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicioTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicioTransporte.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosServicioTransporte.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicioTransporte.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicioTransporte.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesServicioTransporte = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ServicioTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ServicioTransporte = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesServicioTransporte.setLayout(gridaBagParametrosReportesServicioTransporte);
			this.jPanelParametrosReportesAccionesServicioTransporte.setLayout(gridaBagParametrosReportesAccionesServicioTransporte);
			
			
			this.jPanelParametrosAuxiliar1ServicioTransporte.setLayout(gridaBagParametrosAuxiliar1ServicioTransporte);
			this.jPanelParametrosAuxiliar2ServicioTransporte.setLayout(gridaBagParametrosAuxiliar2ServicioTransporte);
			this.jPanelParametrosAuxiliar3ServicioTransporte.setLayout(gridaBagParametrosAuxiliar3ServicioTransporte);
			this.jPanelParametrosAuxiliar4ServicioTransporte.setLayout(gridaBagParametrosAuxiliar4ServicioTransporte);
			//this.jPanelParametrosAuxiliar5ServicioTransporte.setLayout(gridaBagParametrosAuxiliar2ServicioTransporte);			
			
			
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioTransporte.add(this.jButtonRecargarInformacionServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioTransporte.add(this.jComboBoxTiposPaginacionServicioTransporte, this.gridBagConstraintsServicioTransporte);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioTransporte.add(this.jCheckBoxConAltoMaximoTablaServicioTransporte, this.gridBagConstraintsServicioTransporte);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ServicioTransporte.add(this.jComboBoxTiposArchivosReportesServicioTransporte, this.gridBagConstraintsServicioTransporte);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioTransporte.add(this.jPanelParametrosAuxiliar1ServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ServicioTransporte.add(this.jComboBoxTiposReportesServicioTransporte, this.gridBagConstraintsServicioTransporte);																		
			
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ServicioTransporte.add(this.jComboBoxTiposGraficosReportesServicioTransporte, this.gridBagConstraintsServicioTransporte);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioTransporte.add(this.jPanelParametrosAuxiliar4ServicioTransporte, this.gridBagConstraintsServicioTransporte);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioTransporte.add(this.jComboBoxTiposReportesServicioTransporte, this.gridBagConstraintsServicioTransporte);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioTransporte.add(this.jCheckBoxGenerarReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioTransporte.add(this.jPanelParametrosAuxiliar2ServicioTransporte, this.gridBagConstraintsServicioTransporte);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioTransporte.add(this.jLabelAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesServicioTransporte.add(this.jButtonAbrirOrderByServicioTransporte, this.gridBagConstraintsServicioTransporte);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioTransporte.add(this.jComboBoxTiposSeleccionarServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			
			
			/*
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioTransporte.add(this.jCheckBoxSeleccionarTodosServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicioTransporte.add(this.jCheckBoxConGraficoReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioTransporte.add(this.jCheckBoxSeleccionarTodosServicioTransporte, this.gridBagConstraintsServicioTransporte);															
				
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioTransporte.add(this.jCheckBoxSeleccionadosServicioTransporte, this.gridBagConstraintsServicioTransporte);															
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicioTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ServicioTransporte.add(this.jCheckBoxConGraficoReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicioTransporte.add(this.jPanelParametrosAuxiliar3ServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioTransporte.add(this.jComboBoxTiposRelacionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
				
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioTransporte.add(this.jComboBoxTiposAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
	
				
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicioTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicioTransporte.add(this.jTextFieldValorCampoGeneralServicioTransporte, this.gridBagConstraintsServicioTransporte);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosServicioTransporte = new GridBagLayout();

			this.jScrollPanelDatosServicioTransporte.setLayout(gridaBagLayoutDatosServicioTransporte);
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = 0;
			this.gridBagConstraintsServicioTransporte.gridx = 0;
			
			this.jScrollPanelDatosServicioTransporte.add(this.jTableDatosServicioTransporte, this.gridBagConstraintsServicioTransporte);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosServicioTransporte.setViewportView(this.jTableDatosServicioTransporte);
		this.jTableDatosServicioTransporte.setFillsViewportHeight(true);
		this.jTableDatosServicioTransporte.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesServicioTransporte= new GridBagLayout();
		this.jPanelAccionesServicioTransporte.setLayout(gridaBagLayoutAccionesServicioTransporte);
		
		
		/*	
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = 0;
		this.gridBagConstraintsServicioTransporte.gridx = 0;
			
		this.jPanelAccionesServicioTransporte.add(this.jButtonNuevoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdClienteServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteServicioTransporte.setLayout(gridaBagLayoutFK_IdClienteServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdClienteServicioTransporte.add(jLabelid_clienteFK_IdClienteServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdClienteServicioTransporte.add(jComboBoxid_clienteFK_IdClienteServicioTransporte, gridBagConstraintsServicioTransporte);


		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdClienteServicioTransporte.add(this.jButtonBuscarFK_IdClienteid_clienteServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdClienteServicioTransporte.add(jButtonFK_IdClienteServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("1.-Por Cliente ", jPanelFK_IdClienteServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteProveedorServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorServicioTransporte.setLayout(gridaBagLayoutFK_IdClienteProveedorServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdClienteProveedorServicioTransporte.add(jLabelid_cliente_proveedorFK_IdClienteProveedorServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdClienteProveedorServicioTransporte.add(jComboBoxid_cliente_proveedorFK_IdClienteProveedorServicioTransporte, gridBagConstraintsServicioTransporte);


		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdClienteProveedorServicioTransporte.add(this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdClienteProveedorServicioTransporte.add(jButtonFK_IdClienteProveedorServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("2.-Por Cliente Proveedor ", jPanelFK_IdClienteProveedorServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoServicioTransporte.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdDetalleActivoFijoServicioTransporte.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdDetalleActivoFijoServicioTransporte.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdDetalleActivoFijoServicioTransporte.add(jButtonFK_IdDetalleActivoFijoServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("3.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdRutaTransporteServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdRutaTransporteServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRutaTransporteServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRutaTransporteServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRutaTransporteServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRutaTransporteServicioTransporte.setLayout(gridaBagLayoutFK_IdRutaTransporteServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdRutaTransporteServicioTransporte.add(jLabelid_ruta_transporteFK_IdRutaTransporteServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdRutaTransporteServicioTransporte.add(jComboBoxid_ruta_transporteFK_IdRutaTransporteServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdRutaTransporteServicioTransporte.add(jButtonFK_IdRutaTransporteServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("4.-Por Ruta Transporte ", jPanelFK_IdRutaTransporteServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTransportistaServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaServicioTransporte.setLayout(gridaBagLayoutFK_IdTransportistaServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdTransportistaServicioTransporte.add(jLabelid_transportistaFK_IdTransportistaServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdTransportistaServicioTransporte.add(jComboBoxid_transportistaFK_IdTransportistaServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdTransportistaServicioTransporte.add(jButtonFK_IdTransportistaServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("5.-Por Transportista ", jPanelFK_IdTransportistaServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdVehiculoServicioTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdVehiculoServicioTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVehiculoServicioTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVehiculoServicioTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVehiculoServicioTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVehiculoServicioTransporte.setLayout(gridaBagLayoutFK_IdVehiculoServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 0;
		jPanelFK_IdVehiculoServicioTransporte.add(jLabelid_vehiculoFK_IdVehiculoServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 0;
		gridBagConstraintsServicioTransporte.gridx = 1;
		jPanelFK_IdVehiculoServicioTransporte.add(jComboBoxid_vehiculoFK_IdVehiculoServicioTransporte, gridBagConstraintsServicioTransporte);

		gridBagConstraintsServicioTransporte = new GridBagConstraints();
		gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicioTransporte.gridy = 1;
		gridBagConstraintsServicioTransporte.gridx =1;
		jPanelFK_IdVehiculoServicioTransporte.add(jButtonFK_IdVehiculoServicioTransporte, gridBagConstraintsServicioTransporte);

		jTabbedPaneBusquedasServicioTransporte.addTab("6.-Por Vehiculo ", jPanelFK_IdVehiculoServicioTransporte);
		jTabbedPaneBusquedasServicioTransporte.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicioTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicioTransporte);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();						
			this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioTransporte.gridx = 0;		
			//this.gridBagConstraintsServicioTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicioTransporte.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarServicioTransporte, this.gridBagConstraintsServicioTransporte);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;
		this.gridBagConstraintsServicioTransporte.gridx = 0;		
		//this.gridBagConstraintsServicioTransporte.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsServicioTransporte.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsServicioTransporte);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioTransporte.gridx = 0;		
			this.gridBagConstraintsServicioTransporte.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsServicioTransporte.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasServicioTransporte, this.gridBagConstraintsServicioTransporte);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesServicioTransporte, this.gridBagConstraintsServicioTransporte);								
		
		
		/*
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
		*/		
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicioTransporte.gridx =0;
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicioTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicioTransporte, this.gridBagConstraintsServicioTransporte);
				
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionServicioTransporte, this.gridBagConstraintsServicioTransporte);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ServicioTransporteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosServicioTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicioTransporte = new GridBagLayout();
			this.jPanelBusquedasParametrosServicioTransporte.setLayout(gridaBagLayoutBusquedasParametrosServicioTransporte);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralServicioTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicioTransporte, this.gridBagConstraintsServicioTransporte);
			
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicioTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicioTransporte, this.gridBagConstraintsServicioTransporte);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralServicioTransporte;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoServicioTransporte() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoServicioTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoServicioTransporte.setName("jPanelReporteDinamicoServicioTransporte"); 
		
		this.jPanelReporteDinamicoServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoServicioTransporte.setLayout(gridaBagLayoutReporteDinamicoServicioTransporte);
		
		
		this.jInternalFrameReporteDinamicoServicioTransporte= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoServicioTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicioTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoServicioTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoServicioTransporte.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoServicioTransporte.setResizable(true);
	    this.jInternalFrameReporteDinamicoServicioTransporte.setClosable(true);
	    this.jInternalFrameReporteDinamicoServicioTransporte.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteServicioTransporte = new JLabelMe();

		this.jLabelColumnasSelectReporteServicioTransporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelColumnasSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteServicioTransporte = new JList<Reporte>();
		this.jListColumnasSelectReporteServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteServicioTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteServicioTransporte=new JScrollPane(this.jListColumnasSelectReporteServicioTransporte);
			
			this.jScrollColumnasSelectReporteServicioTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicioTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicioTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoServicioTransporte.add(this.jListColumnasSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		this.jPanelReporteDinamicoServicioTransporte.add(this.jScrollColumnasSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteServicioTransporte = new JLabelMe();

		this.jLabelRelacionesSelectReporteServicioTransporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelRelacionesSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteServicioTransporte = new JList<Reporte>();
		this.jListRelacionesSelectReporteServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteServicioTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteServicioTransporte=new JScrollPane(this.jListRelacionesSelectReporteServicioTransporte);
			
			this.jScrollRelacionesSelectReporteServicioTransporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicioTransporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicioTransporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoServicioTransporte.add(this.jListRelacionesSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		this.jPanelReporteDinamicoServicioTransporte.add(this.jScrollRelacionesSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoServicioTransporte = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoServicioTransporte = new JComboBoxMe();
		this.jListColumnasValoresGraficoServicioTransporte = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoServicioTransporte = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoServicioTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoServicioTransporte = new JLabelMe();

		this.jLabelConGraficoDinamicoServicioTransporte.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelConGraficoDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoServicioTransporte.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoServicioTransporte.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoServicioTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicioTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicioTransporte.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jCheckBoxConGraficoDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoServicioTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoServicioTransporte.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelColumnaCategoriaGraficoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoServicioTransporte.add(this.jComboBoxColumnaCategoriaGraficoServicioTransporte, this.gridBagConstraintsServicioTransporte);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorServicioTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaValorServicioTransporte.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelColumnaCategoriaValorServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorServicioTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaValorServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoServicioTransporte.add(this.jComboBoxColumnaCategoriaValorServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoServicioTransporte = new JLabelMe();

		this.jLabelColumnasValoresGraficoServicioTransporte.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelColumnasValoresGraficoServicioTransporte, this.gridBagConstraintsServicioTransporte);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoServicioTransporte = new JList<Reporte>();
		this.jListColumnasValoresGraficoServicioTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoServicioTransporte.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoServicioTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicioTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicioTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoServicioTransporte=new JScrollPane(this.jListColumnasValoresGraficoServicioTransporte);
			
			this.jScrollColumnasValoresGraficoServicioTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicioTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicioTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoServicioTransporte.add(this.jListColumnasSelectReporteServicioTransporte, this.gridBagConstraintsServicioTransporte);
		this.jPanelReporteDinamicoServicioTransporte.add(this.jScrollColumnasValoresGraficoServicioTransporte, this.gridBagConstraintsServicioTransporte);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoServicioTransporte = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoServicioTransporte.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelTiposGraficosReportesDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicioTransporte.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jComboBoxTiposGraficosReportesDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoServicioTransporte = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoServicioTransporte.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelGenerarExcelReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoServicioTransporte = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoServicioTransporte.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoServicioTransporte,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoServicioTransporte.setToolTipText("Generar EXCEL"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoServicioTransporte.add(this.jButtonGenerarExcelReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioTransporte.add(this.jComboBoxTiposReportesDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoServicioTransporte = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoServicioTransporte.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicioTransporte.add(this.jLabelTiposArchivoReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioTransporte.add(this.jComboBoxTiposArchivosReportesDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoServicioTransporte = new JButtonMe();
		this.jButtonGenerarReporteDinamicoServicioTransporte.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoServicioTransporte,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoServicioTransporte.setToolTipText("Generar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioTransporte.add(this.jButtonGenerarReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoServicioTransporte = new JButtonMe();
		this.jButtonCerrarReporteDinamicoServicioTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoServicioTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoServicioTransporte.setToolTipText("Cancelar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicioTransporte.add(this.jButtonCerrarReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalServicioTransporte = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoServicioTransporte= new JScrollPane(jPanelReporteDinamicoServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoServicioTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicioTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicioTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsServicioTransporte.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoServicioTransporte.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalServicioTransporte);
		this.jInternalFrameReporteDinamicoServicioTransporte.getContentPane().add(this.jScrollPanelReporteDinamicoServicioTransporte, this.gridBagConstraintsServicioTransporte);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionServicioTransporte() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionServicioTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionServicioTransporte.setName("jPanelImportacionServicioTransporte"); 
		
		this.jPanelImportacionServicioTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicioTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicioTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionServicioTransporte.setLayout(gridaBagLayoutImportacionServicioTransporte);
		
		
		this.jInternalFrameImportacionServicioTransporte= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionServicioTransporte= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionServicioTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicioTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicioTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionServicioTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicioTransporte.setResizable(true);
	    this.jInternalFrameImportacionServicioTransporte.setClosable(true);
	    this.jInternalFrameImportacionServicioTransporte.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicioTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicioTransporte.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionServicioTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicioTransporte.setResizable(true);
	    this.jInternalFrameImportacionServicioTransporte.setClosable(true);
	    this.jInternalFrameImportacionServicioTransporte.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionServicioTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicioTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicioTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionServicioTransporte = new JLabelMe();

		this.jLabelArchivoImportacionServicioTransporte.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicioTransporte.add(this.jLabelArchivoImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionServicioTransporte = new JFileChooser();		
		this.jFileChooserImportacionServicioTransporte.setToolTipText("ESCOGER ARCHIVO"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionServicioTransporte = new JButtonMe();
		this.jButtonAbrirImportacionServicioTransporte.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionServicioTransporte,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionServicioTransporte.setToolTipText("Generar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioTransporte.add(this.jButtonAbrirImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionServicioTransporte = new JLabelMe();

		this.jLabelPathArchivoImportacionServicioTransporte.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicioTransporte.add(this.jLabelPathArchivoImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionServicioTransporte=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionServicioTransporte.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicioTransporte.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicioTransporte.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioTransporte.add(this.jTextFieldPathArchivoImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionServicioTransporte = new JButtonMe();
		this.jButtonGenerarImportacionServicioTransporte.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionServicioTransporte,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionServicioTransporte.setToolTipText("Generar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioTransporte.add(this.jButtonGenerarImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionServicioTransporte = new JButtonMe();
		this.jButtonCerrarImportacionServicioTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionServicioTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionServicioTransporte.setToolTipText("Cancelar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsServicioTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicioTransporte.add(this.jButtonCerrarImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalServicioTransporte = new GridBagLayout();
		
		this.jScrollPanelImportacionServicioTransporte= new JScrollPane(jPanelImportacionServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsServicioTransporte.gridy =iPosYImportacion;
		this.gridBagConstraintsServicioTransporte.gridx =iPosXImportacion;
		this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionServicioTransporte.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalServicioTransporte);
		this.jInternalFrameImportacionServicioTransporte.getContentPane().add(this.jScrollPanelImportacionServicioTransporte, this.gridBagConstraintsServicioTransporte);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByServicioTransporte(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByServicioTransporte = new JButtonMe();
			this.jButtonAbrirOrderByServicioTransporte.setText("Orden");
			this.jButtonAbrirOrderByServicioTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicioTransporte,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByServicioTransporte";
			inputMap = this.jButtonAbrirOrderByServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByServicioTransporte"));
		
		
			GridBagLayout gridaBagLayoutOrderByServicioTransporte = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByServicioTransporte.setName("jPanelOrderByServicioTransporte"); 
			
			this.jPanelOrderByServicioTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicioTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicioTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByServicioTransporte.setLayout(gridaBagLayoutOrderByServicioTransporte);
			
			
			this.jTableDatosServicioTransporteOrderBy = new JTableMe();        
			this.jTableDatosServicioTransporteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosServicioTransporteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosServicioTransporteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosServicioTransporteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosServicioTransporteOrderBy.setViewportView(this.jTableDatosServicioTransporteOrderBy);
			this.jTableDatosServicioTransporteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosServicioTransporteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByServicioTransporte= new OrderByJInternalFrame();
			this.jInternalFrameOrderByServicioTransporte= new OrderByJInternalFrame();
			this.jScrollPanelOrderByServicioTransporte = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteServicioTransporte= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByServicioTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByServicioTransporte.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByServicioTransporte.setTitle("Orden");
			this.jInternalFrameOrderByServicioTransporte.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByServicioTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByServicioTransporte.setResizable(true);
			this.jInternalFrameOrderByServicioTransporte.setClosable(true);
			this.jInternalFrameOrderByServicioTransporte.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByServicioTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicioTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicioTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Transportes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy =iPosYOrderBy++;
			this.gridBagConstraintsServicioTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsServicioTransporte.ipady =150;
				
			this.jPanelOrderByServicioTransporte.add(jScrollPanelDatosServicioTransporteOrderBy, this.gridBagConstraintsServicioTransporte);//this.jTableDatosServicioTransporteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByServicioTransporte = new JButtonMe();
			this.jButtonCerrarOrderByServicioTransporte.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByServicioTransporte,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByServicioTransporte.setToolTipText("Cancelar"+" "+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioTransporte.gridy = iPosYOrderBy++;
			this.gridBagConstraintsServicioTransporte.gridx = iPosXOrderBy;
									
			this.jPanelOrderByServicioTransporte.add(this.jButtonCerrarOrderByServicioTransporte, this.gridBagConstraintsServicioTransporte);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalServicioTransporte = new GridBagLayout();
			
			this.jScrollPanelOrderByServicioTransporte= new JScrollPane(jPanelOrderByServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsServicioTransporte.gridy =iPosYOrderBy;
			this.gridBagConstraintsServicioTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicioTransporte.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByServicioTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByServicioTransporte.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalServicioTransporte);
			
			this.jInternalFrameOrderByServicioTransporte.getContentPane().add(this.jScrollPanelOrderByServicioTransporte, this.gridBagConstraintsServicioTransporte);			
		
		} else {
			this.jButtonAbrirOrderByServicioTransporte = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.serviciotransporteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosServicioTransporte.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosServicioTransporte.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosServicioTransporte.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosServicioTransporte.getRowHeight();//ServicioTransporteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicioTransporte.isSelected()) {
					iHeightTable=ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicioTransporte.isSelected()) {
					iHeightTable=ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosServicioTransporte.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicioTransporte.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicioTransporte.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosServicioTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicioTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicioTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByServicioTransporte!=null && this.jInternalFrameOrderByServicioTransporte.getjTableDatosOrderBy()!=null) {
			//if(!this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByServicioTransporte.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByServicioTransporte.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByServicioTransporte.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByServicioTransporte.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByServicioTransporte.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByServicioTransporte.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByServicioTransporte.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosServicioTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicioTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicioTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=serviciotransporteLogic.getServicioTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=serviciotransportes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ServicioTransporte> TraerServicioTransporteBeans(List<ServicioTransporte> serviciotransportes,ArrayList<Classe> classes)throws Exception {
		try {
			for(ServicioTransporte serviciotransporte:serviciotransportes) {
					
				if(!(ServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					serviciotransporte.setsDetalleGeneralEntityReporte(ServicioTransporteConstantesFunciones.getServicioTransporteDescripcion(serviciotransporte));
										
						
					
					

					if(serviciotransporte.getDetalleServicioTransportes()!=null && Funciones.existeClass(classes,DetalleServicioTransporte.class)) {
						try{serviciotransporte.setdetalleserviciotransportesDescripcionReporte(new JRBeanCollectionDataSource(DetalleServicioTransporteJInternalFrame.TraerDetalleServicioTransporteBeans(serviciotransporte.getDetalleServicioTransportes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//serviciotransporte.setsDetalleGeneralEntityReporte(serviciotransporte.getsDetalleGeneralEntityReporte());
										
				}
				
				//serviciotransportebeans.add(serviciotransportebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return serviciotransportes;
    }
	//PARA REPORTES FIN
}
