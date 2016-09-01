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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class BuscarProductoFacturasJInternalFrame extends BuscarProductoFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBuscarProductoFacturas;
	
	protected JMenuBar jmenuBarBuscarProductoFacturas;
	
	protected JMenu jmenuBuscarProductoFacturas;
	protected JMenu jmenuDatosBuscarProductoFacturas;
	protected JMenu jmenuArchivoBuscarProductoFacturas;
	protected JMenu jmenuAccionesBuscarProductoFacturas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBuscarProductoFacturas;	
	protected GridBagConstraints gridBagConstraintsBuscarProductoFacturas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BuscarProductoFacturasDetalleFormJInternalFrame jInternalFrameDetalleFormBuscarProductoFacturas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBuscarProductoFacturas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBuscarProductoFacturas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public BuscarProductoFacturasSessionBean buscarproductofacturasSessionBean;
		
	
	
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BuscarProductoFacturas> buscarproductofacturass;		
	public List<BuscarProductoFacturas> buscarproductofacturassEliminados;	
	public List<BuscarProductoFacturas> buscarproductofacturassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBuscarProductoFacturas;		
	protected JButton jButtonAbrirOrderByBuscarProductoFacturas;
	
	
	//protected JPanel jPanelOrderByBuscarProductoFacturas;
	//public JScrollPane jScrollPanelOrderByBuscarProductoFacturas;	
	//protected JButton jButtonCerrarOrderByBuscarProductoFacturas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BuscarProductoFacturasLogic buscarproductofacturasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBuscarProductoFacturas;
	public JScrollPane jScrollPanelDatosEdicionBuscarProductoFacturas;
	public JScrollPane jScrollPanelDatosGeneralBuscarProductoFacturas;
    
	
	
	//public JScrollPane jScrollPanelDatosBuscarProductoFacturasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBuscarProductoFacturas;
	//public JScrollPane jScrollPanelImportacionBuscarProductoFacturas;
	
	
	
	protected JPanel jPanelAccionesBuscarProductoFacturas;
	
    protected JPanel jPanelPaginacionBuscarProductoFacturas;
    protected JPanel jPanelParametrosReportesBuscarProductoFacturas;
	protected JPanel jPanelParametrosReportesAccionesBuscarProductoFacturas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BuscarProductoFacturas;
	protected JPanel jPanelParametrosAuxiliar2BuscarProductoFacturas;
	protected JPanel jPanelParametrosAuxiliar3BuscarProductoFacturas;
	protected JPanel jPanelParametrosAuxiliar4BuscarProductoFacturas;
	//protected JPanel jPanelParametrosAuxiliar5BuscarProductoFacturas;
	
	
	
	//protected JPanel jPanelReporteDinamicoBuscarProductoFacturas;
	//protected JPanel jPanelImportacionBuscarProductoFacturas;
	
	
	public JTable jTableDatosBuscarProductoFacturas;
	
	
	
	//public JTable jTableDatosBuscarProductoFacturasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBuscarProductoFacturas;
	protected JButton jButtonDuplicarBuscarProductoFacturas;
	protected JButton jButtonCopiarBuscarProductoFacturas;
	protected JButton jButtonVerFormBuscarProductoFacturas;
	protected JButton jButtonNuevoRelacionesBuscarProductoFacturas;
	protected JButton jButtonModificarBuscarProductoFacturas;
	
    protected JButton jButtonGuardarCambiosTablaBuscarProductoFacturas;
	protected JButton jButtonCerrarBuscarProductoFacturas;
	
	
	protected JButton jButtonRecargarInformacionBuscarProductoFacturas;
	protected JButton jButtonProcesarInformacionBuscarProductoFacturas;
	
	
	protected JButton jButtonAnterioresBuscarProductoFacturas;
	protected JButton jButtonSiguientesBuscarProductoFacturas;
	protected JButton jButtonNuevoGuardarCambiosBuscarProductoFacturas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBuscarProductoFacturas;
	//protected JButton jButtonCerrarReporteDinamicoBuscarProductoFacturas;
	//protected JButton jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas;	
	
	
	
	//protected JButton jButtonAbrirImportacionBuscarProductoFacturas;
	//protected JButton jButtonGenerarImportacionBuscarProductoFacturas;
	//protected JButton jButtonCerrarImportacionBuscarProductoFacturas;
	//protected JFileChooser jFileChooserImportacionBuscarProductoFacturas;
	//protected File fileImportacionBuscarProductoFacturas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBuscarProductoFacturas;
	protected JButton jButtonDuplicarToolBarBuscarProductoFacturas;
	protected JButton jButtonNuevoRelacionesToolBarBuscarProductoFacturas;
	
	
	public JButton jButtonGuardarCambiosToolBarBuscarProductoFacturas;
	protected JButton jButtonCopiarToolBarBuscarProductoFacturas;
	protected JButton jButtonVerFormToolBarBuscarProductoFacturas;
	public JButton jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarBuscarProductoFacturas;
	protected JButton jButtonCerrarToolBarBuscarProductoFacturas;
	
	protected JButton jButtonRecargarInformacionToolBarBuscarProductoFacturas;
	protected JButton jButtonProcesarInformacionToolBarBuscarProductoFacturas;
	protected JButton jButtonAnterioresToolBarBuscarProductoFacturas;
	protected JButton jButtonSiguientesToolBarBuscarProductoFacturas;
	protected JButton jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas;
	protected JButton jButtonAbrirOrderByToolBarBuscarProductoFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBuscarProductoFacturas;
	protected JMenuItem jMenuItemDuplicarBuscarProductoFacturas;
	protected JMenuItem jMenuItemNuevoRelacionesBuscarProductoFacturas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBuscarProductoFacturas;
	protected JMenuItem jMenuItemCopiarBuscarProductoFacturas;
	protected JMenuItem jMenuItemVerFormBuscarProductoFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaBuscarProductoFacturas;
	protected JMenuItem jMenuItemCerrarBuscarProductoFacturas;
	protected JMenuItem jMenuItemDetalleCerrarBuscarProductoFacturas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBuscarProductoFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarBuscarProductoFacturas;
	
	protected JMenuItem jMenuItemRecargarInformacionBuscarProductoFacturas;
	protected JMenuItem jMenuItemProcesarInformacionBuscarProductoFacturas;
	protected JMenuItem jMenuItemAnterioresBuscarProductoFacturas;
	protected JMenuItem jMenuItemSiguientesBuscarProductoFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBuscarProductoFacturas;
	protected JMenuItem jMenuItemAbrirOrderByBuscarProductoFacturas;
	protected JMenuItem jMenuItemMostrarOcultarBuscarProductoFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBuscarProductoFacturas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBuscarProductoFacturas;
	protected JCheckBox jCheckBoxSeleccionadosBuscarProductoFacturas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBuscarProductoFacturas;
	protected JCheckBox jCheckBoxConGraficoReporteBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBuscarProductoFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBuscarProductoFacturas;
	protected JTextField jTextFieldValorCampoGeneralBuscarProductoFacturas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBuscarProductoFacturas;
	//public JList<Reporte> jListColumnasSelectReporteBuscarProductoFacturas;
	//public JScrollPane jScrollColumnasSelectReporteBuscarProductoFacturas;
	
	//public JLabel jLabelRelacionesSelectReporteBuscarProductoFacturas;
	//public JList<Reporte> jListRelacionesSelectReporteBuscarProductoFacturas;
	//public JScrollPane jScrollRelacionesSelectReporteBuscarProductoFacturas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBuscarProductoFacturas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBuscarProductoFacturas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas;
	//public JLabel jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas;
	
		
	//public JLabel jLabelArchivoImportacionBuscarProductoFacturas;	
	//public JLabel jLabelPathArchivoImportacionBuscarProductoFacturas;
	//protected JTextField jTextFieldPathArchivoImportacionBuscarProductoFacturas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBuscarProductoFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas;
	
	//public JLabel jLabelColumnaCategoriaValorBuscarProductoFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBuscarProductoFacturas;
	
	//public JLabel jLabelColumnasValoresGraficoBuscarProductoFacturas;
	//public JList<Reporte> jListColumnasValoresGraficoBuscarProductoFacturas;
	//public JScrollPane jScrollColumnasValoresGraficoBuscarProductoFacturas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBuscarProductoFacturas;
	public JPanel jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	
	public JPanel jPanelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JLabel jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JLabel jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JLabel jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JTextField jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JLabel jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JLabel jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas;
	public JButton jButtonfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturasBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BuscarProductoFacturasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBuscarProductoFacturas)	{
		this.jButtonRecargarInformacionBuscarProductoFacturas = jButtonRecargarInformacionBuscarProductoFacturas;
	}
	
	public JButton getjButtonProcesarInformacionBuscarProductoFacturas() {
		return this.jButtonProcesarInformacionBuscarProductoFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBuscarProductoFacturas)	{
		this.jButtonProcesarInformacionBuscarProductoFacturas = jButtonProcesarInformacionBuscarProductoFacturas;
	}
	
	
	public JButton getjButtonRecargarInformacionBuscarProductoFacturas() {
		return this.jButtonRecargarInformacionBuscarProductoFacturas;
	}
	
	
	public List<BuscarProductoFacturas> getbuscarproductofacturass() {
		return this.buscarproductofacturass;
	}

	public void setbuscarproductofacturass(List<BuscarProductoFacturas> buscarproductofacturass) {
		this.buscarproductofacturass = buscarproductofacturass;
	}
	
	public List<BuscarProductoFacturas> getbuscarproductofacturassAux() {
		return this.buscarproductofacturassAux;
	}

	public void setbuscarproductofacturassAux(List<BuscarProductoFacturas> buscarproductofacturassAux) {
		this.buscarproductofacturassAux = buscarproductofacturassAux;
	}
	
	public List<BuscarProductoFacturas> getbuscarproductofacturassEliminados() {
		return this.buscarproductofacturassEliminados;
	}

	public void setBuscarProductoFacturassEliminados(List<BuscarProductoFacturas> buscarproductofacturassEliminados) {
		this.buscarproductofacturassEliminados = buscarproductofacturassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBuscarProductoFacturas() {
		return jComboBoxTiposSeleccionarBuscarProductoFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBuscarProductoFacturas(
			JComboBox jComboBoxTiposSeleccionarBuscarProductoFacturas) {
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas = jComboBoxTiposSeleccionarBuscarProductoFacturas;
	}
	
	public void setBorderResaltarTiposSeleccionarBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBuscarProductoFacturas() {
		return jTextFieldValorCampoGeneralBuscarProductoFacturas;
	}

	public void setjTextFieldValorCampoGeneralBuscarProductoFacturas(
			JTextField jTextFieldValorCampoGeneralBuscarProductoFacturas) {
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas = jTextFieldValorCampoGeneralBuscarProductoFacturas;
	}

	public void setBorderResaltarValorCampoGeneralBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBuscarProductoFacturas() {
		return this.jCheckBoxSeleccionarTodosBuscarProductoFacturas;
	}

	public void setjCheckBoxSeleccionarTodosBuscarProductoFacturas(
			JCheckBox jCheckBoxSeleccionarTodosBuscarProductoFacturas) {
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas = jCheckBoxSeleccionarTodosBuscarProductoFacturas;
	}

	public void setBorderResaltarSeleccionarTodosBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBuscarProductoFacturas() {
		return this.jCheckBoxSeleccionadosBuscarProductoFacturas;
	}

	public void setjCheckBoxSeleccionadosBuscarProductoFacturas(
			JCheckBox jCheckBoxSeleccionadosBuscarProductoFacturas) {
		this.jCheckBoxSeleccionadosBuscarProductoFacturas = jCheckBoxSeleccionadosBuscarProductoFacturas;
	}
	
	public void setBorderResaltarSeleccionadosBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBuscarProductoFacturas() {
		return this.jComboBoxTiposArchivosReportesBuscarProductoFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBuscarProductoFacturas(
			JComboBox jComboBoxTiposArchivosReportesBuscarProductoFacturas) {
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas = jComboBoxTiposArchivosReportesBuscarProductoFacturas;
	}

	public void setBorderResaltarTiposArchivosReportesBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBuscarProductoFacturas() {
		return this.jComboBoxTiposReportesBuscarProductoFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBuscarProductoFacturas(
			JComboBox jComboBoxTiposReportesBuscarProductoFacturas) {
		this.jComboBoxTiposReportesBuscarProductoFacturas = jComboBoxTiposReportesBuscarProductoFacturas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBuscarProductoFacturas() {
	//	return jComboBoxTiposReportesDinamicoBuscarProductoFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBuscarProductoFacturas(
	//		JComboBox jComboBoxTiposReportesDinamicoBuscarProductoFacturas) {
	//	this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas = jComboBoxTiposReportesDinamicoBuscarProductoFacturas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas() {
	//	return jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas = jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas;
	//}
	
	public void setBorderResaltarTiposReportesBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBuscarProductoFacturas() {
		return this.jComboBoxTiposGraficosReportesBuscarProductoFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBuscarProductoFacturas(
			JComboBox jComboBoxTiposGraficosReportesBuscarProductoFacturas) {
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas = jComboBoxTiposGraficosReportesBuscarProductoFacturas;
	}
	
	public void setBorderResaltarTiposGraficosReportesBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBuscarProductoFacturas() {
		return this.jComboBoxTiposPaginacionBuscarProductoFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBuscarProductoFacturas(
			JComboBox jComboBoxTiposPaginacionBuscarProductoFacturas) {
		this.jComboBoxTiposPaginacionBuscarProductoFacturas = jComboBoxTiposPaginacionBuscarProductoFacturas;
	}
	
	public void setBorderResaltarTiposPaginacionBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBuscarProductoFacturas() {
		return this.jComboBoxTiposRelacionesBuscarProductoFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBuscarProductoFacturas() {
		return this.jComboBoxTiposAccionesBuscarProductoFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBuscarProductoFacturas(
			JComboBox jComboBoxTiposRelacionesBuscarProductoFacturas) {
		this.jComboBoxTiposRelacionesBuscarProductoFacturas = jComboBoxTiposRelacionesBuscarProductoFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBuscarProductoFacturas(
			JComboBox jComboBoxTiposAccionesBuscarProductoFacturas) {
		this.jComboBoxTiposAccionesBuscarProductoFacturas = jComboBoxTiposAccionesBuscarProductoFacturas;
	}
	
	public void setBorderResaltarTiposRelacionesBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBuscarProductoFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBuscarProductoFacturas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBuscarProductoFacturas() {
	//	return jCheckBoxConGraficoDinamicoBuscarProductoFacturas;
	//}

	//public void setjCheckBoxConGraficoDinamicoBuscarProductoFacturas(
	//		JCheckBox jCheckBoxConGraficoDinamicoBuscarProductoFacturas) {
	//	this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas = jCheckBoxConGraficoDinamicoBuscarProductoFacturas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBuscarProductoFacturas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBuscarProductoFacturas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas .setBorder(borderResaltar);		
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
		this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
		
		this.buscarproductofacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.buscarproductofacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.buscarproductofacturasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BuscarProductoFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Buscar Producto Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
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
		
		BuscarProductoFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBuscarProductoFacturas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"nuevo","nuevo","Nuevo"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"duplicar","duplicar","Duplicar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"copiar","copiar","Copiar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"ver_form","ver_form","Ver"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"recargar","recargar","Buscar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,
							"cerrar","cerrar","Salir"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBuscarProductoFacturas;
			
				this.jButtonProcesarInformacionToolBarBuscarProductoFacturas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBuscarProductoFacturas;
				
		//protected JButton jButtonModificarToolBarBuscarProductoFacturas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBuscarProductoFacturas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBuscarProductoFacturas=new JMenuMe("General");
		this.jmenuArchivoBuscarProductoFacturas=new JMenuMe("Archivo");
		this.jmenuAccionesBuscarProductoFacturas=new JMenuMe("Acciones");
		this.jmenuDatosBuscarProductoFacturas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBuscarProductoFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBuscarProductoFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBuscarProductoFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBuscarProductoFacturas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBuscarProductoFacturas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBuscarProductoFacturas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBuscarProductoFacturas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBuscarProductoFacturas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBuscarProductoFacturas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBuscarProductoFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBuscarProductoFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBuscarProductoFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBuscarProductoFacturas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBuscarProductoFacturas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBuscarProductoFacturas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBuscarProductoFacturas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBuscarProductoFacturas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBuscarProductoFacturas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBuscarProductoFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBuscarProductoFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBuscarProductoFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBuscarProductoFacturas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBuscarProductoFacturas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBuscarProductoFacturas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBuscarProductoFacturas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBuscarProductoFacturas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBuscarProductoFacturas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBuscarProductoFacturas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBuscarProductoFacturas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBuscarProductoFacturas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBuscarProductoFacturas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBuscarProductoFacturas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBuscarProductoFacturas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBuscarProductoFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBuscarProductoFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBuscarProductoFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBuscarProductoFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBuscarProductoFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBuscarProductoFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBuscarProductoFacturas.add(this.jMenuItemCerrarBuscarProductoFacturas);
			
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemNuevoBuscarProductoFacturas);
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas);
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemNuevoRelacionesBuscarProductoFacturas);
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas);		
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemDuplicarBuscarProductoFacturas);		
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemCopiarBuscarProductoFacturas);		
			this.jmenuAccionesBuscarProductoFacturas.add(this.jMenuItemVerFormBuscarProductoFacturas);		
			
			this.jmenuDatosBuscarProductoFacturas.add(this.jMenuItemRecargarInformacionBuscarProductoFacturas);				
			this.jmenuDatosBuscarProductoFacturas.add(this.jMenuItemAnterioresBuscarProductoFacturas);				
			this.jmenuDatosBuscarProductoFacturas.add(this.jMenuItemSiguientesBuscarProductoFacturas);				
			this.jmenuDatosBuscarProductoFacturas.add(this.jMenuItemAbrirOrderByBuscarProductoFacturas);				
			this.jmenuDatosBuscarProductoFacturas.add(this.jMenuItemMostrarOcultarBuscarProductoFacturas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBuscarProductoFacturas.add(this.jMenuItemGuardarCambiosBuscarProductoFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBuscarProductoFacturas.add(this.jmenuArchivoBuscarProductoFacturas);		
			this.jmenuBarBuscarProductoFacturas.add(this.jmenuAccionesBuscarProductoFacturas);		
			this.jmenuBarBuscarProductoFacturas.add(this.jmenuDatosBuscarProductoFacturas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBuscarProductoFacturas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBuscarProductoFacturas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Buscar Por Producto Por Cliente Por Numero Pre Impreso Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JButtonMe();
		this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Buscar");
		this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Buscar Por Producto Por Cliente Por Numero Pre Impreso Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas,"buscar_button","Buscar Por Producto Por Cliente Por Numero Pre Impreso Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas = new JLabelMe();
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Producto :");
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Producto");
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas = new JLabelMe();
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Cliente :");
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Cliente");
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas = new JLabelMe();
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Numero Pre Impreso :");
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Numero Pre Impreso");
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JTextFieldMe();
		jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasBuscarProductoFacturas=new JTabbedPane();


		this.jTabbedPaneBusquedasBuscarProductoFacturas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasBuscarProductoFacturas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasBuscarProductoFacturas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBuscarProductoFacturas = new BuscarProductoFacturasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Buscar Producto Facturas DATOS");
			this.jInternalFrameDetalleFormBuscarProductoFacturas = new BuscarProductoFacturasDetalleFormJInternalFrame(jDesktopPane,this.buscarproductofacturasSessionBean.getConGuardarRelaciones(),this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBuscarProductoFacturas = null;//new BuscarProductoFacturasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBuscarProductoFacturas= new GridBagLayout();
		
		
		this.jTableDatosBuscarProductoFacturas = new JTableMe();      
		
		String sToolTipBuscarProductoFacturas="";
		sToolTipBuscarProductoFacturas=BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBuscarProductoFacturas+="(Facturacion.BuscarProductoFacturas)";
		}
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipBuscarProductoFacturas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBuscarProductoFacturas.setToolTipText(sToolTipBuscarProductoFacturas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBuscarProductoFacturas);
		this.jTableDatosBuscarProductoFacturas.setAutoCreateRowSorter(true);
		this.jTableDatosBuscarProductoFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBuscarProductoFacturas.setRowSelectionAllowed(true);
		this.jTableDatosBuscarProductoFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBuscarProductoFacturas = new JButtonMe();
		this.jButtonDuplicarBuscarProductoFacturas = new JButtonMe();
		this.jButtonCopiarBuscarProductoFacturas = new JButtonMe();
		this.jButtonVerFormBuscarProductoFacturas = new JButtonMe();
		this.jButtonNuevoRelacionesBuscarProductoFacturas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas = new JButtonMe();
		this.jButtonCerrarBuscarProductoFacturas = new JButtonMe();
		
		this.jScrollPanelDatosBuscarProductoFacturas = new JScrollPane();   
        this.jScrollPanelDatosGeneralBuscarProductoFacturas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Buscar Producto Facturas";
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBuscarProductoFacturas.setToolTipText("Acciones");
        this.jPanelAccionesBuscarProductoFacturas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBuscarProductoFacturas=new ReporteDinamicoJInternalFrame(BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBuscarProductoFacturas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBuscarProductoFacturas=new ImportacionJInternalFrame(BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBuscarProductoFacturas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBuscarProductoFacturas = new JButtonMe();
		
		this.jButtonAbrirOrderByBuscarProductoFacturas.setText("Orden");
		this.jButtonAbrirOrderByBuscarProductoFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBuscarProductoFacturas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBuscarProductoFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBuscarProductoFacturas,false,this);
			
			//this.cargarOrderByBuscarProductoFacturas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBuscarProductoFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBuscarProductoFacturas,true,this);
			
			//this.cargarOrderByBuscarProductoFacturas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBuscarProductoFacturas.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosBuscarProductoFacturas.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosBuscarProductoFacturas.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosBuscarProductoFacturas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBuscarProductoFacturas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBuscarProductoFacturas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBuscarProductoFacturas.setText("Nuevo");
		this.jButtonDuplicarBuscarProductoFacturas.setText("Duplicar");
		this.jButtonCopiarBuscarProductoFacturas.setText("Copiar");
		this.jButtonVerFormBuscarProductoFacturas.setText("Ver");
		this.jButtonNuevoRelacionesBuscarProductoFacturas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setText("Guardar");
		this.jButtonCerrarBuscarProductoFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBuscarProductoFacturas,"nuevo_button","Nuevo",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBuscarProductoFacturas,"duplicar_button","Duplicar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBuscarProductoFacturas,"copiar_button","Copiar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBuscarProductoFacturas,"ver_form","Ver",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBuscarProductoFacturas,"nuevorelaciones_button","Nuevo Rel",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBuscarProductoFacturas,"guardarcambiostabla_button","Guardar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBuscarProductoFacturas,"cerrar_button","Salir",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBuscarProductoFacturas.setToolTipText("Nuevo"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBuscarProductoFacturas.setToolTipText("Duplicar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBuscarProductoFacturas.setToolTipText("Copiar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBuscarProductoFacturas.setToolTipText("Ver"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBuscarProductoFacturas.setToolTipText("Nuevo Rel"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setToolTipText("Guardar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBuscarProductoFacturas.setToolTipText("Salir"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBuscarProductoFacturas";
		inputMap = this.jButtonNuevoBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBuscarProductoFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBuscarProductoFacturas"));
		
		//DUPLICAR
		sMapKey = "DuplicarBuscarProductoFacturas";
		inputMap = this.jButtonDuplicarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBuscarProductoFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBuscarProductoFacturas"));
		
		//COPIAR
		sMapKey = "CopiarBuscarProductoFacturas";
		inputMap = this.jButtonCopiarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBuscarProductoFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBuscarProductoFacturas"));
		
		//VEr FORM
		sMapKey = "VerFormBuscarProductoFacturas";
		inputMap = this.jButtonVerFormBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBuscarProductoFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBuscarProductoFacturas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBuscarProductoFacturas";
		inputMap = this.jButtonNuevoRelacionesBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBuscarProductoFacturas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBuscarProductoFacturas";
		inputMap = this.jButtonModificarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBuscarProductoFacturas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBuscarProductoFacturas";
		inputMap = this.jButtonCerrarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBuscarProductoFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBuscarProductoFacturas";
		inputMap = this.jButtonGuardarCambiosTablaBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBuscarProductoFacturas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBuscarProductoFacturas.setName("jPanelParametrosReportesBuscarProductoFacturas"); 
		
		this.jPanelParametrosReportesAccionesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBuscarProductoFacturas.setName("jPanelParametrosReportesAccionesBuscarProductoFacturas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBuscarProductoFacturas = new JButtonMe();
		this.jButtonRecargarInformacionBuscarProductoFacturas.setText("Buscar");
		this.jButtonRecargarInformacionBuscarProductoFacturas.setToolTipText("Buscar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBuscarProductoFacturas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionBuscarProductoFacturas.setVisible(false);
		
		
		this.jButtonProcesarInformacionBuscarProductoFacturas = new JButtonMe();
		this.jButtonProcesarInformacionBuscarProductoFacturas.setText("Procesar");
		this.jButtonProcesarInformacionBuscarProductoFacturas.setToolTipText("Procesar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBuscarProductoFacturas.setVisible(false);
			
		this.jButtonProcesarInformacionBuscarProductoFacturas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBuscarProductoFacturas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBuscarProductoFacturas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setText("TIPO");       
		this.jComboBoxTiposReportesBuscarProductoFacturas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBuscarProductoFacturas.setText("Paginacion");
		this.jComboBoxTiposPaginacionBuscarProductoFacturas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBuscarProductoFacturas.setText("Accion");
		this.jComboBoxTiposRelacionesBuscarProductoFacturas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBuscarProductoFacturas.setText("Accion");
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setText("Accion");
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBuscarProductoFacturas = new JLabelMe();
		
		this.jLabelAccionesBuscarProductoFacturas.setText("Acciones");		
		this.jLabelAccionesBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBuscarProductoFacturas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBuscarProductoFacturas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBuscarProductoFacturas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setText("Graf.");
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBuscarProductoFacturas = new JButtonMe();
		//this.jButtonAnterioresBuscarProductoFacturas.setText("<<");
        this.jButtonAnterioresBuscarProductoFacturas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBuscarProductoFacturas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBuscarProductoFacturas = new JButtonMe();
		//this.jButtonSiguientesBuscarProductoFacturas.setText(">>");
        this.jButtonSiguientesBuscarProductoFacturas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBuscarProductoFacturas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBuscarProductoFacturas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.setText("Nue");
        this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBuscarProductoFacturas,"nuevoguardarcambios_button","Nue",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBuscarProductoFacturas";
		inputMap = this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBuscarProductoFacturas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBuscarProductoFacturas";
		inputMap = this.jButtonRecargarInformacionBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBuscarProductoFacturas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBuscarProductoFacturas";
		inputMap = this.jButtonSiguientesBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBuscarProductoFacturas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBuscarProductoFacturas";
		inputMap = this.jButtonAnterioresBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBuscarProductoFacturas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBuscarProductoFacturas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBuscarProductoFacturas.setMinimumSize(new Dimension(this.getWidth(),BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBuscarProductoFacturas.setMaximumSize(new Dimension(this.getWidth(),BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBuscarProductoFacturas.setPreferredSize(new Dimension(this.getWidth(),BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BuscarProductoFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBuscarProductoFacturas = new GridBagLayout();

			this.jPanelPaginacionBuscarProductoFacturas.setLayout(gridaBagLayoutPaginacionBuscarProductoFacturas);						
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonAnterioresBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					
						
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
			
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonNuevoGuardarCambiosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
						
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonSiguientesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonNuevoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
						
			
			
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
				this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
				this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonGuardarCambiosTablaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			}
			
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonDuplicarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonCopiarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonVerFormBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 1;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBuscarProductoFacturas.add(this.jButtonCerrarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		
		this.jButtonRecargarInformacionBuscarProductoFacturas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBuscarProductoFacturas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBuscarProductoFacturas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBuscarProductoFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBuscarProductoFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBuscarProductoFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBuscarProductoFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBuscarProductoFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBuscarProductoFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBuscarProductoFacturas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBuscarProductoFacturas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBuscarProductoFacturas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBuscarProductoFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBuscarProductoFacturas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BuscarProductoFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BuscarProductoFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BuscarProductoFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BuscarProductoFacturas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBuscarProductoFacturas.setLayout(gridaBagParametrosReportesBuscarProductoFacturas);
			this.jPanelParametrosReportesAccionesBuscarProductoFacturas.setLayout(gridaBagParametrosReportesAccionesBuscarProductoFacturas);
			
			
			this.jPanelParametrosAuxiliar1BuscarProductoFacturas.setLayout(gridaBagParametrosAuxiliar1BuscarProductoFacturas);
			this.jPanelParametrosAuxiliar2BuscarProductoFacturas.setLayout(gridaBagParametrosAuxiliar2BuscarProductoFacturas);
			this.jPanelParametrosAuxiliar3BuscarProductoFacturas.setLayout(gridaBagParametrosAuxiliar3BuscarProductoFacturas);
			this.jPanelParametrosAuxiliar4BuscarProductoFacturas.setLayout(gridaBagParametrosAuxiliar4BuscarProductoFacturas);
			//this.jPanelParametrosAuxiliar5BuscarProductoFacturas.setLayout(gridaBagParametrosAuxiliar2BuscarProductoFacturas);			
			
			
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jButtonRecargarInformacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BuscarProductoFacturas.add(this.jComboBoxTiposPaginacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BuscarProductoFacturas.add(this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BuscarProductoFacturas.add(this.jComboBoxTiposArchivosReportesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jPanelParametrosAuxiliar1BuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BuscarProductoFacturas.add(this.jComboBoxTiposReportesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);																		
			
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BuscarProductoFacturas.add(this.jComboBoxTiposGraficosReportesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jPanelParametrosAuxiliar4BuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jComboBoxTiposReportesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jCheckBoxGenerarReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jPanelParametrosAuxiliar2BuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jLabelAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
				this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jButtonAbrirOrderByBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jComboBoxTiposSeleccionarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
			
			
			/*
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jCheckBoxSeleccionarTodosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jCheckBoxConGraficoReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BuscarProductoFacturas.add(this.jCheckBoxSeleccionarTodosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);															
				
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BuscarProductoFacturas.add(this.jCheckBoxSeleccionadosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);															
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BuscarProductoFacturas.add(this.jCheckBoxConGraficoReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jPanelParametrosAuxiliar3BuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBuscarProductoFacturas.add(this.jComboBoxTiposAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBuscarProductoFacturas = new GridBagLayout();

			this.jScrollPanelDatosBuscarProductoFacturas.setLayout(gridaBagLayoutDatosBuscarProductoFacturas);
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
			
			this.jScrollPanelDatosBuscarProductoFacturas.add(this.jTableDatosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBuscarProductoFacturas.setViewportView(this.jTableDatosBuscarProductoFacturas);
		this.jTableDatosBuscarProductoFacturas.setFillsViewportHeight(true);
		this.jTableDatosBuscarProductoFacturas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBuscarProductoFacturas= new GridBagLayout();
		this.jPanelAccionesBuscarProductoFacturas.setLayout(gridaBagLayoutAccionesBuscarProductoFacturas);
		
		
		/*	
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
			
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonNuevoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas= new GridBagLayout();
		gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.setLayout(gridaBagLayoutBusquedaBuscarProductoFacturasBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jLabelid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		gridBagConstraintsBuscarProductoFacturas.gridx = 1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);


		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 1;
		gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jLabelid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 1;
		gridBagConstraintsBuscarProductoFacturas.gridx = 1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);


		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 2;
		gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jLabelnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 2;
		gridBagConstraintsBuscarProductoFacturas.gridx = 1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);


		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 3;
		gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jLabelfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 3;
		gridBagConstraintsBuscarProductoFacturas.gridx = 1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);


		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 4;
		gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jLabelfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 4;
		gridBagConstraintsBuscarProductoFacturas.gridx = 1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBuscarProductoFacturas.gridy = 5;
		gridBagConstraintsBuscarProductoFacturas.gridx =1;
		jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas.add(jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);

		jTabbedPaneBusquedasBuscarProductoFacturas.addTab("1.-Por Producto Por Cliente Por Numero Pre Impreso Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);
		jTabbedPaneBusquedasBuscarProductoFacturas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBuscarProductoFacturas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();						
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;		
			//this.gridBagConstraintsBuscarProductoFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBuscarProductoFacturas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;		
		//this.gridBagConstraintsBuscarProductoFacturas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBuscarProductoFacturas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;		
			this.gridBagConstraintsBuscarProductoFacturas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBuscarProductoFacturas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);								
		
		
		/*
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		*/		
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBuscarProductoFacturas.gridx =0;
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBuscarProductoFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
				
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBuscarProductoFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBuscarProductoFacturas = new GridBagLayout();
			this.jPanelBusquedasParametrosBuscarProductoFacturas.setLayout(gridaBagLayoutBusquedasParametrosBuscarProductoFacturas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBuscarProductoFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBuscarProductoFacturas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBuscarProductoFacturas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBuscarProductoFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBuscarProductoFacturas.setName("jPanelReporteDinamicoBuscarProductoFacturas"); 
		
		this.jPanelReporteDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBuscarProductoFacturas.setLayout(gridaBagLayoutReporteDinamicoBuscarProductoFacturas);
		
		
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBuscarProductoFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setResizable(true);
	    this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setClosable(true);
	    this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBuscarProductoFacturas = new JLabelMe();

		this.jLabelColumnasSelectReporteBuscarProductoFacturas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelColumnasSelectReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBuscarProductoFacturas = new JList<Reporte>();
		this.jListColumnasSelectReporteBuscarProductoFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBuscarProductoFacturas=new JScrollPane(this.jListColumnasSelectReporteBuscarProductoFacturas);
			
			this.jScrollColumnasSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jListColumnasSelectReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jScrollColumnasSelectReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBuscarProductoFacturas = new JLabelMe();

		this.jLabelRelacionesSelectReporteBuscarProductoFacturas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBuscarProductoFacturas = new JList<Reporte>();
		this.jListRelacionesSelectReporteBuscarProductoFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBuscarProductoFacturas=new JScrollPane(this.jListRelacionesSelectReporteBuscarProductoFacturas);
			
			this.jScrollRelacionesSelectReporteBuscarProductoFacturas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBuscarProductoFacturas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBuscarProductoFacturas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas = new JComboBoxMe();
		this.jListColumnasValoresGraficoBuscarProductoFacturas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBuscarProductoFacturas = new JLabelMe();

		this.jLabelConGraficoDinamicoBuscarProductoFacturas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelConGraficoDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jCheckBoxConGraficoDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelColumnaCategoriaGraficoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBuscarProductoFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaValorBuscarProductoFacturas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelColumnaCategoriaValorBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jComboBoxColumnaCategoriaValorBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBuscarProductoFacturas = new JLabelMe();

		this.jLabelColumnasValoresGraficoBuscarProductoFacturas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelColumnasValoresGraficoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBuscarProductoFacturas = new JList<Reporte>();
		this.jListColumnasValoresGraficoBuscarProductoFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBuscarProductoFacturas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBuscarProductoFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBuscarProductoFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBuscarProductoFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBuscarProductoFacturas=new JScrollPane(this.jListColumnasValoresGraficoBuscarProductoFacturas);
			
			this.jScrollColumnasValoresGraficoBuscarProductoFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBuscarProductoFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBuscarProductoFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jListColumnasSelectReporteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jScrollColumnasValoresGraficoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelTiposGraficosReportesDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBuscarProductoFacturas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jComboBoxTiposGraficosReportesDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelGenerarExcelReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas.setToolTipText("Generar EXCEL"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jComboBoxTiposReportesDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jLabelTiposArchivoReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jComboBoxTiposArchivosReportesDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBuscarProductoFacturas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBuscarProductoFacturas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBuscarProductoFacturas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBuscarProductoFacturas.setToolTipText("Generar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jButtonGenerarReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBuscarProductoFacturas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBuscarProductoFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBuscarProductoFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBuscarProductoFacturas.setToolTipText("Cancelar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBuscarProductoFacturas.add(this.jButtonCerrarReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBuscarProductoFacturas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas= new JScrollPane(jPanelReporteDinamicoBuscarProductoFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBuscarProductoFacturas);
		this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getContentPane().add(this.jScrollPanelReporteDinamicoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBuscarProductoFacturas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBuscarProductoFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBuscarProductoFacturas.setName("jPanelImportacionBuscarProductoFacturas"); 
		
		this.jPanelImportacionBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBuscarProductoFacturas.setLayout(gridaBagLayoutImportacionBuscarProductoFacturas);
		
		
		this.jInternalFrameImportacionBuscarProductoFacturas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBuscarProductoFacturas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBuscarProductoFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBuscarProductoFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBuscarProductoFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBuscarProductoFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBuscarProductoFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBuscarProductoFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBuscarProductoFacturas.setResizable(true);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setClosable(true);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBuscarProductoFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBuscarProductoFacturas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBuscarProductoFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBuscarProductoFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBuscarProductoFacturas.setResizable(true);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setClosable(true);
	    this.jInternalFrameImportacionBuscarProductoFacturas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBuscarProductoFacturas = new JLabelMe();

		this.jLabelArchivoImportacionBuscarProductoFacturas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBuscarProductoFacturas.add(this.jLabelArchivoImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBuscarProductoFacturas = new JFileChooser();		
		this.jFileChooserImportacionBuscarProductoFacturas.setToolTipText("ESCOGER ARCHIVO"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBuscarProductoFacturas = new JButtonMe();
		this.jButtonAbrirImportacionBuscarProductoFacturas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBuscarProductoFacturas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBuscarProductoFacturas.setToolTipText("Generar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBuscarProductoFacturas.add(this.jButtonAbrirImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBuscarProductoFacturas = new JLabelMe();

		this.jLabelPathArchivoImportacionBuscarProductoFacturas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBuscarProductoFacturas.add(this.jLabelPathArchivoImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBuscarProductoFacturas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBuscarProductoFacturas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBuscarProductoFacturas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBuscarProductoFacturas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBuscarProductoFacturas.add(this.jTextFieldPathArchivoImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBuscarProductoFacturas = new JButtonMe();
		this.jButtonGenerarImportacionBuscarProductoFacturas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBuscarProductoFacturas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBuscarProductoFacturas.setToolTipText("Generar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBuscarProductoFacturas.add(this.jButtonGenerarImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBuscarProductoFacturas = new JButtonMe();
		this.jButtonCerrarImportacionBuscarProductoFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBuscarProductoFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBuscarProductoFacturas.setToolTipText("Cancelar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBuscarProductoFacturas.add(this.jButtonCerrarImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBuscarProductoFacturas = new GridBagLayout();
		
		this.jScrollPanelImportacionBuscarProductoFacturas= new JScrollPane(jPanelImportacionBuscarProductoFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iPosYImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXImportacion;
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBuscarProductoFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBuscarProductoFacturas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBuscarProductoFacturas);
		this.jInternalFrameImportacionBuscarProductoFacturas.getContentPane().add(this.jScrollPanelImportacionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBuscarProductoFacturas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBuscarProductoFacturas = new JButtonMe();
			this.jButtonAbrirOrderByBuscarProductoFacturas.setText("Orden");
			this.jButtonAbrirOrderByBuscarProductoFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBuscarProductoFacturas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBuscarProductoFacturas";
			inputMap = this.jButtonAbrirOrderByBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBuscarProductoFacturas"));
		
		
			GridBagLayout gridaBagLayoutOrderByBuscarProductoFacturas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBuscarProductoFacturas.setName("jPanelOrderByBuscarProductoFacturas"); 
			
			this.jPanelOrderByBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBuscarProductoFacturas.setLayout(gridaBagLayoutOrderByBuscarProductoFacturas);
			
			
			this.jTableDatosBuscarProductoFacturasOrderBy = new JTableMe();        
			this.jTableDatosBuscarProductoFacturasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBuscarProductoFacturasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBuscarProductoFacturasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBuscarProductoFacturasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBuscarProductoFacturasOrderBy.setViewportView(this.jTableDatosBuscarProductoFacturasOrderBy);
			this.jTableDatosBuscarProductoFacturasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBuscarProductoFacturasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBuscarProductoFacturas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBuscarProductoFacturas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBuscarProductoFacturas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBuscarProductoFacturas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBuscarProductoFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBuscarProductoFacturas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBuscarProductoFacturas.setTitle("Orden");
			this.jInternalFrameOrderByBuscarProductoFacturas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBuscarProductoFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBuscarProductoFacturas.setResizable(true);
			this.jInternalFrameOrderByBuscarProductoFacturas.setClosable(true);
			this.jInternalFrameOrderByBuscarProductoFacturas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBuscarProductoFacturas.ipady =150;
				
			this.jPanelOrderByBuscarProductoFacturas.add(jScrollPanelDatosBuscarProductoFacturasOrderBy, this.gridBagConstraintsBuscarProductoFacturas);//this.jTableDatosBuscarProductoFacturasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBuscarProductoFacturas = new JButtonMe();
			this.jButtonCerrarOrderByBuscarProductoFacturas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBuscarProductoFacturas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBuscarProductoFacturas.setToolTipText("Cancelar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBuscarProductoFacturas.add(this.jButtonCerrarOrderByBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBuscarProductoFacturas = new GridBagLayout();
			
			this.jScrollPanelOrderByBuscarProductoFacturas= new JScrollPane(jPanelOrderByBuscarProductoFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iPosYOrderBy;
			this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBuscarProductoFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBuscarProductoFacturas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBuscarProductoFacturas);
			
			this.jInternalFrameOrderByBuscarProductoFacturas.getContentPane().add(this.jScrollPanelOrderByBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
		
		} else {
			this.jButtonAbrirOrderByBuscarProductoFacturas = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.buscarproductofacturasSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosBuscarProductoFacturas.getRowHeight();//BuscarProductoFacturasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.isSelected()) {
					iHeightTable=BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBuscarProductoFacturas.isSelected()) {
					iHeightTable=BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BuscarProductoFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBuscarProductoFacturas!=null && this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy()!=null) {
			//if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBuscarProductoFacturas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBuscarProductoFacturas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBuscarProductoFacturas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=buscarproductofacturasLogic.getBuscarProductoFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=buscarproductofacturass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BuscarProductoFacturas> TraerBuscarProductoFacturasBeans(List<BuscarProductoFacturas> buscarproductofacturass,ArrayList<Classe> classes)throws Exception {
		try {
			for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturass) {
					
				if(!(BuscarProductoFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BuscarProductoFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					buscarproductofacturas.setsDetalleGeneralEntityReporte(BuscarProductoFacturasConstantesFunciones.getBuscarProductoFacturasDescripcion(buscarproductofacturas));
										
						
					
						
					
				} else  {
							
					//buscarproductofacturas.setsDetalleGeneralEntityReporte(buscarproductofacturas.getsDetalleGeneralEntityReporte());
										
				}
				
				//buscarproductofacturasbeans.add(buscarproductofacturasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return buscarproductofacturass;
    }
	//PARA REPORTES FIN
}
