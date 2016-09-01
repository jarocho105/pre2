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
import com.bydan.erp.facturacion.util.TablaAmortiConstantesFunciones;

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
public class TablaAmortiJInternalFrame extends TablaAmortiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTablaAmorti;
	
	protected JMenuBar jmenuBarTablaAmorti;
	
	protected JMenu jmenuTablaAmorti;
	protected JMenu jmenuDatosTablaAmorti;
	protected JMenu jmenuArchivoTablaAmorti;
	protected JMenu jmenuAccionesTablaAmorti;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaAmorti;	
	protected GridBagConstraints gridBagConstraintsTablaAmorti;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TablaAmortiDetalleFormJInternalFrame jInternalFrameDetalleFormTablaAmorti;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTablaAmorti;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTablaAmorti;	
	
	
	
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

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public TablaAmortiSessionBean tablaamortiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TasaSessionBean tasaSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TablaAmorti> tablaamortis;		
	public List<TablaAmorti> tablaamortisEliminados;	
	public List<TablaAmorti> tablaamortisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTablaAmorti;		
	protected JButton jButtonAbrirOrderByTablaAmorti;
	
	
	//protected JPanel jPanelOrderByTablaAmorti;
	//public JScrollPane jScrollPanelOrderByTablaAmorti;	
	//protected JButton jButtonCerrarOrderByTablaAmorti;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TablaAmortiLogic tablaamortiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTablaAmorti;
	public JScrollPane jScrollPanelDatosEdicionTablaAmorti;
	public JScrollPane jScrollPanelDatosGeneralTablaAmorti;
    
	
	
	//public JScrollPane jScrollPanelDatosTablaAmortiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTablaAmorti;
	//public JScrollPane jScrollPanelImportacionTablaAmorti;
	
	
	
	protected JPanel jPanelAccionesTablaAmorti;
	
    protected JPanel jPanelPaginacionTablaAmorti;
    protected JPanel jPanelParametrosReportesTablaAmorti;
	protected JPanel jPanelParametrosReportesAccionesTablaAmorti;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TablaAmorti;
	protected JPanel jPanelParametrosAuxiliar2TablaAmorti;
	protected JPanel jPanelParametrosAuxiliar3TablaAmorti;
	protected JPanel jPanelParametrosAuxiliar4TablaAmorti;
	//protected JPanel jPanelParametrosAuxiliar5TablaAmorti;
	
	
	
	//protected JPanel jPanelReporteDinamicoTablaAmorti;
	//protected JPanel jPanelImportacionTablaAmorti;
	
	
	public JTable jTableDatosTablaAmorti;
	
	
	
	//public JTable jTableDatosTablaAmortiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTablaAmorti;
	protected JButton jButtonDuplicarTablaAmorti;
	protected JButton jButtonCopiarTablaAmorti;
	protected JButton jButtonVerFormTablaAmorti;
	protected JButton jButtonNuevoRelacionesTablaAmorti;
	protected JButton jButtonModificarTablaAmorti;
	
    protected JButton jButtonGuardarCambiosTablaTablaAmorti;
	protected JButton jButtonCerrarTablaAmorti;
	
	
	protected JButton jButtonRecargarInformacionTablaAmorti;
	protected JButton jButtonProcesarInformacionTablaAmorti;
	
	
	protected JButton jButtonAnterioresTablaAmorti;
	protected JButton jButtonSiguientesTablaAmorti;
	protected JButton jButtonNuevoGuardarCambiosTablaAmorti;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTablaAmorti;
	//protected JButton jButtonCerrarReporteDinamicoTablaAmorti;
	//protected JButton jButtonGenerarExcelReporteDinamicoTablaAmorti;	
	
	
	
	//protected JButton jButtonAbrirImportacionTablaAmorti;
	//protected JButton jButtonGenerarImportacionTablaAmorti;
	//protected JButton jButtonCerrarImportacionTablaAmorti;
	//protected JFileChooser jFileChooserImportacionTablaAmorti;
	//protected File fileImportacionTablaAmorti;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaAmorti;
	protected JButton jButtonDuplicarToolBarTablaAmorti;
	protected JButton jButtonNuevoRelacionesToolBarTablaAmorti;
	
	
	public JButton jButtonGuardarCambiosToolBarTablaAmorti;
	protected JButton jButtonCopiarToolBarTablaAmorti;
	protected JButton jButtonVerFormToolBarTablaAmorti;
	public JButton jButtonGuardarCambiosTablaToolBarTablaAmorti;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaAmorti;
	protected JButton jButtonCerrarToolBarTablaAmorti;
	
	protected JButton jButtonRecargarInformacionToolBarTablaAmorti;
	protected JButton jButtonProcesarInformacionToolBarTablaAmorti;
	protected JButton jButtonAnterioresToolBarTablaAmorti;
	protected JButton jButtonSiguientesToolBarTablaAmorti;
	protected JButton jButtonNuevoGuardarCambiosToolBarTablaAmorti;
	protected JButton jButtonAbrirOrderByToolBarTablaAmorti;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaAmorti;
	protected JMenuItem jMenuItemDuplicarTablaAmorti;
	protected JMenuItem jMenuItemNuevoRelacionesTablaAmorti;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTablaAmorti;
	protected JMenuItem jMenuItemCopiarTablaAmorti;
	protected JMenuItem jMenuItemVerFormTablaAmorti;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaAmorti;
	protected JMenuItem jMenuItemCerrarTablaAmorti;
	protected JMenuItem jMenuItemDetalleCerrarTablaAmorti;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTablaAmorti;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaAmorti;
	
	protected JMenuItem jMenuItemRecargarInformacionTablaAmorti;
	protected JMenuItem jMenuItemProcesarInformacionTablaAmorti;
	protected JMenuItem jMenuItemAnterioresTablaAmorti;
	protected JMenuItem jMenuItemSiguientesTablaAmorti;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaAmorti;
	protected JMenuItem jMenuItemAbrirOrderByTablaAmorti;
	protected JMenuItem jMenuItemMostrarOcultarTablaAmorti;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaAmorti;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTablaAmorti;
	protected JCheckBox jCheckBoxSeleccionadosTablaAmorti;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTablaAmorti;
	protected JCheckBox jCheckBoxConGraficoReporteTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTablaAmorti;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTablaAmorti;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTablaAmorti;
	protected JTextField jTextFieldValorCampoGeneralTablaAmorti;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTablaAmorti;
	//public JList<Reporte> jListColumnasSelectReporteTablaAmorti;
	//public JScrollPane jScrollColumnasSelectReporteTablaAmorti;
	
	//public JLabel jLabelRelacionesSelectReporteTablaAmorti;
	//public JList<Reporte> jListRelacionesSelectReporteTablaAmorti;
	//public JScrollPane jScrollRelacionesSelectReporteTablaAmorti;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTablaAmorti;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTablaAmorti;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTablaAmorti;
	//public JLabel jLabelTiposArchivoReporteDinamicoTablaAmorti;
	
		
	//public JLabel jLabelArchivoImportacionTablaAmorti;	
	//public JLabel jLabelPathArchivoImportacionTablaAmorti;
	//protected JTextField jTextFieldPathArchivoImportacionTablaAmorti;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTablaAmorti;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTablaAmorti;
	
	//public JLabel jLabelColumnaCategoriaValorTablaAmorti;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTablaAmorti;
	
	//public JLabel jLabelColumnasValoresGraficoTablaAmorti;
	//public JList<Reporte> jListColumnasValoresGraficoTablaAmorti;
	//public JScrollPane jScrollColumnasValoresGraficoTablaAmorti;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTablaAmorti;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTablaAmorti;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTablaAmorti;
	public JPanel jPanelFK_IdFacturaTablaAmorti;
	public JButton jButtonFK_IdFacturaTablaAmorti;
	public JPanel jPanelFK_IdTasaTablaAmorti;
	public JButton jButtonFK_IdTasaTablaAmorti;
	
	public JPanel jPanelid_facturaFK_IdFacturaTablaAmorti;
	public JLabel jLabelid_facturaFK_IdFacturaTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaTablaAmorti;
	public JButton jButtonid_facturaFK_IdFacturaTablaAmorti= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTablaAmortiBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaTablaAmorti;
	
	public JPanel jPanelid_tasaFK_IdTasaTablaAmorti;
	public JLabel jLabelid_tasaFK_IdTasaTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tasaFK_IdTasaTablaAmorti;
	public JButton jButtonid_tasaFK_IdTasaTablaAmorti= new JButtonMe();
	public JButton jButtonid_tasaFK_IdTasaTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_tasaFK_IdTasaTablaAmortiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=264;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TablaAmortiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTablaAmorti)	{
		this.jButtonRecargarInformacionTablaAmorti = jButtonRecargarInformacionTablaAmorti;
	}
	
	public JButton getjButtonProcesarInformacionTablaAmorti() {
		return this.jButtonProcesarInformacionTablaAmorti;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaAmorti)	{
		this.jButtonProcesarInformacionTablaAmorti = jButtonProcesarInformacionTablaAmorti;
	}
	
	
	public JButton getjButtonRecargarInformacionTablaAmorti() {
		return this.jButtonRecargarInformacionTablaAmorti;
	}
	
	
	public List<TablaAmorti> gettablaamortis() {
		return this.tablaamortis;
	}

	public void settablaamortis(List<TablaAmorti> tablaamortis) {
		this.tablaamortis = tablaamortis;
	}
	
	public List<TablaAmorti> gettablaamortisAux() {
		return this.tablaamortisAux;
	}

	public void settablaamortisAux(List<TablaAmorti> tablaamortisAux) {
		this.tablaamortisAux = tablaamortisAux;
	}
	
	public List<TablaAmorti> gettablaamortisEliminados() {
		return this.tablaamortisEliminados;
	}

	public void setTablaAmortisEliminados(List<TablaAmorti> tablaamortisEliminados) {
		this.tablaamortisEliminados = tablaamortisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTablaAmorti() {
		return jComboBoxTiposSeleccionarTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTablaAmorti(
			JComboBox jComboBoxTiposSeleccionarTablaAmorti) {
		this.jComboBoxTiposSeleccionarTablaAmorti = jComboBoxTiposSeleccionarTablaAmorti;
	}
	
	public void setBorderResaltarTiposSeleccionarTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTablaAmorti .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTablaAmorti() {
		return jTextFieldValorCampoGeneralTablaAmorti;
	}

	public void setjTextFieldValorCampoGeneralTablaAmorti(
			JTextField jTextFieldValorCampoGeneralTablaAmorti) {
		this.jTextFieldValorCampoGeneralTablaAmorti = jTextFieldValorCampoGeneralTablaAmorti;
	}

	public void setBorderResaltarValorCampoGeneralTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTablaAmorti .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTablaAmorti() {
		return this.jCheckBoxSeleccionarTodosTablaAmorti;
	}

	public void setjCheckBoxSeleccionarTodosTablaAmorti(
			JCheckBox jCheckBoxSeleccionarTodosTablaAmorti) {
		this.jCheckBoxSeleccionarTodosTablaAmorti = jCheckBoxSeleccionarTodosTablaAmorti;
	}

	public void setBorderResaltarSeleccionarTodosTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTablaAmorti .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTablaAmorti() {
		return this.jCheckBoxSeleccionadosTablaAmorti;
	}

	public void setjCheckBoxSeleccionadosTablaAmorti(
			JCheckBox jCheckBoxSeleccionadosTablaAmorti) {
		this.jCheckBoxSeleccionadosTablaAmorti = jCheckBoxSeleccionadosTablaAmorti;
	}
	
	public void setBorderResaltarSeleccionadosTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTablaAmorti .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTablaAmorti() {
		return this.jComboBoxTiposArchivosReportesTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTablaAmorti(
			JComboBox jComboBoxTiposArchivosReportesTablaAmorti) {
		this.jComboBoxTiposArchivosReportesTablaAmorti = jComboBoxTiposArchivosReportesTablaAmorti;
	}

	public void setBorderResaltarTiposArchivosReportesTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTablaAmorti() {
		return this.jComboBoxTiposReportesTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTablaAmorti(
			JComboBox jComboBoxTiposReportesTablaAmorti) {
		this.jComboBoxTiposReportesTablaAmorti = jComboBoxTiposReportesTablaAmorti;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTablaAmorti() {
	//	return jComboBoxTiposReportesDinamicoTablaAmorti;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTablaAmorti(
	//		JComboBox jComboBoxTiposReportesDinamicoTablaAmorti) {
	//	this.jComboBoxTiposReportesDinamicoTablaAmorti = jComboBoxTiposReportesDinamicoTablaAmorti;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTablaAmorti() {
	//	return jComboBoxTiposArchivosReportesDinamicoTablaAmorti;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTablaAmorti(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTablaAmorti) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti = jComboBoxTiposArchivosReportesDinamicoTablaAmorti;
	//}
	
	public void setBorderResaltarTiposReportesTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTablaAmorti() {
		return this.jComboBoxTiposGraficosReportesTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTablaAmorti(
			JComboBox jComboBoxTiposGraficosReportesTablaAmorti) {
		this.jComboBoxTiposGraficosReportesTablaAmorti = jComboBoxTiposGraficosReportesTablaAmorti;
	}
	
	public void setBorderResaltarTiposGraficosReportesTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTablaAmorti() {
		return this.jComboBoxTiposPaginacionTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTablaAmorti(
			JComboBox jComboBoxTiposPaginacionTablaAmorti) {
		this.jComboBoxTiposPaginacionTablaAmorti = jComboBoxTiposPaginacionTablaAmorti;
	}
	
	public void setBorderResaltarTiposPaginacionTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTablaAmorti() {
		return this.jComboBoxTiposRelacionesTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaAmorti() {
		return this.jComboBoxTiposAccionesTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaAmorti(
			JComboBox jComboBoxTiposRelacionesTablaAmorti) {
		this.jComboBoxTiposRelacionesTablaAmorti = jComboBoxTiposRelacionesTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaAmorti(
			JComboBox jComboBoxTiposAccionesTablaAmorti) {
		this.jComboBoxTiposAccionesTablaAmorti = jComboBoxTiposAccionesTablaAmorti;
	}
	
	public void setBorderResaltarTiposRelacionesTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTablaAmorti .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTablaAmorti .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTablaAmorti() {
	//	return jCheckBoxConGraficoDinamicoTablaAmorti;
	//}

	//public void setjCheckBoxConGraficoDinamicoTablaAmorti(
	//		JCheckBox jCheckBoxConGraficoDinamicoTablaAmorti) {
	//	this.jCheckBoxConGraficoDinamicoTablaAmorti = jCheckBoxConGraficoDinamicoTablaAmorti;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTablaAmorti() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTablaAmorti.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTablaAmorti .setBorder(borderResaltar);		
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
		this.tablaamortiSessionBean=new TablaAmortiSessionBean();
		
		this.tablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaamortiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaAmortiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Amorti MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
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
		
		TablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTablaAmorti= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"nuevo","nuevo","Nuevo"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"duplicar","duplicar","Duplicar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"copiar","copiar","Copiar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"ver_form","ver_form","Ver"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"recargar","recargar","Recargar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTablaAmorti,this.jTtoolBarTablaAmorti,
							"cerrar","cerrar","Salir"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTablaAmorti=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTablaAmorti;
			
				this.jButtonProcesarInformacionToolBarTablaAmorti=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTablaAmorti;
				
		//protected JButton jButtonModificarToolBarTablaAmorti;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTablaAmorti=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTablaAmorti=new JMenuMe("General");
		this.jmenuArchivoTablaAmorti=new JMenuMe("Archivo");
		this.jmenuAccionesTablaAmorti=new JMenuMe("Acciones");
		this.jmenuDatosTablaAmorti=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaAmorti= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaAmorti.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaAmorti,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTablaAmorti= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTablaAmorti.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTablaAmorti,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTablaAmorti= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTablaAmorti.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTablaAmorti,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTablaAmorti= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAmorti.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAmorti,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTablaAmorti= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTablaAmorti.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTablaAmorti,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTablaAmorti= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTablaAmorti.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTablaAmorti,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTablaAmorti= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTablaAmorti.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTablaAmorti,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTablaAmorti= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTablaAmorti.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTablaAmorti,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTablaAmorti= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTablaAmorti.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTablaAmorti,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTablaAmorti= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTablaAmorti.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTablaAmorti,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTablaAmorti= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTablaAmorti.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTablaAmorti,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTablaAmorti= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTablaAmorti.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTablaAmorti,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTablaAmorti= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTablaAmorti.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTablaAmorti,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTablaAmorti= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTablaAmorti.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTablaAmorti,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTablaAmorti.add(this.jMenuItemCerrarTablaAmorti);
			
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemNuevoTablaAmorti);
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemNuevoGuardarCambiosTablaAmorti);
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemNuevoRelacionesTablaAmorti);
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemGuardarCambiosTablaTablaAmorti);		
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemDuplicarTablaAmorti);		
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemCopiarTablaAmorti);		
			this.jmenuAccionesTablaAmorti.add(this.jMenuItemVerFormTablaAmorti);		
			
			this.jmenuDatosTablaAmorti.add(this.jMenuItemRecargarInformacionTablaAmorti);				
			this.jmenuDatosTablaAmorti.add(this.jMenuItemAnterioresTablaAmorti);				
			this.jmenuDatosTablaAmorti.add(this.jMenuItemSiguientesTablaAmorti);				
			this.jmenuDatosTablaAmorti.add(this.jMenuItemAbrirOrderByTablaAmorti);				
			this.jmenuDatosTablaAmorti.add(this.jMenuItemMostrarOcultarTablaAmorti);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTablaAmorti.add(this.jMenuItemGuardarCambiosTablaAmorti);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTablaAmorti.add(this.jmenuArchivoTablaAmorti);		
			this.jmenuBarTablaAmorti.add(this.jmenuAccionesTablaAmorti);		
			this.jmenuBarTablaAmorti.add(this.jmenuDatosTablaAmorti);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTablaAmorti);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTablaAmorti() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFacturaTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaTablaAmorti.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaTablaAmorti= new JButtonMe();
		this.jButtonFK_IdFacturaTablaAmorti.setText("Buscar");
		this.jButtonFK_IdFacturaTablaAmorti.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaTablaAmorti,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaTablaAmorti = new JLabelMe();
		jLabelid_facturaFK_IdFacturaTablaAmorti.setText("Factura :");
		jLabelid_facturaFK_IdFacturaTablaAmorti.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaTablaAmorti= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.setFocusable(false);

		this.jPanelFK_IdTasaTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTasaTablaAmorti.setToolTipText("Buscar Por Tasa ");
		this.jButtonFK_IdTasaTablaAmorti= new JButtonMe();
		this.jButtonFK_IdTasaTablaAmorti.setText("Buscar");
		this.jButtonFK_IdTasaTablaAmorti.setToolTipText("Buscar Por Tasa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTasaTablaAmorti,"buscar_button","Buscar Por Tasa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTasaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tasaFK_IdTasaTablaAmorti = new JLabelMe();
		jLabelid_tasaFK_IdTasaTablaAmorti.setText("Tasa :");
		jLabelid_tasaFK_IdTasaTablaAmorti.setToolTipText("Tasa");
		jLabelid_tasaFK_IdTasaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tasaFK_IdTasaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tasaFK_IdTasaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tasaFK_IdTasaTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tasaFK_IdTasaTablaAmorti= new JComboBoxMe();
		jComboBoxid_tasaFK_IdTasaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaFK_IdTasaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaFK_IdTasaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tasaFK_IdTasaTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTablaAmorti=new JTabbedPane();


		this.jTabbedPaneBusquedasTablaAmorti.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaAmorti.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaAmorti.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTablaAmorti = new TablaAmortiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tabla Amorti DATOS");
			this.jInternalFrameDetalleFormTablaAmorti = new TablaAmortiDetalleFormJInternalFrame(jDesktopPane,this.tablaamortiSessionBean.getConGuardarRelaciones(),this.tablaamortiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTablaAmorti = null;//new TablaAmortiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaAmorti= new GridBagLayout();
		
		
		this.jTableDatosTablaAmorti = new JTableMe();      
		
		String sToolTipTablaAmorti="";
		sToolTipTablaAmorti=TablaAmortiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaAmorti+="(Facturacion.TablaAmorti)";
		}
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaAmorti+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTablaAmorti.setToolTipText(sToolTipTablaAmorti);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTablaAmorti);
		this.jTableDatosTablaAmorti.setAutoCreateRowSorter(true);
		this.jTableDatosTablaAmorti.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTablaAmorti.setRowSelectionAllowed(true);
		this.jTableDatosTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTablaAmorti = new JButtonMe();
		this.jButtonDuplicarTablaAmorti = new JButtonMe();
		this.jButtonCopiarTablaAmorti = new JButtonMe();
		this.jButtonVerFormTablaAmorti = new JButtonMe();
		this.jButtonNuevoRelacionesTablaAmorti = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTablaAmorti = new JButtonMe();
		this.jButtonCerrarTablaAmorti = new JButtonMe();
		
		this.jScrollPanelDatosTablaAmorti = new JScrollPane();   
        this.jScrollPanelDatosGeneralTablaAmorti = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Amorti";
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesTablaAmorti.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTablaAmorti=new ReporteDinamicoJInternalFrame(TablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTablaAmorti();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTablaAmorti=new ImportacionJInternalFrame(TablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTablaAmorti();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTablaAmorti = new JButtonMe();
		
		this.jButtonAbrirOrderByTablaAmorti.setText("Orden");
		this.jButtonAbrirOrderByTablaAmorti.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaAmorti,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmorti,false,this);
			
			//this.cargarOrderByTablaAmorti(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmorti,true,this);
			
			//this.cargarOrderByTablaAmorti(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTablaAmorti.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosTablaAmorti.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosTablaAmorti.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosTablaAmorti.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaAmorti.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaAmorti.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTablaAmorti.setText("Nuevo");
		this.jButtonDuplicarTablaAmorti.setText("Duplicar");
		this.jButtonCopiarTablaAmorti.setText("Copiar");
		this.jButtonVerFormTablaAmorti.setText("Ver");
		this.jButtonNuevoRelacionesTablaAmorti.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTablaAmorti.setText("Guardar");
		this.jButtonCerrarTablaAmorti.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaAmorti,"nuevo_button","Nuevo",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTablaAmorti,"duplicar_button","Duplicar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTablaAmorti,"copiar_button","Copiar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTablaAmorti,"ver_form","Ver",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTablaAmorti,"nuevorelaciones_button","Nuevo Rel",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaAmorti,"guardarcambiostabla_button","Guardar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaAmorti,"cerrar_button","Salir",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTablaAmorti.setToolTipText("Nuevo"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTablaAmorti.setToolTipText("Duplicar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTablaAmorti.setToolTipText("Copiar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTablaAmorti.setToolTipText("Ver"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTablaAmorti.setToolTipText("Nuevo Rel"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTablaAmorti.setToolTipText("Guardar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaAmorti.setToolTipText("Salir"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaAmorti";
		inputMap = this.jButtonNuevoTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaAmorti"));
		
		//DUPLICAR
		sMapKey = "DuplicarTablaAmorti";
		inputMap = this.jButtonDuplicarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTablaAmorti"));
		
		//COPIAR
		sMapKey = "CopiarTablaAmorti";
		inputMap = this.jButtonCopiarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTablaAmorti"));
		
		//VEr FORM
		sMapKey = "VerFormTablaAmorti";
		inputMap = this.jButtonVerFormTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTablaAmorti"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTablaAmorti";
		inputMap = this.jButtonNuevoRelacionesTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTablaAmorti"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTablaAmorti";
		inputMap = this.jButtonModificarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTablaAmorti"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTablaAmorti";
		inputMap = this.jButtonCerrarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaAmorti"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaAmorti";
		inputMap = this.jButtonGuardarCambiosTablaTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaAmorti"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTablaAmorti.setName("jPanelParametrosReportesTablaAmorti"); 
		
		this.jPanelParametrosReportesAccionesTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTablaAmorti.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTablaAmorti.setName("jPanelParametrosReportesAccionesTablaAmorti"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTablaAmorti = new JButtonMe();
		this.jButtonRecargarInformacionTablaAmorti.setText("Recargar");
		this.jButtonRecargarInformacionTablaAmorti.setToolTipText("Recargar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTablaAmorti,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTablaAmorti = new JButtonMe();
		this.jButtonProcesarInformacionTablaAmorti.setText("Procesar");
		this.jButtonProcesarInformacionTablaAmorti.setToolTipText("Procesar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTablaAmorti.setVisible(false);
			
		this.jButtonProcesarInformacionTablaAmorti.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaAmorti.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaAmorti.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTablaAmorti.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposReportesTablaAmorti.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTablaAmorti.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTablaAmorti.setText("Paginacion");
		this.jComboBoxTiposPaginacionTablaAmorti.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTablaAmorti.setText("Accion");
		this.jComboBoxTiposRelacionesTablaAmorti.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaAmorti.setText("Accion");
		this.jComboBoxTiposAccionesTablaAmorti.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTablaAmorti.setText("Accion");
		this.jComboBoxTiposSeleccionarTablaAmorti.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTablaAmorti=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTablaAmorti.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaAmorti.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaAmorti.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTablaAmorti = new JLabelMe();
		
		this.jLabelAccionesTablaAmorti.setText("Acciones");		
		this.jLabelAccionesTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTablaAmorti.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTablaAmorti.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTablaAmorti = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTablaAmorti.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTablaAmorti.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTablaAmorti = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTablaAmorti.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTablaAmorti.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTablaAmorti.setText("Graf.");
		this.jCheckBoxConGraficoReporteTablaAmorti.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTablaAmorti = new JButtonMe();
		//this.jButtonAnterioresTablaAmorti.setText("<<");
        this.jButtonAnterioresTablaAmorti.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTablaAmorti,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTablaAmorti = new JButtonMe();
		//this.jButtonSiguientesTablaAmorti.setText(">>");
        this.jButtonSiguientesTablaAmorti.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTablaAmorti,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTablaAmorti = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTablaAmorti.setText("Nue");
        this.jButtonNuevoGuardarCambiosTablaAmorti.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTablaAmorti,"nuevoguardarcambios_button","Nue",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTablaAmorti";
		inputMap = this.jButtonNuevoGuardarCambiosTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTablaAmorti"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTablaAmorti";
		inputMap = this.jButtonRecargarInformacionTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTablaAmorti"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTablaAmorti";
		inputMap = this.jButtonSiguientesTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTablaAmorti"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTablaAmorti";
		inputMap = this.jButtonAnterioresTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTablaAmorti"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTablaAmorti();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTablaAmorti.setMinimumSize(new Dimension(this.getWidth(),TablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaAmorti.setMaximumSize(new Dimension(this.getWidth(),TablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaAmorti.setPreferredSize(new Dimension(this.getWidth(),TablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTablaAmorti = new GridBagLayout();

			this.jPanelPaginacionTablaAmorti.setLayout(gridaBagLayoutPaginacionTablaAmorti);						
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 0;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTablaAmorti.add(this.jButtonAnterioresTablaAmorti, this.gridBagConstraintsTablaAmorti);
					
						
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaAmorti.gridy = 0;
			
			this.jPanelPaginacionTablaAmorti.add(this.jButtonNuevoGuardarCambiosTablaAmorti, this.gridBagConstraintsTablaAmorti);
						
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaAmorti.gridy = 0;
			this.jPanelPaginacionTablaAmorti.add(this.jButtonSiguientesTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 1;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmorti.add(this.jButtonNuevoTablaAmorti, this.gridBagConstraintsTablaAmorti);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTablaAmorti.gridy = 1;
				this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTablaAmorti.add(this.jButtonNuevoRelacionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
			}
			
			
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTablaAmorti.gridy = 1;
				this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTablaAmorti.add(this.jButtonGuardarCambiosTablaTablaAmorti, this.gridBagConstraintsTablaAmorti);
			}
			
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 1;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmorti.add(this.jButtonDuplicarTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 1;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmorti.add(this.jButtonCopiarTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 1;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaAmorti.add(this.jButtonVerFormTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 1;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTablaAmorti.add(this.jButtonCerrarTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		
		this.jButtonRecargarInformacionTablaAmorti.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaAmorti.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaAmorti.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTablaAmorti.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaAmorti.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaAmorti.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTablaAmorti.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaAmorti.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaAmorti.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTablaAmorti.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaAmorti.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaAmorti.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTablaAmorti.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaAmorti.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaAmorti.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTablaAmorti.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaAmorti.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaAmorti.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTablaAmorti.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaAmorti.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaAmorti.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTablaAmorti.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaAmorti.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaAmorti.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTablaAmorti = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TablaAmorti = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTablaAmorti.setLayout(gridaBagParametrosReportesTablaAmorti);
			this.jPanelParametrosReportesAccionesTablaAmorti.setLayout(gridaBagParametrosReportesAccionesTablaAmorti);
			
			
			this.jPanelParametrosAuxiliar1TablaAmorti.setLayout(gridaBagParametrosAuxiliar1TablaAmorti);
			this.jPanelParametrosAuxiliar2TablaAmorti.setLayout(gridaBagParametrosAuxiliar2TablaAmorti);
			this.jPanelParametrosAuxiliar3TablaAmorti.setLayout(gridaBagParametrosAuxiliar3TablaAmorti);
			this.jPanelParametrosAuxiliar4TablaAmorti.setLayout(gridaBagParametrosAuxiliar4TablaAmorti);
			//this.jPanelParametrosAuxiliar5TablaAmorti.setLayout(gridaBagParametrosAuxiliar2TablaAmorti);			
			
			
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmorti.add(this.jButtonRecargarInformacionTablaAmorti, this.gridBagConstraintsTablaAmorti);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmorti.add(this.jComboBoxTiposPaginacionTablaAmorti, this.gridBagConstraintsTablaAmorti);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmorti.add(this.jCheckBoxConAltoMaximoTablaTablaAmorti, this.gridBagConstraintsTablaAmorti);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaAmorti.add(this.jComboBoxTiposArchivosReportesTablaAmorti, this.gridBagConstraintsTablaAmorti);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmorti.add(this.jPanelParametrosAuxiliar1TablaAmorti, this.gridBagConstraintsTablaAmorti);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TablaAmorti.add(this.jComboBoxTiposReportesTablaAmorti, this.gridBagConstraintsTablaAmorti);																		
			
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TablaAmorti.add(this.jComboBoxTiposGraficosReportesTablaAmorti, this.gridBagConstraintsTablaAmorti);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmorti.add(this.jPanelParametrosAuxiliar4TablaAmorti, this.gridBagConstraintsTablaAmorti);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmorti.add(this.jComboBoxTiposReportesTablaAmorti, this.gridBagConstraintsTablaAmorti);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmorti.add(this.jCheckBoxGenerarReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmorti.add(this.jPanelParametrosAuxiliar2TablaAmorti, this.gridBagConstraintsTablaAmorti);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmorti.add(this.jLabelAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTablaAmorti.add(this.jButtonAbrirOrderByTablaAmorti, this.gridBagConstraintsTablaAmorti);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmorti.add(this.jComboBoxTiposSeleccionarTablaAmorti, this.gridBagConstraintsTablaAmorti);			
			
			
			/*
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmorti.add(this.jCheckBoxSeleccionarTodosTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaAmorti.add(this.jCheckBoxConGraficoReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmorti.add(this.jCheckBoxSeleccionarTodosTablaAmorti, this.gridBagConstraintsTablaAmorti);															
				
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmorti.add(this.jCheckBoxSeleccionadosTablaAmorti, this.gridBagConstraintsTablaAmorti);															
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaAmorti.add(this.jCheckBoxConGraficoReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaAmorti.add(this.jPanelParametrosAuxiliar3TablaAmorti, this.gridBagConstraintsTablaAmorti);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmorti.add(this.jComboBoxTiposRelacionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
				
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmorti.add(this.jComboBoxTiposAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
	
				
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaAmorti.add(this.jTextFieldValorCampoGeneralTablaAmorti, this.gridBagConstraintsTablaAmorti);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTablaAmorti = new GridBagLayout();

			this.jScrollPanelDatosTablaAmorti.setLayout(gridaBagLayoutDatosTablaAmorti);
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = 0;
			this.gridBagConstraintsTablaAmorti.gridx = 0;
			
			this.jScrollPanelDatosTablaAmorti.add(this.jTableDatosTablaAmorti, this.gridBagConstraintsTablaAmorti);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTablaAmorti.setViewportView(this.jTableDatosTablaAmorti);
		this.jTableDatosTablaAmorti.setFillsViewportHeight(true);
		this.jTableDatosTablaAmorti.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTablaAmorti= new GridBagLayout();
		this.jPanelAccionesTablaAmorti.setLayout(gridaBagLayoutAccionesTablaAmorti);
		
		
		/*	
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 0;
			
		this.jPanelAccionesTablaAmorti.add(this.jButtonNuevoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFacturaTablaAmorti= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaTablaAmorti.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaTablaAmorti.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaTablaAmorti.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaTablaAmorti.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaTablaAmorti.setLayout(gridaBagLayoutFK_IdFacturaTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 0;
		gridBagConstraintsTablaAmorti.gridx = 0;
		jPanelFK_IdFacturaTablaAmorti.add(jLabelid_facturaFK_IdFacturaTablaAmorti, gridBagConstraintsTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 0;
		gridBagConstraintsTablaAmorti.gridx = 1;
		jPanelFK_IdFacturaTablaAmorti.add(jComboBoxid_facturaFK_IdFacturaTablaAmorti, gridBagConstraintsTablaAmorti);


		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
		gridBagConstraintsTablaAmorti.gridy = 0;
		gridBagConstraintsTablaAmorti.gridx = 0;
		jPanelFK_IdFacturaTablaAmorti.add(this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti, gridBagConstraintsTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 1;
		gridBagConstraintsTablaAmorti.gridx =1;
		jPanelFK_IdFacturaTablaAmorti.add(jButtonFK_IdFacturaTablaAmorti, gridBagConstraintsTablaAmorti);

		jTabbedPaneBusquedasTablaAmorti.addTab("1.-Por Factura ", jPanelFK_IdFacturaTablaAmorti);
		jTabbedPaneBusquedasTablaAmorti.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTasaTablaAmorti= new GridBagLayout();
		gridaBagLayoutFK_IdTasaTablaAmorti.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTasaTablaAmorti.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTasaTablaAmorti.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTasaTablaAmorti.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTasaTablaAmorti.setLayout(gridaBagLayoutFK_IdTasaTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 0;
		gridBagConstraintsTablaAmorti.gridx = 0;
		jPanelFK_IdTasaTablaAmorti.add(jLabelid_tasaFK_IdTasaTablaAmorti, gridBagConstraintsTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 0;
		gridBagConstraintsTablaAmorti.gridx = 1;
		jPanelFK_IdTasaTablaAmorti.add(jComboBoxid_tasaFK_IdTasaTablaAmorti, gridBagConstraintsTablaAmorti);

		gridBagConstraintsTablaAmorti = new GridBagConstraints();
		gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaAmorti.gridy = 1;
		gridBagConstraintsTablaAmorti.gridx =1;
		jPanelFK_IdTasaTablaAmorti.add(jButtonFK_IdTasaTablaAmorti, gridBagConstraintsTablaAmorti);

		jTabbedPaneBusquedasTablaAmorti.addTab("2.-Por Tasa ", jPanelFK_IdTasaTablaAmorti);
		jTabbedPaneBusquedasTablaAmorti.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaAmorti = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaAmorti);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();						
			this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmorti.gridx = 0;		
			//this.gridBagConstraintsTablaAmorti.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaAmorti.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTablaAmorti, this.gridBagConstraintsTablaAmorti);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTablaAmorti.gridx = 0;		
		//this.gridBagConstraintsTablaAmorti.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTablaAmorti.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTablaAmorti);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmorti.gridx = 0;		
			this.gridBagConstraintsTablaAmorti.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTablaAmorti.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTablaAmorti, this.gridBagConstraintsTablaAmorti);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTablaAmorti, this.gridBagConstraintsTablaAmorti);								
		
		
		/*
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
		*/		
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaAmorti.gridx =0;
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaAmorti.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaAmorti, this.gridBagConstraintsTablaAmorti);
				
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTablaAmorti, this.gridBagConstraintsTablaAmorti);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaAmorti = new GridBagLayout();
			this.jPanelBusquedasParametrosTablaAmorti.setLayout(gridaBagLayoutBusquedasParametrosTablaAmorti);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTablaAmorti=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTablaAmorti;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTablaAmorti() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTablaAmorti = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTablaAmorti.setName("jPanelReporteDinamicoTablaAmorti"); 
		
		this.jPanelReporteDinamicoTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTablaAmorti.setLayout(gridaBagLayoutReporteDinamicoTablaAmorti);
		
		
		this.jInternalFrameReporteDinamicoTablaAmorti= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTablaAmorti = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaAmorti= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTablaAmorti.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTablaAmorti.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTablaAmorti.setResizable(true);
	    this.jInternalFrameReporteDinamicoTablaAmorti.setClosable(true);
	    this.jInternalFrameReporteDinamicoTablaAmorti.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTablaAmorti = new JLabelMe();

		this.jLabelColumnasSelectReporteTablaAmorti.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelColumnasSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTablaAmorti = new JList<Reporte>();
		this.jListColumnasSelectReporteTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTablaAmorti.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTablaAmorti=new JScrollPane(this.jListColumnasSelectReporteTablaAmorti);
			
			this.jScrollColumnasSelectReporteTablaAmorti.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaAmorti.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaAmorti.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTablaAmorti.add(this.jListColumnasSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		this.jPanelReporteDinamicoTablaAmorti.add(this.jScrollColumnasSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTablaAmorti = new JLabelMe();

		this.jLabelRelacionesSelectReporteTablaAmorti.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelRelacionesSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTablaAmorti = new JList<Reporte>();
		this.jListRelacionesSelectReporteTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTablaAmorti.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTablaAmorti=new JScrollPane(this.jListRelacionesSelectReporteTablaAmorti);
			
			this.jScrollRelacionesSelectReporteTablaAmorti.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaAmorti.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaAmorti.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTablaAmorti.add(this.jListRelacionesSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		this.jPanelReporteDinamicoTablaAmorti.add(this.jScrollRelacionesSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTablaAmorti = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTablaAmorti = new JComboBoxMe();
		this.jListColumnasValoresGraficoTablaAmorti = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTablaAmorti = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTablaAmorti.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTablaAmorti = new JLabelMe();

		this.jLabelConGraficoDinamicoTablaAmorti.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelConGraficoDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTablaAmorti.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTablaAmorti.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTablaAmorti.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaAmorti.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaAmorti.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jCheckBoxConGraficoDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTablaAmorti = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTablaAmorti.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelColumnaCategoriaGraficoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTablaAmorti.add(this.jComboBoxColumnaCategoriaGraficoTablaAmorti, this.gridBagConstraintsTablaAmorti);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTablaAmorti = new JLabelMe();

		this.jLabelColumnaCategoriaValorTablaAmorti.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelColumnaCategoriaValorTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTablaAmorti.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTablaAmorti.add(this.jComboBoxColumnaCategoriaValorTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTablaAmorti = new JLabelMe();

		this.jLabelColumnasValoresGraficoTablaAmorti.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelColumnasValoresGraficoTablaAmorti, this.gridBagConstraintsTablaAmorti);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTablaAmorti = new JList<Reporte>();
		this.jListColumnasValoresGraficoTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTablaAmorti.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTablaAmorti=new JScrollPane(this.jListColumnasValoresGraficoTablaAmorti);
			
			this.jScrollColumnasValoresGraficoTablaAmorti.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaAmorti.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaAmorti.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTablaAmorti.add(this.jListColumnasSelectReporteTablaAmorti, this.gridBagConstraintsTablaAmorti);
		this.jPanelReporteDinamicoTablaAmorti.add(this.jScrollColumnasValoresGraficoTablaAmorti, this.gridBagConstraintsTablaAmorti);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTablaAmorti = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTablaAmorti.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelTiposGraficosReportesDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaAmorti.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jComboBoxTiposGraficosReportesDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTablaAmorti = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTablaAmorti.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelGenerarExcelReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTablaAmorti = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTablaAmorti.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTablaAmorti,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTablaAmorti.setToolTipText("Generar EXCEL"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTablaAmorti.add(this.jButtonGenerarExcelReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmorti.add(this.jComboBoxTiposReportesDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTablaAmorti = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTablaAmorti.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaAmorti.add(this.jLabelTiposArchivoReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmorti.add(this.jComboBoxTiposArchivosReportesDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTablaAmorti = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTablaAmorti.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTablaAmorti,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTablaAmorti.setToolTipText("Generar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmorti.add(this.jButtonGenerarReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTablaAmorti = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTablaAmorti.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTablaAmorti,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTablaAmorti.setToolTipText("Cancelar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaAmorti.add(this.jButtonCerrarReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTablaAmorti = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTablaAmorti= new JScrollPane(jPanelReporteDinamicoTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTablaAmorti.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTablaAmorti.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTablaAmorti);
		this.jInternalFrameReporteDinamicoTablaAmorti.getContentPane().add(this.jScrollPanelReporteDinamicoTablaAmorti, this.gridBagConstraintsTablaAmorti);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTablaAmorti() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTablaAmorti = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTablaAmorti.setName("jPanelImportacionTablaAmorti"); 
		
		this.jPanelImportacionTablaAmorti.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaAmorti.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaAmorti.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTablaAmorti.setLayout(gridaBagLayoutImportacionTablaAmorti);
		
		
		this.jInternalFrameImportacionTablaAmorti= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTablaAmorti= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTablaAmorti = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaAmorti= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaAmorti.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTablaAmorti.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaAmorti.setResizable(true);
	    this.jInternalFrameImportacionTablaAmorti.setClosable(true);
	    this.jInternalFrameImportacionTablaAmorti.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaAmorti.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTablaAmorti.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaAmorti.setResizable(true);
	    this.jInternalFrameImportacionTablaAmorti.setClosable(true);
	    this.jInternalFrameImportacionTablaAmorti.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTablaAmorti.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaAmorti.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaAmorti.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTablaAmorti = new JLabelMe();

		this.jLabelArchivoImportacionTablaAmorti.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaAmorti.add(this.jLabelArchivoImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTablaAmorti = new JFileChooser();		
		this.jFileChooserImportacionTablaAmorti.setToolTipText("ESCOGER ARCHIVO"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTablaAmorti = new JButtonMe();
		this.jButtonAbrirImportacionTablaAmorti.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTablaAmorti,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTablaAmorti.setToolTipText("Generar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmorti.add(this.jButtonAbrirImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTablaAmorti = new JLabelMe();

		this.jLabelPathArchivoImportacionTablaAmorti.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaAmorti.add(this.jLabelPathArchivoImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTablaAmorti=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTablaAmorti.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaAmorti.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaAmorti.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmorti.add(this.jTextFieldPathArchivoImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTablaAmorti = new JButtonMe();
		this.jButtonGenerarImportacionTablaAmorti.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTablaAmorti,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTablaAmorti.setToolTipText("Generar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmorti.add(this.jButtonGenerarImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTablaAmorti = new JButtonMe();
		this.jButtonCerrarImportacionTablaAmorti.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTablaAmorti,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTablaAmorti.setToolTipText("Cancelar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaAmorti.add(this.jButtonCerrarImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTablaAmorti = new GridBagLayout();
		
		this.jScrollPanelImportacionTablaAmorti= new JScrollPane(jPanelImportacionTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iPosYImportacion;
		this.gridBagConstraintsTablaAmorti.gridx =iPosXImportacion;
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTablaAmorti.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTablaAmorti);
		this.jInternalFrameImportacionTablaAmorti.getContentPane().add(this.jScrollPanelImportacionTablaAmorti, this.gridBagConstraintsTablaAmorti);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTablaAmorti(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTablaAmorti = new JButtonMe();
			this.jButtonAbrirOrderByTablaAmorti.setText("Orden");
			this.jButtonAbrirOrderByTablaAmorti.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaAmorti,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTablaAmorti";
			inputMap = this.jButtonAbrirOrderByTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTablaAmorti"));
		
		
			GridBagLayout gridaBagLayoutOrderByTablaAmorti = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTablaAmorti.setName("jPanelOrderByTablaAmorti"); 
			
			this.jPanelOrderByTablaAmorti.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaAmorti.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaAmorti.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTablaAmorti.setLayout(gridaBagLayoutOrderByTablaAmorti);
			
			
			this.jTableDatosTablaAmortiOrderBy = new JTableMe();        
			this.jTableDatosTablaAmortiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTablaAmortiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTablaAmortiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTablaAmortiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTablaAmortiOrderBy.setViewportView(this.jTableDatosTablaAmortiOrderBy);
			this.jTableDatosTablaAmortiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTablaAmortiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTablaAmorti= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTablaAmorti= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTablaAmorti = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTablaAmorti= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTablaAmorti.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTablaAmorti.setTitle("Orden");
			this.jInternalFrameOrderByTablaAmorti.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTablaAmorti.setResizable(true);
			this.jInternalFrameOrderByTablaAmorti.setClosable(true);
			this.jInternalFrameOrderByTablaAmorti.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTablaAmorti.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaAmorti.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaAmorti.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTablaAmorti.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTablaAmorti.ipady =150;
				
			this.jPanelOrderByTablaAmorti.add(jScrollPanelDatosTablaAmortiOrderBy, this.gridBagConstraintsTablaAmorti);//this.jTableDatosTablaAmortiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTablaAmorti = new JButtonMe();
			this.jButtonCerrarOrderByTablaAmorti.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTablaAmorti,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTablaAmorti.setToolTipText("Cancelar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTablaAmorti.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTablaAmorti.add(this.jButtonCerrarOrderByTablaAmorti, this.gridBagConstraintsTablaAmorti);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTablaAmorti = new GridBagLayout();
			
			this.jScrollPanelOrderByTablaAmorti= new JScrollPane(jPanelOrderByTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy =iPosYOrderBy;
			this.gridBagConstraintsTablaAmorti.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTablaAmorti.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTablaAmorti);
			
			this.jInternalFrameOrderByTablaAmorti.getContentPane().add(this.jScrollPanelOrderByTablaAmorti, this.gridBagConstraintsTablaAmorti);			
		
		} else {
			this.jButtonAbrirOrderByTablaAmorti = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tablaamortiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTablaAmorti.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTablaAmorti.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTablaAmorti.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTablaAmorti.getRowHeight();//TablaAmortiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaAmorti.isSelected()) {
					iHeightTable=TablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaAmorti.isSelected()) {
					iHeightTable=TablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTablaAmorti.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaAmorti.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaAmorti.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTablaAmorti.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaAmorti.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaAmorti.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTablaAmorti!=null && this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy()!=null) {
			//if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTablaAmorti.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTablaAmorti.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTablaAmorti.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTablaAmorti.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaAmorti.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaAmorti.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tablaamortiLogic.getTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TablaAmorti> TraerTablaAmortiBeans(List<TablaAmorti> tablaamortis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TablaAmorti tablaamorti:tablaamortis) {
					
				if(!(TablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tablaamorti.setsDetalleGeneralEntityReporte(TablaAmortiConstantesFunciones.getTablaAmortiDescripcion(tablaamorti));
										
						
					
					

					if(tablaamorti.getDetalleTablaAmortis()!=null && Funciones.existeClass(classes,DetalleTablaAmorti.class)) {
						try{tablaamorti.setdetalletablaamortisDescripcionReporte(new JRBeanCollectionDataSource(DetalleTablaAmortiJInternalFrame.TraerDetalleTablaAmortiBeans(tablaamorti.getDetalleTablaAmortis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tablaamorti.setsDetalleGeneralEntityReporte(tablaamorti.getsDetalleGeneralEntityReporte());
										
				}
				
				//tablaamortibeans.add(tablaamortibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tablaamortis;
    }
	//PARA REPORTES FIN
}
