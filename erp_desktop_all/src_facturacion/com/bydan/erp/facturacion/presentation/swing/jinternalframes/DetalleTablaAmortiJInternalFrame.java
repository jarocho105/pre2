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
import com.bydan.erp.facturacion.util.DetalleTablaAmortiConstantesFunciones;

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
public class DetalleTablaAmortiJInternalFrame extends DetalleTablaAmortiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleTablaAmorti;
	
	protected JMenuBar jmenuBarDetalleTablaAmorti;
	
	protected JMenu jmenuDetalleTablaAmorti;
	protected JMenu jmenuDatosDetalleTablaAmorti;
	protected JMenu jmenuArchivoDetalleTablaAmorti;
	protected JMenu jmenuAccionesDetalleTablaAmorti;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTablaAmorti;	
	protected GridBagConstraints gridBagConstraintsDetalleTablaAmorti;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleTablaAmortiDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleTablaAmorti;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleTablaAmorti;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleTablaAmorti;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TablaAmortiBeanSwingJInternalFrame tablaamortiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tablaamorti="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleTablaAmortiSessionBean detalletablaamortiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TablaAmortiSessionBean tablaamortiSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleTablaAmorti> detalletablaamortis;		
	public List<DetalleTablaAmorti> detalletablaamortisEliminados;	
	public List<DetalleTablaAmorti> detalletablaamortisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleTablaAmorti;		
	protected JButton jButtonAbrirOrderByDetalleTablaAmorti;
	
	
	//protected JPanel jPanelOrderByDetalleTablaAmorti;
	//public JScrollPane jScrollPanelOrderByDetalleTablaAmorti;	
	//protected JButton jButtonCerrarOrderByDetalleTablaAmorti;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleTablaAmortiLogic detalletablaamortiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleTablaAmorti;
	public JScrollPane jScrollPanelDatosEdicionDetalleTablaAmorti;
	public JScrollPane jScrollPanelDatosGeneralDetalleTablaAmorti;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleTablaAmortiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleTablaAmorti;
	//public JScrollPane jScrollPanelImportacionDetalleTablaAmorti;
	
	
	
	protected JPanel jPanelAccionesDetalleTablaAmorti;
	
    protected JPanel jPanelPaginacionDetalleTablaAmorti;
    protected JPanel jPanelParametrosReportesDetalleTablaAmorti;
	protected JPanel jPanelParametrosReportesAccionesDetalleTablaAmorti;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleTablaAmorti;
	protected JPanel jPanelParametrosAuxiliar2DetalleTablaAmorti;
	protected JPanel jPanelParametrosAuxiliar3DetalleTablaAmorti;
	protected JPanel jPanelParametrosAuxiliar4DetalleTablaAmorti;
	//protected JPanel jPanelParametrosAuxiliar5DetalleTablaAmorti;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleTablaAmorti;
	//protected JPanel jPanelImportacionDetalleTablaAmorti;
	
	
	public JTable jTableDatosDetalleTablaAmorti;
	
	
	
	//public JTable jTableDatosDetalleTablaAmortiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleTablaAmorti;
	protected JButton jButtonDuplicarDetalleTablaAmorti;
	protected JButton jButtonCopiarDetalleTablaAmorti;
	protected JButton jButtonVerFormDetalleTablaAmorti;
	protected JButton jButtonNuevoRelacionesDetalleTablaAmorti;
	protected JButton jButtonModificarDetalleTablaAmorti;
	
    protected JButton jButtonGuardarCambiosTablaDetalleTablaAmorti;
	protected JButton jButtonCerrarDetalleTablaAmorti;
	
	
	protected JButton jButtonRecargarInformacionDetalleTablaAmorti;
	protected JButton jButtonProcesarInformacionDetalleTablaAmorti;
	
	
	protected JButton jButtonAnterioresDetalleTablaAmorti;
	protected JButton jButtonSiguientesDetalleTablaAmorti;
	protected JButton jButtonNuevoGuardarCambiosDetalleTablaAmorti;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleTablaAmorti;
	//protected JButton jButtonCerrarReporteDinamicoDetalleTablaAmorti;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleTablaAmorti;
	//protected JButton jButtonGenerarImportacionDetalleTablaAmorti;
	//protected JButton jButtonCerrarImportacionDetalleTablaAmorti;
	//protected JFileChooser jFileChooserImportacionDetalleTablaAmorti;
	//protected File fileImportacionDetalleTablaAmorti;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleTablaAmorti;
	protected JButton jButtonDuplicarToolBarDetalleTablaAmorti;
	protected JButton jButtonNuevoRelacionesToolBarDetalleTablaAmorti;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleTablaAmorti;
	protected JButton jButtonCopiarToolBarDetalleTablaAmorti;
	protected JButton jButtonVerFormToolBarDetalleTablaAmorti;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTablaAmorti;
	protected JButton jButtonCerrarToolBarDetalleTablaAmorti;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleTablaAmorti;
	protected JButton jButtonProcesarInformacionToolBarDetalleTablaAmorti;
	protected JButton jButtonAnterioresToolBarDetalleTablaAmorti;
	protected JButton jButtonSiguientesToolBarDetalleTablaAmorti;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti;
	protected JButton jButtonAbrirOrderByToolBarDetalleTablaAmorti;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleTablaAmorti;
	protected JMenuItem jMenuItemDuplicarDetalleTablaAmorti;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleTablaAmorti;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleTablaAmorti;
	protected JMenuItem jMenuItemCopiarDetalleTablaAmorti;
	protected JMenuItem jMenuItemVerFormDetalleTablaAmorti;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTablaAmorti;
	protected JMenuItem jMenuItemCerrarDetalleTablaAmorti;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTablaAmorti;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleTablaAmorti;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTablaAmorti;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleTablaAmorti;
	protected JMenuItem jMenuItemProcesarInformacionDetalleTablaAmorti;
	protected JMenuItem jMenuItemAnterioresDetalleTablaAmorti;
	protected JMenuItem jMenuItemSiguientesDetalleTablaAmorti;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTablaAmorti;
	protected JMenuItem jMenuItemAbrirOrderByDetalleTablaAmorti;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTablaAmorti;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTablaAmorti;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleTablaAmorti;
	protected JCheckBox jCheckBoxSeleccionadosDetalleTablaAmorti;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleTablaAmorti;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleTablaAmorti;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleTablaAmorti;
	protected JTextField jTextFieldValorCampoGeneralDetalleTablaAmorti;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleTablaAmorti;
	//public JList<Reporte> jListColumnasSelectReporteDetalleTablaAmorti;
	//public JScrollPane jScrollColumnasSelectReporteDetalleTablaAmorti;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleTablaAmorti;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleTablaAmorti;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleTablaAmorti;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleTablaAmorti;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleTablaAmorti;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti;
	
		
	//public JLabel jLabelArchivoImportacionDetalleTablaAmorti;	
	//public JLabel jLabelPathArchivoImportacionDetalleTablaAmorti;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleTablaAmorti;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleTablaAmorti;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleTablaAmorti;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleTablaAmorti;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleTablaAmorti;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleTablaAmorti;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleTablaAmorti;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleTablaAmorti;
	public JPanel jPanelFK_IdTablaAmortiDetalleTablaAmorti;
	public JButton jButtonFK_IdTablaAmortiDetalleTablaAmorti;
	
	public JPanel jPanelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti;
	public JLabel jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti;
	public JButton jButtonid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmortiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleTablaAmortiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleTablaAmorti)	{
		this.jButtonRecargarInformacionDetalleTablaAmorti = jButtonRecargarInformacionDetalleTablaAmorti;
	}
	
	public JButton getjButtonProcesarInformacionDetalleTablaAmorti() {
		return this.jButtonProcesarInformacionDetalleTablaAmorti;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTablaAmorti)	{
		this.jButtonProcesarInformacionDetalleTablaAmorti = jButtonProcesarInformacionDetalleTablaAmorti;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleTablaAmorti() {
		return this.jButtonRecargarInformacionDetalleTablaAmorti;
	}
	
	
	public List<DetalleTablaAmorti> getdetalletablaamortis() {
		return this.detalletablaamortis;
	}

	public void setdetalletablaamortis(List<DetalleTablaAmorti> detalletablaamortis) {
		this.detalletablaamortis = detalletablaamortis;
	}
	
	public List<DetalleTablaAmorti> getdetalletablaamortisAux() {
		return this.detalletablaamortisAux;
	}

	public void setdetalletablaamortisAux(List<DetalleTablaAmorti> detalletablaamortisAux) {
		this.detalletablaamortisAux = detalletablaamortisAux;
	}
	
	public List<DetalleTablaAmorti> getdetalletablaamortisEliminados() {
		return this.detalletablaamortisEliminados;
	}

	public void setDetalleTablaAmortisEliminados(List<DetalleTablaAmorti> detalletablaamortisEliminados) {
		this.detalletablaamortisEliminados = detalletablaamortisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleTablaAmorti() {
		return jComboBoxTiposSeleccionarDetalleTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleTablaAmorti(
			JComboBox jComboBoxTiposSeleccionarDetalleTablaAmorti) {
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti = jComboBoxTiposSeleccionarDetalleTablaAmorti;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleTablaAmorti() {
		return jTextFieldValorCampoGeneralDetalleTablaAmorti;
	}

	public void setjTextFieldValorCampoGeneralDetalleTablaAmorti(
			JTextField jTextFieldValorCampoGeneralDetalleTablaAmorti) {
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti = jTextFieldValorCampoGeneralDetalleTablaAmorti;
	}

	public void setBorderResaltarValorCampoGeneralDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleTablaAmorti() {
		return this.jCheckBoxSeleccionarTodosDetalleTablaAmorti;
	}

	public void setjCheckBoxSeleccionarTodosDetalleTablaAmorti(
			JCheckBox jCheckBoxSeleccionarTodosDetalleTablaAmorti) {
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti = jCheckBoxSeleccionarTodosDetalleTablaAmorti;
	}

	public void setBorderResaltarSeleccionarTodosDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleTablaAmorti() {
		return this.jCheckBoxSeleccionadosDetalleTablaAmorti;
	}

	public void setjCheckBoxSeleccionadosDetalleTablaAmorti(
			JCheckBox jCheckBoxSeleccionadosDetalleTablaAmorti) {
		this.jCheckBoxSeleccionadosDetalleTablaAmorti = jCheckBoxSeleccionadosDetalleTablaAmorti;
	}
	
	public void setBorderResaltarSeleccionadosDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleTablaAmorti() {
		return this.jComboBoxTiposArchivosReportesDetalleTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleTablaAmorti(
			JComboBox jComboBoxTiposArchivosReportesDetalleTablaAmorti) {
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti = jComboBoxTiposArchivosReportesDetalleTablaAmorti;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleTablaAmorti() {
		return this.jComboBoxTiposReportesDetalleTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleTablaAmorti(
			JComboBox jComboBoxTiposReportesDetalleTablaAmorti) {
		this.jComboBoxTiposReportesDetalleTablaAmorti = jComboBoxTiposReportesDetalleTablaAmorti;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleTablaAmorti() {
	//	return jComboBoxTiposReportesDinamicoDetalleTablaAmorti;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleTablaAmorti(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleTablaAmorti) {
	//	this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti = jComboBoxTiposReportesDinamicoDetalleTablaAmorti;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti = jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti;
	//}
	
	public void setBorderResaltarTiposReportesDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleTablaAmorti() {
		return this.jComboBoxTiposGraficosReportesDetalleTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleTablaAmorti(
			JComboBox jComboBoxTiposGraficosReportesDetalleTablaAmorti) {
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti = jComboBoxTiposGraficosReportesDetalleTablaAmorti;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleTablaAmorti() {
		return this.jComboBoxTiposPaginacionDetalleTablaAmorti;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleTablaAmorti(
			JComboBox jComboBoxTiposPaginacionDetalleTablaAmorti) {
		this.jComboBoxTiposPaginacionDetalleTablaAmorti = jComboBoxTiposPaginacionDetalleTablaAmorti;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleTablaAmorti() {
		return this.jComboBoxTiposRelacionesDetalleTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTablaAmorti() {
		return this.jComboBoxTiposAccionesDetalleTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTablaAmorti(
			JComboBox jComboBoxTiposRelacionesDetalleTablaAmorti) {
		this.jComboBoxTiposRelacionesDetalleTablaAmorti = jComboBoxTiposRelacionesDetalleTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTablaAmorti(
			JComboBox jComboBoxTiposAccionesDetalleTablaAmorti) {
		this.jComboBoxTiposAccionesDetalleTablaAmorti = jComboBoxTiposAccionesDetalleTablaAmorti;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleTablaAmorti() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleTablaAmorti .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleTablaAmorti() {
	//	return jCheckBoxConGraficoDinamicoDetalleTablaAmorti;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleTablaAmorti(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleTablaAmorti) {
	//	this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti = jCheckBoxConGraficoDinamicoDetalleTablaAmorti;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleTablaAmorti() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleTablaAmorti.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti .setBorder(borderResaltar);		
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
		this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		
		this.detalletablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalletablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalletablaamortiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTablaAmortiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Tabla Amorti MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTablaAmorti= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"nuevo","nuevo","Nuevo"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"duplicar","duplicar","Duplicar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"copiar","copiar","Copiar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"ver_form","ver_form","Ver"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"recargar","recargar","Recargar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"cerrar","cerrar","Salir"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleTablaAmorti;
			
				this.jButtonProcesarInformacionToolBarDetalleTablaAmorti=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleTablaAmorti;
				
		//protected JButton jButtonModificarToolBarDetalleTablaAmorti;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleTablaAmorti=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleTablaAmorti=new JMenuMe("General");
		this.jmenuArchivoDetalleTablaAmorti=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleTablaAmorti=new JMenuMe("Acciones");
		this.jmenuDatosDetalleTablaAmorti=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTablaAmorti= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTablaAmorti.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTablaAmorti,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleTablaAmorti= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleTablaAmorti.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleTablaAmorti,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleTablaAmorti= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleTablaAmorti.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleTablaAmorti,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleTablaAmorti= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTablaAmorti.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTablaAmorti,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleTablaAmorti= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleTablaAmorti.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleTablaAmorti,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleTablaAmorti= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleTablaAmorti.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleTablaAmorti,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleTablaAmorti= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleTablaAmorti.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleTablaAmorti,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleTablaAmorti= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleTablaAmorti.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleTablaAmorti,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleTablaAmorti= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleTablaAmorti.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleTablaAmorti,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleTablaAmorti= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleTablaAmorti.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleTablaAmorti,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleTablaAmorti= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleTablaAmorti.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleTablaAmorti,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleTablaAmorti.add(this.jMenuItemCerrarDetalleTablaAmorti);
			
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemNuevoDetalleTablaAmorti);
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti);
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemNuevoRelacionesDetalleTablaAmorti);
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti);		
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemDuplicarDetalleTablaAmorti);		
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemCopiarDetalleTablaAmorti);		
			this.jmenuAccionesDetalleTablaAmorti.add(this.jMenuItemVerFormDetalleTablaAmorti);		
			
			this.jmenuDatosDetalleTablaAmorti.add(this.jMenuItemRecargarInformacionDetalleTablaAmorti);				
			this.jmenuDatosDetalleTablaAmorti.add(this.jMenuItemAnterioresDetalleTablaAmorti);				
			this.jmenuDatosDetalleTablaAmorti.add(this.jMenuItemSiguientesDetalleTablaAmorti);				
			this.jmenuDatosDetalleTablaAmorti.add(this.jMenuItemAbrirOrderByDetalleTablaAmorti);				
			this.jmenuDatosDetalleTablaAmorti.add(this.jMenuItemMostrarOcultarDetalleTablaAmorti);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleTablaAmorti.add(this.jMenuItemGuardarCambiosDetalleTablaAmorti);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTablaAmorti.add(this.jmenuArchivoDetalleTablaAmorti);		
			this.jmenuBarDetalleTablaAmorti.add(this.jmenuAccionesDetalleTablaAmorti);		
			this.jmenuBarDetalleTablaAmorti.add(this.jmenuDatosDetalleTablaAmorti);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleTablaAmorti);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleTablaAmorti() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTablaAmortiDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTablaAmortiDetalleTablaAmorti.setToolTipText("Buscar Por Tabla Amorti ");
		this.jButtonFK_IdTablaAmortiDetalleTablaAmorti= new JButtonMe();
		this.jButtonFK_IdTablaAmortiDetalleTablaAmorti.setText("Buscar");
		this.jButtonFK_IdTablaAmortiDetalleTablaAmorti.setToolTipText("Buscar Por Tabla Amorti ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTablaAmortiDetalleTablaAmorti,"buscar_button","Buscar Por Tabla Amorti ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTablaAmortiDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti = new JLabelMe();
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setText("Tabla Amorti :");
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setToolTipText("Tabla Amorti");
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleTablaAmorti=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleTablaAmorti.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTablaAmorti.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTablaAmorti.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleTablaAmorti = new DetalleTablaAmortiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Tabla Amorti DATOS");
			this.jInternalFrameDetalleFormDetalleTablaAmorti = new DetalleTablaAmortiDetalleFormJInternalFrame(jDesktopPane,this.detalletablaamortiSessionBean.getConGuardarRelaciones(),this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleTablaAmorti = null;//new DetalleTablaAmortiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleTablaAmorti= new GridBagLayout();
		
		
		this.jTableDatosDetalleTablaAmorti = new JTableMe();      
		
		String sToolTipDetalleTablaAmorti="";
		sToolTipDetalleTablaAmorti=DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTablaAmorti+="(Facturacion.DetalleTablaAmorti)";
		}
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTablaAmorti+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleTablaAmorti.setToolTipText(sToolTipDetalleTablaAmorti);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleTablaAmorti);
		this.jTableDatosDetalleTablaAmorti.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleTablaAmorti.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleTablaAmorti.setRowSelectionAllowed(true);
		this.jTableDatosDetalleTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleTablaAmorti = new JButtonMe();
		this.jButtonDuplicarDetalleTablaAmorti = new JButtonMe();
		this.jButtonCopiarDetalleTablaAmorti = new JButtonMe();
		this.jButtonVerFormDetalleTablaAmorti = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleTablaAmorti = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti = new JButtonMe();
		this.jButtonCerrarDetalleTablaAmorti = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTablaAmorti = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleTablaAmorti = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Tabla Amorti";
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTablaAmorti.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleTablaAmorti=new ReporteDinamicoJInternalFrame(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleTablaAmorti();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleTablaAmorti=new ImportacionJInternalFrame(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleTablaAmorti();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleTablaAmorti = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleTablaAmorti.setText("Orden");
		this.jButtonAbrirOrderByDetalleTablaAmorti.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTablaAmorti,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTablaAmorti,false,this);
			
			//this.cargarOrderByDetalleTablaAmorti(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTablaAmorti,true,this);
			
			//this.cargarOrderByDetalleTablaAmorti(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleTablaAmorti.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosDetalleTablaAmorti.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosDetalleTablaAmorti.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosDetalleTablaAmorti.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTablaAmorti.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTablaAmorti.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleTablaAmorti.setText("Nuevo");
		this.jButtonDuplicarDetalleTablaAmorti.setText("Duplicar");
		this.jButtonCopiarDetalleTablaAmorti.setText("Copiar");
		this.jButtonVerFormDetalleTablaAmorti.setText("Ver");
		this.jButtonNuevoRelacionesDetalleTablaAmorti.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setText("Guardar");
		this.jButtonCerrarDetalleTablaAmorti.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTablaAmorti,"nuevo_button","Nuevo",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleTablaAmorti,"duplicar_button","Duplicar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleTablaAmorti,"copiar_button","Copiar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleTablaAmorti,"ver_form","Ver",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleTablaAmorti,"nuevorelaciones_button","Nuevo Rel",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTablaAmorti,"guardarcambiostabla_button","Guardar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTablaAmorti,"cerrar_button","Salir",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleTablaAmorti.setToolTipText("Nuevo"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleTablaAmorti.setToolTipText("Duplicar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleTablaAmorti.setToolTipText("Copiar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleTablaAmorti.setToolTipText("Ver"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleTablaAmorti.setToolTipText("Nuevo Rel"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setToolTipText("Guardar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTablaAmorti.setToolTipText("Salir"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTablaAmorti";
		inputMap = this.jButtonNuevoDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTablaAmorti"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleTablaAmorti";
		inputMap = this.jButtonDuplicarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleTablaAmorti"));
		
		//COPIAR
		sMapKey = "CopiarDetalleTablaAmorti";
		inputMap = this.jButtonCopiarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleTablaAmorti"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleTablaAmorti";
		inputMap = this.jButtonVerFormDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleTablaAmorti"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleTablaAmorti";
		inputMap = this.jButtonNuevoRelacionesDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleTablaAmorti"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleTablaAmorti";
		inputMap = this.jButtonModificarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleTablaAmorti"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleTablaAmorti";
		inputMap = this.jButtonCerrarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTablaAmorti"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTablaAmorti";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTablaAmorti"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleTablaAmorti.setName("jPanelParametrosReportesDetalleTablaAmorti"); 
		
		this.jPanelParametrosReportesAccionesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleTablaAmorti.setName("jPanelParametrosReportesAccionesDetalleTablaAmorti"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleTablaAmorti = new JButtonMe();
		this.jButtonRecargarInformacionDetalleTablaAmorti.setText("Recargar");
		this.jButtonRecargarInformacionDetalleTablaAmorti.setToolTipText("Recargar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleTablaAmorti,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleTablaAmorti = new JButtonMe();
		this.jButtonProcesarInformacionDetalleTablaAmorti.setText("Procesar");
		this.jButtonProcesarInformacionDetalleTablaAmorti.setToolTipText("Procesar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleTablaAmorti.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleTablaAmorti.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTablaAmorti.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTablaAmorti.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleTablaAmorti.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleTablaAmorti.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleTablaAmorti.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleTablaAmorti.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleTablaAmorti.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTablaAmorti.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleTablaAmorti = new JLabelMe();
		
		this.jLabelAccionesDetalleTablaAmorti.setText("Acciones");		
		this.jLabelAccionesDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleTablaAmorti = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleTablaAmorti.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleTablaAmorti.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleTablaAmorti = new JButtonMe();
		//this.jButtonAnterioresDetalleTablaAmorti.setText("<<");
        this.jButtonAnterioresDetalleTablaAmorti.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleTablaAmorti,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleTablaAmorti = new JButtonMe();
		//this.jButtonSiguientesDetalleTablaAmorti.setText(">>");
        this.jButtonSiguientesDetalleTablaAmorti.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleTablaAmorti,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleTablaAmorti = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleTablaAmorti,"nuevoguardarcambios_button","Nue",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleTablaAmorti";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleTablaAmorti"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleTablaAmorti";
		inputMap = this.jButtonRecargarInformacionDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleTablaAmorti"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleTablaAmorti";
		inputMap = this.jButtonSiguientesDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleTablaAmorti"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleTablaAmorti";
		inputMap = this.jButtonAnterioresDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleTablaAmorti"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleTablaAmorti();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleTablaAmorti.setMinimumSize(new Dimension(this.getWidth(),DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleTablaAmorti.setMaximumSize(new Dimension(this.getWidth(),DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleTablaAmorti.setPreferredSize(new Dimension(this.getWidth(),DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTablaAmortiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleTablaAmorti = new GridBagLayout();

			this.jPanelPaginacionDetalleTablaAmorti.setLayout(gridaBagLayoutPaginacionDetalleTablaAmorti);						
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonAnterioresDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					
						
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
			
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonNuevoGuardarCambiosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
						
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonSiguientesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonNuevoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
						
			
			
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
				this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonGuardarCambiosTablaDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			}
			
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonDuplicarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonCopiarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonVerFormDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 1;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleTablaAmorti.add(this.jButtonCerrarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		
		this.jButtonRecargarInformacionDetalleTablaAmorti.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTablaAmorti.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTablaAmorti.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleTablaAmorti.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTablaAmorti.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTablaAmorti.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleTablaAmorti.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTablaAmorti.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTablaAmorti.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleTablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleTablaAmorti = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleTablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleTablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleTablaAmorti = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleTablaAmorti = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleTablaAmorti.setLayout(gridaBagParametrosReportesDetalleTablaAmorti);
			this.jPanelParametrosReportesAccionesDetalleTablaAmorti.setLayout(gridaBagParametrosReportesAccionesDetalleTablaAmorti);
			
			
			this.jPanelParametrosAuxiliar1DetalleTablaAmorti.setLayout(gridaBagParametrosAuxiliar1DetalleTablaAmorti);
			this.jPanelParametrosAuxiliar2DetalleTablaAmorti.setLayout(gridaBagParametrosAuxiliar2DetalleTablaAmorti);
			this.jPanelParametrosAuxiliar3DetalleTablaAmorti.setLayout(gridaBagParametrosAuxiliar3DetalleTablaAmorti);
			this.jPanelParametrosAuxiliar4DetalleTablaAmorti.setLayout(gridaBagParametrosAuxiliar4DetalleTablaAmorti);
			//this.jPanelParametrosAuxiliar5DetalleTablaAmorti.setLayout(gridaBagParametrosAuxiliar2DetalleTablaAmorti);			
			
			
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jButtonRecargarInformacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTablaAmorti.add(this.jComboBoxTiposPaginacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTablaAmorti.add(this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTablaAmorti.add(this.jComboBoxTiposArchivosReportesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jPanelParametrosAuxiliar1DetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleTablaAmorti.add(this.jComboBoxTiposReportesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);																		
			
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleTablaAmorti.add(this.jComboBoxTiposGraficosReportesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jPanelParametrosAuxiliar4DetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jComboBoxTiposReportesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jCheckBoxGenerarReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jPanelParametrosAuxiliar2DetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jLabelAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jButtonAbrirOrderByDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jComboBoxTiposSeleccionarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			
			
			/*
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jCheckBoxSeleccionarTodosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jCheckBoxConGraficoReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTablaAmorti.add(this.jCheckBoxSeleccionarTodosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);															
				
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTablaAmorti.add(this.jCheckBoxSeleccionadosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);															
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTablaAmorti.add(this.jCheckBoxConGraficoReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jPanelParametrosAuxiliar3DetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jComboBoxTiposAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
	
				
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTablaAmorti.add(this.jTextFieldValorCampoGeneralDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleTablaAmorti = new GridBagLayout();

			this.jScrollPanelDatosDetalleTablaAmorti.setLayout(gridaBagLayoutDatosDetalleTablaAmorti);
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
			
			this.jScrollPanelDatosDetalleTablaAmorti.add(this.jTableDatosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleTablaAmorti.setViewportView(this.jTableDatosDetalleTablaAmorti);
		this.jTableDatosDetalleTablaAmorti.setFillsViewportHeight(true);
		this.jTableDatosDetalleTablaAmorti.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleTablaAmorti= new GridBagLayout();
		this.jPanelAccionesDetalleTablaAmorti.setLayout(gridaBagLayoutAccionesDetalleTablaAmorti);
		
		
		/*	
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
			
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonNuevoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti= new GridBagLayout();
		gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTablaAmortiDetalleTablaAmorti.setLayout(gridaBagLayoutFK_IdTablaAmortiDetalleTablaAmorti);

		gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		gridBagConstraintsDetalleTablaAmorti.gridx = 0;
		jPanelFK_IdTablaAmortiDetalleTablaAmorti.add(jLabelid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);

		gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		gridBagConstraintsDetalleTablaAmorti.gridx = 1;
		jPanelFK_IdTablaAmortiDetalleTablaAmorti.add(jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);

		gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTablaAmorti.gridy = 1;
		gridBagConstraintsDetalleTablaAmorti.gridx =1;
		jPanelFK_IdTablaAmortiDetalleTablaAmorti.add(jButtonFK_IdTablaAmortiDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);

		jTabbedPaneBusquedasDetalleTablaAmorti.addTab("1.-Por Tabla Amorti ", jPanelFK_IdTablaAmortiDetalleTablaAmorti);
		jTabbedPaneBusquedasDetalleTablaAmorti.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTablaAmorti);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;		
			//this.gridBagConstraintsDetalleTablaAmorti.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTablaAmorti.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;		
		//this.gridBagConstraintsDetalleTablaAmorti.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleTablaAmorti);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;		
			this.gridBagConstraintsDetalleTablaAmorti.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleTablaAmorti.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);								
		
		
		/*
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		*/		
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTablaAmorti.gridx =0;
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTablaAmorti.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
				
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleTablaAmorti= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTablaAmorti = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleTablaAmorti.setLayout(gridaBagLayoutBusquedasParametrosDetalleTablaAmorti);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleTablaAmorti=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleTablaAmorti;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleTablaAmorti() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleTablaAmorti = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleTablaAmorti.setName("jPanelReporteDinamicoDetalleTablaAmorti"); 
		
		this.jPanelReporteDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleTablaAmorti.setLayout(gridaBagLayoutReporteDinamicoDetalleTablaAmorti);
		
		
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTablaAmorti= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleTablaAmorti = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleTablaAmorti.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelColumnasSelectReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleTablaAmorti = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleTablaAmorti=new JScrollPane(this.jListColumnasSelectReporteDetalleTablaAmorti);
			
			this.jScrollColumnasSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jListColumnasSelectReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jScrollColumnasSelectReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleTablaAmorti = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleTablaAmorti.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleTablaAmorti = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleTablaAmorti=new JScrollPane(this.jListRelacionesSelectReporteDetalleTablaAmorti);
			
			this.jScrollRelacionesSelectReporteDetalleTablaAmorti.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTablaAmorti.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTablaAmorti.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleTablaAmorti = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleTablaAmorti = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleTablaAmorti.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelConGraficoDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jCheckBoxConGraficoDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelColumnaCategoriaGraficoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleTablaAmorti = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleTablaAmorti.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelColumnaCategoriaValorDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jComboBoxColumnaCategoriaValorDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleTablaAmorti = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleTablaAmorti.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelColumnasValoresGraficoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleTablaAmorti = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleTablaAmorti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleTablaAmorti.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleTablaAmorti.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleTablaAmorti.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleTablaAmorti.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleTablaAmorti=new JScrollPane(this.jListColumnasValoresGraficoDetalleTablaAmorti);
			
			this.jScrollColumnasValoresGraficoDetalleTablaAmorti.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleTablaAmorti.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleTablaAmorti.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jListColumnasSelectReporteDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jScrollColumnasValoresGraficoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelTiposGraficosReportesDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleTablaAmorti.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelGenerarExcelReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti.setToolTipText("Generar EXCEL"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jComboBoxTiposReportesDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jLabelTiposArchivoReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleTablaAmorti = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleTablaAmorti.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleTablaAmorti,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleTablaAmorti.setToolTipText("Generar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jButtonGenerarReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleTablaAmorti = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleTablaAmorti.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleTablaAmorti,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleTablaAmorti.setToolTipText("Cancelar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTablaAmorti.add(this.jButtonCerrarReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleTablaAmorti = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti= new JScrollPane(jPanelReporteDinamicoDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleTablaAmorti);
		this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleTablaAmorti() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleTablaAmorti = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleTablaAmorti.setName("jPanelImportacionDetalleTablaAmorti"); 
		
		this.jPanelImportacionDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleTablaAmorti.setLayout(gridaBagLayoutImportacionDetalleTablaAmorti);
		
		
		this.jInternalFrameImportacionDetalleTablaAmorti= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleTablaAmorti= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleTablaAmorti = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTablaAmorti= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTablaAmorti.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleTablaAmorti.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTablaAmorti.setResizable(true);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setClosable(true);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTablaAmorti.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleTablaAmorti.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTablaAmorti.setResizable(true);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setClosable(true);
	    this.jInternalFrameImportacionDetalleTablaAmorti.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleTablaAmorti = new JLabelMe();

		this.jLabelArchivoImportacionDetalleTablaAmorti.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTablaAmorti.add(this.jLabelArchivoImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleTablaAmorti = new JFileChooser();		
		this.jFileChooserImportacionDetalleTablaAmorti.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleTablaAmorti = new JButtonMe();
		this.jButtonAbrirImportacionDetalleTablaAmorti.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleTablaAmorti,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleTablaAmorti.setToolTipText("Generar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTablaAmorti.add(this.jButtonAbrirImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleTablaAmorti = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleTablaAmorti.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTablaAmorti.add(this.jLabelPathArchivoImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleTablaAmorti=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleTablaAmorti.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTablaAmorti.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTablaAmorti.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTablaAmorti.add(this.jTextFieldPathArchivoImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleTablaAmorti = new JButtonMe();
		this.jButtonGenerarImportacionDetalleTablaAmorti.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleTablaAmorti,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleTablaAmorti.setToolTipText("Generar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTablaAmorti.add(this.jButtonGenerarImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleTablaAmorti = new JButtonMe();
		this.jButtonCerrarImportacionDetalleTablaAmorti.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleTablaAmorti,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleTablaAmorti.setToolTipText("Cancelar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTablaAmorti.add(this.jButtonCerrarImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleTablaAmorti = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleTablaAmorti= new JScrollPane(jPanelImportacionDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleTablaAmorti.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleTablaAmorti);
		this.jInternalFrameImportacionDetalleTablaAmorti.getContentPane().add(this.jScrollPanelImportacionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleTablaAmorti(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleTablaAmorti = new JButtonMe();
			this.jButtonAbrirOrderByDetalleTablaAmorti.setText("Orden");
			this.jButtonAbrirOrderByDetalleTablaAmorti.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTablaAmorti,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleTablaAmorti";
			inputMap = this.jButtonAbrirOrderByDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleTablaAmorti"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleTablaAmorti = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleTablaAmorti.setName("jPanelOrderByDetalleTablaAmorti"); 
			
			this.jPanelOrderByDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleTablaAmorti.setLayout(gridaBagLayoutOrderByDetalleTablaAmorti);
			
			
			this.jTableDatosDetalleTablaAmortiOrderBy = new JTableMe();        
			this.jTableDatosDetalleTablaAmortiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleTablaAmortiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleTablaAmortiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleTablaAmortiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleTablaAmortiOrderBy.setViewportView(this.jTableDatosDetalleTablaAmortiOrderBy);
			this.jTableDatosDetalleTablaAmortiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleTablaAmortiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleTablaAmorti= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleTablaAmorti= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleTablaAmorti = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleTablaAmorti= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleTablaAmorti.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleTablaAmorti.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleTablaAmorti.setTitle("Orden");
			this.jInternalFrameOrderByDetalleTablaAmorti.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleTablaAmorti.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleTablaAmorti.setResizable(true);
			this.jInternalFrameOrderByDetalleTablaAmorti.setClosable(true);
			this.jInternalFrameOrderByDetalleTablaAmorti.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleTablaAmorti.ipady =150;
				
			this.jPanelOrderByDetalleTablaAmorti.add(jScrollPanelDatosDetalleTablaAmortiOrderBy, this.gridBagConstraintsDetalleTablaAmorti);//this.jTableDatosDetalleTablaAmortiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleTablaAmorti = new JButtonMe();
			this.jButtonCerrarOrderByDetalleTablaAmorti.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleTablaAmorti,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleTablaAmorti.setToolTipText("Cancelar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleTablaAmorti.add(this.jButtonCerrarOrderByDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleTablaAmorti = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleTablaAmorti= new JScrollPane(jPanelOrderByDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleTablaAmorti.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleTablaAmorti.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleTablaAmorti);
			
			this.jInternalFrameOrderByDetalleTablaAmorti.getContentPane().add(this.jScrollPanelOrderByDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
		
		} else {
			this.jButtonAbrirOrderByDetalleTablaAmorti = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalletablaamortiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleTablaAmorti.getRowHeight();//DetalleTablaAmortiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.isSelected()) {
					iHeightTable=DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTablaAmorti.isSelected()) {
					iHeightTable=DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTablaAmortiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleTablaAmorti!=null && this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy()!=null) {
			//if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleTablaAmorti.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleTablaAmorti.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleTablaAmorti.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalletablaamortiLogic.getDetalleTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalletablaamortis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleTablaAmorti> TraerDetalleTablaAmortiBeans(List<DetalleTablaAmorti> detalletablaamortis,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleTablaAmorti detalletablaamorti:detalletablaamortis) {
					
				if(!(DetalleTablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleTablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalletablaamorti.setsDetalleGeneralEntityReporte(DetalleTablaAmortiConstantesFunciones.getDetalleTablaAmortiDescripcion(detalletablaamorti));
										
						
					
						
					
				} else  {
							
					//detalletablaamorti.setsDetalleGeneralEntityReporte(detalletablaamorti.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalletablaamortibeans.add(detalletablaamortibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalletablaamortis;
    }
	//PARA REPORTES FIN
}
