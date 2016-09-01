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
import com.bydan.erp.tesoreria.util.report.BeneficiariosPagosCobrosConstantesFunciones;

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
public class BeneficiariosPagosCobrosJInternalFrame extends BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBeneficiariosPagosCobros;
	
	protected JMenuBar jmenuBarBeneficiariosPagosCobros;
	
	protected JMenu jmenuBeneficiariosPagosCobros;
	protected JMenu jmenuDatosBeneficiariosPagosCobros;
	protected JMenu jmenuArchivoBeneficiariosPagosCobros;
	protected JMenu jmenuAccionesBeneficiariosPagosCobros;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBeneficiariosPagosCobros;	
	protected GridBagConstraints gridBagConstraintsBeneficiariosPagosCobros;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BeneficiariosPagosCobrosDetalleFormJInternalFrame jInternalFrameDetalleFormBeneficiariosPagosCobros;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBeneficiariosPagosCobros;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBeneficiariosPagosCobros;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public BeneficiariosPagosCobrosSessionBean beneficiariospagoscobrosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BeneficiariosPagosCobros> beneficiariospagoscobross;		
	public List<BeneficiariosPagosCobros> beneficiariospagoscobrossEliminados;	
	public List<BeneficiariosPagosCobros> beneficiariospagoscobrossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBeneficiariosPagosCobros;		
	protected JButton jButtonAbrirOrderByBeneficiariosPagosCobros;
	
	
	//protected JPanel jPanelOrderByBeneficiariosPagosCobros;
	//public JScrollPane jScrollPanelOrderByBeneficiariosPagosCobros;	
	//protected JButton jButtonCerrarOrderByBeneficiariosPagosCobros;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BeneficiariosPagosCobrosLogic beneficiariospagoscobrosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBeneficiariosPagosCobros;
	public JScrollPane jScrollPanelDatosEdicionBeneficiariosPagosCobros;
	public JScrollPane jScrollPanelDatosGeneralBeneficiariosPagosCobros;
    
	
	
	//public JScrollPane jScrollPanelDatosBeneficiariosPagosCobrosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBeneficiariosPagosCobros;
	//public JScrollPane jScrollPanelImportacionBeneficiariosPagosCobros;
	
	
	
	protected JPanel jPanelAccionesBeneficiariosPagosCobros;
	
    protected JPanel jPanelPaginacionBeneficiariosPagosCobros;
    protected JPanel jPanelParametrosReportesBeneficiariosPagosCobros;
	protected JPanel jPanelParametrosReportesAccionesBeneficiariosPagosCobros;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BeneficiariosPagosCobros;
	protected JPanel jPanelParametrosAuxiliar2BeneficiariosPagosCobros;
	protected JPanel jPanelParametrosAuxiliar3BeneficiariosPagosCobros;
	protected JPanel jPanelParametrosAuxiliar4BeneficiariosPagosCobros;
	//protected JPanel jPanelParametrosAuxiliar5BeneficiariosPagosCobros;
	
	
	
	//protected JPanel jPanelReporteDinamicoBeneficiariosPagosCobros;
	//protected JPanel jPanelImportacionBeneficiariosPagosCobros;
	
	
	public JTable jTableDatosBeneficiariosPagosCobros;
	
	
	
	//public JTable jTableDatosBeneficiariosPagosCobrosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBeneficiariosPagosCobros;
	protected JButton jButtonDuplicarBeneficiariosPagosCobros;
	protected JButton jButtonCopiarBeneficiariosPagosCobros;
	protected JButton jButtonVerFormBeneficiariosPagosCobros;
	protected JButton jButtonNuevoRelacionesBeneficiariosPagosCobros;
	protected JButton jButtonModificarBeneficiariosPagosCobros;
	
    protected JButton jButtonGuardarCambiosTablaBeneficiariosPagosCobros;
	protected JButton jButtonCerrarBeneficiariosPagosCobros;
	
	
	protected JButton jButtonRecargarInformacionBeneficiariosPagosCobros;
	protected JButton jButtonProcesarInformacionBeneficiariosPagosCobros;
	
	
	protected JButton jButtonAnterioresBeneficiariosPagosCobros;
	protected JButton jButtonSiguientesBeneficiariosPagosCobros;
	protected JButton jButtonNuevoGuardarCambiosBeneficiariosPagosCobros;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBeneficiariosPagosCobros;
	//protected JButton jButtonCerrarReporteDinamicoBeneficiariosPagosCobros;
	//protected JButton jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros;	
	
	
	
	//protected JButton jButtonAbrirImportacionBeneficiariosPagosCobros;
	//protected JButton jButtonGenerarImportacionBeneficiariosPagosCobros;
	//protected JButton jButtonCerrarImportacionBeneficiariosPagosCobros;
	//protected JFileChooser jFileChooserImportacionBeneficiariosPagosCobros;
	//protected File fileImportacionBeneficiariosPagosCobros;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBeneficiariosPagosCobros;
	protected JButton jButtonDuplicarToolBarBeneficiariosPagosCobros;
	protected JButton jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros;
	
	
	public JButton jButtonGuardarCambiosToolBarBeneficiariosPagosCobros;
	protected JButton jButtonCopiarToolBarBeneficiariosPagosCobros;
	protected JButton jButtonVerFormToolBarBeneficiariosPagosCobros;
	public JButton jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros;
	protected JButton jButtonMostrarOcultarTablaToolBarBeneficiariosPagosCobros;
	protected JButton jButtonCerrarToolBarBeneficiariosPagosCobros;
	
	protected JButton jButtonRecargarInformacionToolBarBeneficiariosPagosCobros;
	protected JButton jButtonProcesarInformacionToolBarBeneficiariosPagosCobros;
	protected JButton jButtonAnterioresToolBarBeneficiariosPagosCobros;
	protected JButton jButtonSiguientesToolBarBeneficiariosPagosCobros;
	protected JButton jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros;
	protected JButton jButtonAbrirOrderByToolBarBeneficiariosPagosCobros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDuplicarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemNuevoRelacionesBeneficiariosPagosCobros;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemCopiarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemVerFormBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemCerrarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDetalleCerrarBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros;
	
	protected JMenuItem jMenuItemRecargarInformacionBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemProcesarInformacionBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemAnterioresBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemSiguientesBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemAbrirOrderByBeneficiariosPagosCobros;
	protected JMenuItem jMenuItemMostrarOcultarBeneficiariosPagosCobros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBeneficiariosPagosCobros;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBeneficiariosPagosCobros;
	protected JCheckBox jCheckBoxSeleccionadosBeneficiariosPagosCobros;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros;
	protected JCheckBox jCheckBoxConGraficoReporteBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBeneficiariosPagosCobros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBeneficiariosPagosCobros;
	protected JTextField jTextFieldValorCampoGeneralBeneficiariosPagosCobros;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBeneficiariosPagosCobros;
	//public JList<Reporte> jListColumnasSelectReporteBeneficiariosPagosCobros;
	//public JScrollPane jScrollColumnasSelectReporteBeneficiariosPagosCobros;
	
	//public JLabel jLabelRelacionesSelectReporteBeneficiariosPagosCobros;
	//public JList<Reporte> jListRelacionesSelectReporteBeneficiariosPagosCobros;
	//public JScrollPane jScrollRelacionesSelectReporteBeneficiariosPagosCobros;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBeneficiariosPagosCobros;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros;
	//public JLabel jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros;
	
		
	//public JLabel jLabelArchivoImportacionBeneficiariosPagosCobros;	
	//public JLabel jLabelPathArchivoImportacionBeneficiariosPagosCobros;
	//protected JTextField jTextFieldPathArchivoImportacionBeneficiariosPagosCobros;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros;
	
	//public JLabel jLabelColumnaCategoriaValorBeneficiariosPagosCobros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros;
	
	//public JLabel jLabelColumnasValoresGraficoBeneficiariosPagosCobros;
	//public JList<Reporte> jListColumnasValoresGraficoBeneficiariosPagosCobros;
	//public JScrollPane jScrollColumnasValoresGraficoBeneficiariosPagosCobros;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBeneficiariosPagosCobros;
	public JPanel jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JButton jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	
	public JPanel jPanelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JLabel jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JButton jButtonid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JLabel jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JButton jButtonid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JLabel jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;

	public JDateChooser jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JButton jButtonfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JLabel jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;

	public JDateChooser jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros;
	public JButton jButtonfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BeneficiariosPagosCobrosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BeneficiariosPagosCobrosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBeneficiariosPagosCobros)	{
		this.jButtonRecargarInformacionBeneficiariosPagosCobros = jButtonRecargarInformacionBeneficiariosPagosCobros;
	}
	
	public JButton getjButtonProcesarInformacionBeneficiariosPagosCobros() {
		return this.jButtonProcesarInformacionBeneficiariosPagosCobros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBeneficiariosPagosCobros)	{
		this.jButtonProcesarInformacionBeneficiariosPagosCobros = jButtonProcesarInformacionBeneficiariosPagosCobros;
	}
	
	
	public JButton getjButtonRecargarInformacionBeneficiariosPagosCobros() {
		return this.jButtonRecargarInformacionBeneficiariosPagosCobros;
	}
	
	
	public List<BeneficiariosPagosCobros> getbeneficiariospagoscobross() {
		return this.beneficiariospagoscobross;
	}

	public void setbeneficiariospagoscobross(List<BeneficiariosPagosCobros> beneficiariospagoscobross) {
		this.beneficiariospagoscobross = beneficiariospagoscobross;
	}
	
	public List<BeneficiariosPagosCobros> getbeneficiariospagoscobrossAux() {
		return this.beneficiariospagoscobrossAux;
	}

	public void setbeneficiariospagoscobrossAux(List<BeneficiariosPagosCobros> beneficiariospagoscobrossAux) {
		this.beneficiariospagoscobrossAux = beneficiariospagoscobrossAux;
	}
	
	public List<BeneficiariosPagosCobros> getbeneficiariospagoscobrossEliminados() {
		return this.beneficiariospagoscobrossEliminados;
	}

	public void setBeneficiariosPagosCobrossEliminados(List<BeneficiariosPagosCobros> beneficiariospagoscobrossEliminados) {
		this.beneficiariospagoscobrossEliminados = beneficiariospagoscobrossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBeneficiariosPagosCobros() {
		return jComboBoxTiposSeleccionarBeneficiariosPagosCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposSeleccionarBeneficiariosPagosCobros) {
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros = jComboBoxTiposSeleccionarBeneficiariosPagosCobros;
	}
	
	public void setBorderResaltarTiposSeleccionarBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBeneficiariosPagosCobros() {
		return jTextFieldValorCampoGeneralBeneficiariosPagosCobros;
	}

	public void setjTextFieldValorCampoGeneralBeneficiariosPagosCobros(
			JTextField jTextFieldValorCampoGeneralBeneficiariosPagosCobros) {
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros = jTextFieldValorCampoGeneralBeneficiariosPagosCobros;
	}

	public void setBorderResaltarValorCampoGeneralBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBeneficiariosPagosCobros() {
		return this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros;
	}

	public void setjCheckBoxSeleccionarTodosBeneficiariosPagosCobros(
			JCheckBox jCheckBoxSeleccionarTodosBeneficiariosPagosCobros) {
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros = jCheckBoxSeleccionarTodosBeneficiariosPagosCobros;
	}

	public void setBorderResaltarSeleccionarTodosBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBeneficiariosPagosCobros() {
		return this.jCheckBoxSeleccionadosBeneficiariosPagosCobros;
	}

	public void setjCheckBoxSeleccionadosBeneficiariosPagosCobros(
			JCheckBox jCheckBoxSeleccionadosBeneficiariosPagosCobros) {
		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros = jCheckBoxSeleccionadosBeneficiariosPagosCobros;
	}
	
	public void setBorderResaltarSeleccionadosBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposArchivosReportesBeneficiariosPagosCobros) {
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros = jComboBoxTiposArchivosReportesBeneficiariosPagosCobros;
	}

	public void setBorderResaltarTiposArchivosReportesBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposReportesBeneficiariosPagosCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposReportesBeneficiariosPagosCobros) {
		this.jComboBoxTiposReportesBeneficiariosPagosCobros = jComboBoxTiposReportesBeneficiariosPagosCobros;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBeneficiariosPagosCobros() {
	//	return jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBeneficiariosPagosCobros(
	//		JComboBox jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros) {
	//	this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros = jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros() {
	//	return jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros = jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros;
	//}
	
	public void setBorderResaltarTiposReportesBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposGraficosReportesBeneficiariosPagosCobros) {
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros = jComboBoxTiposGraficosReportesBeneficiariosPagosCobros;
	}
	
	public void setBorderResaltarTiposGraficosReportesBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBeneficiariosPagosCobros() {
		return this.jComboBoxTiposPaginacionBeneficiariosPagosCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposPaginacionBeneficiariosPagosCobros) {
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros = jComboBoxTiposPaginacionBeneficiariosPagosCobros;
	}
	
	public void setBorderResaltarTiposPaginacionBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposRelacionesBeneficiariosPagosCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBeneficiariosPagosCobros() {
		return this.jComboBoxTiposAccionesBeneficiariosPagosCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposRelacionesBeneficiariosPagosCobros) {
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros = jComboBoxTiposRelacionesBeneficiariosPagosCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBeneficiariosPagosCobros(
			JComboBox jComboBoxTiposAccionesBeneficiariosPagosCobros) {
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros = jComboBoxTiposAccionesBeneficiariosPagosCobros;
	}
	
	public void setBorderResaltarTiposRelacionesBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBeneficiariosPagosCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBeneficiariosPagosCobros() {
	//	return jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros;
	//}

	//public void setjCheckBoxConGraficoDinamicoBeneficiariosPagosCobros(
	//		JCheckBox jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros) {
	//	this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros = jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBeneficiariosPagosCobros() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBeneficiariosPagosCobros.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros .setBorder(borderResaltar);		
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
		this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
		
		this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.beneficiariospagoscobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BeneficiariosPagosCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BeneficiariosPagosCobrosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Beneficiarios Pagos Cobros MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
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
		
		BeneficiariosPagosCobrosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BeneficiariosPagosCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBeneficiariosPagosCobros= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"nuevo","nuevo","Nuevo"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"duplicar","duplicar","Duplicar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"copiar","copiar","Copiar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"ver_form","ver_form","Ver"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"recargar","recargar","Buscar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBeneficiariosPagosCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,
							"cerrar","cerrar","Salir"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros;
			
				this.jButtonProcesarInformacionToolBarBeneficiariosPagosCobros=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBeneficiariosPagosCobros;
				
		//protected JButton jButtonModificarToolBarBeneficiariosPagosCobros;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBeneficiariosPagosCobros=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBeneficiariosPagosCobros=new JMenuMe("General");
		this.jmenuArchivoBeneficiariosPagosCobros=new JMenuMe("Archivo");
		this.jmenuAccionesBeneficiariosPagosCobros=new JMenuMe("Acciones");
		this.jmenuDatosBeneficiariosPagosCobros=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBeneficiariosPagosCobros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBeneficiariosPagosCobros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBeneficiariosPagosCobros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBeneficiariosPagosCobros= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBeneficiariosPagosCobros.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBeneficiariosPagosCobros,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBeneficiariosPagosCobros= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBeneficiariosPagosCobros.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBeneficiariosPagosCobros,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBeneficiariosPagosCobros= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBeneficiariosPagosCobros.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBeneficiariosPagosCobros,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBeneficiariosPagosCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBeneficiariosPagosCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBeneficiariosPagosCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBeneficiariosPagosCobros= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBeneficiariosPagosCobros.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBeneficiariosPagosCobros,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBeneficiariosPagosCobros= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBeneficiariosPagosCobros.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBeneficiariosPagosCobros,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBeneficiariosPagosCobros= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBeneficiariosPagosCobros.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBeneficiariosPagosCobros,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBeneficiariosPagosCobros= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBeneficiariosPagosCobros.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBeneficiariosPagosCobros,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBeneficiariosPagosCobros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBeneficiariosPagosCobros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBeneficiariosPagosCobros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBeneficiariosPagosCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBeneficiariosPagosCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBeneficiariosPagosCobros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBeneficiariosPagosCobros.add(this.jMenuItemCerrarBeneficiariosPagosCobros);
			
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemNuevoBeneficiariosPagosCobros);
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros);
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros);
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros);		
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemDuplicarBeneficiariosPagosCobros);		
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemCopiarBeneficiariosPagosCobros);		
			this.jmenuAccionesBeneficiariosPagosCobros.add(this.jMenuItemVerFormBeneficiariosPagosCobros);		
			
			this.jmenuDatosBeneficiariosPagosCobros.add(this.jMenuItemRecargarInformacionBeneficiariosPagosCobros);				
			this.jmenuDatosBeneficiariosPagosCobros.add(this.jMenuItemAnterioresBeneficiariosPagosCobros);				
			this.jmenuDatosBeneficiariosPagosCobros.add(this.jMenuItemSiguientesBeneficiariosPagosCobros);				
			this.jmenuDatosBeneficiariosPagosCobros.add(this.jMenuItemAbrirOrderByBeneficiariosPagosCobros);				
			this.jmenuDatosBeneficiariosPagosCobros.add(this.jMenuItemMostrarOcultarBeneficiariosPagosCobros);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBeneficiariosPagosCobros.add(this.jMenuItemGuardarCambiosBeneficiariosPagosCobros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBeneficiariosPagosCobros.add(this.jmenuArchivoBeneficiariosPagosCobros);		
			this.jmenuBarBeneficiariosPagosCobros.add(this.jmenuAccionesBeneficiariosPagosCobros);		
			this.jmenuBarBeneficiariosPagosCobros.add(this.jmenuDatosBeneficiariosPagosCobros);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBeneficiariosPagosCobros);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBeneficiariosPagosCobros() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JButtonMe();
		this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,"buscar_button","Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros = new JLabelMe();
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText("Tipo Movimiento Base :");
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Tipo Movimiento Base");
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros = new JLabelMe();
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JDateChooser();
		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setDate(new Date());
		jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros = new JLabelMe();
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new JDateChooser();
		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setDate(new Date());
		jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasBeneficiariosPagosCobros=new JTabbedPane();


		this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBeneficiariosPagosCobros = new BeneficiariosPagosCobrosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Beneficiarios Pagos Cobros DATOS");
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros = new BeneficiariosPagosCobrosDetalleFormJInternalFrame(jDesktopPane,this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones(),this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros = null;//new BeneficiariosPagosCobrosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBeneficiariosPagosCobros= new GridBagLayout();
		
		
		this.jTableDatosBeneficiariosPagosCobros = new JTableMe();      
		
		String sToolTipBeneficiariosPagosCobros="";
		sToolTipBeneficiariosPagosCobros=BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBeneficiariosPagosCobros+="(Tesoreria.BeneficiariosPagosCobros)";
		}
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			sToolTipBeneficiariosPagosCobros+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBeneficiariosPagosCobros.setToolTipText(sToolTipBeneficiariosPagosCobros);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBeneficiariosPagosCobros);
		this.jTableDatosBeneficiariosPagosCobros.setAutoCreateRowSorter(true);
		this.jTableDatosBeneficiariosPagosCobros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBeneficiariosPagosCobros.setRowSelectionAllowed(true);
		this.jTableDatosBeneficiariosPagosCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBeneficiariosPagosCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonDuplicarBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonCopiarBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonVerFormBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonCerrarBeneficiariosPagosCobros = new JButtonMe();
		
		this.jScrollPanelDatosBeneficiariosPagosCobros = new JScrollPane();   
        this.jScrollPanelDatosGeneralBeneficiariosPagosCobros = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Beneficiarios Pagos Cobros";
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses" + this.sPath));
		} else {
			this.jScrollPanelDatosBeneficiariosPagosCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBeneficiariosPagosCobros.setToolTipText("Acciones");
        this.jPanelAccionesBeneficiariosPagosCobros.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros=new ReporteDinamicoJInternalFrame(BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBeneficiariosPagosCobros();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBeneficiariosPagosCobros=new ImportacionJInternalFrame(BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBeneficiariosPagosCobros();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBeneficiariosPagosCobros = new JButtonMe();
		
		this.jButtonAbrirOrderByBeneficiariosPagosCobros.setText("Orden");
		this.jButtonAbrirOrderByBeneficiariosPagosCobros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBeneficiariosPagosCobros,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBeneficiariosPagosCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBeneficiariosPagosCobros,false,this);
			
			//this.cargarOrderByBeneficiariosPagosCobros(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBeneficiariosPagosCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBeneficiariosPagosCobros,true,this);
			
			//this.cargarOrderByBeneficiariosPagosCobros(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBeneficiariosPagosCobros.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosBeneficiariosPagosCobros.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosBeneficiariosPagosCobros.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosBeneficiariosPagosCobros.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBeneficiariosPagosCobros.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBeneficiariosPagosCobros.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBeneficiariosPagosCobros.setText("Nuevo");
		this.jButtonDuplicarBeneficiariosPagosCobros.setText("Duplicar");
		this.jButtonCopiarBeneficiariosPagosCobros.setText("Copiar");
		this.jButtonVerFormBeneficiariosPagosCobros.setText("Ver");
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setText("Guardar");
		this.jButtonCerrarBeneficiariosPagosCobros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBeneficiariosPagosCobros,"nuevo_button","Nuevo",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBeneficiariosPagosCobros,"duplicar_button","Duplicar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBeneficiariosPagosCobros,"copiar_button","Copiar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBeneficiariosPagosCobros,"ver_form","Ver",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBeneficiariosPagosCobros,"nuevorelaciones_button","Nuevo Rel",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros,"guardarcambiostabla_button","Guardar",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBeneficiariosPagosCobros,"cerrar_button","Salir",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBeneficiariosPagosCobros.setToolTipText("Nuevo"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBeneficiariosPagosCobros.setToolTipText("Duplicar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBeneficiariosPagosCobros.setToolTipText("Copiar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBeneficiariosPagosCobros.setToolTipText("Ver"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.setToolTipText("Nuevo Rel"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setToolTipText("Guardar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBeneficiariosPagosCobros.setToolTipText("Salir"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBeneficiariosPagosCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBeneficiariosPagosCobros"));
		
		//DUPLICAR
		sMapKey = "DuplicarBeneficiariosPagosCobros";
		inputMap = this.jButtonDuplicarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBeneficiariosPagosCobros"));
		
		//COPIAR
		sMapKey = "CopiarBeneficiariosPagosCobros";
		inputMap = this.jButtonCopiarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBeneficiariosPagosCobros"));
		
		//VEr FORM
		sMapKey = "VerFormBeneficiariosPagosCobros";
		inputMap = this.jButtonVerFormBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBeneficiariosPagosCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBeneficiariosPagosCobros"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoRelacionesBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBeneficiariosPagosCobros"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBeneficiariosPagosCobros";
		inputMap = this.jButtonModificarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBeneficiariosPagosCobros"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBeneficiariosPagosCobros";
		inputMap = this.jButtonCerrarBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBeneficiariosPagosCobros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBeneficiariosPagosCobros";
		inputMap = this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBeneficiariosPagosCobros"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBeneficiariosPagosCobros.setName("jPanelParametrosReportesBeneficiariosPagosCobros"); 
		
		this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros.setName("jPanelParametrosReportesAccionesBeneficiariosPagosCobros"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setText("Buscar");
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setToolTipText("Buscar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBeneficiariosPagosCobros,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setVisible(false);
		
		
		this.jButtonProcesarInformacionBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setText("Procesar");
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setToolTipText("Procesar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setVisible(false);
			
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setText("TIPO");       
		this.jComboBoxTiposReportesBeneficiariosPagosCobros.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setText("Paginacion");
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.setText("Accion");
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setText("Accion");
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setText("Accion");
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBeneficiariosPagosCobros = new JLabelMe();
		
		this.jLabelAccionesBeneficiariosPagosCobros.setText("Acciones");		
		this.jLabelAccionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setText("Graf.");
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBeneficiariosPagosCobros = new JButtonMe();
		//this.jButtonAnterioresBeneficiariosPagosCobros.setText("<<");
        this.jButtonAnterioresBeneficiariosPagosCobros.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBeneficiariosPagosCobros,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBeneficiariosPagosCobros = new JButtonMe();
		//this.jButtonSiguientesBeneficiariosPagosCobros.setText(">>");
        this.jButtonSiguientesBeneficiariosPagosCobros.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBeneficiariosPagosCobros,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.setText("Nue");
        this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros,"nuevoguardarcambios_button","Nue",this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBeneficiariosPagosCobros"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBeneficiariosPagosCobros";
		inputMap = this.jButtonRecargarInformacionBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBeneficiariosPagosCobros"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBeneficiariosPagosCobros";
		inputMap = this.jButtonSiguientesBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBeneficiariosPagosCobros"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBeneficiariosPagosCobros";
		inputMap = this.jButtonAnterioresBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBeneficiariosPagosCobros"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBeneficiariosPagosCobros();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(this.getWidth(),BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(this.getWidth(),BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(this.getWidth(),BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BeneficiariosPagosCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBeneficiariosPagosCobros = new GridBagLayout();

			this.jPanelPaginacionBeneficiariosPagosCobros.setLayout(gridaBagLayoutPaginacionBeneficiariosPagosCobros);						
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonAnterioresBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					
						
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
			
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
						
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonSiguientesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonNuevoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
						
			
			
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
				this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
				this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			}
			
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonDuplicarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonCopiarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonVerFormBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBeneficiariosPagosCobros.add(this.jButtonCerrarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBeneficiariosPagosCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBeneficiariosPagosCobros = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BeneficiariosPagosCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BeneficiariosPagosCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BeneficiariosPagosCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BeneficiariosPagosCobros = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.setLayout(gridaBagParametrosReportesBeneficiariosPagosCobros);
			this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros.setLayout(gridaBagParametrosReportesAccionesBeneficiariosPagosCobros);
			
			
			this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros.setLayout(gridaBagParametrosAuxiliar1BeneficiariosPagosCobros);
			this.jPanelParametrosAuxiliar2BeneficiariosPagosCobros.setLayout(gridaBagParametrosAuxiliar2BeneficiariosPagosCobros);
			this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros.setLayout(gridaBagParametrosAuxiliar3BeneficiariosPagosCobros);
			this.jPanelParametrosAuxiliar4BeneficiariosPagosCobros.setLayout(gridaBagParametrosAuxiliar4BeneficiariosPagosCobros);
			//this.jPanelParametrosAuxiliar5BeneficiariosPagosCobros.setLayout(gridaBagParametrosAuxiliar2BeneficiariosPagosCobros);			
			
			
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jButtonRecargarInformacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros.add(this.jComboBoxTiposPaginacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros.add(this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros.add(this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jPanelParametrosAuxiliar1BeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BeneficiariosPagosCobros.add(this.jComboBoxTiposReportesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);																		
			
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BeneficiariosPagosCobros.add(this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jPanelParametrosAuxiliar4BeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jComboBoxTiposReportesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jCheckBoxGenerarReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jPanelParametrosAuxiliar2BeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jLabelAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
				this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jButtonAbrirOrderByBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
			
			
			/*
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros.add(this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);															
				
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros.add(this.jCheckBoxSeleccionadosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);															
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros.add(this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jPanelParametrosAuxiliar3BeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBeneficiariosPagosCobros.add(this.jComboBoxTiposAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBeneficiariosPagosCobros = new GridBagLayout();

			this.jScrollPanelDatosBeneficiariosPagosCobros.setLayout(gridaBagLayoutDatosBeneficiariosPagosCobros);
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
			
			this.jScrollPanelDatosBeneficiariosPagosCobros.add(this.jTableDatosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBeneficiariosPagosCobros.setViewportView(this.jTableDatosBeneficiariosPagosCobros);
		this.jTableDatosBeneficiariosPagosCobros.setFillsViewportHeight(true);
		this.jTableDatosBeneficiariosPagosCobros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBeneficiariosPagosCobros= new GridBagLayout();
		this.jPanelAccionesBeneficiariosPagosCobros.setLayout(gridaBagLayoutAccionesBeneficiariosPagosCobros);
		
		
		/*	
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
			
		this.jPanelAccionesBeneficiariosPagosCobros.add(this.jButtonNuevoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros= new GridBagLayout();
		gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setLayout(gridaBagLayoutBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jLabelid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 0;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);


		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jLabelid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 1;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);


		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 2;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jLabelfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 2;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);


		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 3;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jLabelfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 3;
		gridBagConstraintsBeneficiariosPagosCobros.gridx = 1;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBeneficiariosPagosCobros.gridy = 4;
		gridBagConstraintsBeneficiariosPagosCobros.gridx =1;
		jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.add(jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros, gridBagConstraintsBeneficiariosPagosCobros);

		jTabbedPaneBusquedasBeneficiariosPagosCobros.addTab("1.-Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
		jTabbedPaneBusquedasBeneficiariosPagosCobros.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBeneficiariosPagosCobros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBeneficiariosPagosCobros);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();						
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;		
			//this.gridBagConstraintsBeneficiariosPagosCobros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;		
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;		
			this.gridBagConstraintsBeneficiariosPagosCobros.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBeneficiariosPagosCobros.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);								
		
		
		/*
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/		
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =0;
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBeneficiariosPagosCobros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
				
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBeneficiariosPagosCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBeneficiariosPagosCobros = new GridBagLayout();
			this.jPanelBusquedasParametrosBeneficiariosPagosCobros.setLayout(gridaBagLayoutBusquedasParametrosBeneficiariosPagosCobros);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
			
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBeneficiariosPagosCobros;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBeneficiariosPagosCobros() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBeneficiariosPagosCobros = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setName("jPanelReporteDinamicoBeneficiariosPagosCobros"); 
		
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.setLayout(gridaBagLayoutReporteDinamicoBeneficiariosPagosCobros);
		
		
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBeneficiariosPagosCobros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setResizable(true);
	    this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setClosable(true);
	    this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelColumnasSelectReporteBeneficiariosPagosCobros.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelColumnasSelectReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBeneficiariosPagosCobros = new JList<Reporte>();
		this.jListColumnasSelectReporteBeneficiariosPagosCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBeneficiariosPagosCobros=new JScrollPane(this.jListColumnasSelectReporteBeneficiariosPagosCobros);
			
			this.jScrollColumnasSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jListColumnasSelectReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jScrollColumnasSelectReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelRelacionesSelectReporteBeneficiariosPagosCobros.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBeneficiariosPagosCobros = new JList<Reporte>();
		this.jListRelacionesSelectReporteBeneficiariosPagosCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBeneficiariosPagosCobros=new JScrollPane(this.jListRelacionesSelectReporteBeneficiariosPagosCobros);
			
			this.jScrollRelacionesSelectReporteBeneficiariosPagosCobros.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBeneficiariosPagosCobros.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBeneficiariosPagosCobros.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros = new JComboBoxMe();
		this.jListColumnasValoresGraficoBeneficiariosPagosCobros = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelConGraficoDinamicoBeneficiariosPagosCobros.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelConGraficoDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jCheckBoxConGraficoDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelColumnaCategoriaGraficoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelColumnaCategoriaValorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jComboBoxColumnaCategoriaValorBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelColumnasValoresGraficoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBeneficiariosPagosCobros = new JList<Reporte>();
		this.jListColumnasValoresGraficoBeneficiariosPagosCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBeneficiariosPagosCobros.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros=new JScrollPane(this.jListColumnasValoresGraficoBeneficiariosPagosCobros);
			
			this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jListColumnasSelectReporteBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jScrollColumnasValoresGraficoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelTiposGraficosReportesDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBeneficiariosPagosCobros.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jComboBoxTiposGraficosReportesDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelGenerarExcelReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros.setToolTipText("Generar EXCEL"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		//this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jComboBoxTiposReportesDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jLabelTiposArchivoReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jComboBoxTiposArchivosReportesDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros.setToolTipText("Generar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros.setToolTipText("Cancelar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBeneficiariosPagosCobros.add(this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBeneficiariosPagosCobros = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros= new JScrollPane(jPanelReporteDinamicoBeneficiariosPagosCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBeneficiariosPagosCobros);
		this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getContentPane().add(this.jScrollPanelReporteDinamicoBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBeneficiariosPagosCobros() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBeneficiariosPagosCobros = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBeneficiariosPagosCobros.setName("jPanelImportacionBeneficiariosPagosCobros"); 
		
		this.jPanelImportacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBeneficiariosPagosCobros.setLayout(gridaBagLayoutImportacionBeneficiariosPagosCobros);
		
		
		this.jInternalFrameImportacionBeneficiariosPagosCobros= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBeneficiariosPagosCobros= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBeneficiariosPagosCobros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBeneficiariosPagosCobros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setResizable(true);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setClosable(true);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setResizable(true);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setClosable(true);
	    this.jInternalFrameImportacionBeneficiariosPagosCobros.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelArchivoImportacionBeneficiariosPagosCobros.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jLabelArchivoImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBeneficiariosPagosCobros = new JFileChooser();		
		this.jFileChooserImportacionBeneficiariosPagosCobros.setToolTipText("ESCOGER ARCHIVO"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonAbrirImportacionBeneficiariosPagosCobros.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBeneficiariosPagosCobros,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBeneficiariosPagosCobros.setToolTipText("Generar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jButtonAbrirImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBeneficiariosPagosCobros = new JLabelMe();

		this.jLabelPathArchivoImportacionBeneficiariosPagosCobros.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;		
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jLabelPathArchivoImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBeneficiariosPagosCobros=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBeneficiariosPagosCobros.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBeneficiariosPagosCobros.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBeneficiariosPagosCobros.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jTextFieldPathArchivoImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonGenerarImportacionBeneficiariosPagosCobros.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBeneficiariosPagosCobros,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBeneficiariosPagosCobros.setToolTipText("Generar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jButtonGenerarImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBeneficiariosPagosCobros = new JButtonMe();
		this.jButtonCerrarImportacionBeneficiariosPagosCobros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBeneficiariosPagosCobros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBeneficiariosPagosCobros.setToolTipText("Cancelar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBeneficiariosPagosCobros.add(this.jButtonCerrarImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBeneficiariosPagosCobros = new GridBagLayout();
		
		this.jScrollPanelImportacionBeneficiariosPagosCobros= new JScrollPane(jPanelImportacionBeneficiariosPagosCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
		this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iPosYImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXImportacion;
		this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBeneficiariosPagosCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBeneficiariosPagosCobros.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBeneficiariosPagosCobros);
		this.jInternalFrameImportacionBeneficiariosPagosCobros.getContentPane().add(this.jScrollPanelImportacionBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBeneficiariosPagosCobros(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBeneficiariosPagosCobros = new JButtonMe();
			this.jButtonAbrirOrderByBeneficiariosPagosCobros.setText("Orden");
			this.jButtonAbrirOrderByBeneficiariosPagosCobros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBeneficiariosPagosCobros,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBeneficiariosPagosCobros";
			inputMap = this.jButtonAbrirOrderByBeneficiariosPagosCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBeneficiariosPagosCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBeneficiariosPagosCobros"));
		
		
			GridBagLayout gridaBagLayoutOrderByBeneficiariosPagosCobros = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBeneficiariosPagosCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBeneficiariosPagosCobros.setName("jPanelOrderByBeneficiariosPagosCobros"); 
			
			this.jPanelOrderByBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBeneficiariosPagosCobros.setLayout(gridaBagLayoutOrderByBeneficiariosPagosCobros);
			
			
			this.jTableDatosBeneficiariosPagosCobrosOrderBy = new JTableMe();        
			this.jTableDatosBeneficiariosPagosCobrosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBeneficiariosPagosCobrosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBeneficiariosPagosCobrosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBeneficiariosPagosCobrosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBeneficiariosPagosCobrosOrderBy.setViewportView(this.jTableDatosBeneficiariosPagosCobrosOrderBy);
			this.jTableDatosBeneficiariosPagosCobrosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBeneficiariosPagosCobrosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBeneficiariosPagosCobros= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBeneficiariosPagosCobros= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBeneficiariosPagosCobros = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBeneficiariosPagosCobros= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setTitle("Orden");
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setResizable(true);
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setClosable(true);
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBeneficiariosPagosCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Beneficiarios Pagos Cobroses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXOrderBy;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBeneficiariosPagosCobros.ipady =150;
				
			this.jPanelOrderByBeneficiariosPagosCobros.add(jScrollPanelDatosBeneficiariosPagosCobrosOrderBy, this.gridBagConstraintsBeneficiariosPagosCobros);//this.jTableDatosBeneficiariosPagosCobrosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBeneficiariosPagosCobros = new JButtonMe();
			this.jButtonCerrarOrderByBeneficiariosPagosCobros.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBeneficiariosPagosCobros,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBeneficiariosPagosCobros.setToolTipText("Cancelar"+" "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBeneficiariosPagosCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBeneficiariosPagosCobros.add(this.jButtonCerrarOrderByBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBeneficiariosPagosCobros = new GridBagLayout();
			
			this.jScrollPanelOrderByBeneficiariosPagosCobros= new JScrollPane(jPanelOrderByBeneficiariosPagosCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBeneficiariosPagosCobros = new GridBagConstraints();
			this.gridBagConstraintsBeneficiariosPagosCobros.gridy =iPosYOrderBy;
			this.gridBagConstraintsBeneficiariosPagosCobros.gridx =iPosXOrderBy;
			this.gridBagConstraintsBeneficiariosPagosCobros.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBeneficiariosPagosCobros);
			
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getContentPane().add(this.jScrollPanelOrderByBeneficiariosPagosCobros, this.gridBagConstraintsBeneficiariosPagosCobros);			
		
		} else {
			this.jButtonAbrirOrderByBeneficiariosPagosCobros = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosBeneficiariosPagosCobros.getRowHeight();//BeneficiariosPagosCobrosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.isSelected()) {
					iHeightTable=BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBeneficiariosPagosCobros.isSelected()) {
					iHeightTable=BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BeneficiariosPagosCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBeneficiariosPagosCobros!=null && this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy()!=null) {
			//if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBeneficiariosPagosCobros.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBeneficiariosPagosCobros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBeneficiariosPagosCobros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBeneficiariosPagosCobros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=beneficiariospagoscobross.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BeneficiariosPagosCobros> TraerBeneficiariosPagosCobrosBeans(List<BeneficiariosPagosCobros> beneficiariospagoscobross,ArrayList<Classe> classes)throws Exception {
		try {
			for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobross) {
					
				if(!(BeneficiariosPagosCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BeneficiariosPagosCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					beneficiariospagoscobros.setsDetalleGeneralEntityReporte(BeneficiariosPagosCobrosConstantesFunciones.getBeneficiariosPagosCobrosDescripcion(beneficiariospagoscobros));
										
						
					
						
					
				} else  {
							
					//beneficiariospagoscobros.setsDetalleGeneralEntityReporte(beneficiariospagoscobros.getsDetalleGeneralEntityReporte());
										
				}
				
				//beneficiariospagoscobrosbeans.add(beneficiariospagoscobrosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return beneficiariospagoscobross;
    }
	//PARA REPORTES FIN
}
