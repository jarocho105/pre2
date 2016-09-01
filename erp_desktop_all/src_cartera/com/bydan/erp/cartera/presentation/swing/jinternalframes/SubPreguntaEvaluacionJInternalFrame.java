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
import com.bydan.erp.cartera.util.SubPreguntaEvaluacionConstantesFunciones;

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
public class SubPreguntaEvaluacionJInternalFrame extends SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSubPreguntaEvaluacion;
	
	protected JMenuBar jmenuBarSubPreguntaEvaluacion;
	
	protected JMenu jmenuSubPreguntaEvaluacion;
	protected JMenu jmenuDatosSubPreguntaEvaluacion;
	protected JMenu jmenuArchivoSubPreguntaEvaluacion;
	protected JMenu jmenuAccionesSubPreguntaEvaluacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubPreguntaEvaluacion;	
	protected GridBagConstraints gridBagConstraintsSubPreguntaEvaluacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame jInternalFrameDetalleFormSubPreguntaEvaluacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSubPreguntaEvaluacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSubPreguntaEvaluacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntaevaluacion="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SubPreguntaEvaluacion> subpreguntaevaluacions;		
	public List<SubPreguntaEvaluacion> subpreguntaevaluacionsEliminados;	
	public List<SubPreguntaEvaluacion> subpreguntaevaluacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySubPreguntaEvaluacion;		
	protected JButton jButtonAbrirOrderBySubPreguntaEvaluacion;
	
	
	//protected JPanel jPanelOrderBySubPreguntaEvaluacion;
	//public JScrollPane jScrollPanelOrderBySubPreguntaEvaluacion;	
	//protected JButton jButtonCerrarOrderBySubPreguntaEvaluacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSubPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosEdicionSubPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosGeneralSubPreguntaEvaluacion;
    
	
	
	//public JScrollPane jScrollPanelDatosSubPreguntaEvaluacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSubPreguntaEvaluacion;
	//public JScrollPane jScrollPanelImportacionSubPreguntaEvaluacion;
	
	
	
	protected JPanel jPanelAccionesSubPreguntaEvaluacion;
	
    protected JPanel jPanelPaginacionSubPreguntaEvaluacion;
    protected JPanel jPanelParametrosReportesSubPreguntaEvaluacion;
	protected JPanel jPanelParametrosReportesAccionesSubPreguntaEvaluacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SubPreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar2SubPreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar3SubPreguntaEvaluacion;
	protected JPanel jPanelParametrosAuxiliar4SubPreguntaEvaluacion;
	//protected JPanel jPanelParametrosAuxiliar5SubPreguntaEvaluacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoSubPreguntaEvaluacion;
	//protected JPanel jPanelImportacionSubPreguntaEvaluacion;
	
	
	public JTable jTableDatosSubPreguntaEvaluacion;
	
	
	
	//public JTable jTableDatosSubPreguntaEvaluacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSubPreguntaEvaluacion;
	protected JButton jButtonDuplicarSubPreguntaEvaluacion;
	protected JButton jButtonCopiarSubPreguntaEvaluacion;
	protected JButton jButtonVerFormSubPreguntaEvaluacion;
	protected JButton jButtonNuevoRelacionesSubPreguntaEvaluacion;
	protected JButton jButtonModificarSubPreguntaEvaluacion;
	
    protected JButton jButtonGuardarCambiosTablaSubPreguntaEvaluacion;
	protected JButton jButtonCerrarSubPreguntaEvaluacion;
	
	
	protected JButton jButtonRecargarInformacionSubPreguntaEvaluacion;
	protected JButton jButtonProcesarInformacionSubPreguntaEvaluacion;
	
	
	protected JButton jButtonAnterioresSubPreguntaEvaluacion;
	protected JButton jButtonSiguientesSubPreguntaEvaluacion;
	protected JButton jButtonNuevoGuardarCambiosSubPreguntaEvaluacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSubPreguntaEvaluacion;
	//protected JButton jButtonCerrarReporteDinamicoSubPreguntaEvaluacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionSubPreguntaEvaluacion;
	//protected JButton jButtonGenerarImportacionSubPreguntaEvaluacion;
	//protected JButton jButtonCerrarImportacionSubPreguntaEvaluacion;
	//protected JFileChooser jFileChooserImportacionSubPreguntaEvaluacion;
	//protected File fileImportacionSubPreguntaEvaluacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubPreguntaEvaluacion;
	protected JButton jButtonDuplicarToolBarSubPreguntaEvaluacion;
	protected JButton jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion;
	
	
	public JButton jButtonGuardarCambiosToolBarSubPreguntaEvaluacion;
	protected JButton jButtonCopiarToolBarSubPreguntaEvaluacion;
	protected JButton jButtonVerFormToolBarSubPreguntaEvaluacion;
	public JButton jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion;
	protected JButton jButtonMostrarOcultarTablaToolBarSubPreguntaEvaluacion;
	protected JButton jButtonCerrarToolBarSubPreguntaEvaluacion;
	
	protected JButton jButtonRecargarInformacionToolBarSubPreguntaEvaluacion;
	protected JButton jButtonProcesarInformacionToolBarSubPreguntaEvaluacion;
	protected JButton jButtonAnterioresToolBarSubPreguntaEvaluacion;
	protected JButton jButtonSiguientesToolBarSubPreguntaEvaluacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion;
	protected JButton jButtonAbrirOrderByToolBarSubPreguntaEvaluacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDuplicarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoRelacionesSubPreguntaEvaluacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemCopiarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemVerFormSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemCerrarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleCerrarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion;
	
	protected JMenuItem jMenuItemRecargarInformacionSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemProcesarInformacionSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemAnterioresSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemSiguientesSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemAbrirOrderBySubPreguntaEvaluacion;
	protected JMenuItem jMenuItemMostrarOcultarSubPreguntaEvaluacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubPreguntaEvaluacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSubPreguntaEvaluacion;
	protected JCheckBox jCheckBoxSeleccionadosSubPreguntaEvaluacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion;
	protected JCheckBox jCheckBoxConGraficoReporteSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSubPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSubPreguntaEvaluacion;
	protected JTextField jTextFieldValorCampoGeneralSubPreguntaEvaluacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSubPreguntaEvaluacion;
	//public JList<Reporte> jListColumnasSelectReporteSubPreguntaEvaluacion;
	//public JScrollPane jScrollColumnasSelectReporteSubPreguntaEvaluacion;
	
	//public JLabel jLabelRelacionesSelectReporteSubPreguntaEvaluacion;
	//public JList<Reporte> jListRelacionesSelectReporteSubPreguntaEvaluacion;
	//public JScrollPane jScrollRelacionesSelectReporteSubPreguntaEvaluacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSubPreguntaEvaluacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion;
	
		
	//public JLabel jLabelArchivoImportacionSubPreguntaEvaluacion;	
	//public JLabel jLabelPathArchivoImportacionSubPreguntaEvaluacion;
	//protected JTextField jTextFieldPathArchivoImportacionSubPreguntaEvaluacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion;
	
	//public JLabel jLabelColumnaCategoriaValorSubPreguntaEvaluacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion;
	
	//public JLabel jLabelColumnasValoresGraficoSubPreguntaEvaluacion;
	//public JList<Reporte> jListColumnasValoresGraficoSubPreguntaEvaluacion;
	//public JScrollPane jScrollColumnasValoresGraficoSubPreguntaEvaluacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSubPreguntaEvaluacion;
	public JPanel jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion;
	public JButton jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion;
	
	public JPanel jPanelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion;
	public JLabel jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion;
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SubPreguntaEvaluacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSubPreguntaEvaluacion)	{
		this.jButtonRecargarInformacionSubPreguntaEvaluacion = jButtonRecargarInformacionSubPreguntaEvaluacion;
	}
	
	public JButton getjButtonProcesarInformacionSubPreguntaEvaluacion() {
		return this.jButtonProcesarInformacionSubPreguntaEvaluacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubPreguntaEvaluacion)	{
		this.jButtonProcesarInformacionSubPreguntaEvaluacion = jButtonProcesarInformacionSubPreguntaEvaluacion;
	}
	
	
	public JButton getjButtonRecargarInformacionSubPreguntaEvaluacion() {
		return this.jButtonRecargarInformacionSubPreguntaEvaluacion;
	}
	
	
	public List<SubPreguntaEvaluacion> getsubpreguntaevaluacions() {
		return this.subpreguntaevaluacions;
	}

	public void setsubpreguntaevaluacions(List<SubPreguntaEvaluacion> subpreguntaevaluacions) {
		this.subpreguntaevaluacions = subpreguntaevaluacions;
	}
	
	public List<SubPreguntaEvaluacion> getsubpreguntaevaluacionsAux() {
		return this.subpreguntaevaluacionsAux;
	}

	public void setsubpreguntaevaluacionsAux(List<SubPreguntaEvaluacion> subpreguntaevaluacionsAux) {
		this.subpreguntaevaluacionsAux = subpreguntaevaluacionsAux;
	}
	
	public List<SubPreguntaEvaluacion> getsubpreguntaevaluacionsEliminados() {
		return this.subpreguntaevaluacionsEliminados;
	}

	public void setSubPreguntaEvaluacionsEliminados(List<SubPreguntaEvaluacion> subpreguntaevaluacionsEliminados) {
		this.subpreguntaevaluacionsEliminados = subpreguntaevaluacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSubPreguntaEvaluacion() {
		return jComboBoxTiposSeleccionarSubPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposSeleccionarSubPreguntaEvaluacion) {
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion = jComboBoxTiposSeleccionarSubPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposSeleccionarSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSubPreguntaEvaluacion() {
		return jTextFieldValorCampoGeneralSubPreguntaEvaluacion;
	}

	public void setjTextFieldValorCampoGeneralSubPreguntaEvaluacion(
			JTextField jTextFieldValorCampoGeneralSubPreguntaEvaluacion) {
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion = jTextFieldValorCampoGeneralSubPreguntaEvaluacion;
	}

	public void setBorderResaltarValorCampoGeneralSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSubPreguntaEvaluacion() {
		return this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion;
	}

	public void setjCheckBoxSeleccionarTodosSubPreguntaEvaluacion(
			JCheckBox jCheckBoxSeleccionarTodosSubPreguntaEvaluacion) {
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion = jCheckBoxSeleccionarTodosSubPreguntaEvaluacion;
	}

	public void setBorderResaltarSeleccionarTodosSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSubPreguntaEvaluacion() {
		return this.jCheckBoxSeleccionadosSubPreguntaEvaluacion;
	}

	public void setjCheckBoxSeleccionadosSubPreguntaEvaluacion(
			JCheckBox jCheckBoxSeleccionadosSubPreguntaEvaluacion) {
		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion = jCheckBoxSeleccionadosSubPreguntaEvaluacion;
	}
	
	public void setBorderResaltarSeleccionadosSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposArchivosReportesSubPreguntaEvaluacion) {
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion = jComboBoxTiposArchivosReportesSubPreguntaEvaluacion;
	}

	public void setBorderResaltarTiposArchivosReportesSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposReportesSubPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposReportesSubPreguntaEvaluacion) {
		this.jComboBoxTiposReportesSubPreguntaEvaluacion = jComboBoxTiposReportesSubPreguntaEvaluacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSubPreguntaEvaluacion() {
	//	return jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSubPreguntaEvaluacion(
	//		JComboBox jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion) {
	//	this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion = jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion = jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion;
	//}
	
	public void setBorderResaltarTiposReportesSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposGraficosReportesSubPreguntaEvaluacion) {
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion = jComboBoxTiposGraficosReportesSubPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSubPreguntaEvaluacion() {
		return this.jComboBoxTiposPaginacionSubPreguntaEvaluacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposPaginacionSubPreguntaEvaluacion) {
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion = jComboBoxTiposPaginacionSubPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposPaginacionSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposRelacionesSubPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesSubPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposRelacionesSubPreguntaEvaluacion) {
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion = jComboBoxTiposRelacionesSubPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesSubPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion = jComboBoxTiposAccionesSubPreguntaEvaluacion;
	}
	
	public void setBorderResaltarTiposRelacionesSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSubPreguntaEvaluacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSubPreguntaEvaluacion() {
	//	return jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoSubPreguntaEvaluacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion) {
	//	this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion = jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSubPreguntaEvaluacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSubPreguntaEvaluacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion .setBorder(borderResaltar);		
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
		this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		
		this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubPreguntaEvaluacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Pregunta Evaluacion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
		
		SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSubPreguntaEvaluacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"nuevo","nuevo","Nuevo"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"duplicar","duplicar","Duplicar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"copiar","copiar","Copiar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"ver_form","ver_form","Ver"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"recargar","recargar","Recargar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,
							"cerrar","cerrar","Salir"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion;
			
				this.jButtonProcesarInformacionToolBarSubPreguntaEvaluacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSubPreguntaEvaluacion;
				
		//protected JButton jButtonModificarToolBarSubPreguntaEvaluacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSubPreguntaEvaluacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSubPreguntaEvaluacion=new JMenuMe("General");
		this.jmenuArchivoSubPreguntaEvaluacion=new JMenuMe("Archivo");
		this.jmenuAccionesSubPreguntaEvaluacion=new JMenuMe("Acciones");
		this.jmenuDatosSubPreguntaEvaluacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubPreguntaEvaluacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubPreguntaEvaluacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubPreguntaEvaluacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSubPreguntaEvaluacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSubPreguntaEvaluacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSubPreguntaEvaluacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSubPreguntaEvaluacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSubPreguntaEvaluacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSubPreguntaEvaluacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSubPreguntaEvaluacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSubPreguntaEvaluacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSubPreguntaEvaluacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSubPreguntaEvaluacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSubPreguntaEvaluacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSubPreguntaEvaluacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSubPreguntaEvaluacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSubPreguntaEvaluacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSubPreguntaEvaluacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSubPreguntaEvaluacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSubPreguntaEvaluacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSubPreguntaEvaluacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSubPreguntaEvaluacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSubPreguntaEvaluacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSubPreguntaEvaluacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySubPreguntaEvaluacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySubPreguntaEvaluacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySubPreguntaEvaluacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSubPreguntaEvaluacion.add(this.jMenuItemCerrarSubPreguntaEvaluacion);
			
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemNuevoSubPreguntaEvaluacion);
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion);
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion);
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion);		
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemDuplicarSubPreguntaEvaluacion);		
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemCopiarSubPreguntaEvaluacion);		
			this.jmenuAccionesSubPreguntaEvaluacion.add(this.jMenuItemVerFormSubPreguntaEvaluacion);		
			
			this.jmenuDatosSubPreguntaEvaluacion.add(this.jMenuItemRecargarInformacionSubPreguntaEvaluacion);				
			this.jmenuDatosSubPreguntaEvaluacion.add(this.jMenuItemAnterioresSubPreguntaEvaluacion);				
			this.jmenuDatosSubPreguntaEvaluacion.add(this.jMenuItemSiguientesSubPreguntaEvaluacion);				
			this.jmenuDatosSubPreguntaEvaluacion.add(this.jMenuItemAbrirOrderBySubPreguntaEvaluacion);				
			this.jmenuDatosSubPreguntaEvaluacion.add(this.jMenuItemMostrarOcultarSubPreguntaEvaluacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSubPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSubPreguntaEvaluacion.add(this.jmenuArchivoSubPreguntaEvaluacion);		
			this.jmenuBarSubPreguntaEvaluacion.add(this.jmenuAccionesSubPreguntaEvaluacion);		
			this.jmenuBarSubPreguntaEvaluacion.add(this.jmenuDatosSubPreguntaEvaluacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSubPreguntaEvaluacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSubPreguntaEvaluacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setToolTipText("Buscar Por Pregunta Evaluacion ");
		this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setToolTipText("Buscar Por Pregunta Evaluacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion,"buscar_button","Buscar Por Pregunta Evaluacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion = new JLabelMe();
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setText("Pregunta Evaluacion :");
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setToolTipText("Pregunta Evaluacion");
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSubPreguntaEvaluacion=new JTabbedPane();


		this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSubPreguntaEvaluacion = new SubPreguntaEvaluacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sub Pregunta Evaluacion DATOS");
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion = new SubPreguntaEvaluacionDetalleFormJInternalFrame(jDesktopPane,this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion = null;//new SubPreguntaEvaluacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubPreguntaEvaluacion= new GridBagLayout();
		
		
		this.jTableDatosSubPreguntaEvaluacion = new JTableMe();      
		
		String sToolTipSubPreguntaEvaluacion="";
		sToolTipSubPreguntaEvaluacion=SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubPreguntaEvaluacion+="(Cartera.SubPreguntaEvaluacion)";
		}
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubPreguntaEvaluacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSubPreguntaEvaluacion.setToolTipText(sToolTipSubPreguntaEvaluacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSubPreguntaEvaluacion);
		this.jTableDatosSubPreguntaEvaluacion.setAutoCreateRowSorter(true);
		this.jTableDatosSubPreguntaEvaluacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSubPreguntaEvaluacion.setRowSelectionAllowed(true);
		this.jTableDatosSubPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonDuplicarSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonCopiarSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonVerFormSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarSubPreguntaEvaluacion = new JButtonMe();
		
		this.jScrollPanelDatosSubPreguntaEvaluacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralSubPreguntaEvaluacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Pregunta Evaluacion";
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosSubPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesSubPreguntaEvaluacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion=new ReporteDinamicoJInternalFrame(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSubPreguntaEvaluacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSubPreguntaEvaluacion=new ImportacionJInternalFrame(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSubPreguntaEvaluacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySubPreguntaEvaluacion = new JButtonMe();
		
		this.jButtonAbrirOrderBySubPreguntaEvaluacion.setText("Orden");
		this.jButtonAbrirOrderBySubPreguntaEvaluacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubPreguntaEvaluacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubPreguntaEvaluacion,false,this);
			
			//this.cargarOrderBySubPreguntaEvaluacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubPreguntaEvaluacion,true,this);
			
			//this.cargarOrderBySubPreguntaEvaluacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSubPreguntaEvaluacion.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosSubPreguntaEvaluacion.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosSubPreguntaEvaluacion.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosSubPreguntaEvaluacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubPreguntaEvaluacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubPreguntaEvaluacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSubPreguntaEvaluacion.setText("Nuevo");
		this.jButtonDuplicarSubPreguntaEvaluacion.setText("Duplicar");
		this.jButtonCopiarSubPreguntaEvaluacion.setText("Copiar");
		this.jButtonVerFormSubPreguntaEvaluacion.setText("Ver");
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setText("Guardar");
		this.jButtonCerrarSubPreguntaEvaluacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubPreguntaEvaluacion,"nuevo_button","Nuevo",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSubPreguntaEvaluacion,"duplicar_button","Duplicar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSubPreguntaEvaluacion,"copiar_button","Copiar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSubPreguntaEvaluacion,"ver_form","Ver",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSubPreguntaEvaluacion,"nuevorelaciones_button","Nuevo Rel",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion,"guardarcambiostabla_button","Guardar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubPreguntaEvaluacion,"cerrar_button","Salir",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSubPreguntaEvaluacion.setToolTipText("Nuevo"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSubPreguntaEvaluacion.setToolTipText("Duplicar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSubPreguntaEvaluacion.setToolTipText("Copiar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSubPreguntaEvaluacion.setToolTipText("Ver"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.setToolTipText("Nuevo Rel"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setToolTipText("Guardar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubPreguntaEvaluacion.setToolTipText("Salir"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubPreguntaEvaluacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarSubPreguntaEvaluacion";
		inputMap = this.jButtonDuplicarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSubPreguntaEvaluacion"));
		
		//COPIAR
		sMapKey = "CopiarSubPreguntaEvaluacion";
		inputMap = this.jButtonCopiarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSubPreguntaEvaluacion"));
		
		//VEr FORM
		sMapKey = "VerFormSubPreguntaEvaluacion";
		inputMap = this.jButtonVerFormSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSubPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSubPreguntaEvaluacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoRelacionesSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSubPreguntaEvaluacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSubPreguntaEvaluacion";
		inputMap = this.jButtonModificarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSubPreguntaEvaluacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSubPreguntaEvaluacion";
		inputMap = this.jButtonCerrarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubPreguntaEvaluacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubPreguntaEvaluacion";
		inputMap = this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubPreguntaEvaluacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSubPreguntaEvaluacion.setName("jPanelParametrosReportesSubPreguntaEvaluacion"); 
		
		this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion.setName("jPanelParametrosReportesAccionesSubPreguntaEvaluacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.setText("Recargar");
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.setToolTipText("Recargar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSubPreguntaEvaluacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setText("Procesar");
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setToolTipText("Procesar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setVisible(false);
			
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposReportesSubPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSubPreguntaEvaluacion = new JLabelMe();
		
		this.jLabelAccionesSubPreguntaEvaluacion.setText("Acciones");		
		this.jLabelAccionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSubPreguntaEvaluacion = new JButtonMe();
		//this.jButtonAnterioresSubPreguntaEvaluacion.setText("<<");
        this.jButtonAnterioresSubPreguntaEvaluacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSubPreguntaEvaluacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSubPreguntaEvaluacion = new JButtonMe();
		//this.jButtonSiguientesSubPreguntaEvaluacion.setText(">>");
        this.jButtonSiguientesSubPreguntaEvaluacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSubPreguntaEvaluacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion,"nuevoguardarcambios_button","Nue",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSubPreguntaEvaluacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSubPreguntaEvaluacion";
		inputMap = this.jButtonRecargarInformacionSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSubPreguntaEvaluacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSubPreguntaEvaluacion";
		inputMap = this.jButtonSiguientesSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSubPreguntaEvaluacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSubPreguntaEvaluacion";
		inputMap = this.jButtonAnterioresSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSubPreguntaEvaluacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSubPreguntaEvaluacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(this.getWidth(),SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(this.getWidth(),SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(this.getWidth(),SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubPreguntaEvaluacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSubPreguntaEvaluacion = new GridBagLayout();

			this.jPanelPaginacionSubPreguntaEvaluacion.setLayout(gridaBagLayoutPaginacionSubPreguntaEvaluacion);						
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonAnterioresSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					
						
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
			
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
						
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonSiguientesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonNuevoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonNuevoRelacionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			}
			
			
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			}
			
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonDuplicarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonCopiarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonVerFormSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSubPreguntaEvaluacion.add(this.jButtonCerrarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSubPreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSubPreguntaEvaluacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SubPreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SubPreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SubPreguntaEvaluacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SubPreguntaEvaluacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.setLayout(gridaBagParametrosReportesSubPreguntaEvaluacion);
			this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion.setLayout(gridaBagParametrosReportesAccionesSubPreguntaEvaluacion);
			
			
			this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar1SubPreguntaEvaluacion);
			this.jPanelParametrosAuxiliar2SubPreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar2SubPreguntaEvaluacion);
			this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar3SubPreguntaEvaluacion);
			this.jPanelParametrosAuxiliar4SubPreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar4SubPreguntaEvaluacion);
			//this.jPanelParametrosAuxiliar5SubPreguntaEvaluacion.setLayout(gridaBagParametrosAuxiliar2SubPreguntaEvaluacion);			
			
			
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jButtonRecargarInformacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion.add(this.jComboBoxTiposPaginacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion.add(this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion.add(this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar1SubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SubPreguntaEvaluacion.add(this.jComboBoxTiposReportesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);																		
			
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SubPreguntaEvaluacion.add(this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar4SubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jComboBoxTiposReportesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jCheckBoxGenerarReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar2SubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jLabelAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jButtonAbrirOrderBySubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			
			
			/*
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion.add(this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);															
				
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion.add(this.jCheckBoxSeleccionadosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);															
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion.add(this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jPanelParametrosAuxiliar3SubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jComboBoxTiposRelacionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
				
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jComboBoxTiposAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
	
				
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubPreguntaEvaluacion.add(this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSubPreguntaEvaluacion = new GridBagLayout();

			this.jScrollPanelDatosSubPreguntaEvaluacion.setLayout(gridaBagLayoutDatosSubPreguntaEvaluacion);
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
			
			this.jScrollPanelDatosSubPreguntaEvaluacion.add(this.jTableDatosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSubPreguntaEvaluacion.setViewportView(this.jTableDatosSubPreguntaEvaluacion);
		this.jTableDatosSubPreguntaEvaluacion.setFillsViewportHeight(true);
		this.jTableDatosSubPreguntaEvaluacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesSubPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesSubPreguntaEvaluacion);
		
		
		/*	
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
			
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonNuevoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion= new GridBagLayout();
		gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setLayout(gridaBagLayoutFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);

		gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
		jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.add(jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);

		gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
		jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.add(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);

		gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubPreguntaEvaluacion.gridy = 1;
		gridBagConstraintsSubPreguntaEvaluacion.gridx =1;
		jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.add(jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);

		jTabbedPaneBusquedasSubPreguntaEvaluacion.addTab("1.-Por Pregunta Evaluacion ", jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
		jTabbedPaneBusquedasSubPreguntaEvaluacion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubPreguntaEvaluacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();						
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;		
			//this.gridBagConstraintsSubPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;		
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;		
			this.gridBagConstraintsSubPreguntaEvaluacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);								
		
		
		/*
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/		
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =0;
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubPreguntaEvaluacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
				
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSubPreguntaEvaluacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubPreguntaEvaluacion = new GridBagLayout();
			this.jPanelBusquedasParametrosSubPreguntaEvaluacion.setLayout(gridaBagLayoutBusquedasParametrosSubPreguntaEvaluacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSubPreguntaEvaluacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSubPreguntaEvaluacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSubPreguntaEvaluacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setName("jPanelReporteDinamicoSubPreguntaEvaluacion"); 
		
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.setLayout(gridaBagLayoutReporteDinamicoSubPreguntaEvaluacion);
		
		
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubPreguntaEvaluacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnasSelectReporteSubPreguntaEvaluacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelColumnasSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSubPreguntaEvaluacion = new JList<Reporte>();
		this.jListColumnasSelectReporteSubPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSubPreguntaEvaluacion=new JScrollPane(this.jListColumnasSelectReporteSubPreguntaEvaluacion);
			
			this.jScrollColumnasSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jListColumnasSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jScrollColumnasSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelRelacionesSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSubPreguntaEvaluacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteSubPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion=new JScrollPane(this.jListRelacionesSelectReporteSubPreguntaEvaluacion);
			
			this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jListRelacionesSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jScrollRelacionesSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoSubPreguntaEvaluacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelConGraficoDinamicoSubPreguntaEvaluacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelConGraficoDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jCheckBoxConGraficoDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelColumnaCategoriaGraficoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelColumnaCategoriaValorSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jComboBoxColumnaCategoriaValorSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelColumnasValoresGraficoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSubPreguntaEvaluacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoSubPreguntaEvaluacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSubPreguntaEvaluacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion=new JScrollPane(this.jListColumnasValoresGraficoSubPreguntaEvaluacion);
			
			this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jListColumnasSelectReporteSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jScrollColumnasValoresGraficoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelTiposGraficosReportesDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSubPreguntaEvaluacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jComboBoxTiposGraficosReportesDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelGenerarExcelReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion.setToolTipText("Generar EXCEL"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jComboBoxTiposReportesDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jLabelTiposArchivoReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jComboBoxTiposArchivosReportesDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion.setToolTipText("Generar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion.setToolTipText("Cancelar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubPreguntaEvaluacion.add(this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSubPreguntaEvaluacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion= new JScrollPane(jPanelReporteDinamicoSubPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSubPreguntaEvaluacion);
		this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getContentPane().add(this.jScrollPanelReporteDinamicoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSubPreguntaEvaluacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSubPreguntaEvaluacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSubPreguntaEvaluacion.setName("jPanelImportacionSubPreguntaEvaluacion"); 
		
		this.jPanelImportacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSubPreguntaEvaluacion.setLayout(gridaBagLayoutImportacionSubPreguntaEvaluacion);
		
		
		this.jInternalFrameImportacionSubPreguntaEvaluacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSubPreguntaEvaluacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSubPreguntaEvaluacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubPreguntaEvaluacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setResizable(true);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setClosable(true);
	    this.jInternalFrameImportacionSubPreguntaEvaluacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelArchivoImportacionSubPreguntaEvaluacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jLabelArchivoImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSubPreguntaEvaluacion = new JFileChooser();		
		this.jFileChooserImportacionSubPreguntaEvaluacion.setToolTipText("ESCOGER ARCHIVO"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonAbrirImportacionSubPreguntaEvaluacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSubPreguntaEvaluacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSubPreguntaEvaluacion.setToolTipText("Generar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jButtonAbrirImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSubPreguntaEvaluacion = new JLabelMe();

		this.jLabelPathArchivoImportacionSubPreguntaEvaluacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jLabelPathArchivoImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSubPreguntaEvaluacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jTextFieldPathArchivoImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonGenerarImportacionSubPreguntaEvaluacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSubPreguntaEvaluacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSubPreguntaEvaluacion.setToolTipText("Generar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jButtonGenerarImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarImportacionSubPreguntaEvaluacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSubPreguntaEvaluacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSubPreguntaEvaluacion.setToolTipText("Cancelar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubPreguntaEvaluacion.add(this.jButtonCerrarImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSubPreguntaEvaluacion = new GridBagLayout();
		
		this.jScrollPanelImportacionSubPreguntaEvaluacion= new JScrollPane(jPanelImportacionSubPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iPosYImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXImportacion;
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSubPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSubPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSubPreguntaEvaluacion);
		this.jInternalFrameImportacionSubPreguntaEvaluacion.getContentPane().add(this.jScrollPanelImportacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySubPreguntaEvaluacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySubPreguntaEvaluacion = new JButtonMe();
			this.jButtonAbrirOrderBySubPreguntaEvaluacion.setText("Orden");
			this.jButtonAbrirOrderBySubPreguntaEvaluacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubPreguntaEvaluacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySubPreguntaEvaluacion";
			inputMap = this.jButtonAbrirOrderBySubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySubPreguntaEvaluacion"));
		
		
			GridBagLayout gridaBagLayoutOrderBySubPreguntaEvaluacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySubPreguntaEvaluacion.setName("jPanelOrderBySubPreguntaEvaluacion"); 
			
			this.jPanelOrderBySubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySubPreguntaEvaluacion.setLayout(gridaBagLayoutOrderBySubPreguntaEvaluacion);
			
			
			this.jTableDatosSubPreguntaEvaluacionOrderBy = new JTableMe();        
			this.jTableDatosSubPreguntaEvaluacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSubPreguntaEvaluacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSubPreguntaEvaluacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSubPreguntaEvaluacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSubPreguntaEvaluacionOrderBy.setViewportView(this.jTableDatosSubPreguntaEvaluacionOrderBy);
			this.jTableDatosSubPreguntaEvaluacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSubPreguntaEvaluacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySubPreguntaEvaluacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySubPreguntaEvaluacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySubPreguntaEvaluacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSubPreguntaEvaluacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setTitle("Orden");
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setResizable(true);
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setClosable(true);
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSubPreguntaEvaluacion.ipady =150;
				
			this.jPanelOrderBySubPreguntaEvaluacion.add(jScrollPanelDatosSubPreguntaEvaluacionOrderBy, this.gridBagConstraintsSubPreguntaEvaluacion);//this.jTableDatosSubPreguntaEvaluacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySubPreguntaEvaluacion = new JButtonMe();
			this.jButtonCerrarOrderBySubPreguntaEvaluacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySubPreguntaEvaluacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySubPreguntaEvaluacion.setToolTipText("Cancelar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySubPreguntaEvaluacion.add(this.jButtonCerrarOrderBySubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSubPreguntaEvaluacion = new GridBagLayout();
			
			this.jScrollPanelOrderBySubPreguntaEvaluacion= new JScrollPane(jPanelOrderBySubPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSubPreguntaEvaluacion);
			
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getContentPane().add(this.jScrollPanelOrderBySubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
		
		} else {
			this.jButtonAbrirOrderBySubPreguntaEvaluacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSubPreguntaEvaluacion.getRowHeight();//SubPreguntaEvaluacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.isSelected()) {
					iHeightTable=SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubPreguntaEvaluacion.isSelected()) {
					iHeightTable=SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubPreguntaEvaluacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySubPreguntaEvaluacion!=null && this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy()!=null) {
			//if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySubPreguntaEvaluacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subpreguntaevaluacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SubPreguntaEvaluacion> TraerSubPreguntaEvaluacionBeans(List<SubPreguntaEvaluacion> subpreguntaevaluacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacions) {
					
				if(!(SubPreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SubPreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					subpreguntaevaluacion.setsDetalleGeneralEntityReporte(SubPreguntaEvaluacionConstantesFunciones.getSubPreguntaEvaluacionDescripcion(subpreguntaevaluacion));
										
					subpreguntaevaluacion.setcon_factura_descripcion(SubPreguntaEvaluacionConstantesFunciones.getcon_facturaDescripcion(subpreguntaevaluacion));subpreguntaevaluacion.setcon_orden_compra_descripcion(SubPreguntaEvaluacionConstantesFunciones.getcon_orden_compraDescripcion(subpreguntaevaluacion));subpreguntaevaluacion.setcon_completo_descripcion(SubPreguntaEvaluacionConstantesFunciones.getcon_completoDescripcion(subpreguntaevaluacion));subpreguntaevaluacion.setcon_a_tiempo_descripcion(SubPreguntaEvaluacionConstantesFunciones.getcon_a_tiempoDescripcion(subpreguntaevaluacion));	
					
					

					if(subpreguntaevaluacion.getDetalleEvaluacionProveedors()!=null && Funciones.existeClass(classes,DetalleEvaluacionProveedor.class)) {
						try{subpreguntaevaluacion.setdetalleevaluacionproveedorsDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionProveedorJInternalFrame.TraerDetalleEvaluacionProveedorBeans(subpreguntaevaluacion.getDetalleEvaluacionProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//subpreguntaevaluacion.setsDetalleGeneralEntityReporte(subpreguntaevaluacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//subpreguntaevaluacionbeans.add(subpreguntaevaluacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return subpreguntaevaluacions;
    }
	//PARA REPORTES FIN
}
