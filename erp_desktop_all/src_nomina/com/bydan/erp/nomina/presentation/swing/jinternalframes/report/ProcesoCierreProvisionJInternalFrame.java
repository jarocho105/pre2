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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.nomina.util.report.ProcesoCierreProvisionConstantesFunciones;

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
public class ProcesoCierreProvisionJInternalFrame extends ProcesoCierreProvisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCierreProvision;
	
	protected JMenuBar jmenuBarProcesoCierreProvision;
	
	protected JMenu jmenuProcesoCierreProvision;
	protected JMenu jmenuDatosProcesoCierreProvision;
	protected JMenu jmenuArchivoProcesoCierreProvision;
	protected JMenu jmenuAccionesProcesoCierreProvision;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreProvision;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreProvision;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCierreProvision;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCierreProvision;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCierreProvision;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";
	
	public ProcesoCierreProvisionSessionBean procesocierreprovisionSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCierreProvision> procesocierreprovisions;		
	public List<ProcesoCierreProvision> procesocierreprovisionsEliminados;	
	public List<ProcesoCierreProvision> procesocierreprovisionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCierreProvision;		
	protected JButton jButtonAbrirOrderByProcesoCierreProvision;
	
	
	//protected JPanel jPanelOrderByProcesoCierreProvision;
	//public JScrollPane jScrollPanelOrderByProcesoCierreProvision;	
	//protected JButton jButtonCerrarOrderByProcesoCierreProvision;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCierreProvisionLogic procesocierreprovisionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCierreProvision;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreProvision;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreProvision;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCierreProvisionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCierreProvision;
	//public JScrollPane jScrollPanelImportacionProcesoCierreProvision;
	
	
	
	protected JPanel jPanelAccionesProcesoCierreProvision;
	
    protected JPanel jPanelPaginacionProcesoCierreProvision;
    protected JPanel jPanelParametrosReportesProcesoCierreProvision;
	protected JPanel jPanelParametrosReportesAccionesProcesoCierreProvision;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCierreProvision;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCierreProvision;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCierreProvision;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCierreProvision;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCierreProvision;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCierreProvision;
	//protected JPanel jPanelImportacionProcesoCierreProvision;
	
	
	public JTable jTableDatosProcesoCierreProvision;
	
	
	
	//public JTable jTableDatosProcesoCierreProvisionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCierreProvision;
	protected JButton jButtonDuplicarProcesoCierreProvision;
	protected JButton jButtonCopiarProcesoCierreProvision;
	protected JButton jButtonVerFormProcesoCierreProvision;
	protected JButton jButtonNuevoRelacionesProcesoCierreProvision;
	protected JButton jButtonModificarProcesoCierreProvision;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCierreProvision;
	protected JButton jButtonCerrarProcesoCierreProvision;
	
	
	protected JButton jButtonRecargarInformacionProcesoCierreProvision;
	protected JButton jButtonProcesarInformacionProcesoCierreProvision;
	
	
	protected JButton jButtonAnterioresProcesoCierreProvision;
	protected JButton jButtonSiguientesProcesoCierreProvision;
	protected JButton jButtonNuevoGuardarCambiosProcesoCierreProvision;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCierreProvision;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCierreProvision;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCierreProvision;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCierreProvision;
	//protected JButton jButtonGenerarImportacionProcesoCierreProvision;
	//protected JButton jButtonCerrarImportacionProcesoCierreProvision;
	//protected JFileChooser jFileChooserImportacionProcesoCierreProvision;
	//protected File fileImportacionProcesoCierreProvision;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreProvision;
	protected JButton jButtonDuplicarToolBarProcesoCierreProvision;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCierreProvision;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCierreProvision;
	protected JButton jButtonCopiarToolBarProcesoCierreProvision;
	protected JButton jButtonVerFormToolBarProcesoCierreProvision;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCierreProvision;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreProvision;
	protected JButton jButtonCerrarToolBarProcesoCierreProvision;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCierreProvision;
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreProvision;
	protected JButton jButtonAnterioresToolBarProcesoCierreProvision;
	protected JButton jButtonSiguientesToolBarProcesoCierreProvision;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision;
	protected JButton jButtonAbrirOrderByToolBarProcesoCierreProvision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreProvision;
	protected JMenuItem jMenuItemDuplicarProcesoCierreProvision;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCierreProvision;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCierreProvision;
	protected JMenuItem jMenuItemCopiarProcesoCierreProvision;
	protected JMenuItem jMenuItemVerFormProcesoCierreProvision;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreProvision;
	protected JMenuItem jMenuItemCerrarProcesoCierreProvision;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreProvision;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCierreProvision;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreProvision;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCierreProvision;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreProvision;
	protected JMenuItem jMenuItemAnterioresProcesoCierreProvision;
	protected JMenuItem jMenuItemSiguientesProcesoCierreProvision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreProvision;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCierreProvision;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreProvision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreProvision;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCierreProvision;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCierreProvision;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCierreProvision;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCierreProvision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCierreProvision;
	protected JTextField jTextFieldValorCampoGeneralProcesoCierreProvision;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCierreProvision;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCierreProvision;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCierreProvision;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCierreProvision;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCierreProvision;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCierreProvision;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCierreProvision;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreProvision;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCierreProvision;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCierreProvision;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCierreProvision;	
	//public JLabel jLabelPathArchivoImportacionProcesoCierreProvision;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCierreProvision;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCierreProvision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCierreProvision;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCierreProvision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCierreProvision;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCierreProvision;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCierreProvision;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCierreProvision;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCierreProvision;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCierreProvision;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCierreProvision;
	public JPanel jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JButton jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision;
	
	public JPanel jPanelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JLabel jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JButton jButtonid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoCierreProvisionProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoCierreProvisionProcesoCierreProvisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JLabel jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JButton jButtonid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JLabel jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JButton jButtonid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JLabel jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision;
	public JButton jButtonid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvisionBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoCierreProvisionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCierreProvision)	{
		this.jButtonRecargarInformacionProcesoCierreProvision = jButtonRecargarInformacionProcesoCierreProvision;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCierreProvision() {
		return this.jButtonProcesarInformacionProcesoCierreProvision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreProvision)	{
		this.jButtonProcesarInformacionProcesoCierreProvision = jButtonProcesarInformacionProcesoCierreProvision;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCierreProvision() {
		return this.jButtonRecargarInformacionProcesoCierreProvision;
	}
	
	
	public List<ProcesoCierreProvision> getprocesocierreprovisions() {
		return this.procesocierreprovisions;
	}

	public void setprocesocierreprovisions(List<ProcesoCierreProvision> procesocierreprovisions) {
		this.procesocierreprovisions = procesocierreprovisions;
	}
	
	public List<ProcesoCierreProvision> getprocesocierreprovisionsAux() {
		return this.procesocierreprovisionsAux;
	}

	public void setprocesocierreprovisionsAux(List<ProcesoCierreProvision> procesocierreprovisionsAux) {
		this.procesocierreprovisionsAux = procesocierreprovisionsAux;
	}
	
	public List<ProcesoCierreProvision> getprocesocierreprovisionsEliminados() {
		return this.procesocierreprovisionsEliminados;
	}

	public void setProcesoCierreProvisionsEliminados(List<ProcesoCierreProvision> procesocierreprovisionsEliminados) {
		this.procesocierreprovisionsEliminados = procesocierreprovisionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCierreProvision() {
		return jComboBoxTiposSeleccionarProcesoCierreProvision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCierreProvision(
			JComboBox jComboBoxTiposSeleccionarProcesoCierreProvision) {
		this.jComboBoxTiposSeleccionarProcesoCierreProvision = jComboBoxTiposSeleccionarProcesoCierreProvision;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCierreProvision() {
		return jTextFieldValorCampoGeneralProcesoCierreProvision;
	}

	public void setjTextFieldValorCampoGeneralProcesoCierreProvision(
			JTextField jTextFieldValorCampoGeneralProcesoCierreProvision) {
		this.jTextFieldValorCampoGeneralProcesoCierreProvision = jTextFieldValorCampoGeneralProcesoCierreProvision;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCierreProvision .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCierreProvision() {
		return this.jCheckBoxSeleccionarTodosProcesoCierreProvision;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCierreProvision(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCierreProvision) {
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision = jCheckBoxSeleccionarTodosProcesoCierreProvision;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCierreProvision() {
		return this.jCheckBoxSeleccionadosProcesoCierreProvision;
	}

	public void setjCheckBoxSeleccionadosProcesoCierreProvision(
			JCheckBox jCheckBoxSeleccionadosProcesoCierreProvision) {
		this.jCheckBoxSeleccionadosProcesoCierreProvision = jCheckBoxSeleccionadosProcesoCierreProvision;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCierreProvision() {
		return this.jComboBoxTiposArchivosReportesProcesoCierreProvision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCierreProvision(
			JComboBox jComboBoxTiposArchivosReportesProcesoCierreProvision) {
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision = jComboBoxTiposArchivosReportesProcesoCierreProvision;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCierreProvision() {
		return this.jComboBoxTiposReportesProcesoCierreProvision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCierreProvision(
			JComboBox jComboBoxTiposReportesProcesoCierreProvision) {
		this.jComboBoxTiposReportesProcesoCierreProvision = jComboBoxTiposReportesProcesoCierreProvision;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCierreProvision() {
	//	return jComboBoxTiposReportesDinamicoProcesoCierreProvision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCierreProvision(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCierreProvision) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCierreProvision = jComboBoxTiposReportesDinamicoProcesoCierreProvision;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision = jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCierreProvision() {
		return this.jComboBoxTiposGraficosReportesProcesoCierreProvision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCierreProvision(
			JComboBox jComboBoxTiposGraficosReportesProcesoCierreProvision) {
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision = jComboBoxTiposGraficosReportesProcesoCierreProvision;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCierreProvision() {
		return this.jComboBoxTiposPaginacionProcesoCierreProvision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCierreProvision(
			JComboBox jComboBoxTiposPaginacionProcesoCierreProvision) {
		this.jComboBoxTiposPaginacionProcesoCierreProvision = jComboBoxTiposPaginacionProcesoCierreProvision;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCierreProvision() {
		return this.jComboBoxTiposRelacionesProcesoCierreProvision;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreProvision() {
		return this.jComboBoxTiposAccionesProcesoCierreProvision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreProvision(
			JComboBox jComboBoxTiposRelacionesProcesoCierreProvision) {
		this.jComboBoxTiposRelacionesProcesoCierreProvision = jComboBoxTiposRelacionesProcesoCierreProvision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreProvision(
			JComboBox jComboBoxTiposAccionesProcesoCierreProvision) {
		this.jComboBoxTiposAccionesProcesoCierreProvision = jComboBoxTiposAccionesProcesoCierreProvision;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCierreProvision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCierreProvision .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCierreProvision() {
	//	return jCheckBoxConGraficoDinamicoProcesoCierreProvision;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCierreProvision(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreProvision) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreProvision = jCheckBoxConGraficoDinamicoProcesoCierreProvision;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCierreProvision() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCierreProvision.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreProvision .setBorder(borderResaltar);		
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
		this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
		
		this.procesocierreprovisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreprovisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreprovisionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreProvisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Provision MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCierreProvisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCierreProvision= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"copiar","copiar","Copiar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"ver_form","ver_form","Ver"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"recargar","recargar","Procesar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,
							"cerrar","cerrar","Salir"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCierreProvision=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCierreProvision;
			
				this.jButtonProcesarInformacionToolBarProcesoCierreProvision=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCierreProvision;
				
		//protected JButton jButtonModificarToolBarProcesoCierreProvision;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCierreProvision=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCierreProvision=new JMenuMe("General");
		this.jmenuArchivoProcesoCierreProvision=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCierreProvision=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCierreProvision=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreProvision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreProvision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreProvision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCierreProvision= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCierreProvision.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCierreProvision,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCierreProvision= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCierreProvision.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCierreProvision,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCierreProvision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreProvision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreProvision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCierreProvision= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCierreProvision.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCierreProvision,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCierreProvision= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCierreProvision.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCierreProvision,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreProvision= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCierreProvision.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCierreProvision,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreProvision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreProvision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreProvision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCierreProvision= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCierreProvision.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCierreProvision,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCierreProvision= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCierreProvision.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCierreProvision,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCierreProvision= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCierreProvision.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCierreProvision,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCierreProvision= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCierreProvision.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCierreProvision,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCierreProvision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCierreProvision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCierreProvision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreProvision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreProvision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreProvision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreProvision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreProvision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreProvision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCierreProvision.add(this.jMenuItemCerrarProcesoCierreProvision);
			
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemNuevoProcesoCierreProvision);
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision);
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemNuevoRelacionesProcesoCierreProvision);
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemGuardarCambiosTablaProcesoCierreProvision);		
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemDuplicarProcesoCierreProvision);		
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemCopiarProcesoCierreProvision);		
			this.jmenuAccionesProcesoCierreProvision.add(this.jMenuItemVerFormProcesoCierreProvision);		
			
			this.jmenuDatosProcesoCierreProvision.add(this.jMenuItemRecargarInformacionProcesoCierreProvision);				
			this.jmenuDatosProcesoCierreProvision.add(this.jMenuItemAnterioresProcesoCierreProvision);				
			this.jmenuDatosProcesoCierreProvision.add(this.jMenuItemSiguientesProcesoCierreProvision);				
			this.jmenuDatosProcesoCierreProvision.add(this.jMenuItemAbrirOrderByProcesoCierreProvision);				
			this.jmenuDatosProcesoCierreProvision.add(this.jMenuItemMostrarOcultarProcesoCierreProvision);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCierreProvision.add(this.jMenuItemGuardarCambiosProcesoCierreProvision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCierreProvision.add(this.jmenuArchivoProcesoCierreProvision);		
			this.jmenuBarProcesoCierreProvision.add(this.jmenuAccionesProcesoCierreProvision);		
			this.jmenuBarProcesoCierreProvision.add(this.jmenuDatosProcesoCierreProvision);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCierreProvision);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCierreProvision() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Procesar Proceso Cierre Provision");
		this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision= new JButtonMe();
		this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision.setText("Procesar");
		this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Procesar Proceso Cierre Provision");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision,"buscar_button","Procesar Proceso Cierre Provision");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision = new JLabelMe();
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setText("Anio :");
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision = new JLabelMe();
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setText("Estructura :");
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision = new JLabelMe();
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setText("Empleado :");
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Empleado");
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision = new JLabelMe();
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setText("Defi Provision Empleado :");
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setToolTipText("Defi Provision Empleado");
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCierreProvision=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCierreProvision.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoCierreProvision.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoCierreProvision.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cierre Provision"));
		this.jTabbedPaneBusquedasProcesoCierreProvision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCierreProvision = new ProcesoCierreProvisionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cierre Provision DATOS");
			this.jInternalFrameDetalleFormProcesoCierreProvision = new ProcesoCierreProvisionDetalleFormJInternalFrame(jDesktopPane,this.procesocierreprovisionSessionBean.getConGuardarRelaciones(),this.procesocierreprovisionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCierreProvision = null;//new ProcesoCierreProvisionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreProvision= new GridBagLayout();
		
		
		this.jTableDatosProcesoCierreProvision = new JTableMe();      
		
		String sToolTipProcesoCierreProvision="";
		sToolTipProcesoCierreProvision=ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreProvision+="(Nomina.ProcesoCierreProvision)";
		}
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreProvision+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCierreProvision.setToolTipText(sToolTipProcesoCierreProvision);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCierreProvision);
		this.jTableDatosProcesoCierreProvision.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCierreProvision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCierreProvision.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCierreProvision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCierreProvision = new JButtonMe();
		this.jButtonDuplicarProcesoCierreProvision = new JButtonMe();
		this.jButtonCopiarProcesoCierreProvision = new JButtonMe();
		this.jButtonVerFormProcesoCierreProvision = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCierreProvision = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision = new JButtonMe();
		this.jButtonCerrarProcesoCierreProvision = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreProvision = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCierreProvision = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Provision";
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreProvision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreProvision.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreProvision.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCierreProvision=new ReporteDinamicoJInternalFrame(ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCierreProvision();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCierreProvision=new ImportacionJInternalFrame(ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCierreProvision();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCierreProvision = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCierreProvision.setText("Orden");
		this.jButtonAbrirOrderByProcesoCierreProvision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreProvision,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreProvision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreProvision,false,this);
			
			//this.cargarOrderByProcesoCierreProvision(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreProvision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreProvision,true,this);
			
			//this.cargarOrderByProcesoCierreProvision(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCierreProvision.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoCierreProvision.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoCierreProvision.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProcesoCierreProvision.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreProvision.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreProvision.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCierreProvision.setText("Nuevo");
		this.jButtonDuplicarProcesoCierreProvision.setText("Duplicar");
		this.jButtonCopiarProcesoCierreProvision.setText("Copiar");
		this.jButtonVerFormProcesoCierreProvision.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCierreProvision.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.setText("Guardar");
		this.jButtonCerrarProcesoCierreProvision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreProvision,"nuevo_button","Nuevo",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCierreProvision,"duplicar_button","Duplicar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCierreProvision,"copiar_button","Copiar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCierreProvision,"ver_form","Ver",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCierreProvision,"nuevorelaciones_button","Nuevo Rel",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreProvision,"guardarcambiostabla_button","Guardar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreProvision,"cerrar_button","Salir",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCierreProvision.setToolTipText("Nuevo"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCierreProvision.setToolTipText("Duplicar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCierreProvision.setToolTipText("Copiar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCierreProvision.setToolTipText("Ver"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCierreProvision.setToolTipText("Nuevo Rel"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.setToolTipText("Guardar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreProvision.setToolTipText("Salir"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreProvision";
		inputMap = this.jButtonNuevoProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreProvision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreProvision"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCierreProvision";
		inputMap = this.jButtonDuplicarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCierreProvision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCierreProvision"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCierreProvision";
		inputMap = this.jButtonCopiarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCierreProvision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCierreProvision"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCierreProvision";
		inputMap = this.jButtonVerFormProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCierreProvision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCierreProvision"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCierreProvision";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCierreProvision"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCierreProvision";
		inputMap = this.jButtonModificarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCierreProvision"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreProvision";
		inputMap = this.jButtonCerrarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreProvision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreProvision";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreProvision"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCierreProvision.setName("jPanelParametrosReportesProcesoCierreProvision"); 
		
		this.jPanelParametrosReportesAccionesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCierreProvision.setName("jPanelParametrosReportesAccionesProcesoCierreProvision"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCierreProvision = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCierreProvision.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCierreProvision.setToolTipText("Procesar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCierreProvision,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCierreProvision.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCierreProvision = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCierreProvision.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCierreProvision.setToolTipText("Procesar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCierreProvision.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCierreProvision.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreProvision.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreProvision.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCierreProvision.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCierreProvision.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCierreProvision.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCierreProvision.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCierreProvision.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreProvision.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreProvision.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCierreProvision.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCierreProvision=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCierreProvision = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreProvision.setText("Acciones");		
		this.jLabelAccionesProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCierreProvision = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCierreProvision.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCierreProvision.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCierreProvision = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCierreProvision = new JButtonMe();
		//this.jButtonAnterioresProcesoCierreProvision.setText("<<");
        this.jButtonAnterioresProcesoCierreProvision.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCierreProvision,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCierreProvision = new JButtonMe();
		//this.jButtonSiguientesProcesoCierreProvision.setText(">>");
        this.jButtonSiguientesProcesoCierreProvision.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCierreProvision,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCierreProvision.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCierreProvision,"nuevoguardarcambios_button","Nue",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCierreProvision";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCierreProvision"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCierreProvision";
		inputMap = this.jButtonRecargarInformacionProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCierreProvision"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCierreProvision";
		inputMap = this.jButtonSiguientesProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCierreProvision"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCierreProvision";
		inputMap = this.jButtonAnterioresProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCierreProvision"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCierreProvision();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCierreProvision.setMinimumSize(new Dimension(this.getWidth(),ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreProvision.setMaximumSize(new Dimension(this.getWidth(),ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreProvision.setPreferredSize(new Dimension(this.getWidth(),ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreProvisionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCierreProvision = new GridBagLayout();

			this.jPanelPaginacionProcesoCierreProvision.setLayout(gridaBagLayoutPaginacionProcesoCierreProvision);						
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonAnterioresProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					
						
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
			
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonNuevoGuardarCambiosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
						
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonSiguientesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonNuevoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
						
			
			
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
				this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonGuardarCambiosTablaProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			}
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonProcesarInformacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonDuplicarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonCopiarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonVerFormProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 1;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCierreProvision.add(this.jButtonCerrarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
		
		
		this.jButtonRecargarInformacionProcesoCierreProvision.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreProvision.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreProvision.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCierreProvision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreProvision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreProvision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCierreProvision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreProvision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreProvision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCierreProvision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreProvision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreProvision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCierreProvision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreProvision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreProvision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCierreProvision.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreProvision.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreProvision.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCierreProvision = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCierreProvision = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCierreProvision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCierreProvision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCierreProvision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCierreProvision = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCierreProvision.setLayout(gridaBagParametrosReportesProcesoCierreProvision);
			this.jPanelParametrosReportesAccionesProcesoCierreProvision.setLayout(gridaBagParametrosReportesAccionesProcesoCierreProvision);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCierreProvision.setLayout(gridaBagParametrosAuxiliar1ProcesoCierreProvision);
			this.jPanelParametrosAuxiliar2ProcesoCierreProvision.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreProvision);
			this.jPanelParametrosAuxiliar3ProcesoCierreProvision.setLayout(gridaBagParametrosAuxiliar3ProcesoCierreProvision);
			this.jPanelParametrosAuxiliar4ProcesoCierreProvision.setLayout(gridaBagParametrosAuxiliar4ProcesoCierreProvision);
			//this.jPanelParametrosAuxiliar5ProcesoCierreProvision.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreProvision);			
			
			
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jButtonRecargarInformacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreProvision.add(this.jComboBoxTiposPaginacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreProvision.add(this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreProvision.add(this.jComboBoxTiposArchivosReportesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jPanelParametrosAuxiliar1ProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCierreProvision.add(this.jComboBoxTiposReportesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jPanelParametrosAuxiliar4ProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jComboBoxTiposReportesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jCheckBoxGenerarReporteProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jPanelParametrosAuxiliar2ProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jLabelAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jComboBoxTiposSeleccionarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
			
			
			/*
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jCheckBoxSeleccionarTodosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreProvision.add(this.jCheckBoxSeleccionarTodosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);															
				
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreProvision.add(this.jCheckBoxSeleccionadosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jPanelParametrosAuxiliar3ProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreProvision.add(this.jComboBoxTiposAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCierreProvision = new GridBagLayout();

			this.jScrollPanelDatosProcesoCierreProvision.setLayout(gridaBagLayoutDatosProcesoCierreProvision);
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
			
			this.jScrollPanelDatosProcesoCierreProvision.add(this.jTableDatosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCierreProvision.setViewportView(this.jTableDatosProcesoCierreProvision);
		this.jTableDatosProcesoCierreProvision.setFillsViewportHeight(true);
		this.jTableDatosProcesoCierreProvision.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreProvision= new GridBagLayout();
		this.jPanelAccionesProcesoCierreProvision.setLayout(gridaBagLayoutAccionesProcesoCierreProvision);
		
		
		/*	
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
			
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonNuevoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.setLayout(gridaBagLayoutBusquedaProcesoCierreProvisionProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 0;
		gridBagConstraintsProcesoCierreProvision.gridx = 0;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jLabelid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 0;
		gridBagConstraintsProcesoCierreProvision.gridx = 1;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);


		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 1;
		gridBagConstraintsProcesoCierreProvision.gridx = 0;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jLabelid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 1;
		gridBagConstraintsProcesoCierreProvision.gridx = 1;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);


		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 2;
		gridBagConstraintsProcesoCierreProvision.gridx = 0;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jLabelid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 2;
		gridBagConstraintsProcesoCierreProvision.gridx = 1;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);


		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 3;
		gridBagConstraintsProcesoCierreProvision.gridx = 0;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jLabelid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 3;
		gridBagConstraintsProcesoCierreProvision.gridx = 1;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreProvision.gridy = 4;
		gridBagConstraintsProcesoCierreProvision.gridx =1;
		jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision.add(jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);

		jTabbedPaneBusquedasProcesoCierreProvision.addTab("1.-Por Anio Por Estructura Por Empleado Por Defi Provision Empleado ", jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);
		jTabbedPaneBusquedasProcesoCierreProvision.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreProvision);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreProvision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreProvision.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;		
		//this.gridBagConstraintsProcesoCierreProvision.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCierreProvision);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;		
			this.gridBagConstraintsProcesoCierreProvision.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCierreProvision.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);								
		
		
		/*
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		*/		
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreProvision.gridx =0;
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreProvision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
				
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCierreProvision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreProvision = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCierreProvision.setLayout(gridaBagLayoutBusquedasParametrosProcesoCierreProvision);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCierreProvision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCierreProvision.setVisible(false);
		this.jButtonAnterioresProcesoCierreProvision.setVisible(false);
		this.jButtonSiguientesProcesoCierreProvision.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCierreProvision.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCierreProvision.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCierreProvision.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCierreProvision.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposReportesProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCierreProvision.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCierreProvision.setVisible(false);
		
		
		this.jTtoolBarProcesoCierreProvision.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCierreProvision.setVisible(false);
		this.jMenuItemSiguientesProcesoCierreProvision.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCierreProvision.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCierreProvision.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreProvision.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCierreProvision.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCierreProvision.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCierreProvision;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCierreProvision() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCierreProvision = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCierreProvision.setName("jPanelReporteDinamicoProcesoCierreProvision"); 
		
		this.jPanelReporteDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCierreProvision.setLayout(gridaBagLayoutReporteDinamicoProcesoCierreProvision);
		
		
		this.jInternalFrameReporteDinamicoProcesoCierreProvision= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCierreProvision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreProvision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCierreProvision.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCierreProvision.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCierreProvision.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreProvision.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreProvision.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCierreProvision = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCierreProvision.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jLabelColumnasSelectReporteProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCierreProvision = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCierreProvision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCierreProvision.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCierreProvision=new JScrollPane(this.jListColumnasSelectReporteProcesoCierreProvision);
			
			this.jScrollColumnasSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jListColumnasSelectReporteProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jScrollColumnasSelectReporteProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCierreProvision = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCierreProvision.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCierreProvision = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCierreProvision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCierreProvision.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCierreProvision=new JScrollPane(this.jListRelacionesSelectReporteProcesoCierreProvision);
			
			this.jScrollRelacionesSelectReporteProcesoCierreProvision.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreProvision.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreProvision.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCierreProvision = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCierreProvision = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCierreProvision = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCierreProvision = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCierreProvision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jLabelGenerarExcelReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision.setToolTipText("Generar EXCEL"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jComboBoxTiposReportesDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jLabelTiposArchivoReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCierreProvision = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCierreProvision.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCierreProvision,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCierreProvision.setToolTipText("Generar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jButtonGenerarReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCierreProvision = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCierreProvision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCierreProvision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCierreProvision.setToolTipText("Cancelar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreProvision.add(this.jButtonCerrarReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCierreProvision = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCierreProvision= new JScrollPane(jPanelReporteDinamicoProcesoCierreProvision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCierreProvision.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreProvision.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreProvision.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCierreProvision);
		this.jInternalFrameReporteDinamicoProcesoCierreProvision.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCierreProvision() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCierreProvision = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCierreProvision.setName("jPanelImportacionProcesoCierreProvision"); 
		
		this.jPanelImportacionProcesoCierreProvision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreProvision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreProvision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCierreProvision.setLayout(gridaBagLayoutImportacionProcesoCierreProvision);
		
		
		this.jInternalFrameImportacionProcesoCierreProvision= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCierreProvision= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCierreProvision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreProvision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCierreProvision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreProvision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreProvision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCierreProvision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreProvision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreProvision.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreProvision.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreProvision.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCierreProvision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreProvision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreProvision.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCierreProvision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreProvision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreProvision.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreProvision.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreProvision.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCierreProvision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreProvision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreProvision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCierreProvision = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCierreProvision.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreProvision.add(this.jLabelArchivoImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCierreProvision = new JFileChooser();		
		this.jFileChooserImportacionProcesoCierreProvision.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCierreProvision = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCierreProvision.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCierreProvision,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCierreProvision.setToolTipText("Generar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreProvision.add(this.jButtonAbrirImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCierreProvision = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCierreProvision.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreProvision.add(this.jLabelPathArchivoImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCierreProvision=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCierreProvision.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreProvision.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreProvision.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreProvision.add(this.jTextFieldPathArchivoImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCierreProvision = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCierreProvision.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCierreProvision,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCierreProvision.setToolTipText("Generar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreProvision.add(this.jButtonGenerarImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCierreProvision = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCierreProvision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCierreProvision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCierreProvision.setToolTipText("Cancelar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreProvision.add(this.jButtonCerrarImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCierreProvision = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCierreProvision= new JScrollPane(jPanelImportacionProcesoCierreProvision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCierreProvision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCierreProvision.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCierreProvision);
		this.jInternalFrameImportacionProcesoCierreProvision.getContentPane().add(this.jScrollPanelImportacionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCierreProvision(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCierreProvision = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCierreProvision.setText("Orden");
			this.jButtonAbrirOrderByProcesoCierreProvision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreProvision,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCierreProvision";
			inputMap = this.jButtonAbrirOrderByProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCierreProvision"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCierreProvision = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCierreProvision.setName("jPanelOrderByProcesoCierreProvision"); 
			
			this.jPanelOrderByProcesoCierreProvision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreProvision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreProvision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCierreProvision.setLayout(gridaBagLayoutOrderByProcesoCierreProvision);
			
			
			this.jTableDatosProcesoCierreProvisionOrderBy = new JTableMe();        
			this.jTableDatosProcesoCierreProvisionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCierreProvisionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCierreProvisionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCierreProvisionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCierreProvisionOrderBy.setViewportView(this.jTableDatosProcesoCierreProvisionOrderBy);
			this.jTableDatosProcesoCierreProvisionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCierreProvisionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCierreProvision= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCierreProvision= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCierreProvision = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCierreProvision= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCierreProvision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCierreProvision.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCierreProvision.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCierreProvision.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCierreProvision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCierreProvision.setResizable(true);
			this.jInternalFrameOrderByProcesoCierreProvision.setClosable(true);
			this.jInternalFrameOrderByProcesoCierreProvision.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCierreProvision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreProvision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreProvision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCierreProvision.ipady =150;
				
			this.jPanelOrderByProcesoCierreProvision.add(jScrollPanelDatosProcesoCierreProvisionOrderBy, this.gridBagConstraintsProcesoCierreProvision);//this.jTableDatosProcesoCierreProvisionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCierreProvision = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCierreProvision.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCierreProvision,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCierreProvision.setToolTipText("Cancelar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCierreProvision.add(this.jButtonCerrarOrderByProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCierreProvision = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCierreProvision= new JScrollPane(jPanelOrderByProcesoCierreProvision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCierreProvision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCierreProvision.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCierreProvision);
			
			this.jInternalFrameOrderByProcesoCierreProvision.getContentPane().add(this.jScrollPanelOrderByProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCierreProvision = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocierreprovisionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCierreProvision.getRowHeight();//ProcesoCierreProvisionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.isSelected()) {
					iHeightTable=ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreProvision.isSelected()) {
					iHeightTable=ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreProvisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCierreProvision.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreProvision.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreProvision.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCierreProvision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreProvision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreProvision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCierreProvision!=null && this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCierreProvision.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCierreProvision.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCierreProvision.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCierreProvision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreProvision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreProvision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocierreprovisionLogic.getProcesoCierreProvisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreprovisions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCierreProvision> TraerProcesoCierreProvisionBeans(List<ProcesoCierreProvision> procesocierreprovisions,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisions) {
					
				if(!(ProcesoCierreProvisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCierreProvisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocierreprovision.setsDetalleGeneralEntityReporte(ProcesoCierreProvisionConstantesFunciones.getProcesoCierreProvisionDescripcion(procesocierreprovision));
										
						
					
						
					
				} else  {
							
					//procesocierreprovision.setsDetalleGeneralEntityReporte(procesocierreprovision.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocierreprovisionbeans.add(procesocierreprovisionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocierreprovisions;
    }
	//PARA REPORTES FIN
}
