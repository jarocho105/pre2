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
import com.bydan.erp.contabilidad.util.report.ProcesoSincronizarSaldosConstantesFunciones;

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
public class ProcesoSincronizarSaldosJInternalFrame extends ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoSincronizarSaldos;
	
	protected JMenuBar jmenuBarProcesoSincronizarSaldos;
	
	protected JMenu jmenuProcesoSincronizarSaldos;
	protected JMenu jmenuDatosProcesoSincronizarSaldos;
	protected JMenu jmenuArchivoProcesoSincronizarSaldos;
	protected JMenu jmenuAccionesProcesoSincronizarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoSincronizarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoSincronizarSaldos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoSincronizarSaldos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoSincronizarSaldos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoSincronizarSaldos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public ProcesoSincronizarSaldosSessionBean procesosincronizarsaldosSessionBean;
		
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoSincronizarSaldos> procesosincronizarsaldoss;		
	public List<ProcesoSincronizarSaldos> procesosincronizarsaldossEliminados;	
	public List<ProcesoSincronizarSaldos> procesosincronizarsaldossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoSincronizarSaldos;		
	protected JButton jButtonAbrirOrderByProcesoSincronizarSaldos;
	
	
	//protected JPanel jPanelOrderByProcesoSincronizarSaldos;
	//public JScrollPane jScrollPanelOrderByProcesoSincronizarSaldos;	
	//protected JButton jButtonCerrarOrderByProcesoSincronizarSaldos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoSincronizarSaldosLogic procesosincronizarsaldosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoSincronizarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoSincronizarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoSincronizarSaldos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoSincronizarSaldosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoSincronizarSaldos;
	//public JScrollPane jScrollPanelImportacionProcesoSincronizarSaldos;
	
	
	
	protected JPanel jPanelAccionesProcesoSincronizarSaldos;
	
    protected JPanel jPanelPaginacionProcesoSincronizarSaldos;
    protected JPanel jPanelParametrosReportesProcesoSincronizarSaldos;
	protected JPanel jPanelParametrosReportesAccionesProcesoSincronizarSaldos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoSincronizarSaldos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoSincronizarSaldos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoSincronizarSaldos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoSincronizarSaldos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoSincronizarSaldos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoSincronizarSaldos;
	//protected JPanel jPanelImportacionProcesoSincronizarSaldos;
	
	
	public JTable jTableDatosProcesoSincronizarSaldos;
	
	
	
	//public JTable jTableDatosProcesoSincronizarSaldosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoSincronizarSaldos;
	protected JButton jButtonDuplicarProcesoSincronizarSaldos;
	protected JButton jButtonCopiarProcesoSincronizarSaldos;
	protected JButton jButtonVerFormProcesoSincronizarSaldos;
	protected JButton jButtonNuevoRelacionesProcesoSincronizarSaldos;
	protected JButton jButtonModificarProcesoSincronizarSaldos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoSincronizarSaldos;
	protected JButton jButtonCerrarProcesoSincronizarSaldos;
	
	
	protected JButton jButtonRecargarInformacionProcesoSincronizarSaldos;
	protected JButton jButtonProcesarInformacionProcesoSincronizarSaldos;
	
	
	protected JButton jButtonAnterioresProcesoSincronizarSaldos;
	protected JButton jButtonSiguientesProcesoSincronizarSaldos;
	protected JButton jButtonNuevoGuardarCambiosProcesoSincronizarSaldos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoSincronizarSaldos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoSincronizarSaldos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoSincronizarSaldos;
	//protected JButton jButtonGenerarImportacionProcesoSincronizarSaldos;
	//protected JButton jButtonCerrarImportacionProcesoSincronizarSaldos;
	//protected JFileChooser jFileChooserImportacionProcesoSincronizarSaldos;
	//protected File fileImportacionProcesoSincronizarSaldos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoSincronizarSaldos;
	protected JButton jButtonDuplicarToolBarProcesoSincronizarSaldos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoSincronizarSaldos;
	protected JButton jButtonCopiarToolBarProcesoSincronizarSaldos;
	protected JButton jButtonVerFormToolBarProcesoSincronizarSaldos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoSincronizarSaldos;
	protected JButton jButtonCerrarToolBarProcesoSincronizarSaldos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoSincronizarSaldos;
	protected JButton jButtonProcesarInformacionToolBarProcesoSincronizarSaldos;
	protected JButton jButtonAnterioresToolBarProcesoSincronizarSaldos;
	protected JButton jButtonSiguientesToolBarProcesoSincronizarSaldos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos;
	protected JButton jButtonAbrirOrderByToolBarProcesoSincronizarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDuplicarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoSincronizarSaldos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemCopiarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemVerFormProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemAnterioresProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemSiguientesProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoSincronizarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoSincronizarSaldos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoSincronizarSaldos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoSincronizarSaldos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoSincronizarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoSincronizarSaldos;
	protected JTextField jTextFieldValorCampoGeneralProcesoSincronizarSaldos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoSincronizarSaldos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoSincronizarSaldos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoSincronizarSaldos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoSincronizarSaldos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoSincronizarSaldos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoSincronizarSaldos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoSincronizarSaldos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoSincronizarSaldos;	
	//public JLabel jLabelPathArchivoImportacionProcesoSincronizarSaldos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoSincronizarSaldos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoSincronizarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoSincronizarSaldos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoSincronizarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoSincronizarSaldos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoSincronizarSaldos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoSincronizarSaldos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoSincronizarSaldos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoSincronizarSaldos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoSincronizarSaldos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoSincronizarSaldos;
	public JPanel jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	public JButton jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	
	public JPanel jPanelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	public JLabel jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	public JButton jButtonid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	public JLabel jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos;
	public JButton jButtonid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new JButtonMe();
	public JButton jButtonid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoSincronizarSaldosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoSincronizarSaldos)	{
		this.jButtonRecargarInformacionProcesoSincronizarSaldos = jButtonRecargarInformacionProcesoSincronizarSaldos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoSincronizarSaldos() {
		return this.jButtonProcesarInformacionProcesoSincronizarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoSincronizarSaldos)	{
		this.jButtonProcesarInformacionProcesoSincronizarSaldos = jButtonProcesarInformacionProcesoSincronizarSaldos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoSincronizarSaldos() {
		return this.jButtonRecargarInformacionProcesoSincronizarSaldos;
	}
	
	
	public List<ProcesoSincronizarSaldos> getprocesosincronizarsaldoss() {
		return this.procesosincronizarsaldoss;
	}

	public void setprocesosincronizarsaldoss(List<ProcesoSincronizarSaldos> procesosincronizarsaldoss) {
		this.procesosincronizarsaldoss = procesosincronizarsaldoss;
	}
	
	public List<ProcesoSincronizarSaldos> getprocesosincronizarsaldossAux() {
		return this.procesosincronizarsaldossAux;
	}

	public void setprocesosincronizarsaldossAux(List<ProcesoSincronizarSaldos> procesosincronizarsaldossAux) {
		this.procesosincronizarsaldossAux = procesosincronizarsaldossAux;
	}
	
	public List<ProcesoSincronizarSaldos> getprocesosincronizarsaldossEliminados() {
		return this.procesosincronizarsaldossEliminados;
	}

	public void setProcesoSincronizarSaldossEliminados(List<ProcesoSincronizarSaldos> procesosincronizarsaldossEliminados) {
		this.procesosincronizarsaldossEliminados = procesosincronizarsaldossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoSincronizarSaldos() {
		return jComboBoxTiposSeleccionarProcesoSincronizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposSeleccionarProcesoSincronizarSaldos) {
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos = jComboBoxTiposSeleccionarProcesoSincronizarSaldos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoSincronizarSaldos() {
		return jTextFieldValorCampoGeneralProcesoSincronizarSaldos;
	}

	public void setjTextFieldValorCampoGeneralProcesoSincronizarSaldos(
			JTextField jTextFieldValorCampoGeneralProcesoSincronizarSaldos) {
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos = jTextFieldValorCampoGeneralProcesoSincronizarSaldos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoSincronizarSaldos() {
		return this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoSincronizarSaldos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoSincronizarSaldos) {
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos = jCheckBoxSeleccionarTodosProcesoSincronizarSaldos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoSincronizarSaldos() {
		return this.jCheckBoxSeleccionadosProcesoSincronizarSaldos;
	}

	public void setjCheckBoxSeleccionadosProcesoSincronizarSaldos(
			JCheckBox jCheckBoxSeleccionadosProcesoSincronizarSaldos) {
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos = jCheckBoxSeleccionadosProcesoSincronizarSaldos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposArchivosReportesProcesoSincronizarSaldos) {
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos = jComboBoxTiposArchivosReportesProcesoSincronizarSaldos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposReportesProcesoSincronizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposReportesProcesoSincronizarSaldos) {
		this.jComboBoxTiposReportesProcesoSincronizarSaldos = jComboBoxTiposReportesProcesoSincronizarSaldos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoSincronizarSaldos() {
	//	return jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoSincronizarSaldos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos = jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos = jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposGraficosReportesProcesoSincronizarSaldos) {
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos = jComboBoxTiposGraficosReportesProcesoSincronizarSaldos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoSincronizarSaldos() {
		return this.jComboBoxTiposPaginacionProcesoSincronizarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposPaginacionProcesoSincronizarSaldos) {
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos = jComboBoxTiposPaginacionProcesoSincronizarSaldos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposRelacionesProcesoSincronizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposAccionesProcesoSincronizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoSincronizarSaldos) {
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos = jComboBoxTiposRelacionesProcesoSincronizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoSincronizarSaldos) {
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos = jComboBoxTiposAccionesProcesoSincronizarSaldos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoSincronizarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoSincronizarSaldos() {
	//	return jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoSincronizarSaldos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos = jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoSincronizarSaldos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoSincronizarSaldos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos .setBorder(borderResaltar);		
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
		this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
		
		this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosincronizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoSincronizarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sincronizar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoSincronizarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoSincronizarSaldos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"copiar","copiar","Copiar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"ver_form","ver_form","Ver"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"recargar","recargar","PROCESAR"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"PROCESAR",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,
							"cerrar","cerrar","Salir"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos;
			
				this.jButtonProcesarInformacionToolBarProcesoSincronizarSaldos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoSincronizarSaldos;
				
		//protected JButton jButtonModificarToolBarProcesoSincronizarSaldos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoSincronizarSaldos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoSincronizarSaldos=new JMenuMe("General");
		this.jmenuArchivoProcesoSincronizarSaldos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoSincronizarSaldos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoSincronizarSaldos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoSincronizarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoSincronizarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoSincronizarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoSincronizarSaldos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoSincronizarSaldos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoSincronizarSaldos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoSincronizarSaldos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoSincronizarSaldos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoSincronizarSaldos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoSincronizarSaldos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoSincronizarSaldos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoSincronizarSaldos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoSincronizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoSincronizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoSincronizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoSincronizarSaldos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoSincronizarSaldos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoSincronizarSaldos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoSincronizarSaldos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoSincronizarSaldos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoSincronizarSaldos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoSincronizarSaldos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoSincronizarSaldos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoSincronizarSaldos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoSincronizarSaldos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoSincronizarSaldos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoSincronizarSaldos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoSincronizarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoSincronizarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoSincronizarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoSincronizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoSincronizarSaldos.add(this.jMenuItemCerrarProcesoSincronizarSaldos);
			
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemNuevoProcesoSincronizarSaldos);
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos);
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos);
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos);		
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemDuplicarProcesoSincronizarSaldos);		
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemCopiarProcesoSincronizarSaldos);		
			this.jmenuAccionesProcesoSincronizarSaldos.add(this.jMenuItemVerFormProcesoSincronizarSaldos);		
			
			this.jmenuDatosProcesoSincronizarSaldos.add(this.jMenuItemRecargarInformacionProcesoSincronizarSaldos);				
			this.jmenuDatosProcesoSincronizarSaldos.add(this.jMenuItemAnterioresProcesoSincronizarSaldos);				
			this.jmenuDatosProcesoSincronizarSaldos.add(this.jMenuItemSiguientesProcesoSincronizarSaldos);				
			this.jmenuDatosProcesoSincronizarSaldos.add(this.jMenuItemAbrirOrderByProcesoSincronizarSaldos);				
			this.jmenuDatosProcesoSincronizarSaldos.add(this.jMenuItemMostrarOcultarProcesoSincronizarSaldos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoSincronizarSaldos.add(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoSincronizarSaldos.add(this.jmenuArchivoProcesoSincronizarSaldos);		
			this.jmenuBarProcesoSincronizarSaldos.add(this.jmenuAccionesProcesoSincronizarSaldos);		
			this.jmenuBarProcesoSincronizarSaldos.add(this.jmenuDatosProcesoSincronizarSaldos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoSincronizarSaldos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoSincronizarSaldos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setToolTipText("PROCESAR Por Ejercicio Por Periodo ");
		this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new JButtonMe();
		this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setText("PROCESAR");
		this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setToolTipText("PROCESAR Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"buscar_button","PROCESAR Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos = new JLabelMe();
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos = new JLabelMe();
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setText("Periodo :");
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setToolTipText("Periodo");
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new JComboBoxMe();
		jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoSincronizarSaldos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoSincronizarSaldos = new ProcesoSincronizarSaldosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sincronizar Saldos DATOS");
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos = new ProcesoSincronizarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones(),this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos = null;//new ProcesoSincronizarSaldosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoSincronizarSaldos= new GridBagLayout();
		
		
		this.jTableDatosProcesoSincronizarSaldos = new JTableMe();      
		
		String sToolTipProcesoSincronizarSaldos="";
		sToolTipProcesoSincronizarSaldos=ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoSincronizarSaldos+="(Contabilidad.ProcesoSincronizarSaldos)";
		}
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoSincronizarSaldos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoSincronizarSaldos.setToolTipText(sToolTipProcesoSincronizarSaldos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoSincronizarSaldos);
		this.jTableDatosProcesoSincronizarSaldos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoSincronizarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoSincronizarSaldos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoSincronizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonDuplicarProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonCopiarProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonVerFormProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoSincronizarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoSincronizarSaldos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoSincronizarSaldos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sincronizar Saldos";
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoSincronizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoSincronizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoSincronizarSaldos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos=new ReporteDinamicoJInternalFrame(ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoSincronizarSaldos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoSincronizarSaldos=new ImportacionJInternalFrame(ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoSincronizarSaldos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoSincronizarSaldos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoSincronizarSaldos.setText("Orden");
		this.jButtonAbrirOrderByProcesoSincronizarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoSincronizarSaldos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoSincronizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSincronizarSaldos,false,this);
			
			//this.cargarOrderByProcesoSincronizarSaldos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoSincronizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSincronizarSaldos,true,this);
			
			//this.cargarOrderByProcesoSincronizarSaldos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoSincronizarSaldos.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoSincronizarSaldos.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoSincronizarSaldos.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoSincronizarSaldos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoSincronizarSaldos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoSincronizarSaldos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoSincronizarSaldos.setText("Nuevo");
		this.jButtonDuplicarProcesoSincronizarSaldos.setText("Duplicar");
		this.jButtonCopiarProcesoSincronizarSaldos.setText("Copiar");
		this.jButtonVerFormProcesoSincronizarSaldos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoSincronizarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoSincronizarSaldos,"nuevo_button","Nuevo",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoSincronizarSaldos,"duplicar_button","Duplicar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoSincronizarSaldos,"copiar_button","Copiar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoSincronizarSaldos,"ver_form","Ver",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoSincronizarSaldos,"nuevorelaciones_button","Nuevo Rel",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos,"guardarcambiostabla_button","Guardar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoSincronizarSaldos,"cerrar_button","Salir",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoSincronizarSaldos.setToolTipText("Nuevo"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoSincronizarSaldos.setToolTipText("Duplicar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoSincronizarSaldos.setToolTipText("Copiar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoSincronizarSaldos.setToolTipText("Ver"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.setToolTipText("Nuevo Rel"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setToolTipText("Guardar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoSincronizarSaldos.setToolTipText("Salir"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoSincronizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoSincronizarSaldos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoSincronizarSaldos";
		inputMap = this.jButtonDuplicarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoSincronizarSaldos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoSincronizarSaldos";
		inputMap = this.jButtonCopiarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoSincronizarSaldos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoSincronizarSaldos";
		inputMap = this.jButtonVerFormProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoSincronizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoSincronizarSaldos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoSincronizarSaldos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoSincronizarSaldos";
		inputMap = this.jButtonModificarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoSincronizarSaldos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoSincronizarSaldos";
		inputMap = this.jButtonCerrarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoSincronizarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoSincronizarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoSincronizarSaldos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoSincronizarSaldos.setName("jPanelParametrosReportesProcesoSincronizarSaldos"); 
		
		this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos.setName("jPanelParametrosReportesAccionesProcesoSincronizarSaldos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setText("PROCESAR");
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setToolTipText("PROCESAR"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoSincronizarSaldos,"recargar_button","PROCESAR");		
		
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setToolTipText("Procesar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoSincronizarSaldos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoSincronizarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoSincronizarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoSincronizarSaldos = new JButtonMe();
		//this.jButtonAnterioresProcesoSincronizarSaldos.setText("<<");
        this.jButtonAnterioresProcesoSincronizarSaldos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoSincronizarSaldos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoSincronizarSaldos = new JButtonMe();
		//this.jButtonSiguientesProcesoSincronizarSaldos.setText(">>");
        this.jButtonSiguientesProcesoSincronizarSaldos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoSincronizarSaldos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos,"nuevoguardarcambios_button","Nue",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoSincronizarSaldos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoSincronizarSaldos";
		inputMap = this.jButtonRecargarInformacionProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoSincronizarSaldos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoSincronizarSaldos";
		inputMap = this.jButtonSiguientesProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoSincronizarSaldos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoSincronizarSaldos";
		inputMap = this.jButtonAnterioresProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoSincronizarSaldos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoSincronizarSaldos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(this.getWidth(),ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(this.getWidth(),ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(this.getWidth(),ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSincronizarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoSincronizarSaldos = new GridBagLayout();

			this.jPanelPaginacionProcesoSincronizarSaldos.setLayout(gridaBagLayoutPaginacionProcesoSincronizarSaldos);						
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonAnterioresProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					
						
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
			
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
						
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonSiguientesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonNuevoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
						
			
			
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
				this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			}
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonProcesarInformacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonDuplicarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonCopiarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonVerFormProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoSincronizarSaldos.add(this.jButtonCerrarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
		
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoSincronizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoSincronizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoSincronizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoSincronizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoSincronizarSaldos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoSincronizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoSincronizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoSincronizarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoSincronizarSaldos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoSincronizarSaldos.setLayout(gridaBagParametrosReportesProcesoSincronizarSaldos);
			this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos.setLayout(gridaBagParametrosReportesAccionesProcesoSincronizarSaldos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos.setLayout(gridaBagParametrosAuxiliar1ProcesoSincronizarSaldos);
			this.jPanelParametrosAuxiliar2ProcesoSincronizarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoSincronizarSaldos);
			this.jPanelParametrosAuxiliar3ProcesoSincronizarSaldos.setLayout(gridaBagParametrosAuxiliar3ProcesoSincronizarSaldos);
			this.jPanelParametrosAuxiliar4ProcesoSincronizarSaldos.setLayout(gridaBagParametrosAuxiliar4ProcesoSincronizarSaldos);
			//this.jPanelParametrosAuxiliar5ProcesoSincronizarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoSincronizarSaldos);			
			
			
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jButtonRecargarInformacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos.add(this.jComboBoxTiposPaginacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos.add(this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos.add(this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jPanelParametrosAuxiliar1ProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoSincronizarSaldos.add(this.jComboBoxTiposReportesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jPanelParametrosAuxiliar4ProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jComboBoxTiposReportesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jCheckBoxGenerarReporteProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jPanelParametrosAuxiliar2ProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jLabelAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
			
			
			/*
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoSincronizarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);															
				
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoSincronizarSaldos.add(this.jCheckBoxSeleccionadosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jPanelParametrosAuxiliar3ProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSincronizarSaldos.add(this.jComboBoxTiposAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoSincronizarSaldos = new GridBagLayout();

			this.jScrollPanelDatosProcesoSincronizarSaldos.setLayout(gridaBagLayoutDatosProcesoSincronizarSaldos);
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
			
			this.jScrollPanelDatosProcesoSincronizarSaldos.add(this.jTableDatosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoSincronizarSaldos.setViewportView(this.jTableDatosProcesoSincronizarSaldos);
		this.jTableDatosProcesoSincronizarSaldos.setFillsViewportHeight(true);
		this.jTableDatosProcesoSincronizarSaldos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoSincronizarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoSincronizarSaldos.setLayout(gridaBagLayoutAccionesProcesoSincronizarSaldos);
		
		
		/*	
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
			
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonNuevoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setLayout(gridaBagLayoutBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);

		gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.add(jLabelid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);

		gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		gridBagConstraintsProcesoSincronizarSaldos.gridx = 1;
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.add(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);


		gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
		gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.add(jLabelid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);

		gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSincronizarSaldos.gridy = 1;
		gridBagConstraintsProcesoSincronizarSaldos.gridx = 1;
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.add(jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);

		gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSincronizarSaldos.gridy = 2;
		gridBagConstraintsProcesoSincronizarSaldos.gridx =1;
		jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.add(jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);

		jTabbedPaneBusquedasProcesoSincronizarSaldos.addTab("1.-Por Ejercicio Por Periodo ", jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
		jTabbedPaneBusquedasProcesoSincronizarSaldos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoSincronizarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoSincronizarSaldos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoSincronizarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;		
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;		
			this.gridBagConstraintsProcesoSincronizarSaldos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);								
		
		
		/*
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/		
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =0;
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoSincronizarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
				
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoSincronizarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoSincronizarSaldos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoSincronizarSaldos.setLayout(gridaBagLayoutBusquedasParametrosProcesoSincronizarSaldos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(false);
		this.jButtonAnterioresProcesoSincronizarSaldos.setVisible(false);
		this.jButtonSiguientesProcesoSincronizarSaldos.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposReportesProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.setVisible(false);
		
		this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(false);
		
		
		this.jTtoolBarProcesoSincronizarSaldos.setVisible(false);
			
		this.jMenuItemAnterioresProcesoSincronizarSaldos.setVisible(false);
		this.jMenuItemSiguientesProcesoSincronizarSaldos.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoSincronizarSaldos.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoSincronizarSaldos.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoSincronizarSaldos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoSincronizarSaldos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoSincronizarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setName("jPanelReporteDinamicoProcesoSincronizarSaldos"); 
		
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.setLayout(gridaBagLayoutReporteDinamicoProcesoSincronizarSaldos);
		
		
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoSincronizarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoSincronizarSaldos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jLabelColumnasSelectReporteProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoSincronizarSaldos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoSincronizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoSincronizarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoSincronizarSaldos=new JScrollPane(this.jListColumnasSelectReporteProcesoSincronizarSaldos);
			
			this.jScrollColumnasSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jListColumnasSelectReporteProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jScrollColumnasSelectReporteProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoSincronizarSaldos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoSincronizarSaldos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoSincronizarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoSincronizarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoSincronizarSaldos=new JScrollPane(this.jListRelacionesSelectReporteProcesoSincronizarSaldos);
			
			this.jScrollRelacionesSelectReporteProcesoSincronizarSaldos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoSincronizarSaldos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoSincronizarSaldos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoSincronizarSaldos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoSincronizarSaldos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jLabelGenerarExcelReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos.setToolTipText("Generar EXCEL"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jComboBoxTiposReportesDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jLabelTiposArchivoReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos.setToolTipText("Generar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos.setToolTipText("Cancelar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSincronizarSaldos.add(this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoSincronizarSaldos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos= new JScrollPane(jPanelReporteDinamicoProcesoSincronizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoSincronizarSaldos);
		this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoSincronizarSaldos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoSincronizarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoSincronizarSaldos.setName("jPanelImportacionProcesoSincronizarSaldos"); 
		
		this.jPanelImportacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoSincronizarSaldos.setLayout(gridaBagLayoutImportacionProcesoSincronizarSaldos);
		
		
		this.jInternalFrameImportacionProcesoSincronizarSaldos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoSincronizarSaldos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoSincronizarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoSincronizarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoSincronizarSaldos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoSincronizarSaldos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jLabelArchivoImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoSincronizarSaldos = new JFileChooser();		
		this.jFileChooserImportacionProcesoSincronizarSaldos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoSincronizarSaldos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoSincronizarSaldos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoSincronizarSaldos.setToolTipText("Generar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jButtonAbrirImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoSincronizarSaldos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoSincronizarSaldos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jLabelPathArchivoImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoSincronizarSaldos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoSincronizarSaldos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoSincronizarSaldos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoSincronizarSaldos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jTextFieldPathArchivoImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoSincronizarSaldos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoSincronizarSaldos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoSincronizarSaldos.setToolTipText("Generar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jButtonGenerarImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoSincronizarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoSincronizarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoSincronizarSaldos.setToolTipText("Cancelar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSincronizarSaldos.add(this.jButtonCerrarImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoSincronizarSaldos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoSincronizarSaldos= new JScrollPane(jPanelImportacionProcesoSincronizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoSincronizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoSincronizarSaldos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoSincronizarSaldos);
		this.jInternalFrameImportacionProcesoSincronizarSaldos.getContentPane().add(this.jScrollPanelImportacionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoSincronizarSaldos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoSincronizarSaldos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoSincronizarSaldos.setText("Orden");
			this.jButtonAbrirOrderByProcesoSincronizarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoSincronizarSaldos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoSincronizarSaldos";
			inputMap = this.jButtonAbrirOrderByProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoSincronizarSaldos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoSincronizarSaldos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoSincronizarSaldos.setName("jPanelOrderByProcesoSincronizarSaldos"); 
			
			this.jPanelOrderByProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoSincronizarSaldos.setLayout(gridaBagLayoutOrderByProcesoSincronizarSaldos);
			
			
			this.jTableDatosProcesoSincronizarSaldosOrderBy = new JTableMe();        
			this.jTableDatosProcesoSincronizarSaldosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoSincronizarSaldosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoSincronizarSaldosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoSincronizarSaldosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoSincronizarSaldosOrderBy.setViewportView(this.jTableDatosProcesoSincronizarSaldosOrderBy);
			this.jTableDatosProcesoSincronizarSaldosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoSincronizarSaldosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoSincronizarSaldos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoSincronizarSaldos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoSincronizarSaldos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoSincronizarSaldos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setResizable(true);
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setClosable(true);
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoSincronizarSaldos.ipady =150;
				
			this.jPanelOrderByProcesoSincronizarSaldos.add(jScrollPanelDatosProcesoSincronizarSaldosOrderBy, this.gridBagConstraintsProcesoSincronizarSaldos);//this.jTableDatosProcesoSincronizarSaldosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoSincronizarSaldos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoSincronizarSaldos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoSincronizarSaldos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoSincronizarSaldos.setToolTipText("Cancelar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoSincronizarSaldos.add(this.jButtonCerrarOrderByProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoSincronizarSaldos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoSincronizarSaldos= new JScrollPane(jPanelOrderByProcesoSincronizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoSincronizarSaldos);
			
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getContentPane().add(this.jScrollPanelOrderByProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoSincronizarSaldos = new JButtonMe();
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
		//	&& this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoSincronizarSaldos.getRowHeight();//ProcesoSincronizarSaldosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.isSelected()) {
					iHeightTable=ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoSincronizarSaldos.isSelected()) {
					iHeightTable=ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoSincronizarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoSincronizarSaldos!=null && this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoSincronizarSaldos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosincronizarsaldoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoSincronizarSaldos> TraerProcesoSincronizarSaldosBeans(List<ProcesoSincronizarSaldos> procesosincronizarsaldoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoSincronizarSaldos procesosincronizarsaldos:procesosincronizarsaldoss) {
					
				if(!(ProcesoSincronizarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoSincronizarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesosincronizarsaldos.setsDetalleGeneralEntityReporte(ProcesoSincronizarSaldosConstantesFunciones.getProcesoSincronizarSaldosDescripcion(procesosincronizarsaldos));
										
						
					
						
					
				} else  {
							
					//procesosincronizarsaldos.setsDetalleGeneralEntityReporte(procesosincronizarsaldos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesosincronizarsaldosbeans.add(procesosincronizarsaldosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesosincronizarsaldoss;
    }
	//PARA REPORTES FIN
}
