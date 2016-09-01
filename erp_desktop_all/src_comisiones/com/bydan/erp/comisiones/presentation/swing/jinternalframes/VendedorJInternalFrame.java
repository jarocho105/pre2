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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.VendedorConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class VendedorJInternalFrame extends VendedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVendedor;
	
	protected JMenuBar jmenuBarVendedor;
	
	protected JMenu jmenuVendedor;
	protected JMenu jmenuDatosVendedor;
	protected JMenu jmenuArchivoVendedor;
	protected JMenu jmenuAccionesVendedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedor;	
	protected GridBagConstraints gridBagConstraintsVendedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VendedorDetalleFormJInternalFrame jInternalFrameDetalleFormVendedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVendedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVendedor;	
	
	
	public VendedorBeanSwingJInternalFrameTree jInternalFrameTreeVendedor;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadosoporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosoporte="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public VendedorSessionBean vendedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadosoporteSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Vendedor> vendedors;		
	public List<Vendedor> vendedorsEliminados;	
	public List<Vendedor> vendedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVendedor;		
	protected JButton jButtonAbrirOrderByVendedor;
	
	
	//protected JPanel jPanelOrderByVendedor;
	//public JScrollPane jScrollPanelOrderByVendedor;	
	//protected JButton jButtonCerrarOrderByVendedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VendedorLogic vendedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVendedor;
	public JScrollPane jScrollPanelDatosEdicionVendedor;
	public JScrollPane jScrollPanelDatosGeneralVendedor;
    
	
	
	//public JScrollPane jScrollPanelDatosVendedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVendedor;
	//public JScrollPane jScrollPanelImportacionVendedor;
	
	
	
	protected JPanel jPanelAccionesVendedor;
	
    protected JPanel jPanelPaginacionVendedor;
    protected JPanel jPanelParametrosReportesVendedor;
	protected JPanel jPanelParametrosReportesAccionesVendedor;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralVendedor;
	protected Integer iXPanelCamposIniciogeneralVendedor=0;
	protected Integer iYPanelCamposIniciogeneralVendedor=0;

	protected JPanel jPanelCamposInicioventasVendedor;
	protected Integer iXPanelCamposInicioventasVendedor=0;
	protected Integer iYPanelCamposInicioventasVendedor=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Vendedor;
	protected JPanel jPanelParametrosAuxiliar2Vendedor;
	protected JPanel jPanelParametrosAuxiliar3Vendedor;
	protected JPanel jPanelParametrosAuxiliar4Vendedor;
	//protected JPanel jPanelParametrosAuxiliar5Vendedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoVendedor;
	//protected JPanel jPanelImportacionVendedor;
	
	
	public JTable jTableDatosVendedor;
	
	
	
	//public JTable jTableDatosVendedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVendedor;
	protected JButton jButtonDuplicarVendedor;
	protected JButton jButtonCopiarVendedor;
	protected JButton jButtonVerFormVendedor;
	protected JButton jButtonNuevoRelacionesVendedor;
	protected JButton jButtonModificarVendedor;
	
    protected JButton jButtonGuardarCambiosTablaVendedor;
	protected JButton jButtonCerrarVendedor;
	
	
	protected JButton jButtonRecargarInformacionVendedor;
	protected JButton jButtonProcesarInformacionVendedor;
	
	
	protected JButton jButtonAnterioresVendedor;
	protected JButton jButtonSiguientesVendedor;
	protected JButton jButtonNuevoGuardarCambiosVendedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVendedor;
	//protected JButton jButtonCerrarReporteDinamicoVendedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoVendedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionVendedor;
	//protected JButton jButtonGenerarImportacionVendedor;
	//protected JButton jButtonCerrarImportacionVendedor;
	//protected JFileChooser jFileChooserImportacionVendedor;
	//protected File fileImportacionVendedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedor;
	protected JButton jButtonDuplicarToolBarVendedor;
	protected JButton jButtonNuevoRelacionesToolBarVendedor;
	
	
	public JButton jButtonGuardarCambiosToolBarVendedor;
	protected JButton jButtonCopiarToolBarVendedor;
	protected JButton jButtonVerFormToolBarVendedor;
	public JButton jButtonGuardarCambiosTablaToolBarVendedor;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedor;
	protected JButton jButtonCerrarToolBarVendedor;
	
	protected JButton jButtonRecargarInformacionToolBarVendedor;
	protected JButton jButtonProcesarInformacionToolBarVendedor;
	protected JButton jButtonAnterioresToolBarVendedor;
	protected JButton jButtonSiguientesToolBarVendedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarVendedor;
	protected JButton jButtonAbrirOrderByToolBarVendedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedor;
	protected JMenuItem jMenuItemDuplicarVendedor;
	protected JMenuItem jMenuItemNuevoRelacionesVendedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVendedor;
	protected JMenuItem jMenuItemCopiarVendedor;
	protected JMenuItem jMenuItemVerFormVendedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedor;
	protected JMenuItem jMenuItemCerrarVendedor;
	protected JMenuItem jMenuItemDetalleCerrarVendedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVendedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedor;
	
	protected JMenuItem jMenuItemRecargarInformacionVendedor;
	protected JMenuItem jMenuItemProcesarInformacionVendedor;
	protected JMenuItem jMenuItemAnterioresVendedor;
	protected JMenuItem jMenuItemSiguientesVendedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedor;
	protected JMenuItem jMenuItemAbrirOrderByVendedor;
	protected JMenuItem jMenuItemMostrarOcultarVendedor;
	
	
	//MENU
	
	protected JButton jButtonArbolVendedor;	
	
	protected JLabel jLabelAccionesVendedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVendedor;
	protected JCheckBox jCheckBoxSeleccionadosVendedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVendedor;
	protected JCheckBox jCheckBoxConGraficoReporteVendedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVendedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVendedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVendedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVendedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVendedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVendedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVendedor;
	protected JTextField jTextFieldValorCampoGeneralVendedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVendedor;
	//public JList<Reporte> jListColumnasSelectReporteVendedor;
	//public JScrollPane jScrollColumnasSelectReporteVendedor;
	
	//public JLabel jLabelRelacionesSelectReporteVendedor;
	//public JList<Reporte> jListRelacionesSelectReporteVendedor;
	//public JScrollPane jScrollRelacionesSelectReporteVendedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVendedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVendedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVendedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoVendedor;
	
		
	//public JLabel jLabelArchivoImportacionVendedor;	
	//public JLabel jLabelPathArchivoImportacionVendedor;
	//protected JTextField jTextFieldPathArchivoImportacionVendedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVendedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVendedor;
	
	//public JLabel jLabelColumnaCategoriaValorVendedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVendedor;
	
	//public JLabel jLabelColumnasValoresGraficoVendedor;
	//public JList<Reporte> jListColumnasValoresGraficoVendedor;
	//public JScrollPane jScrollColumnasValoresGraficoVendedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVendedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVendedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVendedor;
	public JPanel jPanelBusquedaPorCodigoVendedor;
	public JButton jButtonBusquedaPorCodigoVendedor;
	public JPanel jPanelBusquedaPorNombreVendedor;
	public JButton jButtonBusquedaPorNombreVendedor;
	public JPanel jPanelBusquedaPorRucVendedor;
	public JButton jButtonBusquedaPorRucVendedor;
	public JPanel jPanelFK_IdPaisVendedor;
	public JButton jButtonFK_IdPaisVendedor;
	public JPanel jPanelFK_IdVendedorVendedor;
	public JButton jButtonFK_IdVendedorVendedor;
	public JPanel jPanelFK_IdZonaVendedor;
	public JButton jButtonFK_IdZonaVendedor;
	
	public JPanel jPanelcodigoBusquedaPorCodigoVendedor;
	public JLabel jLabelcodigoBusquedaPorCodigoVendedor;
	public JTextField jTextFieldcodigoBusquedaPorCodigoVendedor;
	public JButton jButtoncodigoBusquedaPorCodigoVendedorBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreVendedor;
	public JLabel jLabelnombreBusquedaPorNombreVendedor;
	public JTextArea jTextAreanombreBusquedaPorNombreVendedor;
	public JButton jButtonnombreBusquedaPorNombreVendedorBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucVendedor;
	public JLabel jLabelrucBusquedaPorRucVendedor;
	public JTextField jTextFieldrucBusquedaPorRucVendedor;
	public JButton jButtonrucBusquedaPorRucVendedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisVendedor;
	public JLabel jLabelid_paisFK_IdPaisVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisVendedor;
	public JButton jButtonid_paisFK_IdPaisVendedor= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVendedorUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVendedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorVendedor;
	public JLabel jLabelid_vendedorFK_IdVendedorVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorVendedor;
	public JButton jButtonid_vendedorFK_IdVendedorVendedor= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorArbol= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaVendedor;
	public JLabel jLabelid_zonaFK_IdZonaVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaVendedor;
	public JButton jButtonid_zonaFK_IdZonaVendedor= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaVendedorUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaVendedorBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VendedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVendedor)	{
		this.jButtonRecargarInformacionVendedor = jButtonRecargarInformacionVendedor;
	}
	
	public JButton getjButtonProcesarInformacionVendedor() {
		return this.jButtonProcesarInformacionVendedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedor)	{
		this.jButtonProcesarInformacionVendedor = jButtonProcesarInformacionVendedor;
	}
	
	
	public JButton getjButtonRecargarInformacionVendedor() {
		return this.jButtonRecargarInformacionVendedor;
	}
	
	public JButton getjButtonArbolVendedor() {
		return this.jButtonArbolVendedor;
	}
	
	public void setjButtonArbol(JButton jButtonArbolVendedor)	{
		this.jButtonArbolVendedor = jButtonArbolVendedor;
	}
	
	public List<Vendedor> getvendedors() {
		return this.vendedors;
	}

	public void setvendedors(List<Vendedor> vendedors) {
		this.vendedors = vendedors;
	}
	
	public List<Vendedor> getvendedorsAux() {
		return this.vendedorsAux;
	}

	public void setvendedorsAux(List<Vendedor> vendedorsAux) {
		this.vendedorsAux = vendedorsAux;
	}
	
	public List<Vendedor> getvendedorsEliminados() {
		return this.vendedorsEliminados;
	}

	public void setVendedorsEliminados(List<Vendedor> vendedorsEliminados) {
		this.vendedorsEliminados = vendedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVendedor() {
		return jComboBoxTiposSeleccionarVendedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVendedor(
			JComboBox jComboBoxTiposSeleccionarVendedor) {
		this.jComboBoxTiposSeleccionarVendedor = jComboBoxTiposSeleccionarVendedor;
	}
	
	public void setBorderResaltarTiposSeleccionarVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVendedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVendedor() {
		return jTextFieldValorCampoGeneralVendedor;
	}

	public void setjTextFieldValorCampoGeneralVendedor(
			JTextField jTextFieldValorCampoGeneralVendedor) {
		this.jTextFieldValorCampoGeneralVendedor = jTextFieldValorCampoGeneralVendedor;
	}

	public void setBorderResaltarValorCampoGeneralVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVendedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVendedor() {
		return this.jCheckBoxSeleccionarTodosVendedor;
	}

	public void setjCheckBoxSeleccionarTodosVendedor(
			JCheckBox jCheckBoxSeleccionarTodosVendedor) {
		this.jCheckBoxSeleccionarTodosVendedor = jCheckBoxSeleccionarTodosVendedor;
	}

	public void setBorderResaltarSeleccionarTodosVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVendedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVendedor() {
		return this.jCheckBoxSeleccionadosVendedor;
	}

	public void setjCheckBoxSeleccionadosVendedor(
			JCheckBox jCheckBoxSeleccionadosVendedor) {
		this.jCheckBoxSeleccionadosVendedor = jCheckBoxSeleccionadosVendedor;
	}
	
	public void setBorderResaltarSeleccionadosVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVendedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVendedor() {
		return this.jComboBoxTiposArchivosReportesVendedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVendedor(
			JComboBox jComboBoxTiposArchivosReportesVendedor) {
		this.jComboBoxTiposArchivosReportesVendedor = jComboBoxTiposArchivosReportesVendedor;
	}

	public void setBorderResaltarTiposArchivosReportesVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVendedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVendedor() {
		return this.jComboBoxTiposReportesVendedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVendedor(
			JComboBox jComboBoxTiposReportesVendedor) {
		this.jComboBoxTiposReportesVendedor = jComboBoxTiposReportesVendedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVendedor() {
	//	return jComboBoxTiposReportesDinamicoVendedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVendedor(
	//		JComboBox jComboBoxTiposReportesDinamicoVendedor) {
	//	this.jComboBoxTiposReportesDinamicoVendedor = jComboBoxTiposReportesDinamicoVendedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVendedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoVendedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVendedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVendedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVendedor = jComboBoxTiposArchivosReportesDinamicoVendedor;
	//}
	
	public void setBorderResaltarTiposReportesVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVendedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVendedor() {
		return this.jComboBoxTiposGraficosReportesVendedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVendedor(
			JComboBox jComboBoxTiposGraficosReportesVendedor) {
		this.jComboBoxTiposGraficosReportesVendedor = jComboBoxTiposGraficosReportesVendedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVendedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVendedor() {
		return this.jComboBoxTiposPaginacionVendedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVendedor(
			JComboBox jComboBoxTiposPaginacionVendedor) {
		this.jComboBoxTiposPaginacionVendedor = jComboBoxTiposPaginacionVendedor;
	}
	
	public void setBorderResaltarTiposPaginacionVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVendedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVendedor() {
		return this.jComboBoxTiposRelacionesVendedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedor() {
		return this.jComboBoxTiposAccionesVendedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedor(
			JComboBox jComboBoxTiposRelacionesVendedor) {
		this.jComboBoxTiposRelacionesVendedor = jComboBoxTiposRelacionesVendedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedor(
			JComboBox jComboBoxTiposAccionesVendedor) {
		this.jComboBoxTiposAccionesVendedor = jComboBoxTiposAccionesVendedor;
	}
	
	public void setBorderResaltarTiposRelacionesVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVendedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVendedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVendedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVendedor() {
	//	return jCheckBoxConGraficoDinamicoVendedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoVendedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoVendedor) {
	//	this.jCheckBoxConGraficoDinamicoVendedor = jCheckBoxConGraficoDinamicoVendedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVendedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVendedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVendedor .setBorder(borderResaltar);		
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
		this.vendedorSessionBean=new VendedorSessionBean();
		
		this.vendedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor MANTENIMIENTO"));
		
		
		if(iWidth > 2750) {
			iWidth=2750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
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
		
		VendedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVendedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVendedor,this.jTtoolBarVendedor,
							"nuevo","nuevo","Nuevo"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVendedor,this.jTtoolBarVendedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVendedor,this.jTtoolBarVendedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVendedor,this.jTtoolBarVendedor,
							"duplicar","duplicar","Duplicar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVendedor,this.jTtoolBarVendedor,
							"copiar","copiar","Copiar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVendedor,this.jTtoolBarVendedor,
							"ver_form","ver_form","Ver"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedor,this.jTtoolBarVendedor,
							"recargar","recargar","Recargar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedor,this.jTtoolBarVendedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedor,this.jTtoolBarVendedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVendedor,this.jTtoolBarVendedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVendedor,this.jTtoolBarVendedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVendedor,this.jTtoolBarVendedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVendedor,this.jTtoolBarVendedor,
							"cerrar","cerrar","Salir"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVendedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVendedor;
			
				this.jButtonProcesarInformacionToolBarVendedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVendedor;
				
		//protected JButton jButtonModificarToolBarVendedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVendedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVendedor=new JMenuMe("General");
		this.jmenuArchivoVendedor=new JMenuMe("Archivo");
		this.jmenuAccionesVendedor=new JMenuMe("Acciones");
		this.jmenuDatosVendedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVendedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVendedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVendedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVendedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVendedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVendedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVendedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVendedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVendedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVendedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVendedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVendedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVendedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVendedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVendedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVendedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVendedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVendedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVendedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVendedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVendedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVendedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVendedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVendedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVendedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVendedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVendedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVendedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVendedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVendedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVendedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVendedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVendedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVendedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVendedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVendedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVendedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVendedor.add(this.jMenuItemCerrarVendedor);
			
			this.jmenuAccionesVendedor.add(this.jMenuItemNuevoVendedor);
			this.jmenuAccionesVendedor.add(this.jMenuItemNuevoGuardarCambiosVendedor);
			this.jmenuAccionesVendedor.add(this.jMenuItemNuevoRelacionesVendedor);
			this.jmenuAccionesVendedor.add(this.jMenuItemGuardarCambiosTablaVendedor);		
			this.jmenuAccionesVendedor.add(this.jMenuItemDuplicarVendedor);		
			this.jmenuAccionesVendedor.add(this.jMenuItemCopiarVendedor);		
			this.jmenuAccionesVendedor.add(this.jMenuItemVerFormVendedor);		
			
			this.jmenuDatosVendedor.add(this.jMenuItemRecargarInformacionVendedor);				
			this.jmenuDatosVendedor.add(this.jMenuItemAnterioresVendedor);				
			this.jmenuDatosVendedor.add(this.jMenuItemSiguientesVendedor);				
			this.jmenuDatosVendedor.add(this.jMenuItemAbrirOrderByVendedor);				
			this.jmenuDatosVendedor.add(this.jMenuItemMostrarOcultarVendedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVendedor.add(this.jMenuItemGuardarCambiosVendedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVendedor.add(this.jmenuArchivoVendedor);		
			this.jmenuBarVendedor.add(this.jmenuAccionesVendedor);		
			this.jmenuBarVendedor.add(this.jmenuDatosVendedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVendedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVendedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoVendedor.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoVendedor= new JButtonMe();
		this.jButtonBusquedaPorCodigoVendedor.setText("Buscar");
		this.jButtonBusquedaPorCodigoVendedor.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoVendedor,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoVendedor = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoVendedor.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoVendedor.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoVendedor= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoVendedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreVendedor.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreVendedor= new JButtonMe();
		this.jButtonBusquedaPorNombreVendedor.setText("Buscar");
		this.jButtonBusquedaPorNombreVendedor.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreVendedor,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreVendedor = new JLabelMe();
		jLabelnombreBusquedaPorNombreVendedor.setText("Nombre :");
		jLabelnombreBusquedaPorNombreVendedor.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreVendedor= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreVendedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucVendedor.setToolTipText("Buscar Por Ruc ");
		this.jButtonBusquedaPorRucVendedor= new JButtonMe();
		this.jButtonBusquedaPorRucVendedor.setText("Buscar");
		this.jButtonBusquedaPorRucVendedor.setToolTipText("Buscar Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucVendedor,"buscar_button","Buscar Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucVendedor = new JLabelMe();
		jLabelrucBusquedaPorRucVendedor.setText("Ruc :");
		jLabelrucBusquedaPorRucVendedor.setToolTipText("Ruc");
		jLabelrucBusquedaPorRucVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucVendedor= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucVendedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisVendedor.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisVendedor= new JButtonMe();
		this.jButtonFK_IdPaisVendedor.setText("Buscar");
		this.jButtonFK_IdPaisVendedor.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisVendedor,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisVendedor = new JLabelMe();
		jLabelid_paisFK_IdPaisVendedor.setText("Pais :");
		jLabelid_paisFK_IdPaisVendedor.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisVendedor= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisVendedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorVendedor.setToolTipText("Buscar Por Vendedor Padre ");
		this.jButtonFK_IdVendedorVendedor= new JButtonMe();
		this.jButtonFK_IdVendedorVendedor.setText("Buscar");
		this.jButtonFK_IdVendedorVendedor.setToolTipText("Buscar Por Vendedor Padre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorVendedor,"buscar_button","Buscar Por Vendedor Padre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorVendedor = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorVendedor.setText("Vendedor Padre :");
		jLabelid_vendedorFK_IdVendedorVendedor.setToolTipText("Vendedor Padre");
		jLabelid_vendedorFK_IdVendedorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorVendedor= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorVendedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaVendedor.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaVendedor= new JButtonMe();
		this.jButtonFK_IdZonaVendedor.setText("Buscar");
		this.jButtonFK_IdZonaVendedor.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaVendedor,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaVendedor = new JLabelMe();
		jLabelid_zonaFK_IdZonaVendedor.setText("Zona :");
		jLabelid_zonaFK_IdZonaVendedor.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaVendedor= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaVendedor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVendedor=new JTabbedPane();


		this.jTabbedPaneBusquedasVendedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVendedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVendedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVendedor = new VendedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vendedor DATOS");
			this.jInternalFrameDetalleFormVendedor = new VendedorDetalleFormJInternalFrame(jDesktopPane,this.vendedorSessionBean.getConGuardarRelaciones(),this.vendedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVendedor = null;//new VendedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedor= new GridBagLayout();
		
		
		this.jTableDatosVendedor = new JTableMe();      
		
		String sToolTipVendedor="";
		sToolTipVendedor=VendedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedor+="(Comisiones.Vendedor)";
		}
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVendedor.setToolTipText(sToolTipVendedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVendedor);
		this.jTableDatosVendedor.setAutoCreateRowSorter(true);
		this.jTableDatosVendedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVendedor.setRowSelectionAllowed(true);
		this.jTableDatosVendedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVendedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVendedor = new JButtonMe();
		this.jButtonDuplicarVendedor = new JButtonMe();
		this.jButtonCopiarVendedor = new JButtonMe();
		this.jButtonVerFormVendedor = new JButtonMe();
		this.jButtonNuevoRelacionesVendedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVendedor = new JButtonMe();
		this.jButtonCerrarVendedor = new JButtonMe();
		
		this.jScrollPanelDatosVendedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralVendedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioventasVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Vendedor";
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedor.setToolTipText("Acciones");
        this.jPanelAccionesVendedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralVendedor.setName("jPanelCamposFingeneralVendedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralVendedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioventasVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));
		this.jPanelCamposInicioventasVendedor.setName("jPanelCamposFinventasVendedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioventasVendedor, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoVendedor=new ReporteDinamicoJInternalFrame(VendedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVendedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVendedor=new ImportacionJInternalFrame(VendedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVendedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVendedor = new JButtonMe();
		
		this.jButtonAbrirOrderByVendedor.setText("Orden");
		this.jButtonAbrirOrderByVendedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedor,false,this);
			
			//this.cargarOrderByVendedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedor,true,this);
			
			//this.cargarOrderByVendedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVendedor.setMinimumSize(new Dimension(400,50));//2730
		this.jTableDatosVendedor.setMaximumSize(new Dimension(400,50));//2730
		this.jTableDatosVendedor.setPreferredSize(new Dimension(400,50));//2730
		
		this.jScrollPanelDatosVendedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVendedor.setText("Nuevo");
		this.jButtonDuplicarVendedor.setText("Duplicar");
		this.jButtonCopiarVendedor.setText("Copiar");
		this.jButtonVerFormVendedor.setText("Ver");
		this.jButtonNuevoRelacionesVendedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVendedor.setText("Guardar");
		this.jButtonCerrarVendedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedor,"nuevo_button","Nuevo",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVendedor,"duplicar_button","Duplicar",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVendedor,"copiar_button","Copiar",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVendedor,"ver_form","Ver",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVendedor,"nuevorelaciones_button","Nuevo Rel",this.vendedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedor,"guardarcambiostabla_button","Guardar",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedor,"cerrar_button","Salir",this.vendedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVendedor.setToolTipText("Nuevo"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVendedor.setToolTipText("Duplicar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVendedor.setToolTipText("Copiar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVendedor.setToolTipText("Ver"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVendedor.setToolTipText("Nuevo Rel"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVendedor.setToolTipText("Guardar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedor.setToolTipText("Salir"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedor";
		inputMap = this.jButtonNuevoVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarVendedor";
		inputMap = this.jButtonDuplicarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVendedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVendedor"));
		
		//COPIAR
		sMapKey = "CopiarVendedor";
		inputMap = this.jButtonCopiarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVendedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVendedor"));
		
		//VEr FORM
		sMapKey = "VerFormVendedor";
		inputMap = this.jButtonVerFormVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVendedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVendedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVendedor";
		inputMap = this.jButtonNuevoRelacionesVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVendedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVendedor";
		inputMap = this.jButtonModificarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVendedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVendedor";
		inputMap = this.jButtonCerrarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedor";
		inputMap = this.jButtonGuardarCambiosTablaVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Vendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Vendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Vendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Vendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Vendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVendedor.setName("jPanelParametrosReportesVendedor"); 
		
		this.jPanelParametrosReportesAccionesVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVendedor.setName("jPanelParametrosReportesAccionesVendedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVendedor = new JButtonMe();
		this.jButtonRecargarInformacionVendedor.setText("Recargar");
		this.jButtonRecargarInformacionVendedor.setToolTipText("Recargar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVendedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVendedor = new JButtonMe();
		this.jButtonProcesarInformacionVendedor.setText("Procesar");
		this.jButtonProcesarInformacionVendedor.setToolTipText("Procesar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVendedor.setVisible(false);
			
		this.jButtonProcesarInformacionVendedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolVendedor = new JButtonMe();
		this.jButtonArbolVendedor.setText("Arbol");		
		this.jButtonArbolVendedor.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVendedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedor.setText("TIPO");       
		this.jComboBoxTiposReportesVendedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVendedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVendedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVendedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionVendedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVendedor.setText("Accion");
		this.jComboBoxTiposRelacionesVendedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedor.setText("Accion");
		this.jComboBoxTiposAccionesVendedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVendedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVendedor.setText("Accion");
		this.jComboBoxTiposSeleccionarVendedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVendedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVendedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVendedor = new JLabelMe();
		
		this.jLabelAccionesVendedor.setText("Acciones");		
		this.jLabelAccionesVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVendedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVendedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVendedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVendedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVendedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVendedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVendedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVendedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVendedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVendedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVendedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteVendedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVendedor = new JButtonMe();
		//this.jButtonAnterioresVendedor.setText("<<");
        this.jButtonAnterioresVendedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVendedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVendedor = new JButtonMe();
		//this.jButtonSiguientesVendedor.setText(">>");
        this.jButtonSiguientesVendedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVendedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVendedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVendedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosVendedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVendedor,"nuevoguardarcambios_button","Nue",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVendedor";
		inputMap = this.jButtonNuevoGuardarCambiosVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVendedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVendedor";
		inputMap = this.jButtonRecargarInformacionVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVendedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVendedor";
		inputMap = this.jButtonSiguientesVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVendedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVendedor";
		inputMap = this.jButtonAnterioresVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVendedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVendedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVendedor.setMinimumSize(new Dimension(this.getWidth(),VendedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedor.setMaximumSize(new Dimension(this.getWidth(),VendedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedor.setPreferredSize(new Dimension(this.getWidth(),VendedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVendedor = new GridBagLayout();

			this.jPanelPaginacionVendedor.setLayout(gridaBagLayoutPaginacionVendedor);						
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 0;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVendedor.add(this.jButtonAnterioresVendedor, this.gridBagConstraintsVendedor);
					
						
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedor.gridy = 0;
			
			this.jPanelPaginacionVendedor.add(this.jButtonNuevoGuardarCambiosVendedor, this.gridBagConstraintsVendedor);
						
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedor.gridy = 0;
			this.jPanelPaginacionVendedor.add(this.jButtonSiguientesVendedor, this.gridBagConstraintsVendedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 1;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedor.add(this.jButtonNuevoVendedor, this.gridBagConstraintsVendedor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsVendedor = new GridBagConstraints();
				this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVendedor.gridy = 1;
				this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionVendedor.add(this.jButtonNuevoRelacionesVendedor, this.gridBagConstraintsVendedor);
			}
			
			
			if(!this.vendedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVendedor = new GridBagConstraints();
				this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVendedor.gridy = 1;
				this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVendedor.add(this.jButtonGuardarCambiosTablaVendedor, this.gridBagConstraintsVendedor);
			}
			
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 1;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedor.add(this.jButtonDuplicarVendedor, this.gridBagConstraintsVendedor);
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 1;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedor.add(this.jButtonCopiarVendedor, this.gridBagConstraintsVendedor);
		
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 1;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedor.add(this.jButtonVerFormVendedor, this.gridBagConstraintsVendedor);
		
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 1;
			this.gridBagConstraintsVendedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVendedor.add(this.jButtonCerrarVendedor, this.gridBagConstraintsVendedor);
		
		
		
		this.jButtonRecargarInformacionVendedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVendedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolVendedor.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolVendedor.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolVendedor.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesVendedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVendedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVendedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVendedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVendedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVendedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVendedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVendedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVendedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVendedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVendedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVendedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVendedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVendedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Vendedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Vendedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Vendedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Vendedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVendedor.setLayout(gridaBagParametrosReportesVendedor);
			this.jPanelParametrosReportesAccionesVendedor.setLayout(gridaBagParametrosReportesAccionesVendedor);
			
			
			this.jPanelParametrosAuxiliar1Vendedor.setLayout(gridaBagParametrosAuxiliar1Vendedor);
			this.jPanelParametrosAuxiliar2Vendedor.setLayout(gridaBagParametrosAuxiliar2Vendedor);
			this.jPanelParametrosAuxiliar3Vendedor.setLayout(gridaBagParametrosAuxiliar3Vendedor);
			this.jPanelParametrosAuxiliar4Vendedor.setLayout(gridaBagParametrosAuxiliar4Vendedor);
			//this.jPanelParametrosAuxiliar5Vendedor.setLayout(gridaBagParametrosAuxiliar2Vendedor);			
			
			
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedor.add(this.jButtonRecargarInformacionVendedor, this.gridBagConstraintsVendedor);			
			
			

			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedor.add(this.jButtonArbolVendedor, this.gridBagConstraintsVendedor);
			
			
			
			//PAGINACION
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vendedor.add(this.jComboBoxTiposPaginacionVendedor, this.gridBagConstraintsVendedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vendedor.add(this.jCheckBoxConAltoMaximoTablaVendedor, this.gridBagConstraintsVendedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vendedor.add(this.jComboBoxTiposArchivosReportesVendedor, this.gridBagConstraintsVendedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedor.add(this.jPanelParametrosAuxiliar1Vendedor, this.gridBagConstraintsVendedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Vendedor.add(this.jComboBoxTiposReportesVendedor, this.gridBagConstraintsVendedor);																		
			
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Vendedor.add(this.jComboBoxTiposGraficosReportesVendedor, this.gridBagConstraintsVendedor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedor.add(this.jPanelParametrosAuxiliar4Vendedor, this.gridBagConstraintsVendedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedor.add(this.jComboBoxTiposReportesVendedor, this.gridBagConstraintsVendedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedor.add(this.jCheckBoxGenerarReporteVendedor, this.gridBagConstraintsVendedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedor.add(this.jPanelParametrosAuxiliar2Vendedor, this.gridBagConstraintsVendedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedor.add(this.jLabelAccionesVendedor, this.gridBagConstraintsVendedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVendedor = new GridBagConstraints();
				this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVendedor.add(this.jButtonAbrirOrderByVendedor, this.gridBagConstraintsVendedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedor.add(this.jComboBoxTiposSeleccionarVendedor, this.gridBagConstraintsVendedor);			
			
			
			/*
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedor.add(this.jCheckBoxSeleccionarTodosVendedor, this.gridBagConstraintsVendedor);
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedor.add(this.jCheckBoxConGraficoReporteVendedor, this.gridBagConstraintsVendedor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vendedor.add(this.jCheckBoxSeleccionarTodosVendedor, this.gridBagConstraintsVendedor);															
				
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vendedor.add(this.jCheckBoxSeleccionadosVendedor, this.gridBagConstraintsVendedor);															
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vendedor.add(this.jCheckBoxConGraficoReporteVendedor, this.gridBagConstraintsVendedor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedor.add(this.jPanelParametrosAuxiliar3Vendedor, this.gridBagConstraintsVendedor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedor.add(this.jComboBoxTiposRelacionesVendedor, this.gridBagConstraintsVendedor);
				
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedor.add(this.jComboBoxTiposAccionesVendedor, this.gridBagConstraintsVendedor);
	
				
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedor.add(this.jTextFieldValorCampoGeneralVendedor, this.gridBagConstraintsVendedor);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralVendedor= new GridBagLayout();
		this.jPanelCamposIniciogeneralVendedor.setLayout(gridaBagLayoutCamposIniciogeneralVendedor);

		GridBagLayout gridaBagLayoutCamposInicioventasVendedor= new GridBagLayout();
		this.jPanelCamposInicioventasVendedor.setLayout(gridaBagLayoutCamposInicioventasVendedor);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVendedor = new GridBagLayout();

			this.jScrollPanelDatosVendedor.setLayout(gridaBagLayoutDatosVendedor);
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = 0;
			this.gridBagConstraintsVendedor.gridx = 0;
			
			this.jScrollPanelDatosVendedor.add(this.jTableDatosVendedor, this.gridBagConstraintsVendedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVendedor.setViewportView(this.jTableDatosVendedor);
		this.jTableDatosVendedor.setFillsViewportHeight(true);
		this.jTableDatosVendedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVendedor= new GridBagLayout();
		this.jPanelAccionesVendedor.setLayout(gridaBagLayoutAccionesVendedor);
		
		
		/*	
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 0;
			
		this.jPanelAccionesVendedor.add(this.jButtonNuevoVendedor, this.gridBagConstraintsVendedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoVendedor= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoVendedor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoVendedor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoVendedor.setLayout(gridaBagLayoutBusquedaPorCodigoVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelBusquedaPorCodigoVendedor.add(jLabelcodigoBusquedaPorCodigoVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelBusquedaPorCodigoVendedor.add(jTextFieldcodigoBusquedaPorCodigoVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelBusquedaPorCodigoVendedor.add(jButtonBusquedaPorCodigoVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreVendedor= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreVendedor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreVendedor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreVendedor.setLayout(gridaBagLayoutBusquedaPorNombreVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelBusquedaPorNombreVendedor.add(jLabelnombreBusquedaPorNombreVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelBusquedaPorNombreVendedor.add(jTextAreanombreBusquedaPorNombreVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelBusquedaPorNombreVendedor.add(jButtonBusquedaPorNombreVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorRucVendedor= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucVendedor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucVendedor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucVendedor.setLayout(gridaBagLayoutBusquedaPorRucVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelBusquedaPorRucVendedor.add(jLabelrucBusquedaPorRucVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelBusquedaPorRucVendedor.add(jTextFieldrucBusquedaPorRucVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelBusquedaPorRucVendedor.add(jButtonBusquedaPorRucVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("3.-Por Ruc ", jPanelBusquedaPorRucVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPaisVendedor= new GridBagLayout();
		gridaBagLayoutFK_IdPaisVendedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisVendedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisVendedor.setLayout(gridaBagLayoutFK_IdPaisVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelFK_IdPaisVendedor.add(jLabelid_paisFK_IdPaisVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelFK_IdPaisVendedor.add(jComboBoxid_paisFK_IdPaisVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelFK_IdPaisVendedor.add(jButtonFK_IdPaisVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("4.-Por Pais ", jPanelFK_IdPaisVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdVendedorVendedor= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorVendedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorVendedor.setLayout(gridaBagLayoutFK_IdVendedorVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelFK_IdVendedorVendedor.add(jLabelid_vendedorFK_IdVendedorVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelFK_IdVendedorVendedor.add(jComboBoxid_vendedorFK_IdVendedorVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelFK_IdVendedorVendedor.add(jButtonFK_IdVendedorVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("5.-Por Vendedor Padre ", jPanelFK_IdVendedorVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdZonaVendedor= new GridBagLayout();
		gridaBagLayoutFK_IdZonaVendedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaVendedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaVendedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaVendedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaVendedor.setLayout(gridaBagLayoutFK_IdZonaVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 0;
		jPanelFK_IdZonaVendedor.add(jLabelid_zonaFK_IdZonaVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 0;
		gridBagConstraintsVendedor.gridx = 1;
		jPanelFK_IdZonaVendedor.add(jComboBoxid_zonaFK_IdZonaVendedor, gridBagConstraintsVendedor);

		gridBagConstraintsVendedor = new GridBagConstraints();
		gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedor.gridy = 1;
		gridBagConstraintsVendedor.gridx =1;
		jPanelFK_IdZonaVendedor.add(jButtonFK_IdZonaVendedor, gridBagConstraintsVendedor);

		jTabbedPaneBusquedasVendedor.addTab("6.-Por Zona ", jPanelFK_IdZonaVendedor);
		jTabbedPaneBusquedasVendedor.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedor = new GridBagConstraints();						
			this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedor.gridx = 0;		
			//this.gridBagConstraintsVendedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVendedor, this.gridBagConstraintsVendedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVendedor.gridx = 0;		
		//this.gridBagConstraintsVendedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVendedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVendedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedor.gridx = 0;		
			this.gridBagConstraintsVendedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVendedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVendedor, this.gridBagConstraintsVendedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVendedor, this.gridBagConstraintsVendedor);								
		
		
		/*
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVendedor, this.gridBagConstraintsVendedor);
		*/		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedor.gridx =0;
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedor, this.gridBagConstraintsVendedor);
				
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVendedor, this.gridBagConstraintsVendedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeVendedor = new VendedorBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeVendedor.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeVendedor.setTitle("Vendedor ARBOL");
		this.jInternalFrameTreeVendedor.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeVendedor.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeVendedor.setResizable(true);
	    this.jInternalFrameTreeVendedor.setClosable(true);
	    this.jInternalFrameTreeVendedor.setMaximizable(true);
			
			
		if(VendedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVendedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedor = new GridBagLayout();
			this.jPanelBusquedasParametrosVendedor.setLayout(gridaBagLayoutBusquedasParametrosVendedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVendedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedor, this.gridBagConstraintsVendedor);
			
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedor, this.gridBagConstraintsVendedor);
		
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedor, this.gridBagConstraintsVendedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVendedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVendedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVendedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVendedor.setName("jPanelReporteDinamicoVendedor"); 
		
		this.jPanelReporteDinamicoVendedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVendedor.setLayout(gridaBagLayoutReporteDinamicoVendedor);
		
		
		this.jInternalFrameReporteDinamicoVendedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVendedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVendedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVendedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVendedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVendedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoVendedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoVendedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVendedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVendedor = new JLabelMe();

		this.jLabelColumnasSelectReporteVendedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedor.add(this.jLabelColumnasSelectReporteVendedor, this.gridBagConstraintsVendedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVendedor = new JList<Reporte>();
		this.jListColumnasSelectReporteVendedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVendedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVendedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVendedor=new JScrollPane(this.jListColumnasSelectReporteVendedor);
			
			this.jScrollColumnasSelectReporteVendedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVendedor.add(this.jListColumnasSelectReporteVendedor, this.gridBagConstraintsVendedor);
		this.jPanelReporteDinamicoVendedor.add(this.jScrollColumnasSelectReporteVendedor, this.gridBagConstraintsVendedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVendedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteVendedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedor.add(this.jLabelRelacionesSelectReporteVendedor, this.gridBagConstraintsVendedor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVendedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteVendedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVendedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVendedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVendedor=new JScrollPane(this.jListRelacionesSelectReporteVendedor);
			
			this.jScrollRelacionesSelectReporteVendedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVendedor.add(this.jListRelacionesSelectReporteVendedor, this.gridBagConstraintsVendedor);
		this.jPanelReporteDinamicoVendedor.add(this.jScrollRelacionesSelectReporteVendedor, this.gridBagConstraintsVendedor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoVendedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVendedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoVendedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVendedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVendedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVendedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVendedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVendedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVendedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVendedor = new JLabelMe();

		this.jLabelConGraficoDinamicoVendedor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedor.add(this.jLabelConGraficoDinamicoVendedor, this.gridBagConstraintsVendedor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVendedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVendedor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVendedor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVendedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVendedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVendedor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jCheckBoxConGraficoDinamicoVendedor, this.gridBagConstraintsVendedor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVendedor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVendedor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedor.add(this.jLabelColumnaCategoriaGraficoVendedor, this.gridBagConstraintsVendedor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVendedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVendedor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVendedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVendedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVendedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVendedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVendedor.add(this.jComboBoxColumnaCategoriaGraficoVendedor, this.gridBagConstraintsVendedor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVendedor = new JLabelMe();

		this.jLabelColumnaCategoriaValorVendedor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jLabelColumnaCategoriaValorVendedor, this.gridBagConstraintsVendedor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVendedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVendedor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVendedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVendedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVendedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVendedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVendedor.add(this.jComboBoxColumnaCategoriaValorVendedor, this.gridBagConstraintsVendedor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVendedor = new JLabelMe();

		this.jLabelColumnasValoresGraficoVendedor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jLabelColumnasValoresGraficoVendedor, this.gridBagConstraintsVendedor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVendedor = new JList<Reporte>();
		this.jListColumnasValoresGraficoVendedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVendedor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVendedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVendedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVendedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVendedor=new JScrollPane(this.jListColumnasValoresGraficoVendedor);
			
			this.jScrollColumnasValoresGraficoVendedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVendedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVendedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVendedor.add(this.jListColumnasSelectReporteVendedor, this.gridBagConstraintsVendedor);
		this.jPanelReporteDinamicoVendedor.add(this.jScrollColumnasValoresGraficoVendedor, this.gridBagConstraintsVendedor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVendedor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVendedor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jLabelTiposGraficosReportesDinamicoVendedor, this.gridBagConstraintsVendedor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVendedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVendedor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVendedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVendedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVendedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVendedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jComboBoxTiposGraficosReportesDinamicoVendedor, this.gridBagConstraintsVendedor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVendedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVendedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jLabelGenerarExcelReporteDinamicoVendedor, this.gridBagConstraintsVendedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVendedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVendedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVendedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVendedor.setToolTipText("Generar EXCEL"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVendedor.add(this.jButtonGenerarExcelReporteDinamicoVendedor, this.gridBagConstraintsVendedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedor.add(this.jComboBoxTiposReportesDinamicoVendedor, this.gridBagConstraintsVendedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVendedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVendedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedor.add(this.jLabelTiposArchivoReporteDinamicoVendedor, this.gridBagConstraintsVendedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedor.add(this.jComboBoxTiposArchivosReportesDinamicoVendedor, this.gridBagConstraintsVendedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVendedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVendedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVendedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVendedor.setToolTipText("Generar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedor.add(this.jButtonGenerarReporteDinamicoVendedor, this.gridBagConstraintsVendedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVendedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVendedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVendedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVendedor.setToolTipText("Cancelar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedor.add(this.jButtonCerrarReporteDinamicoVendedor, this.gridBagConstraintsVendedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVendedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVendedor= new JScrollPane(jPanelReporteDinamicoVendedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVendedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVendedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVendedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVendedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVendedor);
		this.jInternalFrameReporteDinamicoVendedor.getContentPane().add(this.jScrollPanelReporteDinamicoVendedor, this.gridBagConstraintsVendedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVendedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVendedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVendedor.setName("jPanelImportacionVendedor"); 
		
		this.jPanelImportacionVendedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVendedor.setLayout(gridaBagLayoutImportacionVendedor);
		
		
		this.jInternalFrameImportacionVendedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVendedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVendedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVendedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedor.setResizable(true);
	    this.jInternalFrameImportacionVendedor.setClosable(true);
	    this.jInternalFrameImportacionVendedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVendedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedor.setResizable(true);
	    this.jInternalFrameImportacionVendedor.setClosable(true);
	    this.jInternalFrameImportacionVendedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVendedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVendedor = new JLabelMe();

		this.jLabelArchivoImportacionVendedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedor.add(this.jLabelArchivoImportacionVendedor, this.gridBagConstraintsVendedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVendedor = new JFileChooser();		
		this.jFileChooserImportacionVendedor.setToolTipText("ESCOGER ARCHIVO"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVendedor = new JButtonMe();
		this.jButtonAbrirImportacionVendedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVendedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVendedor.setToolTipText("Generar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedor.add(this.jButtonAbrirImportacionVendedor, this.gridBagConstraintsVendedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVendedor = new JLabelMe();

		this.jLabelPathArchivoImportacionVendedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedor.add(this.jLabelPathArchivoImportacionVendedor, this.gridBagConstraintsVendedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVendedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVendedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedor.add(this.jTextFieldPathArchivoImportacionVendedor, this.gridBagConstraintsVendedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVendedor = new JButtonMe();
		this.jButtonGenerarImportacionVendedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVendedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVendedor.setToolTipText("Generar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedor.add(this.jButtonGenerarImportacionVendedor, this.gridBagConstraintsVendedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVendedor = new JButtonMe();
		this.jButtonCerrarImportacionVendedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVendedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVendedor.setToolTipText("Cancelar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedor.add(this.jButtonCerrarImportacionVendedor, this.gridBagConstraintsVendedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVendedor = new GridBagLayout();
		
		this.jScrollPanelImportacionVendedor= new JScrollPane(jPanelImportacionVendedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iPosYImportacion;
		this.gridBagConstraintsVendedor.gridx =iPosXImportacion;
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVendedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVendedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVendedor);
		this.jInternalFrameImportacionVendedor.getContentPane().add(this.jScrollPanelImportacionVendedor, this.gridBagConstraintsVendedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVendedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVendedor = new JButtonMe();
			this.jButtonAbrirOrderByVendedor.setText("Orden");
			this.jButtonAbrirOrderByVendedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVendedor";
			inputMap = this.jButtonAbrirOrderByVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVendedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByVendedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVendedor.setName("jPanelOrderByVendedor"); 
			
			this.jPanelOrderByVendedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVendedor.setLayout(gridaBagLayoutOrderByVendedor);
			
			
			this.jTableDatosVendedorOrderBy = new JTableMe();        
			this.jTableDatosVendedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVendedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVendedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVendedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVendedorOrderBy.setViewportView(this.jTableDatosVendedorOrderBy);
			this.jTableDatosVendedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVendedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVendedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVendedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVendedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVendedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVendedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVendedor.setTitle("Orden");
			this.jInternalFrameOrderByVendedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVendedor.setResizable(true);
			this.jInternalFrameOrderByVendedor.setClosable(true);
			this.jInternalFrameOrderByVendedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVendedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVendedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVendedor.ipady =150;
				
			this.jPanelOrderByVendedor.add(jScrollPanelDatosVendedorOrderBy, this.gridBagConstraintsVendedor);//this.jTableDatosVendedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVendedor = new JButtonMe();
			this.jButtonCerrarOrderByVendedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVendedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVendedor.setToolTipText("Cancelar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVendedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVendedor.add(this.jButtonCerrarOrderByVendedor, this.gridBagConstraintsVendedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVendedor = new GridBagLayout();
			
			this.jScrollPanelOrderByVendedor= new JScrollPane(jPanelOrderByVendedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsVendedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVendedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVendedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVendedor);
			
			this.jInternalFrameOrderByVendedor.getContentPane().add(this.jScrollPanelOrderByVendedor, this.gridBagConstraintsVendedor);			
		
		} else {
			this.jButtonAbrirOrderByVendedor = new JButtonMe();
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
		int iWidthTableCalculado=0;//6730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=1200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vendedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVendedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVendedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVendedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVendedor.getRowHeight();//VendedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VendedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedor.isSelected()) {
					iHeightTable=VendedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VendedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedor.isSelected()) {
					iHeightTable=VendedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVendedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVendedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVendedor!=null && this.jInternalFrameOrderByVendedor.getjTableDatosOrderBy()!=null) {
			//if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVendedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVendedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVendedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVendedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVendedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVendedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVendedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVendedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vendedorLogic.getVendedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Vendedor> TraerVendedorBeans(List<Vendedor> vendedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Vendedor vendedor:vendedors) {
					
				if(!(VendedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VendedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vendedor.setsDetalleGeneralEntityReporte(VendedorConstantesFunciones.getVendedorDescripcion(vendedor));
										
					vendedor.setes_supervisor_descripcion(VendedorConstantesFunciones.getes_supervisorDescripcion(vendedor));vendedor.setcon_presupuesto_descripcion(VendedorConstantesFunciones.getcon_presupuestoDescripcion(vendedor));vendedor.setcon_cobertura_descripcion(VendedorConstantesFunciones.getcon_coberturaDescripcion(vendedor));	
					
					

					if(vendedor.getNotaCreditoSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{vendedor.setnotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(vendedor.getNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getComisionVentaCobros()!=null && Funciones.existeClass(classes,ComisionVentaCobro.class)) {
						try{vendedor.setcomisionventacobrosDescripcionReporte(new JRBeanCollectionDataSource(ComisionVentaCobroJInternalFrame.TraerComisionVentaCobroBeans(vendedor.getComisionVentaCobros(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getVendedors()!=null && Funciones.existeClass(classes,Vendedor.class)) {
						try{vendedor.setvendedorsDescripcionReporte(new JRBeanCollectionDataSource(VendedorJInternalFrame.TraerVendedorBeans(vendedor.getVendedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{vendedor.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(vendedor.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getComisionGrupos()!=null && Funciones.existeClass(classes,ComisionGrupo.class)) {
						try{vendedor.setcomisiongruposDescripcionReporte(new JRBeanCollectionDataSource(ComisionGrupoJInternalFrame.TraerComisionGrupoBeans(vendedor.getComisionGrupos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getComisionLineas()!=null && Funciones.existeClass(classes,ComisionLinea.class)) {
						try{vendedor.setcomisionlineasDescripcionReporte(new JRBeanCollectionDataSource(ComisionLineaJInternalFrame.TraerComisionLineaBeans(vendedor.getComisionLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getVendedorZonas()!=null && Funciones.existeClass(classes,VendedorZona.class)) {
						try{vendedor.setvendedorzonasDescripcionReporte(new JRBeanCollectionDataSource(VendedorZonaJInternalFrame.TraerVendedorZonaBeans(vendedor.getVendedorZonas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getComisionCates()!=null && Funciones.existeClass(classes,ComisionCate.class)) {
						try{vendedor.setcomisioncatesDescripcionReporte(new JRBeanCollectionDataSource(ComisionCateJInternalFrame.TraerComisionCateBeans(vendedor.getComisionCates(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getCajeroTurnos()!=null && Funciones.existeClass(classes,CajeroTurno.class)) {
						try{vendedor.setcajeroturnosDescripcionReporte(new JRBeanCollectionDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(vendedor.getCajeroTurnos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getComisionMarcas()!=null && Funciones.existeClass(classes,ComisionMarca.class)) {
						try{vendedor.setcomisionmarcasDescripcionReporte(new JRBeanCollectionDataSource(ComisionMarcaJInternalFrame.TraerComisionMarcaBeans(vendedor.getComisionMarcas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getPresupuestoVentass()!=null && Funciones.existeClass(classes,PresupuestoVentas.class)) {
						try{vendedor.setpresupuestoventassDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasJInternalFrame.TraerPresupuestoVentasBeans(vendedor.getPresupuestoVentass(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(vendedor.getPresupuestoVentasLineass()!=null && Funciones.existeClass(classes,PresupuestoVentasLineas.class)) {
						try{vendedor.setpresupuestoventaslineassDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasLineasJInternalFrame.TraerPresupuestoVentasLineasBeans(vendedor.getPresupuestoVentasLineass(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//vendedor.setsDetalleGeneralEntityReporte(vendedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//vendedorbeans.add(vendedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vendedors;
    }
	//PARA REPORTES FIN
}
