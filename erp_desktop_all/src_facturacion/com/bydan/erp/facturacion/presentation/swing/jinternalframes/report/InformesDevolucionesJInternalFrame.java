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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.InformesDevolucionesConstantesFunciones;

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
public class InformesDevolucionesJInternalFrame extends InformesDevolucionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarInformesDevoluciones;
	
	protected JMenuBar jmenuBarInformesDevoluciones;
	
	protected JMenu jmenuInformesDevoluciones;
	protected JMenu jmenuDatosInformesDevoluciones;
	protected JMenu jmenuArchivoInformesDevoluciones;
	protected JMenu jmenuAccionesInformesDevoluciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformesDevoluciones;	
	protected GridBagConstraints gridBagConstraintsInformesDevoluciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public InformesDevolucionesDetalleFormJInternalFrame jInternalFrameDetalleFormInformesDevoluciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoInformesDevoluciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionInformesDevoluciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public InformesDevolucionesSessionBean informesdevolucionesSessionBean;
		
	
	
	public ProductoSessionBean productoSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<InformesDevoluciones> informesdevolucioness;		
	public List<InformesDevoluciones> informesdevolucionessEliminados;	
	public List<InformesDevoluciones> informesdevolucionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByInformesDevoluciones;		
	protected JButton jButtonAbrirOrderByInformesDevoluciones;
	
	
	//protected JPanel jPanelOrderByInformesDevoluciones;
	//public JScrollPane jScrollPanelOrderByInformesDevoluciones;	
	//protected JButton jButtonCerrarOrderByInformesDevoluciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public InformesDevolucionesLogic informesdevolucionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosInformesDevoluciones;
	public JScrollPane jScrollPanelDatosEdicionInformesDevoluciones;
	public JScrollPane jScrollPanelDatosGeneralInformesDevoluciones;
    
	
	
	//public JScrollPane jScrollPanelDatosInformesDevolucionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoInformesDevoluciones;
	//public JScrollPane jScrollPanelImportacionInformesDevoluciones;
	
	
	
	protected JPanel jPanelAccionesInformesDevoluciones;
	
    protected JPanel jPanelPaginacionInformesDevoluciones;
    protected JPanel jPanelParametrosReportesInformesDevoluciones;
	protected JPanel jPanelParametrosReportesAccionesInformesDevoluciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1InformesDevoluciones;
	protected JPanel jPanelParametrosAuxiliar2InformesDevoluciones;
	protected JPanel jPanelParametrosAuxiliar3InformesDevoluciones;
	protected JPanel jPanelParametrosAuxiliar4InformesDevoluciones;
	//protected JPanel jPanelParametrosAuxiliar5InformesDevoluciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoInformesDevoluciones;
	//protected JPanel jPanelImportacionInformesDevoluciones;
	
	
	public JTable jTableDatosInformesDevoluciones;
	
	
	
	//public JTable jTableDatosInformesDevolucionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoInformesDevoluciones;
	protected JButton jButtonDuplicarInformesDevoluciones;
	protected JButton jButtonCopiarInformesDevoluciones;
	protected JButton jButtonVerFormInformesDevoluciones;
	protected JButton jButtonNuevoRelacionesInformesDevoluciones;
	protected JButton jButtonModificarInformesDevoluciones;
	
    protected JButton jButtonGuardarCambiosTablaInformesDevoluciones;
	protected JButton jButtonCerrarInformesDevoluciones;
	
	
	protected JButton jButtonRecargarInformacionInformesDevoluciones;
	protected JButton jButtonProcesarInformacionInformesDevoluciones;
	
	
	protected JButton jButtonAnterioresInformesDevoluciones;
	protected JButton jButtonSiguientesInformesDevoluciones;
	protected JButton jButtonNuevoGuardarCambiosInformesDevoluciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoInformesDevoluciones;
	//protected JButton jButtonCerrarReporteDinamicoInformesDevoluciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoInformesDevoluciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionInformesDevoluciones;
	//protected JButton jButtonGenerarImportacionInformesDevoluciones;
	//protected JButton jButtonCerrarImportacionInformesDevoluciones;
	//protected JFileChooser jFileChooserImportacionInformesDevoluciones;
	//protected File fileImportacionInformesDevoluciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformesDevoluciones;
	protected JButton jButtonDuplicarToolBarInformesDevoluciones;
	protected JButton jButtonNuevoRelacionesToolBarInformesDevoluciones;
	
	
	public JButton jButtonGuardarCambiosToolBarInformesDevoluciones;
	protected JButton jButtonCopiarToolBarInformesDevoluciones;
	protected JButton jButtonVerFormToolBarInformesDevoluciones;
	public JButton jButtonGuardarCambiosTablaToolBarInformesDevoluciones;
	protected JButton jButtonMostrarOcultarTablaToolBarInformesDevoluciones;
	protected JButton jButtonCerrarToolBarInformesDevoluciones;
	
	protected JButton jButtonRecargarInformacionToolBarInformesDevoluciones;
	protected JButton jButtonProcesarInformacionToolBarInformesDevoluciones;
	protected JButton jButtonAnterioresToolBarInformesDevoluciones;
	protected JButton jButtonSiguientesToolBarInformesDevoluciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarInformesDevoluciones;
	protected JButton jButtonAbrirOrderByToolBarInformesDevoluciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformesDevoluciones;
	protected JMenuItem jMenuItemDuplicarInformesDevoluciones;
	protected JMenuItem jMenuItemNuevoRelacionesInformesDevoluciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosInformesDevoluciones;
	protected JMenuItem jMenuItemCopiarInformesDevoluciones;
	protected JMenuItem jMenuItemVerFormInformesDevoluciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformesDevoluciones;
	protected JMenuItem jMenuItemCerrarInformesDevoluciones;
	protected JMenuItem jMenuItemDetalleCerrarInformesDevoluciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByInformesDevoluciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformesDevoluciones;
	
	protected JMenuItem jMenuItemRecargarInformacionInformesDevoluciones;
	protected JMenuItem jMenuItemProcesarInformacionInformesDevoluciones;
	protected JMenuItem jMenuItemAnterioresInformesDevoluciones;
	protected JMenuItem jMenuItemSiguientesInformesDevoluciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformesDevoluciones;
	protected JMenuItem jMenuItemAbrirOrderByInformesDevoluciones;
	protected JMenuItem jMenuItemMostrarOcultarInformesDevoluciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformesDevoluciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosInformesDevoluciones;
	protected JCheckBox jCheckBoxSeleccionadosInformesDevoluciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaInformesDevoluciones;
	protected JCheckBox jCheckBoxConGraficoReporteInformesDevoluciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesInformesDevoluciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoInformesDevoluciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarInformesDevoluciones;
	protected JTextField jTextFieldValorCampoGeneralInformesDevoluciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteInformesDevoluciones;
	//public JList<Reporte> jListColumnasSelectReporteInformesDevoluciones;
	//public JScrollPane jScrollColumnasSelectReporteInformesDevoluciones;
	
	//public JLabel jLabelRelacionesSelectReporteInformesDevoluciones;
	//public JList<Reporte> jListRelacionesSelectReporteInformesDevoluciones;
	//public JScrollPane jScrollRelacionesSelectReporteInformesDevoluciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoInformesDevoluciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoInformesDevoluciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoInformesDevoluciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoInformesDevoluciones;
	
		
	//public JLabel jLabelArchivoImportacionInformesDevoluciones;	
	//public JLabel jLabelPathArchivoImportacionInformesDevoluciones;
	//protected JTextField jTextFieldPathArchivoImportacionInformesDevoluciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoInformesDevoluciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoInformesDevoluciones;
	
	//public JLabel jLabelColumnaCategoriaValorInformesDevoluciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorInformesDevoluciones;
	
	//public JLabel jLabelColumnasValoresGraficoInformesDevoluciones;
	//public JList<Reporte> jListColumnasValoresGraficoInformesDevoluciones;
	//public JScrollPane jScrollColumnasValoresGraficoInformesDevoluciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoInformesDevoluciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoInformesDevoluciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasInformesDevoluciones;
	public JPanel jPanelBusquedaInformesDevolucionesInformesDevoluciones;
	public JButton jButtonBusquedaInformesDevolucionesInformesDevoluciones;
	
	public JPanel jPanelid_productoBusquedaInformesDevolucionesInformesDevoluciones;
	public JLabel jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones;
	public JButton jButtonid_productoBusquedaInformesDevolucionesInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_productoBusquedaInformesDevolucionesInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaInformesDevolucionesInformesDevolucionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones;
	public JLabel jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones;
	public JButton jButtonid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevolucionesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones;
	public JLabel jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones;
	public JButton jButtonfecha_emision_desdeBusquedaInformesDevolucionesInformesDevolucionesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones;
	public JLabel jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones;
	public JButton jButtonfecha_emision_hastaBusquedaInformesDevolucionesInformesDevolucionesBusqueda= new JButtonMe();

	
	
	
	
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
	public InformesDevolucionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionInformesDevoluciones)	{
		this.jButtonRecargarInformacionInformesDevoluciones = jButtonRecargarInformacionInformesDevoluciones;
	}
	
	public JButton getjButtonProcesarInformacionInformesDevoluciones() {
		return this.jButtonProcesarInformacionInformesDevoluciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformesDevoluciones)	{
		this.jButtonProcesarInformacionInformesDevoluciones = jButtonProcesarInformacionInformesDevoluciones;
	}
	
	
	public JButton getjButtonRecargarInformacionInformesDevoluciones() {
		return this.jButtonRecargarInformacionInformesDevoluciones;
	}
	
	
	public List<InformesDevoluciones> getinformesdevolucioness() {
		return this.informesdevolucioness;
	}

	public void setinformesdevolucioness(List<InformesDevoluciones> informesdevolucioness) {
		this.informesdevolucioness = informesdevolucioness;
	}
	
	public List<InformesDevoluciones> getinformesdevolucionessAux() {
		return this.informesdevolucionessAux;
	}

	public void setinformesdevolucionessAux(List<InformesDevoluciones> informesdevolucionessAux) {
		this.informesdevolucionessAux = informesdevolucionessAux;
	}
	
	public List<InformesDevoluciones> getinformesdevolucionessEliminados() {
		return this.informesdevolucionessEliminados;
	}

	public void setInformesDevolucionessEliminados(List<InformesDevoluciones> informesdevolucionessEliminados) {
		this.informesdevolucionessEliminados = informesdevolucionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarInformesDevoluciones() {
		return jComboBoxTiposSeleccionarInformesDevoluciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarInformesDevoluciones(
			JComboBox jComboBoxTiposSeleccionarInformesDevoluciones) {
		this.jComboBoxTiposSeleccionarInformesDevoluciones = jComboBoxTiposSeleccionarInformesDevoluciones;
	}
	
	public void setBorderResaltarTiposSeleccionarInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralInformesDevoluciones() {
		return jTextFieldValorCampoGeneralInformesDevoluciones;
	}

	public void setjTextFieldValorCampoGeneralInformesDevoluciones(
			JTextField jTextFieldValorCampoGeneralInformesDevoluciones) {
		this.jTextFieldValorCampoGeneralInformesDevoluciones = jTextFieldValorCampoGeneralInformesDevoluciones;
	}

	public void setBorderResaltarValorCampoGeneralInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralInformesDevoluciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosInformesDevoluciones() {
		return this.jCheckBoxSeleccionarTodosInformesDevoluciones;
	}

	public void setjCheckBoxSeleccionarTodosInformesDevoluciones(
			JCheckBox jCheckBoxSeleccionarTodosInformesDevoluciones) {
		this.jCheckBoxSeleccionarTodosInformesDevoluciones = jCheckBoxSeleccionarTodosInformesDevoluciones;
	}

	public void setBorderResaltarSeleccionarTodosInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosInformesDevoluciones() {
		return this.jCheckBoxSeleccionadosInformesDevoluciones;
	}

	public void setjCheckBoxSeleccionadosInformesDevoluciones(
			JCheckBox jCheckBoxSeleccionadosInformesDevoluciones) {
		this.jCheckBoxSeleccionadosInformesDevoluciones = jCheckBoxSeleccionadosInformesDevoluciones;
	}
	
	public void setBorderResaltarSeleccionadosInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesInformesDevoluciones() {
		return this.jComboBoxTiposArchivosReportesInformesDevoluciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesInformesDevoluciones(
			JComboBox jComboBoxTiposArchivosReportesInformesDevoluciones) {
		this.jComboBoxTiposArchivosReportesInformesDevoluciones = jComboBoxTiposArchivosReportesInformesDevoluciones;
	}

	public void setBorderResaltarTiposArchivosReportesInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesInformesDevoluciones() {
		return this.jComboBoxTiposReportesInformesDevoluciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesInformesDevoluciones(
			JComboBox jComboBoxTiposReportesInformesDevoluciones) {
		this.jComboBoxTiposReportesInformesDevoluciones = jComboBoxTiposReportesInformesDevoluciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoInformesDevoluciones() {
	//	return jComboBoxTiposReportesDinamicoInformesDevoluciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoInformesDevoluciones(
	//		JComboBox jComboBoxTiposReportesDinamicoInformesDevoluciones) {
	//	this.jComboBoxTiposReportesDinamicoInformesDevoluciones = jComboBoxTiposReportesDinamicoInformesDevoluciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoInformesDevoluciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoInformesDevoluciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones = jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones;
	//}
	
	public void setBorderResaltarTiposReportesInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesInformesDevoluciones() {
		return this.jComboBoxTiposGraficosReportesInformesDevoluciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesInformesDevoluciones(
			JComboBox jComboBoxTiposGraficosReportesInformesDevoluciones) {
		this.jComboBoxTiposGraficosReportesInformesDevoluciones = jComboBoxTiposGraficosReportesInformesDevoluciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionInformesDevoluciones() {
		return this.jComboBoxTiposPaginacionInformesDevoluciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionInformesDevoluciones(
			JComboBox jComboBoxTiposPaginacionInformesDevoluciones) {
		this.jComboBoxTiposPaginacionInformesDevoluciones = jComboBoxTiposPaginacionInformesDevoluciones;
	}
	
	public void setBorderResaltarTiposPaginacionInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesInformesDevoluciones() {
		return this.jComboBoxTiposRelacionesInformesDevoluciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformesDevoluciones() {
		return this.jComboBoxTiposAccionesInformesDevoluciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformesDevoluciones(
			JComboBox jComboBoxTiposRelacionesInformesDevoluciones) {
		this.jComboBoxTiposRelacionesInformesDevoluciones = jComboBoxTiposRelacionesInformesDevoluciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformesDevoluciones(
			JComboBox jComboBoxTiposAccionesInformesDevoluciones) {
		this.jComboBoxTiposAccionesInformesDevoluciones = jComboBoxTiposAccionesInformesDevoluciones;
	}
	
	public void setBorderResaltarTiposRelacionesInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesInformesDevoluciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesInformesDevoluciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoInformesDevoluciones() {
	//	return jCheckBoxConGraficoDinamicoInformesDevoluciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoInformesDevoluciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoInformesDevoluciones) {
	//	this.jCheckBoxConGraficoDinamicoInformesDevoluciones = jCheckBoxConGraficoDinamicoInformesDevoluciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoInformesDevoluciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarInformesDevoluciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoInformesDevoluciones .setBorder(borderResaltar);		
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
		this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
		
		this.informesdevolucionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informesdevolucionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informesdevolucionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformesDevolucionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informes Devoluciones MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
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
		
		InformesDevolucionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarInformesDevoluciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"nuevo","nuevo","Nuevo"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"duplicar","duplicar","Duplicar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"copiar","copiar","Copiar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"ver_form","ver_form","Ver"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"recargar","recargar","Buscar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarInformesDevoluciones,this.jTtoolBarInformesDevoluciones,
							"cerrar","cerrar","Salir"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarInformesDevoluciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarInformesDevoluciones;
			
				this.jButtonProcesarInformacionToolBarInformesDevoluciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarInformesDevoluciones;
				
		//protected JButton jButtonModificarToolBarInformesDevoluciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarInformesDevoluciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuInformesDevoluciones=new JMenuMe("General");
		this.jmenuArchivoInformesDevoluciones=new JMenuMe("Archivo");
		this.jmenuAccionesInformesDevoluciones=new JMenuMe("Acciones");
		this.jmenuDatosInformesDevoluciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformesDevoluciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformesDevoluciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformesDevoluciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarInformesDevoluciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarInformesDevoluciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarInformesDevoluciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesInformesDevoluciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesInformesDevoluciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesInformesDevoluciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosInformesDevoluciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformesDevoluciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformesDevoluciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarInformesDevoluciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarInformesDevoluciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarInformesDevoluciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormInformesDevoluciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormInformesDevoluciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormInformesDevoluciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaInformesDevoluciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaInformesDevoluciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaInformesDevoluciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformesDevoluciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformesDevoluciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformesDevoluciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionInformesDevoluciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionInformesDevoluciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionInformesDevoluciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionInformesDevoluciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionInformesDevoluciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionInformesDevoluciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresInformesDevoluciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresInformesDevoluciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresInformesDevoluciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesInformesDevoluciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesInformesDevoluciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesInformesDevoluciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByInformesDevoluciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByInformesDevoluciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByInformesDevoluciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformesDevoluciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformesDevoluciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformesDevoluciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByInformesDevoluciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByInformesDevoluciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByInformesDevoluciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformesDevoluciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformesDevoluciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformesDevoluciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosInformesDevoluciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosInformesDevoluciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosInformesDevoluciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoInformesDevoluciones.add(this.jMenuItemCerrarInformesDevoluciones);
			
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemNuevoInformesDevoluciones);
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemNuevoGuardarCambiosInformesDevoluciones);
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemNuevoRelacionesInformesDevoluciones);
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemGuardarCambiosTablaInformesDevoluciones);		
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemDuplicarInformesDevoluciones);		
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemCopiarInformesDevoluciones);		
			this.jmenuAccionesInformesDevoluciones.add(this.jMenuItemVerFormInformesDevoluciones);		
			
			this.jmenuDatosInformesDevoluciones.add(this.jMenuItemRecargarInformacionInformesDevoluciones);				
			this.jmenuDatosInformesDevoluciones.add(this.jMenuItemAnterioresInformesDevoluciones);				
			this.jmenuDatosInformesDevoluciones.add(this.jMenuItemSiguientesInformesDevoluciones);				
			this.jmenuDatosInformesDevoluciones.add(this.jMenuItemAbrirOrderByInformesDevoluciones);				
			this.jmenuDatosInformesDevoluciones.add(this.jMenuItemMostrarOcultarInformesDevoluciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesInformesDevoluciones.add(this.jMenuItemGuardarCambiosInformesDevoluciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarInformesDevoluciones.add(this.jmenuArchivoInformesDevoluciones);		
			this.jmenuBarInformesDevoluciones.add(this.jmenuAccionesInformesDevoluciones);		
			this.jmenuBarInformesDevoluciones.add(this.jmenuDatosInformesDevoluciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarInformesDevoluciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasInformesDevoluciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaInformesDevolucionesInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Buscar Por Producto Por Tipo Devolucion Empresa Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaInformesDevolucionesInformesDevoluciones= new JButtonMe();
		this.jButtonBusquedaInformesDevolucionesInformesDevoluciones.setText("Buscar");
		this.jButtonBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Buscar Por Producto Por Tipo Devolucion Empresa Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaInformesDevolucionesInformesDevoluciones,"buscar_button","Buscar Por Producto Por Tipo Devolucion Empresa Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaInformesDevolucionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones = new JLabelMe();
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones.setText("Producto :");
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Producto");
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones = new JLabelMe();
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setText("Tipo Devolucion Empresa :");
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Tipo Devolucion Empresa");
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasInformesDevoluciones=new JTabbedPane();


		this.jTabbedPaneBusquedasInformesDevoluciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasInformesDevoluciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasInformesDevoluciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleInformesDevoluciones = new InformesDevolucionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Informes Devoluciones DATOS");
			this.jInternalFrameDetalleFormInformesDevoluciones = new InformesDevolucionesDetalleFormJInternalFrame(jDesktopPane,this.informesdevolucionesSessionBean.getConGuardarRelaciones(),this.informesdevolucionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormInformesDevoluciones = null;//new InformesDevolucionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformesDevoluciones= new GridBagLayout();
		
		
		this.jTableDatosInformesDevoluciones = new JTableMe();      
		
		String sToolTipInformesDevoluciones="";
		sToolTipInformesDevoluciones=InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformesDevoluciones+="(Facturacion.InformesDevoluciones)";
		}
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformesDevoluciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosInformesDevoluciones.setToolTipText(sToolTipInformesDevoluciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosInformesDevoluciones);
		this.jTableDatosInformesDevoluciones.setAutoCreateRowSorter(true);
		this.jTableDatosInformesDevoluciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosInformesDevoluciones.setRowSelectionAllowed(true);
		this.jTableDatosInformesDevoluciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoInformesDevoluciones = new JButtonMe();
		this.jButtonDuplicarInformesDevoluciones = new JButtonMe();
		this.jButtonCopiarInformesDevoluciones = new JButtonMe();
		this.jButtonVerFormInformesDevoluciones = new JButtonMe();
		this.jButtonNuevoRelacionesInformesDevoluciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones = new JButtonMe();
		this.jButtonCerrarInformesDevoluciones = new JButtonMe();
		
		this.jScrollPanelDatosInformesDevoluciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralInformesDevoluciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Informes Devoluciones";
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformesDevoluciones.setToolTipText("Acciones");
        this.jPanelAccionesInformesDevoluciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoInformesDevoluciones=new ReporteDinamicoJInternalFrame(InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoInformesDevoluciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionInformesDevoluciones=new ImportacionJInternalFrame(InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionInformesDevoluciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByInformesDevoluciones = new JButtonMe();
		
		this.jButtonAbrirOrderByInformesDevoluciones.setText("Orden");
		this.jButtonAbrirOrderByInformesDevoluciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformesDevoluciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformesDevoluciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformesDevoluciones,false,this);
			
			//this.cargarOrderByInformesDevoluciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformesDevoluciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformesDevoluciones,true,this);
			
			//this.cargarOrderByInformesDevoluciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosInformesDevoluciones.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosInformesDevoluciones.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosInformesDevoluciones.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosInformesDevoluciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformesDevoluciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformesDevoluciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoInformesDevoluciones.setText("Nuevo");
		this.jButtonDuplicarInformesDevoluciones.setText("Duplicar");
		this.jButtonCopiarInformesDevoluciones.setText("Copiar");
		this.jButtonVerFormInformesDevoluciones.setText("Ver");
		this.jButtonNuevoRelacionesInformesDevoluciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.setText("Guardar");
		this.jButtonCerrarInformesDevoluciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformesDevoluciones,"nuevo_button","Nuevo",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarInformesDevoluciones,"duplicar_button","Duplicar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarInformesDevoluciones,"copiar_button","Copiar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormInformesDevoluciones,"ver_form","Ver",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesInformesDevoluciones,"nuevorelaciones_button","Nuevo Rel",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformesDevoluciones,"guardarcambiostabla_button","Guardar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformesDevoluciones,"cerrar_button","Salir",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoInformesDevoluciones.setToolTipText("Nuevo"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarInformesDevoluciones.setToolTipText("Duplicar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarInformesDevoluciones.setToolTipText("Copiar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormInformesDevoluciones.setToolTipText("Ver"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesInformesDevoluciones.setToolTipText("Nuevo Rel"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.setToolTipText("Guardar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformesDevoluciones.setToolTipText("Salir"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformesDevoluciones";
		inputMap = this.jButtonNuevoInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformesDevoluciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformesDevoluciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarInformesDevoluciones";
		inputMap = this.jButtonDuplicarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarInformesDevoluciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarInformesDevoluciones"));
		
		//COPIAR
		sMapKey = "CopiarInformesDevoluciones";
		inputMap = this.jButtonCopiarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarInformesDevoluciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarInformesDevoluciones"));
		
		//VEr FORM
		sMapKey = "VerFormInformesDevoluciones";
		inputMap = this.jButtonVerFormInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormInformesDevoluciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormInformesDevoluciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesInformesDevoluciones";
		inputMap = this.jButtonNuevoRelacionesInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesInformesDevoluciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarInformesDevoluciones";
		inputMap = this.jButtonModificarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarInformesDevoluciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarInformesDevoluciones";
		inputMap = this.jButtonCerrarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformesDevoluciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformesDevoluciones";
		inputMap = this.jButtonGuardarCambiosTablaInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformesDevoluciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1InformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2InformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3InformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4InformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5InformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesInformesDevoluciones.setName("jPanelParametrosReportesInformesDevoluciones"); 
		
		this.jPanelParametrosReportesAccionesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesInformesDevoluciones.setName("jPanelParametrosReportesAccionesInformesDevoluciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionInformesDevoluciones = new JButtonMe();
		this.jButtonRecargarInformacionInformesDevoluciones.setText("Buscar");
		this.jButtonRecargarInformacionInformesDevoluciones.setToolTipText("Buscar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionInformesDevoluciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionInformesDevoluciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionInformesDevoluciones = new JButtonMe();
		this.jButtonProcesarInformacionInformesDevoluciones.setText("Procesar");
		this.jButtonProcesarInformacionInformesDevoluciones.setToolTipText("Procesar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionInformesDevoluciones.setVisible(false);
			
		this.jButtonProcesarInformacionInformesDevoluciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformesDevoluciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformesDevoluciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformesDevoluciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesInformesDevoluciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformesDevoluciones.setText("TIPO");       
		this.jComboBoxTiposReportesInformesDevoluciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformesDevoluciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesInformesDevoluciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionInformesDevoluciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionInformesDevoluciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesInformesDevoluciones.setText("Accion");
		this.jComboBoxTiposRelacionesInformesDevoluciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformesDevoluciones.setText("Accion");
		this.jComboBoxTiposAccionesInformesDevoluciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarInformesDevoluciones.setText("Accion");
		this.jComboBoxTiposSeleccionarInformesDevoluciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralInformesDevoluciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralInformesDevoluciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformesDevoluciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformesDevoluciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesInformesDevoluciones = new JLabelMe();
		
		this.jLabelAccionesInformesDevoluciones.setText("Acciones");		
		this.jLabelAccionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosInformesDevoluciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosInformesDevoluciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosInformesDevoluciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosInformesDevoluciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosInformesDevoluciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosInformesDevoluciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaInformesDevoluciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteInformesDevoluciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteInformesDevoluciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteInformesDevoluciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresInformesDevoluciones = new JButtonMe();
		//this.jButtonAnterioresInformesDevoluciones.setText("<<");
        this.jButtonAnterioresInformesDevoluciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresInformesDevoluciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesInformesDevoluciones = new JButtonMe();
		//this.jButtonSiguientesInformesDevoluciones.setText(">>");
        this.jButtonSiguientesInformesDevoluciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesInformesDevoluciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosInformesDevoluciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosInformesDevoluciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosInformesDevoluciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosInformesDevoluciones,"nuevoguardarcambios_button","Nue",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosInformesDevoluciones";
		inputMap = this.jButtonNuevoGuardarCambiosInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosInformesDevoluciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionInformesDevoluciones";
		inputMap = this.jButtonRecargarInformacionInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionInformesDevoluciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesInformesDevoluciones";
		inputMap = this.jButtonSiguientesInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesInformesDevoluciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresInformesDevoluciones";
		inputMap = this.jButtonAnterioresInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresInformesDevoluciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasInformesDevoluciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesInformesDevoluciones.setMinimumSize(new Dimension(this.getWidth(),InformesDevolucionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformesDevolucionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformesDevoluciones.setMaximumSize(new Dimension(this.getWidth(),InformesDevolucionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformesDevolucionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformesDevoluciones.setPreferredSize(new Dimension(this.getWidth(),InformesDevolucionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformesDevolucionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionInformesDevoluciones = new GridBagLayout();

			this.jPanelPaginacionInformesDevoluciones.setLayout(gridaBagLayoutPaginacionInformesDevoluciones);						
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 0;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonAnterioresInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					
						
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformesDevoluciones.gridy = 0;
			
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonNuevoGuardarCambiosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
						
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformesDevoluciones.gridy = 0;
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonSiguientesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 1;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonNuevoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
						
			
			
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
				this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsInformesDevoluciones.gridy = 1;
				this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionInformesDevoluciones.add(this.jButtonGuardarCambiosTablaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			}
			
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 1;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonDuplicarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 1;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonCopiarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 1;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonVerFormInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 1;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionInformesDevoluciones.add(this.jButtonCerrarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
		
		
		this.jButtonRecargarInformacionInformesDevoluciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformesDevoluciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformesDevoluciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesInformesDevoluciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformesDevoluciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformesDevoluciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesInformesDevoluciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformesDevoluciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformesDevoluciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesInformesDevoluciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformesDevoluciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformesDevoluciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionInformesDevoluciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformesDevoluciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformesDevoluciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesInformesDevoluciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformesDevoluciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformesDevoluciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesInformesDevoluciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformesDevoluciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformesDevoluciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarInformesDevoluciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformesDevoluciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformesDevoluciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteInformesDevoluciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformesDevoluciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformesDevoluciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosInformesDevoluciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformesDevoluciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformesDevoluciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosInformesDevoluciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformesDevoluciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformesDevoluciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesInformesDevoluciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesInformesDevoluciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1InformesDevoluciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2InformesDevoluciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3InformesDevoluciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4InformesDevoluciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesInformesDevoluciones.setLayout(gridaBagParametrosReportesInformesDevoluciones);
			this.jPanelParametrosReportesAccionesInformesDevoluciones.setLayout(gridaBagParametrosReportesAccionesInformesDevoluciones);
			
			
			this.jPanelParametrosAuxiliar1InformesDevoluciones.setLayout(gridaBagParametrosAuxiliar1InformesDevoluciones);
			this.jPanelParametrosAuxiliar2InformesDevoluciones.setLayout(gridaBagParametrosAuxiliar2InformesDevoluciones);
			this.jPanelParametrosAuxiliar3InformesDevoluciones.setLayout(gridaBagParametrosAuxiliar3InformesDevoluciones);
			this.jPanelParametrosAuxiliar4InformesDevoluciones.setLayout(gridaBagParametrosAuxiliar4InformesDevoluciones);
			//this.jPanelParametrosAuxiliar5InformesDevoluciones.setLayout(gridaBagParametrosAuxiliar2InformesDevoluciones);			
			
			
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jButtonRecargarInformacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformesDevoluciones.add(this.jComboBoxTiposPaginacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformesDevoluciones.add(this.jCheckBoxConAltoMaximoTablaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformesDevoluciones.add(this.jComboBoxTiposArchivosReportesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jPanelParametrosAuxiliar1InformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4InformesDevoluciones.add(this.jComboBoxTiposReportesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jPanelParametrosAuxiliar4InformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jComboBoxTiposReportesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jCheckBoxGenerarReporteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jPanelParametrosAuxiliar2InformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jLabelAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
				this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesInformesDevoluciones.add(this.jButtonAbrirOrderByInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jComboBoxTiposSeleccionarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
			
			
			/*
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jCheckBoxSeleccionarTodosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformesDevoluciones.add(this.jCheckBoxSeleccionarTodosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);															
				
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformesDevoluciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformesDevoluciones.add(this.jCheckBoxSeleccionadosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jPanelParametrosAuxiliar3InformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformesDevoluciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformesDevoluciones.add(this.jComboBoxTiposAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosInformesDevoluciones = new GridBagLayout();

			this.jScrollPanelDatosInformesDevoluciones.setLayout(gridaBagLayoutDatosInformesDevoluciones);
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = 0;
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;
			
			this.jScrollPanelDatosInformesDevoluciones.add(this.jTableDatosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosInformesDevoluciones.setViewportView(this.jTableDatosInformesDevoluciones);
		this.jTableDatosInformesDevoluciones.setFillsViewportHeight(true);
		this.jTableDatosInformesDevoluciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesInformesDevoluciones= new GridBagLayout();
		this.jPanelAccionesInformesDevoluciones.setLayout(gridaBagLayoutAccionesInformesDevoluciones);
		
		
		/*	
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
			
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonNuevoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones= new GridBagLayout();
		gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.setLayout(gridaBagLayoutBusquedaInformesDevolucionesInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 0;
		gridBagConstraintsInformesDevoluciones.gridx = 0;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jLabelid_productoBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 0;
		gridBagConstraintsInformesDevoluciones.gridx = 1;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);


		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 1;
		gridBagConstraintsInformesDevoluciones.gridx = 0;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jLabelid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 1;
		gridBagConstraintsInformesDevoluciones.gridx = 1;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);


		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 2;
		gridBagConstraintsInformesDevoluciones.gridx = 0;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jLabelfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 2;
		gridBagConstraintsInformesDevoluciones.gridx = 1;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);


		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 3;
		gridBagConstraintsInformesDevoluciones.gridx = 0;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jLabelfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 3;
		gridBagConstraintsInformesDevoluciones.gridx = 1;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformesDevoluciones.gridy = 4;
		gridBagConstraintsInformesDevoluciones.gridx =1;
		jPanelBusquedaInformesDevolucionesInformesDevoluciones.add(jButtonBusquedaInformesDevolucionesInformesDevoluciones, gridBagConstraintsInformesDevoluciones);

		jTabbedPaneBusquedasInformesDevoluciones.addTab("1.-Por Producto Por Tipo Devolucion Empresa Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaInformesDevolucionesInformesDevoluciones);
		jTabbedPaneBusquedasInformesDevoluciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformesDevoluciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();						
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;		
			//this.gridBagConstraintsInformesDevoluciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformesDevoluciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;		
		//this.gridBagConstraintsInformesDevoluciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsInformesDevoluciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;		
			this.gridBagConstraintsInformesDevoluciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsInformesDevoluciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);								
		
		
		/*
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		*/		
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformesDevoluciones.gridx =0;
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformesDevoluciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
				
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosInformesDevoluciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformesDevoluciones = new GridBagLayout();
			this.jPanelBusquedasParametrosInformesDevoluciones.setLayout(gridaBagLayoutBusquedasParametrosInformesDevoluciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralInformesDevoluciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformesDevoluciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformesDevoluciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformesDevoluciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralInformesDevoluciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoInformesDevoluciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoInformesDevoluciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoInformesDevoluciones.setName("jPanelReporteDinamicoInformesDevoluciones"); 
		
		this.jPanelReporteDinamicoInformesDevoluciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformesDevoluciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformesDevoluciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoInformesDevoluciones.setLayout(gridaBagLayoutReporteDinamicoInformesDevoluciones);
		
		
		this.jInternalFrameReporteDinamicoInformesDevoluciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoInformesDevoluciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformesDevoluciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoInformesDevoluciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoInformesDevoluciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoInformesDevoluciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoInformesDevoluciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoInformesDevoluciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoInformesDevoluciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoInformesDevoluciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoInformesDevoluciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoInformesDevoluciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformesDevoluciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformesDevoluciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteInformesDevoluciones = new JLabelMe();

		this.jLabelColumnasSelectReporteInformesDevoluciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jLabelColumnasSelectReporteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteInformesDevoluciones = new JList<Reporte>();
		this.jListColumnasSelectReporteInformesDevoluciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteInformesDevoluciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteInformesDevoluciones=new JScrollPane(this.jListColumnasSelectReporteInformesDevoluciones);
			
			this.jScrollColumnasSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoInformesDevoluciones.add(this.jListColumnasSelectReporteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jScrollColumnasSelectReporteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteInformesDevoluciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteInformesDevoluciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteInformesDevoluciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteInformesDevoluciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteInformesDevoluciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteInformesDevoluciones=new JScrollPane(this.jListRelacionesSelectReporteInformesDevoluciones);
			
			this.jScrollRelacionesSelectReporteInformesDevoluciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformesDevoluciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformesDevoluciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoInformesDevoluciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoInformesDevoluciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoInformesDevoluciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoInformesDevoluciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoInformesDevoluciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoInformesDevoluciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformesDevoluciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformesDevoluciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jLabelGenerarExcelReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones.setToolTipText("Generar EXCEL"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoInformesDevoluciones.add(this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jComboBoxTiposReportesDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jLabelTiposArchivoReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jComboBoxTiposArchivosReportesDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoInformesDevoluciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoInformesDevoluciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoInformesDevoluciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoInformesDevoluciones.setToolTipText("Generar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jButtonGenerarReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoInformesDevoluciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoInformesDevoluciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoInformesDevoluciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoInformesDevoluciones.setToolTipText("Cancelar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformesDevoluciones.add(this.jButtonCerrarReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalInformesDevoluciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoInformesDevoluciones= new JScrollPane(jPanelReporteDinamicoInformesDevoluciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoInformesDevoluciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformesDevoluciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformesDevoluciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoInformesDevoluciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoInformesDevoluciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalInformesDevoluciones);
		this.jInternalFrameReporteDinamicoInformesDevoluciones.getContentPane().add(this.jScrollPanelReporteDinamicoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionInformesDevoluciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionInformesDevoluciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionInformesDevoluciones.setName("jPanelImportacionInformesDevoluciones"); 
		
		this.jPanelImportacionInformesDevoluciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformesDevoluciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformesDevoluciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionInformesDevoluciones.setLayout(gridaBagLayoutImportacionInformesDevoluciones);
		
		
		this.jInternalFrameImportacionInformesDevoluciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionInformesDevoluciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionInformesDevoluciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformesDevoluciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionInformesDevoluciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformesDevoluciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformesDevoluciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionInformesDevoluciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformesDevoluciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformesDevoluciones.setResizable(true);
	    this.jInternalFrameImportacionInformesDevoluciones.setClosable(true);
	    this.jInternalFrameImportacionInformesDevoluciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionInformesDevoluciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformesDevoluciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformesDevoluciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionInformesDevoluciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformesDevoluciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformesDevoluciones.setResizable(true);
	    this.jInternalFrameImportacionInformesDevoluciones.setClosable(true);
	    this.jInternalFrameImportacionInformesDevoluciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionInformesDevoluciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformesDevoluciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformesDevoluciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionInformesDevoluciones = new JLabelMe();

		this.jLabelArchivoImportacionInformesDevoluciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformesDevoluciones.add(this.jLabelArchivoImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionInformesDevoluciones = new JFileChooser();		
		this.jFileChooserImportacionInformesDevoluciones.setToolTipText("ESCOGER ARCHIVO"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionInformesDevoluciones = new JButtonMe();
		this.jButtonAbrirImportacionInformesDevoluciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionInformesDevoluciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionInformesDevoluciones.setToolTipText("Generar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformesDevoluciones.add(this.jButtonAbrirImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionInformesDevoluciones = new JLabelMe();

		this.jLabelPathArchivoImportacionInformesDevoluciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformesDevoluciones.add(this.jLabelPathArchivoImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionInformesDevoluciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionInformesDevoluciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformesDevoluciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformesDevoluciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformesDevoluciones.add(this.jTextFieldPathArchivoImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionInformesDevoluciones = new JButtonMe();
		this.jButtonGenerarImportacionInformesDevoluciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionInformesDevoluciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionInformesDevoluciones.setToolTipText("Generar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformesDevoluciones.add(this.jButtonGenerarImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionInformesDevoluciones = new JButtonMe();
		this.jButtonCerrarImportacionInformesDevoluciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionInformesDevoluciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionInformesDevoluciones.setToolTipText("Cancelar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = iPosYImportacion;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformesDevoluciones.add(this.jButtonCerrarImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalInformesDevoluciones = new GridBagLayout();
		
		this.jScrollPanelImportacionInformesDevoluciones= new JScrollPane(jPanelImportacionInformesDevoluciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iPosYImportacion;
		this.gridBagConstraintsInformesDevoluciones.gridx =iPosXImportacion;
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionInformesDevoluciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionInformesDevoluciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalInformesDevoluciones);
		this.jInternalFrameImportacionInformesDevoluciones.getContentPane().add(this.jScrollPanelImportacionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByInformesDevoluciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByInformesDevoluciones = new JButtonMe();
			this.jButtonAbrirOrderByInformesDevoluciones.setText("Orden");
			this.jButtonAbrirOrderByInformesDevoluciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformesDevoluciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByInformesDevoluciones";
			inputMap = this.jButtonAbrirOrderByInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByInformesDevoluciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByInformesDevoluciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByInformesDevoluciones.setName("jPanelOrderByInformesDevoluciones"); 
			
			this.jPanelOrderByInformesDevoluciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformesDevoluciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformesDevoluciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByInformesDevoluciones.setLayout(gridaBagLayoutOrderByInformesDevoluciones);
			
			
			this.jTableDatosInformesDevolucionesOrderBy = new JTableMe();        
			this.jTableDatosInformesDevolucionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosInformesDevolucionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosInformesDevolucionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosInformesDevolucionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosInformesDevolucionesOrderBy.setViewportView(this.jTableDatosInformesDevolucionesOrderBy);
			this.jTableDatosInformesDevolucionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosInformesDevolucionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByInformesDevoluciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByInformesDevoluciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByInformesDevoluciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteInformesDevoluciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByInformesDevoluciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByInformesDevoluciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByInformesDevoluciones.setTitle("Orden");
			this.jInternalFrameOrderByInformesDevoluciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByInformesDevoluciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByInformesDevoluciones.setResizable(true);
			this.jInternalFrameOrderByInformesDevoluciones.setClosable(true);
			this.jInternalFrameOrderByInformesDevoluciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByInformesDevoluciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformesDevoluciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformesDevoluciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsInformesDevoluciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsInformesDevoluciones.ipady =150;
				
			this.jPanelOrderByInformesDevoluciones.add(jScrollPanelDatosInformesDevolucionesOrderBy, this.gridBagConstraintsInformesDevoluciones);//this.jTableDatosInformesDevolucionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByInformesDevoluciones = new JButtonMe();
			this.jButtonCerrarOrderByInformesDevoluciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByInformesDevoluciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByInformesDevoluciones.setToolTipText("Cancelar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsInformesDevoluciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByInformesDevoluciones.add(this.jButtonCerrarOrderByInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalInformesDevoluciones = new GridBagLayout();
			
			this.jScrollPanelOrderByInformesDevoluciones= new JScrollPane(jPanelOrderByInformesDevoluciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsInformesDevoluciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByInformesDevoluciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByInformesDevoluciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalInformesDevoluciones);
			
			this.jInternalFrameOrderByInformesDevoluciones.getContentPane().add(this.jScrollPanelOrderByInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
		
		} else {
			this.jButtonAbrirOrderByInformesDevoluciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.informesdevolucionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosInformesDevoluciones.getRowHeight();//InformesDevolucionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.isSelected()) {
					iHeightTable=InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformesDevoluciones.isSelected()) {
					iHeightTable=InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformesDevolucionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosInformesDevoluciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformesDevoluciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformesDevoluciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosInformesDevoluciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformesDevoluciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformesDevoluciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByInformesDevoluciones!=null && this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy()!=null) {
			//if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByInformesDevoluciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByInformesDevoluciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByInformesDevoluciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosInformesDevoluciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformesDevoluciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformesDevoluciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=informesdevolucionesLogic.getInformesDevolucioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informesdevolucioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<InformesDevoluciones> TraerInformesDevolucionesBeans(List<InformesDevoluciones> informesdevolucioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(InformesDevoluciones informesdevoluciones:informesdevolucioness) {
					
				if(!(InformesDevolucionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || InformesDevolucionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					informesdevoluciones.setsDetalleGeneralEntityReporte(InformesDevolucionesConstantesFunciones.getInformesDevolucionesDescripcion(informesdevoluciones));
										
						
					
						
					
				} else  {
							
					//informesdevoluciones.setsDetalleGeneralEntityReporte(informesdevoluciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//informesdevolucionesbeans.add(informesdevolucionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return informesdevolucioness;
    }
	//PARA REPORTES FIN
}
