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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesPorRegionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesPorRegionJInternalFrame extends CobrarClientesPorRegionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesPorRegion;
	
	protected JMenuBar jmenuBarCobrarClientesPorRegion;
	
	protected JMenu jmenuCobrarClientesPorRegion;
	protected JMenu jmenuDatosCobrarClientesPorRegion;
	protected JMenu jmenuArchivoCobrarClientesPorRegion;
	protected JMenu jmenuAccionesCobrarClientesPorRegion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesPorRegion;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesPorRegion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesPorRegionDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesPorRegion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesPorRegion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesPorRegion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public CobrarClientesPorRegionSessionBean cobrarclientesporregionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesPorRegion> cobrarclientesporregions;		
	public List<CobrarClientesPorRegion> cobrarclientesporregionsEliminados;	
	public List<CobrarClientesPorRegion> cobrarclientesporregionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesPorRegion;		
	protected JButton jButtonAbrirOrderByCobrarClientesPorRegion;
	
	
	//protected JPanel jPanelOrderByCobrarClientesPorRegion;
	//public JScrollPane jScrollPanelOrderByCobrarClientesPorRegion;	
	//protected JButton jButtonCerrarOrderByCobrarClientesPorRegion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesPorRegionLogic cobrarclientesporregionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesPorRegion;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesPorRegion;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesPorRegion;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesPorRegionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesPorRegion;
	//public JScrollPane jScrollPanelImportacionCobrarClientesPorRegion;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesPorRegion;
	
    protected JPanel jPanelPaginacionCobrarClientesPorRegion;
    protected JPanel jPanelParametrosReportesCobrarClientesPorRegion;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesPorRegion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesPorRegion;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesPorRegion;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesPorRegion;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesPorRegion;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesPorRegion;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesPorRegion;
	//protected JPanel jPanelImportacionCobrarClientesPorRegion;
	
	
	public JTable jTableDatosCobrarClientesPorRegion;
	
	
	
	//public JTable jTableDatosCobrarClientesPorRegionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesPorRegion;
	protected JButton jButtonDuplicarCobrarClientesPorRegion;
	protected JButton jButtonCopiarCobrarClientesPorRegion;
	protected JButton jButtonVerFormCobrarClientesPorRegion;
	protected JButton jButtonNuevoRelacionesCobrarClientesPorRegion;
	protected JButton jButtonModificarCobrarClientesPorRegion;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesPorRegion;
	protected JButton jButtonCerrarCobrarClientesPorRegion;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesPorRegion;
	protected JButton jButtonProcesarInformacionCobrarClientesPorRegion;
	
	
	protected JButton jButtonAnterioresCobrarClientesPorRegion;
	protected JButton jButtonSiguientesCobrarClientesPorRegion;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesPorRegion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesPorRegion;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesPorRegion;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesPorRegion;
	//protected JButton jButtonGenerarImportacionCobrarClientesPorRegion;
	//protected JButton jButtonCerrarImportacionCobrarClientesPorRegion;
	//protected JFileChooser jFileChooserImportacionCobrarClientesPorRegion;
	//protected File fileImportacionCobrarClientesPorRegion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesPorRegion;
	protected JButton jButtonDuplicarToolBarCobrarClientesPorRegion;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesPorRegion;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesPorRegion;
	protected JButton jButtonCopiarToolBarCobrarClientesPorRegion;
	protected JButton jButtonVerFormToolBarCobrarClientesPorRegion;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesPorRegion;
	protected JButton jButtonCerrarToolBarCobrarClientesPorRegion;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesPorRegion;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesPorRegion;
	protected JButton jButtonAnterioresToolBarCobrarClientesPorRegion;
	protected JButton jButtonSiguientesToolBarCobrarClientesPorRegion;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesPorRegion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDuplicarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesPorRegion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesPorRegion;
	protected JMenuItem jMenuItemCopiarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemVerFormCobrarClientesPorRegion;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesPorRegion;
	protected JMenuItem jMenuItemCerrarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesPorRegion;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesPorRegion;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesPorRegion;
	protected JMenuItem jMenuItemAnterioresCobrarClientesPorRegion;
	protected JMenuItem jMenuItemSiguientesCobrarClientesPorRegion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesPorRegion;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesPorRegion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesPorRegion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesPorRegion;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesPorRegion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesPorRegion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesPorRegion;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesPorRegion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesPorRegion;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesPorRegion;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesPorRegion;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesPorRegion;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesPorRegion;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesPorRegion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesPorRegion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesPorRegion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesPorRegion;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesPorRegion;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesPorRegion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesPorRegion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesPorRegion;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesPorRegion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesPorRegion;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesPorRegion;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesPorRegion;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesPorRegion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesPorRegion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesPorRegion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesPorRegion;
	public JPanel jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JButton jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	
	public JPanel jPanelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JLabel jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JButton jButtonid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JLabel jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JButton jButtonid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JLabel jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JButton jButtonid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JLabel jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion;
	public JButton jButtonid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegionUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarClientesPorRegionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesPorRegionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesPorRegion)	{
		this.jButtonRecargarInformacionCobrarClientesPorRegion = jButtonRecargarInformacionCobrarClientesPorRegion;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesPorRegion() {
		return this.jButtonProcesarInformacionCobrarClientesPorRegion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesPorRegion)	{
		this.jButtonProcesarInformacionCobrarClientesPorRegion = jButtonProcesarInformacionCobrarClientesPorRegion;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesPorRegion() {
		return this.jButtonRecargarInformacionCobrarClientesPorRegion;
	}
	
	
	public List<CobrarClientesPorRegion> getcobrarclientesporregions() {
		return this.cobrarclientesporregions;
	}

	public void setcobrarclientesporregions(List<CobrarClientesPorRegion> cobrarclientesporregions) {
		this.cobrarclientesporregions = cobrarclientesporregions;
	}
	
	public List<CobrarClientesPorRegion> getcobrarclientesporregionsAux() {
		return this.cobrarclientesporregionsAux;
	}

	public void setcobrarclientesporregionsAux(List<CobrarClientesPorRegion> cobrarclientesporregionsAux) {
		this.cobrarclientesporregionsAux = cobrarclientesporregionsAux;
	}
	
	public List<CobrarClientesPorRegion> getcobrarclientesporregionsEliminados() {
		return this.cobrarclientesporregionsEliminados;
	}

	public void setCobrarClientesPorRegionsEliminados(List<CobrarClientesPorRegion> cobrarclientesporregionsEliminados) {
		this.cobrarclientesporregionsEliminados = cobrarclientesporregionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesPorRegion() {
		return jComboBoxTiposSeleccionarCobrarClientesPorRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesPorRegion(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesPorRegion) {
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion = jComboBoxTiposSeleccionarCobrarClientesPorRegion;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesPorRegion() {
		return jTextFieldValorCampoGeneralCobrarClientesPorRegion;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesPorRegion(
			JTextField jTextFieldValorCampoGeneralCobrarClientesPorRegion) {
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion = jTextFieldValorCampoGeneralCobrarClientesPorRegion;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesPorRegion() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesPorRegion(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesPorRegion) {
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion = jCheckBoxSeleccionarTodosCobrarClientesPorRegion;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesPorRegion() {
		return this.jCheckBoxSeleccionadosCobrarClientesPorRegion;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesPorRegion(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesPorRegion) {
		this.jCheckBoxSeleccionadosCobrarClientesPorRegion = jCheckBoxSeleccionadosCobrarClientesPorRegion;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesPorRegion() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesPorRegion) {
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion = jComboBoxTiposArchivosReportesCobrarClientesPorRegion;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesPorRegion() {
		return this.jComboBoxTiposReportesCobrarClientesPorRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposReportesCobrarClientesPorRegion) {
		this.jComboBoxTiposReportesCobrarClientesPorRegion = jComboBoxTiposReportesCobrarClientesPorRegion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesPorRegion() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesPorRegion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesPorRegion(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesPorRegion) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion = jComboBoxTiposReportesDinamicoCobrarClientesPorRegion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion = jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesPorRegion() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesPorRegion) {
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion = jComboBoxTiposGraficosReportesCobrarClientesPorRegion;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesPorRegion() {
		return this.jComboBoxTiposPaginacionCobrarClientesPorRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesPorRegion(
			JComboBox jComboBoxTiposPaginacionCobrarClientesPorRegion) {
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion = jComboBoxTiposPaginacionCobrarClientesPorRegion;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesPorRegion() {
		return this.jComboBoxTiposRelacionesCobrarClientesPorRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesPorRegion() {
		return this.jComboBoxTiposAccionesCobrarClientesPorRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposRelacionesCobrarClientesPorRegion) {
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion = jComboBoxTiposRelacionesCobrarClientesPorRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesPorRegion(
			JComboBox jComboBoxTiposAccionesCobrarClientesPorRegion) {
		this.jComboBoxTiposAccionesCobrarClientesPorRegion = jComboBoxTiposAccionesCobrarClientesPorRegion;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesPorRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesPorRegion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesPorRegion() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesPorRegion;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesPorRegion(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesPorRegion) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesPorRegion = jCheckBoxConGraficoDinamicoCobrarClientesPorRegion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesPorRegion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesPorRegion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesPorRegion .setBorder(borderResaltar);		
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
		this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
		
		this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesporregionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesPorRegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesPorRegionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Por Region MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesPorRegionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesPorRegion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesPorRegion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"copiar","copiar","Copiar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"ver_form","ver_form","Ver"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"recargar","recargar","Buscar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesPorRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,
							"cerrar","cerrar","Salir"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesPorRegion;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesPorRegion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesPorRegion;
				
		//protected JButton jButtonModificarToolBarCobrarClientesPorRegion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesPorRegion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesPorRegion=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesPorRegion=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesPorRegion=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesPorRegion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesPorRegion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesPorRegion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesPorRegion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesPorRegion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesPorRegion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesPorRegion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesPorRegion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesPorRegion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesPorRegion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesPorRegion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesPorRegion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesPorRegion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesPorRegion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesPorRegion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesPorRegion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesPorRegion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesPorRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesPorRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesPorRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesPorRegion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesPorRegion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesPorRegion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesPorRegion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesPorRegion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesPorRegion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesPorRegion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesPorRegion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesPorRegion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesPorRegion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesPorRegion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesPorRegion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesPorRegion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesPorRegion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesPorRegion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesPorRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesPorRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesPorRegion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesPorRegion.add(this.jMenuItemCerrarCobrarClientesPorRegion);
			
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemNuevoCobrarClientesPorRegion);
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion);
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemNuevoRelacionesCobrarClientesPorRegion);
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion);		
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemDuplicarCobrarClientesPorRegion);		
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemCopiarCobrarClientesPorRegion);		
			this.jmenuAccionesCobrarClientesPorRegion.add(this.jMenuItemVerFormCobrarClientesPorRegion);		
			
			this.jmenuDatosCobrarClientesPorRegion.add(this.jMenuItemRecargarInformacionCobrarClientesPorRegion);				
			this.jmenuDatosCobrarClientesPorRegion.add(this.jMenuItemAnterioresCobrarClientesPorRegion);				
			this.jmenuDatosCobrarClientesPorRegion.add(this.jMenuItemSiguientesCobrarClientesPorRegion);				
			this.jmenuDatosCobrarClientesPorRegion.add(this.jMenuItemAbrirOrderByCobrarClientesPorRegion);				
			this.jmenuDatosCobrarClientesPorRegion.add(this.jMenuItemMostrarOcultarCobrarClientesPorRegion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesPorRegion.add(this.jMenuItemGuardarCambiosCobrarClientesPorRegion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesPorRegion.add(this.jmenuArchivoCobrarClientesPorRegion);		
			this.jmenuBarCobrarClientesPorRegion.add(this.jmenuAccionesCobrarClientesPorRegion);		
			this.jmenuBarCobrarClientesPorRegion.add(this.jmenuDatosCobrarClientesPorRegion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesPorRegion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesPorRegion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Buscar Por Pais Por Region Por Provincia Por Ciudad ");
		this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JButtonMe();
		this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setText("Buscar");
		this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Buscar Por Pais Por Region Por Provincia Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,"buscar_button","Buscar Por Pais Por Region Por Provincia Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion = new JLabelMe();
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setText("Pais :");
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Pais");
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion = new JLabelMe();
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setText("Region :");
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Region");
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion = new JLabelMe();
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setText("Provincia :");
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Provincia");
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion = new JLabelMe();
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setText("Ciudad :");
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCobrarClientesPorRegion=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesPorRegion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasCobrarClientesPorRegion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasCobrarClientesPorRegion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesPorRegion = new CobrarClientesPorRegionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Por Region DATOS");
			this.jInternalFrameDetalleFormCobrarClientesPorRegion = new CobrarClientesPorRegionDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesporregionSessionBean.getConGuardarRelaciones(),this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion = null;//new CobrarClientesPorRegionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesPorRegion= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesPorRegion = new JTableMe();      
		
		String sToolTipCobrarClientesPorRegion="";
		sToolTipCobrarClientesPorRegion=CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesPorRegion+="(Cartera.CobrarClientesPorRegion)";
		}
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesPorRegion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesPorRegion.setToolTipText(sToolTipCobrarClientesPorRegion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesPorRegion);
		this.jTableDatosCobrarClientesPorRegion.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesPorRegion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesPorRegion.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesPorRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesPorRegion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesPorRegion = new JButtonMe();
		this.jButtonDuplicarCobrarClientesPorRegion = new JButtonMe();
		this.jButtonCopiarCobrarClientesPorRegion = new JButtonMe();
		this.jButtonVerFormCobrarClientesPorRegion = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesPorRegion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion = new JButtonMe();
		this.jButtonCerrarCobrarClientesPorRegion = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesPorRegion = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesPorRegion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Por Region";
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesPorRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesPorRegion.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesPorRegion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesPorRegion=new ReporteDinamicoJInternalFrame(CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesPorRegion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesPorRegion=new ImportacionJInternalFrame(CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesPorRegion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesPorRegion = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesPorRegion.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesPorRegion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesPorRegion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesPorRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesPorRegion,false,this);
			
			//this.cargarOrderByCobrarClientesPorRegion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesPorRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesPorRegion,true,this);
			
			//this.cargarOrderByCobrarClientesPorRegion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesPorRegion.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCobrarClientesPorRegion.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCobrarClientesPorRegion.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCobrarClientesPorRegion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesPorRegion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesPorRegion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesPorRegion.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesPorRegion.setText("Duplicar");
		this.jButtonCopiarCobrarClientesPorRegion.setText("Copiar");
		this.jButtonVerFormCobrarClientesPorRegion.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setText("Guardar");
		this.jButtonCerrarCobrarClientesPorRegion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesPorRegion,"nuevo_button","Nuevo",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesPorRegion,"duplicar_button","Duplicar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesPorRegion,"copiar_button","Copiar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesPorRegion,"ver_form","Ver",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesPorRegion,"nuevorelaciones_button","Nuevo Rel",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesPorRegion,"guardarcambiostabla_button","Guardar",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesPorRegion,"cerrar_button","Salir",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesPorRegion.setToolTipText("Nuevo"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesPorRegion.setToolTipText("Duplicar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesPorRegion.setToolTipText("Copiar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesPorRegion.setToolTipText("Ver"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.setToolTipText("Nuevo Rel"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setToolTipText("Guardar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesPorRegion.setToolTipText("Salir"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesPorRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesPorRegion"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesPorRegion";
		inputMap = this.jButtonDuplicarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesPorRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesPorRegion"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesPorRegion";
		inputMap = this.jButtonCopiarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesPorRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesPorRegion"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesPorRegion";
		inputMap = this.jButtonVerFormCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesPorRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesPorRegion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesPorRegion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesPorRegion";
		inputMap = this.jButtonModificarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesPorRegion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesPorRegion";
		inputMap = this.jButtonCerrarCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesPorRegion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesPorRegion";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesPorRegion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesPorRegion.setName("jPanelParametrosReportesCobrarClientesPorRegion"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesPorRegion.setName("jPanelParametrosReportesAccionesCobrarClientesPorRegion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesPorRegion = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setToolTipText("Buscar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesPorRegion,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesPorRegion = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setToolTipText("Procesar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesPorRegion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesPorRegion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesPorRegion.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesPorRegion = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesPorRegion.setText("Acciones");		
		this.jLabelAccionesCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesPorRegion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesPorRegion = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesPorRegion.setText("<<");
        this.jButtonAnterioresCobrarClientesPorRegion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesPorRegion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesPorRegion = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesPorRegion.setText(">>");
        this.jButtonSiguientesCobrarClientesPorRegion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesPorRegion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion,"nuevoguardarcambios_button","Nue",this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesPorRegion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesPorRegion";
		inputMap = this.jButtonRecargarInformacionCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesPorRegion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesPorRegion";
		inputMap = this.jButtonSiguientesCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesPorRegion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesPorRegion";
		inputMap = this.jButtonAnterioresCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesPorRegion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesPorRegion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesPorRegion.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesPorRegion.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesPorRegion.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesPorRegionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesPorRegion = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesPorRegion.setLayout(gridaBagLayoutPaginacionCobrarClientesPorRegion);						
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonAnterioresCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					
						
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
						
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonSiguientesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonNuevoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
						
			
			
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
				this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonGuardarCambiosTablaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonDuplicarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonCopiarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonVerFormCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesPorRegion.add(this.jButtonCerrarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesPorRegion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesPorRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesPorRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesPorRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesPorRegion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesPorRegion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesPorRegion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesPorRegion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesPorRegion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesPorRegion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesPorRegion.setLayout(gridaBagParametrosReportesCobrarClientesPorRegion);
			this.jPanelParametrosReportesAccionesCobrarClientesPorRegion.setLayout(gridaBagParametrosReportesAccionesCobrarClientesPorRegion);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesPorRegion.setLayout(gridaBagParametrosAuxiliar1CobrarClientesPorRegion);
			this.jPanelParametrosAuxiliar2CobrarClientesPorRegion.setLayout(gridaBagParametrosAuxiliar2CobrarClientesPorRegion);
			this.jPanelParametrosAuxiliar3CobrarClientesPorRegion.setLayout(gridaBagParametrosAuxiliar3CobrarClientesPorRegion);
			this.jPanelParametrosAuxiliar4CobrarClientesPorRegion.setLayout(gridaBagParametrosAuxiliar4CobrarClientesPorRegion);
			//this.jPanelParametrosAuxiliar5CobrarClientesPorRegion.setLayout(gridaBagParametrosAuxiliar2CobrarClientesPorRegion);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jButtonRecargarInformacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesPorRegion.add(this.jComboBoxTiposPaginacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesPorRegion.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesPorRegion.add(this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jPanelParametrosAuxiliar1CobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesPorRegion.add(this.jComboBoxTiposReportesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jPanelParametrosAuxiliar4CobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jComboBoxTiposReportesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jCheckBoxGenerarReporteCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jPanelParametrosAuxiliar2CobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jLabelAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jButtonAbrirOrderByCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jComboBoxTiposSeleccionarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesPorRegion.add(this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);															
				
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesPorRegion.add(this.jCheckBoxSeleccionadosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jPanelParametrosAuxiliar3CobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesPorRegion.add(this.jComboBoxTiposAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesPorRegion = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesPorRegion.setLayout(gridaBagLayoutDatosCobrarClientesPorRegion);
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesPorRegion.add(this.jTableDatosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesPorRegion.setViewportView(this.jTableDatosCobrarClientesPorRegion);
		this.jTableDatosCobrarClientesPorRegion.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesPorRegion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesPorRegion= new GridBagLayout();
		this.jPanelAccionesCobrarClientesPorRegion.setLayout(gridaBagLayoutAccionesCobrarClientesPorRegion);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
			
		this.jPanelAccionesCobrarClientesPorRegion.add(this.jButtonNuevoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setLayout(gridaBagLayoutBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jLabelid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 0;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);


		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jLabelid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 1;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);


		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 2;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jLabelid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 2;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);


		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 3;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jLabelid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 3;
		gridBagConstraintsCobrarClientesPorRegion.gridx = 1;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesPorRegion.gridy = 4;
		gridBagConstraintsCobrarClientesPorRegion.gridx =1;
		jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.add(jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion, gridBagConstraintsCobrarClientesPorRegion);

		jTabbedPaneBusquedasCobrarClientesPorRegion.addTab("1.-Por Pais Por Region Por Provincia Por Ciudad ", jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
		jTabbedPaneBusquedasCobrarClientesPorRegion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesPorRegion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesPorRegion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesPorRegion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesPorRegion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesPorRegion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;		
			this.gridBagConstraintsCobrarClientesPorRegion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesPorRegion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		*/		
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =0;
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesPorRegion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
				
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesPorRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesPorRegion = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesPorRegion.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesPorRegion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
			
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesPorRegion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesPorRegion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesPorRegion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setName("jPanelReporteDinamicoCobrarClientesPorRegion"); 
		
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesPorRegion.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesPorRegion);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesPorRegion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesPorRegion = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesPorRegion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jLabelColumnasSelectReporteCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesPorRegion = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesPorRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesPorRegion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesPorRegion=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesPorRegion);
			
			this.jScrollColumnasSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jListColumnasSelectReporteCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jScrollColumnasSelectReporteCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesPorRegion = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesPorRegion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesPorRegion = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesPorRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesPorRegion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesPorRegion=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesPorRegion);
			
			this.jScrollRelacionesSelectReporteCobrarClientesPorRegion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesPorRegion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesPorRegion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesPorRegion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesPorRegion = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesPorRegion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion.setToolTipText("Generar EXCEL"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jComboBoxTiposReportesDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion.setToolTipText("Generar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion.setToolTipText("Cancelar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesPorRegion.add(this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesPorRegion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion= new JScrollPane(jPanelReporteDinamicoCobrarClientesPorRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesPorRegion);
		this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesPorRegion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesPorRegion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesPorRegion.setName("jPanelImportacionCobrarClientesPorRegion"); 
		
		this.jPanelImportacionCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesPorRegion.setLayout(gridaBagLayoutImportacionCobrarClientesPorRegion);
		
		
		this.jInternalFrameImportacionCobrarClientesPorRegion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesPorRegion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesPorRegion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesPorRegion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesPorRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesPorRegion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesPorRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesPorRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesPorRegion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesPorRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesPorRegion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesPorRegion = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesPorRegion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jLabelArchivoImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesPorRegion = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesPorRegion.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesPorRegion = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesPorRegion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesPorRegion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesPorRegion.setToolTipText("Generar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jButtonAbrirImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesPorRegion = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesPorRegion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesPorRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesPorRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesPorRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jLabelPathArchivoImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesPorRegion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesPorRegion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesPorRegion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesPorRegion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jTextFieldPathArchivoImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesPorRegion = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesPorRegion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesPorRegion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesPorRegion.setToolTipText("Generar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jButtonGenerarImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesPorRegion = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesPorRegion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesPorRegion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesPorRegion.setToolTipText("Cancelar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesPorRegion.add(this.jButtonCerrarImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesPorRegion = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesPorRegion= new JScrollPane(jPanelImportacionCobrarClientesPorRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesPorRegion.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesPorRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesPorRegion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesPorRegion);
		this.jInternalFrameImportacionCobrarClientesPorRegion.getContentPane().add(this.jScrollPanelImportacionCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesPorRegion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesPorRegion = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesPorRegion.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesPorRegion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesPorRegion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesPorRegion";
			inputMap = this.jButtonAbrirOrderByCobrarClientesPorRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesPorRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesPorRegion"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesPorRegion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesPorRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesPorRegion.setName("jPanelOrderByCobrarClientesPorRegion"); 
			
			this.jPanelOrderByCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesPorRegion.setLayout(gridaBagLayoutOrderByCobrarClientesPorRegion);
			
			
			this.jTableDatosCobrarClientesPorRegionOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesPorRegionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesPorRegionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesPorRegionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesPorRegionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesPorRegionOrderBy.setViewportView(this.jTableDatosCobrarClientesPorRegionOrderBy);
			this.jTableDatosCobrarClientesPorRegionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesPorRegionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesPorRegion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesPorRegion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesPorRegion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesPorRegion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesPorRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesPorRegion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesPorRegion.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesPorRegion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesPorRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesPorRegion.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesPorRegion.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesPorRegion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesPorRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Por Regiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesPorRegion.ipady =150;
				
			this.jPanelOrderByCobrarClientesPorRegion.add(jScrollPanelDatosCobrarClientesPorRegionOrderBy, this.gridBagConstraintsCobrarClientesPorRegion);//this.jTableDatosCobrarClientesPorRegionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesPorRegion = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesPorRegion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesPorRegion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesPorRegion.setToolTipText("Cancelar"+" "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesPorRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesPorRegion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesPorRegion.add(this.jButtonCerrarOrderByCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesPorRegion = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesPorRegion= new JScrollPane(jPanelOrderByCobrarClientesPorRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesPorRegion = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesPorRegion.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesPorRegion.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesPorRegion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesPorRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesPorRegion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesPorRegion);
			
			this.jInternalFrameOrderByCobrarClientesPorRegion.getContentPane().add(this.jScrollPanelOrderByCobrarClientesPorRegion, this.gridBagConstraintsCobrarClientesPorRegion);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesPorRegion = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesPorRegion.getRowHeight();//CobrarClientesPorRegionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.isSelected()) {
					iHeightTable=CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesPorRegion.isSelected()) {
					iHeightTable=CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesPorRegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesPorRegion!=null && this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesPorRegion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesPorRegion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesPorRegion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesPorRegion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclientesporregionLogic.getCobrarClientesPorRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesporregions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesPorRegion> TraerCobrarClientesPorRegionBeans(List<CobrarClientesPorRegion> cobrarclientesporregions,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregions) {
					
				if(!(CobrarClientesPorRegionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesPorRegionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarclientesporregion.setsDetalleGeneralEntityReporte(CobrarClientesPorRegionConstantesFunciones.getCobrarClientesPorRegionDescripcion(cobrarclientesporregion));
										
						
					
						
					
				} else  {
							
					//cobrarclientesporregion.setsDetalleGeneralEntityReporte(cobrarclientesporregion.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclientesporregionbeans.add(cobrarclientesporregionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclientesporregions;
    }
	//PARA REPORTES FIN
}
