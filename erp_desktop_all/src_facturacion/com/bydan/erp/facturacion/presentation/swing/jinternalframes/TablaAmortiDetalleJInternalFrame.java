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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TablaAmortiDetalleConstantesFunciones;

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
public class TablaAmortiDetalleJInternalFrame extends TablaAmortiDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTablaAmortiDetalle;
	
	protected JMenuBar jmenuBarTablaAmortiDetalle;
	
	protected JMenu jmenuTablaAmortiDetalle;
	protected JMenu jmenuDatosTablaAmortiDetalle;
	protected JMenu jmenuArchivoTablaAmortiDetalle;
	protected JMenu jmenuAccionesTablaAmortiDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaAmortiDetalle;	
	protected GridBagConstraints gridBagConstraintsTablaAmortiDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TablaAmortiDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormTablaAmortiDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTablaAmortiDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTablaAmortiDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TasaBeanSwingJInternalFrame tasaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tasa="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TasaSessionBean tasaSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TablaAmortiDetalle> tablaamortidetalles;		
	public List<TablaAmortiDetalle> tablaamortidetallesEliminados;	
	public List<TablaAmortiDetalle> tablaamortidetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTablaAmortiDetalle;		
	protected JButton jButtonAbrirOrderByTablaAmortiDetalle;
	
	
	//protected JPanel jPanelOrderByTablaAmortiDetalle;
	//public JScrollPane jScrollPanelOrderByTablaAmortiDetalle;	
	//protected JButton jButtonCerrarOrderByTablaAmortiDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TablaAmortiDetalleLogic tablaamortidetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTablaAmortiDetalle;
	public JScrollPane jScrollPanelDatosEdicionTablaAmortiDetalle;
	public JScrollPane jScrollPanelDatosGeneralTablaAmortiDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosTablaAmortiDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTablaAmortiDetalle;
	//public JScrollPane jScrollPanelImportacionTablaAmortiDetalle;
	
	
	
	protected JPanel jPanelAccionesTablaAmortiDetalle;
	
    protected JPanel jPanelPaginacionTablaAmortiDetalle;
    protected JPanel jPanelParametrosReportesTablaAmortiDetalle;
	protected JPanel jPanelParametrosReportesAccionesTablaAmortiDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TablaAmortiDetalle;
	protected JPanel jPanelParametrosAuxiliar2TablaAmortiDetalle;
	protected JPanel jPanelParametrosAuxiliar3TablaAmortiDetalle;
	protected JPanel jPanelParametrosAuxiliar4TablaAmortiDetalle;
	//protected JPanel jPanelParametrosAuxiliar5TablaAmortiDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoTablaAmortiDetalle;
	//protected JPanel jPanelImportacionTablaAmortiDetalle;
	
	
	public JTable jTableDatosTablaAmortiDetalle;
	
	
	
	//public JTable jTableDatosTablaAmortiDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTablaAmortiDetalle;
	protected JButton jButtonDuplicarTablaAmortiDetalle;
	protected JButton jButtonCopiarTablaAmortiDetalle;
	protected JButton jButtonVerFormTablaAmortiDetalle;
	protected JButton jButtonNuevoRelacionesTablaAmortiDetalle;
	protected JButton jButtonModificarTablaAmortiDetalle;
	
    protected JButton jButtonGuardarCambiosTablaTablaAmortiDetalle;
	protected JButton jButtonCerrarTablaAmortiDetalle;
	
	
	protected JButton jButtonRecargarInformacionTablaAmortiDetalle;
	protected JButton jButtonProcesarInformacionTablaAmortiDetalle;
	
	
	protected JButton jButtonAnterioresTablaAmortiDetalle;
	protected JButton jButtonSiguientesTablaAmortiDetalle;
	protected JButton jButtonNuevoGuardarCambiosTablaAmortiDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTablaAmortiDetalle;
	//protected JButton jButtonCerrarReporteDinamicoTablaAmortiDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionTablaAmortiDetalle;
	//protected JButton jButtonGenerarImportacionTablaAmortiDetalle;
	//protected JButton jButtonCerrarImportacionTablaAmortiDetalle;
	//protected JFileChooser jFileChooserImportacionTablaAmortiDetalle;
	//protected File fileImportacionTablaAmortiDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaAmortiDetalle;
	protected JButton jButtonDuplicarToolBarTablaAmortiDetalle;
	protected JButton jButtonNuevoRelacionesToolBarTablaAmortiDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarTablaAmortiDetalle;
	protected JButton jButtonCopiarToolBarTablaAmortiDetalle;
	protected JButton jButtonVerFormToolBarTablaAmortiDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaAmortiDetalle;
	protected JButton jButtonCerrarToolBarTablaAmortiDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarTablaAmortiDetalle;
	protected JButton jButtonProcesarInformacionToolBarTablaAmortiDetalle;
	protected JButton jButtonAnterioresToolBarTablaAmortiDetalle;
	protected JButton jButtonSiguientesToolBarTablaAmortiDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle;
	protected JButton jButtonAbrirOrderByToolBarTablaAmortiDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaAmortiDetalle;
	protected JMenuItem jMenuItemDuplicarTablaAmortiDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesTablaAmortiDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTablaAmortiDetalle;
	protected JMenuItem jMenuItemCopiarTablaAmortiDetalle;
	protected JMenuItem jMenuItemVerFormTablaAmortiDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaAmortiDetalle;
	protected JMenuItem jMenuItemCerrarTablaAmortiDetalle;
	protected JMenuItem jMenuItemDetalleCerrarTablaAmortiDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTablaAmortiDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaAmortiDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionTablaAmortiDetalle;
	protected JMenuItem jMenuItemProcesarInformacionTablaAmortiDetalle;
	protected JMenuItem jMenuItemAnterioresTablaAmortiDetalle;
	protected JMenuItem jMenuItemSiguientesTablaAmortiDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaAmortiDetalle;
	protected JMenuItem jMenuItemAbrirOrderByTablaAmortiDetalle;
	protected JMenuItem jMenuItemMostrarOcultarTablaAmortiDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaAmortiDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTablaAmortiDetalle;
	protected JCheckBox jCheckBoxSeleccionadosTablaAmortiDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTablaAmortiDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTablaAmortiDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTablaAmortiDetalle;
	protected JTextField jTextFieldValorCampoGeneralTablaAmortiDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTablaAmortiDetalle;
	//public JList<Reporte> jListColumnasSelectReporteTablaAmortiDetalle;
	//public JScrollPane jScrollColumnasSelectReporteTablaAmortiDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteTablaAmortiDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteTablaAmortiDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteTablaAmortiDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTablaAmortiDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTablaAmortiDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle;
	
		
	//public JLabel jLabelArchivoImportacionTablaAmortiDetalle;	
	//public JLabel jLabelPathArchivoImportacionTablaAmortiDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionTablaAmortiDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTablaAmortiDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorTablaAmortiDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTablaAmortiDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoTablaAmortiDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoTablaAmortiDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoTablaAmortiDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTablaAmortiDetalle;
	public JPanel jPanelFK_IdFacturaTablaAmortiDetalle;
	public JButton jButtonFK_IdFacturaTablaAmortiDetalle;
	public JPanel jPanelFK_IdTasaTablaAmortiDetalle;
	public JButton jButtonFK_IdTasaTablaAmortiDetalle;
	public JPanel jPanelFK_IdTipoIntervaloTablaAmortiDetalle;
	public JButton jButtonFK_IdTipoIntervaloTablaAmortiDetalle;
	
	public JPanel jPanelid_facturaFK_IdFacturaTablaAmortiDetalle;
	public JLabel jLabelid_facturaFK_IdFacturaTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle;
	public JButton jButtonid_facturaFK_IdFacturaTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTablaAmortiDetalleBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle;
	
	public JPanel jPanelid_tasaFK_IdTasaTablaAmortiDetalle;
	public JLabel jLabelid_tasaFK_IdTasaTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle;
	public JButton jButtonid_tasaFK_IdTasaTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_tasaFK_IdTasaTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tasaFK_IdTasaTablaAmortiDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle;
	public JLabel jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle;
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalleBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TablaAmortiDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTablaAmortiDetalle)	{
		this.jButtonRecargarInformacionTablaAmortiDetalle = jButtonRecargarInformacionTablaAmortiDetalle;
	}
	
	public JButton getjButtonProcesarInformacionTablaAmortiDetalle() {
		return this.jButtonProcesarInformacionTablaAmortiDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaAmortiDetalle)	{
		this.jButtonProcesarInformacionTablaAmortiDetalle = jButtonProcesarInformacionTablaAmortiDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionTablaAmortiDetalle() {
		return this.jButtonRecargarInformacionTablaAmortiDetalle;
	}
	
	
	public List<TablaAmortiDetalle> gettablaamortidetalles() {
		return this.tablaamortidetalles;
	}

	public void settablaamortidetalles(List<TablaAmortiDetalle> tablaamortidetalles) {
		this.tablaamortidetalles = tablaamortidetalles;
	}
	
	public List<TablaAmortiDetalle> gettablaamortidetallesAux() {
		return this.tablaamortidetallesAux;
	}

	public void settablaamortidetallesAux(List<TablaAmortiDetalle> tablaamortidetallesAux) {
		this.tablaamortidetallesAux = tablaamortidetallesAux;
	}
	
	public List<TablaAmortiDetalle> gettablaamortidetallesEliminados() {
		return this.tablaamortidetallesEliminados;
	}

	public void setTablaAmortiDetallesEliminados(List<TablaAmortiDetalle> tablaamortidetallesEliminados) {
		this.tablaamortidetallesEliminados = tablaamortidetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTablaAmortiDetalle() {
		return jComboBoxTiposSeleccionarTablaAmortiDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTablaAmortiDetalle(
			JComboBox jComboBoxTiposSeleccionarTablaAmortiDetalle) {
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle = jComboBoxTiposSeleccionarTablaAmortiDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTablaAmortiDetalle() {
		return jTextFieldValorCampoGeneralTablaAmortiDetalle;
	}

	public void setjTextFieldValorCampoGeneralTablaAmortiDetalle(
			JTextField jTextFieldValorCampoGeneralTablaAmortiDetalle) {
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle = jTextFieldValorCampoGeneralTablaAmortiDetalle;
	}

	public void setBorderResaltarValorCampoGeneralTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTablaAmortiDetalle() {
		return this.jCheckBoxSeleccionarTodosTablaAmortiDetalle;
	}

	public void setjCheckBoxSeleccionarTodosTablaAmortiDetalle(
			JCheckBox jCheckBoxSeleccionarTodosTablaAmortiDetalle) {
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle = jCheckBoxSeleccionarTodosTablaAmortiDetalle;
	}

	public void setBorderResaltarSeleccionarTodosTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTablaAmortiDetalle() {
		return this.jCheckBoxSeleccionadosTablaAmortiDetalle;
	}

	public void setjCheckBoxSeleccionadosTablaAmortiDetalle(
			JCheckBox jCheckBoxSeleccionadosTablaAmortiDetalle) {
		this.jCheckBoxSeleccionadosTablaAmortiDetalle = jCheckBoxSeleccionadosTablaAmortiDetalle;
	}
	
	public void setBorderResaltarSeleccionadosTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTablaAmortiDetalle() {
		return this.jComboBoxTiposArchivosReportesTablaAmortiDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTablaAmortiDetalle(
			JComboBox jComboBoxTiposArchivosReportesTablaAmortiDetalle) {
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle = jComboBoxTiposArchivosReportesTablaAmortiDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTablaAmortiDetalle() {
		return this.jComboBoxTiposReportesTablaAmortiDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTablaAmortiDetalle(
			JComboBox jComboBoxTiposReportesTablaAmortiDetalle) {
		this.jComboBoxTiposReportesTablaAmortiDetalle = jComboBoxTiposReportesTablaAmortiDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTablaAmortiDetalle() {
	//	return jComboBoxTiposReportesDinamicoTablaAmortiDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTablaAmortiDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoTablaAmortiDetalle) {
	//	this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle = jComboBoxTiposReportesDinamicoTablaAmortiDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle = jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle;
	//}
	
	public void setBorderResaltarTiposReportesTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTablaAmortiDetalle() {
		return this.jComboBoxTiposGraficosReportesTablaAmortiDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTablaAmortiDetalle(
			JComboBox jComboBoxTiposGraficosReportesTablaAmortiDetalle) {
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle = jComboBoxTiposGraficosReportesTablaAmortiDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTablaAmortiDetalle() {
		return this.jComboBoxTiposPaginacionTablaAmortiDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTablaAmortiDetalle(
			JComboBox jComboBoxTiposPaginacionTablaAmortiDetalle) {
		this.jComboBoxTiposPaginacionTablaAmortiDetalle = jComboBoxTiposPaginacionTablaAmortiDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTablaAmortiDetalle() {
		return this.jComboBoxTiposRelacionesTablaAmortiDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaAmortiDetalle() {
		return this.jComboBoxTiposAccionesTablaAmortiDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaAmortiDetalle(
			JComboBox jComboBoxTiposRelacionesTablaAmortiDetalle) {
		this.jComboBoxTiposRelacionesTablaAmortiDetalle = jComboBoxTiposRelacionesTablaAmortiDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaAmortiDetalle(
			JComboBox jComboBoxTiposAccionesTablaAmortiDetalle) {
		this.jComboBoxTiposAccionesTablaAmortiDetalle = jComboBoxTiposAccionesTablaAmortiDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTablaAmortiDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTablaAmortiDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTablaAmortiDetalle() {
	//	return jCheckBoxConGraficoDinamicoTablaAmortiDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoTablaAmortiDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoTablaAmortiDetalle) {
	//	this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle = jCheckBoxConGraficoDinamicoTablaAmortiDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTablaAmortiDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTablaAmortiDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle .setBorder(borderResaltar);		
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
		this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		
		this.tablaamortidetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaamortidetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaAmortiDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Amortizacion Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTablaAmortiDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"nuevo","nuevo","Nuevo"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"duplicar","duplicar","Duplicar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"copiar","copiar","Copiar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"ver_form","ver_form","Ver"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"recargar","recargar","Recargar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,
							"cerrar","cerrar","Salir"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTablaAmortiDetalle;
			
				this.jButtonProcesarInformacionToolBarTablaAmortiDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTablaAmortiDetalle;
				
		//protected JButton jButtonModificarToolBarTablaAmortiDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTablaAmortiDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTablaAmortiDetalle=new JMenuMe("General");
		this.jmenuArchivoTablaAmortiDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesTablaAmortiDetalle=new JMenuMe("Acciones");
		this.jmenuDatosTablaAmortiDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaAmortiDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaAmortiDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaAmortiDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTablaAmortiDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTablaAmortiDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTablaAmortiDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTablaAmortiDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTablaAmortiDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTablaAmortiDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTablaAmortiDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAmortiDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAmortiDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTablaAmortiDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTablaAmortiDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTablaAmortiDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTablaAmortiDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTablaAmortiDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTablaAmortiDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaAmortiDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaAmortiDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaAmortiDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTablaAmortiDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTablaAmortiDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTablaAmortiDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTablaAmortiDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTablaAmortiDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTablaAmortiDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTablaAmortiDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTablaAmortiDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTablaAmortiDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTablaAmortiDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTablaAmortiDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTablaAmortiDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTablaAmortiDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTablaAmortiDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTablaAmortiDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaAmortiDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaAmortiDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaAmortiDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTablaAmortiDetalle.add(this.jMenuItemCerrarTablaAmortiDetalle);
			
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemNuevoTablaAmortiDetalle);
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle);
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemNuevoRelacionesTablaAmortiDetalle);
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle);		
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemDuplicarTablaAmortiDetalle);		
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemCopiarTablaAmortiDetalle);		
			this.jmenuAccionesTablaAmortiDetalle.add(this.jMenuItemVerFormTablaAmortiDetalle);		
			
			this.jmenuDatosTablaAmortiDetalle.add(this.jMenuItemRecargarInformacionTablaAmortiDetalle);				
			this.jmenuDatosTablaAmortiDetalle.add(this.jMenuItemAnterioresTablaAmortiDetalle);				
			this.jmenuDatosTablaAmortiDetalle.add(this.jMenuItemSiguientesTablaAmortiDetalle);				
			this.jmenuDatosTablaAmortiDetalle.add(this.jMenuItemAbrirOrderByTablaAmortiDetalle);				
			this.jmenuDatosTablaAmortiDetalle.add(this.jMenuItemMostrarOcultarTablaAmortiDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTablaAmortiDetalle.add(this.jMenuItemGuardarCambiosTablaAmortiDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTablaAmortiDetalle.add(this.jmenuArchivoTablaAmortiDetalle);		
			this.jmenuBarTablaAmortiDetalle.add(this.jmenuAccionesTablaAmortiDetalle);		
			this.jmenuBarTablaAmortiDetalle.add(this.jmenuDatosTablaAmortiDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTablaAmortiDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTablaAmortiDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFacturaTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaTablaAmortiDetalle.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaTablaAmortiDetalle= new JButtonMe();
		this.jButtonFK_IdFacturaTablaAmortiDetalle.setText("Buscar");
		this.jButtonFK_IdFacturaTablaAmortiDetalle.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaTablaAmortiDetalle,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle = new JLabelMe();
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle.setText("Factura :");
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.setFocusable(false);

		this.jPanelFK_IdTasaTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTasaTablaAmortiDetalle.setToolTipText("Buscar Por Tasa ");
		this.jButtonFK_IdTasaTablaAmortiDetalle= new JButtonMe();
		this.jButtonFK_IdTasaTablaAmortiDetalle.setText("Buscar");
		this.jButtonFK_IdTasaTablaAmortiDetalle.setToolTipText("Buscar Por Tasa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTasaTablaAmortiDetalle,"buscar_button","Buscar Por Tasa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTasaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle = new JLabelMe();
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle.setText("Tasa :");
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle.setToolTipText("Tasa");
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tasaFK_IdTasaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tasaFK_IdTasaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle.setToolTipText("Buscar Por Tipo Intervalo ");
		this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle= new JButtonMe();
		this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle.setText("Buscar");
		this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle.setToolTipText("Buscar Por Tipo Intervalo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle,"buscar_button","Buscar Por Tipo Intervalo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle = new JLabelMe();
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setText("Tipo Intervalo :");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setToolTipText("Tipo Intervalo");
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTablaAmortiDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasTablaAmortiDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaAmortiDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaAmortiDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTablaAmortiDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTablaAmortiDetalle = new TablaAmortiDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tabla Amortizacion Detalle DATOS");
			this.jInternalFrameDetalleFormTablaAmortiDetalle = new TablaAmortiDetalleDetalleFormJInternalFrame(jDesktopPane,this.tablaamortidetalleSessionBean.getConGuardarRelaciones(),this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTablaAmortiDetalle = null;//new TablaAmortiDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaAmortiDetalle= new GridBagLayout();
		
		
		this.jTableDatosTablaAmortiDetalle = new JTableMe();      
		
		String sToolTipTablaAmortiDetalle="";
		sToolTipTablaAmortiDetalle=TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaAmortiDetalle+="(Facturacion.TablaAmortiDetalle)";
		}
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaAmortiDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTablaAmortiDetalle.setToolTipText(sToolTipTablaAmortiDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTablaAmortiDetalle);
		this.jTableDatosTablaAmortiDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosTablaAmortiDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTablaAmortiDetalle.setRowSelectionAllowed(true);
		this.jTableDatosTablaAmortiDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTablaAmortiDetalle = new JButtonMe();
		this.jButtonDuplicarTablaAmortiDetalle = new JButtonMe();
		this.jButtonCopiarTablaAmortiDetalle = new JButtonMe();
		this.jButtonVerFormTablaAmortiDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesTablaAmortiDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle = new JButtonMe();
		this.jButtonCerrarTablaAmortiDetalle = new JButtonMe();
		
		this.jScrollPanelDatosTablaAmortiDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralTablaAmortiDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Amortizacion Detalle";
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaAmortiDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaAmortiDetalle.setToolTipText("Acciones");
        this.jPanelAccionesTablaAmortiDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTablaAmortiDetalle=new ReporteDinamicoJInternalFrame(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTablaAmortiDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTablaAmortiDetalle=new ImportacionJInternalFrame(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTablaAmortiDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTablaAmortiDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByTablaAmortiDetalle.setText("Orden");
		this.jButtonAbrirOrderByTablaAmortiDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaAmortiDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaAmortiDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmortiDetalle,false,this);
			
			//this.cargarOrderByTablaAmortiDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaAmortiDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmortiDetalle,true,this);
			
			//this.cargarOrderByTablaAmortiDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTablaAmortiDetalle.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosTablaAmortiDetalle.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosTablaAmortiDetalle.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosTablaAmortiDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaAmortiDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaAmortiDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTablaAmortiDetalle.setText("Nuevo");
		this.jButtonDuplicarTablaAmortiDetalle.setText("Duplicar");
		this.jButtonCopiarTablaAmortiDetalle.setText("Copiar");
		this.jButtonVerFormTablaAmortiDetalle.setText("Ver");
		this.jButtonNuevoRelacionesTablaAmortiDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setText("Guardar");
		this.jButtonCerrarTablaAmortiDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaAmortiDetalle,"nuevo_button","Nuevo",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTablaAmortiDetalle,"duplicar_button","Duplicar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTablaAmortiDetalle,"copiar_button","Copiar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTablaAmortiDetalle,"ver_form","Ver",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTablaAmortiDetalle,"nuevorelaciones_button","Nuevo Rel",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaAmortiDetalle,"guardarcambiostabla_button","Guardar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaAmortiDetalle,"cerrar_button","Salir",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTablaAmortiDetalle.setToolTipText("Nuevo"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTablaAmortiDetalle.setToolTipText("Duplicar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTablaAmortiDetalle.setToolTipText("Copiar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTablaAmortiDetalle.setToolTipText("Ver"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTablaAmortiDetalle.setToolTipText("Nuevo Rel"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setToolTipText("Guardar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaAmortiDetalle.setToolTipText("Salir"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaAmortiDetalle";
		inputMap = this.jButtonNuevoTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaAmortiDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaAmortiDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarTablaAmortiDetalle";
		inputMap = this.jButtonDuplicarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTablaAmortiDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTablaAmortiDetalle"));
		
		//COPIAR
		sMapKey = "CopiarTablaAmortiDetalle";
		inputMap = this.jButtonCopiarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTablaAmortiDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTablaAmortiDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormTablaAmortiDetalle";
		inputMap = this.jButtonVerFormTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTablaAmortiDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTablaAmortiDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTablaAmortiDetalle";
		inputMap = this.jButtonNuevoRelacionesTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTablaAmortiDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTablaAmortiDetalle";
		inputMap = this.jButtonModificarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTablaAmortiDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTablaAmortiDetalle";
		inputMap = this.jButtonCerrarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaAmortiDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaAmortiDetalle";
		inputMap = this.jButtonGuardarCambiosTablaTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaAmortiDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTablaAmortiDetalle.setName("jPanelParametrosReportesTablaAmortiDetalle"); 
		
		this.jPanelParametrosReportesAccionesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTablaAmortiDetalle.setName("jPanelParametrosReportesAccionesTablaAmortiDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTablaAmortiDetalle = new JButtonMe();
		this.jButtonRecargarInformacionTablaAmortiDetalle.setText("Recargar");
		this.jButtonRecargarInformacionTablaAmortiDetalle.setToolTipText("Recargar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTablaAmortiDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTablaAmortiDetalle = new JButtonMe();
		this.jButtonProcesarInformacionTablaAmortiDetalle.setText("Procesar");
		this.jButtonProcesarInformacionTablaAmortiDetalle.setToolTipText("Procesar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTablaAmortiDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionTablaAmortiDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaAmortiDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaAmortiDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesTablaAmortiDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTablaAmortiDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionTablaAmortiDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTablaAmortiDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesTablaAmortiDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaAmortiDetalle.setText("Accion");
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTablaAmortiDetalle = new JLabelMe();
		
		this.jLabelAccionesTablaAmortiDetalle.setText("Acciones");		
		this.jLabelAccionesTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTablaAmortiDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTablaAmortiDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTablaAmortiDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTablaAmortiDetalle = new JButtonMe();
		//this.jButtonAnterioresTablaAmortiDetalle.setText("<<");
        this.jButtonAnterioresTablaAmortiDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTablaAmortiDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTablaAmortiDetalle = new JButtonMe();
		//this.jButtonSiguientesTablaAmortiDetalle.setText(">>");
        this.jButtonSiguientesTablaAmortiDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTablaAmortiDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTablaAmortiDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTablaAmortiDetalle,"nuevoguardarcambios_button","Nue",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTablaAmortiDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTablaAmortiDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTablaAmortiDetalle";
		inputMap = this.jButtonRecargarInformacionTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTablaAmortiDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTablaAmortiDetalle";
		inputMap = this.jButtonSiguientesTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTablaAmortiDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTablaAmortiDetalle";
		inputMap = this.jButtonAnterioresTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTablaAmortiDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTablaAmortiDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTablaAmortiDetalle.setMinimumSize(new Dimension(this.getWidth(),TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaAmortiDetalle.setMaximumSize(new Dimension(this.getWidth(),TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaAmortiDetalle.setPreferredSize(new Dimension(this.getWidth(),TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTablaAmortiDetalle = new GridBagLayout();

			this.jPanelPaginacionTablaAmortiDetalle.setLayout(gridaBagLayoutPaginacionTablaAmortiDetalle);						
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonAnterioresTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					
						
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
			
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonNuevoGuardarCambiosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
						
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonSiguientesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonNuevoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
						
			
			
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
				this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
				this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonGuardarCambiosTablaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			}
			
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonDuplicarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonCopiarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonVerFormTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 1;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTablaAmortiDetalle.add(this.jButtonCerrarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		
		this.jButtonRecargarInformacionTablaAmortiDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaAmortiDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaAmortiDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTablaAmortiDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaAmortiDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaAmortiDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTablaAmortiDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaAmortiDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaAmortiDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTablaAmortiDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaAmortiDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaAmortiDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTablaAmortiDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTablaAmortiDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TablaAmortiDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TablaAmortiDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TablaAmortiDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TablaAmortiDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTablaAmortiDetalle.setLayout(gridaBagParametrosReportesTablaAmortiDetalle);
			this.jPanelParametrosReportesAccionesTablaAmortiDetalle.setLayout(gridaBagParametrosReportesAccionesTablaAmortiDetalle);
			
			
			this.jPanelParametrosAuxiliar1TablaAmortiDetalle.setLayout(gridaBagParametrosAuxiliar1TablaAmortiDetalle);
			this.jPanelParametrosAuxiliar2TablaAmortiDetalle.setLayout(gridaBagParametrosAuxiliar2TablaAmortiDetalle);
			this.jPanelParametrosAuxiliar3TablaAmortiDetalle.setLayout(gridaBagParametrosAuxiliar3TablaAmortiDetalle);
			this.jPanelParametrosAuxiliar4TablaAmortiDetalle.setLayout(gridaBagParametrosAuxiliar4TablaAmortiDetalle);
			//this.jPanelParametrosAuxiliar5TablaAmortiDetalle.setLayout(gridaBagParametrosAuxiliar2TablaAmortiDetalle);			
			
			
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jButtonRecargarInformacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmortiDetalle.add(this.jComboBoxTiposPaginacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmortiDetalle.add(this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmortiDetalle.add(this.jComboBoxTiposArchivosReportesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jPanelParametrosAuxiliar1TablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TablaAmortiDetalle.add(this.jComboBoxTiposReportesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);																		
			
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TablaAmortiDetalle.add(this.jComboBoxTiposGraficosReportesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jPanelParametrosAuxiliar4TablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jComboBoxTiposReportesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jCheckBoxGenerarReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jPanelParametrosAuxiliar2TablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jLabelAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
				this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jButtonAbrirOrderByTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jComboBoxTiposSeleccionarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			
			
			/*
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jCheckBoxSeleccionarTodosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jCheckBoxConGraficoReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmortiDetalle.add(this.jCheckBoxSeleccionarTodosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);															
				
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmortiDetalle.add(this.jCheckBoxSeleccionadosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);															
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmortiDetalle.add(this.jCheckBoxConGraficoReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jPanelParametrosAuxiliar3TablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jComboBoxTiposAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
	
				
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmortiDetalle.add(this.jTextFieldValorCampoGeneralTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTablaAmortiDetalle = new GridBagLayout();

			this.jScrollPanelDatosTablaAmortiDetalle.setLayout(gridaBagLayoutDatosTablaAmortiDetalle);
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
			
			this.jScrollPanelDatosTablaAmortiDetalle.add(this.jTableDatosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTablaAmortiDetalle.setViewportView(this.jTableDatosTablaAmortiDetalle);
		this.jTableDatosTablaAmortiDetalle.setFillsViewportHeight(true);
		this.jTableDatosTablaAmortiDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTablaAmortiDetalle= new GridBagLayout();
		this.jPanelAccionesTablaAmortiDetalle.setLayout(gridaBagLayoutAccionesTablaAmortiDetalle);
		
		
		/*	
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
			
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonNuevoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFacturaTablaAmortiDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaTablaAmortiDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaTablaAmortiDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaTablaAmortiDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaTablaAmortiDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaTablaAmortiDetalle.setLayout(gridaBagLayoutFK_IdFacturaTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		jPanelFK_IdFacturaTablaAmortiDetalle.add(jLabelid_facturaFK_IdFacturaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 1;
		jPanelFK_IdFacturaTablaAmortiDetalle.add(jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);


		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		jPanelFK_IdFacturaTablaAmortiDetalle.add(this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 1;
		gridBagConstraintsTablaAmortiDetalle.gridx =1;
		jPanelFK_IdFacturaTablaAmortiDetalle.add(jButtonFK_IdFacturaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		jTabbedPaneBusquedasTablaAmortiDetalle.addTab("1.-Por Factura ", jPanelFK_IdFacturaTablaAmortiDetalle);
		jTabbedPaneBusquedasTablaAmortiDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTasaTablaAmortiDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdTasaTablaAmortiDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTasaTablaAmortiDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTasaTablaAmortiDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTasaTablaAmortiDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTasaTablaAmortiDetalle.setLayout(gridaBagLayoutFK_IdTasaTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		jPanelFK_IdTasaTablaAmortiDetalle.add(jLabelid_tasaFK_IdTasaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 1;
		jPanelFK_IdTasaTablaAmortiDetalle.add(jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 1;
		gridBagConstraintsTablaAmortiDetalle.gridx =1;
		jPanelFK_IdTasaTablaAmortiDetalle.add(jButtonFK_IdTasaTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		jTabbedPaneBusquedasTablaAmortiDetalle.addTab("2.-Por Tasa ", jPanelFK_IdTasaTablaAmortiDetalle);
		jTabbedPaneBusquedasTablaAmortiDetalle.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIntervaloTablaAmortiDetalle.setLayout(gridaBagLayoutFK_IdTipoIntervaloTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		jPanelFK_IdTipoIntervaloTablaAmortiDetalle.add(jLabelid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		gridBagConstraintsTablaAmortiDetalle.gridx = 1;
		jPanelFK_IdTipoIntervaloTablaAmortiDetalle.add(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmortiDetalle.gridy = 1;
		gridBagConstraintsTablaAmortiDetalle.gridx =1;
		jPanelFK_IdTipoIntervaloTablaAmortiDetalle.add(jButtonFK_IdTipoIntervaloTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);

		jTabbedPaneBusquedasTablaAmortiDetalle.addTab("3.-Por Tipo Intervalo ", jPanelFK_IdTipoIntervaloTablaAmortiDetalle);
		jTabbedPaneBusquedasTablaAmortiDetalle.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaAmortiDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();						
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;		
			//this.gridBagConstraintsTablaAmortiDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaAmortiDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;		
		//this.gridBagConstraintsTablaAmortiDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTablaAmortiDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;		
			this.gridBagConstraintsTablaAmortiDetalle.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTablaAmortiDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);								
		
		
		/*
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		*/		
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaAmortiDetalle.gridx =0;
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaAmortiDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
				
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTablaAmortiDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaAmortiDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosTablaAmortiDetalle.setLayout(gridaBagLayoutBusquedasParametrosTablaAmortiDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTablaAmortiDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTablaAmortiDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTablaAmortiDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTablaAmortiDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTablaAmortiDetalle.setName("jPanelReporteDinamicoTablaAmortiDetalle"); 
		
		this.jPanelReporteDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTablaAmortiDetalle.setLayout(gridaBagLayoutReporteDinamicoTablaAmortiDetalle);
		
		
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaAmortiDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTablaAmortiDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteTablaAmortiDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelColumnasSelectReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTablaAmortiDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteTablaAmortiDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTablaAmortiDetalle=new JScrollPane(this.jListColumnasSelectReporteTablaAmortiDetalle);
			
			this.jScrollColumnasSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jListColumnasSelectReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jScrollColumnasSelectReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTablaAmortiDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteTablaAmortiDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTablaAmortiDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteTablaAmortiDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTablaAmortiDetalle=new JScrollPane(this.jListRelacionesSelectReporteTablaAmortiDetalle);
			
			this.jScrollRelacionesSelectReporteTablaAmortiDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaAmortiDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaAmortiDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoTablaAmortiDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTablaAmortiDetalle = new JLabelMe();

		this.jLabelConGraficoDinamicoTablaAmortiDetalle.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelConGraficoDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jCheckBoxConGraficoDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelColumnaCategoriaGraficoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTablaAmortiDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaValorTablaAmortiDetalle.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelColumnaCategoriaValorTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jComboBoxColumnaCategoriaValorTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTablaAmortiDetalle = new JLabelMe();

		this.jLabelColumnasValoresGraficoTablaAmortiDetalle.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelColumnasValoresGraficoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTablaAmortiDetalle = new JList<Reporte>();
		this.jListColumnasValoresGraficoTablaAmortiDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTablaAmortiDetalle.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTablaAmortiDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaAmortiDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaAmortiDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTablaAmortiDetalle=new JScrollPane(this.jListColumnasValoresGraficoTablaAmortiDetalle);
			
			this.jScrollColumnasValoresGraficoTablaAmortiDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaAmortiDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaAmortiDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jListColumnasSelectReporteTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jScrollColumnasValoresGraficoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelTiposGraficosReportesDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaAmortiDetalle.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jComboBoxTiposGraficosReportesDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelGenerarExcelReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle.setToolTipText("Generar EXCEL"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jComboBoxTiposReportesDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jLabelTiposArchivoReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTablaAmortiDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTablaAmortiDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTablaAmortiDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTablaAmortiDetalle.setToolTipText("Generar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jButtonGenerarReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTablaAmortiDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTablaAmortiDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTablaAmortiDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTablaAmortiDetalle.setToolTipText("Cancelar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmortiDetalle.add(this.jButtonCerrarReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTablaAmortiDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle= new JScrollPane(jPanelReporteDinamicoTablaAmortiDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTablaAmortiDetalle);
		this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTablaAmortiDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTablaAmortiDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTablaAmortiDetalle.setName("jPanelImportacionTablaAmortiDetalle"); 
		
		this.jPanelImportacionTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTablaAmortiDetalle.setLayout(gridaBagLayoutImportacionTablaAmortiDetalle);
		
		
		this.jInternalFrameImportacionTablaAmortiDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTablaAmortiDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTablaAmortiDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaAmortiDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTablaAmortiDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaAmortiDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTablaAmortiDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaAmortiDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaAmortiDetalle.setResizable(true);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setClosable(true);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTablaAmortiDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaAmortiDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTablaAmortiDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaAmortiDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaAmortiDetalle.setResizable(true);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setClosable(true);
	    this.jInternalFrameImportacionTablaAmortiDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTablaAmortiDetalle = new JLabelMe();

		this.jLabelArchivoImportacionTablaAmortiDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaAmortiDetalle.add(this.jLabelArchivoImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTablaAmortiDetalle = new JFileChooser();		
		this.jFileChooserImportacionTablaAmortiDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTablaAmortiDetalle = new JButtonMe();
		this.jButtonAbrirImportacionTablaAmortiDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTablaAmortiDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTablaAmortiDetalle.setToolTipText("Generar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmortiDetalle.add(this.jButtonAbrirImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTablaAmortiDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionTablaAmortiDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaAmortiDetalle.add(this.jLabelPathArchivoImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTablaAmortiDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTablaAmortiDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaAmortiDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaAmortiDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmortiDetalle.add(this.jTextFieldPathArchivoImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTablaAmortiDetalle = new JButtonMe();
		this.jButtonGenerarImportacionTablaAmortiDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTablaAmortiDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTablaAmortiDetalle.setToolTipText("Generar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmortiDetalle.add(this.jButtonGenerarImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTablaAmortiDetalle = new JButtonMe();
		this.jButtonCerrarImportacionTablaAmortiDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTablaAmortiDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTablaAmortiDetalle.setToolTipText("Cancelar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmortiDetalle.add(this.jButtonCerrarImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTablaAmortiDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionTablaAmortiDetalle= new JScrollPane(jPanelImportacionTablaAmortiDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTablaAmortiDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTablaAmortiDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTablaAmortiDetalle);
		this.jInternalFrameImportacionTablaAmortiDetalle.getContentPane().add(this.jScrollPanelImportacionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTablaAmortiDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTablaAmortiDetalle = new JButtonMe();
			this.jButtonAbrirOrderByTablaAmortiDetalle.setText("Orden");
			this.jButtonAbrirOrderByTablaAmortiDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaAmortiDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTablaAmortiDetalle";
			inputMap = this.jButtonAbrirOrderByTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTablaAmortiDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByTablaAmortiDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTablaAmortiDetalle.setName("jPanelOrderByTablaAmortiDetalle"); 
			
			this.jPanelOrderByTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTablaAmortiDetalle.setLayout(gridaBagLayoutOrderByTablaAmortiDetalle);
			
			
			this.jTableDatosTablaAmortiDetalleOrderBy = new JTableMe();        
			this.jTableDatosTablaAmortiDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTablaAmortiDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTablaAmortiDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTablaAmortiDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTablaAmortiDetalleOrderBy.setViewportView(this.jTableDatosTablaAmortiDetalleOrderBy);
			this.jTableDatosTablaAmortiDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTablaAmortiDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTablaAmortiDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTablaAmortiDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTablaAmortiDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTablaAmortiDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTablaAmortiDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTablaAmortiDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTablaAmortiDetalle.setTitle("Orden");
			this.jInternalFrameOrderByTablaAmortiDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTablaAmortiDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTablaAmortiDetalle.setResizable(true);
			this.jInternalFrameOrderByTablaAmortiDetalle.setClosable(true);
			this.jInternalFrameOrderByTablaAmortiDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTablaAmortiDetalle.ipady =150;
				
			this.jPanelOrderByTablaAmortiDetalle.add(jScrollPanelDatosTablaAmortiDetalleOrderBy, this.gridBagConstraintsTablaAmortiDetalle);//this.jTableDatosTablaAmortiDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTablaAmortiDetalle = new JButtonMe();
			this.jButtonCerrarOrderByTablaAmortiDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTablaAmortiDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTablaAmortiDetalle.setToolTipText("Cancelar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTablaAmortiDetalle.add(this.jButtonCerrarOrderByTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTablaAmortiDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByTablaAmortiDetalle= new JScrollPane(jPanelOrderByTablaAmortiDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTablaAmortiDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTablaAmortiDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTablaAmortiDetalle);
			
			this.jInternalFrameOrderByTablaAmortiDetalle.getContentPane().add(this.jScrollPanelOrderByTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
		
		} else {
			this.jButtonAbrirOrderByTablaAmortiDetalle = new JButtonMe();
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
		if(this.conMaximoRelaciones 
			&& this.tablaamortidetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTablaAmortiDetalle.getRowHeight();//TablaAmortiDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.isSelected()) {
					iHeightTable=TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaAmortiDetalle.isSelected()) {
					iHeightTable=TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaAmortiDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTablaAmortiDetalle!=null && this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTablaAmortiDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTablaAmortiDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTablaAmortiDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tablaamortidetalleLogic.getTablaAmortiDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortidetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TablaAmortiDetalle> TraerTablaAmortiDetalleBeans(List<TablaAmortiDetalle> tablaamortidetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetalles) {
					
				if(!(TablaAmortiDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TablaAmortiDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tablaamortidetalle.setsDetalleGeneralEntityReporte(TablaAmortiDetalleConstantesFunciones.getTablaAmortiDetalleDescripcion(tablaamortidetalle));
										
						
					
						
					
				} else  {
							
					//tablaamortidetalle.setsDetalleGeneralEntityReporte(tablaamortidetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//tablaamortidetallebeans.add(tablaamortidetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tablaamortidetalles;
    }
	//PARA REPORTES FIN
}
