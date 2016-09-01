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
import com.bydan.erp.nomina.util.report.CreditosDetalladosConstantesFunciones;

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
public class CreditosDetalladosJInternalFrame extends CreditosDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCreditosDetallados;
	
	protected JMenuBar jmenuBarCreditosDetallados;
	
	protected JMenu jmenuCreditosDetallados;
	protected JMenu jmenuDatosCreditosDetallados;
	protected JMenu jmenuArchivoCreditosDetallados;
	protected JMenu jmenuAccionesCreditosDetallados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCreditosDetallados;	
	protected GridBagConstraints gridBagConstraintsCreditosDetallados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CreditosDetalladosDetalleFormJInternalFrame jInternalFrameDetalleFormCreditosDetallados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCreditosDetallados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCreditosDetallados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprestamo="";
	
	public CreditosDetalladosSessionBean creditosdetalladosSessionBean;
		
	
	
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrestamoSessionBean tipoprestamoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CreditosDetallados> creditosdetalladoss;		
	public List<CreditosDetallados> creditosdetalladossEliminados;	
	public List<CreditosDetallados> creditosdetalladossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCreditosDetallados;		
	protected JButton jButtonAbrirOrderByCreditosDetallados;
	
	
	//protected JPanel jPanelOrderByCreditosDetallados;
	//public JScrollPane jScrollPanelOrderByCreditosDetallados;	
	//protected JButton jButtonCerrarOrderByCreditosDetallados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CreditosDetalladosLogic creditosdetalladosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCreditosDetallados;
	public JScrollPane jScrollPanelDatosEdicionCreditosDetallados;
	public JScrollPane jScrollPanelDatosGeneralCreditosDetallados;
    
	
	
	//public JScrollPane jScrollPanelDatosCreditosDetalladosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCreditosDetallados;
	//public JScrollPane jScrollPanelImportacionCreditosDetallados;
	
	
	
	protected JPanel jPanelAccionesCreditosDetallados;
	
    protected JPanel jPanelPaginacionCreditosDetallados;
    protected JPanel jPanelParametrosReportesCreditosDetallados;
	protected JPanel jPanelParametrosReportesAccionesCreditosDetallados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CreditosDetallados;
	protected JPanel jPanelParametrosAuxiliar2CreditosDetallados;
	protected JPanel jPanelParametrosAuxiliar3CreditosDetallados;
	protected JPanel jPanelParametrosAuxiliar4CreditosDetallados;
	//protected JPanel jPanelParametrosAuxiliar5CreditosDetallados;
	
	
	
	//protected JPanel jPanelReporteDinamicoCreditosDetallados;
	//protected JPanel jPanelImportacionCreditosDetallados;
	
	
	public JTable jTableDatosCreditosDetallados;
	
	
	
	//public JTable jTableDatosCreditosDetalladosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCreditosDetallados;
	protected JButton jButtonDuplicarCreditosDetallados;
	protected JButton jButtonCopiarCreditosDetallados;
	protected JButton jButtonVerFormCreditosDetallados;
	protected JButton jButtonNuevoRelacionesCreditosDetallados;
	protected JButton jButtonModificarCreditosDetallados;
	
    protected JButton jButtonGuardarCambiosTablaCreditosDetallados;
	protected JButton jButtonCerrarCreditosDetallados;
	
	
	protected JButton jButtonRecargarInformacionCreditosDetallados;
	protected JButton jButtonProcesarInformacionCreditosDetallados;
	
	
	protected JButton jButtonAnterioresCreditosDetallados;
	protected JButton jButtonSiguientesCreditosDetallados;
	protected JButton jButtonNuevoGuardarCambiosCreditosDetallados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCreditosDetallados;
	//protected JButton jButtonCerrarReporteDinamicoCreditosDetallados;
	//protected JButton jButtonGenerarExcelReporteDinamicoCreditosDetallados;	
	
	
	
	//protected JButton jButtonAbrirImportacionCreditosDetallados;
	//protected JButton jButtonGenerarImportacionCreditosDetallados;
	//protected JButton jButtonCerrarImportacionCreditosDetallados;
	//protected JFileChooser jFileChooserImportacionCreditosDetallados;
	//protected File fileImportacionCreditosDetallados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCreditosDetallados;
	protected JButton jButtonDuplicarToolBarCreditosDetallados;
	protected JButton jButtonNuevoRelacionesToolBarCreditosDetallados;
	
	
	public JButton jButtonGuardarCambiosToolBarCreditosDetallados;
	protected JButton jButtonCopiarToolBarCreditosDetallados;
	protected JButton jButtonVerFormToolBarCreditosDetallados;
	public JButton jButtonGuardarCambiosTablaToolBarCreditosDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCreditosDetallados;
	protected JButton jButtonCerrarToolBarCreditosDetallados;
	
	protected JButton jButtonRecargarInformacionToolBarCreditosDetallados;
	protected JButton jButtonProcesarInformacionToolBarCreditosDetallados;
	protected JButton jButtonAnterioresToolBarCreditosDetallados;
	protected JButton jButtonSiguientesToolBarCreditosDetallados;
	protected JButton jButtonNuevoGuardarCambiosToolBarCreditosDetallados;
	protected JButton jButtonAbrirOrderByToolBarCreditosDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCreditosDetallados;
	protected JMenuItem jMenuItemDuplicarCreditosDetallados;
	protected JMenuItem jMenuItemNuevoRelacionesCreditosDetallados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCreditosDetallados;
	protected JMenuItem jMenuItemCopiarCreditosDetallados;
	protected JMenuItem jMenuItemVerFormCreditosDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCreditosDetallados;
	protected JMenuItem jMenuItemCerrarCreditosDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCreditosDetallados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCreditosDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCreditosDetallados;
	
	protected JMenuItem jMenuItemRecargarInformacionCreditosDetallados;
	protected JMenuItem jMenuItemProcesarInformacionCreditosDetallados;
	protected JMenuItem jMenuItemAnterioresCreditosDetallados;
	protected JMenuItem jMenuItemSiguientesCreditosDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCreditosDetallados;
	protected JMenuItem jMenuItemAbrirOrderByCreditosDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCreditosDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCreditosDetallados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCreditosDetallados;
	protected JCheckBox jCheckBoxSeleccionadosCreditosDetallados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCreditosDetallados;
	protected JCheckBox jCheckBoxConGraficoReporteCreditosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCreditosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCreditosDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCreditosDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCreditosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCreditosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCreditosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCreditosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCreditosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCreditosDetallados;
	protected JTextField jTextFieldValorCampoGeneralCreditosDetallados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCreditosDetallados;
	//public JList<Reporte> jListColumnasSelectReporteCreditosDetallados;
	//public JScrollPane jScrollColumnasSelectReporteCreditosDetallados;
	
	//public JLabel jLabelRelacionesSelectReporteCreditosDetallados;
	//public JList<Reporte> jListRelacionesSelectReporteCreditosDetallados;
	//public JScrollPane jScrollRelacionesSelectReporteCreditosDetallados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCreditosDetallados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCreditosDetallados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCreditosDetallados;
	//public JLabel jLabelTiposArchivoReporteDinamicoCreditosDetallados;
	
		
	//public JLabel jLabelArchivoImportacionCreditosDetallados;	
	//public JLabel jLabelPathArchivoImportacionCreditosDetallados;
	//protected JTextField jTextFieldPathArchivoImportacionCreditosDetallados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCreditosDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCreditosDetallados;
	
	//public JLabel jLabelColumnaCategoriaValorCreditosDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCreditosDetallados;
	
	//public JLabel jLabelColumnasValoresGraficoCreditosDetallados;
	//public JList<Reporte> jListColumnasValoresGraficoCreditosDetallados;
	//public JScrollPane jScrollColumnasValoresGraficoCreditosDetallados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCreditosDetallados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCreditosDetallados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCreditosDetallados;
	public JPanel jPanelBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonBusquedaCreditosDetalladosCreditosDetallados;
	
	public JPanel jPanelid_cargoBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonid_cargoBusquedaCreditosDetalladosCreditosDetallados= new JButtonMe();
	public JButton jButtonid_cargoBusquedaCreditosDetalladosCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_cargoBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonid_estructuraBusquedaCreditosDetalladosCreditosDetallados= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaCreditosDetalladosCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonid_empleadoBusquedaCreditosDetalladosCreditosDetallados= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaCreditosDetalladosCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados= new JButtonMe();
	public JButton jButtonid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados;
	//public JFormattedTextField jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados;

	public JDateChooser jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados;
	public JLabel jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados;

	public JDateChooser jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados;
	public JButton jButtonfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetalladosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CreditosDetalladosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCreditosDetallados)	{
		this.jButtonRecargarInformacionCreditosDetallados = jButtonRecargarInformacionCreditosDetallados;
	}
	
	public JButton getjButtonProcesarInformacionCreditosDetallados() {
		return this.jButtonProcesarInformacionCreditosDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCreditosDetallados)	{
		this.jButtonProcesarInformacionCreditosDetallados = jButtonProcesarInformacionCreditosDetallados;
	}
	
	
	public JButton getjButtonRecargarInformacionCreditosDetallados() {
		return this.jButtonRecargarInformacionCreditosDetallados;
	}
	
	
	public List<CreditosDetallados> getcreditosdetalladoss() {
		return this.creditosdetalladoss;
	}

	public void setcreditosdetalladoss(List<CreditosDetallados> creditosdetalladoss) {
		this.creditosdetalladoss = creditosdetalladoss;
	}
	
	public List<CreditosDetallados> getcreditosdetalladossAux() {
		return this.creditosdetalladossAux;
	}

	public void setcreditosdetalladossAux(List<CreditosDetallados> creditosdetalladossAux) {
		this.creditosdetalladossAux = creditosdetalladossAux;
	}
	
	public List<CreditosDetallados> getcreditosdetalladossEliminados() {
		return this.creditosdetalladossEliminados;
	}

	public void setCreditosDetalladossEliminados(List<CreditosDetallados> creditosdetalladossEliminados) {
		this.creditosdetalladossEliminados = creditosdetalladossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCreditosDetallados() {
		return jComboBoxTiposSeleccionarCreditosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCreditosDetallados(
			JComboBox jComboBoxTiposSeleccionarCreditosDetallados) {
		this.jComboBoxTiposSeleccionarCreditosDetallados = jComboBoxTiposSeleccionarCreditosDetallados;
	}
	
	public void setBorderResaltarTiposSeleccionarCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCreditosDetallados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCreditosDetallados() {
		return jTextFieldValorCampoGeneralCreditosDetallados;
	}

	public void setjTextFieldValorCampoGeneralCreditosDetallados(
			JTextField jTextFieldValorCampoGeneralCreditosDetallados) {
		this.jTextFieldValorCampoGeneralCreditosDetallados = jTextFieldValorCampoGeneralCreditosDetallados;
	}

	public void setBorderResaltarValorCampoGeneralCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCreditosDetallados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCreditosDetallados() {
		return this.jCheckBoxSeleccionarTodosCreditosDetallados;
	}

	public void setjCheckBoxSeleccionarTodosCreditosDetallados(
			JCheckBox jCheckBoxSeleccionarTodosCreditosDetallados) {
		this.jCheckBoxSeleccionarTodosCreditosDetallados = jCheckBoxSeleccionarTodosCreditosDetallados;
	}

	public void setBorderResaltarSeleccionarTodosCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCreditosDetallados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCreditosDetallados() {
		return this.jCheckBoxSeleccionadosCreditosDetallados;
	}

	public void setjCheckBoxSeleccionadosCreditosDetallados(
			JCheckBox jCheckBoxSeleccionadosCreditosDetallados) {
		this.jCheckBoxSeleccionadosCreditosDetallados = jCheckBoxSeleccionadosCreditosDetallados;
	}
	
	public void setBorderResaltarSeleccionadosCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCreditosDetallados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCreditosDetallados() {
		return this.jComboBoxTiposArchivosReportesCreditosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCreditosDetallados(
			JComboBox jComboBoxTiposArchivosReportesCreditosDetallados) {
		this.jComboBoxTiposArchivosReportesCreditosDetallados = jComboBoxTiposArchivosReportesCreditosDetallados;
	}

	public void setBorderResaltarTiposArchivosReportesCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCreditosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCreditosDetallados() {
		return this.jComboBoxTiposReportesCreditosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCreditosDetallados(
			JComboBox jComboBoxTiposReportesCreditosDetallados) {
		this.jComboBoxTiposReportesCreditosDetallados = jComboBoxTiposReportesCreditosDetallados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCreditosDetallados() {
	//	return jComboBoxTiposReportesDinamicoCreditosDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCreditosDetallados(
	//		JComboBox jComboBoxTiposReportesDinamicoCreditosDetallados) {
	//	this.jComboBoxTiposReportesDinamicoCreditosDetallados = jComboBoxTiposReportesDinamicoCreditosDetallados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCreditosDetallados() {
	//	return jComboBoxTiposArchivosReportesDinamicoCreditosDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCreditosDetallados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCreditosDetallados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados = jComboBoxTiposArchivosReportesDinamicoCreditosDetallados;
	//}
	
	public void setBorderResaltarTiposReportesCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCreditosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCreditosDetallados() {
		return this.jComboBoxTiposGraficosReportesCreditosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCreditosDetallados(
			JComboBox jComboBoxTiposGraficosReportesCreditosDetallados) {
		this.jComboBoxTiposGraficosReportesCreditosDetallados = jComboBoxTiposGraficosReportesCreditosDetallados;
	}
	
	public void setBorderResaltarTiposGraficosReportesCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCreditosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCreditosDetallados() {
		return this.jComboBoxTiposPaginacionCreditosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCreditosDetallados(
			JComboBox jComboBoxTiposPaginacionCreditosDetallados) {
		this.jComboBoxTiposPaginacionCreditosDetallados = jComboBoxTiposPaginacionCreditosDetallados;
	}
	
	public void setBorderResaltarTiposPaginacionCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCreditosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCreditosDetallados() {
		return this.jComboBoxTiposRelacionesCreditosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCreditosDetallados() {
		return this.jComboBoxTiposAccionesCreditosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCreditosDetallados(
			JComboBox jComboBoxTiposRelacionesCreditosDetallados) {
		this.jComboBoxTiposRelacionesCreditosDetallados = jComboBoxTiposRelacionesCreditosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCreditosDetallados(
			JComboBox jComboBoxTiposAccionesCreditosDetallados) {
		this.jComboBoxTiposAccionesCreditosDetallados = jComboBoxTiposAccionesCreditosDetallados;
	}
	
	public void setBorderResaltarTiposRelacionesCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCreditosDetallados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCreditosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCreditosDetallados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCreditosDetallados() {
	//	return jCheckBoxConGraficoDinamicoCreditosDetallados;
	//}

	//public void setjCheckBoxConGraficoDinamicoCreditosDetallados(
	//		JCheckBox jCheckBoxConGraficoDinamicoCreditosDetallados) {
	//	this.jCheckBoxConGraficoDinamicoCreditosDetallados = jCheckBoxConGraficoDinamicoCreditosDetallados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCreditosDetallados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCreditosDetallados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCreditosDetallados .setBorder(borderResaltar);		
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
		this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
		
		this.creditosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.creditosdetalladosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CreditosDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Creditos Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
		
		CreditosDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCreditosDetallados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"nuevo","nuevo","Nuevo"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"duplicar","duplicar","Duplicar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"copiar","copiar","Copiar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"ver_form","ver_form","Ver"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"recargar","recargar","Buscar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCreditosDetallados,this.jTtoolBarCreditosDetallados,
							"cerrar","cerrar","Salir"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCreditosDetallados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCreditosDetallados;
			
				this.jButtonProcesarInformacionToolBarCreditosDetallados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCreditosDetallados;
				
		//protected JButton jButtonModificarToolBarCreditosDetallados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCreditosDetallados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCreditosDetallados=new JMenuMe("General");
		this.jmenuArchivoCreditosDetallados=new JMenuMe("Archivo");
		this.jmenuAccionesCreditosDetallados=new JMenuMe("Acciones");
		this.jmenuDatosCreditosDetallados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCreditosDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCreditosDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCreditosDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCreditosDetallados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCreditosDetallados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCreditosDetallados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCreditosDetallados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCreditosDetallados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCreditosDetallados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCreditosDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCreditosDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCreditosDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCreditosDetallados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCreditosDetallados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCreditosDetallados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCreditosDetallados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCreditosDetallados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCreditosDetallados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCreditosDetallados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCreditosDetallados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCreditosDetallados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCreditosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCreditosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCreditosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCreditosDetallados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCreditosDetallados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCreditosDetallados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCreditosDetallados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCreditosDetallados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCreditosDetallados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCreditosDetallados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCreditosDetallados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCreditosDetallados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCreditosDetallados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCreditosDetallados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCreditosDetallados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCreditosDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCreditosDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCreditosDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCreditosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCreditosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCreditosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCreditosDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCreditosDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCreditosDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCreditosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCreditosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCreditosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCreditosDetallados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCreditosDetallados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCreditosDetallados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCreditosDetallados.add(this.jMenuItemCerrarCreditosDetallados);
			
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemNuevoCreditosDetallados);
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemNuevoGuardarCambiosCreditosDetallados);
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemNuevoRelacionesCreditosDetallados);
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemGuardarCambiosTablaCreditosDetallados);		
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemDuplicarCreditosDetallados);		
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemCopiarCreditosDetallados);		
			this.jmenuAccionesCreditosDetallados.add(this.jMenuItemVerFormCreditosDetallados);		
			
			this.jmenuDatosCreditosDetallados.add(this.jMenuItemRecargarInformacionCreditosDetallados);				
			this.jmenuDatosCreditosDetallados.add(this.jMenuItemAnterioresCreditosDetallados);				
			this.jmenuDatosCreditosDetallados.add(this.jMenuItemSiguientesCreditosDetallados);				
			this.jmenuDatosCreditosDetallados.add(this.jMenuItemAbrirOrderByCreditosDetallados);				
			this.jmenuDatosCreditosDetallados.add(this.jMenuItemMostrarOcultarCreditosDetallados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCreditosDetallados.add(this.jMenuItemGuardarCambiosCreditosDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCreditosDetallados.add(this.jmenuArchivoCreditosDetallados);		
			this.jmenuBarCreditosDetallados.add(this.jmenuAccionesCreditosDetallados);		
			this.jmenuBarCreditosDetallados.add(this.jmenuDatosCreditosDetallados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCreditosDetallados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCreditosDetallados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCreditosDetalladosCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Buscar Por Cargo Por Estructura Por Empleado Por Tipo Prestamo Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");
		this.jButtonBusquedaCreditosDetalladosCreditosDetallados= new JButtonMe();
		this.jButtonBusquedaCreditosDetalladosCreditosDetallados.setText("Buscar");
		this.jButtonBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Buscar Por Cargo Por Estructura Por Empleado Por Tipo Prestamo Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCreditosDetalladosCreditosDetallados,"buscar_button","Buscar Por Cargo Por Estructura Por Empleado Por Tipo Prestamo Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCreditosDetalladosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados.setText("Cargo :");
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Cargo");
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados= new JComboBoxMe();
		jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setText("Estructura :");
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setText("Empleado :");
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Empleado");
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados= new JComboBoxMe();
		jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setText("Tipo Prestamo :");
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Tipo Prestamo");
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados= new JComboBoxMe();
		jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setText("Fecha Vencimiento Desde :");
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Fecha Vencimiento Desde");
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados= new JDateChooser();
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setDate(new Date());
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados = new JLabelMe();
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setText("Fecha Vencimiento Hasta :");
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setToolTipText("Fecha Vencimiento Hasta");
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCreditosDetallados=new JTabbedPane();


		this.jTabbedPaneBusquedasCreditosDetallados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasCreditosDetallados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasCreditosDetallados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCreditosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCreditosDetallados = new CreditosDetalladosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Creditos Detallados DATOS");
			this.jInternalFrameDetalleFormCreditosDetallados = new CreditosDetalladosDetalleFormJInternalFrame(jDesktopPane,this.creditosdetalladosSessionBean.getConGuardarRelaciones(),this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCreditosDetallados = null;//new CreditosDetalladosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCreditosDetallados= new GridBagLayout();
		
		
		this.jTableDatosCreditosDetallados = new JTableMe();      
		
		String sToolTipCreditosDetallados="";
		sToolTipCreditosDetallados=CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCreditosDetallados+="(Nomina.CreditosDetallados)";
		}
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCreditosDetallados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCreditosDetallados.setToolTipText(sToolTipCreditosDetallados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCreditosDetallados);
		this.jTableDatosCreditosDetallados.setAutoCreateRowSorter(true);
		this.jTableDatosCreditosDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCreditosDetallados.setRowSelectionAllowed(true);
		this.jTableDatosCreditosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCreditosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCreditosDetallados = new JButtonMe();
		this.jButtonDuplicarCreditosDetallados = new JButtonMe();
		this.jButtonCopiarCreditosDetallados = new JButtonMe();
		this.jButtonVerFormCreditosDetallados = new JButtonMe();
		this.jButtonNuevoRelacionesCreditosDetallados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCreditosDetallados = new JButtonMe();
		this.jButtonCerrarCreditosDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCreditosDetallados = new JScrollPane();   
        this.jScrollPanelDatosGeneralCreditosDetallados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Creditos Detallados";
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCreditosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCreditosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCreditosDetallados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCreditosDetallados=new ReporteDinamicoJInternalFrame(CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCreditosDetallados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCreditosDetallados=new ImportacionJInternalFrame(CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCreditosDetallados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCreditosDetallados = new JButtonMe();
		
		this.jButtonAbrirOrderByCreditosDetallados.setText("Orden");
		this.jButtonAbrirOrderByCreditosDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCreditosDetallados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCreditosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosDetallados,false,this);
			
			//this.cargarOrderByCreditosDetallados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCreditosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosDetallados,true,this);
			
			//this.cargarOrderByCreditosDetallados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCreditosDetallados.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosCreditosDetallados.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosCreditosDetallados.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosCreditosDetallados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCreditosDetallados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCreditosDetallados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCreditosDetallados.setText("Nuevo");
		this.jButtonDuplicarCreditosDetallados.setText("Duplicar");
		this.jButtonCopiarCreditosDetallados.setText("Copiar");
		this.jButtonVerFormCreditosDetallados.setText("Ver");
		this.jButtonNuevoRelacionesCreditosDetallados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.setText("Guardar");
		this.jButtonCerrarCreditosDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCreditosDetallados,"nuevo_button","Nuevo",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCreditosDetallados,"duplicar_button","Duplicar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCreditosDetallados,"copiar_button","Copiar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCreditosDetallados,"ver_form","Ver",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCreditosDetallados,"nuevorelaciones_button","Nuevo Rel",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCreditosDetallados,"guardarcambiostabla_button","Guardar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCreditosDetallados,"cerrar_button","Salir",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCreditosDetallados.setToolTipText("Nuevo"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCreditosDetallados.setToolTipText("Duplicar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCreditosDetallados.setToolTipText("Copiar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCreditosDetallados.setToolTipText("Ver"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCreditosDetallados.setToolTipText("Nuevo Rel"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.setToolTipText("Guardar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCreditosDetallados.setToolTipText("Salir"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCreditosDetallados";
		inputMap = this.jButtonNuevoCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCreditosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCreditosDetallados"));
		
		//DUPLICAR
		sMapKey = "DuplicarCreditosDetallados";
		inputMap = this.jButtonDuplicarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCreditosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCreditosDetallados"));
		
		//COPIAR
		sMapKey = "CopiarCreditosDetallados";
		inputMap = this.jButtonCopiarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCreditosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCreditosDetallados"));
		
		//VEr FORM
		sMapKey = "VerFormCreditosDetallados";
		inputMap = this.jButtonVerFormCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCreditosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCreditosDetallados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCreditosDetallados";
		inputMap = this.jButtonNuevoRelacionesCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCreditosDetallados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCreditosDetallados";
		inputMap = this.jButtonModificarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCreditosDetallados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCreditosDetallados";
		inputMap = this.jButtonCerrarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCreditosDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCreditosDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCreditosDetallados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCreditosDetallados.setName("jPanelParametrosReportesCreditosDetallados"); 
		
		this.jPanelParametrosReportesAccionesCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCreditosDetallados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCreditosDetallados.setName("jPanelParametrosReportesAccionesCreditosDetallados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCreditosDetallados = new JButtonMe();
		this.jButtonRecargarInformacionCreditosDetallados.setText("Buscar");
		this.jButtonRecargarInformacionCreditosDetallados.setToolTipText("Buscar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCreditosDetallados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCreditosDetallados.setVisible(false);
		
		
		this.jButtonProcesarInformacionCreditosDetallados = new JButtonMe();
		this.jButtonProcesarInformacionCreditosDetallados.setText("Procesar");
		this.jButtonProcesarInformacionCreditosDetallados.setToolTipText("Procesar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCreditosDetallados.setVisible(false);
			
		this.jButtonProcesarInformacionCreditosDetallados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCreditosDetallados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCreditosDetallados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosDetallados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCreditosDetallados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosDetallados.setText("TIPO");       
		this.jComboBoxTiposReportesCreditosDetallados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosDetallados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCreditosDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCreditosDetallados.setText("Paginacion");
		this.jComboBoxTiposPaginacionCreditosDetallados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCreditosDetallados.setText("Accion");
		this.jComboBoxTiposRelacionesCreditosDetallados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCreditosDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCreditosDetallados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCreditosDetallados.setText("Accion");
		this.jComboBoxTiposSeleccionarCreditosDetallados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCreditosDetallados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCreditosDetallados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCreditosDetallados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCreditosDetallados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCreditosDetallados = new JLabelMe();
		
		this.jLabelAccionesCreditosDetallados.setText("Acciones");		
		this.jLabelAccionesCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCreditosDetallados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCreditosDetallados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCreditosDetallados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCreditosDetallados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCreditosDetallados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCreditosDetallados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCreditosDetallados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCreditosDetallados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCreditosDetallados.setText("Graf.");
		this.jCheckBoxConGraficoReporteCreditosDetallados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCreditosDetallados = new JButtonMe();
		//this.jButtonAnterioresCreditosDetallados.setText("<<");
        this.jButtonAnterioresCreditosDetallados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCreditosDetallados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCreditosDetallados = new JButtonMe();
		//this.jButtonSiguientesCreditosDetallados.setText(">>");
        this.jButtonSiguientesCreditosDetallados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCreditosDetallados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCreditosDetallados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCreditosDetallados.setText("Nue");
        this.jButtonNuevoGuardarCambiosCreditosDetallados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCreditosDetallados,"nuevoguardarcambios_button","Nue",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCreditosDetallados";
		inputMap = this.jButtonNuevoGuardarCambiosCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCreditosDetallados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCreditosDetallados";
		inputMap = this.jButtonRecargarInformacionCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCreditosDetallados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCreditosDetallados";
		inputMap = this.jButtonSiguientesCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCreditosDetallados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCreditosDetallados";
		inputMap = this.jButtonAnterioresCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCreditosDetallados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCreditosDetallados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCreditosDetallados.setMinimumSize(new Dimension(this.getWidth(),CreditosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCreditosDetallados.setMaximumSize(new Dimension(this.getWidth(),CreditosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCreditosDetallados.setPreferredSize(new Dimension(this.getWidth(),CreditosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCreditosDetallados = new GridBagLayout();

			this.jPanelPaginacionCreditosDetallados.setLayout(gridaBagLayoutPaginacionCreditosDetallados);						
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 0;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonAnterioresCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					
						
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCreditosDetallados.gridy = 0;
			
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonNuevoGuardarCambiosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
						
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCreditosDetallados.gridy = 0;
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonSiguientesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 1;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonNuevoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
						
			
			
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
				this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCreditosDetallados.gridy = 1;
				this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCreditosDetallados.add(this.jButtonGuardarCambiosTablaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			}
			
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 1;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonDuplicarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 1;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonCopiarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 1;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonVerFormCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 1;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCreditosDetallados.add(this.jButtonCerrarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		
		this.jButtonRecargarInformacionCreditosDetallados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCreditosDetallados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCreditosDetallados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCreditosDetallados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCreditosDetallados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCreditosDetallados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCreditosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCreditosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCreditosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCreditosDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCreditosDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCreditosDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCreditosDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCreditosDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCreditosDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCreditosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCreditosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCreditosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCreditosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCreditosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCreditosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCreditosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCreditosDetallados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCreditosDetallados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCreditosDetallados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCreditosDetallados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCreditosDetallados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCreditosDetallados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCreditosDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCreditosDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCreditosDetallados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCreditosDetallados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCreditosDetallados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCreditosDetallados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCreditosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCreditosDetallados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CreditosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CreditosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CreditosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CreditosDetallados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCreditosDetallados.setLayout(gridaBagParametrosReportesCreditosDetallados);
			this.jPanelParametrosReportesAccionesCreditosDetallados.setLayout(gridaBagParametrosReportesAccionesCreditosDetallados);
			
			
			this.jPanelParametrosAuxiliar1CreditosDetallados.setLayout(gridaBagParametrosAuxiliar1CreditosDetallados);
			this.jPanelParametrosAuxiliar2CreditosDetallados.setLayout(gridaBagParametrosAuxiliar2CreditosDetallados);
			this.jPanelParametrosAuxiliar3CreditosDetallados.setLayout(gridaBagParametrosAuxiliar3CreditosDetallados);
			this.jPanelParametrosAuxiliar4CreditosDetallados.setLayout(gridaBagParametrosAuxiliar4CreditosDetallados);
			//this.jPanelParametrosAuxiliar5CreditosDetallados.setLayout(gridaBagParametrosAuxiliar2CreditosDetallados);			
			
			
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosDetallados.add(this.jButtonRecargarInformacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosDetallados.add(this.jComboBoxTiposPaginacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosDetallados.add(this.jCheckBoxConAltoMaximoTablaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosDetallados.add(this.jComboBoxTiposArchivosReportesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosDetallados.add(this.jPanelParametrosAuxiliar1CreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CreditosDetallados.add(this.jComboBoxTiposReportesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);																		
			
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CreditosDetallados.add(this.jComboBoxTiposGraficosReportesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosDetallados.add(this.jPanelParametrosAuxiliar4CreditosDetallados, this.gridBagConstraintsCreditosDetallados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosDetallados.add(this.jComboBoxTiposReportesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosDetallados.add(this.jCheckBoxGenerarReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosDetallados.add(this.jPanelParametrosAuxiliar2CreditosDetallados, this.gridBagConstraintsCreditosDetallados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosDetallados.add(this.jLabelAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
				this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCreditosDetallados.add(this.jButtonAbrirOrderByCreditosDetallados, this.gridBagConstraintsCreditosDetallados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosDetallados.add(this.jComboBoxTiposSeleccionarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
			
			
			/*
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosDetallados.add(this.jCheckBoxSeleccionarTodosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosDetallados.add(this.jCheckBoxConGraficoReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosDetallados.add(this.jCheckBoxSeleccionarTodosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);															
				
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosDetallados.add(this.jCheckBoxSeleccionadosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);															
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosDetallados.add(this.jCheckBoxConGraficoReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosDetallados.add(this.jPanelParametrosAuxiliar3CreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosDetallados.add(this.jComboBoxTiposAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCreditosDetallados = new GridBagLayout();

			this.jScrollPanelDatosCreditosDetallados.setLayout(gridaBagLayoutDatosCreditosDetallados);
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = 0;
			this.gridBagConstraintsCreditosDetallados.gridx = 0;
			
			this.jScrollPanelDatosCreditosDetallados.add(this.jTableDatosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCreditosDetallados.setViewportView(this.jTableDatosCreditosDetallados);
		this.jTableDatosCreditosDetallados.setFillsViewportHeight(true);
		this.jTableDatosCreditosDetallados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCreditosDetallados= new GridBagLayout();
		this.jPanelAccionesCreditosDetallados.setLayout(gridaBagLayoutAccionesCreditosDetallados);
		
		
		/*	
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
			
		this.jPanelAccionesCreditosDetallados.add(this.jButtonNuevoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados= new GridBagLayout();
		gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCreditosDetalladosCreditosDetallados.setLayout(gridaBagLayoutBusquedaCreditosDetalladosCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 0;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelid_cargoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 0;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);


		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 1;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelid_estructuraBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 1;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);


		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 2;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelid_empleadoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 2;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);


		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 3;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 3;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);


		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 4;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 4;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);


		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 5;
		gridBagConstraintsCreditosDetallados.gridx = 0;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jLabelfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 5;
		gridBagConstraintsCreditosDetallados.gridx = 1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosDetallados.gridy = 6;
		gridBagConstraintsCreditosDetallados.gridx =1;
		jPanelBusquedaCreditosDetalladosCreditosDetallados.add(jButtonBusquedaCreditosDetalladosCreditosDetallados, gridBagConstraintsCreditosDetallados);

		jTabbedPaneBusquedasCreditosDetallados.addTab("1.-Por Cargo Por Estructura Por Empleado Por Tipo Prestamo Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ", jPanelBusquedaCreditosDetalladosCreditosDetallados);
		jTabbedPaneBusquedasCreditosDetallados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCreditosDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCreditosDetallados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosDetallados.gridx = 0;		
			//this.gridBagConstraintsCreditosDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCreditosDetallados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCreditosDetallados.gridx = 0;		
		//this.gridBagConstraintsCreditosDetallados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCreditosDetallados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCreditosDetallados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosDetallados.gridx = 0;		
			this.gridBagConstraintsCreditosDetallados.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCreditosDetallados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCreditosDetallados, this.gridBagConstraintsCreditosDetallados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);								
		
		
		/*
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		*/		
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCreditosDetallados.gridx =0;
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCreditosDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
				
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCreditosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCreditosDetallados = new GridBagLayout();
			this.jPanelBusquedasParametrosCreditosDetallados.setLayout(gridaBagLayoutBusquedasParametrosCreditosDetallados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCreditosDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCreditosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCreditosDetallados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCreditosDetallados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCreditosDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCreditosDetallados.setName("jPanelReporteDinamicoCreditosDetallados"); 
		
		this.jPanelReporteDinamicoCreditosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCreditosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCreditosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCreditosDetallados.setLayout(gridaBagLayoutReporteDinamicoCreditosDetallados);
		
		
		this.jInternalFrameReporteDinamicoCreditosDetallados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCreditosDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCreditosDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCreditosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCreditosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCreditosDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCreditosDetallados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCreditosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCreditosDetallados.setResizable(true);
	    this.jInternalFrameReporteDinamicoCreditosDetallados.setClosable(true);
	    this.jInternalFrameReporteDinamicoCreditosDetallados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCreditosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCreditosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCreditosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCreditosDetallados = new JLabelMe();

		this.jLabelColumnasSelectReporteCreditosDetallados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelColumnasSelectReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCreditosDetallados = new JList<Reporte>();
		this.jListColumnasSelectReporteCreditosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCreditosDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCreditosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCreditosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCreditosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCreditosDetallados=new JScrollPane(this.jListColumnasSelectReporteCreditosDetallados);
			
			this.jScrollColumnasSelectReporteCreditosDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCreditosDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCreditosDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCreditosDetallados.add(this.jListColumnasSelectReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jScrollColumnasSelectReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCreditosDetallados = new JLabelMe();

		this.jLabelRelacionesSelectReporteCreditosDetallados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCreditosDetallados = new JList<Reporte>();
		this.jListRelacionesSelectReporteCreditosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCreditosDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCreditosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCreditosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCreditosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCreditosDetallados=new JScrollPane(this.jListRelacionesSelectReporteCreditosDetallados);
			
			this.jScrollRelacionesSelectReporteCreditosDetallados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCreditosDetallados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCreditosDetallados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCreditosDetallados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCreditosDetallados = new JComboBoxMe();
		this.jListColumnasValoresGraficoCreditosDetallados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCreditosDetallados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCreditosDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCreditosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCreditosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCreditosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCreditosDetallados = new JLabelMe();

		this.jLabelConGraficoDinamicoCreditosDetallados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelConGraficoDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCreditosDetallados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCreditosDetallados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCreditosDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCreditosDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCreditosDetallados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jCheckBoxConGraficoDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCreditosDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCreditosDetallados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelColumnaCategoriaGraficoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jComboBoxColumnaCategoriaGraficoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCreditosDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaValorCreditosDetallados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelColumnaCategoriaValorCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCreditosDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCreditosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCreditosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCreditosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCreditosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jComboBoxColumnaCategoriaValorCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCreditosDetallados = new JLabelMe();

		this.jLabelColumnasValoresGraficoCreditosDetallados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelColumnasValoresGraficoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCreditosDetallados = new JList<Reporte>();
		this.jListColumnasValoresGraficoCreditosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCreditosDetallados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCreditosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCreditosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCreditosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCreditosDetallados=new JScrollPane(this.jListColumnasValoresGraficoCreditosDetallados);
			
			this.jScrollColumnasValoresGraficoCreditosDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCreditosDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCreditosDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCreditosDetallados.add(this.jListColumnasSelectReporteCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jScrollColumnasValoresGraficoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCreditosDetallados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCreditosDetallados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelTiposGraficosReportesDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCreditosDetallados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jComboBoxTiposGraficosReportesDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCreditosDetallados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCreditosDetallados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelGenerarExcelReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCreditosDetallados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCreditosDetallados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCreditosDetallados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCreditosDetallados.setToolTipText("Generar EXCEL"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCreditosDetallados.add(this.jButtonGenerarExcelReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jComboBoxTiposReportesDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCreditosDetallados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCreditosDetallados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jLabelTiposArchivoReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jComboBoxTiposArchivosReportesDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCreditosDetallados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCreditosDetallados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCreditosDetallados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCreditosDetallados.setToolTipText("Generar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jButtonGenerarReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCreditosDetallados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCreditosDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCreditosDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCreditosDetallados.setToolTipText("Cancelar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosDetallados.add(this.jButtonCerrarReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCreditosDetallados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCreditosDetallados= new JScrollPane(jPanelReporteDinamicoCreditosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCreditosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCreditosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCreditosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCreditosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCreditosDetallados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCreditosDetallados);
		this.jInternalFrameReporteDinamicoCreditosDetallados.getContentPane().add(this.jScrollPanelReporteDinamicoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCreditosDetallados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCreditosDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCreditosDetallados.setName("jPanelImportacionCreditosDetallados"); 
		
		this.jPanelImportacionCreditosDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCreditosDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCreditosDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCreditosDetallados.setLayout(gridaBagLayoutImportacionCreditosDetallados);
		
		
		this.jInternalFrameImportacionCreditosDetallados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCreditosDetallados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCreditosDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCreditosDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCreditosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCreditosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCreditosDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCreditosDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCreditosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCreditosDetallados.setResizable(true);
	    this.jInternalFrameImportacionCreditosDetallados.setClosable(true);
	    this.jInternalFrameImportacionCreditosDetallados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCreditosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCreditosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCreditosDetallados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCreditosDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCreditosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCreditosDetallados.setResizable(true);
	    this.jInternalFrameImportacionCreditosDetallados.setClosable(true);
	    this.jInternalFrameImportacionCreditosDetallados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCreditosDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCreditosDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCreditosDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCreditosDetallados = new JLabelMe();

		this.jLabelArchivoImportacionCreditosDetallados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCreditosDetallados.add(this.jLabelArchivoImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCreditosDetallados = new JFileChooser();		
		this.jFileChooserImportacionCreditosDetallados.setToolTipText("ESCOGER ARCHIVO"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCreditosDetallados = new JButtonMe();
		this.jButtonAbrirImportacionCreditosDetallados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCreditosDetallados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCreditosDetallados.setToolTipText("Generar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosDetallados.add(this.jButtonAbrirImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCreditosDetallados = new JLabelMe();

		this.jLabelPathArchivoImportacionCreditosDetallados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCreditosDetallados.add(this.jLabelPathArchivoImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCreditosDetallados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCreditosDetallados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCreditosDetallados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCreditosDetallados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosDetallados.add(this.jTextFieldPathArchivoImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCreditosDetallados = new JButtonMe();
		this.jButtonGenerarImportacionCreditosDetallados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCreditosDetallados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCreditosDetallados.setToolTipText("Generar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosDetallados.add(this.jButtonGenerarImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCreditosDetallados = new JButtonMe();
		this.jButtonCerrarImportacionCreditosDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCreditosDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCreditosDetallados.setToolTipText("Cancelar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosDetallados.add(this.jButtonCerrarImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCreditosDetallados = new GridBagLayout();
		
		this.jScrollPanelImportacionCreditosDetallados= new JScrollPane(jPanelImportacionCreditosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iPosYImportacion;
		this.gridBagConstraintsCreditosDetallados.gridx =iPosXImportacion;
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCreditosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCreditosDetallados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCreditosDetallados);
		this.jInternalFrameImportacionCreditosDetallados.getContentPane().add(this.jScrollPanelImportacionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCreditosDetallados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCreditosDetallados = new JButtonMe();
			this.jButtonAbrirOrderByCreditosDetallados.setText("Orden");
			this.jButtonAbrirOrderByCreditosDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCreditosDetallados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCreditosDetallados";
			inputMap = this.jButtonAbrirOrderByCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCreditosDetallados"));
		
		
			GridBagLayout gridaBagLayoutOrderByCreditosDetallados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCreditosDetallados.setName("jPanelOrderByCreditosDetallados"); 
			
			this.jPanelOrderByCreditosDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCreditosDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCreditosDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCreditosDetallados.setLayout(gridaBagLayoutOrderByCreditosDetallados);
			
			
			this.jTableDatosCreditosDetalladosOrderBy = new JTableMe();        
			this.jTableDatosCreditosDetalladosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCreditosDetalladosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCreditosDetalladosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCreditosDetalladosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCreditosDetalladosOrderBy.setViewportView(this.jTableDatosCreditosDetalladosOrderBy);
			this.jTableDatosCreditosDetalladosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCreditosDetalladosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCreditosDetallados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCreditosDetallados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCreditosDetallados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCreditosDetallados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCreditosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCreditosDetallados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCreditosDetallados.setTitle("Orden");
			this.jInternalFrameOrderByCreditosDetallados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCreditosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCreditosDetallados.setResizable(true);
			this.jInternalFrameOrderByCreditosDetallados.setClosable(true);
			this.jInternalFrameOrderByCreditosDetallados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCreditosDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCreditosDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCreditosDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCreditosDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCreditosDetallados.ipady =150;
				
			this.jPanelOrderByCreditosDetallados.add(jScrollPanelDatosCreditosDetalladosOrderBy, this.gridBagConstraintsCreditosDetallados);//this.jTableDatosCreditosDetalladosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCreditosDetallados = new JButtonMe();
			this.jButtonCerrarOrderByCreditosDetallados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCreditosDetallados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCreditosDetallados.setToolTipText("Cancelar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCreditosDetallados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCreditosDetallados.add(this.jButtonCerrarOrderByCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCreditosDetallados = new GridBagLayout();
			
			this.jScrollPanelOrderByCreditosDetallados= new JScrollPane(jPanelOrderByCreditosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy =iPosYOrderBy;
			this.gridBagConstraintsCreditosDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCreditosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCreditosDetallados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCreditosDetallados);
			
			this.jInternalFrameOrderByCreditosDetallados.getContentPane().add(this.jScrollPanelOrderByCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
		
		} else {
			this.jButtonAbrirOrderByCreditosDetallados = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.creditosdetalladosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCreditosDetallados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCreditosDetallados.getRowHeight();//CreditosDetalladosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCreditosDetallados.isSelected()) {
					iHeightTable=CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCreditosDetallados.isSelected()) {
					iHeightTable=CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CreditosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCreditosDetallados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCreditosDetallados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCreditosDetallados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCreditosDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCreditosDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCreditosDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCreditosDetallados!=null && this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy()!=null) {
			//if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCreditosDetallados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCreditosDetallados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCreditosDetallados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCreditosDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCreditosDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCreditosDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=creditosdetalladosLogic.getCreditosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditosdetalladoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CreditosDetallados> TraerCreditosDetalladosBeans(List<CreditosDetallados> creditosdetalladoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CreditosDetallados creditosdetallados:creditosdetalladoss) {
					
				if(!(CreditosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CreditosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					creditosdetallados.setsDetalleGeneralEntityReporte(CreditosDetalladosConstantesFunciones.getCreditosDetalladosDescripcion(creditosdetallados));
										
						
					
						
					
				} else  {
							
					//creditosdetallados.setsDetalleGeneralEntityReporte(creditosdetallados.getsDetalleGeneralEntityReporte());
										
				}
				
				//creditosdetalladosbeans.add(creditosdetalladosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return creditosdetalladoss;
    }
	//PARA REPORTES FIN
}
