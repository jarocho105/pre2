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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoTotalizarSaldosConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoTotalizarSaldosJInternalFrame extends ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoTotalizarSaldos;
	
	protected JMenuBar jmenuBarProcesoTotalizarSaldos;
	
	protected JMenu jmenuProcesoTotalizarSaldos;
	protected JMenu jmenuDatosProcesoTotalizarSaldos;
	protected JMenu jmenuArchivoProcesoTotalizarSaldos;
	protected JMenu jmenuAccionesProcesoTotalizarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoTotalizarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoTotalizarSaldos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoTotalizarSaldos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoTotalizarSaldos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoTotalizarSaldos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public ProcesoTotalizarSaldosSessionBean procesototalizarsaldosSessionBean;
		
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoTotalizarSaldos> procesototalizarsaldoss;		
	public List<ProcesoTotalizarSaldos> procesototalizarsaldossEliminados;	
	public List<ProcesoTotalizarSaldos> procesototalizarsaldossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoTotalizarSaldos;		
	protected JButton jButtonAbrirOrderByProcesoTotalizarSaldos;
	
	
	//protected JPanel jPanelOrderByProcesoTotalizarSaldos;
	//public JScrollPane jScrollPanelOrderByProcesoTotalizarSaldos;	
	//protected JButton jButtonCerrarOrderByProcesoTotalizarSaldos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoTotalizarSaldosLogic procesototalizarsaldosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoTotalizarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoTotalizarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoTotalizarSaldos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoTotalizarSaldosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoTotalizarSaldos;
	//public JScrollPane jScrollPanelImportacionProcesoTotalizarSaldos;
	
	
	
	protected JPanel jPanelAccionesProcesoTotalizarSaldos;
	
    protected JPanel jPanelPaginacionProcesoTotalizarSaldos;
    protected JPanel jPanelParametrosReportesProcesoTotalizarSaldos;
	protected JPanel jPanelParametrosReportesAccionesProcesoTotalizarSaldos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoTotalizarSaldos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoTotalizarSaldos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoTotalizarSaldos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoTotalizarSaldos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoTotalizarSaldos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoTotalizarSaldos;
	//protected JPanel jPanelImportacionProcesoTotalizarSaldos;
	
	
	public JTable jTableDatosProcesoTotalizarSaldos;
	
	
	
	//public JTable jTableDatosProcesoTotalizarSaldosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoTotalizarSaldos;
	protected JButton jButtonDuplicarProcesoTotalizarSaldos;
	protected JButton jButtonCopiarProcesoTotalizarSaldos;
	protected JButton jButtonVerFormProcesoTotalizarSaldos;
	protected JButton jButtonNuevoRelacionesProcesoTotalizarSaldos;
	protected JButton jButtonModificarProcesoTotalizarSaldos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoTotalizarSaldos;
	protected JButton jButtonCerrarProcesoTotalizarSaldos;
	
	
	protected JButton jButtonRecargarInformacionProcesoTotalizarSaldos;
	protected JButton jButtonProcesarInformacionProcesoTotalizarSaldos;
	
	
	protected JButton jButtonAnterioresProcesoTotalizarSaldos;
	protected JButton jButtonSiguientesProcesoTotalizarSaldos;
	protected JButton jButtonNuevoGuardarCambiosProcesoTotalizarSaldos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoTotalizarSaldos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoTotalizarSaldos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoTotalizarSaldos;
	//protected JButton jButtonGenerarImportacionProcesoTotalizarSaldos;
	//protected JButton jButtonCerrarImportacionProcesoTotalizarSaldos;
	//protected JFileChooser jFileChooserImportacionProcesoTotalizarSaldos;
	//protected File fileImportacionProcesoTotalizarSaldos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoTotalizarSaldos;
	protected JButton jButtonDuplicarToolBarProcesoTotalizarSaldos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoTotalizarSaldos;
	protected JButton jButtonCopiarToolBarProcesoTotalizarSaldos;
	protected JButton jButtonVerFormToolBarProcesoTotalizarSaldos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoTotalizarSaldos;
	protected JButton jButtonCerrarToolBarProcesoTotalizarSaldos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoTotalizarSaldos;
	protected JButton jButtonProcesarInformacionToolBarProcesoTotalizarSaldos;
	protected JButton jButtonAnterioresToolBarProcesoTotalizarSaldos;
	protected JButton jButtonSiguientesToolBarProcesoTotalizarSaldos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos;
	protected JButton jButtonAbrirOrderByToolBarProcesoTotalizarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDuplicarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoTotalizarSaldos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemCopiarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemVerFormProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemAnterioresProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemSiguientesProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoTotalizarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoTotalizarSaldos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoTotalizarSaldos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoTotalizarSaldos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoTotalizarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoTotalizarSaldos;
	protected JTextField jTextFieldValorCampoGeneralProcesoTotalizarSaldos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoTotalizarSaldos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoTotalizarSaldos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoTotalizarSaldos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoTotalizarSaldos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoTotalizarSaldos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoTotalizarSaldos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoTotalizarSaldos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoTotalizarSaldos;	
	//public JLabel jLabelPathArchivoImportacionProcesoTotalizarSaldos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoTotalizarSaldos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoTotalizarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoTotalizarSaldos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoTotalizarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoTotalizarSaldos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoTotalizarSaldos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoTotalizarSaldos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoTotalizarSaldos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoTotalizarSaldos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoTotalizarSaldos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoTotalizarSaldos;
	public JPanel jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	public JButton jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	
	public JPanel jPanelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	public JLabel jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	public JLabel jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos;
	public JButton jButtonid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=154;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoTotalizarSaldosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoTotalizarSaldos)	{
		this.jButtonRecargarInformacionProcesoTotalizarSaldos = jButtonRecargarInformacionProcesoTotalizarSaldos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoTotalizarSaldos() {
		return this.jButtonProcesarInformacionProcesoTotalizarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoTotalizarSaldos)	{
		this.jButtonProcesarInformacionProcesoTotalizarSaldos = jButtonProcesarInformacionProcesoTotalizarSaldos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoTotalizarSaldos() {
		return this.jButtonRecargarInformacionProcesoTotalizarSaldos;
	}
	
	
	public List<ProcesoTotalizarSaldos> getprocesototalizarsaldoss() {
		return this.procesototalizarsaldoss;
	}

	public void setprocesototalizarsaldoss(List<ProcesoTotalizarSaldos> procesototalizarsaldoss) {
		this.procesototalizarsaldoss = procesototalizarsaldoss;
	}
	
	public List<ProcesoTotalizarSaldos> getprocesototalizarsaldossAux() {
		return this.procesototalizarsaldossAux;
	}

	public void setprocesototalizarsaldossAux(List<ProcesoTotalizarSaldos> procesototalizarsaldossAux) {
		this.procesototalizarsaldossAux = procesototalizarsaldossAux;
	}
	
	public List<ProcesoTotalizarSaldos> getprocesototalizarsaldossEliminados() {
		return this.procesototalizarsaldossEliminados;
	}

	public void setProcesoTotalizarSaldossEliminados(List<ProcesoTotalizarSaldos> procesototalizarsaldossEliminados) {
		this.procesototalizarsaldossEliminados = procesototalizarsaldossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoTotalizarSaldos() {
		return jComboBoxTiposSeleccionarProcesoTotalizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposSeleccionarProcesoTotalizarSaldos) {
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos = jComboBoxTiposSeleccionarProcesoTotalizarSaldos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoTotalizarSaldos() {
		return jTextFieldValorCampoGeneralProcesoTotalizarSaldos;
	}

	public void setjTextFieldValorCampoGeneralProcesoTotalizarSaldos(
			JTextField jTextFieldValorCampoGeneralProcesoTotalizarSaldos) {
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos = jTextFieldValorCampoGeneralProcesoTotalizarSaldos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoTotalizarSaldos() {
		return this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoTotalizarSaldos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoTotalizarSaldos) {
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos = jCheckBoxSeleccionarTodosProcesoTotalizarSaldos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoTotalizarSaldos() {
		return this.jCheckBoxSeleccionadosProcesoTotalizarSaldos;
	}

	public void setjCheckBoxSeleccionadosProcesoTotalizarSaldos(
			JCheckBox jCheckBoxSeleccionadosProcesoTotalizarSaldos) {
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos = jCheckBoxSeleccionadosProcesoTotalizarSaldos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposArchivosReportesProcesoTotalizarSaldos) {
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos = jComboBoxTiposArchivosReportesProcesoTotalizarSaldos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposReportesProcesoTotalizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposReportesProcesoTotalizarSaldos) {
		this.jComboBoxTiposReportesProcesoTotalizarSaldos = jComboBoxTiposReportesProcesoTotalizarSaldos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoTotalizarSaldos() {
	//	return jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoTotalizarSaldos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos = jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos = jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposGraficosReportesProcesoTotalizarSaldos) {
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos = jComboBoxTiposGraficosReportesProcesoTotalizarSaldos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoTotalizarSaldos() {
		return this.jComboBoxTiposPaginacionProcesoTotalizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposPaginacionProcesoTotalizarSaldos) {
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos = jComboBoxTiposPaginacionProcesoTotalizarSaldos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposRelacionesProcesoTotalizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposAccionesProcesoTotalizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoTotalizarSaldos) {
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos = jComboBoxTiposRelacionesProcesoTotalizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoTotalizarSaldos) {
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos = jComboBoxTiposAccionesProcesoTotalizarSaldos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoTotalizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoTotalizarSaldos() {
	//	return jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoTotalizarSaldos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos = jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoTotalizarSaldos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoTotalizarSaldos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos .setBorder(borderResaltar);		
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
		this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
		
		this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesototalizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoTotalizarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Totalizar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoTotalizarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoTotalizarSaldos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"copiar","copiar","Copiar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"ver_form","ver_form","Ver"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"recargar","recargar","PROCESAR"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"PROCESAR",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,
							"cerrar","cerrar","Salir"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos;
			
				this.jButtonProcesarInformacionToolBarProcesoTotalizarSaldos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoTotalizarSaldos;
				
		//protected JButton jButtonModificarToolBarProcesoTotalizarSaldos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoTotalizarSaldos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoTotalizarSaldos=new JMenuMe("General");
		this.jmenuArchivoProcesoTotalizarSaldos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoTotalizarSaldos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoTotalizarSaldos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoTotalizarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoTotalizarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoTotalizarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoTotalizarSaldos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoTotalizarSaldos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoTotalizarSaldos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoTotalizarSaldos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoTotalizarSaldos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoTotalizarSaldos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoTotalizarSaldos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoTotalizarSaldos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoTotalizarSaldos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoTotalizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoTotalizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoTotalizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoTotalizarSaldos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoTotalizarSaldos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoTotalizarSaldos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoTotalizarSaldos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoTotalizarSaldos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoTotalizarSaldos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoTotalizarSaldos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoTotalizarSaldos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoTotalizarSaldos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoTotalizarSaldos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoTotalizarSaldos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoTotalizarSaldos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoTotalizarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoTotalizarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoTotalizarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoTotalizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoTotalizarSaldos.add(this.jMenuItemCerrarProcesoTotalizarSaldos);
			
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemNuevoProcesoTotalizarSaldos);
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos);
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos);
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos);		
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemDuplicarProcesoTotalizarSaldos);		
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemCopiarProcesoTotalizarSaldos);		
			this.jmenuAccionesProcesoTotalizarSaldos.add(this.jMenuItemVerFormProcesoTotalizarSaldos);		
			
			this.jmenuDatosProcesoTotalizarSaldos.add(this.jMenuItemRecargarInformacionProcesoTotalizarSaldos);				
			this.jmenuDatosProcesoTotalizarSaldos.add(this.jMenuItemAnterioresProcesoTotalizarSaldos);				
			this.jmenuDatosProcesoTotalizarSaldos.add(this.jMenuItemSiguientesProcesoTotalizarSaldos);				
			this.jmenuDatosProcesoTotalizarSaldos.add(this.jMenuItemAbrirOrderByProcesoTotalizarSaldos);				
			this.jmenuDatosProcesoTotalizarSaldos.add(this.jMenuItemMostrarOcultarProcesoTotalizarSaldos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoTotalizarSaldos.add(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoTotalizarSaldos.add(this.jmenuArchivoProcesoTotalizarSaldos);		
			this.jmenuBarProcesoTotalizarSaldos.add(this.jmenuAccionesProcesoTotalizarSaldos);		
			this.jmenuBarProcesoTotalizarSaldos.add(this.jmenuDatosProcesoTotalizarSaldos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoTotalizarSaldos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoTotalizarSaldos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setToolTipText("PROCESAR Por Ejercicio Por Periodo ");
		this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new JButtonMe();
		this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setText("PROCESAR");
		this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setToolTipText("PROCESAR Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"buscar_button","PROCESAR Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos = new JLabelMe();
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos = new JLabelMe();
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setText("Periodo :");
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setToolTipText("Periodo");
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new JComboBoxMe();
		jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoTotalizarSaldos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoTotalizarSaldos = new ProcesoTotalizarSaldosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Totalizar Saldos DATOS");
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos = new ProcesoTotalizarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesototalizarsaldosSessionBean.getConGuardarRelaciones(),this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos = null;//new ProcesoTotalizarSaldosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoTotalizarSaldos= new GridBagLayout();
		
		
		this.jTableDatosProcesoTotalizarSaldos = new JTableMe();      
		
		String sToolTipProcesoTotalizarSaldos="";
		sToolTipProcesoTotalizarSaldos=ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoTotalizarSaldos+="(Contabilidad.ProcesoTotalizarSaldos)";
		}
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoTotalizarSaldos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoTotalizarSaldos.setToolTipText(sToolTipProcesoTotalizarSaldos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoTotalizarSaldos);
		this.jTableDatosProcesoTotalizarSaldos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoTotalizarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoTotalizarSaldos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoTotalizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonDuplicarProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonCopiarProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonVerFormProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoTotalizarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoTotalizarSaldos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoTotalizarSaldos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Totalizar Saldos";
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoTotalizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoTotalizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoTotalizarSaldos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos=new ReporteDinamicoJInternalFrame(ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoTotalizarSaldos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoTotalizarSaldos=new ImportacionJInternalFrame(ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoTotalizarSaldos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoTotalizarSaldos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoTotalizarSaldos.setText("Orden");
		this.jButtonAbrirOrderByProcesoTotalizarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoTotalizarSaldos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoTotalizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTotalizarSaldos,false,this);
			
			//this.cargarOrderByProcesoTotalizarSaldos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoTotalizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTotalizarSaldos,true,this);
			
			//this.cargarOrderByProcesoTotalizarSaldos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoTotalizarSaldos.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoTotalizarSaldos.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoTotalizarSaldos.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoTotalizarSaldos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoTotalizarSaldos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoTotalizarSaldos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoTotalizarSaldos.setText("Nuevo");
		this.jButtonDuplicarProcesoTotalizarSaldos.setText("Duplicar");
		this.jButtonCopiarProcesoTotalizarSaldos.setText("Copiar");
		this.jButtonVerFormProcesoTotalizarSaldos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoTotalizarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoTotalizarSaldos,"nuevo_button","Nuevo",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoTotalizarSaldos,"duplicar_button","Duplicar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoTotalizarSaldos,"copiar_button","Copiar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoTotalizarSaldos,"ver_form","Ver",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoTotalizarSaldos,"nuevorelaciones_button","Nuevo Rel",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos,"guardarcambiostabla_button","Guardar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoTotalizarSaldos,"cerrar_button","Salir",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoTotalizarSaldos.setToolTipText("Nuevo"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoTotalizarSaldos.setToolTipText("Duplicar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoTotalizarSaldos.setToolTipText("Copiar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoTotalizarSaldos.setToolTipText("Ver"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.setToolTipText("Nuevo Rel"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setToolTipText("Guardar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoTotalizarSaldos.setToolTipText("Salir"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoTotalizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoTotalizarSaldos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoTotalizarSaldos";
		inputMap = this.jButtonDuplicarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoTotalizarSaldos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoTotalizarSaldos";
		inputMap = this.jButtonCopiarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoTotalizarSaldos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoTotalizarSaldos";
		inputMap = this.jButtonVerFormProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoTotalizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoTotalizarSaldos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoTotalizarSaldos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoTotalizarSaldos";
		inputMap = this.jButtonModificarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoTotalizarSaldos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoTotalizarSaldos";
		inputMap = this.jButtonCerrarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoTotalizarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoTotalizarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoTotalizarSaldos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoTotalizarSaldos.setName("jPanelParametrosReportesProcesoTotalizarSaldos"); 
		
		this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos.setName("jPanelParametrosReportesAccionesProcesoTotalizarSaldos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setText("PROCESAR");
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setToolTipText("PROCESAR"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoTotalizarSaldos,"recargar_button","PROCESAR");		
		
		
		
		
		this.jButtonProcesarInformacionProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setText("PROCESAR");
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setToolTipText("PROCESAR"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoTotalizarSaldos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoTotalizarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoTotalizarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoTotalizarSaldos = new JButtonMe();
		//this.jButtonAnterioresProcesoTotalizarSaldos.setText("<<");
        this.jButtonAnterioresProcesoTotalizarSaldos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoTotalizarSaldos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoTotalizarSaldos = new JButtonMe();
		//this.jButtonSiguientesProcesoTotalizarSaldos.setText(">>");
        this.jButtonSiguientesProcesoTotalizarSaldos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoTotalizarSaldos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos,"nuevoguardarcambios_button","Nue",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoTotalizarSaldos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoTotalizarSaldos";
		inputMap = this.jButtonRecargarInformacionProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoTotalizarSaldos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoTotalizarSaldos";
		inputMap = this.jButtonSiguientesProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoTotalizarSaldos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoTotalizarSaldos";
		inputMap = this.jButtonAnterioresProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoTotalizarSaldos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoTotalizarSaldos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(this.getWidth(),ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(this.getWidth(),ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(this.getWidth(),ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoTotalizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoTotalizarSaldos = new GridBagLayout();

			this.jPanelPaginacionProcesoTotalizarSaldos.setLayout(gridaBagLayoutPaginacionProcesoTotalizarSaldos);						
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonAnterioresProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					
						
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
			
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
						
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonSiguientesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonNuevoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
						
			
			
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
				this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			}
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonProcesarInformacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonDuplicarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonCopiarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonVerFormProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoTotalizarSaldos.add(this.jButtonCerrarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
		
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoTotalizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoTotalizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoTotalizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoTotalizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoTotalizarSaldos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoTotalizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoTotalizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoTotalizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoTotalizarSaldos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoTotalizarSaldos.setLayout(gridaBagParametrosReportesProcesoTotalizarSaldos);
			this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos.setLayout(gridaBagParametrosReportesAccionesProcesoTotalizarSaldos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos.setLayout(gridaBagParametrosAuxiliar1ProcesoTotalizarSaldos);
			this.jPanelParametrosAuxiliar2ProcesoTotalizarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoTotalizarSaldos);
			this.jPanelParametrosAuxiliar3ProcesoTotalizarSaldos.setLayout(gridaBagParametrosAuxiliar3ProcesoTotalizarSaldos);
			this.jPanelParametrosAuxiliar4ProcesoTotalizarSaldos.setLayout(gridaBagParametrosAuxiliar4ProcesoTotalizarSaldos);
			//this.jPanelParametrosAuxiliar5ProcesoTotalizarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoTotalizarSaldos);			
			
			
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jButtonRecargarInformacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos.add(this.jComboBoxTiposPaginacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos.add(this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos.add(this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jPanelParametrosAuxiliar1ProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoTotalizarSaldos.add(this.jComboBoxTiposReportesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jPanelParametrosAuxiliar4ProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jComboBoxTiposReportesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jCheckBoxGenerarReporteProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jPanelParametrosAuxiliar2ProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jLabelAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
			
			
			/*
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoTotalizarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);															
				
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoTotalizarSaldos.add(this.jCheckBoxSeleccionadosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jPanelParametrosAuxiliar3ProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoTotalizarSaldos.add(this.jComboBoxTiposAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoTotalizarSaldos = new GridBagLayout();

			this.jScrollPanelDatosProcesoTotalizarSaldos.setLayout(gridaBagLayoutDatosProcesoTotalizarSaldos);
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
			
			this.jScrollPanelDatosProcesoTotalizarSaldos.add(this.jTableDatosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoTotalizarSaldos.setViewportView(this.jTableDatosProcesoTotalizarSaldos);
		this.jTableDatosProcesoTotalizarSaldos.setFillsViewportHeight(true);
		this.jTableDatosProcesoTotalizarSaldos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoTotalizarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoTotalizarSaldos.setLayout(gridaBagLayoutAccionesProcesoTotalizarSaldos);
		
		
		/*	
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
			
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonNuevoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos= new GridBagLayout();
		gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setLayout(gridaBagLayoutBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);

		gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.add(jLabelid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);

		gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		gridBagConstraintsProcesoTotalizarSaldos.gridx = 1;
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.add(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);


		gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
		gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.add(jLabelid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);

		gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTotalizarSaldos.gridy = 1;
		gridBagConstraintsProcesoTotalizarSaldos.gridx = 1;
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.add(jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);

		gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoTotalizarSaldos.gridy = 2;
		gridBagConstraintsProcesoTotalizarSaldos.gridx =1;
		jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.add(jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);

		jTabbedPaneBusquedasProcesoTotalizarSaldos.addTab("1.-Por Ejercicio Por Periodo ", jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
		jTabbedPaneBusquedasProcesoTotalizarSaldos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoTotalizarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoTotalizarSaldos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoTotalizarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;		
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;		
			this.gridBagConstraintsProcesoTotalizarSaldos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);								
		
		
		/*
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/		
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =0;
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoTotalizarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
				
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoTotalizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoTotalizarSaldos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoTotalizarSaldos.setLayout(gridaBagLayoutBusquedasParametrosProcesoTotalizarSaldos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(false);
		this.jButtonAnterioresProcesoTotalizarSaldos.setVisible(false);
		this.jButtonSiguientesProcesoTotalizarSaldos.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposReportesProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.setVisible(false);
		
		this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(false);
		
		
		this.jTtoolBarProcesoTotalizarSaldos.setVisible(false);
			
		this.jMenuItemAnterioresProcesoTotalizarSaldos.setVisible(false);
		this.jMenuItemSiguientesProcesoTotalizarSaldos.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoTotalizarSaldos.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoTotalizarSaldos.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoTotalizarSaldos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoTotalizarSaldos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoTotalizarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setName("jPanelReporteDinamicoProcesoTotalizarSaldos"); 
		
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.setLayout(gridaBagLayoutReporteDinamicoProcesoTotalizarSaldos);
		
		
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoTotalizarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoTotalizarSaldos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jLabelColumnasSelectReporteProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoTotalizarSaldos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoTotalizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoTotalizarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoTotalizarSaldos=new JScrollPane(this.jListColumnasSelectReporteProcesoTotalizarSaldos);
			
			this.jScrollColumnasSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jListColumnasSelectReporteProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jScrollColumnasSelectReporteProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoTotalizarSaldos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoTotalizarSaldos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoTotalizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoTotalizarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoTotalizarSaldos=new JScrollPane(this.jListRelacionesSelectReporteProcesoTotalizarSaldos);
			
			this.jScrollRelacionesSelectReporteProcesoTotalizarSaldos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoTotalizarSaldos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoTotalizarSaldos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoTotalizarSaldos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoTotalizarSaldos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jLabelGenerarExcelReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos.setToolTipText("Generar EXCEL"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jComboBoxTiposReportesDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jLabelTiposArchivoReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos.setToolTipText("Generar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos.setToolTipText("Cancelar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoTotalizarSaldos.add(this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoTotalizarSaldos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos= new JScrollPane(jPanelReporteDinamicoProcesoTotalizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoTotalizarSaldos);
		this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoTotalizarSaldos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoTotalizarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoTotalizarSaldos.setName("jPanelImportacionProcesoTotalizarSaldos"); 
		
		this.jPanelImportacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoTotalizarSaldos.setLayout(gridaBagLayoutImportacionProcesoTotalizarSaldos);
		
		
		this.jInternalFrameImportacionProcesoTotalizarSaldos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoTotalizarSaldos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoTotalizarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoTotalizarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoTotalizarSaldos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoTotalizarSaldos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jLabelArchivoImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoTotalizarSaldos = new JFileChooser();		
		this.jFileChooserImportacionProcesoTotalizarSaldos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoTotalizarSaldos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoTotalizarSaldos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoTotalizarSaldos.setToolTipText("Generar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jButtonAbrirImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoTotalizarSaldos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoTotalizarSaldos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jLabelPathArchivoImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoTotalizarSaldos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoTotalizarSaldos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoTotalizarSaldos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoTotalizarSaldos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jTextFieldPathArchivoImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoTotalizarSaldos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoTotalizarSaldos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoTotalizarSaldos.setToolTipText("Generar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jButtonGenerarImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoTotalizarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoTotalizarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoTotalizarSaldos.setToolTipText("Cancelar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoTotalizarSaldos.add(this.jButtonCerrarImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoTotalizarSaldos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoTotalizarSaldos= new JScrollPane(jPanelImportacionProcesoTotalizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoTotalizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoTotalizarSaldos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoTotalizarSaldos);
		this.jInternalFrameImportacionProcesoTotalizarSaldos.getContentPane().add(this.jScrollPanelImportacionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoTotalizarSaldos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoTotalizarSaldos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoTotalizarSaldos.setText("Orden");
			this.jButtonAbrirOrderByProcesoTotalizarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoTotalizarSaldos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoTotalizarSaldos";
			inputMap = this.jButtonAbrirOrderByProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoTotalizarSaldos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoTotalizarSaldos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoTotalizarSaldos.setName("jPanelOrderByProcesoTotalizarSaldos"); 
			
			this.jPanelOrderByProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoTotalizarSaldos.setLayout(gridaBagLayoutOrderByProcesoTotalizarSaldos);
			
			
			this.jTableDatosProcesoTotalizarSaldosOrderBy = new JTableMe();        
			this.jTableDatosProcesoTotalizarSaldosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoTotalizarSaldosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoTotalizarSaldosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoTotalizarSaldosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoTotalizarSaldosOrderBy.setViewportView(this.jTableDatosProcesoTotalizarSaldosOrderBy);
			this.jTableDatosProcesoTotalizarSaldosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoTotalizarSaldosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoTotalizarSaldos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoTotalizarSaldos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoTotalizarSaldos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoTotalizarSaldos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setResizable(true);
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setClosable(true);
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoTotalizarSaldos.ipady =150;
				
			this.jPanelOrderByProcesoTotalizarSaldos.add(jScrollPanelDatosProcesoTotalizarSaldosOrderBy, this.gridBagConstraintsProcesoTotalizarSaldos);//this.jTableDatosProcesoTotalizarSaldosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoTotalizarSaldos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoTotalizarSaldos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoTotalizarSaldos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoTotalizarSaldos.setToolTipText("Cancelar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoTotalizarSaldos.add(this.jButtonCerrarOrderByProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoTotalizarSaldos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoTotalizarSaldos= new JScrollPane(jPanelOrderByProcesoTotalizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoTotalizarSaldos);
			
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getContentPane().add(this.jScrollPanelOrderByProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoTotalizarSaldos = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoTotalizarSaldos.getRowHeight();//ProcesoTotalizarSaldosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.isSelected()) {
					iHeightTable=ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoTotalizarSaldos.isSelected()) {
					iHeightTable=ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoTotalizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoTotalizarSaldos!=null && this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoTotalizarSaldos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesototalizarsaldoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoTotalizarSaldos> TraerProcesoTotalizarSaldosBeans(List<ProcesoTotalizarSaldos> procesototalizarsaldoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoTotalizarSaldos procesototalizarsaldos:procesototalizarsaldoss) {
					
				if(!(ProcesoTotalizarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoTotalizarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesototalizarsaldos.setsDetalleGeneralEntityReporte(ProcesoTotalizarSaldosConstantesFunciones.getProcesoTotalizarSaldosDescripcion(procesototalizarsaldos));
										
						
					
						
					
				} else  {
							
					//procesototalizarsaldos.setsDetalleGeneralEntityReporte(procesototalizarsaldos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesototalizarsaldosbeans.add(procesototalizarsaldosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesototalizarsaldoss;
    }
	//PARA REPORTES FIN
}
