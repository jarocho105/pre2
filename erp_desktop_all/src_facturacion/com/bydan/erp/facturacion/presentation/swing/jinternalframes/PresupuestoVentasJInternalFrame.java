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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
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
import com.bydan.erp.facturacion.util.PresupuestoVentasConstantesFunciones;

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
public class PresupuestoVentasJInternalFrame extends PresupuestoVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoVentas;
	
	protected JMenuBar jmenuBarPresupuestoVentas;
	
	protected JMenu jmenuPresupuestoVentas;
	protected JMenu jmenuDatosPresupuestoVentas;
	protected JMenu jmenuArchivoPresupuestoVentas;
	protected JMenu jmenuAccionesPresupuestoVentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentas;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoVentasDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoVentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoVentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoVentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PresupuestoVentasSessionBean presupuestoventasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoVentas> presupuestoventass;		
	public List<PresupuestoVentas> presupuestoventassEliminados;	
	public List<PresupuestoVentas> presupuestoventassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoVentas;		
	protected JButton jButtonAbrirOrderByPresupuestoVentas;
	
	
	//protected JPanel jPanelOrderByPresupuestoVentas;
	//public JScrollPane jScrollPanelOrderByPresupuestoVentas;	
	//protected JButton jButtonCerrarOrderByPresupuestoVentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoVentasLogic presupuestoventasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoVentas;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentas;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentas;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoVentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoVentas;
	//public JScrollPane jScrollPanelImportacionPresupuestoVentas;
	
	
	
	protected JPanel jPanelAccionesPresupuestoVentas;
	
    protected JPanel jPanelPaginacionPresupuestoVentas;
    protected JPanel jPanelParametrosReportesPresupuestoVentas;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoVentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoVentas;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoVentas;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoVentas;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoVentas;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoVentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoVentas;
	//protected JPanel jPanelImportacionPresupuestoVentas;
	
	
	public JTable jTableDatosPresupuestoVentas;
	
	
	
	//public JTable jTableDatosPresupuestoVentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoVentas;
	protected JButton jButtonDuplicarPresupuestoVentas;
	protected JButton jButtonCopiarPresupuestoVentas;
	protected JButton jButtonVerFormPresupuestoVentas;
	protected JButton jButtonNuevoRelacionesPresupuestoVentas;
	protected JButton jButtonModificarPresupuestoVentas;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoVentas;
	protected JButton jButtonCerrarPresupuestoVentas;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoVentas;
	protected JButton jButtonProcesarInformacionPresupuestoVentas;
	
	
	protected JButton jButtonAnterioresPresupuestoVentas;
	protected JButton jButtonSiguientesPresupuestoVentas;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoVentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoVentas;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoVentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoVentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoVentas;
	//protected JButton jButtonGenerarImportacionPresupuestoVentas;
	//protected JButton jButtonCerrarImportacionPresupuestoVentas;
	//protected JFileChooser jFileChooserImportacionPresupuestoVentas;
	//protected File fileImportacionPresupuestoVentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentas;
	protected JButton jButtonDuplicarToolBarPresupuestoVentas;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentas;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoVentas;
	protected JButton jButtonCopiarToolBarPresupuestoVentas;
	protected JButton jButtonVerFormToolBarPresupuestoVentas;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentas;
	protected JButton jButtonCerrarToolBarPresupuestoVentas;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoVentas;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentas;
	protected JButton jButtonAnterioresToolBarPresupuestoVentas;
	protected JButton jButtonSiguientesToolBarPresupuestoVentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoVentas;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentas;
	protected JMenuItem jMenuItemDuplicarPresupuestoVentas;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoVentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentas;
	protected JMenuItem jMenuItemCopiarPresupuestoVentas;
	protected JMenuItem jMenuItemVerFormPresupuestoVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentas;
	protected JMenuItem jMenuItemCerrarPresupuestoVentas;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentas;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoVentas;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentas;
	protected JMenuItem jMenuItemAnterioresPresupuestoVentas;
	protected JMenuItem jMenuItemSiguientesPresupuestoVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentas;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoVentas;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentas;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoVentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoVentas;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoVentas;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoVentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoVentas;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoVentas;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoVentas;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoVentas;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoVentas;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoVentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoVentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoVentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoVentas;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoVentas;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoVentas;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoVentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoVentas;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoVentas;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoVentas;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoVentas;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoVentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoVentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoVentas;
	public JPanel jPanelFK_IdCiudadPresupuestoVentas;
	public JButton jButtonFK_IdCiudadPresupuestoVentas;
	public JPanel jPanelFK_IdPaisPresupuestoVentas;
	public JButton jButtonFK_IdPaisPresupuestoVentas;
	public JPanel jPanelFK_IdProductoPresupuestoVentas;
	public JButton jButtonFK_IdProductoPresupuestoVentas;
	public JPanel jPanelFK_IdVendedorPresupuestoVentas;
	public JButton jButtonFK_IdVendedorPresupuestoVentas;
	public JPanel jPanelFK_IdZonaPresupuestoVentas;
	public JButton jButtonFK_IdZonaPresupuestoVentas;
	
	public JPanel jPanelid_ciudadFK_IdCiudadPresupuestoVentas;
	public JLabel jLabelid_ciudadFK_IdCiudadPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas;
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisPresupuestoVentas;
	public JLabel jLabelid_paisFK_IdPaisPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisPresupuestoVentas;
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPresupuestoVentas;
	public JLabel jLabelid_productoFK_IdProductoPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPresupuestoVentas;
	public JButton jButtonid_productoFK_IdProductoPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPresupuestoVentasBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPresupuestoVentas;
	
	public JPanel jPanelid_vendedorFK_IdVendedorPresupuestoVentas;
	public JLabel jLabelid_vendedorFK_IdVendedorPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas;
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasArbol= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaPresupuestoVentas;
	public JLabel jLabelid_zonaFK_IdZonaPresupuestoVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaPresupuestoVentas;
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentas= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentasUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresupuestoVentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoVentas)	{
		this.jButtonRecargarInformacionPresupuestoVentas = jButtonRecargarInformacionPresupuestoVentas;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoVentas() {
		return this.jButtonProcesarInformacionPresupuestoVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentas)	{
		this.jButtonProcesarInformacionPresupuestoVentas = jButtonProcesarInformacionPresupuestoVentas;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoVentas() {
		return this.jButtonRecargarInformacionPresupuestoVentas;
	}
	
	
	public List<PresupuestoVentas> getpresupuestoventass() {
		return this.presupuestoventass;
	}

	public void setpresupuestoventass(List<PresupuestoVentas> presupuestoventass) {
		this.presupuestoventass = presupuestoventass;
	}
	
	public List<PresupuestoVentas> getpresupuestoventassAux() {
		return this.presupuestoventassAux;
	}

	public void setpresupuestoventassAux(List<PresupuestoVentas> presupuestoventassAux) {
		this.presupuestoventassAux = presupuestoventassAux;
	}
	
	public List<PresupuestoVentas> getpresupuestoventassEliminados() {
		return this.presupuestoventassEliminados;
	}

	public void setPresupuestoVentassEliminados(List<PresupuestoVentas> presupuestoventassEliminados) {
		this.presupuestoventassEliminados = presupuestoventassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoVentas() {
		return jComboBoxTiposSeleccionarPresupuestoVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoVentas(
			JComboBox jComboBoxTiposSeleccionarPresupuestoVentas) {
		this.jComboBoxTiposSeleccionarPresupuestoVentas = jComboBoxTiposSeleccionarPresupuestoVentas;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoVentas() {
		return jTextFieldValorCampoGeneralPresupuestoVentas;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoVentas(
			JTextField jTextFieldValorCampoGeneralPresupuestoVentas) {
		this.jTextFieldValorCampoGeneralPresupuestoVentas = jTextFieldValorCampoGeneralPresupuestoVentas;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoVentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoVentas() {
		return this.jCheckBoxSeleccionarTodosPresupuestoVentas;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoVentas(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentas) {
		this.jCheckBoxSeleccionarTodosPresupuestoVentas = jCheckBoxSeleccionarTodosPresupuestoVentas;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoVentas() {
		return this.jCheckBoxSeleccionadosPresupuestoVentas;
	}

	public void setjCheckBoxSeleccionadosPresupuestoVentas(
			JCheckBox jCheckBoxSeleccionadosPresupuestoVentas) {
		this.jCheckBoxSeleccionadosPresupuestoVentas = jCheckBoxSeleccionadosPresupuestoVentas;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoVentas() {
		return this.jComboBoxTiposArchivosReportesPresupuestoVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoVentas(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoVentas) {
		this.jComboBoxTiposArchivosReportesPresupuestoVentas = jComboBoxTiposArchivosReportesPresupuestoVentas;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoVentas() {
		return this.jComboBoxTiposReportesPresupuestoVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoVentas(
			JComboBox jComboBoxTiposReportesPresupuestoVentas) {
		this.jComboBoxTiposReportesPresupuestoVentas = jComboBoxTiposReportesPresupuestoVentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoVentas() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoVentas(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentas) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoVentas = jComboBoxTiposReportesDinamicoPresupuestoVentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoVentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoVentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas = jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoVentas() {
		return this.jComboBoxTiposGraficosReportesPresupuestoVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoVentas(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoVentas) {
		this.jComboBoxTiposGraficosReportesPresupuestoVentas = jComboBoxTiposGraficosReportesPresupuestoVentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoVentas() {
		return this.jComboBoxTiposPaginacionPresupuestoVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoVentas(
			JComboBox jComboBoxTiposPaginacionPresupuestoVentas) {
		this.jComboBoxTiposPaginacionPresupuestoVentas = jComboBoxTiposPaginacionPresupuestoVentas;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoVentas() {
		return this.jComboBoxTiposRelacionesPresupuestoVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentas() {
		return this.jComboBoxTiposAccionesPresupuestoVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentas(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentas) {
		this.jComboBoxTiposRelacionesPresupuestoVentas = jComboBoxTiposRelacionesPresupuestoVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentas(
			JComboBox jComboBoxTiposAccionesPresupuestoVentas) {
		this.jComboBoxTiposAccionesPresupuestoVentas = jComboBoxTiposAccionesPresupuestoVentas;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoVentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoVentas() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoVentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoVentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentas) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentas = jCheckBoxConGraficoDinamicoPresupuestoVentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoVentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoVentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentas .setBorder(borderResaltar);		
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
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		
		this.presupuestoventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoVentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"copiar","copiar","Copiar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"ver_form","ver_form","Ver"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"recargar","recargar","Recargar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoVentas,this.jTtoolBarPresupuestoVentas,
							"cerrar","cerrar","Salir"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoVentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentas;
			
				this.jButtonProcesarInformacionToolBarPresupuestoVentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoVentas;
				
		//protected JButton jButtonModificarToolBarPresupuestoVentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoVentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoVentas=new JMenuMe("General");
		this.jmenuArchivoPresupuestoVentas=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoVentas=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoVentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoVentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoVentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoVentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoVentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoVentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoVentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoVentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoVentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoVentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoVentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoVentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoVentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoVentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoVentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoVentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoVentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoVentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoVentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoVentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoVentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoVentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoVentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoVentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoVentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoVentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoVentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoVentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoVentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoVentas.add(this.jMenuItemCerrarPresupuestoVentas);
			
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemNuevoPresupuestoVentas);
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemNuevoGuardarCambiosPresupuestoVentas);
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemNuevoRelacionesPresupuestoVentas);
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemGuardarCambiosTablaPresupuestoVentas);		
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemDuplicarPresupuestoVentas);		
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemCopiarPresupuestoVentas);		
			this.jmenuAccionesPresupuestoVentas.add(this.jMenuItemVerFormPresupuestoVentas);		
			
			this.jmenuDatosPresupuestoVentas.add(this.jMenuItemRecargarInformacionPresupuestoVentas);				
			this.jmenuDatosPresupuestoVentas.add(this.jMenuItemAnterioresPresupuestoVentas);				
			this.jmenuDatosPresupuestoVentas.add(this.jMenuItemSiguientesPresupuestoVentas);				
			this.jmenuDatosPresupuestoVentas.add(this.jMenuItemAbrirOrderByPresupuestoVentas);				
			this.jmenuDatosPresupuestoVentas.add(this.jMenuItemMostrarOcultarPresupuestoVentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoVentas.add(this.jMenuItemGuardarCambiosPresupuestoVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoVentas.add(this.jmenuArchivoPresupuestoVentas);		
			this.jmenuBarPresupuestoVentas.add(this.jmenuAccionesPresupuestoVentas);		
			this.jmenuBarPresupuestoVentas.add(this.jmenuDatosPresupuestoVentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoVentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoVentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadPresupuestoVentas.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadPresupuestoVentas= new JButtonMe();
		this.jButtonFK_IdCiudadPresupuestoVentas.setText("Buscar");
		this.jButtonFK_IdCiudadPresupuestoVentas.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadPresupuestoVentas,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisPresupuestoVentas.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisPresupuestoVentas= new JButtonMe();
		this.jButtonFK_IdPaisPresupuestoVentas.setText("Buscar");
		this.jButtonFK_IdPaisPresupuestoVentas.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisPresupuestoVentas,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisPresupuestoVentas = new JLabelMe();
		jLabelid_paisFK_IdPaisPresupuestoVentas.setText("Pais :");
		jLabelid_paisFK_IdPaisPresupuestoVentas.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPresupuestoVentas.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPresupuestoVentas= new JButtonMe();
		this.jButtonFK_IdProductoPresupuestoVentas.setText("Buscar");
		this.jButtonFK_IdProductoPresupuestoVentas.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPresupuestoVentas,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPresupuestoVentas = new JLabelMe();
		jLabelid_productoFK_IdProductoPresupuestoVentas.setText("Producto :");
		jLabelid_productoFK_IdProductoPresupuestoVentas.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.setFocusable(false);

		this.jPanelFK_IdVendedorPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorPresupuestoVentas.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorPresupuestoVentas= new JButtonMe();
		this.jButtonFK_IdVendedorPresupuestoVentas.setText("Buscar");
		this.jButtonFK_IdVendedorPresupuestoVentas.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorPresupuestoVentas,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaPresupuestoVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaPresupuestoVentas.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaPresupuestoVentas= new JButtonMe();
		this.jButtonFK_IdZonaPresupuestoVentas.setText("Buscar");
		this.jButtonFK_IdZonaPresupuestoVentas.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaPresupuestoVentas,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaPresupuestoVentas = new JLabelMe();
		jLabelid_zonaFK_IdZonaPresupuestoVentas.setText("Zona :");
		jLabelid_zonaFK_IdZonaPresupuestoVentas.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaPresupuestoVentas= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresupuestoVentas=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoVentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoVentas = new PresupuestoVentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Ventas DATOS");
			this.jInternalFrameDetalleFormPresupuestoVentas = new PresupuestoVentasDetalleFormJInternalFrame(jDesktopPane,this.presupuestoventasSessionBean.getConGuardarRelaciones(),this.presupuestoventasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoVentas = null;//new PresupuestoVentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentas= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoVentas = new JTableMe();      
		
		String sToolTipPresupuestoVentas="";
		sToolTipPresupuestoVentas=PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentas+="(Facturacion.PresupuestoVentas)";
		}
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoVentas.setToolTipText(sToolTipPresupuestoVentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoVentas);
		this.jTableDatosPresupuestoVentas.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoVentas.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoVentas = new JButtonMe();
		this.jButtonDuplicarPresupuestoVentas = new JButtonMe();
		this.jButtonCopiarPresupuestoVentas = new JButtonMe();
		this.jButtonVerFormPresupuestoVentas = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoVentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas = new JButtonMe();
		this.jButtonCerrarPresupuestoVentas = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoVentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas";
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentas.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoVentas=new ReporteDinamicoJInternalFrame(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoVentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoVentas=new ImportacionJInternalFrame(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoVentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoVentas = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoVentas.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentas,false,this);
			
			//this.cargarOrderByPresupuestoVentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentas,true,this);
			
			//this.cargarOrderByPresupuestoVentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoVentas.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPresupuestoVentas.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPresupuestoVentas.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPresupuestoVentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoVentas.setText("Nuevo");
		this.jButtonDuplicarPresupuestoVentas.setText("Duplicar");
		this.jButtonCopiarPresupuestoVentas.setText("Copiar");
		this.jButtonVerFormPresupuestoVentas.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoVentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.setText("Guardar");
		this.jButtonCerrarPresupuestoVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentas,"nuevo_button","Nuevo",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoVentas,"duplicar_button","Duplicar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoVentas,"copiar_button","Copiar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoVentas,"ver_form","Ver",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoVentas,"nuevorelaciones_button","Nuevo Rel",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentas,"guardarcambiostabla_button","Guardar",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentas,"cerrar_button","Salir",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoVentas.setToolTipText("Nuevo"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoVentas.setToolTipText("Duplicar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoVentas.setToolTipText("Copiar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoVentas.setToolTipText("Ver"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoVentas.setToolTipText("Nuevo Rel"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.setToolTipText("Guardar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentas.setToolTipText("Salir"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentas";
		inputMap = this.jButtonNuevoPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoVentas";
		inputMap = this.jButtonDuplicarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoVentas"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoVentas";
		inputMap = this.jButtonCopiarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoVentas"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoVentas";
		inputMap = this.jButtonVerFormPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoVentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoVentas";
		inputMap = this.jButtonNuevoRelacionesPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoVentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoVentas";
		inputMap = this.jButtonModificarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoVentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentas";
		inputMap = this.jButtonCerrarPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentas";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoVentas.setName("jPanelParametrosReportesPresupuestoVentas"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoVentas.setName("jPanelParametrosReportesAccionesPresupuestoVentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoVentas = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoVentas.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoVentas.setToolTipText("Recargar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoVentas,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoVentas = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoVentas.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoVentas.setToolTipText("Procesar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoVentas.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoVentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoVentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentas.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoVentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoVentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoVentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoVentas.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoVentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentas.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoVentas.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoVentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoVentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoVentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoVentas = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentas.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoVentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoVentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoVentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoVentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoVentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoVentas.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoVentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoVentas = new JButtonMe();
		//this.jButtonAnterioresPresupuestoVentas.setText("<<");
        this.jButtonAnterioresPresupuestoVentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoVentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoVentas = new JButtonMe();
		//this.jButtonSiguientesPresupuestoVentas.setText(">>");
        this.jButtonSiguientesPresupuestoVentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoVentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoVentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoVentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoVentas,"nuevoguardarcambios_button","Nue",this.presupuestoventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoVentas";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoVentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoVentas";
		inputMap = this.jButtonRecargarInformacionPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoVentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoVentas";
		inputMap = this.jButtonSiguientesPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoVentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoVentas";
		inputMap = this.jButtonAnterioresPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoVentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoVentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoVentas.setMinimumSize(new Dimension(this.getWidth(),PresupuestoVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentas.setMaximumSize(new Dimension(this.getWidth(),PresupuestoVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentas.setPreferredSize(new Dimension(this.getWidth(),PresupuestoVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoVentas = new GridBagLayout();

			this.jPanelPaginacionPresupuestoVentas.setLayout(gridaBagLayoutPaginacionPresupuestoVentas);						
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 0;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonAnterioresPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					
						
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentas.gridy = 0;
			
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonNuevoGuardarCambiosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
						
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentas.gridy = 0;
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonSiguientesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonNuevoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
						
			
			
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoVentas.gridy = 1;
				this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoVentas.add(this.jButtonGuardarCambiosTablaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			}
			
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonDuplicarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonCopiarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonVerFormPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoVentas.add(this.jButtonCerrarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		
		this.jButtonRecargarInformacionPresupuestoVentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoVentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoVentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoVentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoVentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoVentas.setLayout(gridaBagParametrosReportesPresupuestoVentas);
			this.jPanelParametrosReportesAccionesPresupuestoVentas.setLayout(gridaBagParametrosReportesAccionesPresupuestoVentas);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoVentas.setLayout(gridaBagParametrosAuxiliar1PresupuestoVentas);
			this.jPanelParametrosAuxiliar2PresupuestoVentas.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentas);
			this.jPanelParametrosAuxiliar3PresupuestoVentas.setLayout(gridaBagParametrosAuxiliar3PresupuestoVentas);
			this.jPanelParametrosAuxiliar4PresupuestoVentas.setLayout(gridaBagParametrosAuxiliar4PresupuestoVentas);
			//this.jPanelParametrosAuxiliar5PresupuestoVentas.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentas);			
			
			
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jButtonRecargarInformacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentas.add(this.jComboBoxTiposPaginacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentas.add(this.jCheckBoxConAltoMaximoTablaPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentas.add(this.jComboBoxTiposArchivosReportesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jPanelParametrosAuxiliar1PresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoVentas.add(this.jComboBoxTiposReportesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);																		
			
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoVentas.add(this.jComboBoxTiposGraficosReportesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jPanelParametrosAuxiliar4PresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jComboBoxTiposReportesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jCheckBoxGenerarReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jPanelParametrosAuxiliar2PresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jLabelAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoVentas.add(this.jButtonAbrirOrderByPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jComboBoxTiposSeleccionarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			
			
			/*
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jCheckBoxSeleccionarTodosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jCheckBoxConGraficoReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentas.add(this.jCheckBoxSeleccionarTodosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);															
				
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentas.add(this.jCheckBoxSeleccionadosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);															
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentas.add(this.jCheckBoxConGraficoReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jPanelParametrosAuxiliar3PresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jComboBoxTiposAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
	
				
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentas.add(this.jTextFieldValorCampoGeneralPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoVentas = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoVentas.setLayout(gridaBagLayoutDatosPresupuestoVentas);
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = 0;
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoVentas.add(this.jTableDatosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoVentas.setViewportView(this.jTableDatosPresupuestoVentas);
		this.jTableDatosPresupuestoVentas.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoVentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentas= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentas.setLayout(gridaBagLayoutAccionesPresupuestoVentas);
		
		
		/*	
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
			
		this.jPanelAccionesPresupuestoVentas.add(this.jButtonNuevoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadPresupuestoVentas= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadPresupuestoVentas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadPresupuestoVentas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadPresupuestoVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadPresupuestoVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadPresupuestoVentas.setLayout(gridaBagLayoutFK_IdCiudadPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdCiudadPresupuestoVentas.add(jLabelid_ciudadFK_IdCiudadPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 1;
		jPanelFK_IdCiudadPresupuestoVentas.add(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 1;
		gridBagConstraintsPresupuestoVentas.gridx =1;
		jPanelFK_IdCiudadPresupuestoVentas.add(jButtonFK_IdCiudadPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		jTabbedPaneBusquedasPresupuestoVentas.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadPresupuestoVentas);
		jTabbedPaneBusquedasPresupuestoVentas.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisPresupuestoVentas= new GridBagLayout();
		gridaBagLayoutFK_IdPaisPresupuestoVentas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisPresupuestoVentas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisPresupuestoVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisPresupuestoVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisPresupuestoVentas.setLayout(gridaBagLayoutFK_IdPaisPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdPaisPresupuestoVentas.add(jLabelid_paisFK_IdPaisPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 1;
		jPanelFK_IdPaisPresupuestoVentas.add(jComboBoxid_paisFK_IdPaisPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 1;
		gridBagConstraintsPresupuestoVentas.gridx =1;
		jPanelFK_IdPaisPresupuestoVentas.add(jButtonFK_IdPaisPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		jTabbedPaneBusquedasPresupuestoVentas.addTab("2.-Por Pais ", jPanelFK_IdPaisPresupuestoVentas);
		jTabbedPaneBusquedasPresupuestoVentas.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoPresupuestoVentas= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPresupuestoVentas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPresupuestoVentas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPresupuestoVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPresupuestoVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPresupuestoVentas.setLayout(gridaBagLayoutFK_IdProductoPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdProductoPresupuestoVentas.add(jLabelid_productoFK_IdProductoPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 1;
		jPanelFK_IdProductoPresupuestoVentas.add(jComboBoxid_productoFK_IdProductoPresupuestoVentas, gridBagConstraintsPresupuestoVentas);


		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdProductoPresupuestoVentas.add(this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 1;
		gridBagConstraintsPresupuestoVentas.gridx =1;
		jPanelFK_IdProductoPresupuestoVentas.add(jButtonFK_IdProductoPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		jTabbedPaneBusquedasPresupuestoVentas.addTab("3.-Por Producto ", jPanelFK_IdProductoPresupuestoVentas);
		jTabbedPaneBusquedasPresupuestoVentas.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdVendedorPresupuestoVentas= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorPresupuestoVentas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorPresupuestoVentas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorPresupuestoVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorPresupuestoVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorPresupuestoVentas.setLayout(gridaBagLayoutFK_IdVendedorPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdVendedorPresupuestoVentas.add(jLabelid_vendedorFK_IdVendedorPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 1;
		jPanelFK_IdVendedorPresupuestoVentas.add(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 1;
		gridBagConstraintsPresupuestoVentas.gridx =1;
		jPanelFK_IdVendedorPresupuestoVentas.add(jButtonFK_IdVendedorPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		jTabbedPaneBusquedasPresupuestoVentas.addTab("4.-Por Vendedor ", jPanelFK_IdVendedorPresupuestoVentas);
		jTabbedPaneBusquedasPresupuestoVentas.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdZonaPresupuestoVentas= new GridBagLayout();
		gridaBagLayoutFK_IdZonaPresupuestoVentas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaPresupuestoVentas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaPresupuestoVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaPresupuestoVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaPresupuestoVentas.setLayout(gridaBagLayoutFK_IdZonaPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 0;
		jPanelFK_IdZonaPresupuestoVentas.add(jLabelid_zonaFK_IdZonaPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 0;
		gridBagConstraintsPresupuestoVentas.gridx = 1;
		jPanelFK_IdZonaPresupuestoVentas.add(jComboBoxid_zonaFK_IdZonaPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentas.gridy = 1;
		gridBagConstraintsPresupuestoVentas.gridx =1;
		jPanelFK_IdZonaPresupuestoVentas.add(jButtonFK_IdZonaPresupuestoVentas, gridBagConstraintsPresupuestoVentas);

		jTabbedPaneBusquedasPresupuestoVentas.addTab("5.-Por Zona ", jPanelFK_IdZonaPresupuestoVentas);
		jTabbedPaneBusquedasPresupuestoVentas.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;		
		//this.gridBagConstraintsPresupuestoVentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoVentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoVentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentas.gridx = 0;		
			this.gridBagConstraintsPresupuestoVentas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoVentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);								
		
		
		/*
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		*/		
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentas.gridx =0;
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
				
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentas = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoVentas.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoVentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
			
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoVentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoVentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoVentas.setName("jPanelReporteDinamicoPresupuestoVentas"); 
		
		this.jPanelReporteDinamicoPresupuestoVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoVentas.setLayout(gridaBagLayoutReporteDinamicoPresupuestoVentas);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoVentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoVentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoVentas = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoVentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelColumnasSelectReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoVentas = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoVentas=new JScrollPane(this.jListColumnasSelectReportePresupuestoVentas);
			
			this.jScrollColumnasSelectReportePresupuestoVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoVentas.add(this.jListColumnasSelectReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jScrollColumnasSelectReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoVentas = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoVentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoVentas = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoVentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoVentas=new JScrollPane(this.jListRelacionesSelectReportePresupuestoVentas);
			
			this.jScrollRelacionesSelectReportePresupuestoVentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoVentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoVentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoVentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoVentas = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoVentas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelConGraficoDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoVentas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoVentas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jCheckBoxConGraficoDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoVentas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoVentas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelColumnaCategoriaGraficoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoVentas = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoVentas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelColumnaCategoriaValorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jComboBoxColumnaCategoriaValorPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoVentas = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoVentas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelColumnasValoresGraficoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoVentas = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoVentas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoVentas=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoVentas);
			
			this.jScrollColumnasValoresGraficoPresupuestoVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoVentas.add(this.jListColumnasSelectReportePresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jScrollColumnasValoresGraficoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas.setToolTipText("Generar EXCEL"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoVentas.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jComboBoxTiposReportesDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoVentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoVentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoVentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoVentas.setToolTipText("Generar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jButtonGenerarReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoVentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoVentas.setToolTipText("Cancelar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentas.add(this.jButtonCerrarReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoVentas= new JScrollPane(jPanelReporteDinamicoPresupuestoVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoVentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoVentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentas);
		this.jInternalFrameReporteDinamicoPresupuestoVentas.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoVentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoVentas.setName("jPanelImportacionPresupuestoVentas"); 
		
		this.jPanelImportacionPresupuestoVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoVentas.setLayout(gridaBagLayoutImportacionPresupuestoVentas);
		
		
		this.jInternalFrameImportacionPresupuestoVentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoVentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentas.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentas.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentas.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentas.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoVentas = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoVentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentas.add(this.jLabelArchivoImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoVentas = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoVentas.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoVentas = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoVentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoVentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoVentas.setToolTipText("Generar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentas.add(this.jButtonAbrirImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoVentas = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoVentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentas.add(this.jLabelPathArchivoImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoVentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoVentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentas.add(this.jTextFieldPathArchivoImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoVentas = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoVentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoVentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoVentas.setToolTipText("Generar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentas.add(this.jButtonGenerarImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoVentas = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoVentas.setToolTipText("Cancelar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentas.add(this.jButtonCerrarImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoVentas = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoVentas= new JScrollPane(jPanelImportacionPresupuestoVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentas.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentas.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoVentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoVentas);
		this.jInternalFrameImportacionPresupuestoVentas.getContentPane().add(this.jScrollPanelImportacionPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoVentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoVentas = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoVentas.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoVentas";
			inputMap = this.jButtonAbrirOrderByPresupuestoVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoVentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoVentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoVentas.setName("jPanelOrderByPresupuestoVentas"); 
			
			this.jPanelOrderByPresupuestoVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoVentas.setLayout(gridaBagLayoutOrderByPresupuestoVentas);
			
			
			this.jTableDatosPresupuestoVentasOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoVentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoVentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoVentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoVentasOrderBy.setViewportView(this.jTableDatosPresupuestoVentasOrderBy);
			this.jTableDatosPresupuestoVentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoVentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoVentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoVentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoVentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoVentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoVentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoVentas.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoVentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoVentas.setResizable(true);
			this.jInternalFrameOrderByPresupuestoVentas.setClosable(true);
			this.jInternalFrameOrderByPresupuestoVentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoVentas.ipady =150;
				
			this.jPanelOrderByPresupuestoVentas.add(jScrollPanelDatosPresupuestoVentasOrderBy, this.gridBagConstraintsPresupuestoVentas);//this.jTableDatosPresupuestoVentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoVentas = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoVentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoVentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoVentas.setToolTipText("Cancelar"+" "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoVentas.add(this.jButtonCerrarOrderByPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoVentas = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoVentas= new JScrollPane(jPanelOrderByPresupuestoVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoVentas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoVentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoVentas);
			
			this.jInternalFrameOrderByPresupuestoVentas.getContentPane().add(this.jScrollPanelOrderByPresupuestoVentas, this.gridBagConstraintsPresupuestoVentas);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoVentas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoventasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoVentas.getRowHeight();//PresupuestoVentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.isSelected()) {
					iHeightTable=PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentas.isSelected()) {
					iHeightTable=PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoVentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoVentas!=null && this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoVentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoVentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoVentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoventasLogic.getPresupuestoVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoVentas> TraerPresupuestoVentasBeans(List<PresupuestoVentas> presupuestoventass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoVentas presupuestoventas:presupuestoventass) {
					
				if(!(PresupuestoVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoventas.setsDetalleGeneralEntityReporte(PresupuestoVentasConstantesFunciones.getPresupuestoVentasDescripcion(presupuestoventas));
										
						
					
						
					
				} else  {
							
					//presupuestoventas.setsDetalleGeneralEntityReporte(presupuestoventas.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoventasbeans.add(presupuestoventasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoventass;
    }
	//PARA REPORTES FIN
}
