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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.NotaCreditoConstantesFunciones;

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
public class NotaCreditoJInternalFrame extends NotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNotaCredito;
	
	protected JMenuBar jmenuBarNotaCredito;
	
	protected JMenu jmenuNotaCredito;
	protected JMenu jmenuDatosNotaCredito;
	protected JMenu jmenuArchivoNotaCredito;
	protected JMenu jmenuAccionesNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCredito;	
	protected GridBagConstraints gridBagConstraintsNotaCredito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NotaCreditoDetalleFormJInternalFrame jInternalFrameDetalleFormNotaCredito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNotaCredito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNotaCredito;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

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

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacredito="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public NotaCreditoSessionBean notacreditoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NotaCredito> notacreditos;		
	public List<NotaCredito> notacreditosEliminados;	
	public List<NotaCredito> notacreditosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNotaCredito;		
	protected JButton jButtonAbrirOrderByNotaCredito;
	
	
	//protected JPanel jPanelOrderByNotaCredito;
	//public JScrollPane jScrollPanelOrderByNotaCredito;	
	//protected JButton jButtonCerrarOrderByNotaCredito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NotaCreditoLogic notacreditoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralNotaCredito;
    
	
	
	//public JScrollPane jScrollPanelDatosNotaCreditoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNotaCredito;
	//public JScrollPane jScrollPanelImportacionNotaCredito;
	
	
	
	protected JPanel jPanelAccionesNotaCredito;
	
    protected JPanel jPanelPaginacionNotaCredito;
    protected JPanel jPanelParametrosReportesNotaCredito;
	protected JPanel jPanelParametrosReportesAccionesNotaCredito;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalNotaCredito;
	protected Integer iXPanelCamposFintotalNotaCredito=0;
	protected Integer iYPanelCamposFintotalNotaCredito=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NotaCredito;
	protected JPanel jPanelParametrosAuxiliar2NotaCredito;
	protected JPanel jPanelParametrosAuxiliar3NotaCredito;
	protected JPanel jPanelParametrosAuxiliar4NotaCredito;
	//protected JPanel jPanelParametrosAuxiliar5NotaCredito;
	
	
	
	//protected JPanel jPanelReporteDinamicoNotaCredito;
	//protected JPanel jPanelImportacionNotaCredito;
	
	
	public JTable jTableDatosNotaCredito;
	
	
	
	//public JTable jTableDatosNotaCreditoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNotaCredito;
	protected JButton jButtonDuplicarNotaCredito;
	protected JButton jButtonCopiarNotaCredito;
	protected JButton jButtonVerFormNotaCredito;
	protected JButton jButtonNuevoRelacionesNotaCredito;
	protected JButton jButtonModificarNotaCredito;
	
    protected JButton jButtonGuardarCambiosTablaNotaCredito;
	protected JButton jButtonCerrarNotaCredito;
	
	
	protected JButton jButtonRecargarInformacionNotaCredito;
	protected JButton jButtonProcesarInformacionNotaCredito;
	
	
	protected JButton jButtonAnterioresNotaCredito;
	protected JButton jButtonSiguientesNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosNotaCredito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNotaCredito;
	//protected JButton jButtonCerrarReporteDinamicoNotaCredito;
	//protected JButton jButtonGenerarExcelReporteDinamicoNotaCredito;	
	
	
	
	//protected JButton jButtonAbrirImportacionNotaCredito;
	//protected JButton jButtonGenerarImportacionNotaCredito;
	//protected JButton jButtonCerrarImportacionNotaCredito;
	//protected JFileChooser jFileChooserImportacionNotaCredito;
	//protected File fileImportacionNotaCredito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCredito;
	protected JButton jButtonDuplicarToolBarNotaCredito;
	protected JButton jButtonNuevoRelacionesToolBarNotaCredito;
	
	
	public JButton jButtonGuardarCambiosToolBarNotaCredito;
	protected JButton jButtonCopiarToolBarNotaCredito;
	protected JButton jButtonVerFormToolBarNotaCredito;
	public JButton jButtonGuardarCambiosTablaToolBarNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCredito;
	protected JButton jButtonCerrarToolBarNotaCredito;
	
	protected JButton jButtonRecargarInformacionToolBarNotaCredito;
	protected JButton jButtonProcesarInformacionToolBarNotaCredito;
	protected JButton jButtonAnterioresToolBarNotaCredito;
	protected JButton jButtonSiguientesToolBarNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosToolBarNotaCredito;
	protected JButton jButtonAbrirOrderByToolBarNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCredito;
	protected JMenuItem jMenuItemDuplicarNotaCredito;
	protected JMenuItem jMenuItemNuevoRelacionesNotaCredito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNotaCredito;
	protected JMenuItem jMenuItemCopiarNotaCredito;
	protected JMenuItem jMenuItemVerFormNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCredito;
	protected JMenuItem jMenuItemCerrarNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarNotaCredito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCredito;
	
	protected JMenuItem jMenuItemRecargarInformacionNotaCredito;
	protected JMenuItem jMenuItemProcesarInformacionNotaCredito;
	protected JMenuItem jMenuItemAnterioresNotaCredito;
	protected JMenuItem jMenuItemSiguientesNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCredito;
	protected JMenuItem jMenuItemAbrirOrderByNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCredito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNotaCredito;
	protected JCheckBox jCheckBoxSeleccionadosNotaCredito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNotaCredito;
	protected JCheckBox jCheckBoxConGraficoReporteNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNotaCredito;
	protected JTextField jTextFieldValorCampoGeneralNotaCredito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNotaCredito;
	//public JList<Reporte> jListColumnasSelectReporteNotaCredito;
	//public JScrollPane jScrollColumnasSelectReporteNotaCredito;
	
	//public JLabel jLabelRelacionesSelectReporteNotaCredito;
	//public JList<Reporte> jListRelacionesSelectReporteNotaCredito;
	//public JScrollPane jScrollRelacionesSelectReporteNotaCredito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNotaCredito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNotaCredito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNotaCredito;
	//public JLabel jLabelTiposArchivoReporteDinamicoNotaCredito;
	
		
	//public JLabel jLabelArchivoImportacionNotaCredito;	
	//public JLabel jLabelPathArchivoImportacionNotaCredito;
	//protected JTextField jTextFieldPathArchivoImportacionNotaCredito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNotaCredito;
	
	//public JLabel jLabelColumnaCategoriaValorNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNotaCredito;
	
	//public JLabel jLabelColumnasValoresGraficoNotaCredito;
	//public JList<Reporte> jListColumnasValoresGraficoNotaCredito;
	//public JScrollPane jScrollColumnasValoresGraficoNotaCredito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNotaCredito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNotaCredito;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNotaCredito;
	public JPanel jPanelBusquedaPorCodigoNotaCredito;
	public JButton jButtonBusquedaPorCodigoNotaCredito;
	public JPanel jPanelBusquedaPorNumeroPreImpresoNotaCredito;
	public JButton jButtonBusquedaPorNumeroPreImpresoNotaCredito;
	public JPanel jPanelFK_IdClienteNotaCredito;
	public JButton jButtonFK_IdClienteNotaCredito;
	public JPanel jPanelFK_IdFacturaNotaCredito;
	public JButton jButtonFK_IdFacturaNotaCredito;
	public JPanel jPanelFK_IdTransportistaNotaCredito;
	public JButton jButtonFK_IdTransportistaNotaCredito;
	public JPanel jPanelFK_IdVendedorNotaCredito;
	public JButton jButtonFK_IdVendedorNotaCredito;
	
	public JPanel jPanelcodigoBusquedaPorCodigoNotaCredito;
	public JLabel jLabelcodigoBusquedaPorCodigoNotaCredito;
	public JTextField jTextFieldcodigoBusquedaPorCodigoNotaCredito;
	public JButton jButtoncodigoBusquedaPorCodigoNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelnumeroBusquedaPorNumeroPreImpresoNotaCredito;
	public JLabel jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito;
	public JTextField jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito;
	public JButton jButtonnumeroBusquedaPorNumeroPreImpresoNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteNotaCredito;
	public JLabel jLabelid_clienteFK_IdClienteNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteNotaCredito;
	public JButton jButtonid_clienteFK_IdClienteNotaCredito= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteNotaCredito;
	
	public JPanel jPanelid_facturaFK_IdFacturaNotaCredito;
	public JLabel jLabelid_facturaFK_IdFacturaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaNotaCredito;
	public JButton jButtonid_facturaFK_IdFacturaNotaCredito= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaNotaCreditoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaNotaCredito;
	
	public JPanel jPanelid_transportistaFK_IdTransportistaNotaCredito;
	public JLabel jLabelid_transportistaFK_IdTransportistaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaNotaCredito;
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCredito= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorNotaCredito;
	public JLabel jLabelid_vendedorFK_IdVendedorNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorNotaCredito;
	public JButton jButtonid_vendedorFK_IdVendedorNotaCredito= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorNotaCredito;
	
	
	
	
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
		
	//public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=784;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NotaCreditoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNotaCredito)	{
		this.jButtonRecargarInformacionNotaCredito = jButtonRecargarInformacionNotaCredito;
	}
	
	public JButton getjButtonProcesarInformacionNotaCredito() {
		return this.jButtonProcesarInformacionNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCredito)	{
		this.jButtonProcesarInformacionNotaCredito = jButtonProcesarInformacionNotaCredito;
	}
	
	
	public JButton getjButtonRecargarInformacionNotaCredito() {
		return this.jButtonRecargarInformacionNotaCredito;
	}
	
	
	public List<NotaCredito> getnotacreditos() {
		return this.notacreditos;
	}

	public void setnotacreditos(List<NotaCredito> notacreditos) {
		this.notacreditos = notacreditos;
	}
	
	public List<NotaCredito> getnotacreditosAux() {
		return this.notacreditosAux;
	}

	public void setnotacreditosAux(List<NotaCredito> notacreditosAux) {
		this.notacreditosAux = notacreditosAux;
	}
	
	public List<NotaCredito> getnotacreditosEliminados() {
		return this.notacreditosEliminados;
	}

	public void setNotaCreditosEliminados(List<NotaCredito> notacreditosEliminados) {
		this.notacreditosEliminados = notacreditosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNotaCredito() {
		return jComboBoxTiposSeleccionarNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNotaCredito(
			JComboBox jComboBoxTiposSeleccionarNotaCredito) {
		this.jComboBoxTiposSeleccionarNotaCredito = jComboBoxTiposSeleccionarNotaCredito;
	}
	
	public void setBorderResaltarTiposSeleccionarNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNotaCredito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNotaCredito() {
		return jTextFieldValorCampoGeneralNotaCredito;
	}

	public void setjTextFieldValorCampoGeneralNotaCredito(
			JTextField jTextFieldValorCampoGeneralNotaCredito) {
		this.jTextFieldValorCampoGeneralNotaCredito = jTextFieldValorCampoGeneralNotaCredito;
	}

	public void setBorderResaltarValorCampoGeneralNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNotaCredito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNotaCredito() {
		return this.jCheckBoxSeleccionarTodosNotaCredito;
	}

	public void setjCheckBoxSeleccionarTodosNotaCredito(
			JCheckBox jCheckBoxSeleccionarTodosNotaCredito) {
		this.jCheckBoxSeleccionarTodosNotaCredito = jCheckBoxSeleccionarTodosNotaCredito;
	}

	public void setBorderResaltarSeleccionarTodosNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNotaCredito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNotaCredito() {
		return this.jCheckBoxSeleccionadosNotaCredito;
	}

	public void setjCheckBoxSeleccionadosNotaCredito(
			JCheckBox jCheckBoxSeleccionadosNotaCredito) {
		this.jCheckBoxSeleccionadosNotaCredito = jCheckBoxSeleccionadosNotaCredito;
	}
	
	public void setBorderResaltarSeleccionadosNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNotaCredito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNotaCredito() {
		return this.jComboBoxTiposArchivosReportesNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNotaCredito(
			JComboBox jComboBoxTiposArchivosReportesNotaCredito) {
		this.jComboBoxTiposArchivosReportesNotaCredito = jComboBoxTiposArchivosReportesNotaCredito;
	}

	public void setBorderResaltarTiposArchivosReportesNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNotaCredito() {
		return this.jComboBoxTiposReportesNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNotaCredito(
			JComboBox jComboBoxTiposReportesNotaCredito) {
		this.jComboBoxTiposReportesNotaCredito = jComboBoxTiposReportesNotaCredito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNotaCredito() {
	//	return jComboBoxTiposReportesDinamicoNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNotaCredito(
	//		JComboBox jComboBoxTiposReportesDinamicoNotaCredito) {
	//	this.jComboBoxTiposReportesDinamicoNotaCredito = jComboBoxTiposReportesDinamicoNotaCredito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNotaCredito() {
	//	return jComboBoxTiposArchivosReportesDinamicoNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNotaCredito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCredito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNotaCredito = jComboBoxTiposArchivosReportesDinamicoNotaCredito;
	//}
	
	public void setBorderResaltarTiposReportesNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNotaCredito() {
		return this.jComboBoxTiposGraficosReportesNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNotaCredito(
			JComboBox jComboBoxTiposGraficosReportesNotaCredito) {
		this.jComboBoxTiposGraficosReportesNotaCredito = jComboBoxTiposGraficosReportesNotaCredito;
	}
	
	public void setBorderResaltarTiposGraficosReportesNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNotaCredito() {
		return this.jComboBoxTiposPaginacionNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNotaCredito(
			JComboBox jComboBoxTiposPaginacionNotaCredito) {
		this.jComboBoxTiposPaginacionNotaCredito = jComboBoxTiposPaginacionNotaCredito;
	}
	
	public void setBorderResaltarTiposPaginacionNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNotaCredito() {
		return this.jComboBoxTiposRelacionesNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCredito() {
		return this.jComboBoxTiposAccionesNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCredito(
			JComboBox jComboBoxTiposRelacionesNotaCredito) {
		this.jComboBoxTiposRelacionesNotaCredito = jComboBoxTiposRelacionesNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCredito(
			JComboBox jComboBoxTiposAccionesNotaCredito) {
		this.jComboBoxTiposAccionesNotaCredito = jComboBoxTiposAccionesNotaCredito;
	}
	
	public void setBorderResaltarTiposRelacionesNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNotaCredito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNotaCredito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNotaCredito() {
	//	return jCheckBoxConGraficoDinamicoNotaCredito;
	//}

	//public void setjCheckBoxConGraficoDinamicoNotaCredito(
	//		JCheckBox jCheckBoxConGraficoDinamicoNotaCredito) {
	//	this.jCheckBoxConGraficoDinamicoNotaCredito = jCheckBoxConGraficoDinamicoNotaCredito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNotaCredito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNotaCredito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNotaCredito .setBorder(borderResaltar);		
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
		this.notacreditoSessionBean=new NotaCreditoSessionBean();
		
		this.notacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
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
		
		NotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNotaCredito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"nuevo","nuevo","Nuevo"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"duplicar","duplicar","Duplicar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"copiar","copiar","Copiar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"ver_form","ver_form","Ver"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"recargar","recargar","Recargar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNotaCredito,this.jTtoolBarNotaCredito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNotaCredito,this.jTtoolBarNotaCredito,
							"cerrar","cerrar","Salir"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNotaCredito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNotaCredito;
			
				this.jButtonProcesarInformacionToolBarNotaCredito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNotaCredito;
				
		//protected JButton jButtonModificarToolBarNotaCredito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNotaCredito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNotaCredito=new JMenuMe("General");
		this.jmenuArchivoNotaCredito=new JMenuMe("Archivo");
		this.jmenuAccionesNotaCredito=new JMenuMe("Acciones");
		this.jmenuDatosNotaCredito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNotaCredito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNotaCredito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNotaCredito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNotaCredito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNotaCredito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNotaCredito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNotaCredito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNotaCredito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNotaCredito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNotaCredito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNotaCredito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNotaCredito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNotaCredito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNotaCredito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNotaCredito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNotaCredito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNotaCredito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNotaCredito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNotaCredito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNotaCredito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNotaCredito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNotaCredito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNotaCredito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNotaCredito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNotaCredito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNotaCredito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNotaCredito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNotaCredito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNotaCredito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNotaCredito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNotaCredito.add(this.jMenuItemCerrarNotaCredito);
			
			this.jmenuAccionesNotaCredito.add(this.jMenuItemNuevoNotaCredito);
			this.jmenuAccionesNotaCredito.add(this.jMenuItemNuevoGuardarCambiosNotaCredito);
			this.jmenuAccionesNotaCredito.add(this.jMenuItemNuevoRelacionesNotaCredito);
			this.jmenuAccionesNotaCredito.add(this.jMenuItemGuardarCambiosTablaNotaCredito);		
			this.jmenuAccionesNotaCredito.add(this.jMenuItemDuplicarNotaCredito);		
			this.jmenuAccionesNotaCredito.add(this.jMenuItemCopiarNotaCredito);		
			this.jmenuAccionesNotaCredito.add(this.jMenuItemVerFormNotaCredito);		
			
			this.jmenuDatosNotaCredito.add(this.jMenuItemRecargarInformacionNotaCredito);				
			this.jmenuDatosNotaCredito.add(this.jMenuItemAnterioresNotaCredito);				
			this.jmenuDatosNotaCredito.add(this.jMenuItemSiguientesNotaCredito);				
			this.jmenuDatosNotaCredito.add(this.jMenuItemAbrirOrderByNotaCredito);				
			this.jmenuDatosNotaCredito.add(this.jMenuItemMostrarOcultarNotaCredito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNotaCredito.add(this.jMenuItemGuardarCambiosNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNotaCredito.add(this.jmenuArchivoNotaCredito);		
			this.jmenuBarNotaCredito.add(this.jmenuAccionesNotaCredito);		
			this.jmenuBarNotaCredito.add(this.jmenuDatosNotaCredito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNotaCredito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNotaCredito() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoNotaCredito.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoNotaCredito= new JButtonMe();
		this.jButtonBusquedaPorCodigoNotaCredito.setText("Buscar");
		this.jButtonBusquedaPorCodigoNotaCredito.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoNotaCredito,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoNotaCredito = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoNotaCredito.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoNotaCredito.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoNotaCredito= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroPreImpresoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroPreImpresoNotaCredito.setToolTipText("Buscar Por Nro Preimpreso ");
		this.jButtonBusquedaPorNumeroPreImpresoNotaCredito= new JButtonMe();
		this.jButtonBusquedaPorNumeroPreImpresoNotaCredito.setText("Buscar");
		this.jButtonBusquedaPorNumeroPreImpresoNotaCredito.setToolTipText("Buscar Por Nro Preimpreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroPreImpresoNotaCredito,"buscar_button","Buscar Por Nro Preimpreso ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroPreImpresoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito = new JLabelMe();
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito.setText("Nro Preimpreso :");
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito.setToolTipText("Nro Preimpreso");
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito= new JTextFieldMe();
		jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteNotaCredito.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteNotaCredito= new JButtonMe();
		this.jButtonFK_IdClienteNotaCredito.setText("Buscar");
		this.jButtonFK_IdClienteNotaCredito.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteNotaCredito,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteNotaCredito = new JLabelMe();
		jLabelid_clienteFK_IdClienteNotaCredito.setText("Cliente :");
		jLabelid_clienteFK_IdClienteNotaCredito.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteNotaCredito= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCredito.setFocusable(false);

		this.jPanelFK_IdFacturaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaNotaCredito.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaNotaCredito= new JButtonMe();
		this.jButtonFK_IdFacturaNotaCredito.setText("Buscar");
		this.jButtonFK_IdFacturaNotaCredito.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaNotaCredito,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaNotaCredito = new JLabelMe();
		jLabelid_facturaFK_IdFacturaNotaCredito.setText("Factura :");
		jLabelid_facturaFK_IdFacturaNotaCredito.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaNotaCredito= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito.setFocusable(false);

		this.jPanelFK_IdTransportistaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaNotaCredito.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaNotaCredito= new JButtonMe();
		this.jButtonFK_IdTransportistaNotaCredito.setText("Buscar");
		this.jButtonFK_IdTransportistaNotaCredito.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaNotaCredito,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaNotaCredito = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaNotaCredito.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaNotaCredito.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaNotaCredito= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorNotaCredito.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorNotaCredito= new JButtonMe();
		this.jButtonFK_IdVendedorNotaCredito.setText("Buscar");
		this.jButtonFK_IdVendedorNotaCredito.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorNotaCredito,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorNotaCredito = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorNotaCredito.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorNotaCredito.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorNotaCredito= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito.setFocusable(false);


		this.jTabbedPaneBusquedasNotaCredito=new JTabbedPane();


		this.jTabbedPaneBusquedasNotaCredito.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCredito.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCredito.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNotaCredito = new NotaCreditoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nota Credito DATOS");
			this.jInternalFrameDetalleFormNotaCredito = new NotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.notacreditoSessionBean.getConGuardarRelaciones(),this.notacreditoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNotaCredito = null;//new NotaCreditoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCredito= new GridBagLayout();
		
		
		this.jTableDatosNotaCredito = new JTableMe();      
		
		String sToolTipNotaCredito="";
		sToolTipNotaCredito=NotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCredito+="(Facturacion.NotaCredito)";
		}
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCredito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNotaCredito.setToolTipText(sToolTipNotaCredito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNotaCredito);
		this.jTableDatosNotaCredito.setAutoCreateRowSorter(true);
		this.jTableDatosNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNotaCredito.setRowSelectionAllowed(true);
		this.jTableDatosNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNotaCredito = new JButtonMe();
		this.jButtonDuplicarNotaCredito = new JButtonMe();
		this.jButtonCopiarNotaCredito = new JButtonMe();
		this.jButtonVerFormNotaCredito = new JButtonMe();
		this.jButtonNuevoRelacionesNotaCredito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNotaCredito = new JButtonMe();
		this.jButtonCerrarNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosGeneralNotaCredito = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Nota Credito";
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesNotaCredito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCredito.setName("jPanelCamposFintotalNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoNotaCredito=new ReporteDinamicoJInternalFrame(NotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNotaCredito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNotaCredito=new ImportacionJInternalFrame(NotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNotaCredito();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNotaCredito = new JButtonMe();
		
		this.jButtonAbrirOrderByNotaCredito.setText("Orden");
		this.jButtonAbrirOrderByNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCredito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCredito,false,this);
			
			//this.cargarOrderByNotaCredito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCredito,true,this);
			
			//this.cargarOrderByNotaCredito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNotaCredito.setMinimumSize(new Dimension(400,50));//3530
		this.jTableDatosNotaCredito.setMaximumSize(new Dimension(400,50));//3530
		this.jTableDatosNotaCredito.setPreferredSize(new Dimension(400,50));//3530
		
		this.jScrollPanelDatosNotaCredito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCredito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCredito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNotaCredito.setText("Nuevo");
		this.jButtonDuplicarNotaCredito.setText("Duplicar");
		this.jButtonCopiarNotaCredito.setText("Copiar");
		this.jButtonVerFormNotaCredito.setText("Ver");
		this.jButtonNuevoRelacionesNotaCredito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNotaCredito.setText("Guardar");
		this.jButtonCerrarNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCredito,"nuevo_button","Nuevo",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNotaCredito,"duplicar_button","Duplicar",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNotaCredito,"copiar_button","Copiar",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNotaCredito,"ver_form","Ver",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNotaCredito,"nuevorelaciones_button","Nuevo Rel",this.notacreditoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCredito,"guardarcambiostabla_button","Guardar",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCredito,"cerrar_button","Salir",this.notacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNotaCredito.setToolTipText("Nuevo"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNotaCredito.setToolTipText("Duplicar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNotaCredito.setToolTipText("Copiar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNotaCredito.setToolTipText("Ver"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNotaCredito.setToolTipText("Nuevo Rel"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNotaCredito.setToolTipText("Guardar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCredito.setToolTipText("Salir"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCredito";
		inputMap = this.jButtonNuevoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCredito"));
		
		//DUPLICAR
		sMapKey = "DuplicarNotaCredito";
		inputMap = this.jButtonDuplicarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNotaCredito"));
		
		//COPIAR
		sMapKey = "CopiarNotaCredito";
		inputMap = this.jButtonCopiarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNotaCredito"));
		
		//VEr FORM
		sMapKey = "VerFormNotaCredito";
		inputMap = this.jButtonVerFormNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNotaCredito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNotaCredito";
		inputMap = this.jButtonNuevoRelacionesNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNotaCredito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNotaCredito";
		inputMap = this.jButtonModificarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNotaCredito"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNotaCredito";
		inputMap = this.jButtonCerrarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCredito"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNotaCredito.setName("jPanelParametrosReportesNotaCredito"); 
		
		this.jPanelParametrosReportesAccionesNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNotaCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNotaCredito.setName("jPanelParametrosReportesAccionesNotaCredito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNotaCredito = new JButtonMe();
		this.jButtonRecargarInformacionNotaCredito.setText("Recargar");
		this.jButtonRecargarInformacionNotaCredito.setToolTipText("Recargar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNotaCredito,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNotaCredito = new JButtonMe();
		this.jButtonProcesarInformacionNotaCredito.setText("Procesar");
		this.jButtonProcesarInformacionNotaCredito.setToolTipText("Procesar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNotaCredito.setVisible(false);
			
		this.jButtonProcesarInformacionNotaCredito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCredito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCredito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCredito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNotaCredito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCredito.setText("TIPO");       
		this.jComboBoxTiposReportesNotaCredito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCredito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNotaCredito.setText("Paginacion");
		this.jComboBoxTiposPaginacionNotaCredito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNotaCredito.setText("Accion");
		this.jComboBoxTiposRelacionesNotaCredito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesNotaCredito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNotaCredito.setText("Accion");
		this.jComboBoxTiposSeleccionarNotaCredito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNotaCredito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNotaCredito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCredito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCredito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNotaCredito = new JLabelMe();
		
		this.jLabelAccionesNotaCredito.setText("Acciones");		
		this.jLabelAccionesNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNotaCredito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNotaCredito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNotaCredito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNotaCredito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNotaCredito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNotaCredito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNotaCredito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoReporteNotaCredito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNotaCredito = new JButtonMe();
		//this.jButtonAnterioresNotaCredito.setText("<<");
        this.jButtonAnterioresNotaCredito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNotaCredito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNotaCredito = new JButtonMe();
		//this.jButtonSiguientesNotaCredito.setText(">>");
        this.jButtonSiguientesNotaCredito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNotaCredito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNotaCredito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNotaCredito.setText("Nue");
        this.jButtonNuevoGuardarCambiosNotaCredito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNotaCredito,"nuevoguardarcambios_button","Nue",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNotaCredito";
		inputMap = this.jButtonNuevoGuardarCambiosNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNotaCredito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNotaCredito";
		inputMap = this.jButtonRecargarInformacionNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNotaCredito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNotaCredito";
		inputMap = this.jButtonSiguientesNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNotaCredito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNotaCredito";
		inputMap = this.jButtonAnterioresNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNotaCredito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNotaCredito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNotaCredito.setMinimumSize(new Dimension(this.getWidth(),NotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCredito.setMaximumSize(new Dimension(this.getWidth(),NotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCredito.setPreferredSize(new Dimension(this.getWidth(),NotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNotaCredito = new GridBagLayout();

			this.jPanelPaginacionNotaCredito.setLayout(gridaBagLayoutPaginacionNotaCredito);						
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = 0;
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNotaCredito.add(this.jButtonAnterioresNotaCredito, this.gridBagConstraintsNotaCredito);
					
						
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsNotaCredito.gridy = 0;//
			
			this.jPanelPaginacionNotaCredito.add(this.jButtonNuevoGuardarCambiosNotaCredito, this.gridBagConstraintsNotaCredito);//
						
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNotaCredito.gridy = 0;
			this.jPanelPaginacionNotaCredito.add(this.jButtonSiguientesNotaCredito, this.gridBagConstraintsNotaCredito);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCredito.gridy = 1;//
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCredito.add(this.jButtonNuevoNotaCredito, this.gridBagConstraintsNotaCredito);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNotaCredito.gridy = 1;
				this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNotaCredito.add(this.jButtonNuevoRelacionesNotaCredito, this.gridBagConstraintsNotaCredito);
			}
			
			
			if(!this.notacreditoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
				this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsNotaCredito.gridy = 1;//
				this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionNotaCredito.add(this.jButtonGuardarCambiosTablaNotaCredito, this.gridBagConstraintsNotaCredito);//
			}
			
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCredito.gridy = 1;//
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCredito.add(this.jButtonDuplicarNotaCredito, this.gridBagConstraintsNotaCredito);//
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCredito.gridy = 1;//
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCredito.add(this.jButtonCopiarNotaCredito, this.gridBagConstraintsNotaCredito);//
		
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();//
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCredito.gridy = 1;//
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCredito.add(this.jButtonVerFormNotaCredito, this.gridBagConstraintsNotaCredito);//
		
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = 1;
			this.gridBagConstraintsNotaCredito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNotaCredito.add(this.jButtonCerrarNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		
		this.jButtonRecargarInformacionNotaCredito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCredito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCredito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNotaCredito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCredito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCredito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNotaCredito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCredito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCredito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNotaCredito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCredito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCredito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNotaCredito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCredito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCredito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNotaCredito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NotaCredito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNotaCredito.setLayout(gridaBagParametrosReportesNotaCredito);
			this.jPanelParametrosReportesAccionesNotaCredito.setLayout(gridaBagParametrosReportesAccionesNotaCredito);
			
			
			this.jPanelParametrosAuxiliar1NotaCredito.setLayout(gridaBagParametrosAuxiliar1NotaCredito);
			this.jPanelParametrosAuxiliar2NotaCredito.setLayout(gridaBagParametrosAuxiliar2NotaCredito);
			this.jPanelParametrosAuxiliar3NotaCredito.setLayout(gridaBagParametrosAuxiliar3NotaCredito);
			this.jPanelParametrosAuxiliar4NotaCredito.setLayout(gridaBagParametrosAuxiliar4NotaCredito);
			//this.jPanelParametrosAuxiliar5NotaCredito.setLayout(gridaBagParametrosAuxiliar2NotaCredito);			
			
			
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCredito.add(this.jButtonRecargarInformacionNotaCredito, this.gridBagConstraintsNotaCredito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCredito.add(this.jComboBoxTiposPaginacionNotaCredito, this.gridBagConstraintsNotaCredito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCredito.add(this.jCheckBoxConAltoMaximoTablaNotaCredito, this.gridBagConstraintsNotaCredito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCredito.add(this.jComboBoxTiposArchivosReportesNotaCredito, this.gridBagConstraintsNotaCredito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCredito.add(this.jPanelParametrosAuxiliar1NotaCredito, this.gridBagConstraintsNotaCredito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NotaCredito.add(this.jComboBoxTiposReportesNotaCredito, this.gridBagConstraintsNotaCredito);																		
			
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4NotaCredito.add(this.jComboBoxTiposGraficosReportesNotaCredito, this.gridBagConstraintsNotaCredito);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCredito.add(this.jPanelParametrosAuxiliar4NotaCredito, this.gridBagConstraintsNotaCredito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCredito.add(this.jComboBoxTiposReportesNotaCredito, this.gridBagConstraintsNotaCredito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCredito.add(this.jCheckBoxGenerarReporteNotaCredito, this.gridBagConstraintsNotaCredito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCredito.add(this.jPanelParametrosAuxiliar2NotaCredito, this.gridBagConstraintsNotaCredito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCredito.add(this.jLabelAccionesNotaCredito, this.gridBagConstraintsNotaCredito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNotaCredito.add(this.jButtonAbrirOrderByNotaCredito, this.gridBagConstraintsNotaCredito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCredito.add(this.jComboBoxTiposSeleccionarNotaCredito, this.gridBagConstraintsNotaCredito);			
			
			
			/*
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCredito.add(this.jCheckBoxSeleccionarTodosNotaCredito, this.gridBagConstraintsNotaCredito);
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCredito.add(this.jCheckBoxConGraficoReporteNotaCredito, this.gridBagConstraintsNotaCredito);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCredito.add(this.jCheckBoxSeleccionarTodosNotaCredito, this.gridBagConstraintsNotaCredito);															
				
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCredito.add(this.jCheckBoxSeleccionadosNotaCredito, this.gridBagConstraintsNotaCredito);															
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCredito.add(this.jCheckBoxConGraficoReporteNotaCredito, this.gridBagConstraintsNotaCredito);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCredito.add(this.jPanelParametrosAuxiliar3NotaCredito, this.gridBagConstraintsNotaCredito);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCredito.add(this.jComboBoxTiposRelacionesNotaCredito, this.gridBagConstraintsNotaCredito);
				
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCredito.add(this.jComboBoxTiposAccionesNotaCredito, this.gridBagConstraintsNotaCredito);
	
				
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCredito.add(this.jTextFieldValorCampoGeneralNotaCredito, this.gridBagConstraintsNotaCredito);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCredito= new GridBagLayout();
		this.jPanelCamposFintotalNotaCredito.setLayout(gridaBagLayoutCamposFintotalNotaCredito);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNotaCredito = new GridBagLayout();

			this.jScrollPanelDatosNotaCredito.setLayout(gridaBagLayoutDatosNotaCredito);
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = 0;
			this.gridBagConstraintsNotaCredito.gridx = 0;
			
			this.jScrollPanelDatosNotaCredito.add(this.jTableDatosNotaCredito, this.gridBagConstraintsNotaCredito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNotaCredito.setViewportView(this.jTableDatosNotaCredito);
		this.jTableDatosNotaCredito.setFillsViewportHeight(true);
		this.jTableDatosNotaCredito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNotaCredito= new GridBagLayout();
		this.jPanelAccionesNotaCredito.setLayout(gridaBagLayoutAccionesNotaCredito);
		
		
		/*	
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 0;
			
		this.jPanelAccionesNotaCredito.add(this.jButtonNuevoNotaCredito, this.gridBagConstraintsNotaCredito);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoNotaCredito= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoNotaCredito.setLayout(gridaBagLayoutBusquedaPorCodigoNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelBusquedaPorCodigoNotaCredito.add(jLabelcodigoBusquedaPorCodigoNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelBusquedaPorCodigoNotaCredito.add(jTextFieldcodigoBusquedaPorCodigoNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelBusquedaPorCodigoNotaCredito.add(jButtonBusquedaPorCodigoNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroPreImpresoNotaCredito.setLayout(gridaBagLayoutBusquedaPorNumeroPreImpresoNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelBusquedaPorNumeroPreImpresoNotaCredito.add(jLabelnumeroBusquedaPorNumeroPreImpresoNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelBusquedaPorNumeroPreImpresoNotaCredito.add(jTextFieldnumeroBusquedaPorNumeroPreImpresoNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelBusquedaPorNumeroPreImpresoNotaCredito.add(jButtonBusquedaPorNumeroPreImpresoNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("2.-Por Nro Preimpreso ", jPanelBusquedaPorNumeroPreImpresoNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClienteNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdClienteNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteNotaCredito.setLayout(gridaBagLayoutFK_IdClienteNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdClienteNotaCredito.add(jLabelid_clienteFK_IdClienteNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelFK_IdClienteNotaCredito.add(jComboBoxid_clienteFK_IdClienteNotaCredito, gridBagConstraintsNotaCredito);


		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdClienteNotaCredito.add(this.jButtonBuscarFK_IdClienteid_clienteNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelFK_IdClienteNotaCredito.add(jButtonFK_IdClienteNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("3.-Por Cliente ", jPanelFK_IdClienteNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFacturaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaNotaCredito.setLayout(gridaBagLayoutFK_IdFacturaNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdFacturaNotaCredito.add(jLabelid_facturaFK_IdFacturaNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelFK_IdFacturaNotaCredito.add(jComboBoxid_facturaFK_IdFacturaNotaCredito, gridBagConstraintsNotaCredito);


		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdFacturaNotaCredito.add(this.jButtonBuscarFK_IdFacturaid_facturaNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelFK_IdFacturaNotaCredito.add(jButtonFK_IdFacturaNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("4.-Por Factura ", jPanelFK_IdFacturaNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTransportistaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaNotaCredito.setLayout(gridaBagLayoutFK_IdTransportistaNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdTransportistaNotaCredito.add(jLabelid_transportistaFK_IdTransportistaNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelFK_IdTransportistaNotaCredito.add(jComboBoxid_transportistaFK_IdTransportistaNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelFK_IdTransportistaNotaCredito.add(jButtonFK_IdTransportistaNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("5.-Por Transportista ", jPanelFK_IdTransportistaNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdVendedorNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorNotaCredito.setLayout(gridaBagLayoutFK_IdVendedorNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdVendedorNotaCredito.add(jLabelid_vendedorFK_IdVendedorNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 1;
		jPanelFK_IdVendedorNotaCredito.add(jComboBoxid_vendedorFK_IdVendedorNotaCredito, gridBagConstraintsNotaCredito);


		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCredito.gridy = 0;
		gridBagConstraintsNotaCredito.gridx = 0;
		jPanelFK_IdVendedorNotaCredito.add(this.jButtonBuscarFK_IdVendedorid_vendedorNotaCredito, gridBagConstraintsNotaCredito);

		gridBagConstraintsNotaCredito = new GridBagConstraints();
		gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCredito.gridy = 1;
		gridBagConstraintsNotaCredito.gridx =1;
		jPanelFK_IdVendedorNotaCredito.add(jButtonFK_IdVendedorNotaCredito, gridBagConstraintsNotaCredito);

		jTabbedPaneBusquedasNotaCredito.addTab("6.-Por Vendedor ", jPanelFK_IdVendedorNotaCredito);
		jTabbedPaneBusquedasNotaCredito.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCredito);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCredito.gridx = 0;		
			//this.gridBagConstraintsNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCredito.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNotaCredito, this.gridBagConstraintsNotaCredito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNotaCredito.gridx = 0;		
		//this.gridBagConstraintsNotaCredito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNotaCredito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNotaCredito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCredito.gridx = 0;		
			this.gridBagConstraintsNotaCredito.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNotaCredito.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNotaCredito, this.gridBagConstraintsNotaCredito);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNotaCredito, this.gridBagConstraintsNotaCredito);								
		
		
		/*
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNotaCredito, this.gridBagConstraintsNotaCredito);
		*/		
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCredito.gridx =0;
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCredito, this.gridBagConstraintsNotaCredito);
				
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNotaCredito, this.gridBagConstraintsNotaCredito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCredito = new GridBagLayout();
			this.jPanelBusquedasParametrosNotaCredito.setLayout(gridaBagLayoutBusquedasParametrosNotaCredito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCredito, this.gridBagConstraintsNotaCredito);
			
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCredito, this.gridBagConstraintsNotaCredito);
		
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCredito, this.gridBagConstraintsNotaCredito);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNotaCredito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNotaCredito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNotaCredito.setName("jPanelReporteDinamicoNotaCredito"); 
		
		this.jPanelReporteDinamicoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNotaCredito.setLayout(gridaBagLayoutReporteDinamicoNotaCredito);
		
		
		this.jInternalFrameReporteDinamicoNotaCredito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNotaCredito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNotaCredito.setResizable(true);
	    this.jInternalFrameReporteDinamicoNotaCredito.setClosable(true);
	    this.jInternalFrameReporteDinamicoNotaCredito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNotaCredito = new JLabelMe();

		this.jLabelColumnasSelectReporteNotaCredito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelColumnasSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNotaCredito = new JList<Reporte>();
		this.jListColumnasSelectReporteNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNotaCredito=new JScrollPane(this.jListColumnasSelectReporteNotaCredito);
			
			this.jScrollColumnasSelectReporteNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCredito.add(this.jListColumnasSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		this.jPanelReporteDinamicoNotaCredito.add(this.jScrollColumnasSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNotaCredito = new JLabelMe();

		this.jLabelRelacionesSelectReporteNotaCredito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelRelacionesSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNotaCredito = new JList<Reporte>();
		this.jListRelacionesSelectReporteNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNotaCredito=new JScrollPane(this.jListRelacionesSelectReporteNotaCredito);
			
			this.jScrollRelacionesSelectReporteNotaCredito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCredito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCredito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCredito.add(this.jListRelacionesSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		this.jPanelReporteDinamicoNotaCredito.add(this.jScrollRelacionesSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNotaCredito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNotaCredito = new JComboBoxMe();
		this.jListColumnasValoresGraficoNotaCredito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCredito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoNotaCredito = new JLabelMe();

		this.jLabelConGraficoDinamicoNotaCredito.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelConGraficoDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoNotaCredito.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jCheckBoxConGraficoDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoNotaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoNotaCredito.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelColumnaCategoriaGraficoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoNotaCredito.add(this.jComboBoxColumnaCategoriaGraficoNotaCredito, this.gridBagConstraintsNotaCredito);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorNotaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaValorNotaCredito.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelColumnaCategoriaValorNotaCredito, this.gridBagConstraintsNotaCredito);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorNotaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaValorNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoNotaCredito.add(this.jComboBoxColumnaCategoriaValorNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoNotaCredito = new JLabelMe();

		this.jLabelColumnasValoresGraficoNotaCredito.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelColumnasValoresGraficoNotaCredito, this.gridBagConstraintsNotaCredito);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoNotaCredito = new JList<Reporte>();
		this.jListColumnasValoresGraficoNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoNotaCredito.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoNotaCredito=new JScrollPane(this.jListColumnasValoresGraficoNotaCredito);
			
			this.jScrollColumnasValoresGraficoNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoNotaCredito.add(this.jListColumnasSelectReporteNotaCredito, this.gridBagConstraintsNotaCredito);
		this.jPanelReporteDinamicoNotaCredito.add(this.jScrollColumnasValoresGraficoNotaCredito, this.gridBagConstraintsNotaCredito);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoNotaCredito = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoNotaCredito.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelTiposGraficosReportesDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCredito.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jComboBoxTiposGraficosReportesDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNotaCredito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNotaCredito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelGenerarExcelReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNotaCredito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNotaCredito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNotaCredito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNotaCredito.setToolTipText("Generar EXCEL"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNotaCredito.add(this.jButtonGenerarExcelReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCredito.add(this.jComboBoxTiposReportesDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNotaCredito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNotaCredito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCredito.add(this.jLabelTiposArchivoReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCredito.add(this.jComboBoxTiposArchivosReportesDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNotaCredito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNotaCredito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNotaCredito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNotaCredito.setToolTipText("Generar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCredito.add(this.jButtonGenerarReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNotaCredito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNotaCredito.setToolTipText("Cancelar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCredito.add(this.jButtonCerrarReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNotaCredito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNotaCredito= new JScrollPane(jPanelReporteDinamicoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNotaCredito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNotaCredito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNotaCredito);
		this.jInternalFrameReporteDinamicoNotaCredito.getContentPane().add(this.jScrollPanelReporteDinamicoNotaCredito, this.gridBagConstraintsNotaCredito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNotaCredito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNotaCredito.setName("jPanelImportacionNotaCredito"); 
		
		this.jPanelImportacionNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNotaCredito.setLayout(gridaBagLayoutImportacionNotaCredito);
		
		
		this.jInternalFrameImportacionNotaCredito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNotaCredito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionNotaCredito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCredito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionNotaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNotaCredito = new JLabelMe();

		this.jLabelArchivoImportacionNotaCredito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCredito.add(this.jLabelArchivoImportacionNotaCredito, this.gridBagConstraintsNotaCredito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNotaCredito = new JFileChooser();		
		this.jFileChooserImportacionNotaCredito.setToolTipText("ESCOGER ARCHIVO"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNotaCredito = new JButtonMe();
		this.jButtonAbrirImportacionNotaCredito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNotaCredito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNotaCredito.setToolTipText("Generar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCredito.add(this.jButtonAbrirImportacionNotaCredito, this.gridBagConstraintsNotaCredito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNotaCredito = new JLabelMe();

		this.jLabelPathArchivoImportacionNotaCredito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCredito.add(this.jLabelPathArchivoImportacionNotaCredito, this.gridBagConstraintsNotaCredito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNotaCredito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNotaCredito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCredito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCredito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCredito.add(this.jTextFieldPathArchivoImportacionNotaCredito, this.gridBagConstraintsNotaCredito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNotaCredito = new JButtonMe();
		this.jButtonGenerarImportacionNotaCredito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNotaCredito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNotaCredito.setToolTipText("Generar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCredito.add(this.jButtonGenerarImportacionNotaCredito, this.gridBagConstraintsNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNotaCredito = new JButtonMe();
		this.jButtonCerrarImportacionNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNotaCredito.setToolTipText("Cancelar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCredito.add(this.jButtonCerrarImportacionNotaCredito, this.gridBagConstraintsNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNotaCredito = new GridBagLayout();
		
		this.jScrollPanelImportacionNotaCredito= new JScrollPane(jPanelImportacionNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iPosYImportacion;
		this.gridBagConstraintsNotaCredito.gridx =iPosXImportacion;
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNotaCredito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNotaCredito);
		this.jInternalFrameImportacionNotaCredito.getContentPane().add(this.jScrollPanelImportacionNotaCredito, this.gridBagConstraintsNotaCredito);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNotaCredito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNotaCredito = new JButtonMe();
			this.jButtonAbrirOrderByNotaCredito.setText("Orden");
			this.jButtonAbrirOrderByNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCredito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNotaCredito";
			inputMap = this.jButtonAbrirOrderByNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNotaCredito"));
		
		
			GridBagLayout gridaBagLayoutOrderByNotaCredito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNotaCredito.setName("jPanelOrderByNotaCredito"); 
			
			this.jPanelOrderByNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNotaCredito.setLayout(gridaBagLayoutOrderByNotaCredito);
			
			
			this.jTableDatosNotaCreditoOrderBy = new JTableMe();        
			this.jTableDatosNotaCreditoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNotaCreditoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNotaCreditoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNotaCreditoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNotaCreditoOrderBy.setViewportView(this.jTableDatosNotaCreditoOrderBy);
			this.jTableDatosNotaCreditoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNotaCreditoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNotaCredito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNotaCredito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNotaCredito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNotaCredito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNotaCredito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNotaCredito.setTitle("Orden");
			this.jInternalFrameOrderByNotaCredito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNotaCredito.setResizable(true);
			this.jInternalFrameOrderByNotaCredito.setClosable(true);
			this.jInternalFrameOrderByNotaCredito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNotaCredito.ipady =150;
				
			this.jPanelOrderByNotaCredito.add(jScrollPanelDatosNotaCreditoOrderBy, this.gridBagConstraintsNotaCredito);//this.jTableDatosNotaCreditoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNotaCredito = new JButtonMe();
			this.jButtonCerrarOrderByNotaCredito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNotaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNotaCredito.setToolTipText("Cancelar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNotaCredito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNotaCredito.add(this.jButtonCerrarOrderByNotaCredito, this.gridBagConstraintsNotaCredito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNotaCredito = new GridBagLayout();
			
			this.jScrollPanelOrderByNotaCredito= new JScrollPane(jPanelOrderByNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy =iPosYOrderBy;
			this.gridBagConstraintsNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNotaCredito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNotaCredito);
			
			this.jInternalFrameOrderByNotaCredito.getContentPane().add(this.jScrollPanelOrderByNotaCredito, this.gridBagConstraintsNotaCredito);			
		
		} else {
			this.jButtonAbrirOrderByNotaCredito = new JButtonMe();
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
		int iWidthTableCalculado=0;//8630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.notacreditoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNotaCredito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNotaCredito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNotaCredito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNotaCredito.getRowHeight();//NotaCreditoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCredito.isSelected()) {
					iHeightTable=NotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCredito.isSelected()) {
					iHeightTable=NotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNotaCredito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCredito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCredito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNotaCredito!=null && this.jInternalFrameOrderByNotaCredito.getjTableDatosOrderBy()!=null) {
			//if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNotaCredito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNotaCredito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNotaCredito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNotaCredito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNotaCredito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNotaCredito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNotaCredito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=notacreditoLogic.getNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notacreditos.size();
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
	public static List<NotaCredito> TraerNotaCreditoBeans(List<NotaCredito> notacreditos,ArrayList<Classe> classes)throws Exception {
		try {
			for(NotaCredito notacredito:notacreditos) {
					
				if(!(NotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					notacredito.setsDetalleGeneralEntityReporte(NotaCreditoConstantesFunciones.getNotaCreditoDescripcion(notacredito));
										
					notacredito.setes_cliente_descripcion(NotaCreditoConstantesFunciones.getes_clienteDescripcion(notacredito));	
					
					

					if(notacredito.getDetaNotaCreditos()!=null && Funciones.existeClass(classes,DetaNotaCredito.class)) {
						try{notacredito.setdetanotacreditosDescripcionReporte(new JRBeanCollectionDataSource(DetaNotaCreditoJInternalFrame.TraerDetaNotaCreditoBeans(notacredito.getDetaNotaCreditos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//notacredito.setsDetalleGeneralEntityReporte(notacredito.getsDetalleGeneralEntityReporte());
										
				}
				
				//notacreditobeans.add(notacreditobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return notacreditos;
    }
	//PARA REPORTES FIN
}
