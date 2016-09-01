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
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorRetencionesConstantesFunciones;

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
public class RetencionesPorPagarPorRetencionesJInternalFrame extends RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRetencionesPorPagarPorRetenciones;
	
	protected JMenuBar jmenuBarRetencionesPorPagarPorRetenciones;
	
	protected JMenu jmenuRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuDatosRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuArchivoRetencionesPorPagarPorRetenciones;
	protected JMenu jmenuAccionesRetencionesPorPagarPorRetenciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionesPorPagarPorRetenciones;	
	protected GridBagConstraints gridBagConstraintsRetencionesPorPagarPorRetenciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRetencionesPorPagarPorRetenciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public RetencionesPorPagarPorRetencionesSessionBean retencionesporpagarporretencionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness;		
	public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessEliminados;	
	public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRetencionesPorPagarPorRetenciones;		
	protected JButton jButtonAbrirOrderByRetencionesPorPagarPorRetenciones;
	
	
	//protected JPanel jPanelOrderByRetencionesPorPagarPorRetenciones;
	//public JScrollPane jScrollPanelOrderByRetencionesPorPagarPorRetenciones;	
	//protected JButton jButtonCerrarOrderByRetencionesPorPagarPorRetenciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RetencionesPorPagarPorRetencionesLogic retencionesporpagarporretencionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRetencionesPorPagarPorRetenciones;
	public JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones;
	public JScrollPane jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones;
    
	
	
	//public JScrollPane jScrollPanelDatosRetencionesPorPagarPorRetencionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones;
	//public JScrollPane jScrollPanelImportacionRetencionesPorPagarPorRetenciones;
	
	
	
	protected JPanel jPanelAccionesRetencionesPorPagarPorRetenciones;
	
    protected JPanel jPanelPaginacionRetencionesPorPagarPorRetenciones;
    protected JPanel jPanelParametrosReportesRetencionesPorPagarPorRetenciones;
	protected JPanel jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones;
	protected JPanel jPanelParametrosAuxiliar2RetencionesPorPagarPorRetenciones;
	protected JPanel jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones;
	protected JPanel jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones;
	//protected JPanel jPanelParametrosAuxiliar5RetencionesPorPagarPorRetenciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoRetencionesPorPagarPorRetenciones;
	//protected JPanel jPanelImportacionRetencionesPorPagarPorRetenciones;
	
	
	public JTable jTableDatosRetencionesPorPagarPorRetenciones;
	
	
	
	//public JTable jTableDatosRetencionesPorPagarPorRetencionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRetencionesPorPagarPorRetenciones;
	protected JButton jButtonDuplicarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCopiarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonVerFormRetencionesPorPagarPorRetenciones;
	protected JButton jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones;
	protected JButton jButtonModificarRetencionesPorPagarPorRetenciones;
	
    protected JButton jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCerrarRetencionesPorPagarPorRetenciones;
	
	
	protected JButton jButtonRecargarInformacionRetencionesPorPagarPorRetenciones;
	protected JButton jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	
	
	protected JButton jButtonAnterioresRetencionesPorPagarPorRetenciones;
	protected JButton jButtonSiguientesRetencionesPorPagarPorRetenciones;
	protected JButton jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones;
	//protected JButton jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionRetencionesPorPagarPorRetenciones;
	//protected JButton jButtonGenerarImportacionRetencionesPorPagarPorRetenciones;
	//protected JButton jButtonCerrarImportacionRetencionesPorPagarPorRetenciones;
	//protected JFileChooser jFileChooserImportacionRetencionesPorPagarPorRetenciones;
	//protected File fileImportacionRetencionesPorPagarPorRetenciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonDuplicarToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones;
	
	
	public JButton jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCopiarToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonVerFormToolBarRetencionesPorPagarPorRetenciones;
	public JButton jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonCerrarToolBarRetencionesPorPagarPorRetenciones;
	
	protected JButton jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonAnterioresToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonSiguientesToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones;
	protected JButton jButtonAbrirOrderByToolBarRetencionesPorPagarPorRetenciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDuplicarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemCopiarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemVerFormRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemCerrarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones;
	
	protected JMenuItem jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemProcesarInformacionRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemAnterioresRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemSiguientesRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones;
	protected JMenuItem jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionesPorPagarPorRetenciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones;
	protected JCheckBox jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones;
	protected JCheckBox jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRetencionesPorPagarPorRetenciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones;
	protected JTextField jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones;
	//public JList<Reporte> jListColumnasSelectReporteRetencionesPorPagarPorRetenciones;
	//public JScrollPane jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones;
	
	//public JLabel jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones;
	//public JList<Reporte> jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones;
	//public JScrollPane jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones;
	
		
	//public JLabel jLabelArchivoImportacionRetencionesPorPagarPorRetenciones;	
	//public JLabel jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones;
	//protected JTextField jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones;
	
	//public JLabel jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones;
	
	//public JLabel jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones;
	//public JList<Reporte> jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones;
	//public JScrollPane jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones;
	public JPanel jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JButton jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	
	public JPanel jPanelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JLabel jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JButtonMe();
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPaneles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JLabel jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JCheckBox jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones;
	public JButton jButtones_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RetencionesPorPagarPorRetencionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorRetencionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRetencionesPorPagarPorRetenciones)	{
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones = jButtonRecargarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	public JButton getjButtonProcesarInformacionRetencionesPorPagarPorRetenciones() {
		return this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionesPorPagarPorRetenciones)	{
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones = jButtonProcesarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	
	public JButton getjButtonRecargarInformacionRetencionesPorPagarPorRetenciones() {
		return this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones;
	}
	
	
	public List<RetencionesPorPagarPorRetenciones> getretencionesporpagarporretencioness() {
		return this.retencionesporpagarporretencioness;
	}

	public void setretencionesporpagarporretencioness(List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness) {
		this.retencionesporpagarporretencioness = retencionesporpagarporretencioness;
	}
	
	public List<RetencionesPorPagarPorRetenciones> getretencionesporpagarporretencionessAux() {
		return this.retencionesporpagarporretencionessAux;
	}

	public void setretencionesporpagarporretencionessAux(List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessAux) {
		this.retencionesporpagarporretencionessAux = retencionesporpagarporretencionessAux;
	}
	
	public List<RetencionesPorPagarPorRetenciones> getretencionesporpagarporretencionessEliminados() {
		return this.retencionesporpagarporretencionessEliminados;
	}

	public void setRetencionesPorPagarPorRetencionessEliminados(List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessEliminados) {
		this.retencionesporpagarporretencionessEliminados = retencionesporpagarporretencionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones() {
		return jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones = jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones;
	}
	
	public void setBorderResaltarTiposSeleccionarRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones() {
		return jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones;
	}

	public void setjTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones(
			JTextField jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones) {
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones = jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones;
	}

	public void setBorderResaltarValorCampoGeneralRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones() {
		return this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones;
	}

	public void setjCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones(
			JCheckBox jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones) {
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones = jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones;
	}

	public void setBorderResaltarSeleccionarTodosRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones() {
		return this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones;
	}

	public void setjCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones(
			JCheckBox jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones) {
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones = jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones;
	}
	
	public void setBorderResaltarSeleccionadosRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones = jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones;
	}

	public void setBorderResaltarTiposArchivosReportesRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposReportesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones = jComboBoxTiposReportesRetencionesPorPagarPorRetenciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones() {
	//	return jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones(
	//		JComboBox jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones) {
	//	this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones = jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones = jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones;
	//}
	
	public void setBorderResaltarTiposReportesRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones = jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones = jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones;
	}
	
	public void setBorderResaltarTiposPaginacionRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionesPorPagarPorRetenciones() {
		return this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones = jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionesPorPagarPorRetenciones(
			JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones) {
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones = jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones;
	}
	
	public void setBorderResaltarTiposRelacionesRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRetencionesPorPagarPorRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones() {
	//	return jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones) {
	//	this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones = jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRetencionesPorPagarPorRetenciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones .setBorder(borderResaltar);		
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
		this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
		
		this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionesPorPagarPorRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionesPorPagarPorRetencionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retenciones Por Pagar Por Retenciones MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
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
		
		RetencionesPorPagarPorRetencionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RetencionesPorPagarPorRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRetencionesPorPagarPorRetenciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"nuevo","nuevo","Nuevo"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"duplicar","duplicar","Duplicar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"copiar","copiar","Copiar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"ver_form","ver_form","Ver"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"recargar","recargar","Buscar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,
							"cerrar","cerrar","Salir"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones;
			
				this.jButtonProcesarInformacionToolBarRetencionesPorPagarPorRetenciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorRetenciones;
				
		//protected JButton jButtonModificarToolBarRetencionesPorPagarPorRetenciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRetencionesPorPagarPorRetenciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRetencionesPorPagarPorRetenciones=new JMenuMe("General");
		this.jmenuArchivoRetencionesPorPagarPorRetenciones=new JMenuMe("Archivo");
		this.jmenuAccionesRetencionesPorPagarPorRetenciones=new JMenuMe("Acciones");
		this.jmenuDatosRetencionesPorPagarPorRetenciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionesPorPagarPorRetenciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRetencionesPorPagarPorRetenciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRetencionesPorPagarPorRetenciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRetencionesPorPagarPorRetenciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRetencionesPorPagarPorRetenciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRetencionesPorPagarPorRetenciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRetencionesPorPagarPorRetenciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionesPorPagarPorRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRetencionesPorPagarPorRetenciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRetencionesPorPagarPorRetenciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRetencionesPorPagarPorRetenciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRetencionesPorPagarPorRetenciones.add(this.jMenuItemCerrarRetencionesPorPagarPorRetenciones);
			
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemNuevoRetencionesPorPagarPorRetenciones);
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones);
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones);
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones);		
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones);		
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemCopiarRetencionesPorPagarPorRetenciones);		
			this.jmenuAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemVerFormRetencionesPorPagarPorRetenciones);		
			
			this.jmenuDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones);				
			this.jmenuDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones);				
			this.jmenuDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones);				
			this.jmenuDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones);				
			this.jmenuDatosRetencionesPorPagarPorRetenciones.add(this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRetencionesPorPagarPorRetenciones.add(this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRetencionesPorPagarPorRetenciones.add(this.jmenuArchivoRetencionesPorPagarPorRetenciones);		
			this.jmenuBarRetencionesPorPagarPorRetenciones.add(this.jmenuAccionesRetencionesPorPagarPorRetenciones);		
			this.jmenuBarRetencionesPorPagarPorRetenciones.add(this.jmenuDatosRetencionesPorPagarPorRetenciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRetencionesPorPagarPorRetenciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRetencionesPorPagarPorRetenciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setToolTipText("Buscar Por Ejercicio Por Periodo Por Es Debito ");
		this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JButtonMe();
		this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setToolTipText("Buscar Por Ejercicio Por Periodo Por Es Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,"buscar_button","Buscar Por Ejercicio Por Periodo Por Es Debito ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones = new JLabelMe();
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones = new JLabelMe();
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setText("Periodo :");
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setToolTipText("Periodo");
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JComboBoxMe();
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones = new JLabelMe();
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setText("Es Debito :");
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setToolTipText("Es Debito");
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new JCheckBoxMe();
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones=new JTabbedPane();


		this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRetencionesPorPagarPorRetenciones = new RetencionesPorPagarPorRetencionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retenciones Por Pagar Por Retenciones DATOS");
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones = new RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(jDesktopPane,this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones(),this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones = null;//new RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionesPorPagarPorRetenciones= new GridBagLayout();
		
		
		this.jTableDatosRetencionesPorPagarPorRetenciones = new JTableMe();      
		
		String sToolTipRetencionesPorPagarPorRetenciones="";
		sToolTipRetencionesPorPagarPorRetenciones=RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionesPorPagarPorRetenciones+="(Contabilidad.RetencionesPorPagarPorRetenciones)";
		}
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionesPorPagarPorRetenciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.setToolTipText(sToolTipRetencionesPorPagarPorRetenciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRetencionesPorPagarPorRetenciones);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setAutoCreateRowSorter(true);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionAllowed(true);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRetencionesPorPagarPorRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonCopiarRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonVerFormRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonCerrarRetencionesPorPagarPorRetenciones = new JButtonMe();
		
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Retenciones Por Pagar Por Retenciones";
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesRetencionesPorPagarPorRetenciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones=new ReporteDinamicoJInternalFrame(RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRetencionesPorPagarPorRetenciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones=new ImportacionJInternalFrame(RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRetencionesPorPagarPorRetenciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones = new JButtonMe();
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setText("Orden");
		this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,false,this);
			
			//this.cargarOrderByRetencionesPorPagarPorRetenciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,true,this);
			
			//this.cargarOrderByRetencionesPorPagarPorRetenciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRetencionesPorPagarPorRetenciones.setText("Nuevo");
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones.setText("Duplicar");
		this.jButtonCopiarRetencionesPorPagarPorRetenciones.setText("Copiar");
		this.jButtonVerFormRetencionesPorPagarPorRetenciones.setText("Ver");
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setText("Guardar");
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionesPorPagarPorRetenciones,"nuevo_button","Nuevo",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRetencionesPorPagarPorRetenciones,"duplicar_button","Duplicar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRetencionesPorPagarPorRetenciones,"copiar_button","Copiar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRetencionesPorPagarPorRetenciones,"ver_form","Ver",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones,"nuevorelaciones_button","Nuevo Rel",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones,"guardarcambiostabla_button","Guardar",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionesPorPagarPorRetenciones,"cerrar_button","Salir",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.setToolTipText("Nuevo"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones.setToolTipText("Duplicar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRetencionesPorPagarPorRetenciones.setToolTipText("Copiar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRetencionesPorPagarPorRetenciones.setToolTipText("Ver"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.setToolTipText("Nuevo Rel"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setToolTipText("Guardar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.setToolTipText("Salir"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionesPorPagarPorRetenciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonDuplicarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRetencionesPorPagarPorRetenciones"));
		
		//COPIAR
		sMapKey = "CopiarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCopiarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRetencionesPorPagarPorRetenciones"));
		
		//VEr FORM
		sMapKey = "VerFormRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonVerFormRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRetencionesPorPagarPorRetenciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRetencionesPorPagarPorRetenciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonModificarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRetencionesPorPagarPorRetenciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionesPorPagarPorRetenciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionesPorPagarPorRetenciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setName("jPanelParametrosReportesRetencionesPorPagarPorRetenciones"); 
		
		this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones.setName("jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setText("Buscar");
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setToolTipText("Buscar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setText("Procesar");
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setToolTipText("Procesar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setVisible(false);
			
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setText("TIPO");       
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.setText("Accion");
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setText("Accion");
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setText("Accion");
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRetencionesPorPagarPorRetenciones = new JLabelMe();
		
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setText("Acciones");		
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRetencionesPorPagarPorRetenciones = new JButtonMe();
		//this.jButtonAnterioresRetencionesPorPagarPorRetenciones.setText("<<");
        this.jButtonAnterioresRetencionesPorPagarPorRetenciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRetencionesPorPagarPorRetenciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRetencionesPorPagarPorRetenciones = new JButtonMe();
		//this.jButtonSiguientesRetencionesPorPagarPorRetenciones.setText(">>");
        this.jButtonSiguientesRetencionesPorPagarPorRetenciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRetencionesPorPagarPorRetenciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones,"nuevoguardarcambios_button","Nue",this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRetencionesPorPagarPorRetenciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRetencionesPorPagarPorRetenciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonSiguientesRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRetencionesPorPagarPorRetenciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonAnterioresRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRetencionesPorPagarPorRetenciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRetencionesPorPagarPorRetenciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(this.getWidth(),RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(this.getWidth(),RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(this.getWidth(),RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRetencionesPorPagarPorRetenciones = new GridBagLayout();

			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutPaginacionRetencionesPorPagarPorRetenciones);						
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonAnterioresRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					
						
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
			
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
						
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonSiguientesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonNuevoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
						
			
			
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			}
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonDuplicarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonCopiarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonVerFormRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.add(this.jButtonCerrarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRetencionesPorPagarPorRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRetencionesPorPagarPorRetenciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RetencionesPorPagarPorRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RetencionesPorPagarPorRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RetencionesPorPagarPorRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RetencionesPorPagarPorRetenciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosReportesRetencionesPorPagarPorRetenciones);
			this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosReportesAccionesRetencionesPorPagarPorRetenciones);
			
			
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosAuxiliar1RetencionesPorPagarPorRetenciones);
			this.jPanelParametrosAuxiliar2RetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosAuxiliar2RetencionesPorPagarPorRetenciones);
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosAuxiliar3RetencionesPorPagarPorRetenciones);
			this.jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosAuxiliar4RetencionesPorPagarPorRetenciones);
			//this.jPanelParametrosAuxiliar5RetencionesPorPagarPorRetenciones.setLayout(gridaBagParametrosAuxiliar2RetencionesPorPagarPorRetenciones);			
			
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones.add(this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jPanelParametrosAuxiliar1RetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);																		
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jPanelParametrosAuxiliar4RetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jCheckBoxGenerarReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jPanelParametrosAuxiliar2RetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jLabelAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
			
			
			/*
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones.add(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);															
				
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones.add(this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);															
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones.add(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jPanelParametrosAuxiliar3RetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRetencionesPorPagarPorRetenciones = new GridBagLayout();

			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutDatosRetencionesPorPagarPorRetenciones);
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
			
			this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.add(this.jTableDatosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setViewportView(this.jTableDatosRetencionesPorPagarPorRetenciones);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setFillsViewportHeight(true);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRetencionesPorPagarPorRetenciones= new GridBagLayout();
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutAccionesRetencionesPorPagarPorRetenciones);
		
		
		/*	
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
			
		this.jPanelAccionesRetencionesPorPagarPorRetenciones.add(this.jButtonNuevoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones= new GridBagLayout();
		gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);

		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jLabelid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);

		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 0;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);


		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jLabelid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);

		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 1;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);


		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 2;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jLabeles_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);

		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 2;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);

		gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = 3;
		gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =1;
		jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.add(jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones, gridBagConstraintsRetencionesPorPagarPorRetenciones);

		jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.addTab("1.-Por Ejercicio Por Periodo Por Es Debito ", jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
		jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionesPorPagarPorRetenciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionesPorPagarPorRetenciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();						
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;		
			//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;		
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;		
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);								
		
		
		/*
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/		
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =0;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
				
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRetencionesPorPagarPorRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorRetenciones = new GridBagLayout();
			this.jPanelBusquedasParametrosRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorRetenciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
			
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRetencionesPorPagarPorRetenciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRetencionesPorPagarPorRetenciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRetencionesPorPagarPorRetenciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setName("jPanelReporteDinamicoRetencionesPorPagarPorRetenciones"); 
		
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutReporteDinamicoRetencionesPorPagarPorRetenciones);
		
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelColumnasSelectReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones = new JList<Reporte>();
		this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones=new JScrollPane(this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones);
			
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones=new JScrollPane(this.jListRelacionesSelectReporteRetencionesPorPagarPorRetenciones);
			
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelConGraficoDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelColumnaCategoriaValorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelColumnasValoresGraficoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones = new JList<Reporte>();
		this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones=new JScrollPane(this.jListColumnasValoresGraficoRetencionesPorPagarPorRetenciones);
			
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jListColumnasSelectReporteRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jScrollColumnasValoresGraficoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorRetenciones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Generar EXCEL"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Generar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorRetenciones.add(this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRetencionesPorPagarPorRetenciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones= new JScrollPane(jPanelReporteDinamicoRetencionesPorPagarPorRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRetencionesPorPagarPorRetenciones);
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getContentPane().add(this.jScrollPanelReporteDinamicoRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRetencionesPorPagarPorRetenciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRetencionesPorPagarPorRetenciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setName("jPanelImportacionRetencionesPorPagarPorRetenciones"); 
		
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutImportacionRetencionesPorPagarPorRetenciones);
		
		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setResizable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setClosable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setResizable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setClosable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jLabelArchivoImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRetencionesPorPagarPorRetenciones = new JFileChooser();		
		this.jFileChooserImportacionRetencionesPorPagarPorRetenciones.setToolTipText("ESCOGER ARCHIVO"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones.setToolTipText("Generar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones = new JLabelMe();

		this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jLabelPathArchivoImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones.setToolTipText("Generar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones = new JButtonMe();
		this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorRetenciones.add(this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRetencionesPorPagarPorRetenciones = new GridBagLayout();
		
		this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones= new JScrollPane(jPanelImportacionRetencionesPorPagarPorRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRetencionesPorPagarPorRetenciones);
		this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getContentPane().add(this.jScrollPanelImportacionRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRetencionesPorPagarPorRetenciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones = new JButtonMe();
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setText("Orden");
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRetencionesPorPagarPorRetenciones";
			inputMap = this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRetencionesPorPagarPorRetenciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByRetencionesPorPagarPorRetenciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRetencionesPorPagarPorRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setName("jPanelOrderByRetencionesPorPagarPorRetenciones"); 
			
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.setLayout(gridaBagLayoutOrderByRetencionesPorPagarPorRetenciones);
			
			
			this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy = new JTableMe();        
			this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRetencionesPorPagarPorRetencionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRetencionesPorPagarPorRetencionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRetencionesPorPagarPorRetencionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRetencionesPorPagarPorRetencionesOrderBy.setViewportView(this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy);
			this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRetencionesPorPagarPorRetenciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setTitle("Orden");
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setResizable(true);
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setClosable(true);
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Retencioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRetencionesPorPagarPorRetenciones.ipady =150;
				
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.add(jScrollPanelDatosRetencionesPorPagarPorRetencionesOrderBy, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);//this.jTableDatosRetencionesPorPagarPorRetencionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones = new JButtonMe();
			this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRetencionesPorPagarPorRetenciones.add(this.jButtonCerrarOrderByRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRetencionesPorPagarPorRetenciones = new GridBagLayout();
			
			this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones= new JScrollPane(jPanelOrderByRetencionesPorPagarPorRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorRetenciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRetencionesPorPagarPorRetenciones);
			
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getContentPane().add(this.jScrollPanelOrderByRetencionesPorPagarPorRetenciones, this.gridBagConstraintsRetencionesPorPagarPorRetenciones);			
		
		} else {
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosRetencionesPorPagarPorRetenciones.getRowHeight();//RetencionesPorPagarPorRetencionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.isSelected()) {
					iHeightTable=RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorRetenciones.isSelected()) {
					iHeightTable=RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionesPorPagarPorRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy()!=null) {
			//if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporretencioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RetencionesPorPagarPorRetenciones> TraerRetencionesPorPagarPorRetencionesBeans(List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencioness) {
					
				if(!(RetencionesPorPagarPorRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RetencionesPorPagarPorRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					retencionesporpagarporretenciones.setsDetalleGeneralEntityReporte(RetencionesPorPagarPorRetencionesConstantesFunciones.getRetencionesPorPagarPorRetencionesDescripcion(retencionesporpagarporretenciones));
										
					retencionesporpagarporretenciones.setes_debito_dato_descripcion(RetencionesPorPagarPorRetencionesConstantesFunciones.getes_debito_datoDescripcion(retencionesporpagarporretenciones));	
					
						
					
				} else  {
							
					//retencionesporpagarporretenciones.setsDetalleGeneralEntityReporte(retencionesporpagarporretenciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//retencionesporpagarporretencionesbeans.add(retencionesporpagarporretencionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return retencionesporpagarporretencioness;
    }
	//PARA REPORTES FIN
}
