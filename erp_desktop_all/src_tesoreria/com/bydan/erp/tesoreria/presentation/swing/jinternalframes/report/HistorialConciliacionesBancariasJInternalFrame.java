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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.HistorialConciliacionesBancariasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class HistorialConciliacionesBancariasJInternalFrame extends HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialConciliacionesBancarias;
	
	protected JMenuBar jmenuBarHistorialConciliacionesBancarias;
	
	protected JMenu jmenuHistorialConciliacionesBancarias;
	protected JMenu jmenuDatosHistorialConciliacionesBancarias;
	protected JMenu jmenuArchivoHistorialConciliacionesBancarias;
	protected JMenu jmenuAccionesHistorialConciliacionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialConciliacionesBancarias;	
	protected GridBagConstraints gridBagConstraintsHistorialConciliacionesBancarias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialConciliacionesBancarias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialConciliacionesBancarias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialConciliacionesBancarias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public HistorialConciliacionesBancariasSessionBean historialconciliacionesbancariasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialConciliacionesBancarias> historialconciliacionesbancariass;		
	public List<HistorialConciliacionesBancarias> historialconciliacionesbancariassEliminados;	
	public List<HistorialConciliacionesBancarias> historialconciliacionesbancariassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialConciliacionesBancarias;		
	protected JButton jButtonAbrirOrderByHistorialConciliacionesBancarias;
	
	
	//protected JPanel jPanelOrderByHistorialConciliacionesBancarias;
	//public JScrollPane jScrollPanelOrderByHistorialConciliacionesBancarias;	
	//protected JButton jButtonCerrarOrderByHistorialConciliacionesBancarias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialConciliacionesBancariasLogic historialconciliacionesbancariasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionHistorialConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralHistorialConciliacionesBancarias;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialConciliacionesBancariasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialConciliacionesBancarias;
	//public JScrollPane jScrollPanelImportacionHistorialConciliacionesBancarias;
	
	
	
	protected JPanel jPanelAccionesHistorialConciliacionesBancarias;
	
    protected JPanel jPanelPaginacionHistorialConciliacionesBancarias;
    protected JPanel jPanelParametrosReportesHistorialConciliacionesBancarias;
	protected JPanel jPanelParametrosReportesAccionesHistorialConciliacionesBancarias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar2HistorialConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar3HistorialConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar4HistorialConciliacionesBancarias;
	//protected JPanel jPanelParametrosAuxiliar5HistorialConciliacionesBancarias;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialConciliacionesBancarias;
	//protected JPanel jPanelImportacionHistorialConciliacionesBancarias;
	
	
	public JTable jTableDatosHistorialConciliacionesBancarias;
	
	
	
	//public JTable jTableDatosHistorialConciliacionesBancariasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialConciliacionesBancarias;
	protected JButton jButtonDuplicarHistorialConciliacionesBancarias;
	protected JButton jButtonCopiarHistorialConciliacionesBancarias;
	protected JButton jButtonVerFormHistorialConciliacionesBancarias;
	protected JButton jButtonNuevoRelacionesHistorialConciliacionesBancarias;
	protected JButton jButtonModificarHistorialConciliacionesBancarias;
	
    protected JButton jButtonGuardarCambiosTablaHistorialConciliacionesBancarias;
	protected JButton jButtonCerrarHistorialConciliacionesBancarias;
	
	
	protected JButton jButtonRecargarInformacionHistorialConciliacionesBancarias;
	protected JButton jButtonProcesarInformacionHistorialConciliacionesBancarias;
	
	
	protected JButton jButtonAnterioresHistorialConciliacionesBancarias;
	protected JButton jButtonSiguientesHistorialConciliacionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias;
	//protected JButton jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialConciliacionesBancarias;
	//protected JButton jButtonGenerarImportacionHistorialConciliacionesBancarias;
	//protected JButton jButtonCerrarImportacionHistorialConciliacionesBancarias;
	//protected JFileChooser jFileChooserImportacionHistorialConciliacionesBancarias;
	//protected File fileImportacionHistorialConciliacionesBancarias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonDuplicarToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonCopiarToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonVerFormToolBarHistorialConciliacionesBancarias;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonCerrarToolBarHistorialConciliacionesBancarias;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonProcesarInformacionToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonAnterioresToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonSiguientesToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonAbrirOrderByToolBarHistorialConciliacionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDuplicarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialConciliacionesBancarias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemCopiarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemVerFormHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemCerrarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemProcesarInformacionHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemAnterioresHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemSiguientesHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemAbrirOrderByHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarHistorialConciliacionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialConciliacionesBancarias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias;
	protected JCheckBox jCheckBoxSeleccionadosHistorialConciliacionesBancarias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialConciliacionesBancarias;
	protected JTextField jTextFieldValorCampoGeneralHistorialConciliacionesBancarias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialConciliacionesBancarias;
	//public JList<Reporte> jListColumnasSelectReporteHistorialConciliacionesBancarias;
	//public JScrollPane jScrollColumnasSelectReporteHistorialConciliacionesBancarias;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialConciliacionesBancarias;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialConciliacionesBancarias;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialConciliacionesBancarias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialConciliacionesBancarias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias;
	
		
	//public JLabel jLabelArchivoImportacionHistorialConciliacionesBancarias;	
	//public JLabel jLabelPathArchivoImportacionHistorialConciliacionesBancarias;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialConciliacionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialConciliacionesBancarias;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialConciliacionesBancarias;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialConciliacionesBancarias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialConciliacionesBancarias;
	public JPanel jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JButton jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	
	public JPanel jPanelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JLabel jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JButton jButtonid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JLabel jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JButton jButtonfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JLabel jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias;
	public JButton jButtonfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HistorialConciliacionesBancariasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialConciliacionesBancarias)	{
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias = jButtonRecargarInformacionHistorialConciliacionesBancarias;
	}
	
	public JButton getjButtonProcesarInformacionHistorialConciliacionesBancarias() {
		return this.jButtonProcesarInformacionHistorialConciliacionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialConciliacionesBancarias)	{
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias = jButtonProcesarInformacionHistorialConciliacionesBancarias;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialConciliacionesBancarias() {
		return this.jButtonRecargarInformacionHistorialConciliacionesBancarias;
	}
	
	
	public List<HistorialConciliacionesBancarias> gethistorialconciliacionesbancariass() {
		return this.historialconciliacionesbancariass;
	}

	public void sethistorialconciliacionesbancariass(List<HistorialConciliacionesBancarias> historialconciliacionesbancariass) {
		this.historialconciliacionesbancariass = historialconciliacionesbancariass;
	}
	
	public List<HistorialConciliacionesBancarias> gethistorialconciliacionesbancariassAux() {
		return this.historialconciliacionesbancariassAux;
	}

	public void sethistorialconciliacionesbancariassAux(List<HistorialConciliacionesBancarias> historialconciliacionesbancariassAux) {
		this.historialconciliacionesbancariassAux = historialconciliacionesbancariassAux;
	}
	
	public List<HistorialConciliacionesBancarias> gethistorialconciliacionesbancariassEliminados() {
		return this.historialconciliacionesbancariassEliminados;
	}

	public void setHistorialConciliacionesBancariassEliminados(List<HistorialConciliacionesBancarias> historialconciliacionesbancariassEliminados) {
		this.historialconciliacionesbancariassEliminados = historialconciliacionesbancariassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialConciliacionesBancarias() {
		return jComboBoxTiposSeleccionarHistorialConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposSeleccionarHistorialConciliacionesBancarias) {
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias = jComboBoxTiposSeleccionarHistorialConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialConciliacionesBancarias() {
		return jTextFieldValorCampoGeneralHistorialConciliacionesBancarias;
	}

	public void setjTextFieldValorCampoGeneralHistorialConciliacionesBancarias(
			JTextField jTextFieldValorCampoGeneralHistorialConciliacionesBancarias) {
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias = jTextFieldValorCampoGeneralHistorialConciliacionesBancarias;
	}

	public void setBorderResaltarValorCampoGeneralHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialConciliacionesBancarias() {
		return this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias;
	}

	public void setjCheckBoxSeleccionarTodosHistorialConciliacionesBancarias(
			JCheckBox jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias) {
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias = jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias;
	}

	public void setBorderResaltarSeleccionarTodosHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialConciliacionesBancarias() {
		return this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias;
	}

	public void setjCheckBoxSeleccionadosHistorialConciliacionesBancarias(
			JCheckBox jCheckBoxSeleccionadosHistorialConciliacionesBancarias) {
		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias = jCheckBoxSeleccionadosHistorialConciliacionesBancarias;
	}
	
	public void setBorderResaltarSeleccionadosHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias = jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposReportesHistorialConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposReportesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias = jComboBoxTiposReportesHistorialConciliacionesBancarias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias() {
	//	return jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias) {
	//	this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias = jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias = jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias;
	//}
	
	public void setBorderResaltarTiposReportesHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias = jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposPaginacionHistorialConciliacionesBancarias) {
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias = jComboBoxTiposPaginacionHistorialConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposRelacionesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias = jComboBoxTiposRelacionesHistorialConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias = jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias() {
	//	return jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias) {
	//	this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias = jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialConciliacionesBancarias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialConciliacionesBancarias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias .setBorder(borderResaltar);		
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
		this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
		
		this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialconciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialConciliacionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Conciliaciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialConciliacionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialConciliacionesBancarias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"nuevo","nuevo","Nuevo"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"duplicar","duplicar","Duplicar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"copiar","copiar","Copiar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"ver_form","ver_form","Ver"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"recargar","recargar","Buscar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialConciliacionesBancarias,this.jTtoolBarHistorialConciliacionesBancarias,
							"cerrar","cerrar","Salir"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialConciliacionesBancarias;
			
				this.jButtonProcesarInformacionToolBarHistorialConciliacionesBancarias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialConciliacionesBancarias;
				
		//protected JButton jButtonModificarToolBarHistorialConciliacionesBancarias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialConciliacionesBancarias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialConciliacionesBancarias=new JMenuMe("General");
		this.jmenuArchivoHistorialConciliacionesBancarias=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialConciliacionesBancarias=new JMenuMe("Acciones");
		this.jmenuDatosHistorialConciliacionesBancarias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialConciliacionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialConciliacionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialConciliacionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialConciliacionesBancarias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialConciliacionesBancarias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialConciliacionesBancarias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialConciliacionesBancarias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialConciliacionesBancarias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialConciliacionesBancarias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialConciliacionesBancarias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialConciliacionesBancarias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialConciliacionesBancarias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialConciliacionesBancarias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialConciliacionesBancarias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialConciliacionesBancarias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialConciliacionesBancarias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialConciliacionesBancarias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialConciliacionesBancarias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialConciliacionesBancarias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialConciliacionesBancarias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialConciliacionesBancarias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialConciliacionesBancarias.add(this.jMenuItemCerrarHistorialConciliacionesBancarias);
			
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemNuevoHistorialConciliacionesBancarias);
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias);
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemNuevoRelacionesHistorialConciliacionesBancarias);
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias);		
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemDuplicarHistorialConciliacionesBancarias);		
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemCopiarHistorialConciliacionesBancarias);		
			this.jmenuAccionesHistorialConciliacionesBancarias.add(this.jMenuItemVerFormHistorialConciliacionesBancarias);		
			
			this.jmenuDatosHistorialConciliacionesBancarias.add(this.jMenuItemRecargarInformacionHistorialConciliacionesBancarias);				
			this.jmenuDatosHistorialConciliacionesBancarias.add(this.jMenuItemAnterioresHistorialConciliacionesBancarias);				
			this.jmenuDatosHistorialConciliacionesBancarias.add(this.jMenuItemSiguientesHistorialConciliacionesBancarias);				
			this.jmenuDatosHistorialConciliacionesBancarias.add(this.jMenuItemAbrirOrderByHistorialConciliacionesBancarias);				
			this.jmenuDatosHistorialConciliacionesBancarias.add(this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialConciliacionesBancarias.add(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialConciliacionesBancarias.add(this.jmenuArchivoHistorialConciliacionesBancarias);		
			this.jmenuBarHistorialConciliacionesBancarias.add(this.jmenuAccionesHistorialConciliacionesBancarias);		
			this.jmenuBarHistorialConciliacionesBancarias.add(this.jmenuDatosHistorialConciliacionesBancarias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialConciliacionesBancarias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialConciliacionesBancarias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new JButtonMe();
		this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText("Buscar");
		this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,"buscar_button","Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias = new JLabelMe();
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText("Cuenta Contable :");
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias = new JLabelMe();
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias = new JLabelMe();
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasHistorialConciliacionesBancarias=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialConciliacionesBancarias = new HistorialConciliacionesBancariasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Conciliaciones Bancarias DATOS");
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias = new HistorialConciliacionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones(),this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialConciliacionesBancarias = null;//new HistorialConciliacionesBancariasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialConciliacionesBancarias= new GridBagLayout();
		
		
		this.jTableDatosHistorialConciliacionesBancarias = new JTableMe();      
		
		String sToolTipHistorialConciliacionesBancarias="";
		sToolTipHistorialConciliacionesBancarias=HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialConciliacionesBancarias+="(Tesoreria.HistorialConciliacionesBancarias)";
		}
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialConciliacionesBancarias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialConciliacionesBancarias.setToolTipText(sToolTipHistorialConciliacionesBancarias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialConciliacionesBancarias);
		this.jTableDatosHistorialConciliacionesBancarias.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialConciliacionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialConciliacionesBancarias.setRowSelectionAllowed(true);
		this.jTableDatosHistorialConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonDuplicarHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonCopiarHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonVerFormHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarHistorialConciliacionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosHistorialConciliacionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Conciliaciones Bancarias";
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesHistorialConciliacionesBancarias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias=new ReporteDinamicoJInternalFrame(HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialConciliacionesBancarias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialConciliacionesBancarias=new ImportacionJInternalFrame(HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialConciliacionesBancarias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialConciliacionesBancarias = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setText("Orden");
		this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialConciliacionesBancarias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialConciliacionesBancarias,false,this);
			
			//this.cargarOrderByHistorialConciliacionesBancarias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialConciliacionesBancarias,true,this);
			
			//this.cargarOrderByHistorialConciliacionesBancarias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialConciliacionesBancarias.setText("Nuevo");
		this.jButtonDuplicarHistorialConciliacionesBancarias.setText("Duplicar");
		this.jButtonCopiarHistorialConciliacionesBancarias.setText("Copiar");
		this.jButtonVerFormHistorialConciliacionesBancarias.setText("Ver");
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setText("Guardar");
		this.jButtonCerrarHistorialConciliacionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialConciliacionesBancarias,"nuevo_button","Nuevo",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialConciliacionesBancarias,"duplicar_button","Duplicar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialConciliacionesBancarias,"copiar_button","Copiar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialConciliacionesBancarias,"ver_form","Ver",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialConciliacionesBancarias,"nuevorelaciones_button","Nuevo Rel",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias,"guardarcambiostabla_button","Guardar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialConciliacionesBancarias,"cerrar_button","Salir",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialConciliacionesBancarias.setToolTipText("Nuevo"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialConciliacionesBancarias.setToolTipText("Duplicar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialConciliacionesBancarias.setToolTipText("Copiar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialConciliacionesBancarias.setToolTipText("Ver"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.setToolTipText("Nuevo Rel"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setToolTipText("Guardar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialConciliacionesBancarias.setToolTipText("Salir"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialConciliacionesBancarias"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialConciliacionesBancarias";
		inputMap = this.jButtonDuplicarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialConciliacionesBancarias"));
		
		//COPIAR
		sMapKey = "CopiarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCopiarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialConciliacionesBancarias"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialConciliacionesBancarias";
		inputMap = this.jButtonVerFormHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialConciliacionesBancarias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialConciliacionesBancarias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialConciliacionesBancarias";
		inputMap = this.jButtonModificarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialConciliacionesBancarias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCerrarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialConciliacionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialConciliacionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialConciliacionesBancarias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialConciliacionesBancarias.setName("jPanelParametrosReportesHistorialConciliacionesBancarias"); 
		
		this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias.setName("jPanelParametrosReportesAccionesHistorialConciliacionesBancarias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setText("Buscar");
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setToolTipText("Buscar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialConciliacionesBancarias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setVisible(false);
		
		
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setText("Procesar");
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setToolTipText("Procesar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialConciliacionesBancarias = new JLabelMe();
		
		this.jLabelAccionesHistorialConciliacionesBancarias.setText("Acciones");		
		this.jLabelAccionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialConciliacionesBancarias = new JButtonMe();
		//this.jButtonAnterioresHistorialConciliacionesBancarias.setText("<<");
        this.jButtonAnterioresHistorialConciliacionesBancarias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialConciliacionesBancarias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialConciliacionesBancarias = new JButtonMe();
		//this.jButtonSiguientesHistorialConciliacionesBancarias.setText(">>");
        this.jButtonSiguientesHistorialConciliacionesBancarias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialConciliacionesBancarias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias,"nuevoguardarcambios_button","Nue",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialConciliacionesBancarias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialConciliacionesBancarias";
		inputMap = this.jButtonRecargarInformacionHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialConciliacionesBancarias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialConciliacionesBancarias";
		inputMap = this.jButtonSiguientesHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialConciliacionesBancarias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialConciliacionesBancarias";
		inputMap = this.jButtonAnterioresHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialConciliacionesBancarias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialConciliacionesBancarias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(this.getWidth(),HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(this.getWidth(),HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(this.getWidth(),HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialConciliacionesBancarias = new GridBagLayout();

			this.jPanelPaginacionHistorialConciliacionesBancarias.setLayout(gridaBagLayoutPaginacionHistorialConciliacionesBancarias);						
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonAnterioresHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					
						
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
			
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonNuevoGuardarCambiosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
						
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonSiguientesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonNuevoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
						
			
			
			if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			}
			
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonDuplicarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonCopiarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonVerFormHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialConciliacionesBancarias.add(this.jButtonCerrarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialConciliacionesBancarias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialConciliacionesBancarias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.setLayout(gridaBagParametrosReportesHistorialConciliacionesBancarias);
			this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias.setLayout(gridaBagParametrosReportesAccionesHistorialConciliacionesBancarias);
			
			
			this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar1HistorialConciliacionesBancarias);
			this.jPanelParametrosAuxiliar2HistorialConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar2HistorialConciliacionesBancarias);
			this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar3HistorialConciliacionesBancarias);
			this.jPanelParametrosAuxiliar4HistorialConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar4HistorialConciliacionesBancarias);
			//this.jPanelParametrosAuxiliar5HistorialConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar2HistorialConciliacionesBancarias);			
			
			
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jButtonRecargarInformacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias.add(this.jComboBoxTiposPaginacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias.add(this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias.add(this.jComboBoxTiposArchivosReportesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jPanelParametrosAuxiliar1HistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialConciliacionesBancarias.add(this.jComboBoxTiposReportesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);																		
			
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4HistorialConciliacionesBancarias.add(this.jComboBoxTiposGraficosReportesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jPanelParametrosAuxiliar4HistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jComboBoxTiposReportesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jCheckBoxGenerarReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jPanelParametrosAuxiliar2HistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jLabelAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jButtonAbrirOrderByHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jComboBoxTiposSeleccionarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
			
			
			/*
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias.add(this.jCheckBoxSeleccionarTodosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);															
				
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias.add(this.jCheckBoxSeleccionadosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);															
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias.add(this.jCheckBoxConGraficoReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jPanelParametrosAuxiliar3HistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialConciliacionesBancarias.add(this.jComboBoxTiposAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialConciliacionesBancarias = new GridBagLayout();

			this.jScrollPanelDatosHistorialConciliacionesBancarias.setLayout(gridaBagLayoutDatosHistorialConciliacionesBancarias);
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
			
			this.jScrollPanelDatosHistorialConciliacionesBancarias.add(this.jTableDatosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setViewportView(this.jTableDatosHistorialConciliacionesBancarias);
		this.jTableDatosHistorialConciliacionesBancarias.setFillsViewportHeight(true);
		this.jTableDatosHistorialConciliacionesBancarias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesHistorialConciliacionesBancarias.setLayout(gridaBagLayoutAccionesHistorialConciliacionesBancarias);
		
		
		/*	
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
			
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonNuevoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias= new GridBagLayout();
		gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.setLayout(gridaBagLayoutBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);

		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jLabelid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);

		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jComboBoxid_cuenta_contableBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);


		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jLabelfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);

		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 1;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jDateChooserfecha_desdeBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);


		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 2;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jLabelfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);

		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 2;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jDateChooserfecha_hastaBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);

		gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialConciliacionesBancarias.gridy = 3;
		gridBagConstraintsHistorialConciliacionesBancarias.gridx =1;
		jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias.add(jButtonBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);

		jTabbedPaneBusquedasHistorialConciliacionesBancarias.addTab("1.-Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaHistorialConciliacionesBancariasHistorialConciliacionesBancarias);
		jTabbedPaneBusquedasHistorialConciliacionesBancarias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialConciliacionesBancarias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;		
			//this.gridBagConstraintsHistorialConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;		
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);								
		
		
		/*
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/		
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialConciliacionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
				
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialConciliacionesBancarias = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialConciliacionesBancarias.setLayout(gridaBagLayoutBusquedasParametrosHistorialConciliacionesBancarias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialConciliacionesBancarias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialConciliacionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setName("jPanelReporteDinamicoHistorialConciliacionesBancarias"); 
		
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.setLayout(gridaBagLayoutReporteDinamicoHistorialConciliacionesBancarias);
		
		
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelColumnasSelectReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialConciliacionesBancarias = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias=new JScrollPane(this.jListColumnasSelectReporteHistorialConciliacionesBancarias);
			
			this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jListColumnasSelectReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialConciliacionesBancarias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialConciliacionesBancarias = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialConciliacionesBancarias=new JScrollPane(this.jListRelacionesSelectReporteHistorialConciliacionesBancarias);
			
			this.jScrollRelacionesSelectReporteHistorialConciliacionesBancarias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialConciliacionesBancarias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialConciliacionesBancarias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialConciliacionesBancarias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelConGraficoDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jCheckBoxConGraficoDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelColumnaCategoriaGraficoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelColumnaCategoriaValorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jComboBoxColumnaCategoriaValorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelColumnasValoresGraficoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoHistorialConciliacionesBancarias = new JList<Reporte>();
		this.jListColumnasValoresGraficoHistorialConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoHistorialConciliacionesBancarias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias=new JScrollPane(this.jListColumnasValoresGraficoHistorialConciliacionesBancarias);
			
			this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jListColumnasSelectReporteHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jScrollColumnasValoresGraficoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelTiposGraficosReportesDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialConciliacionesBancarias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jComboBoxTiposGraficosReportesDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelGenerarExcelReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias.setToolTipText("Generar EXCEL"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jButtonGenerarExcelReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jComboBoxTiposReportesDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jLabelTiposArchivoReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias.setToolTipText("Generar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jButtonGenerarReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias.setToolTipText("Cancelar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialConciliacionesBancarias.add(this.jButtonCerrarReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialConciliacionesBancarias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias= new JScrollPane(jPanelReporteDinamicoHistorialConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialConciliacionesBancarias);
		this.jInternalFrameReporteDinamicoHistorialConciliacionesBancarias.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialConciliacionesBancarias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialConciliacionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialConciliacionesBancarias.setName("jPanelImportacionHistorialConciliacionesBancarias"); 
		
		this.jPanelImportacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialConciliacionesBancarias.setLayout(gridaBagLayoutImportacionHistorialConciliacionesBancarias);
		
		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialConciliacionesBancarias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialConciliacionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionHistorialConciliacionesBancarias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelArchivoImportacionHistorialConciliacionesBancarias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jLabelArchivoImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialConciliacionesBancarias = new JFileChooser();		
		this.jFileChooserImportacionHistorialConciliacionesBancarias.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonAbrirImportacionHistorialConciliacionesBancarias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialConciliacionesBancarias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialConciliacionesBancarias.setToolTipText("Generar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jButtonAbrirImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jLabelPathArchivoImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jTextFieldPathArchivoImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarImportacionHistorialConciliacionesBancarias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialConciliacionesBancarias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialConciliacionesBancarias.setToolTipText("Generar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jButtonGenerarImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarImportacionHistorialConciliacionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialConciliacionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialConciliacionesBancarias.setToolTipText("Cancelar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialConciliacionesBancarias.add(this.jButtonCerrarImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialConciliacionesBancarias = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialConciliacionesBancarias= new JScrollPane(jPanelImportacionHistorialConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialConciliacionesBancarias);
		this.jInternalFrameImportacionHistorialConciliacionesBancarias.getContentPane().add(this.jScrollPanelImportacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialConciliacionesBancarias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias = new JButtonMe();
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setText("Orden");
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialConciliacionesBancarias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialConciliacionesBancarias";
			inputMap = this.jButtonAbrirOrderByHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialConciliacionesBancarias"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialConciliacionesBancarias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialConciliacionesBancarias.setName("jPanelOrderByHistorialConciliacionesBancarias"); 
			
			this.jPanelOrderByHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialConciliacionesBancarias.setLayout(gridaBagLayoutOrderByHistorialConciliacionesBancarias);
			
			
			this.jTableDatosHistorialConciliacionesBancariasOrderBy = new JTableMe();        
			this.jTableDatosHistorialConciliacionesBancariasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialConciliacionesBancariasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialConciliacionesBancariasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialConciliacionesBancariasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialConciliacionesBancariasOrderBy.setViewportView(this.jTableDatosHistorialConciliacionesBancariasOrderBy);
			this.jTableDatosHistorialConciliacionesBancariasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialConciliacionesBancariasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialConciliacionesBancarias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialConciliacionesBancarias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialConciliacionesBancarias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialConciliacionesBancarias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setTitle("Orden");
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setResizable(true);
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setClosable(true);
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialConciliacionesBancarias.ipady =150;
				
			this.jPanelOrderByHistorialConciliacionesBancarias.add(jScrollPanelDatosHistorialConciliacionesBancariasOrderBy, this.gridBagConstraintsHistorialConciliacionesBancarias);//this.jTableDatosHistorialConciliacionesBancariasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialConciliacionesBancarias = new JButtonMe();
			this.jButtonCerrarOrderByHistorialConciliacionesBancarias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialConciliacionesBancarias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialConciliacionesBancarias.setToolTipText("Cancelar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialConciliacionesBancarias.add(this.jButtonCerrarOrderByHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialConciliacionesBancarias = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialConciliacionesBancarias= new JScrollPane(jPanelOrderByHistorialConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialConciliacionesBancarias);
			
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getContentPane().add(this.jScrollPanelOrderByHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
		
		} else {
			this.jButtonAbrirOrderByHistorialConciliacionesBancarias = new JButtonMe();
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
		int iWidthTableCalculado=0;//3930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialConciliacionesBancarias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosHistorialConciliacionesBancarias.getRowHeight();//HistorialConciliacionesBancariasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.isSelected()) {
					iHeightTable=HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialConciliacionesBancarias.isSelected()) {
					iHeightTable=HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialConciliacionesBancarias!=null && this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy()!=null) {
			//if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialConciliacionesBancarias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=historialconciliacionesbancariasLogic.getHistorialConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialconciliacionesbancariass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialConciliacionesBancarias> TraerHistorialConciliacionesBancariasBeans(List<HistorialConciliacionesBancarias> historialconciliacionesbancariass,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialConciliacionesBancarias historialconciliacionesbancarias:historialconciliacionesbancariass) {
					
				if(!(HistorialConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialconciliacionesbancarias.setsDetalleGeneralEntityReporte(HistorialConciliacionesBancariasConstantesFunciones.getHistorialConciliacionesBancariasDescripcion(historialconciliacionesbancarias));
										
						
					
						
					
				} else  {
							
					//historialconciliacionesbancarias.setsDetalleGeneralEntityReporte(historialconciliacionesbancarias.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialconciliacionesbancariasbeans.add(historialconciliacionesbancariasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialconciliacionesbancariass;
    }
	//PARA REPORTES FIN
}
