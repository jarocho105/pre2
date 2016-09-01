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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.EvaluacionesFactoresConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class EvaluacionesFactoresJInternalFrame extends EvaluacionesFactoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionesFactores;
	
	protected JMenuBar jmenuBarEvaluacionesFactores;
	
	protected JMenu jmenuEvaluacionesFactores;
	protected JMenu jmenuDatosEvaluacionesFactores;
	protected JMenu jmenuArchivoEvaluacionesFactores;
	protected JMenu jmenuAccionesEvaluacionesFactores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesFactores;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesFactores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionesFactoresDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionesFactores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionesFactores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionesFactores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";
	
	public EvaluacionesFactoresSessionBean evaluacionesfactoresSessionBean;
		
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionesFactores> evaluacionesfactoress;		
	public List<EvaluacionesFactores> evaluacionesfactoressEliminados;	
	public List<EvaluacionesFactores> evaluacionesfactoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionesFactores;		
	protected JButton jButtonAbrirOrderByEvaluacionesFactores;
	
	
	//protected JPanel jPanelOrderByEvaluacionesFactores;
	//public JScrollPane jScrollPanelOrderByEvaluacionesFactores;	
	//protected JButton jButtonCerrarOrderByEvaluacionesFactores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionesFactoresLogic evaluacionesfactoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionesFactores;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesFactores;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesFactores;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionesFactoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionesFactores;
	//public JScrollPane jScrollPanelImportacionEvaluacionesFactores;
	
	
	
	protected JPanel jPanelAccionesEvaluacionesFactores;
	
    protected JPanel jPanelPaginacionEvaluacionesFactores;
    protected JPanel jPanelParametrosReportesEvaluacionesFactores;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionesFactores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionesFactores;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionesFactores;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionesFactores;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionesFactores;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionesFactores;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionesFactores;
	//protected JPanel jPanelImportacionEvaluacionesFactores;
	
	
	public JTable jTableDatosEvaluacionesFactores;
	
	
	
	//public JTable jTableDatosEvaluacionesFactoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionesFactores;
	protected JButton jButtonDuplicarEvaluacionesFactores;
	protected JButton jButtonCopiarEvaluacionesFactores;
	protected JButton jButtonVerFormEvaluacionesFactores;
	protected JButton jButtonNuevoRelacionesEvaluacionesFactores;
	protected JButton jButtonModificarEvaluacionesFactores;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionesFactores;
	protected JButton jButtonCerrarEvaluacionesFactores;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionesFactores;
	protected JButton jButtonProcesarInformacionEvaluacionesFactores;
	
	
	protected JButton jButtonAnterioresEvaluacionesFactores;
	protected JButton jButtonSiguientesEvaluacionesFactores;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionesFactores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionesFactores;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionesFactores;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionesFactores;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionesFactores;
	//protected JButton jButtonGenerarImportacionEvaluacionesFactores;
	//protected JButton jButtonCerrarImportacionEvaluacionesFactores;
	//protected JFileChooser jFileChooserImportacionEvaluacionesFactores;
	//protected File fileImportacionEvaluacionesFactores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesFactores;
	protected JButton jButtonDuplicarToolBarEvaluacionesFactores;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionesFactores;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionesFactores;
	protected JButton jButtonCopiarToolBarEvaluacionesFactores;
	protected JButton jButtonVerFormToolBarEvaluacionesFactores;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionesFactores;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesFactores;
	protected JButton jButtonCerrarToolBarEvaluacionesFactores;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionesFactores;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesFactores;
	protected JButton jButtonAnterioresToolBarEvaluacionesFactores;
	protected JButton jButtonSiguientesToolBarEvaluacionesFactores;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionesFactores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesFactores;
	protected JMenuItem jMenuItemDuplicarEvaluacionesFactores;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionesFactores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionesFactores;
	protected JMenuItem jMenuItemCopiarEvaluacionesFactores;
	protected JMenuItem jMenuItemVerFormEvaluacionesFactores;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesFactores;
	protected JMenuItem jMenuItemCerrarEvaluacionesFactores;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesFactores;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionesFactores;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesFactores;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionesFactores;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesFactores;
	protected JMenuItem jMenuItemAnterioresEvaluacionesFactores;
	protected JMenuItem jMenuItemSiguientesEvaluacionesFactores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesFactores;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionesFactores;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesFactores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesFactores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionesFactores;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionesFactores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionesFactores;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionesFactores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionesFactores;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionesFactores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionesFactores;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionesFactores;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionesFactores;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionesFactores;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionesFactores;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionesFactores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionesFactores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesFactores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionesFactores;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionesFactores;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionesFactores;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionesFactores;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionesFactores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionesFactores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionesFactores;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionesFactores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionesFactores;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionesFactores;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionesFactores;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionesFactores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionesFactores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionesFactores;
	public JPanel jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JButton jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores;
	
	public JPanel jPanelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JLabel jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactoresBusqueda= new JButtonMe();

	
	public JPanel jPanelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JLabel jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JCheckBox jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JButton jButtonverificadoBusquedaEvaluacionesFactoresEvaluacionesFactoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JLabel jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JButton jButtonid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactoresBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JLabel jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JTextField jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores;
	public JButton jButtoncodigoBusquedaEvaluacionesFactoresEvaluacionesFactoresBusqueda= new JButtonMe();

	
	
	
	
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
	public EvaluacionesFactoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionesFactores)	{
		this.jButtonRecargarInformacionEvaluacionesFactores = jButtonRecargarInformacionEvaluacionesFactores;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionesFactores() {
		return this.jButtonProcesarInformacionEvaluacionesFactores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesFactores)	{
		this.jButtonProcesarInformacionEvaluacionesFactores = jButtonProcesarInformacionEvaluacionesFactores;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionesFactores() {
		return this.jButtonRecargarInformacionEvaluacionesFactores;
	}
	
	
	public List<EvaluacionesFactores> getevaluacionesfactoress() {
		return this.evaluacionesfactoress;
	}

	public void setevaluacionesfactoress(List<EvaluacionesFactores> evaluacionesfactoress) {
		this.evaluacionesfactoress = evaluacionesfactoress;
	}
	
	public List<EvaluacionesFactores> getevaluacionesfactoressAux() {
		return this.evaluacionesfactoressAux;
	}

	public void setevaluacionesfactoressAux(List<EvaluacionesFactores> evaluacionesfactoressAux) {
		this.evaluacionesfactoressAux = evaluacionesfactoressAux;
	}
	
	public List<EvaluacionesFactores> getevaluacionesfactoressEliminados() {
		return this.evaluacionesfactoressEliminados;
	}

	public void setEvaluacionesFactoressEliminados(List<EvaluacionesFactores> evaluacionesfactoressEliminados) {
		this.evaluacionesfactoressEliminados = evaluacionesfactoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionesFactores() {
		return jComboBoxTiposSeleccionarEvaluacionesFactores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionesFactores(
			JComboBox jComboBoxTiposSeleccionarEvaluacionesFactores) {
		this.jComboBoxTiposSeleccionarEvaluacionesFactores = jComboBoxTiposSeleccionarEvaluacionesFactores;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionesFactores() {
		return jTextFieldValorCampoGeneralEvaluacionesFactores;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionesFactores(
			JTextField jTextFieldValorCampoGeneralEvaluacionesFactores) {
		this.jTextFieldValorCampoGeneralEvaluacionesFactores = jTextFieldValorCampoGeneralEvaluacionesFactores;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionesFactores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionesFactores() {
		return this.jCheckBoxSeleccionarTodosEvaluacionesFactores;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionesFactores(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionesFactores) {
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores = jCheckBoxSeleccionarTodosEvaluacionesFactores;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionesFactores() {
		return this.jCheckBoxSeleccionadosEvaluacionesFactores;
	}

	public void setjCheckBoxSeleccionadosEvaluacionesFactores(
			JCheckBox jCheckBoxSeleccionadosEvaluacionesFactores) {
		this.jCheckBoxSeleccionadosEvaluacionesFactores = jCheckBoxSeleccionadosEvaluacionesFactores;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionesFactores() {
		return this.jComboBoxTiposArchivosReportesEvaluacionesFactores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionesFactores(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionesFactores) {
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores = jComboBoxTiposArchivosReportesEvaluacionesFactores;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionesFactores() {
		return this.jComboBoxTiposReportesEvaluacionesFactores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionesFactores(
			JComboBox jComboBoxTiposReportesEvaluacionesFactores) {
		this.jComboBoxTiposReportesEvaluacionesFactores = jComboBoxTiposReportesEvaluacionesFactores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionesFactores() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionesFactores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionesFactores(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionesFactores) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionesFactores = jComboBoxTiposReportesDinamicoEvaluacionesFactores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores = jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionesFactores() {
		return this.jComboBoxTiposGraficosReportesEvaluacionesFactores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionesFactores(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionesFactores) {
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores = jComboBoxTiposGraficosReportesEvaluacionesFactores;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionesFactores() {
		return this.jComboBoxTiposPaginacionEvaluacionesFactores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionesFactores(
			JComboBox jComboBoxTiposPaginacionEvaluacionesFactores) {
		this.jComboBoxTiposPaginacionEvaluacionesFactores = jComboBoxTiposPaginacionEvaluacionesFactores;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionesFactores() {
		return this.jComboBoxTiposRelacionesEvaluacionesFactores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesFactores() {
		return this.jComboBoxTiposAccionesEvaluacionesFactores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesFactores(
			JComboBox jComboBoxTiposRelacionesEvaluacionesFactores) {
		this.jComboBoxTiposRelacionesEvaluacionesFactores = jComboBoxTiposRelacionesEvaluacionesFactores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesFactores(
			JComboBox jComboBoxTiposAccionesEvaluacionesFactores) {
		this.jComboBoxTiposAccionesEvaluacionesFactores = jComboBoxTiposAccionesEvaluacionesFactores;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionesFactores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionesFactores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionesFactores() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionesFactores;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionesFactores(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesFactores) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesFactores = jCheckBoxConGraficoDinamicoEvaluacionesFactores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionesFactores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionesFactores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesFactores .setBorder(borderResaltar);		
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
		this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
		
		this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesfactoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesFactoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Factores MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionesFactoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionesFactores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"copiar","copiar","Copiar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"ver_form","ver_form","Ver"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"recargar","recargar","Buscar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,
							"cerrar","cerrar","Salir"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionesFactores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionesFactores;
			
				this.jButtonProcesarInformacionToolBarEvaluacionesFactores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionesFactores;
				
		//protected JButton jButtonModificarToolBarEvaluacionesFactores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionesFactores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionesFactores=new JMenuMe("General");
		this.jmenuArchivoEvaluacionesFactores=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionesFactores=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionesFactores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesFactores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesFactores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesFactores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionesFactores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionesFactores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionesFactores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionesFactores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionesFactores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionesFactores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionesFactores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesFactores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesFactores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionesFactores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionesFactores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionesFactores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionesFactores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionesFactores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionesFactores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesFactores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionesFactores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionesFactores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesFactores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesFactores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesFactores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionesFactores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionesFactores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionesFactores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionesFactores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionesFactores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionesFactores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionesFactores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionesFactores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionesFactores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionesFactores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionesFactores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionesFactores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionesFactores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionesFactores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionesFactores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesFactores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesFactores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesFactores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesFactores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesFactores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesFactores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionesFactores.add(this.jMenuItemCerrarEvaluacionesFactores);
			
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemNuevoEvaluacionesFactores);
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores);
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemNuevoRelacionesEvaluacionesFactores);
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemGuardarCambiosTablaEvaluacionesFactores);		
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemDuplicarEvaluacionesFactores);		
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemCopiarEvaluacionesFactores);		
			this.jmenuAccionesEvaluacionesFactores.add(this.jMenuItemVerFormEvaluacionesFactores);		
			
			this.jmenuDatosEvaluacionesFactores.add(this.jMenuItemRecargarInformacionEvaluacionesFactores);				
			this.jmenuDatosEvaluacionesFactores.add(this.jMenuItemAnterioresEvaluacionesFactores);				
			this.jmenuDatosEvaluacionesFactores.add(this.jMenuItemSiguientesEvaluacionesFactores);				
			this.jmenuDatosEvaluacionesFactores.add(this.jMenuItemAbrirOrderByEvaluacionesFactores);				
			this.jmenuDatosEvaluacionesFactores.add(this.jMenuItemMostrarOcultarEvaluacionesFactores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionesFactores.add(this.jMenuItemGuardarCambiosEvaluacionesFactores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionesFactores.add(this.jmenuArchivoEvaluacionesFactores);		
			this.jmenuBarEvaluacionesFactores.add(this.jmenuAccionesEvaluacionesFactores);		
			this.jmenuBarEvaluacionesFactores.add(this.jmenuDatosEvaluacionesFactores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionesFactores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionesFactores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");
		this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores= new JButtonMe();
		this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores.setText("Buscar");
		this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores,"buscar_button","Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores = new JLabelMe();
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setText("Tipo Calificacion Empleado :");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Tipo Calificacion Empleado");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores = new JLabelMe();
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setText("Verificado :");
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Verificado");
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores= new JCheckBoxMe();
		jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores = new JLabelMe();
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setText("Estructura :");
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores = new JLabelMe();
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setText("Codigo :");
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setToolTipText("Codigo");
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores= new JTextFieldMe();
		jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEvaluacionesFactores=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionesFactores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasEvaluacionesFactores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasEvaluacionesFactores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionesFactores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEvaluacionesFactores = new EvaluacionesFactoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluaciones Factores DATOS");
			this.jInternalFrameDetalleFormEvaluacionesFactores = new EvaluacionesFactoresDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesfactoresSessionBean.getConGuardarRelaciones(),this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionesFactores = null;//new EvaluacionesFactoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesFactores= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionesFactores = new JTableMe();      
		
		String sToolTipEvaluacionesFactores="";
		sToolTipEvaluacionesFactores=EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesFactores+="(Nomina.EvaluacionesFactores)";
		}
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesFactores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionesFactores.setToolTipText(sToolTipEvaluacionesFactores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionesFactores);
		this.jTableDatosEvaluacionesFactores.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionesFactores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionesFactores.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionesFactores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionesFactores = new JButtonMe();
		this.jButtonDuplicarEvaluacionesFactores = new JButtonMe();
		this.jButtonCopiarEvaluacionesFactores = new JButtonMe();
		this.jButtonVerFormEvaluacionesFactores = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionesFactores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores = new JButtonMe();
		this.jButtonCerrarEvaluacionesFactores = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesFactores = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionesFactores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Factores";
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesFactores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesFactores.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesFactores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEvaluacionesFactores=new ReporteDinamicoJInternalFrame(EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionesFactores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionesFactores=new ImportacionJInternalFrame(EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionesFactores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionesFactores = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionesFactores.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionesFactores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesFactores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesFactores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesFactores,false,this);
			
			//this.cargarOrderByEvaluacionesFactores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesFactores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesFactores,true,this);
			
			//this.cargarOrderByEvaluacionesFactores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionesFactores.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosEvaluacionesFactores.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosEvaluacionesFactores.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosEvaluacionesFactores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesFactores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesFactores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionesFactores.setText("Nuevo");
		this.jButtonDuplicarEvaluacionesFactores.setText("Duplicar");
		this.jButtonCopiarEvaluacionesFactores.setText("Copiar");
		this.jButtonVerFormEvaluacionesFactores.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionesFactores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.setText("Guardar");
		this.jButtonCerrarEvaluacionesFactores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesFactores,"nuevo_button","Nuevo",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionesFactores,"duplicar_button","Duplicar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionesFactores,"copiar_button","Copiar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionesFactores,"ver_form","Ver",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionesFactores,"nuevorelaciones_button","Nuevo Rel",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesFactores,"guardarcambiostabla_button","Guardar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesFactores,"cerrar_button","Salir",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionesFactores.setToolTipText("Nuevo"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionesFactores.setToolTipText("Duplicar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionesFactores.setToolTipText("Copiar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionesFactores.setToolTipText("Ver"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionesFactores.setToolTipText("Nuevo Rel"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.setToolTipText("Guardar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesFactores.setToolTipText("Salir"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesFactores";
		inputMap = this.jButtonNuevoEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesFactores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesFactores"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionesFactores";
		inputMap = this.jButtonDuplicarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionesFactores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionesFactores"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionesFactores";
		inputMap = this.jButtonCopiarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionesFactores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionesFactores"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionesFactores";
		inputMap = this.jButtonVerFormEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionesFactores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionesFactores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionesFactores";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionesFactores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionesFactores";
		inputMap = this.jButtonModificarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionesFactores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesFactores";
		inputMap = this.jButtonCerrarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesFactores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesFactores";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesFactores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionesFactores.setName("jPanelParametrosReportesEvaluacionesFactores"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionesFactores.setName("jPanelParametrosReportesAccionesEvaluacionesFactores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionesFactores = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionesFactores.setText("Buscar");
		this.jButtonRecargarInformacionEvaluacionesFactores.setToolTipText("Buscar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionesFactores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEvaluacionesFactores.setVisible(false);
		
		
		this.jButtonProcesarInformacionEvaluacionesFactores = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionesFactores.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionesFactores.setToolTipText("Procesar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionesFactores.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionesFactores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesFactores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesFactores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionesFactores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionesFactores.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionesFactores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionesFactores.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionesFactores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesFactores.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesFactores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionesFactores.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionesFactores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionesFactores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesFactores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesFactores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionesFactores = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesFactores.setText("Acciones");		
		this.jLabelAccionesEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionesFactores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionesFactores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionesFactores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionesFactores.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionesFactores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionesFactores = new JButtonMe();
		//this.jButtonAnterioresEvaluacionesFactores.setText("<<");
        this.jButtonAnterioresEvaluacionesFactores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionesFactores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionesFactores = new JButtonMe();
		//this.jButtonSiguientesEvaluacionesFactores.setText(">>");
        this.jButtonSiguientesEvaluacionesFactores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionesFactores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesFactores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionesFactores.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionesFactores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionesFactores,"nuevoguardarcambios_button","Nue",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionesFactores";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionesFactores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionesFactores";
		inputMap = this.jButtonRecargarInformacionEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionesFactores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionesFactores";
		inputMap = this.jButtonSiguientesEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionesFactores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionesFactores";
		inputMap = this.jButtonAnterioresEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionesFactores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionesFactores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionesFactores.setMinimumSize(new Dimension(this.getWidth(),EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesFactores.setMaximumSize(new Dimension(this.getWidth(),EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesFactores.setPreferredSize(new Dimension(this.getWidth(),EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesFactoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionesFactores = new GridBagLayout();

			this.jPanelPaginacionEvaluacionesFactores.setLayout(gridaBagLayoutPaginacionEvaluacionesFactores);						
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonAnterioresEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					
						
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
			
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonNuevoGuardarCambiosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
						
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonSiguientesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonNuevoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
						
			
			
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
				this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonGuardarCambiosTablaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			}
			
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonDuplicarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonCopiarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonVerFormEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 1;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionesFactores.add(this.jButtonCerrarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		
		this.jButtonRecargarInformacionEvaluacionesFactores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesFactores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesFactores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesFactores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionesFactores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesFactores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesFactores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesFactores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionesFactores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesFactores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesFactores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesFactores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesFactores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionesFactores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesFactores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesFactores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionesFactores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesFactores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesFactores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionesFactores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionesFactores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionesFactores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionesFactores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionesFactores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionesFactores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionesFactores.setLayout(gridaBagParametrosReportesEvaluacionesFactores);
			this.jPanelParametrosReportesAccionesEvaluacionesFactores.setLayout(gridaBagParametrosReportesAccionesEvaluacionesFactores);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionesFactores.setLayout(gridaBagParametrosAuxiliar1EvaluacionesFactores);
			this.jPanelParametrosAuxiliar2EvaluacionesFactores.setLayout(gridaBagParametrosAuxiliar2EvaluacionesFactores);
			this.jPanelParametrosAuxiliar3EvaluacionesFactores.setLayout(gridaBagParametrosAuxiliar3EvaluacionesFactores);
			this.jPanelParametrosAuxiliar4EvaluacionesFactores.setLayout(gridaBagParametrosAuxiliar4EvaluacionesFactores);
			//this.jPanelParametrosAuxiliar5EvaluacionesFactores.setLayout(gridaBagParametrosAuxiliar2EvaluacionesFactores);			
			
			
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jButtonRecargarInformacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesFactores.add(this.jComboBoxTiposPaginacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesFactores.add(this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesFactores.add(this.jComboBoxTiposArchivosReportesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jPanelParametrosAuxiliar1EvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionesFactores.add(this.jComboBoxTiposReportesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);																		
			
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EvaluacionesFactores.add(this.jComboBoxTiposGraficosReportesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jPanelParametrosAuxiliar4EvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jComboBoxTiposReportesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jCheckBoxGenerarReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jPanelParametrosAuxiliar2EvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jLabelAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionesFactores.add(this.jButtonAbrirOrderByEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jComboBoxTiposSeleccionarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
			
			
			/*
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jCheckBoxSeleccionarTodosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jCheckBoxConGraficoReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesFactores.add(this.jCheckBoxSeleccionarTodosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);															
				
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesFactores.add(this.jCheckBoxSeleccionadosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);															
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesFactores.add(this.jCheckBoxConGraficoReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jPanelParametrosAuxiliar3EvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesFactores.add(this.jComboBoxTiposAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionesFactores = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionesFactores.setLayout(gridaBagLayoutDatosEvaluacionesFactores);
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionesFactores.add(this.jTableDatosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionesFactores.setViewportView(this.jTableDatosEvaluacionesFactores);
		this.jTableDatosEvaluacionesFactores.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionesFactores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesFactores= new GridBagLayout();
		this.jPanelAccionesEvaluacionesFactores.setLayout(gridaBagLayoutAccionesEvaluacionesFactores);
		
		
		/*	
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
			
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonNuevoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores= new GridBagLayout();
		gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.setLayout(gridaBagLayoutBusquedaEvaluacionesFactoresEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 0;
		gridBagConstraintsEvaluacionesFactores.gridx = 0;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 0;
		gridBagConstraintsEvaluacionesFactores.gridx = 1;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);


		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 1;
		gridBagConstraintsEvaluacionesFactores.gridx = 0;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jLabelverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 1;
		gridBagConstraintsEvaluacionesFactores.gridx = 1;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);


		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 2;
		gridBagConstraintsEvaluacionesFactores.gridx = 0;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jLabelid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 2;
		gridBagConstraintsEvaluacionesFactores.gridx = 1;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);


		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 3;
		gridBagConstraintsEvaluacionesFactores.gridx = 0;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jLabelcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 3;
		gridBagConstraintsEvaluacionesFactores.gridx = 1;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesFactores.gridy = 4;
		gridBagConstraintsEvaluacionesFactores.gridx =1;
		jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores.add(jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);

		jTabbedPaneBusquedasEvaluacionesFactores.addTab("1.-Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ", jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);
		jTabbedPaneBusquedasEvaluacionesFactores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesFactores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesFactores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesFactores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;		
		//this.gridBagConstraintsEvaluacionesFactores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionesFactores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;		
			this.gridBagConstraintsEvaluacionesFactores.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionesFactores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);								
		
		
		/*
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		*/		
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesFactores.gridx =0;
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesFactores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
				
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionesFactores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesFactores = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionesFactores.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionesFactores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionesFactores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionesFactores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionesFactores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionesFactores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionesFactores.setName("jPanelReporteDinamicoEvaluacionesFactores"); 
		
		this.jPanelReporteDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionesFactores.setLayout(gridaBagLayoutReporteDinamicoEvaluacionesFactores);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionesFactores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionesFactores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesFactores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionesFactores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionesFactores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionesFactores.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesFactores.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesFactores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionesFactores = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionesFactores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelColumnasSelectReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionesFactores = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionesFactores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionesFactores=new JScrollPane(this.jListColumnasSelectReporteEvaluacionesFactores);
			
			this.jScrollColumnasSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jListColumnasSelectReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jScrollColumnasSelectReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionesFactores = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionesFactores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionesFactores = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionesFactores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionesFactores=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionesFactores);
			
			this.jScrollRelacionesSelectReporteEvaluacionesFactores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesFactores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesFactores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionesFactores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionesFactores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionesFactores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionesFactores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEvaluacionesFactores = new JLabelMe();

		this.jLabelConGraficoDinamicoEvaluacionesFactores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelConGraficoDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEvaluacionesFactores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEvaluacionesFactores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jCheckBoxConGraficoDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEvaluacionesFactores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEvaluacionesFactores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelColumnaCategoriaGraficoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEvaluacionesFactores = new JLabelMe();

		this.jLabelColumnaCategoriaValorEvaluacionesFactores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelColumnaCategoriaValorEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEvaluacionesFactores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesFactores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jComboBoxColumnaCategoriaValorEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEvaluacionesFactores = new JLabelMe();

		this.jLabelColumnasValoresGraficoEvaluacionesFactores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelColumnasValoresGraficoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEvaluacionesFactores = new JList<Reporte>();
		this.jListColumnasValoresGraficoEvaluacionesFactores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEvaluacionesFactores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEvaluacionesFactores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesFactores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesFactores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEvaluacionesFactores=new JScrollPane(this.jListColumnasValoresGraficoEvaluacionesFactores);
			
			this.jScrollColumnasValoresGraficoEvaluacionesFactores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesFactores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesFactores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jListColumnasSelectReporteEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jScrollColumnasValoresGraficoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelTiposGraficosReportesDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesFactores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores.setToolTipText("Generar EXCEL"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jComboBoxTiposReportesDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionesFactores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionesFactores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionesFactores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionesFactores.setToolTipText("Generar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jButtonGenerarReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionesFactores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionesFactores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionesFactores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionesFactores.setToolTipText("Cancelar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesFactores.add(this.jButtonCerrarReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionesFactores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionesFactores= new JScrollPane(jPanelReporteDinamicoEvaluacionesFactores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionesFactores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesFactores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesFactores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionesFactores);
		this.jInternalFrameReporteDinamicoEvaluacionesFactores.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionesFactores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionesFactores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionesFactores.setName("jPanelImportacionEvaluacionesFactores"); 
		
		this.jPanelImportacionEvaluacionesFactores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesFactores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesFactores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionesFactores.setLayout(gridaBagLayoutImportacionEvaluacionesFactores);
		
		
		this.jInternalFrameImportacionEvaluacionesFactores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionesFactores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionesFactores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesFactores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionesFactores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesFactores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesFactores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionesFactores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesFactores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesFactores.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesFactores.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesFactores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionesFactores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesFactores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesFactores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionesFactores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesFactores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesFactores.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesFactores.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesFactores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionesFactores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesFactores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesFactores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionesFactores = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionesFactores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesFactores.add(this.jLabelArchivoImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionesFactores = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionesFactores.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionesFactores = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionesFactores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionesFactores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionesFactores.setToolTipText("Generar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesFactores.add(this.jButtonAbrirImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionesFactores = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionesFactores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesFactores.add(this.jLabelPathArchivoImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionesFactores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionesFactores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesFactores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesFactores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesFactores.add(this.jTextFieldPathArchivoImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionesFactores = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionesFactores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionesFactores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionesFactores.setToolTipText("Generar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesFactores.add(this.jButtonGenerarImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionesFactores = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionesFactores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionesFactores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionesFactores.setToolTipText("Cancelar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesFactores.add(this.jButtonCerrarImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionesFactores = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionesFactores= new JScrollPane(jPanelImportacionEvaluacionesFactores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionesFactores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionesFactores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionesFactores);
		this.jInternalFrameImportacionEvaluacionesFactores.getContentPane().add(this.jScrollPanelImportacionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionesFactores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionesFactores = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionesFactores.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionesFactores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesFactores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionesFactores";
			inputMap = this.jButtonAbrirOrderByEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionesFactores"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionesFactores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionesFactores.setName("jPanelOrderByEvaluacionesFactores"); 
			
			this.jPanelOrderByEvaluacionesFactores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesFactores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesFactores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionesFactores.setLayout(gridaBagLayoutOrderByEvaluacionesFactores);
			
			
			this.jTableDatosEvaluacionesFactoresOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionesFactoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionesFactoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionesFactoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionesFactoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionesFactoresOrderBy.setViewportView(this.jTableDatosEvaluacionesFactoresOrderBy);
			this.jTableDatosEvaluacionesFactoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionesFactoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionesFactores= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionesFactores= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionesFactores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionesFactores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionesFactores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionesFactores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionesFactores.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionesFactores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionesFactores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionesFactores.setResizable(true);
			this.jInternalFrameOrderByEvaluacionesFactores.setClosable(true);
			this.jInternalFrameOrderByEvaluacionesFactores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionesFactores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesFactores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesFactores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionesFactores.ipady =150;
				
			this.jPanelOrderByEvaluacionesFactores.add(jScrollPanelDatosEvaluacionesFactoresOrderBy, this.gridBagConstraintsEvaluacionesFactores);//this.jTableDatosEvaluacionesFactoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionesFactores = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionesFactores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionesFactores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionesFactores.setToolTipText("Cancelar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionesFactores.add(this.jButtonCerrarOrderByEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionesFactores = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionesFactores= new JScrollPane(jPanelOrderByEvaluacionesFactores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionesFactores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionesFactores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionesFactores);
			
			this.jInternalFrameOrderByEvaluacionesFactores.getContentPane().add(this.jScrollPanelOrderByEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionesFactores = new JButtonMe();
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
		//if(this.conMaximoRelaciones 
		//	&& this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEvaluacionesFactores.getRowHeight();//EvaluacionesFactoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.isSelected()) {
					iHeightTable=EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesFactores.isSelected()) {
					iHeightTable=EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesFactoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionesFactores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesFactores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesFactores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionesFactores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesFactores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesFactores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionesFactores!=null && this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionesFactores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionesFactores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionesFactores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionesFactores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesFactores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesFactores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=evaluacionesfactoresLogic.getEvaluacionesFactoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesfactoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionesFactores> TraerEvaluacionesFactoresBeans(List<EvaluacionesFactores> evaluacionesfactoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoress) {
					
				if(!(EvaluacionesFactoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionesFactoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionesfactores.setsDetalleGeneralEntityReporte(EvaluacionesFactoresConstantesFunciones.getEvaluacionesFactoresDescripcion(evaluacionesfactores));
										
						
					
						
					
				} else  {
							
					//evaluacionesfactores.setsDetalleGeneralEntityReporte(evaluacionesfactores.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionesfactoresbeans.add(evaluacionesfactoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionesfactoress;
    }
	//PARA REPORTES FIN
}
