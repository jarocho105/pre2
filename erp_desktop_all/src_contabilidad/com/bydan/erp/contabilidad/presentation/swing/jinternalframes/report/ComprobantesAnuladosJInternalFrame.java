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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.contabilidad.util.report.ComprobantesAnuladosConstantesFunciones;

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
public class ComprobantesAnuladosJInternalFrame extends ComprobantesAnuladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComprobantesAnulados;
	
	protected JMenuBar jmenuBarComprobantesAnulados;
	
	protected JMenu jmenuComprobantesAnulados;
	protected JMenu jmenuDatosComprobantesAnulados;
	protected JMenu jmenuArchivoComprobantesAnulados;
	protected JMenu jmenuAccionesComprobantesAnulados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobantesAnulados;	
	protected GridBagConstraints gridBagConstraintsComprobantesAnulados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComprobantesAnuladosDetalleFormJInternalFrame jInternalFrameDetalleFormComprobantesAnulados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComprobantesAnulados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComprobantesAnulados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ComprobantesAnuladosSessionBean comprobantesanuladosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComprobantesAnulados> comprobantesanuladoss;		
	public List<ComprobantesAnulados> comprobantesanuladossEliminados;	
	public List<ComprobantesAnulados> comprobantesanuladossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComprobantesAnulados;		
	protected JButton jButtonAbrirOrderByComprobantesAnulados;
	
	
	//protected JPanel jPanelOrderByComprobantesAnulados;
	//public JScrollPane jScrollPanelOrderByComprobantesAnulados;	
	//protected JButton jButtonCerrarOrderByComprobantesAnulados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComprobantesAnuladosLogic comprobantesanuladosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComprobantesAnulados;
	public JScrollPane jScrollPanelDatosEdicionComprobantesAnulados;
	public JScrollPane jScrollPanelDatosGeneralComprobantesAnulados;
    
	
	
	//public JScrollPane jScrollPanelDatosComprobantesAnuladosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComprobantesAnulados;
	//public JScrollPane jScrollPanelImportacionComprobantesAnulados;
	
	
	
	protected JPanel jPanelAccionesComprobantesAnulados;
	
    protected JPanel jPanelPaginacionComprobantesAnulados;
    protected JPanel jPanelParametrosReportesComprobantesAnulados;
	protected JPanel jPanelParametrosReportesAccionesComprobantesAnulados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComprobantesAnulados;
	protected JPanel jPanelParametrosAuxiliar2ComprobantesAnulados;
	protected JPanel jPanelParametrosAuxiliar3ComprobantesAnulados;
	protected JPanel jPanelParametrosAuxiliar4ComprobantesAnulados;
	//protected JPanel jPanelParametrosAuxiliar5ComprobantesAnulados;
	
	
	
	//protected JPanel jPanelReporteDinamicoComprobantesAnulados;
	//protected JPanel jPanelImportacionComprobantesAnulados;
	
	
	public JTable jTableDatosComprobantesAnulados;
	
	
	
	//public JTable jTableDatosComprobantesAnuladosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComprobantesAnulados;
	protected JButton jButtonDuplicarComprobantesAnulados;
	protected JButton jButtonCopiarComprobantesAnulados;
	protected JButton jButtonVerFormComprobantesAnulados;
	protected JButton jButtonNuevoRelacionesComprobantesAnulados;
	protected JButton jButtonModificarComprobantesAnulados;
	
    protected JButton jButtonGuardarCambiosTablaComprobantesAnulados;
	protected JButton jButtonCerrarComprobantesAnulados;
	
	
	protected JButton jButtonRecargarInformacionComprobantesAnulados;
	protected JButton jButtonProcesarInformacionComprobantesAnulados;
	
	
	protected JButton jButtonAnterioresComprobantesAnulados;
	protected JButton jButtonSiguientesComprobantesAnulados;
	protected JButton jButtonNuevoGuardarCambiosComprobantesAnulados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComprobantesAnulados;
	//protected JButton jButtonCerrarReporteDinamicoComprobantesAnulados;
	//protected JButton jButtonGenerarExcelReporteDinamicoComprobantesAnulados;	
	
	
	
	//protected JButton jButtonAbrirImportacionComprobantesAnulados;
	//protected JButton jButtonGenerarImportacionComprobantesAnulados;
	//protected JButton jButtonCerrarImportacionComprobantesAnulados;
	//protected JFileChooser jFileChooserImportacionComprobantesAnulados;
	//protected File fileImportacionComprobantesAnulados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobantesAnulados;
	protected JButton jButtonDuplicarToolBarComprobantesAnulados;
	protected JButton jButtonNuevoRelacionesToolBarComprobantesAnulados;
	
	
	public JButton jButtonGuardarCambiosToolBarComprobantesAnulados;
	protected JButton jButtonCopiarToolBarComprobantesAnulados;
	protected JButton jButtonVerFormToolBarComprobantesAnulados;
	public JButton jButtonGuardarCambiosTablaToolBarComprobantesAnulados;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobantesAnulados;
	protected JButton jButtonCerrarToolBarComprobantesAnulados;
	
	protected JButton jButtonRecargarInformacionToolBarComprobantesAnulados;
	protected JButton jButtonProcesarInformacionToolBarComprobantesAnulados;
	protected JButton jButtonAnterioresToolBarComprobantesAnulados;
	protected JButton jButtonSiguientesToolBarComprobantesAnulados;
	protected JButton jButtonNuevoGuardarCambiosToolBarComprobantesAnulados;
	protected JButton jButtonAbrirOrderByToolBarComprobantesAnulados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobantesAnulados;
	protected JMenuItem jMenuItemDuplicarComprobantesAnulados;
	protected JMenuItem jMenuItemNuevoRelacionesComprobantesAnulados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComprobantesAnulados;
	protected JMenuItem jMenuItemCopiarComprobantesAnulados;
	protected JMenuItem jMenuItemVerFormComprobantesAnulados;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobantesAnulados;
	protected JMenuItem jMenuItemCerrarComprobantesAnulados;
	protected JMenuItem jMenuItemDetalleCerrarComprobantesAnulados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComprobantesAnulados;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobantesAnulados;
	
	protected JMenuItem jMenuItemRecargarInformacionComprobantesAnulados;
	protected JMenuItem jMenuItemProcesarInformacionComprobantesAnulados;
	protected JMenuItem jMenuItemAnterioresComprobantesAnulados;
	protected JMenuItem jMenuItemSiguientesComprobantesAnulados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobantesAnulados;
	protected JMenuItem jMenuItemAbrirOrderByComprobantesAnulados;
	protected JMenuItem jMenuItemMostrarOcultarComprobantesAnulados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobantesAnulados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComprobantesAnulados;
	protected JCheckBox jCheckBoxSeleccionadosComprobantesAnulados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComprobantesAnulados;
	protected JCheckBox jCheckBoxConGraficoReporteComprobantesAnulados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComprobantesAnulados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComprobantesAnulados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComprobantesAnulados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComprobantesAnulados;
	protected JTextField jTextFieldValorCampoGeneralComprobantesAnulados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComprobantesAnulados;
	//public JList<Reporte> jListColumnasSelectReporteComprobantesAnulados;
	//public JScrollPane jScrollColumnasSelectReporteComprobantesAnulados;
	
	//public JLabel jLabelRelacionesSelectReporteComprobantesAnulados;
	//public JList<Reporte> jListRelacionesSelectReporteComprobantesAnulados;
	//public JScrollPane jScrollRelacionesSelectReporteComprobantesAnulados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComprobantesAnulados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComprobantesAnulados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComprobantesAnulados;
	//public JLabel jLabelTiposArchivoReporteDinamicoComprobantesAnulados;
	
		
	//public JLabel jLabelArchivoImportacionComprobantesAnulados;	
	//public JLabel jLabelPathArchivoImportacionComprobantesAnulados;
	//protected JTextField jTextFieldPathArchivoImportacionComprobantesAnulados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComprobantesAnulados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComprobantesAnulados;
	
	//public JLabel jLabelColumnaCategoriaValorComprobantesAnulados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComprobantesAnulados;
	
	//public JLabel jLabelColumnasValoresGraficoComprobantesAnulados;
	//public JList<Reporte> jListColumnasValoresGraficoComprobantesAnulados;
	//public JScrollPane jScrollColumnasValoresGraficoComprobantesAnulados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComprobantesAnulados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComprobantesAnulados;
	public JPanel jPanelBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonBusquedaComprobantesAnuladosComprobantesAnulados;
	
	public JPanel jPanelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaComprobantesAnuladosComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados;
	public JTextArea jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonnumero_mayorBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados;
	public JLabel jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados;
	public JButton jButtonfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnuladosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComprobantesAnuladosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComprobantesAnulados)	{
		this.jButtonRecargarInformacionComprobantesAnulados = jButtonRecargarInformacionComprobantesAnulados;
	}
	
	public JButton getjButtonProcesarInformacionComprobantesAnulados() {
		return this.jButtonProcesarInformacionComprobantesAnulados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobantesAnulados)	{
		this.jButtonProcesarInformacionComprobantesAnulados = jButtonProcesarInformacionComprobantesAnulados;
	}
	
	
	public JButton getjButtonRecargarInformacionComprobantesAnulados() {
		return this.jButtonRecargarInformacionComprobantesAnulados;
	}
	
	
	public List<ComprobantesAnulados> getcomprobantesanuladoss() {
		return this.comprobantesanuladoss;
	}

	public void setcomprobantesanuladoss(List<ComprobantesAnulados> comprobantesanuladoss) {
		this.comprobantesanuladoss = comprobantesanuladoss;
	}
	
	public List<ComprobantesAnulados> getcomprobantesanuladossAux() {
		return this.comprobantesanuladossAux;
	}

	public void setcomprobantesanuladossAux(List<ComprobantesAnulados> comprobantesanuladossAux) {
		this.comprobantesanuladossAux = comprobantesanuladossAux;
	}
	
	public List<ComprobantesAnulados> getcomprobantesanuladossEliminados() {
		return this.comprobantesanuladossEliminados;
	}

	public void setComprobantesAnuladossEliminados(List<ComprobantesAnulados> comprobantesanuladossEliminados) {
		this.comprobantesanuladossEliminados = comprobantesanuladossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComprobantesAnulados() {
		return jComboBoxTiposSeleccionarComprobantesAnulados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComprobantesAnulados(
			JComboBox jComboBoxTiposSeleccionarComprobantesAnulados) {
		this.jComboBoxTiposSeleccionarComprobantesAnulados = jComboBoxTiposSeleccionarComprobantesAnulados;
	}
	
	public void setBorderResaltarTiposSeleccionarComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComprobantesAnulados() {
		return jTextFieldValorCampoGeneralComprobantesAnulados;
	}

	public void setjTextFieldValorCampoGeneralComprobantesAnulados(
			JTextField jTextFieldValorCampoGeneralComprobantesAnulados) {
		this.jTextFieldValorCampoGeneralComprobantesAnulados = jTextFieldValorCampoGeneralComprobantesAnulados;
	}

	public void setBorderResaltarValorCampoGeneralComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComprobantesAnulados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComprobantesAnulados() {
		return this.jCheckBoxSeleccionarTodosComprobantesAnulados;
	}

	public void setjCheckBoxSeleccionarTodosComprobantesAnulados(
			JCheckBox jCheckBoxSeleccionarTodosComprobantesAnulados) {
		this.jCheckBoxSeleccionarTodosComprobantesAnulados = jCheckBoxSeleccionarTodosComprobantesAnulados;
	}

	public void setBorderResaltarSeleccionarTodosComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComprobantesAnulados() {
		return this.jCheckBoxSeleccionadosComprobantesAnulados;
	}

	public void setjCheckBoxSeleccionadosComprobantesAnulados(
			JCheckBox jCheckBoxSeleccionadosComprobantesAnulados) {
		this.jCheckBoxSeleccionadosComprobantesAnulados = jCheckBoxSeleccionadosComprobantesAnulados;
	}
	
	public void setBorderResaltarSeleccionadosComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComprobantesAnulados() {
		return this.jComboBoxTiposArchivosReportesComprobantesAnulados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComprobantesAnulados(
			JComboBox jComboBoxTiposArchivosReportesComprobantesAnulados) {
		this.jComboBoxTiposArchivosReportesComprobantesAnulados = jComboBoxTiposArchivosReportesComprobantesAnulados;
	}

	public void setBorderResaltarTiposArchivosReportesComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComprobantesAnulados() {
		return this.jComboBoxTiposReportesComprobantesAnulados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComprobantesAnulados(
			JComboBox jComboBoxTiposReportesComprobantesAnulados) {
		this.jComboBoxTiposReportesComprobantesAnulados = jComboBoxTiposReportesComprobantesAnulados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComprobantesAnulados() {
	//	return jComboBoxTiposReportesDinamicoComprobantesAnulados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComprobantesAnulados(
	//		JComboBox jComboBoxTiposReportesDinamicoComprobantesAnulados) {
	//	this.jComboBoxTiposReportesDinamicoComprobantesAnulados = jComboBoxTiposReportesDinamicoComprobantesAnulados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComprobantesAnulados() {
	//	return jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComprobantesAnulados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados = jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados;
	//}
	
	public void setBorderResaltarTiposReportesComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComprobantesAnulados() {
		return this.jComboBoxTiposGraficosReportesComprobantesAnulados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComprobantesAnulados(
			JComboBox jComboBoxTiposGraficosReportesComprobantesAnulados) {
		this.jComboBoxTiposGraficosReportesComprobantesAnulados = jComboBoxTiposGraficosReportesComprobantesAnulados;
	}
	
	public void setBorderResaltarTiposGraficosReportesComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComprobantesAnulados() {
		return this.jComboBoxTiposPaginacionComprobantesAnulados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComprobantesAnulados(
			JComboBox jComboBoxTiposPaginacionComprobantesAnulados) {
		this.jComboBoxTiposPaginacionComprobantesAnulados = jComboBoxTiposPaginacionComprobantesAnulados;
	}
	
	public void setBorderResaltarTiposPaginacionComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComprobantesAnulados() {
		return this.jComboBoxTiposRelacionesComprobantesAnulados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobantesAnulados() {
		return this.jComboBoxTiposAccionesComprobantesAnulados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobantesAnulados(
			JComboBox jComboBoxTiposRelacionesComprobantesAnulados) {
		this.jComboBoxTiposRelacionesComprobantesAnulados = jComboBoxTiposRelacionesComprobantesAnulados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobantesAnulados(
			JComboBox jComboBoxTiposAccionesComprobantesAnulados) {
		this.jComboBoxTiposAccionesComprobantesAnulados = jComboBoxTiposAccionesComprobantesAnulados;
	}
	
	public void setBorderResaltarTiposRelacionesComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComprobantesAnulados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComprobantesAnulados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComprobantesAnulados() {
	//	return jCheckBoxConGraficoDinamicoComprobantesAnulados;
	//}

	//public void setjCheckBoxConGraficoDinamicoComprobantesAnulados(
	//		JCheckBox jCheckBoxConGraficoDinamicoComprobantesAnulados) {
	//	this.jCheckBoxConGraficoDinamicoComprobantesAnulados = jCheckBoxConGraficoDinamicoComprobantesAnulados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComprobantesAnulados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComprobantesAnulados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComprobantesAnulados .setBorder(borderResaltar);		
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
		this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
		
		this.comprobantesanuladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantesanuladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantesanuladosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobantesAnuladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobantes Anulados MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
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
		
		ComprobantesAnuladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComprobantesAnulados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"nuevo","nuevo","Nuevo"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"duplicar","duplicar","Duplicar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"copiar","copiar","Copiar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"ver_form","ver_form","Ver"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"recargar","recargar","Buscar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComprobantesAnulados,this.jTtoolBarComprobantesAnulados,
							"cerrar","cerrar","Salir"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComprobantesAnulados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComprobantesAnulados;
			
				this.jButtonProcesarInformacionToolBarComprobantesAnulados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComprobantesAnulados;
				
		//protected JButton jButtonModificarToolBarComprobantesAnulados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComprobantesAnulados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComprobantesAnulados=new JMenuMe("General");
		this.jmenuArchivoComprobantesAnulados=new JMenuMe("Archivo");
		this.jmenuAccionesComprobantesAnulados=new JMenuMe("Acciones");
		this.jmenuDatosComprobantesAnulados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobantesAnulados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobantesAnulados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobantesAnulados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComprobantesAnulados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComprobantesAnulados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComprobantesAnulados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComprobantesAnulados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComprobantesAnulados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComprobantesAnulados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComprobantesAnulados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobantesAnulados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobantesAnulados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComprobantesAnulados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComprobantesAnulados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComprobantesAnulados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComprobantesAnulados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComprobantesAnulados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComprobantesAnulados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComprobantesAnulados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComprobantesAnulados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComprobantesAnulados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobantesAnulados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobantesAnulados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobantesAnulados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComprobantesAnulados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComprobantesAnulados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComprobantesAnulados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComprobantesAnulados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComprobantesAnulados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComprobantesAnulados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComprobantesAnulados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComprobantesAnulados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComprobantesAnulados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComprobantesAnulados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComprobantesAnulados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComprobantesAnulados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComprobantesAnulados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComprobantesAnulados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComprobantesAnulados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobantesAnulados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobantesAnulados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobantesAnulados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComprobantesAnulados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComprobantesAnulados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComprobantesAnulados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobantesAnulados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobantesAnulados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobantesAnulados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComprobantesAnulados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComprobantesAnulados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComprobantesAnulados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComprobantesAnulados.add(this.jMenuItemCerrarComprobantesAnulados);
			
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemNuevoComprobantesAnulados);
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemNuevoGuardarCambiosComprobantesAnulados);
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemNuevoRelacionesComprobantesAnulados);
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemGuardarCambiosTablaComprobantesAnulados);		
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemDuplicarComprobantesAnulados);		
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemCopiarComprobantesAnulados);		
			this.jmenuAccionesComprobantesAnulados.add(this.jMenuItemVerFormComprobantesAnulados);		
			
			this.jmenuDatosComprobantesAnulados.add(this.jMenuItemRecargarInformacionComprobantesAnulados);				
			this.jmenuDatosComprobantesAnulados.add(this.jMenuItemAnterioresComprobantesAnulados);				
			this.jmenuDatosComprobantesAnulados.add(this.jMenuItemSiguientesComprobantesAnulados);				
			this.jmenuDatosComprobantesAnulados.add(this.jMenuItemAbrirOrderByComprobantesAnulados);				
			this.jmenuDatosComprobantesAnulados.add(this.jMenuItemMostrarOcultarComprobantesAnulados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComprobantesAnulados.add(this.jMenuItemGuardarCambiosComprobantesAnulados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComprobantesAnulados.add(this.jmenuArchivoComprobantesAnulados);		
			this.jmenuBarComprobantesAnulados.add(this.jmenuAccionesComprobantesAnulados);		
			this.jmenuBarComprobantesAnulados.add(this.jmenuDatosComprobantesAnulados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComprobantesAnulados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComprobantesAnulados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Buscar Por Ejercicio Por Tipo Documento Por Tipo Movimiento Por Numero Mayor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados= new JButtonMe();
		this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados.setText("Buscar");
		this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Buscar Por Ejercicio Por Tipo Documento Por Tipo Movimiento Por Numero Mayor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados,"buscar_button","Buscar Por Ejercicio Por Tipo Documento Por Tipo Movimiento Por Numero Mayor Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setText("Tipo Documento :");
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setText("Numero Mayor :");
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Numero Mayor");
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados= new JTextAreaMe();
		jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasComprobantesAnulados=new JTabbedPane();


		this.jTabbedPaneBusquedasComprobantesAnulados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasComprobantesAnulados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasComprobantesAnulados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComprobantesAnulados = new ComprobantesAnuladosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comprobantes Anulados DATOS");
			this.jInternalFrameDetalleFormComprobantesAnulados = new ComprobantesAnuladosDetalleFormJInternalFrame(jDesktopPane,this.comprobantesanuladosSessionBean.getConGuardarRelaciones(),this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComprobantesAnulados = null;//new ComprobantesAnuladosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobantesAnulados= new GridBagLayout();
		
		
		this.jTableDatosComprobantesAnulados = new JTableMe();      
		
		String sToolTipComprobantesAnulados="";
		sToolTipComprobantesAnulados=ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobantesAnulados+="(Contabilidad.ComprobantesAnulados)";
		}
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobantesAnulados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComprobantesAnulados.setToolTipText(sToolTipComprobantesAnulados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComprobantesAnulados);
		this.jTableDatosComprobantesAnulados.setAutoCreateRowSorter(true);
		this.jTableDatosComprobantesAnulados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComprobantesAnulados.setRowSelectionAllowed(true);
		this.jTableDatosComprobantesAnulados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComprobantesAnulados = new JButtonMe();
		this.jButtonDuplicarComprobantesAnulados = new JButtonMe();
		this.jButtonCopiarComprobantesAnulados = new JButtonMe();
		this.jButtonVerFormComprobantesAnulados = new JButtonMe();
		this.jButtonNuevoRelacionesComprobantesAnulados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados = new JButtonMe();
		this.jButtonCerrarComprobantesAnulados = new JButtonMe();
		
		this.jScrollPanelDatosComprobantesAnulados = new JScrollPane();   
        this.jScrollPanelDatosGeneralComprobantesAnulados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobantes Anulados";
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobantesAnulados.setToolTipText("Acciones");
        this.jPanelAccionesComprobantesAnulados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComprobantesAnulados=new ReporteDinamicoJInternalFrame(ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComprobantesAnulados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComprobantesAnulados=new ImportacionJInternalFrame(ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComprobantesAnulados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComprobantesAnulados = new JButtonMe();
		
		this.jButtonAbrirOrderByComprobantesAnulados.setText("Orden");
		this.jButtonAbrirOrderByComprobantesAnulados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobantesAnulados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobantesAnulados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobantesAnulados,false,this);
			
			//this.cargarOrderByComprobantesAnulados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobantesAnulados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobantesAnulados,true,this);
			
			//this.cargarOrderByComprobantesAnulados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComprobantesAnulados.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosComprobantesAnulados.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosComprobantesAnulados.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosComprobantesAnulados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobantesAnulados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobantesAnulados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComprobantesAnulados.setText("Nuevo");
		this.jButtonDuplicarComprobantesAnulados.setText("Duplicar");
		this.jButtonCopiarComprobantesAnulados.setText("Copiar");
		this.jButtonVerFormComprobantesAnulados.setText("Ver");
		this.jButtonNuevoRelacionesComprobantesAnulados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.setText("Guardar");
		this.jButtonCerrarComprobantesAnulados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobantesAnulados,"nuevo_button","Nuevo",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComprobantesAnulados,"duplicar_button","Duplicar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComprobantesAnulados,"copiar_button","Copiar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComprobantesAnulados,"ver_form","Ver",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComprobantesAnulados,"nuevorelaciones_button","Nuevo Rel",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobantesAnulados,"guardarcambiostabla_button","Guardar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobantesAnulados,"cerrar_button","Salir",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComprobantesAnulados.setToolTipText("Nuevo"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComprobantesAnulados.setToolTipText("Duplicar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComprobantesAnulados.setToolTipText("Copiar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComprobantesAnulados.setToolTipText("Ver"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComprobantesAnulados.setToolTipText("Nuevo Rel"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.setToolTipText("Guardar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobantesAnulados.setToolTipText("Salir"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobantesAnulados";
		inputMap = this.jButtonNuevoComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobantesAnulados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobantesAnulados"));
		
		//DUPLICAR
		sMapKey = "DuplicarComprobantesAnulados";
		inputMap = this.jButtonDuplicarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComprobantesAnulados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComprobantesAnulados"));
		
		//COPIAR
		sMapKey = "CopiarComprobantesAnulados";
		inputMap = this.jButtonCopiarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComprobantesAnulados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComprobantesAnulados"));
		
		//VEr FORM
		sMapKey = "VerFormComprobantesAnulados";
		inputMap = this.jButtonVerFormComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComprobantesAnulados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComprobantesAnulados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComprobantesAnulados";
		inputMap = this.jButtonNuevoRelacionesComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComprobantesAnulados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComprobantesAnulados";
		inputMap = this.jButtonModificarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComprobantesAnulados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComprobantesAnulados";
		inputMap = this.jButtonCerrarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobantesAnulados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobantesAnulados";
		inputMap = this.jButtonGuardarCambiosTablaComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobantesAnulados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComprobantesAnulados.setName("jPanelParametrosReportesComprobantesAnulados"); 
		
		this.jPanelParametrosReportesAccionesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComprobantesAnulados.setName("jPanelParametrosReportesAccionesComprobantesAnulados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComprobantesAnulados = new JButtonMe();
		this.jButtonRecargarInformacionComprobantesAnulados.setText("Buscar");
		this.jButtonRecargarInformacionComprobantesAnulados.setToolTipText("Buscar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComprobantesAnulados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComprobantesAnulados.setVisible(false);
		
		
		this.jButtonProcesarInformacionComprobantesAnulados = new JButtonMe();
		this.jButtonProcesarInformacionComprobantesAnulados.setText("Procesar");
		this.jButtonProcesarInformacionComprobantesAnulados.setToolTipText("Procesar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComprobantesAnulados.setVisible(false);
			
		this.jButtonProcesarInformacionComprobantesAnulados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobantesAnulados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobantesAnulados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobantesAnulados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComprobantesAnulados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobantesAnulados.setText("TIPO");       
		this.jComboBoxTiposReportesComprobantesAnulados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobantesAnulados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComprobantesAnulados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComprobantesAnulados.setText("Paginacion");
		this.jComboBoxTiposPaginacionComprobantesAnulados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComprobantesAnulados.setText("Accion");
		this.jComboBoxTiposRelacionesComprobantesAnulados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobantesAnulados.setText("Accion");
		this.jComboBoxTiposAccionesComprobantesAnulados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComprobantesAnulados.setText("Accion");
		this.jComboBoxTiposSeleccionarComprobantesAnulados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComprobantesAnulados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComprobantesAnulados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobantesAnulados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobantesAnulados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComprobantesAnulados = new JLabelMe();
		
		this.jLabelAccionesComprobantesAnulados.setText("Acciones");		
		this.jLabelAccionesComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComprobantesAnulados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComprobantesAnulados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComprobantesAnulados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComprobantesAnulados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComprobantesAnulados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComprobantesAnulados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComprobantesAnulados.setText("Graf.");
		this.jCheckBoxConGraficoReporteComprobantesAnulados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComprobantesAnulados = new JButtonMe();
		//this.jButtonAnterioresComprobantesAnulados.setText("<<");
        this.jButtonAnterioresComprobantesAnulados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComprobantesAnulados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComprobantesAnulados = new JButtonMe();
		//this.jButtonSiguientesComprobantesAnulados.setText(">>");
        this.jButtonSiguientesComprobantesAnulados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComprobantesAnulados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComprobantesAnulados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComprobantesAnulados.setText("Nue");
        this.jButtonNuevoGuardarCambiosComprobantesAnulados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComprobantesAnulados,"nuevoguardarcambios_button","Nue",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComprobantesAnulados";
		inputMap = this.jButtonNuevoGuardarCambiosComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComprobantesAnulados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComprobantesAnulados";
		inputMap = this.jButtonRecargarInformacionComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComprobantesAnulados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComprobantesAnulados";
		inputMap = this.jButtonSiguientesComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComprobantesAnulados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComprobantesAnulados";
		inputMap = this.jButtonAnterioresComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComprobantesAnulados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComprobantesAnulados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComprobantesAnulados.setMinimumSize(new Dimension(this.getWidth(),ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobantesAnulados.setMaximumSize(new Dimension(this.getWidth(),ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobantesAnulados.setPreferredSize(new Dimension(this.getWidth(),ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobantesAnuladosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComprobantesAnulados = new GridBagLayout();

			this.jPanelPaginacionComprobantesAnulados.setLayout(gridaBagLayoutPaginacionComprobantesAnulados);						
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 0;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonAnterioresComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					
						
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobantesAnulados.gridy = 0;
			
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonNuevoGuardarCambiosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
						
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobantesAnulados.gridy = 0;
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonSiguientesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 1;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonNuevoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
						
			
			
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
				this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComprobantesAnulados.gridy = 1;
				this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComprobantesAnulados.add(this.jButtonGuardarCambiosTablaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			}
			
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 1;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonDuplicarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 1;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonCopiarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 1;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonVerFormComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 1;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComprobantesAnulados.add(this.jButtonCerrarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		
		this.jButtonRecargarInformacionComprobantesAnulados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobantesAnulados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobantesAnulados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComprobantesAnulados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobantesAnulados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobantesAnulados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComprobantesAnulados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobantesAnulados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobantesAnulados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComprobantesAnulados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobantesAnulados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobantesAnulados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComprobantesAnulados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobantesAnulados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobantesAnulados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComprobantesAnulados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobantesAnulados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobantesAnulados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComprobantesAnulados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobantesAnulados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobantesAnulados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComprobantesAnulados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobantesAnulados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobantesAnulados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComprobantesAnulados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobantesAnulados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobantesAnulados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComprobantesAnulados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobantesAnulados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobantesAnulados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComprobantesAnulados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobantesAnulados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobantesAnulados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComprobantesAnulados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComprobantesAnulados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComprobantesAnulados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComprobantesAnulados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComprobantesAnulados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComprobantesAnulados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComprobantesAnulados.setLayout(gridaBagParametrosReportesComprobantesAnulados);
			this.jPanelParametrosReportesAccionesComprobantesAnulados.setLayout(gridaBagParametrosReportesAccionesComprobantesAnulados);
			
			
			this.jPanelParametrosAuxiliar1ComprobantesAnulados.setLayout(gridaBagParametrosAuxiliar1ComprobantesAnulados);
			this.jPanelParametrosAuxiliar2ComprobantesAnulados.setLayout(gridaBagParametrosAuxiliar2ComprobantesAnulados);
			this.jPanelParametrosAuxiliar3ComprobantesAnulados.setLayout(gridaBagParametrosAuxiliar3ComprobantesAnulados);
			this.jPanelParametrosAuxiliar4ComprobantesAnulados.setLayout(gridaBagParametrosAuxiliar4ComprobantesAnulados);
			//this.jPanelParametrosAuxiliar5ComprobantesAnulados.setLayout(gridaBagParametrosAuxiliar2ComprobantesAnulados);			
			
			
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jButtonRecargarInformacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobantesAnulados.add(this.jComboBoxTiposPaginacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobantesAnulados.add(this.jCheckBoxConAltoMaximoTablaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobantesAnulados.add(this.jComboBoxTiposArchivosReportesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jPanelParametrosAuxiliar1ComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComprobantesAnulados.add(this.jComboBoxTiposReportesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);																		
			
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComprobantesAnulados.add(this.jComboBoxTiposGraficosReportesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jPanelParametrosAuxiliar4ComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jComboBoxTiposReportesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jCheckBoxGenerarReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jPanelParametrosAuxiliar2ComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jLabelAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
				this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComprobantesAnulados.add(this.jButtonAbrirOrderByComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jComboBoxTiposSeleccionarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
			
			
			/*
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jCheckBoxSeleccionarTodosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jCheckBoxConGraficoReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobantesAnulados.add(this.jCheckBoxSeleccionarTodosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);															
				
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobantesAnulados.add(this.jCheckBoxSeleccionadosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);															
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobantesAnulados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobantesAnulados.add(this.jCheckBoxConGraficoReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jPanelParametrosAuxiliar3ComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobantesAnulados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobantesAnulados.add(this.jComboBoxTiposAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComprobantesAnulados = new GridBagLayout();

			this.jScrollPanelDatosComprobantesAnulados.setLayout(gridaBagLayoutDatosComprobantesAnulados);
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = 0;
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;
			
			this.jScrollPanelDatosComprobantesAnulados.add(this.jTableDatosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComprobantesAnulados.setViewportView(this.jTableDatosComprobantesAnulados);
		this.jTableDatosComprobantesAnulados.setFillsViewportHeight(true);
		this.jTableDatosComprobantesAnulados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComprobantesAnulados= new GridBagLayout();
		this.jPanelAccionesComprobantesAnulados.setLayout(gridaBagLayoutAccionesComprobantesAnulados);
		
		
		/*	
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
			
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonNuevoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados= new GridBagLayout();
		gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.setLayout(gridaBagLayoutBusquedaComprobantesAnuladosComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 0;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 0;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);


		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 1;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 1;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);


		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 2;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 2;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);


		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 3;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelnumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 3;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);


		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 4;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 4;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);


		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 5;
		gridBagConstraintsComprobantesAnulados.gridx = 0;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jLabelfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 5;
		gridBagConstraintsComprobantesAnulados.gridx = 1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobantesAnulados.gridy = 6;
		gridBagConstraintsComprobantesAnulados.gridx =1;
		jPanelBusquedaComprobantesAnuladosComprobantesAnulados.add(jButtonBusquedaComprobantesAnuladosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);

		jTabbedPaneBusquedasComprobantesAnulados.addTab("1.-Por Ejercicio Por Tipo Documento Por Tipo Movimiento Por Numero Mayor Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaComprobantesAnuladosComprobantesAnulados);
		jTabbedPaneBusquedasComprobantesAnulados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobantesAnulados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();						
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;		
			//this.gridBagConstraintsComprobantesAnulados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobantesAnulados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;		
		//this.gridBagConstraintsComprobantesAnulados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComprobantesAnulados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;		
			this.gridBagConstraintsComprobantesAnulados.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComprobantesAnulados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);								
		
		
		/*
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		*/		
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobantesAnulados.gridx =0;
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobantesAnulados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
				
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComprobantesAnulados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobantesAnulados = new GridBagLayout();
			this.jPanelBusquedasParametrosComprobantesAnulados.setLayout(gridaBagLayoutBusquedasParametrosComprobantesAnulados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComprobantesAnulados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobantesAnulados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobantesAnulados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobantesAnulados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComprobantesAnulados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComprobantesAnulados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComprobantesAnulados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComprobantesAnulados.setName("jPanelReporteDinamicoComprobantesAnulados"); 
		
		this.jPanelReporteDinamicoComprobantesAnulados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobantesAnulados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobantesAnulados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComprobantesAnulados.setLayout(gridaBagLayoutReporteDinamicoComprobantesAnulados);
		
		
		this.jInternalFrameReporteDinamicoComprobantesAnulados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComprobantesAnulados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobantesAnulados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComprobantesAnulados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComprobantesAnulados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComprobantesAnulados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComprobantesAnulados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComprobantesAnulados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComprobantesAnulados.setResizable(true);
	    this.jInternalFrameReporteDinamicoComprobantesAnulados.setClosable(true);
	    this.jInternalFrameReporteDinamicoComprobantesAnulados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComprobantesAnulados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobantesAnulados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobantesAnulados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComprobantesAnulados = new JLabelMe();

		this.jLabelColumnasSelectReporteComprobantesAnulados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelColumnasSelectReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComprobantesAnulados = new JList<Reporte>();
		this.jListColumnasSelectReporteComprobantesAnulados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComprobantesAnulados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComprobantesAnulados=new JScrollPane(this.jListColumnasSelectReporteComprobantesAnulados);
			
			this.jScrollColumnasSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComprobantesAnulados.add(this.jListColumnasSelectReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jScrollColumnasSelectReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComprobantesAnulados = new JLabelMe();

		this.jLabelRelacionesSelectReporteComprobantesAnulados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComprobantesAnulados = new JList<Reporte>();
		this.jListRelacionesSelectReporteComprobantesAnulados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComprobantesAnulados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComprobantesAnulados=new JScrollPane(this.jListRelacionesSelectReporteComprobantesAnulados);
			
			this.jScrollRelacionesSelectReporteComprobantesAnulados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobantesAnulados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobantesAnulados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComprobantesAnulados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados = new JComboBoxMe();
		this.jListColumnasValoresGraficoComprobantesAnulados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComprobantesAnulados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComprobantesAnulados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComprobantesAnulados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobantesAnulados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobantesAnulados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComprobantesAnulados = new JLabelMe();

		this.jLabelConGraficoDinamicoComprobantesAnulados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelConGraficoDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComprobantesAnulados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComprobantesAnulados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComprobantesAnulados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobantesAnulados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobantesAnulados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jCheckBoxConGraficoDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComprobantesAnulados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComprobantesAnulados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelColumnaCategoriaGraficoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComprobantesAnulados = new JLabelMe();

		this.jLabelColumnaCategoriaValorComprobantesAnulados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelColumnaCategoriaValorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComprobantesAnulados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComprobantesAnulados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComprobantesAnulados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobantesAnulados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobantesAnulados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jComboBoxColumnaCategoriaValorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComprobantesAnulados = new JLabelMe();

		this.jLabelColumnasValoresGraficoComprobantesAnulados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelColumnasValoresGraficoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComprobantesAnulados = new JList<Reporte>();
		this.jListColumnasValoresGraficoComprobantesAnulados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComprobantesAnulados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComprobantesAnulados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobantesAnulados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobantesAnulados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComprobantesAnulados=new JScrollPane(this.jListColumnasValoresGraficoComprobantesAnulados);
			
			this.jScrollColumnasValoresGraficoComprobantesAnulados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobantesAnulados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobantesAnulados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComprobantesAnulados.add(this.jListColumnasSelectReporteComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jScrollColumnasValoresGraficoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelTiposGraficosReportesDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobantesAnulados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jComboBoxTiposGraficosReportesDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelGenerarExcelReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados.setToolTipText("Generar EXCEL"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComprobantesAnulados.add(this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jComboBoxTiposReportesDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jLabelTiposArchivoReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jComboBoxTiposArchivosReportesDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComprobantesAnulados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComprobantesAnulados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComprobantesAnulados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComprobantesAnulados.setToolTipText("Generar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jButtonGenerarReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComprobantesAnulados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComprobantesAnulados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComprobantesAnulados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComprobantesAnulados.setToolTipText("Cancelar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobantesAnulados.add(this.jButtonCerrarReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComprobantesAnulados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComprobantesAnulados= new JScrollPane(jPanelReporteDinamicoComprobantesAnulados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComprobantesAnulados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobantesAnulados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobantesAnulados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComprobantesAnulados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComprobantesAnulados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComprobantesAnulados);
		this.jInternalFrameReporteDinamicoComprobantesAnulados.getContentPane().add(this.jScrollPanelReporteDinamicoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComprobantesAnulados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComprobantesAnulados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComprobantesAnulados.setName("jPanelImportacionComprobantesAnulados"); 
		
		this.jPanelImportacionComprobantesAnulados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobantesAnulados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobantesAnulados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComprobantesAnulados.setLayout(gridaBagLayoutImportacionComprobantesAnulados);
		
		
		this.jInternalFrameImportacionComprobantesAnulados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComprobantesAnulados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComprobantesAnulados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobantesAnulados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComprobantesAnulados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobantesAnulados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobantesAnulados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComprobantesAnulados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobantesAnulados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobantesAnulados.setResizable(true);
	    this.jInternalFrameImportacionComprobantesAnulados.setClosable(true);
	    this.jInternalFrameImportacionComprobantesAnulados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComprobantesAnulados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobantesAnulados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobantesAnulados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComprobantesAnulados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobantesAnulados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobantesAnulados.setResizable(true);
	    this.jInternalFrameImportacionComprobantesAnulados.setClosable(true);
	    this.jInternalFrameImportacionComprobantesAnulados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComprobantesAnulados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobantesAnulados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobantesAnulados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComprobantesAnulados = new JLabelMe();

		this.jLabelArchivoImportacionComprobantesAnulados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobantesAnulados.add(this.jLabelArchivoImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComprobantesAnulados = new JFileChooser();		
		this.jFileChooserImportacionComprobantesAnulados.setToolTipText("ESCOGER ARCHIVO"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComprobantesAnulados = new JButtonMe();
		this.jButtonAbrirImportacionComprobantesAnulados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComprobantesAnulados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComprobantesAnulados.setToolTipText("Generar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobantesAnulados.add(this.jButtonAbrirImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComprobantesAnulados = new JLabelMe();

		this.jLabelPathArchivoImportacionComprobantesAnulados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobantesAnulados.add(this.jLabelPathArchivoImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComprobantesAnulados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComprobantesAnulados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobantesAnulados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobantesAnulados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobantesAnulados.add(this.jTextFieldPathArchivoImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComprobantesAnulados = new JButtonMe();
		this.jButtonGenerarImportacionComprobantesAnulados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComprobantesAnulados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComprobantesAnulados.setToolTipText("Generar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobantesAnulados.add(this.jButtonGenerarImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComprobantesAnulados = new JButtonMe();
		this.jButtonCerrarImportacionComprobantesAnulados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComprobantesAnulados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComprobantesAnulados.setToolTipText("Cancelar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobantesAnulados.add(this.jButtonCerrarImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComprobantesAnulados = new GridBagLayout();
		
		this.jScrollPanelImportacionComprobantesAnulados= new JScrollPane(jPanelImportacionComprobantesAnulados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iPosYImportacion;
		this.gridBagConstraintsComprobantesAnulados.gridx =iPosXImportacion;
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComprobantesAnulados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComprobantesAnulados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComprobantesAnulados);
		this.jInternalFrameImportacionComprobantesAnulados.getContentPane().add(this.jScrollPanelImportacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComprobantesAnulados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComprobantesAnulados = new JButtonMe();
			this.jButtonAbrirOrderByComprobantesAnulados.setText("Orden");
			this.jButtonAbrirOrderByComprobantesAnulados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobantesAnulados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComprobantesAnulados";
			inputMap = this.jButtonAbrirOrderByComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComprobantesAnulados"));
		
		
			GridBagLayout gridaBagLayoutOrderByComprobantesAnulados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComprobantesAnulados.setName("jPanelOrderByComprobantesAnulados"); 
			
			this.jPanelOrderByComprobantesAnulados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobantesAnulados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobantesAnulados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComprobantesAnulados.setLayout(gridaBagLayoutOrderByComprobantesAnulados);
			
			
			this.jTableDatosComprobantesAnuladosOrderBy = new JTableMe();        
			this.jTableDatosComprobantesAnuladosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComprobantesAnuladosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComprobantesAnuladosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComprobantesAnuladosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComprobantesAnuladosOrderBy.setViewportView(this.jTableDatosComprobantesAnuladosOrderBy);
			this.jTableDatosComprobantesAnuladosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComprobantesAnuladosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComprobantesAnulados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComprobantesAnulados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComprobantesAnulados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComprobantesAnulados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComprobantesAnulados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComprobantesAnulados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComprobantesAnulados.setTitle("Orden");
			this.jInternalFrameOrderByComprobantesAnulados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComprobantesAnulados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComprobantesAnulados.setResizable(true);
			this.jInternalFrameOrderByComprobantesAnulados.setClosable(true);
			this.jInternalFrameOrderByComprobantesAnulados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComprobantesAnulados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobantesAnulados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobantesAnulados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComprobantesAnulados.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComprobantesAnulados.ipady =150;
				
			this.jPanelOrderByComprobantesAnulados.add(jScrollPanelDatosComprobantesAnuladosOrderBy, this.gridBagConstraintsComprobantesAnulados);//this.jTableDatosComprobantesAnuladosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComprobantesAnulados = new JButtonMe();
			this.jButtonCerrarOrderByComprobantesAnulados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComprobantesAnulados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComprobantesAnulados.setToolTipText("Cancelar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComprobantesAnulados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComprobantesAnulados.add(this.jButtonCerrarOrderByComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComprobantesAnulados = new GridBagLayout();
			
			this.jScrollPanelOrderByComprobantesAnulados= new JScrollPane(jPanelOrderByComprobantesAnulados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy =iPosYOrderBy;
			this.gridBagConstraintsComprobantesAnulados.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComprobantesAnulados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComprobantesAnulados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComprobantesAnulados);
			
			this.jInternalFrameOrderByComprobantesAnulados.getContentPane().add(this.jScrollPanelOrderByComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
		
		} else {
			this.jButtonAbrirOrderByComprobantesAnulados = new JButtonMe();
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
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comprobantesanuladosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComprobantesAnulados.getRowHeight();//ComprobantesAnuladosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.isSelected()) {
					iHeightTable=ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobantesAnulados.isSelected()) {
					iHeightTable=ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobantesAnuladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComprobantesAnulados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobantesAnulados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobantesAnulados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComprobantesAnulados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobantesAnulados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobantesAnulados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComprobantesAnulados!=null && this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy()!=null) {
			//if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComprobantesAnulados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComprobantesAnulados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComprobantesAnulados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComprobantesAnulados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobantesAnulados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobantesAnulados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comprobantesanuladosLogic.getComprobantesAnuladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantesanuladoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComprobantesAnulados> TraerComprobantesAnuladosBeans(List<ComprobantesAnulados> comprobantesanuladoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComprobantesAnulados comprobantesanulados:comprobantesanuladoss) {
					
				if(!(ComprobantesAnuladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComprobantesAnuladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comprobantesanulados.setsDetalleGeneralEntityReporte(ComprobantesAnuladosConstantesFunciones.getComprobantesAnuladosDescripcion(comprobantesanulados));
										
						
					
						
					
				} else  {
							
					//comprobantesanulados.setsDetalleGeneralEntityReporte(comprobantesanulados.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprobantesanuladosbeans.add(comprobantesanuladosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comprobantesanuladoss;
    }
	//PARA REPORTES FIN
}
