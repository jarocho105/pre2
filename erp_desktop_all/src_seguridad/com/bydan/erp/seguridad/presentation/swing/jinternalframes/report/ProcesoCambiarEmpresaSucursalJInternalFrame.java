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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEmpresaSucursalConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
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
public class ProcesoCambiarEmpresaSucursalJInternalFrame extends ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCambiarEmpresaSucursal;
	
	protected JMenuBar jmenuBarProcesoCambiarEmpresaSucursal;
	
	protected JMenu jmenuProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuDatosProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuArchivoProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuAccionesProcesoCambiarEmpresaSucursal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarEmpresaSucursal;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarEmpresaSucursal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCambiarEmpresaSucursal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ProcesoCambiarEmpresaSucursalSessionBean procesocambiarempresasucursalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals;		
	public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsEliminados;	
	public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCambiarEmpresaSucursal;		
	protected JButton jButtonAbrirOrderByProcesoCambiarEmpresaSucursal;
	
	
	//protected JPanel jPanelOrderByProcesoCambiarEmpresaSucursal;
	//public JScrollPane jScrollPanelOrderByProcesoCambiarEmpresaSucursal;	
	//protected JButton jButtonCerrarOrderByProcesoCambiarEmpresaSucursal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCambiarEmpresaSucursalLogic procesocambiarempresasucursalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCambiarEmpresaSucursal;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCambiarEmpresaSucursalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal;
	//public JScrollPane jScrollPanelImportacionProcesoCambiarEmpresaSucursal;
	
	
	
	protected JPanel jPanelAccionesProcesoCambiarEmpresaSucursal;
	
    protected JPanel jPanelPaginacionProcesoCambiarEmpresaSucursal;
    protected JPanel jPanelParametrosReportesProcesoCambiarEmpresaSucursal;
	protected JPanel jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCambiarEmpresaSucursal;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCambiarEmpresaSucursal;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCambiarEmpresaSucursal;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCambiarEmpresaSucursal;
	//protected JPanel jPanelImportacionProcesoCambiarEmpresaSucursal;
	
	
	public JTable jTableDatosProcesoCambiarEmpresaSucursal;
	
	
	
	//public JTable jTableDatosProcesoCambiarEmpresaSucursalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCambiarEmpresaSucursal;
	protected JButton jButtonDuplicarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCopiarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonVerFormProcesoCambiarEmpresaSucursal;
	protected JButton jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal;
	protected JButton jButtonModificarProcesoCambiarEmpresaSucursal;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCerrarProcesoCambiarEmpresaSucursal;
	
	
	protected JButton jButtonRecargarInformacionProcesoCambiarEmpresaSucursal;
	protected JButton jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	
	
	protected JButton jButtonAnterioresProcesoCambiarEmpresaSucursal;
	protected JButton jButtonSiguientesProcesoCambiarEmpresaSucursal;
	protected JButton jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCambiarEmpresaSucursal;
	//protected JButton jButtonGenerarImportacionProcesoCambiarEmpresaSucursal;
	//protected JButton jButtonCerrarImportacionProcesoCambiarEmpresaSucursal;
	//protected JFileChooser jFileChooserImportacionProcesoCambiarEmpresaSucursal;
	//protected File fileImportacionProcesoCambiarEmpresaSucursal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonDuplicarToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCopiarToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonVerFormToolBarProcesoCambiarEmpresaSucursal;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCerrarToolBarProcesoCambiarEmpresaSucursal;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonAnterioresToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonSiguientesToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonAbrirOrderByToolBarProcesoCambiarEmpresaSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDuplicarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemCopiarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemVerFormProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemCerrarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemAnterioresProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemSiguientesProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarEmpresaSucursal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCambiarEmpresaSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal;
	protected JTextField jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCambiarEmpresaSucursal;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCambiarEmpresaSucursal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCambiarEmpresaSucursal;	
	//public JLabel jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCambiarEmpresaSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCambiarEmpresaSucursal;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCambiarEmpresaSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCambiarEmpresaSucursal;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCambiarEmpresaSucursal;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCambiarEmpresaSucursal;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCambiarEmpresaSucursal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCambiarEmpresaSucursal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCambiarEmpresaSucursal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal;
	public JPanel jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	public JButton jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	
	public JPanel jPanelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	public JLabel jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	public JButton jButtonid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new JButtonMe();
	public JButton jButtonid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	public JLabel jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal;
	public JButton jButtonid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new JButtonMe();
	public JButton jButtonid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoCambiarEmpresaSucursalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCambiarEmpresaSucursal)	{
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal = jButtonRecargarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCambiarEmpresaSucursal() {
		return this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarEmpresaSucursal)	{
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal = jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCambiarEmpresaSucursal() {
		return this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	
	public List<ProcesoCambiarEmpresaSucursal> getprocesocambiarempresasucursals() {
		return this.procesocambiarempresasucursals;
	}

	public void setprocesocambiarempresasucursals(List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals) {
		this.procesocambiarempresasucursals = procesocambiarempresasucursals;
	}
	
	public List<ProcesoCambiarEmpresaSucursal> getprocesocambiarempresasucursalsAux() {
		return this.procesocambiarempresasucursalsAux;
	}

	public void setprocesocambiarempresasucursalsAux(List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsAux) {
		this.procesocambiarempresasucursalsAux = procesocambiarempresasucursalsAux;
	}
	
	public List<ProcesoCambiarEmpresaSucursal> getprocesocambiarempresasucursalsEliminados() {
		return this.procesocambiarempresasucursalsEliminados;
	}

	public void setProcesoCambiarEmpresaSucursalsEliminados(List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsEliminados) {
		this.procesocambiarempresasucursalsEliminados = procesocambiarempresasucursalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal() {
		return jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal = jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal() {
		return jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal;
	}

	public void setjTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal(
			JTextField jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal) {
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal = jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal() {
		return this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal) {
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal = jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal() {
		return this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal;
	}

	public void setjCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal(
			JCheckBox jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal) {
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal = jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal = jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposReportesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal = jComboBoxTiposReportesProcesoCambiarEmpresaSucursal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal() {
	//	return jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal = jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal = jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal = jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal = jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal = jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal = jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCambiarEmpresaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal() {
	//	return jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal = jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCambiarEmpresaSucursal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal .setBorder(borderResaltar);		
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
		this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
		
		this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarempresasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarEmpresaSucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Empresa Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCambiarEmpresaSucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCambiarEmpresaSucursal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"copiar","copiar","Copiar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"ver_form","ver_form","Ver"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"recargar","recargar","Procesar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,
							"cerrar","cerrar","Salir"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal;
			
				this.jButtonProcesarInformacionToolBarProcesoCambiarEmpresaSucursal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEmpresaSucursal;
				
		//protected JButton jButtonModificarToolBarProcesoCambiarEmpresaSucursal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCambiarEmpresaSucursal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCambiarEmpresaSucursal=new JMenuMe("General");
		this.jmenuArchivoProcesoCambiarEmpresaSucursal=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCambiarEmpresaSucursal=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCambiarEmpresaSucursal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarEmpresaSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCambiarEmpresaSucursal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCambiarEmpresaSucursal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCambiarEmpresaSucursal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCambiarEmpresaSucursal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCambiarEmpresaSucursal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCambiarEmpresaSucursal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarEmpresaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCambiarEmpresaSucursal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCambiarEmpresaSucursal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCambiarEmpresaSucursal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCambiarEmpresaSucursal.add(this.jMenuItemCerrarProcesoCambiarEmpresaSucursal);
			
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemNuevoProcesoCambiarEmpresaSucursal);
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal);
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal);
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal);		
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal);		
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemCopiarProcesoCambiarEmpresaSucursal);		
			this.jmenuAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemVerFormProcesoCambiarEmpresaSucursal);		
			
			this.jmenuDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal);				
			this.jmenuDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal);				
			this.jmenuDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal);				
			this.jmenuDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal);				
			this.jmenuDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCambiarEmpresaSucursal.add(this.jmenuArchivoProcesoCambiarEmpresaSucursal);		
			this.jmenuBarProcesoCambiarEmpresaSucursal.add(this.jmenuAccionesProcesoCambiarEmpresaSucursal);		
			this.jmenuBarProcesoCambiarEmpresaSucursal.add(this.jmenuDatosProcesoCambiarEmpresaSucursal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCambiarEmpresaSucursal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCambiarEmpresaSucursal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setToolTipText("Procesar Proceso Cambiar Empresa Sucursal");
		this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new JButtonMe();
		this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setText("Procesar");
		this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setToolTipText("Procesar Proceso Cambiar Empresa Sucursal");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"buscar_button","Procesar Proceso Cambiar Empresa Sucursal");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal = new JLabelMe();
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setText("Empresa :");
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setToolTipText("Empresa");
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new JComboBoxMe();
		jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal = new JLabelMe();
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setText("Sucursal :");
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setToolTipText("Sucursal");
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new JComboBoxMe();
		jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cambiar Empresa Sucursal"));
		this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCambiarEmpresaSucursal = new ProcesoCambiarEmpresaSucursalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cambiar Empresa Sucursal DATOS");
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal = new ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones(),this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal = null;//new ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarEmpresaSucursal= new GridBagLayout();
		
		
		this.jTableDatosProcesoCambiarEmpresaSucursal = new JTableMe();      
		
		String sToolTipProcesoCambiarEmpresaSucursal="";
		sToolTipProcesoCambiarEmpresaSucursal=ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarEmpresaSucursal+="(Seguridad.ProcesoCambiarEmpresaSucursal)";
		}
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarEmpresaSucursal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.setToolTipText(sToolTipProcesoCambiarEmpresaSucursal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCambiarEmpresaSucursal);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonCopiarProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonVerFormProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonCerrarProcesoCambiarEmpresaSucursal = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Empresa Sucursal";
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal=new ReporteDinamicoJInternalFrame(ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCambiarEmpresaSucursal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal=new ImportacionJInternalFrame(ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCambiarEmpresaSucursal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setText("Orden");
		this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,false,this);
			
			//this.cargarOrderByProcesoCambiarEmpresaSucursal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,true,this);
			
			//this.cargarOrderByProcesoCambiarEmpresaSucursal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(400,50));//230
		this.jTableDatosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(400,50));//230
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCambiarEmpresaSucursal.setText("Nuevo");
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal.setText("Duplicar");
		this.jButtonCopiarProcesoCambiarEmpresaSucursal.setText("Copiar");
		this.jButtonVerFormProcesoCambiarEmpresaSucursal.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setText("Guardar");
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarEmpresaSucursal,"nuevo_button","Nuevo",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCambiarEmpresaSucursal,"duplicar_button","Duplicar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCambiarEmpresaSucursal,"copiar_button","Copiar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCambiarEmpresaSucursal,"ver_form","Ver",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal,"nuevorelaciones_button","Nuevo Rel",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal,"guardarcambiostabla_button","Guardar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarEmpresaSucursal,"cerrar_button","Salir",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.setToolTipText("Nuevo"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal.setToolTipText("Duplicar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCambiarEmpresaSucursal.setToolTipText("Copiar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCambiarEmpresaSucursal.setToolTipText("Ver"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.setToolTipText("Nuevo Rel"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setToolTipText("Guardar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.setToolTipText("Salir"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarEmpresaSucursal"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonDuplicarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCambiarEmpresaSucursal"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCopiarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCambiarEmpresaSucursal"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonVerFormProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCambiarEmpresaSucursal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCambiarEmpresaSucursal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonModificarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCambiarEmpresaSucursal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCerrarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarEmpresaSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarEmpresaSucursal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setName("jPanelParametrosReportesProcesoCambiarEmpresaSucursal"); 
		
		this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal.setName("jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setToolTipText("Procesar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setToolTipText("Procesar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCambiarEmpresaSucursal = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCambiarEmpresaSucursal = new JButtonMe();
		//this.jButtonAnterioresProcesoCambiarEmpresaSucursal.setText("<<");
        this.jButtonAnterioresProcesoCambiarEmpresaSucursal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCambiarEmpresaSucursal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCambiarEmpresaSucursal = new JButtonMe();
		//this.jButtonSiguientesProcesoCambiarEmpresaSucursal.setText(">>");
        this.jButtonSiguientesProcesoCambiarEmpresaSucursal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCambiarEmpresaSucursal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal,"nuevoguardarcambios_button","Nue",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCambiarEmpresaSucursal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCambiarEmpresaSucursal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonSiguientesProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCambiarEmpresaSucursal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonAnterioresProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCambiarEmpresaSucursal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCambiarEmpresaSucursal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(this.getWidth(),ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(this.getWidth(),ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(this.getWidth(),ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCambiarEmpresaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCambiarEmpresaSucursal = new GridBagLayout();

			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutPaginacionProcesoCambiarEmpresaSucursal);						
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonAnterioresProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					
						
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
			
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
						
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonSiguientesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonNuevoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
						
			
			
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			}
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonDuplicarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonCopiarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonVerFormProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.add(this.jButtonCerrarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCambiarEmpresaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCambiarEmpresaSucursal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCambiarEmpresaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCambiarEmpresaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCambiarEmpresaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCambiarEmpresaSucursal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosReportesProcesoCambiarEmpresaSucursal);
			this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosReportesAccionesProcesoCambiarEmpresaSucursal);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosAuxiliar1ProcesoCambiarEmpresaSucursal);
			this.jPanelParametrosAuxiliar2ProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarEmpresaSucursal);
			this.jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosAuxiliar3ProcesoCambiarEmpresaSucursal);
			this.jPanelParametrosAuxiliar4ProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosAuxiliar4ProcesoCambiarEmpresaSucursal);
			//this.jPanelParametrosAuxiliar5ProcesoCambiarEmpresaSucursal.setLayout(gridaBagParametrosAuxiliar2ProcesoCambiarEmpresaSucursal);			
			
			
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal.add(this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jPanelParametrosAuxiliar1ProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jPanelParametrosAuxiliar4ProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jCheckBoxGenerarReporteProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jPanelParametrosAuxiliar2ProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jLabelAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
			
			
			/*
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal.add(this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);															
				
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal.add(this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jPanelParametrosAuxiliar3ProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCambiarEmpresaSucursal = new GridBagLayout();

			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutDatosProcesoCambiarEmpresaSucursal);
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
			
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.add(this.jTableDatosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setViewportView(this.jTableDatosProcesoCambiarEmpresaSucursal);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setFillsViewportHeight(true);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarEmpresaSucursal= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutAccionesProcesoCambiarEmpresaSucursal);
		
		
		/*	
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
			
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonNuevoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);

		gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.add(jLabelid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);

		gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 1;
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.add(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);


		gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.add(jLabelid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);

		gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 1;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 1;
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.add(jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);

		gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 2;
		gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =1;
		jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.add(jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);

		jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.addTab("1.-Por Empresa Por Sucursal ", jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
		jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarEmpresaSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarEmpresaSucursal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;		
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);								
		
		
		/*
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/		
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
				
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCambiarEmpresaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarEmpresaSucursal = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutBusquedasParametrosProcesoCambiarEmpresaSucursal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jButtonAnterioresProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jButtonSiguientesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		this.jTtoolBarProcesoCambiarEmpresaSucursal.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCambiarEmpresaSucursal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCambiarEmpresaSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setName("jPanelReporteDinamicoProcesoCambiarEmpresaSucursal"); 
		
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutReporteDinamicoProcesoCambiarEmpresaSucursal);
		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jLabelColumnasSelectReporteProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal=new JScrollPane(this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal);
			
			this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jListColumnasSelectReporteProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal=new JScrollPane(this.jListRelacionesSelectReporteProcesoCambiarEmpresaSucursal);
			
			this.jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCambiarEmpresaSucursal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jLabelGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.setToolTipText("Generar EXCEL"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposReportesDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jLabelTiposArchivoReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal.setToolTipText("Generar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal.setToolTipText("Cancelar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCambiarEmpresaSucursal.add(this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarEmpresaSucursal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal= new JScrollPane(jPanelReporteDinamicoProcesoCambiarEmpresaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCambiarEmpresaSucursal);
		this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCambiarEmpresaSucursal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCambiarEmpresaSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setName("jPanelImportacionProcesoCambiarEmpresaSucursal"); 
		
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutImportacionProcesoCambiarEmpresaSucursal);
		
		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setResizable(true);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setClosable(true);
	    this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jLabelArchivoImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCambiarEmpresaSucursal = new JFileChooser();		
		this.jFileChooserImportacionProcesoCambiarEmpresaSucursal.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal.setToolTipText("Generar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jLabelPathArchivoImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jTextFieldPathArchivoImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal.setToolTipText("Generar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal.setToolTipText("Cancelar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCambiarEmpresaSucursal.add(this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCambiarEmpresaSucursal = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal= new JScrollPane(jPanelImportacionProcesoCambiarEmpresaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCambiarEmpresaSucursal);
		this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getContentPane().add(this.jScrollPanelImportacionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCambiarEmpresaSucursal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setText("Orden");
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCambiarEmpresaSucursal";
			inputMap = this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCambiarEmpresaSucursal"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCambiarEmpresaSucursal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setName("jPanelOrderByProcesoCambiarEmpresaSucursal"); 
			
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutOrderByProcesoCambiarEmpresaSucursal);
			
			
			this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy = new JTableMe();        
			this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCambiarEmpresaSucursalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursalOrderBy.setViewportView(this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy);
			this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCambiarEmpresaSucursal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setResizable(true);
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setClosable(true);
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipady =150;
				
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.add(jScrollPanelDatosProcesoCambiarEmpresaSucursalOrderBy, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);//this.jTableDatosProcesoCambiarEmpresaSucursalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal.setToolTipText("Cancelar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCambiarEmpresaSucursal.add(this.jButtonCerrarOrderByProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCambiarEmpresaSucursal = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal= new JScrollPane(jPanelOrderByProcesoCambiarEmpresaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCambiarEmpresaSucursal);
			
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getContentPane().add(this.jScrollPanelOrderByProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal = new JButtonMe();
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
		//	&& this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCambiarEmpresaSucursal.getRowHeight();//ProcesoCambiarEmpresaSucursalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.isSelected()) {
					iHeightTable=ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCambiarEmpresaSucursal.isSelected()) {
					iHeightTable=ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCambiarEmpresaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarempresasucursals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCambiarEmpresaSucursal> TraerProcesoCambiarEmpresaSucursalBeans(List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:procesocambiarempresasucursals) {
					
				if(!(ProcesoCambiarEmpresaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCambiarEmpresaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocambiarempresasucursal.setsDetalleGeneralEntityReporte(ProcesoCambiarEmpresaSucursalConstantesFunciones.getProcesoCambiarEmpresaSucursalDescripcion(procesocambiarempresasucursal));
										
						
					
						
					
				} else  {
							
					//procesocambiarempresasucursal.setsDetalleGeneralEntityReporte(procesocambiarempresasucursal.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocambiarempresasucursalbeans.add(procesocambiarempresasucursalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocambiarempresasucursals;
    }
	//PARA REPORTES FIN
}
