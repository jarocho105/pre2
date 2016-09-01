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
import com.bydan.erp.contabilidad.util.report.EstadosResultadosPerdidasGananciasConstantesFunciones;

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
public class EstadosResultadosPerdidasGananciasJInternalFrame extends EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadosResultadosPerdidasGanancias;
	
	protected JMenuBar jmenuBarEstadosResultadosPerdidasGanancias;
	
	protected JMenu jmenuEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuDatosEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuArchivoEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuAccionesEstadosResultadosPerdidasGanancias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadosResultadosPerdidasGanancias;	
	protected GridBagConstraints gridBagConstraintsEstadosResultadosPerdidasGanancias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadosResultadosPerdidasGanancias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivelcuenta="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public EstadosResultadosPerdidasGananciasSessionBean estadosresultadosperdidasgananciasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelCuentaSessionBean nivelcuentaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass;		
	public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassEliminados;	
	public List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadosResultadosPerdidasGanancias;		
	protected JButton jButtonAbrirOrderByEstadosResultadosPerdidasGanancias;
	
	
	//protected JPanel jPanelOrderByEstadosResultadosPerdidasGanancias;
	//public JScrollPane jScrollPanelOrderByEstadosResultadosPerdidasGanancias;	
	//protected JButton jButtonCerrarOrderByEstadosResultadosPerdidasGanancias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadosResultadosPerdidasGananciasLogic estadosresultadosperdidasgananciasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadosResultadosPerdidasGanancias;
	public JScrollPane jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias;
	public JScrollPane jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadosResultadosPerdidasGananciasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias;
	//public JScrollPane jScrollPanelImportacionEstadosResultadosPerdidasGanancias;
	
	
	
	protected JPanel jPanelAccionesEstadosResultadosPerdidasGanancias;
	
    protected JPanel jPanelPaginacionEstadosResultadosPerdidasGanancias;
    protected JPanel jPanelParametrosReportesEstadosResultadosPerdidasGanancias;
	protected JPanel jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias;
	protected JPanel jPanelParametrosAuxiliar2EstadosResultadosPerdidasGanancias;
	protected JPanel jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias;
	protected JPanel jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias;
	//protected JPanel jPanelParametrosAuxiliar5EstadosResultadosPerdidasGanancias;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadosResultadosPerdidasGanancias;
	//protected JPanel jPanelImportacionEstadosResultadosPerdidasGanancias;
	
	
	public JTable jTableDatosEstadosResultadosPerdidasGanancias;
	
	
	
	//public JTable jTableDatosEstadosResultadosPerdidasGananciasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadosResultadosPerdidasGanancias;
	protected JButton jButtonDuplicarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCopiarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonVerFormEstadosResultadosPerdidasGanancias;
	protected JButton jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias;
	protected JButton jButtonModificarEstadosResultadosPerdidasGanancias;
	
    protected JButton jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCerrarEstadosResultadosPerdidasGanancias;
	
	
	protected JButton jButtonRecargarInformacionEstadosResultadosPerdidasGanancias;
	protected JButton jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	
	
	protected JButton jButtonAnterioresEstadosResultadosPerdidasGanancias;
	protected JButton jButtonSiguientesEstadosResultadosPerdidasGanancias;
	protected JButton jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias;
	//protected JButton jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadosResultadosPerdidasGanancias;
	//protected JButton jButtonGenerarImportacionEstadosResultadosPerdidasGanancias;
	//protected JButton jButtonCerrarImportacionEstadosResultadosPerdidasGanancias;
	//protected JFileChooser jFileChooserImportacionEstadosResultadosPerdidasGanancias;
	//protected File fileImportacionEstadosResultadosPerdidasGanancias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonDuplicarToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCopiarToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonVerFormToolBarEstadosResultadosPerdidasGanancias;
	public JButton jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCerrarToolBarEstadosResultadosPerdidasGanancias;
	
	protected JButton jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonProcesarInformacionToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonAnterioresToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonSiguientesToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonAbrirOrderByToolBarEstadosResultadosPerdidasGanancias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDuplicarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemCopiarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemVerFormEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemCerrarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemProcesarInformacionEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemAnterioresEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemSiguientesEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadosResultadosPerdidasGanancias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias;
	protected JCheckBox jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias;
	protected JCheckBox jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadosResultadosPerdidasGanancias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias;
	protected JTextField jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias;
	//public JList<Reporte> jListColumnasSelectReporteEstadosResultadosPerdidasGanancias;
	//public JScrollPane jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias;
	
	//public JLabel jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias;
	//public JList<Reporte> jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias;
	//public JScrollPane jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias;
	
		
	//public JLabel jLabelArchivoImportacionEstadosResultadosPerdidasGanancias;	
	//public JLabel jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias;
	//protected JTextField jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias;
	
	//public JLabel jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias;
	
	//public JLabel jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias;
	//public JList<Reporte> jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias;
	//public JScrollPane jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias;
	public JPanel jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JButton jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	
	public JPanel jPanelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadosResultadosPerdidasGananciasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadosResultadosPerdidasGanancias)	{
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias = jButtonRecargarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	public JButton getjButtonProcesarInformacionEstadosResultadosPerdidasGanancias() {
		return this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadosResultadosPerdidasGanancias)	{
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias = jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadosResultadosPerdidasGanancias() {
		return this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	
	public List<EstadosResultadosPerdidasGanancias> getestadosresultadosperdidasgananciass() {
		return this.estadosresultadosperdidasgananciass;
	}

	public void setestadosresultadosperdidasgananciass(List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass) {
		this.estadosresultadosperdidasgananciass = estadosresultadosperdidasgananciass;
	}
	
	public List<EstadosResultadosPerdidasGanancias> getestadosresultadosperdidasgananciassAux() {
		return this.estadosresultadosperdidasgananciassAux;
	}

	public void setestadosresultadosperdidasgananciassAux(List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassAux) {
		this.estadosresultadosperdidasgananciassAux = estadosresultadosperdidasgananciassAux;
	}
	
	public List<EstadosResultadosPerdidasGanancias> getestadosresultadosperdidasgananciassEliminados() {
		return this.estadosresultadosperdidasgananciassEliminados;
	}

	public void setEstadosResultadosPerdidasGananciassEliminados(List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciassEliminados) {
		this.estadosresultadosperdidasgananciassEliminados = estadosresultadosperdidasgananciassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias() {
		return jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias = jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias() {
		return jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias;
	}

	public void setjTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias(
			JTextField jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias) {
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias = jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias;
	}

	public void setBorderResaltarValorCampoGeneralEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias() {
		return this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias;
	}

	public void setjCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias(
			JCheckBox jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias) {
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias = jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias;
	}

	public void setBorderResaltarSeleccionarTodosEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias() {
		return this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias;
	}

	public void setjCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias(
			JCheckBox jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias) {
		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias = jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias;
	}
	
	public void setBorderResaltarSeleccionadosEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias = jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias;
	}

	public void setBorderResaltarTiposArchivosReportesEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposReportesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias = jComboBoxTiposReportesEstadosResultadosPerdidasGanancias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias() {
	//	return jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias) {
	//	this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias = jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias = jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias;
	//}
	
	public void setBorderResaltarTiposReportesEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias = jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias = jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias;
	}
	
	public void setBorderResaltarTiposPaginacionEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias = jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias = jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	}
	
	public void setBorderResaltarTiposRelacionesEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadosResultadosPerdidasGanancias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias() {
	//	return jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias) {
	//	this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias = jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadosResultadosPerdidasGanancias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadosResultadosPerdidasGanancias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias .setBorder(borderResaltar);		
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
		this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
		
		this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosresultadosperdidasgananciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadosResultadosPerdidasGananciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estados Resultados Perdidas Ganancias MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadosResultadosPerdidasGananciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadosResultadosPerdidasGanancias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"nuevo","nuevo","Nuevo"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"duplicar","duplicar","Duplicar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"copiar","copiar","Copiar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"ver_form","ver_form","Ver"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"recargar","recargar","Buscar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarEstadosResultadosPerdidasGanancias,
							"cerrar","cerrar","Salir"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadosResultadosPerdidasGanancias;
			
				this.jButtonProcesarInformacionToolBarEstadosResultadosPerdidasGanancias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadosResultadosPerdidasGanancias;
				
		//protected JButton jButtonModificarToolBarEstadosResultadosPerdidasGanancias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadosResultadosPerdidasGanancias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadosResultadosPerdidasGanancias=new JMenuMe("General");
		this.jmenuArchivoEstadosResultadosPerdidasGanancias=new JMenuMe("Archivo");
		this.jmenuAccionesEstadosResultadosPerdidasGanancias=new JMenuMe("Acciones");
		this.jmenuDatosEstadosResultadosPerdidasGanancias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadosResultadosPerdidasGanancias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadosResultadosPerdidasGanancias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadosResultadosPerdidasGanancias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadosResultadosPerdidasGanancias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadosResultadosPerdidasGanancias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadosResultadosPerdidasGanancias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadosResultadosPerdidasGanancias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadosResultadosPerdidasGanancias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadosResultadosPerdidasGanancias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadosResultadosPerdidasGanancias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadosResultadosPerdidasGanancias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadosResultadosPerdidasGanancias.add(this.jMenuItemCerrarEstadosResultadosPerdidasGanancias);
			
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemNuevoEstadosResultadosPerdidasGanancias);
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias);
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemNuevoRelacionesEstadosResultadosPerdidasGanancias);
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias);		
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemDuplicarEstadosResultadosPerdidasGanancias);		
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemCopiarEstadosResultadosPerdidasGanancias);		
			this.jmenuAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemVerFormEstadosResultadosPerdidasGanancias);		
			
			this.jmenuDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemRecargarInformacionEstadosResultadosPerdidasGanancias);				
			this.jmenuDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemAnterioresEstadosResultadosPerdidasGanancias);				
			this.jmenuDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemSiguientesEstadosResultadosPerdidasGanancias);				
			this.jmenuDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemAbrirOrderByEstadosResultadosPerdidasGanancias);				
			this.jmenuDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadosResultadosPerdidasGanancias.add(this.jmenuArchivoEstadosResultadosPerdidasGanancias);		
			this.jmenuBarEstadosResultadosPerdidasGanancias.add(this.jmenuAccionesEstadosResultadosPerdidasGanancias);		
			this.jmenuBarEstadosResultadosPerdidasGanancias.add(this.jmenuDatosEstadosResultadosPerdidasGanancias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadosResultadosPerdidasGanancias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadosResultadosPerdidasGanancias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setToolTipText("Buscar Por Nivel Cuenta Por Ejercicio Por Periodo ");
		this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JButtonMe();
		this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setToolTipText("Buscar Por Nivel Cuenta Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,"buscar_button","Buscar Por Nivel Cuenta Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias = new JLabelMe();
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setText("Nivel Cuenta :");
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setToolTipText("Nivel Cuenta");
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias = new JLabelMe();
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias = new JLabelMe();
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setText("Periodo :");
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setToolTipText("Periodo");
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadosResultadosPerdidasGanancias = new EstadosResultadosPerdidasGananciasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estados Resultados Perdidas Ganancias DATOS");
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias = new EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(jDesktopPane,this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones(),this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadosResultadosPerdidasGanancias = null;//new EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias= new GridBagLayout();
		
		
		this.jTableDatosEstadosResultadosPerdidasGanancias = new JTableMe();      
		
		String sToolTipEstadosResultadosPerdidasGanancias="";
		sToolTipEstadosResultadosPerdidasGanancias=EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadosResultadosPerdidasGanancias+="(Contabilidad.EstadosResultadosPerdidasGanancias)";
		}
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadosResultadosPerdidasGanancias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.setToolTipText(sToolTipEstadosResultadosPerdidasGanancias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadosResultadosPerdidasGanancias);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setAutoCreateRowSorter(true);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadosResultadosPerdidasGanancias.setRowSelectionAllowed(true);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonCopiarEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonVerFormEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonCerrarEstadosResultadosPerdidasGanancias = new JButtonMe();
		
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estados Resultados Perdidas Ganancias";
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setToolTipText("Acciones");
        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias=new ReporteDinamicoJInternalFrame(EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadosResultadosPerdidasGanancias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias=new ImportacionJInternalFrame(EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadosResultadosPerdidasGanancias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setText("Orden");
		this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,false,this);
			
			//this.cargarOrderByEstadosResultadosPerdidasGanancias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,true,this);
			
			//this.cargarOrderByEstadosResultadosPerdidasGanancias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadosResultadosPerdidasGanancias.setText("Nuevo");
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias.setText("Duplicar");
		this.jButtonCopiarEstadosResultadosPerdidasGanancias.setText("Copiar");
		this.jButtonVerFormEstadosResultadosPerdidasGanancias.setText("Ver");
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setText("Guardar");
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadosResultadosPerdidasGanancias,"nuevo_button","Nuevo",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadosResultadosPerdidasGanancias,"duplicar_button","Duplicar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadosResultadosPerdidasGanancias,"copiar_button","Copiar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadosResultadosPerdidasGanancias,"ver_form","Ver",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias,"nuevorelaciones_button","Nuevo Rel",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias,"guardarcambiostabla_button","Guardar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadosResultadosPerdidasGanancias,"cerrar_button","Salir",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.setToolTipText("Nuevo"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias.setToolTipText("Duplicar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadosResultadosPerdidasGanancias.setToolTipText("Copiar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadosResultadosPerdidasGanancias.setToolTipText("Ver"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.setToolTipText("Nuevo Rel"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setToolTipText("Guardar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.setToolTipText("Salir"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadosResultadosPerdidasGanancias"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonDuplicarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadosResultadosPerdidasGanancias"));
		
		//COPIAR
		sMapKey = "CopiarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCopiarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadosResultadosPerdidasGanancias"));
		
		//VEr FORM
		sMapKey = "VerFormEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonVerFormEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadosResultadosPerdidasGanancias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadosResultadosPerdidasGanancias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonModificarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadosResultadosPerdidasGanancias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCerrarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadosResultadosPerdidasGanancias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadosResultadosPerdidasGanancias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setName("jPanelParametrosReportesEstadosResultadosPerdidasGanancias"); 
		
		this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias.setName("jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setToolTipText("Buscar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setVisible(false);
		
		
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setText("Procesar");
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setToolTipText("Procesar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setVisible(false);
			
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setText("TIPO");       
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.setText("Accion");
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setText("Accion");
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadosResultadosPerdidasGanancias = new JLabelMe();
		
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setText("Acciones");		
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadosResultadosPerdidasGanancias = new JButtonMe();
		//this.jButtonAnterioresEstadosResultadosPerdidasGanancias.setText("<<");
        this.jButtonAnterioresEstadosResultadosPerdidasGanancias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadosResultadosPerdidasGanancias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadosResultadosPerdidasGanancias = new JButtonMe();
		//this.jButtonSiguientesEstadosResultadosPerdidasGanancias.setText(">>");
        this.jButtonSiguientesEstadosResultadosPerdidasGanancias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadosResultadosPerdidasGanancias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias,"nuevoguardarcambios_button","Nue",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadosResultadosPerdidasGanancias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadosResultadosPerdidasGanancias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonSiguientesEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadosResultadosPerdidasGanancias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonAnterioresEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadosResultadosPerdidasGanancias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadosResultadosPerdidasGanancias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(this.getWidth(),EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(this.getWidth(),EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(this.getWidth(),EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosResultadosPerdidasGananciasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadosResultadosPerdidasGanancias = new GridBagLayout();

			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutPaginacionEstadosResultadosPerdidasGanancias);						
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonAnterioresEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					
						
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
			
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonNuevoGuardarCambiosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
						
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonSiguientesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonNuevoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
						
			
			
			if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			}
			
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonDuplicarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonCopiarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonVerFormEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadosResultadosPerdidasGanancias.add(this.jButtonCerrarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadosResultadosPerdidasGanancias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadosResultadosPerdidasGanancias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadosResultadosPerdidasGanancias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadosResultadosPerdidasGanancias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadosResultadosPerdidasGanancias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadosResultadosPerdidasGanancias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosReportesEstadosResultadosPerdidasGanancias);
			this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosReportesAccionesEstadosResultadosPerdidasGanancias);
			
			
			this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosAuxiliar1EstadosResultadosPerdidasGanancias);
			this.jPanelParametrosAuxiliar2EstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosAuxiliar2EstadosResultadosPerdidasGanancias);
			this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosAuxiliar3EstadosResultadosPerdidasGanancias);
			this.jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosAuxiliar4EstadosResultadosPerdidasGanancias);
			//this.jPanelParametrosAuxiliar5EstadosResultadosPerdidasGanancias.setLayout(gridaBagParametrosAuxiliar2EstadosResultadosPerdidasGanancias);			
			
			
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jButtonRecargarInformacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposPaginacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias.add(this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposArchivosReportesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jPanelParametrosAuxiliar1EstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);																		
			
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposGraficosReportesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jPanelParametrosAuxiliar4EstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposReportesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jCheckBoxGenerarReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jPanelParametrosAuxiliar2EstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jLabelAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposSeleccionarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
			
			
			/*
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias.add(this.jCheckBoxSeleccionarTodosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);															
				
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias.add(this.jCheckBoxSeleccionadosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);															
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias.add(this.jCheckBoxConGraficoReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jPanelParametrosAuxiliar3EstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadosResultadosPerdidasGanancias = new GridBagLayout();

			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutDatosEstadosResultadosPerdidasGanancias);
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
			
			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.add(this.jTableDatosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setViewportView(this.jTableDatosEstadosResultadosPerdidasGanancias);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setFillsViewportHeight(true);
		this.jTableDatosEstadosResultadosPerdidasGanancias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadosResultadosPerdidasGanancias= new GridBagLayout();
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutAccionesEstadosResultadosPerdidasGanancias);
		
		
		/*	
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
			
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonNuevoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias= new GridBagLayout();
		gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);

		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jLabelid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);

		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jComboBoxid_nivel_cuentaBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);


		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jLabelid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);

		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 1;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jComboBoxid_ejercicioBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);


		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 2;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jLabelid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);

		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 2;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jComboBoxid_periodoBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);

		gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 3;
		gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =1;
		jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias.add(jButtonBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);

		jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.addTab("1.-Por Nivel Cuenta Por Ejercicio Por Periodo ", jPanelBusquedaEstadosResultadosPerdidasGananciasEstadosResultadosPerdidasGanancias);
		jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadosResultadosPerdidasGanancias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();						
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;		
			//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;		
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);								
		
		
		/*
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/		
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
				
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadosResultadosPerdidasGanancias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadosResultadosPerdidasGanancias = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutBusquedasParametrosEstadosResultadosPerdidasGanancias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadosResultadosPerdidasGanancias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadosResultadosPerdidasGanancias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setName("jPanelReporteDinamicoEstadosResultadosPerdidasGanancias"); 
		
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutReporteDinamicoEstadosResultadosPerdidasGanancias);
		
		
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelColumnasSelectReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias=new JScrollPane(this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias);
			
			this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias=new JScrollPane(this.jListRelacionesSelectReporteEstadosResultadosPerdidasGanancias);
			
			this.jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelConGraficoDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jCheckBoxConGraficoDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelColumnaCategoriaValorEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jComboBoxColumnaCategoriaValorEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelColumnasValoresGraficoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias = new JList<Reporte>();
		this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias=new JScrollPane(this.jListColumnasValoresGraficoEstadosResultadosPerdidasGanancias);
			
			this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jListColumnasSelectReporteEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jScrollColumnasValoresGraficoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadosResultadosPerdidasGanancias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposGraficosReportesDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Generar EXCEL"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jButtonGenerarExcelReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposReportesDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jLabelTiposArchivoReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposArchivosReportesDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Generar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jButtonGenerarReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias.setToolTipText("Cancelar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosResultadosPerdidasGanancias.add(this.jButtonCerrarReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadosResultadosPerdidasGanancias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias= new JScrollPane(jPanelReporteDinamicoEstadosResultadosPerdidasGanancias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadosResultadosPerdidasGanancias);
		this.jInternalFrameReporteDinamicoEstadosResultadosPerdidasGanancias.getContentPane().add(this.jScrollPanelReporteDinamicoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadosResultadosPerdidasGanancias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadosResultadosPerdidasGanancias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setName("jPanelImportacionEstadosResultadosPerdidasGanancias"); 
		
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutImportacionEstadosResultadosPerdidasGanancias);
		
		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setResizable(true);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setClosable(true);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setResizable(true);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setClosable(true);
	    this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jLabelArchivoImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadosResultadosPerdidasGanancias = new JFileChooser();		
		this.jFileChooserImportacionEstadosResultadosPerdidasGanancias.setToolTipText("ESCOGER ARCHIVO"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias.setToolTipText("Generar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jButtonAbrirImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jLabelPathArchivoImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jTextFieldPathArchivoImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias.setToolTipText("Generar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jButtonGenerarImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias.setToolTipText("Cancelar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosResultadosPerdidasGanancias.add(this.jButtonCerrarImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadosResultadosPerdidasGanancias = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias= new JScrollPane(jPanelImportacionEstadosResultadosPerdidasGanancias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadosResultadosPerdidasGanancias);
		this.jInternalFrameImportacionEstadosResultadosPerdidasGanancias.getContentPane().add(this.jScrollPanelImportacionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadosResultadosPerdidasGanancias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias = new JButtonMe();
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setText("Orden");
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadosResultadosPerdidasGanancias";
			inputMap = this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadosResultadosPerdidasGanancias"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadosResultadosPerdidasGanancias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setName("jPanelOrderByEstadosResultadosPerdidasGanancias"); 
			
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutOrderByEstadosResultadosPerdidasGanancias);
			
			
			this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy = new JTableMe();        
			this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadosResultadosPerdidasGananciasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadosResultadosPerdidasGananciasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadosResultadosPerdidasGananciasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadosResultadosPerdidasGananciasOrderBy.setViewportView(this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy);
			this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadosResultadosPerdidasGananciasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadosResultadosPerdidasGanancias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setTitle("Orden");
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setResizable(true);
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setClosable(true);
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipady =150;
				
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.add(jScrollPanelDatosEstadosResultadosPerdidasGananciasOrderBy, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);//this.jTableDatosEstadosResultadosPerdidasGananciasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias = new JButtonMe();
			this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias.setToolTipText("Cancelar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadosResultadosPerdidasGanancias.add(this.jButtonCerrarOrderByEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadosResultadosPerdidasGanancias = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias= new JScrollPane(jPanelOrderByEstadosResultadosPerdidasGanancias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadosResultadosPerdidasGanancias);
			
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getContentPane().add(this.jScrollPanelOrderByEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
		
		} else {
			this.jButtonAbrirOrderByEstadosResultadosPerdidasGanancias = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadosResultadosPerdidasGanancias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEstadosResultadosPerdidasGanancias.getRowHeight();//EstadosResultadosPerdidasGananciasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.isSelected()) {
					iHeightTable=EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadosResultadosPerdidasGanancias.isSelected()) {
					iHeightTable=EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadosResultadosPerdidasGananciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias!=null && this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy()!=null) {
			//if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadosResultadosPerdidasGanancias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=estadosresultadosperdidasgananciasLogic.getEstadosResultadosPerdidasGananciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosresultadosperdidasgananciass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadosResultadosPerdidasGanancias> TraerEstadosResultadosPerdidasGananciasBeans(List<EstadosResultadosPerdidasGanancias> estadosresultadosperdidasgananciass,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadosResultadosPerdidasGanancias estadosresultadosperdidasganancias:estadosresultadosperdidasgananciass) {
					
				if(!(EstadosResultadosPerdidasGananciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadosResultadosPerdidasGananciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadosresultadosperdidasganancias.setsDetalleGeneralEntityReporte(EstadosResultadosPerdidasGananciasConstantesFunciones.getEstadosResultadosPerdidasGananciasDescripcion(estadosresultadosperdidasganancias));
										
						
					
						
					
				} else  {
							
					//estadosresultadosperdidasganancias.setsDetalleGeneralEntityReporte(estadosresultadosperdidasganancias.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadosresultadosperdidasgananciasbeans.add(estadosresultadosperdidasgananciasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadosresultadosperdidasgananciass;
    }
	//PARA REPORTES FIN
}
