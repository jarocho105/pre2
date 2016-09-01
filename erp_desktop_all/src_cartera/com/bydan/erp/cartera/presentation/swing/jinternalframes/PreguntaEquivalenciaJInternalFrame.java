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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.cartera.util.PreguntaEquivalenciaConstantesFunciones;

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
public class PreguntaEquivalenciaJInternalFrame extends PreguntaEquivalenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPreguntaEquivalencia;
	
	protected JMenuBar jmenuBarPreguntaEquivalencia;
	
	protected JMenu jmenuPreguntaEquivalencia;
	protected JMenu jmenuDatosPreguntaEquivalencia;
	protected JMenu jmenuArchivoPreguntaEquivalencia;
	protected JMenu jmenuAccionesPreguntaEquivalencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaEquivalencia;	
	protected GridBagConstraints gridBagConstraintsPreguntaEquivalencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame jInternalFrameDetalleFormPreguntaEquivalencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPreguntaEquivalencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPreguntaEquivalencia;	
	
	
	
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
	
	public PreguntaEquivalenciaSessionBean preguntaequivalenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PreguntaEquivalencia> preguntaequivalencias;		
	public List<PreguntaEquivalencia> preguntaequivalenciasEliminados;	
	public List<PreguntaEquivalencia> preguntaequivalenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPreguntaEquivalencia;		
	protected JButton jButtonAbrirOrderByPreguntaEquivalencia;
	
	
	//protected JPanel jPanelOrderByPreguntaEquivalencia;
	//public JScrollPane jScrollPanelOrderByPreguntaEquivalencia;	
	//protected JButton jButtonCerrarOrderByPreguntaEquivalencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PreguntaEquivalenciaLogic preguntaequivalenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPreguntaEquivalencia;
	public JScrollPane jScrollPanelDatosEdicionPreguntaEquivalencia;
	public JScrollPane jScrollPanelDatosGeneralPreguntaEquivalencia;
    
	
	
	//public JScrollPane jScrollPanelDatosPreguntaEquivalenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPreguntaEquivalencia;
	//public JScrollPane jScrollPanelImportacionPreguntaEquivalencia;
	
	
	
	protected JPanel jPanelAccionesPreguntaEquivalencia;
	
    protected JPanel jPanelPaginacionPreguntaEquivalencia;
    protected JPanel jPanelParametrosReportesPreguntaEquivalencia;
	protected JPanel jPanelParametrosReportesAccionesPreguntaEquivalencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PreguntaEquivalencia;
	protected JPanel jPanelParametrosAuxiliar2PreguntaEquivalencia;
	protected JPanel jPanelParametrosAuxiliar3PreguntaEquivalencia;
	protected JPanel jPanelParametrosAuxiliar4PreguntaEquivalencia;
	//protected JPanel jPanelParametrosAuxiliar5PreguntaEquivalencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoPreguntaEquivalencia;
	//protected JPanel jPanelImportacionPreguntaEquivalencia;
	
	
	public JTable jTableDatosPreguntaEquivalencia;
	
	
	
	//public JTable jTableDatosPreguntaEquivalenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPreguntaEquivalencia;
	protected JButton jButtonDuplicarPreguntaEquivalencia;
	protected JButton jButtonCopiarPreguntaEquivalencia;
	protected JButton jButtonVerFormPreguntaEquivalencia;
	protected JButton jButtonNuevoRelacionesPreguntaEquivalencia;
	protected JButton jButtonModificarPreguntaEquivalencia;
	
    protected JButton jButtonGuardarCambiosTablaPreguntaEquivalencia;
	protected JButton jButtonCerrarPreguntaEquivalencia;
	
	
	protected JButton jButtonRecargarInformacionPreguntaEquivalencia;
	protected JButton jButtonProcesarInformacionPreguntaEquivalencia;
	
	
	protected JButton jButtonAnterioresPreguntaEquivalencia;
	protected JButton jButtonSiguientesPreguntaEquivalencia;
	protected JButton jButtonNuevoGuardarCambiosPreguntaEquivalencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPreguntaEquivalencia;
	//protected JButton jButtonCerrarReporteDinamicoPreguntaEquivalencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionPreguntaEquivalencia;
	//protected JButton jButtonGenerarImportacionPreguntaEquivalencia;
	//protected JButton jButtonCerrarImportacionPreguntaEquivalencia;
	//protected JFileChooser jFileChooserImportacionPreguntaEquivalencia;
	//protected File fileImportacionPreguntaEquivalencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaEquivalencia;
	protected JButton jButtonDuplicarToolBarPreguntaEquivalencia;
	protected JButton jButtonNuevoRelacionesToolBarPreguntaEquivalencia;
	
	
	public JButton jButtonGuardarCambiosToolBarPreguntaEquivalencia;
	protected JButton jButtonCopiarToolBarPreguntaEquivalencia;
	protected JButton jButtonVerFormToolBarPreguntaEquivalencia;
	public JButton jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaEquivalencia;
	protected JButton jButtonCerrarToolBarPreguntaEquivalencia;
	
	protected JButton jButtonRecargarInformacionToolBarPreguntaEquivalencia;
	protected JButton jButtonProcesarInformacionToolBarPreguntaEquivalencia;
	protected JButton jButtonAnterioresToolBarPreguntaEquivalencia;
	protected JButton jButtonSiguientesToolBarPreguntaEquivalencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia;
	protected JButton jButtonAbrirOrderByToolBarPreguntaEquivalencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaEquivalencia;
	protected JMenuItem jMenuItemDuplicarPreguntaEquivalencia;
	protected JMenuItem jMenuItemNuevoRelacionesPreguntaEquivalencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPreguntaEquivalencia;
	protected JMenuItem jMenuItemCopiarPreguntaEquivalencia;
	protected JMenuItem jMenuItemVerFormPreguntaEquivalencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaEquivalencia;
	protected JMenuItem jMenuItemCerrarPreguntaEquivalencia;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaEquivalencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPreguntaEquivalencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaEquivalencia;
	
	protected JMenuItem jMenuItemRecargarInformacionPreguntaEquivalencia;
	protected JMenuItem jMenuItemProcesarInformacionPreguntaEquivalencia;
	protected JMenuItem jMenuItemAnterioresPreguntaEquivalencia;
	protected JMenuItem jMenuItemSiguientesPreguntaEquivalencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaEquivalencia;
	protected JMenuItem jMenuItemAbrirOrderByPreguntaEquivalencia;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaEquivalencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaEquivalencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPreguntaEquivalencia;
	protected JCheckBox jCheckBoxSeleccionadosPreguntaEquivalencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPreguntaEquivalencia;
	protected JCheckBox jCheckBoxConGraficoReportePreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPreguntaEquivalencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPreguntaEquivalencia;
	protected JTextField jTextFieldValorCampoGeneralPreguntaEquivalencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePreguntaEquivalencia;
	//public JList<Reporte> jListColumnasSelectReportePreguntaEquivalencia;
	//public JScrollPane jScrollColumnasSelectReportePreguntaEquivalencia;
	
	//public JLabel jLabelRelacionesSelectReportePreguntaEquivalencia;
	//public JList<Reporte> jListRelacionesSelectReportePreguntaEquivalencia;
	//public JScrollPane jScrollRelacionesSelectReportePreguntaEquivalencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPreguntaEquivalencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPreguntaEquivalencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia;
	
		
	//public JLabel jLabelArchivoImportacionPreguntaEquivalencia;	
	//public JLabel jLabelPathArchivoImportacionPreguntaEquivalencia;
	//protected JTextField jTextFieldPathArchivoImportacionPreguntaEquivalencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPreguntaEquivalencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia;
	
	//public JLabel jLabelColumnaCategoriaValorPreguntaEquivalencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPreguntaEquivalencia;
	
	//public JLabel jLabelColumnasValoresGraficoPreguntaEquivalencia;
	//public JList<Reporte> jListColumnasValoresGraficoPreguntaEquivalencia;
	//public JScrollPane jScrollColumnasValoresGraficoPreguntaEquivalencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPreguntaEquivalencia;
	public JPanel jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	public JButton jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	
	public JPanel jPanelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	public JLabel jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	public JLabel jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia;
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PreguntaEquivalenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPreguntaEquivalencia)	{
		this.jButtonRecargarInformacionPreguntaEquivalencia = jButtonRecargarInformacionPreguntaEquivalencia;
	}
	
	public JButton getjButtonProcesarInformacionPreguntaEquivalencia() {
		return this.jButtonProcesarInformacionPreguntaEquivalencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaEquivalencia)	{
		this.jButtonProcesarInformacionPreguntaEquivalencia = jButtonProcesarInformacionPreguntaEquivalencia;
	}
	
	
	public JButton getjButtonRecargarInformacionPreguntaEquivalencia() {
		return this.jButtonRecargarInformacionPreguntaEquivalencia;
	}
	
	
	public List<PreguntaEquivalencia> getpreguntaequivalencias() {
		return this.preguntaequivalencias;
	}

	public void setpreguntaequivalencias(List<PreguntaEquivalencia> preguntaequivalencias) {
		this.preguntaequivalencias = preguntaequivalencias;
	}
	
	public List<PreguntaEquivalencia> getpreguntaequivalenciasAux() {
		return this.preguntaequivalenciasAux;
	}

	public void setpreguntaequivalenciasAux(List<PreguntaEquivalencia> preguntaequivalenciasAux) {
		this.preguntaequivalenciasAux = preguntaequivalenciasAux;
	}
	
	public List<PreguntaEquivalencia> getpreguntaequivalenciasEliminados() {
		return this.preguntaequivalenciasEliminados;
	}

	public void setPreguntaEquivalenciasEliminados(List<PreguntaEquivalencia> preguntaequivalenciasEliminados) {
		this.preguntaequivalenciasEliminados = preguntaequivalenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPreguntaEquivalencia() {
		return jComboBoxTiposSeleccionarPreguntaEquivalencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPreguntaEquivalencia(
			JComboBox jComboBoxTiposSeleccionarPreguntaEquivalencia) {
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia = jComboBoxTiposSeleccionarPreguntaEquivalencia;
	}
	
	public void setBorderResaltarTiposSeleccionarPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPreguntaEquivalencia() {
		return jTextFieldValorCampoGeneralPreguntaEquivalencia;
	}

	public void setjTextFieldValorCampoGeneralPreguntaEquivalencia(
			JTextField jTextFieldValorCampoGeneralPreguntaEquivalencia) {
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia = jTextFieldValorCampoGeneralPreguntaEquivalencia;
	}

	public void setBorderResaltarValorCampoGeneralPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPreguntaEquivalencia() {
		return this.jCheckBoxSeleccionarTodosPreguntaEquivalencia;
	}

	public void setjCheckBoxSeleccionarTodosPreguntaEquivalencia(
			JCheckBox jCheckBoxSeleccionarTodosPreguntaEquivalencia) {
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia = jCheckBoxSeleccionarTodosPreguntaEquivalencia;
	}

	public void setBorderResaltarSeleccionarTodosPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPreguntaEquivalencia() {
		return this.jCheckBoxSeleccionadosPreguntaEquivalencia;
	}

	public void setjCheckBoxSeleccionadosPreguntaEquivalencia(
			JCheckBox jCheckBoxSeleccionadosPreguntaEquivalencia) {
		this.jCheckBoxSeleccionadosPreguntaEquivalencia = jCheckBoxSeleccionadosPreguntaEquivalencia;
	}
	
	public void setBorderResaltarSeleccionadosPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPreguntaEquivalencia() {
		return this.jComboBoxTiposArchivosReportesPreguntaEquivalencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPreguntaEquivalencia(
			JComboBox jComboBoxTiposArchivosReportesPreguntaEquivalencia) {
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia = jComboBoxTiposArchivosReportesPreguntaEquivalencia;
	}

	public void setBorderResaltarTiposArchivosReportesPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPreguntaEquivalencia() {
		return this.jComboBoxTiposReportesPreguntaEquivalencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPreguntaEquivalencia(
			JComboBox jComboBoxTiposReportesPreguntaEquivalencia) {
		this.jComboBoxTiposReportesPreguntaEquivalencia = jComboBoxTiposReportesPreguntaEquivalencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPreguntaEquivalencia() {
	//	return jComboBoxTiposReportesDinamicoPreguntaEquivalencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPreguntaEquivalencia(
	//		JComboBox jComboBoxTiposReportesDinamicoPreguntaEquivalencia) {
	//	this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia = jComboBoxTiposReportesDinamicoPreguntaEquivalencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia = jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia;
	//}
	
	public void setBorderResaltarTiposReportesPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPreguntaEquivalencia() {
		return this.jComboBoxTiposGraficosReportesPreguntaEquivalencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPreguntaEquivalencia(
			JComboBox jComboBoxTiposGraficosReportesPreguntaEquivalencia) {
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia = jComboBoxTiposGraficosReportesPreguntaEquivalencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPreguntaEquivalencia() {
		return this.jComboBoxTiposPaginacionPreguntaEquivalencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPreguntaEquivalencia(
			JComboBox jComboBoxTiposPaginacionPreguntaEquivalencia) {
		this.jComboBoxTiposPaginacionPreguntaEquivalencia = jComboBoxTiposPaginacionPreguntaEquivalencia;
	}
	
	public void setBorderResaltarTiposPaginacionPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPreguntaEquivalencia() {
		return this.jComboBoxTiposRelacionesPreguntaEquivalencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaEquivalencia() {
		return this.jComboBoxTiposAccionesPreguntaEquivalencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaEquivalencia(
			JComboBox jComboBoxTiposRelacionesPreguntaEquivalencia) {
		this.jComboBoxTiposRelacionesPreguntaEquivalencia = jComboBoxTiposRelacionesPreguntaEquivalencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaEquivalencia(
			JComboBox jComboBoxTiposAccionesPreguntaEquivalencia) {
		this.jComboBoxTiposAccionesPreguntaEquivalencia = jComboBoxTiposAccionesPreguntaEquivalencia;
	}
	
	public void setBorderResaltarTiposRelacionesPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPreguntaEquivalencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPreguntaEquivalencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPreguntaEquivalencia() {
	//	return jCheckBoxConGraficoDinamicoPreguntaEquivalencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoPreguntaEquivalencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoPreguntaEquivalencia) {
	//	this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia = jCheckBoxConGraficoDinamicoPreguntaEquivalencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPreguntaEquivalencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPreguntaEquivalencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia .setBorder(borderResaltar);		
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
		this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		
		this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaequivalenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaEquivalenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Preguntas Equivalencia MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		PreguntaEquivalenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPreguntaEquivalencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"nuevo","nuevo","Nuevo"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"duplicar","duplicar","Duplicar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"copiar","copiar","Copiar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"ver_form","ver_form","Ver"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"recargar","recargar","Recargar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,
							"cerrar","cerrar","Salir"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPreguntaEquivalencia;
			
				this.jButtonProcesarInformacionToolBarPreguntaEquivalencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPreguntaEquivalencia;
				
		//protected JButton jButtonModificarToolBarPreguntaEquivalencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPreguntaEquivalencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPreguntaEquivalencia=new JMenuMe("General");
		this.jmenuArchivoPreguntaEquivalencia=new JMenuMe("Archivo");
		this.jmenuAccionesPreguntaEquivalencia=new JMenuMe("Acciones");
		this.jmenuDatosPreguntaEquivalencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaEquivalencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaEquivalencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaEquivalencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPreguntaEquivalencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPreguntaEquivalencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPreguntaEquivalencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPreguntaEquivalencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPreguntaEquivalencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPreguntaEquivalencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPreguntaEquivalencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaEquivalencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaEquivalencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPreguntaEquivalencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPreguntaEquivalencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPreguntaEquivalencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPreguntaEquivalencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPreguntaEquivalencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPreguntaEquivalencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaEquivalencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaEquivalencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaEquivalencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPreguntaEquivalencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPreguntaEquivalencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPreguntaEquivalencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPreguntaEquivalencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPreguntaEquivalencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPreguntaEquivalencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPreguntaEquivalencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPreguntaEquivalencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPreguntaEquivalencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPreguntaEquivalencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPreguntaEquivalencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPreguntaEquivalencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPreguntaEquivalencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPreguntaEquivalencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPreguntaEquivalencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaEquivalencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaEquivalencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaEquivalencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPreguntaEquivalencia.add(this.jMenuItemCerrarPreguntaEquivalencia);
			
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemNuevoPreguntaEquivalencia);
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia);
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemNuevoRelacionesPreguntaEquivalencia);
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia);		
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemDuplicarPreguntaEquivalencia);		
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemCopiarPreguntaEquivalencia);		
			this.jmenuAccionesPreguntaEquivalencia.add(this.jMenuItemVerFormPreguntaEquivalencia);		
			
			this.jmenuDatosPreguntaEquivalencia.add(this.jMenuItemRecargarInformacionPreguntaEquivalencia);				
			this.jmenuDatosPreguntaEquivalencia.add(this.jMenuItemAnterioresPreguntaEquivalencia);				
			this.jmenuDatosPreguntaEquivalencia.add(this.jMenuItemSiguientesPreguntaEquivalencia);				
			this.jmenuDatosPreguntaEquivalencia.add(this.jMenuItemAbrirOrderByPreguntaEquivalencia);				
			this.jmenuDatosPreguntaEquivalencia.add(this.jMenuItemMostrarOcultarPreguntaEquivalencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPreguntaEquivalencia.add(this.jMenuItemGuardarCambiosPreguntaEquivalencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPreguntaEquivalencia.add(this.jmenuArchivoPreguntaEquivalencia);		
			this.jmenuBarPreguntaEquivalencia.add(this.jmenuAccionesPreguntaEquivalencia);		
			this.jmenuBarPreguntaEquivalencia.add(this.jmenuDatosPreguntaEquivalencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPreguntaEquivalencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPreguntaEquivalencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new JButtonMe();
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setText("Buscar");
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia,"buscar_button","Buscar Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia = new JLabelMe();
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia = new JLabelMe();
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setText("Periodo :");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setToolTipText("Periodo");
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPreguntaEquivalencia=new JTabbedPane();


		this.jTabbedPaneBusquedasPreguntaEquivalencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaEquivalencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaEquivalencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPreguntaEquivalencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePreguntaEquivalencia = new PreguntaEquivalenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Preguntas Equivalencia DATOS");
			this.jInternalFrameDetalleFormPreguntaEquivalencia = new PreguntaEquivalenciaDetalleFormJInternalFrame(jDesktopPane,this.preguntaequivalenciaSessionBean.getConGuardarRelaciones(),this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPreguntaEquivalencia = null;//new PreguntaEquivalenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaEquivalencia= new GridBagLayout();
		
		
		this.jTableDatosPreguntaEquivalencia = new JTableMe();      
		
		String sToolTipPreguntaEquivalencia="";
		sToolTipPreguntaEquivalencia=PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaEquivalencia+="(Cartera.PreguntaEquivalencia)";
		}
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaEquivalencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPreguntaEquivalencia.setToolTipText(sToolTipPreguntaEquivalencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPreguntaEquivalencia);
		this.jTableDatosPreguntaEquivalencia.setAutoCreateRowSorter(true);
		this.jTableDatosPreguntaEquivalencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPreguntaEquivalencia.setRowSelectionAllowed(true);
		this.jTableDatosPreguntaEquivalencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPreguntaEquivalencia = new JButtonMe();
		this.jButtonDuplicarPreguntaEquivalencia = new JButtonMe();
		this.jButtonCopiarPreguntaEquivalencia = new JButtonMe();
		this.jButtonVerFormPreguntaEquivalencia = new JButtonMe();
		this.jButtonNuevoRelacionesPreguntaEquivalencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia = new JButtonMe();
		this.jButtonCerrarPreguntaEquivalencia = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaEquivalencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralPreguntaEquivalencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Preguntas Equivalencia";
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaEquivalencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaEquivalencia.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaEquivalencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPreguntaEquivalencia=new ReporteDinamicoJInternalFrame(PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPreguntaEquivalencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPreguntaEquivalencia=new ImportacionJInternalFrame(PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPreguntaEquivalencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPreguntaEquivalencia = new JButtonMe();
		
		this.jButtonAbrirOrderByPreguntaEquivalencia.setText("Orden");
		this.jButtonAbrirOrderByPreguntaEquivalencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaEquivalencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaEquivalencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEquivalencia,false,this);
			
			//this.cargarOrderByPreguntaEquivalencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaEquivalencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEquivalencia,true,this);
			
			//this.cargarOrderByPreguntaEquivalencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPreguntaEquivalencia.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosPreguntaEquivalencia.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosPreguntaEquivalencia.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosPreguntaEquivalencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaEquivalencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaEquivalencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPreguntaEquivalencia.setText("Nuevo");
		this.jButtonDuplicarPreguntaEquivalencia.setText("Duplicar");
		this.jButtonCopiarPreguntaEquivalencia.setText("Copiar");
		this.jButtonVerFormPreguntaEquivalencia.setText("Ver");
		this.jButtonNuevoRelacionesPreguntaEquivalencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setText("Guardar");
		this.jButtonCerrarPreguntaEquivalencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaEquivalencia,"nuevo_button","Nuevo",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPreguntaEquivalencia,"duplicar_button","Duplicar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPreguntaEquivalencia,"copiar_button","Copiar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPreguntaEquivalencia,"ver_form","Ver",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPreguntaEquivalencia,"nuevorelaciones_button","Nuevo Rel",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaEquivalencia,"guardarcambiostabla_button","Guardar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaEquivalencia,"cerrar_button","Salir",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPreguntaEquivalencia.setToolTipText("Nuevo"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPreguntaEquivalencia.setToolTipText("Duplicar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPreguntaEquivalencia.setToolTipText("Copiar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPreguntaEquivalencia.setToolTipText("Ver"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPreguntaEquivalencia.setToolTipText("Nuevo Rel"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setToolTipText("Guardar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaEquivalencia.setToolTipText("Salir"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaEquivalencia";
		inputMap = this.jButtonNuevoPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaEquivalencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaEquivalencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarPreguntaEquivalencia";
		inputMap = this.jButtonDuplicarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPreguntaEquivalencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPreguntaEquivalencia"));
		
		//COPIAR
		sMapKey = "CopiarPreguntaEquivalencia";
		inputMap = this.jButtonCopiarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPreguntaEquivalencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPreguntaEquivalencia"));
		
		//VEr FORM
		sMapKey = "VerFormPreguntaEquivalencia";
		inputMap = this.jButtonVerFormPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPreguntaEquivalencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPreguntaEquivalencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPreguntaEquivalencia";
		inputMap = this.jButtonNuevoRelacionesPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPreguntaEquivalencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPreguntaEquivalencia";
		inputMap = this.jButtonModificarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPreguntaEquivalencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPreguntaEquivalencia";
		inputMap = this.jButtonCerrarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaEquivalencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaEquivalencia";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaEquivalencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPreguntaEquivalencia.setName("jPanelParametrosReportesPreguntaEquivalencia"); 
		
		this.jPanelParametrosReportesAccionesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPreguntaEquivalencia.setName("jPanelParametrosReportesAccionesPreguntaEquivalencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPreguntaEquivalencia = new JButtonMe();
		this.jButtonRecargarInformacionPreguntaEquivalencia.setText("Recargar");
		this.jButtonRecargarInformacionPreguntaEquivalencia.setToolTipText("Recargar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPreguntaEquivalencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPreguntaEquivalencia = new JButtonMe();
		this.jButtonProcesarInformacionPreguntaEquivalencia.setText("Procesar");
		this.jButtonProcesarInformacionPreguntaEquivalencia.setToolTipText("Procesar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPreguntaEquivalencia.setVisible(false);
			
		this.jButtonProcesarInformacionPreguntaEquivalencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaEquivalencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaEquivalencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setText("TIPO");       
		this.jComboBoxTiposReportesPreguntaEquivalencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPreguntaEquivalencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionPreguntaEquivalencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPreguntaEquivalencia.setText("Accion");
		this.jComboBoxTiposRelacionesPreguntaEquivalencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaEquivalencia.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setText("Accion");
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPreguntaEquivalencia = new JLabelMe();
		
		this.jLabelAccionesPreguntaEquivalencia.setText("Acciones");		
		this.jLabelAccionesPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPreguntaEquivalencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPreguntaEquivalencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPreguntaEquivalencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePreguntaEquivalencia.setText("Graf.");
		this.jCheckBoxConGraficoReportePreguntaEquivalencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPreguntaEquivalencia = new JButtonMe();
		//this.jButtonAnterioresPreguntaEquivalencia.setText("<<");
        this.jButtonAnterioresPreguntaEquivalencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPreguntaEquivalencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPreguntaEquivalencia = new JButtonMe();
		//this.jButtonSiguientesPreguntaEquivalencia.setText(">>");
        this.jButtonSiguientesPreguntaEquivalencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPreguntaEquivalencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPreguntaEquivalencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPreguntaEquivalencia,"nuevoguardarcambios_button","Nue",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPreguntaEquivalencia";
		inputMap = this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPreguntaEquivalencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPreguntaEquivalencia";
		inputMap = this.jButtonRecargarInformacionPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPreguntaEquivalencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPreguntaEquivalencia";
		inputMap = this.jButtonSiguientesPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPreguntaEquivalencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPreguntaEquivalencia";
		inputMap = this.jButtonAnterioresPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPreguntaEquivalencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPreguntaEquivalencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPreguntaEquivalencia.setMinimumSize(new Dimension(this.getWidth(),PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaEquivalencia.setMaximumSize(new Dimension(this.getWidth(),PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaEquivalencia.setPreferredSize(new Dimension(this.getWidth(),PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaEquivalenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPreguntaEquivalencia = new GridBagLayout();

			this.jPanelPaginacionPreguntaEquivalencia.setLayout(gridaBagLayoutPaginacionPreguntaEquivalencia);						
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonAnterioresPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					
						
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
			
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonNuevoGuardarCambiosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
						
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonSiguientesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonNuevoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
						
			
			
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
				this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonGuardarCambiosTablaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			}
			
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonDuplicarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonCopiarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonVerFormPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 1;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPreguntaEquivalencia.add(this.jButtonCerrarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		
		this.jButtonRecargarInformacionPreguntaEquivalencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaEquivalencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaEquivalencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPreguntaEquivalencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaEquivalencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaEquivalencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPreguntaEquivalencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaEquivalencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaEquivalencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePreguntaEquivalencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaEquivalencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaEquivalencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPreguntaEquivalencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaEquivalencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaEquivalencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPreguntaEquivalencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPreguntaEquivalencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PreguntaEquivalencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PreguntaEquivalencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PreguntaEquivalencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PreguntaEquivalencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPreguntaEquivalencia.setLayout(gridaBagParametrosReportesPreguntaEquivalencia);
			this.jPanelParametrosReportesAccionesPreguntaEquivalencia.setLayout(gridaBagParametrosReportesAccionesPreguntaEquivalencia);
			
			
			this.jPanelParametrosAuxiliar1PreguntaEquivalencia.setLayout(gridaBagParametrosAuxiliar1PreguntaEquivalencia);
			this.jPanelParametrosAuxiliar2PreguntaEquivalencia.setLayout(gridaBagParametrosAuxiliar2PreguntaEquivalencia);
			this.jPanelParametrosAuxiliar3PreguntaEquivalencia.setLayout(gridaBagParametrosAuxiliar3PreguntaEquivalencia);
			this.jPanelParametrosAuxiliar4PreguntaEquivalencia.setLayout(gridaBagParametrosAuxiliar4PreguntaEquivalencia);
			//this.jPanelParametrosAuxiliar5PreguntaEquivalencia.setLayout(gridaBagParametrosAuxiliar2PreguntaEquivalencia);			
			
			
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jButtonRecargarInformacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEquivalencia.add(this.jComboBoxTiposPaginacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEquivalencia.add(this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaEquivalencia.add(this.jComboBoxTiposArchivosReportesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jPanelParametrosAuxiliar1PreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PreguntaEquivalencia.add(this.jComboBoxTiposReportesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);																		
			
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PreguntaEquivalencia.add(this.jComboBoxTiposGraficosReportesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jPanelParametrosAuxiliar4PreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jComboBoxTiposReportesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jCheckBoxGenerarReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jPanelParametrosAuxiliar2PreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jLabelAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jButtonAbrirOrderByPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jComboBoxTiposSeleccionarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			
			
			/*
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jCheckBoxSeleccionarTodosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jCheckBoxConGraficoReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEquivalencia.add(this.jCheckBoxSeleccionarTodosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);															
				
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEquivalencia.add(this.jCheckBoxSeleccionadosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);															
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaEquivalencia.add(this.jCheckBoxConGraficoReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jPanelParametrosAuxiliar3PreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jComboBoxTiposAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
	
				
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaEquivalencia.add(this.jTextFieldValorCampoGeneralPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPreguntaEquivalencia = new GridBagLayout();

			this.jScrollPanelDatosPreguntaEquivalencia.setLayout(gridaBagLayoutDatosPreguntaEquivalencia);
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
			
			this.jScrollPanelDatosPreguntaEquivalencia.add(this.jTableDatosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPreguntaEquivalencia.setViewportView(this.jTableDatosPreguntaEquivalencia);
		this.jTableDatosPreguntaEquivalencia.setFillsViewportHeight(true);
		this.jTableDatosPreguntaEquivalencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPreguntaEquivalencia= new GridBagLayout();
		this.jPanelAccionesPreguntaEquivalencia.setLayout(gridaBagLayoutAccionesPreguntaEquivalencia);
		
		
		/*	
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
			
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonNuevoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setLayout(gridaBagLayoutBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);

		gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		gridBagConstraintsPreguntaEquivalencia.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.add(jLabelid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);

		gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		gridBagConstraintsPreguntaEquivalencia.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.add(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);


		gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEquivalencia.gridy = 1;
		gridBagConstraintsPreguntaEquivalencia.gridx = 0;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.add(jLabelid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);

		gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEquivalencia.gridy = 1;
		gridBagConstraintsPreguntaEquivalencia.gridx = 1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.add(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);

		gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaEquivalencia.gridy = 2;
		gridBagConstraintsPreguntaEquivalencia.gridx =1;
		jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.add(jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);

		jTabbedPaneBusquedasPreguntaEquivalencia.addTab("1.-Por Ejercicio Por Periodo ", jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
		jTabbedPaneBusquedasPreguntaEquivalencia.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaEquivalencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;		
			//this.gridBagConstraintsPreguntaEquivalencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaEquivalencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;		
		//this.gridBagConstraintsPreguntaEquivalencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPreguntaEquivalencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;		
			this.gridBagConstraintsPreguntaEquivalencia.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPreguntaEquivalencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);								
		
		
		/*
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		*/		
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEquivalencia.gridx =0;
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaEquivalencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
				
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPreguntaEquivalencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaEquivalencia = new GridBagLayout();
			this.jPanelBusquedasParametrosPreguntaEquivalencia.setLayout(gridaBagLayoutBusquedasParametrosPreguntaEquivalencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPreguntaEquivalencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPreguntaEquivalencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPreguntaEquivalencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPreguntaEquivalencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPreguntaEquivalencia.setName("jPanelReporteDinamicoPreguntaEquivalencia"); 
		
		this.jPanelReporteDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPreguntaEquivalencia.setLayout(gridaBagLayoutReporteDinamicoPreguntaEquivalencia);
		
		
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaEquivalencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePreguntaEquivalencia = new JLabelMe();

		this.jLabelColumnasSelectReportePreguntaEquivalencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelColumnasSelectReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePreguntaEquivalencia = new JList<Reporte>();
		this.jListColumnasSelectReportePreguntaEquivalencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePreguntaEquivalencia=new JScrollPane(this.jListColumnasSelectReportePreguntaEquivalencia);
			
			this.jScrollColumnasSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jListColumnasSelectReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jScrollColumnasSelectReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePreguntaEquivalencia = new JLabelMe();

		this.jLabelRelacionesSelectReportePreguntaEquivalencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePreguntaEquivalencia = new JList<Reporte>();
		this.jListRelacionesSelectReportePreguntaEquivalencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePreguntaEquivalencia=new JScrollPane(this.jListRelacionesSelectReportePreguntaEquivalencia);
			
			this.jScrollRelacionesSelectReportePreguntaEquivalencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaEquivalencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaEquivalencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoPreguntaEquivalencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPreguntaEquivalencia = new JLabelMe();

		this.jLabelConGraficoDinamicoPreguntaEquivalencia.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelConGraficoDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jCheckBoxConGraficoDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelColumnaCategoriaGraficoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPreguntaEquivalencia = new JLabelMe();

		this.jLabelColumnaCategoriaValorPreguntaEquivalencia.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelColumnaCategoriaValorPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jComboBoxColumnaCategoriaValorPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPreguntaEquivalencia = new JLabelMe();

		this.jLabelColumnasValoresGraficoPreguntaEquivalencia.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelColumnasValoresGraficoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPreguntaEquivalencia = new JList<Reporte>();
		this.jListColumnasValoresGraficoPreguntaEquivalencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPreguntaEquivalencia.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPreguntaEquivalencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreguntaEquivalencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreguntaEquivalencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPreguntaEquivalencia=new JScrollPane(this.jListColumnasValoresGraficoPreguntaEquivalencia);
			
			this.jScrollColumnasValoresGraficoPreguntaEquivalencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreguntaEquivalencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreguntaEquivalencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jListColumnasSelectReportePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jScrollColumnasValoresGraficoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelTiposGraficosReportesDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreguntaEquivalencia.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jComboBoxTiposGraficosReportesDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelGenerarExcelReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia.setToolTipText("Generar EXCEL"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jComboBoxTiposReportesDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jLabelTiposArchivoReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jComboBoxTiposArchivosReportesDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPreguntaEquivalencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPreguntaEquivalencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPreguntaEquivalencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPreguntaEquivalencia.setToolTipText("Generar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jButtonGenerarReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPreguntaEquivalencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPreguntaEquivalencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPreguntaEquivalencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPreguntaEquivalencia.setToolTipText("Cancelar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaEquivalencia.add(this.jButtonCerrarReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPreguntaEquivalencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia= new JScrollPane(jPanelReporteDinamicoPreguntaEquivalencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPreguntaEquivalencia);
		this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getContentPane().add(this.jScrollPanelReporteDinamicoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPreguntaEquivalencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPreguntaEquivalencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPreguntaEquivalencia.setName("jPanelImportacionPreguntaEquivalencia"); 
		
		this.jPanelImportacionPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPreguntaEquivalencia.setLayout(gridaBagLayoutImportacionPreguntaEquivalencia);
		
		
		this.jInternalFrameImportacionPreguntaEquivalencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPreguntaEquivalencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPreguntaEquivalencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaEquivalencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPreguntaEquivalencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaEquivalencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPreguntaEquivalencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaEquivalencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaEquivalencia.setResizable(true);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setClosable(true);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPreguntaEquivalencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaEquivalencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPreguntaEquivalencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaEquivalencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaEquivalencia.setResizable(true);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setClosable(true);
	    this.jInternalFrameImportacionPreguntaEquivalencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPreguntaEquivalencia = new JLabelMe();

		this.jLabelArchivoImportacionPreguntaEquivalencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaEquivalencia.add(this.jLabelArchivoImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPreguntaEquivalencia = new JFileChooser();		
		this.jFileChooserImportacionPreguntaEquivalencia.setToolTipText("ESCOGER ARCHIVO"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPreguntaEquivalencia = new JButtonMe();
		this.jButtonAbrirImportacionPreguntaEquivalencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPreguntaEquivalencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPreguntaEquivalencia.setToolTipText("Generar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEquivalencia.add(this.jButtonAbrirImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPreguntaEquivalencia = new JLabelMe();

		this.jLabelPathArchivoImportacionPreguntaEquivalencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaEquivalencia.add(this.jLabelPathArchivoImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPreguntaEquivalencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPreguntaEquivalencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaEquivalencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaEquivalencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEquivalencia.add(this.jTextFieldPathArchivoImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPreguntaEquivalencia = new JButtonMe();
		this.jButtonGenerarImportacionPreguntaEquivalencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPreguntaEquivalencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPreguntaEquivalencia.setToolTipText("Generar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEquivalencia.add(this.jButtonGenerarImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPreguntaEquivalencia = new JButtonMe();
		this.jButtonCerrarImportacionPreguntaEquivalencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPreguntaEquivalencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPreguntaEquivalencia.setToolTipText("Cancelar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaEquivalencia.add(this.jButtonCerrarImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPreguntaEquivalencia = new GridBagLayout();
		
		this.jScrollPanelImportacionPreguntaEquivalencia= new JScrollPane(jPanelImportacionPreguntaEquivalencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iPosYImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXImportacion;
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPreguntaEquivalencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPreguntaEquivalencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPreguntaEquivalencia);
		this.jInternalFrameImportacionPreguntaEquivalencia.getContentPane().add(this.jScrollPanelImportacionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPreguntaEquivalencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPreguntaEquivalencia = new JButtonMe();
			this.jButtonAbrirOrderByPreguntaEquivalencia.setText("Orden");
			this.jButtonAbrirOrderByPreguntaEquivalencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaEquivalencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPreguntaEquivalencia";
			inputMap = this.jButtonAbrirOrderByPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPreguntaEquivalencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByPreguntaEquivalencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPreguntaEquivalencia.setName("jPanelOrderByPreguntaEquivalencia"); 
			
			this.jPanelOrderByPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPreguntaEquivalencia.setLayout(gridaBagLayoutOrderByPreguntaEquivalencia);
			
			
			this.jTableDatosPreguntaEquivalenciaOrderBy = new JTableMe();        
			this.jTableDatosPreguntaEquivalenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPreguntaEquivalenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPreguntaEquivalenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPreguntaEquivalenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPreguntaEquivalenciaOrderBy.setViewportView(this.jTableDatosPreguntaEquivalenciaOrderBy);
			this.jTableDatosPreguntaEquivalenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPreguntaEquivalenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPreguntaEquivalencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPreguntaEquivalencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPreguntaEquivalencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePreguntaEquivalencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPreguntaEquivalencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPreguntaEquivalencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPreguntaEquivalencia.setTitle("Orden");
			this.jInternalFrameOrderByPreguntaEquivalencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPreguntaEquivalencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPreguntaEquivalencia.setResizable(true);
			this.jInternalFrameOrderByPreguntaEquivalencia.setClosable(true);
			this.jInternalFrameOrderByPreguntaEquivalencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPreguntaEquivalencia.ipady =150;
				
			this.jPanelOrderByPreguntaEquivalencia.add(jScrollPanelDatosPreguntaEquivalenciaOrderBy, this.gridBagConstraintsPreguntaEquivalencia);//this.jTableDatosPreguntaEquivalenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPreguntaEquivalencia = new JButtonMe();
			this.jButtonCerrarOrderByPreguntaEquivalencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPreguntaEquivalencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPreguntaEquivalencia.setToolTipText("Cancelar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPreguntaEquivalencia.add(this.jButtonCerrarOrderByPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPreguntaEquivalencia = new GridBagLayout();
			
			this.jScrollPanelOrderByPreguntaEquivalencia= new JScrollPane(jPanelOrderByPreguntaEquivalencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPreguntaEquivalencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPreguntaEquivalencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPreguntaEquivalencia);
			
			this.jInternalFrameOrderByPreguntaEquivalencia.getContentPane().add(this.jScrollPanelOrderByPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
		
		} else {
			this.jButtonAbrirOrderByPreguntaEquivalencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPreguntaEquivalencia.getRowHeight();//PreguntaEquivalenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.isSelected()) {
					iHeightTable=PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaEquivalencia.isSelected()) {
					iHeightTable=PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaEquivalenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPreguntaEquivalencia!=null && this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy()!=null) {
			//if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPreguntaEquivalencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPreguntaEquivalencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPreguntaEquivalencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=preguntaequivalenciaLogic.getPreguntaEquivalencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaequivalencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PreguntaEquivalencia> TraerPreguntaEquivalenciaBeans(List<PreguntaEquivalencia> preguntaequivalencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalencias) {
					
				if(!(PreguntaEquivalenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PreguntaEquivalenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					preguntaequivalencia.setsDetalleGeneralEntityReporte(PreguntaEquivalenciaConstantesFunciones.getPreguntaEquivalenciaDescripcion(preguntaequivalencia));
										
						
					
						
					
				} else  {
							
					//preguntaequivalencia.setsDetalleGeneralEntityReporte(preguntaequivalencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//preguntaequivalenciabeans.add(preguntaequivalenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return preguntaequivalencias;
    }
	//PARA REPORTES FIN
}
