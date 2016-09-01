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
import com.bydan.erp.contabilidad.util.report.ProcesoAsientoInicialEjercicioConstantesFunciones;

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
public class ProcesoAsientoInicialEjercicioJInternalFrame extends ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoAsientoInicialEjercicio;
	
	protected JMenuBar jmenuBarProcesoAsientoInicialEjercicio;
	
	protected JMenu jmenuProcesoAsientoInicialEjercicio;
	protected JMenu jmenuDatosProcesoAsientoInicialEjercicio;
	protected JMenu jmenuArchivoProcesoAsientoInicialEjercicio;
	protected JMenu jmenuAccionesProcesoAsientoInicialEjercicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoAsientoInicialEjercicio;	
	protected GridBagConstraints gridBagConstraintsProcesoAsientoInicialEjercicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoAsientoInicialEjercicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoAsientoInicialEjercicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesoAsientoInicialEjercicioSessionBean procesoasientoinicialejercicioSessionBean;
		
	
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios;		
	public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosEliminados;	
	public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoAsientoInicialEjercicio;		
	protected JButton jButtonAbrirOrderByProcesoAsientoInicialEjercicio;
	
	
	//protected JPanel jPanelOrderByProcesoAsientoInicialEjercicio;
	//public JScrollPane jScrollPanelOrderByProcesoAsientoInicialEjercicio;	
	//protected JButton jButtonCerrarOrderByProcesoAsientoInicialEjercicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoAsientoInicialEjercicioLogic procesoasientoinicialejercicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoAsientoInicialEjercicio;
	public JScrollPane jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio;
	public JScrollPane jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoAsientoInicialEjercicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio;
	//public JScrollPane jScrollPanelImportacionProcesoAsientoInicialEjercicio;
	
	
	
	protected JPanel jPanelAccionesProcesoAsientoInicialEjercicio;
	
    protected JPanel jPanelPaginacionProcesoAsientoInicialEjercicio;
    protected JPanel jPanelParametrosReportesProcesoAsientoInicialEjercicio;
	protected JPanel jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio;
	protected JPanel jPanelParametrosAuxiliar2ProcesoAsientoInicialEjercicio;
	protected JPanel jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio;
	protected JPanel jPanelParametrosAuxiliar4ProcesoAsientoInicialEjercicio;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoAsientoInicialEjercicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoAsientoInicialEjercicio;
	//protected JPanel jPanelImportacionProcesoAsientoInicialEjercicio;
	
	
	public JTable jTableDatosProcesoAsientoInicialEjercicio;
	
	
	
	//public JTable jTableDatosProcesoAsientoInicialEjercicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoAsientoInicialEjercicio;
	protected JButton jButtonDuplicarProcesoAsientoInicialEjercicio;
	protected JButton jButtonCopiarProcesoAsientoInicialEjercicio;
	protected JButton jButtonVerFormProcesoAsientoInicialEjercicio;
	protected JButton jButtonNuevoRelacionesProcesoAsientoInicialEjercicio;
	protected JButton jButtonModificarProcesoAsientoInicialEjercicio;
	
    protected JButton jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio;
	protected JButton jButtonCerrarProcesoAsientoInicialEjercicio;
	
	
	protected JButton jButtonRecargarInformacionProcesoAsientoInicialEjercicio;
	protected JButton jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	
	
	protected JButton jButtonAnterioresProcesoAsientoInicialEjercicio;
	protected JButton jButtonSiguientesProcesoAsientoInicialEjercicio;
	protected JButton jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio;
	//protected JButton jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoAsientoInicialEjercicio;
	//protected JButton jButtonGenerarImportacionProcesoAsientoInicialEjercicio;
	//protected JButton jButtonCerrarImportacionProcesoAsientoInicialEjercicio;
	//protected JFileChooser jFileChooserImportacionProcesoAsientoInicialEjercicio;
	//protected File fileImportacionProcesoAsientoInicialEjercicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonDuplicarToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonCopiarToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonVerFormToolBarProcesoAsientoInicialEjercicio;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonCerrarToolBarProcesoAsientoInicialEjercicio;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonProcesarInformacionToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonAnterioresToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonSiguientesToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonAbrirOrderByToolBarProcesoAsientoInicialEjercicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDuplicarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemCopiarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemVerFormProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemCerrarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemProcesarInformacionProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemAnterioresProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemSiguientesProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoAsientoInicialEjercicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio;
	protected JCheckBox jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoAsientoInicialEjercicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio;
	protected JTextField jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio;
	//public JList<Reporte> jListColumnasSelectReporteProcesoAsientoInicialEjercicio;
	//public JScrollPane jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoAsientoInicialEjercicio;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoAsientoInicialEjercicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio;
	
		
	//public JLabel jLabelArchivoImportacionProcesoAsientoInicialEjercicio;	
	//public JLabel jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoAsientoInicialEjercicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoAsientoInicialEjercicio;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoAsientoInicialEjercicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoAsientoInicialEjercicio;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoAsientoInicialEjercicio;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoAsientoInicialEjercicio;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoAsientoInicialEjercicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoAsientoInicialEjercicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoAsientoInicialEjercicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoAsientoInicialEjercicio;
	public JPanel jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JButton jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	
	public JPanel jPanelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JLabel jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JButton jButtonid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JLabel jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;

	public JDateChooser jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JButton jButtonfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JLabel jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	//public JFormattedTextField jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;

	public JDateChooser jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio;
	public JButton jButtonfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoAsientoInicialEjercicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoAsientoInicialEjercicio)	{
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio = jButtonRecargarInformacionProcesoAsientoInicialEjercicio;
	}
	
	public JButton getjButtonProcesarInformacionProcesoAsientoInicialEjercicio() {
		return this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoAsientoInicialEjercicio)	{
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio = jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoAsientoInicialEjercicio() {
		return this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio;
	}
	
	
	public List<ProcesoAsientoInicialEjercicio> getprocesoasientoinicialejercicios() {
		return this.procesoasientoinicialejercicios;
	}

	public void setprocesoasientoinicialejercicios(List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios) {
		this.procesoasientoinicialejercicios = procesoasientoinicialejercicios;
	}
	
	public List<ProcesoAsientoInicialEjercicio> getprocesoasientoinicialejerciciosAux() {
		return this.procesoasientoinicialejerciciosAux;
	}

	public void setprocesoasientoinicialejerciciosAux(List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosAux) {
		this.procesoasientoinicialejerciciosAux = procesoasientoinicialejerciciosAux;
	}
	
	public List<ProcesoAsientoInicialEjercicio> getprocesoasientoinicialejerciciosEliminados() {
		return this.procesoasientoinicialejerciciosEliminados;
	}

	public void setProcesoAsientoInicialEjerciciosEliminados(List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosEliminados) {
		this.procesoasientoinicialejerciciosEliminados = procesoasientoinicialejerciciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio() {
		return jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio = jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio() {
		return jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio;
	}

	public void setjTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio(
			JTextField jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio) {
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio = jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio;
	}

	public void setBorderResaltarValorCampoGeneralProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio() {
		return this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio;
	}

	public void setjCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio(
			JCheckBox jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio) {
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio = jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio;
	}

	public void setBorderResaltarSeleccionarTodosProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoAsientoInicialEjercicio() {
		return this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio;
	}

	public void setjCheckBoxSeleccionadosProcesoAsientoInicialEjercicio(
			JCheckBox jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio) {
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio = jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio;
	}
	
	public void setBorderResaltarSeleccionadosProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio = jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposReportesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio = jComboBoxTiposReportesProcesoAsientoInicialEjercicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio() {
	//	return jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio) {
	//	this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio = jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio = jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio;
	//}
	
	public void setBorderResaltarTiposReportesProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio = jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio = jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio = jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposAccionesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio = jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoAsientoInicialEjercicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio() {
	//	return jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio) {
	//	this.jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio = jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoAsientoInicialEjercicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio .setBorder(borderResaltar);		
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
		this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
		
		this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoasientoinicialejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoAsientoInicialEjercicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Asiento Inicial Ejercicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoAsientoInicialEjercicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoAsientoInicialEjercicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"nuevo","nuevo","Nuevo"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"duplicar","duplicar","Duplicar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"copiar","copiar","Copiar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"ver_form","ver_form","Ver"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"recargar","recargar","Procesar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,
							"cerrar","cerrar","Salir"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio;
			
				this.jButtonProcesarInformacionToolBarProcesoAsientoInicialEjercicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoAsientoInicialEjercicio;
				
		//protected JButton jButtonModificarToolBarProcesoAsientoInicialEjercicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoAsientoInicialEjercicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoAsientoInicialEjercicio=new JMenuMe("General");
		this.jmenuArchivoProcesoAsientoInicialEjercicio=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoAsientoInicialEjercicio=new JMenuMe("Acciones");
		this.jmenuDatosProcesoAsientoInicialEjercicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoAsientoInicialEjercicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoAsientoInicialEjercicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoAsientoInicialEjercicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoAsientoInicialEjercicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoAsientoInicialEjercicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoAsientoInicialEjercicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoAsientoInicialEjercicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoAsientoInicialEjercicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoAsientoInicialEjercicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoAsientoInicialEjercicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoAsientoInicialEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoAsientoInicialEjercicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoAsientoInicialEjercicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoAsientoInicialEjercicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoAsientoInicialEjercicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoAsientoInicialEjercicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoAsientoInicialEjercicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoAsientoInicialEjercicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoAsientoInicialEjercicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoAsientoInicialEjercicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoAsientoInicialEjercicio.add(this.jMenuItemCerrarProcesoAsientoInicialEjercicio);
			
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemNuevoProcesoAsientoInicialEjercicio);
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio);
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio);
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio);		
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemDuplicarProcesoAsientoInicialEjercicio);		
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemCopiarProcesoAsientoInicialEjercicio);		
			this.jmenuAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemVerFormProcesoAsientoInicialEjercicio);		
			
			this.jmenuDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio);				
			this.jmenuDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemAnterioresProcesoAsientoInicialEjercicio);				
			this.jmenuDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemSiguientesProcesoAsientoInicialEjercicio);				
			this.jmenuDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio);				
			this.jmenuDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoAsientoInicialEjercicio.add(this.jmenuArchivoProcesoAsientoInicialEjercicio);		
			this.jmenuBarProcesoAsientoInicialEjercicio.add(this.jmenuAccionesProcesoAsientoInicialEjercicio);		
			this.jmenuBarProcesoAsientoInicialEjercicio.add(this.jmenuDatosProcesoAsientoInicialEjercicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoAsientoInicialEjercicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoAsientoInicialEjercicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setToolTipText("Procesar Proceso Asiento Inicial Ejercicio");
		this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new JButtonMe();
		this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText("Procesar");
		this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setToolTipText("Procesar Proceso Asiento Inicial Ejercicio");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,"buscar_button","Procesar Proceso Asiento Inicial Ejercicio");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio = new JLabelMe();
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText("Tipo Documento :");
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new JComboBoxMe();
		jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio = new JLabelMe();
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new JDateChooser();
		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setDate(new Date());
		jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio = new JLabelMe();
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText("Fecha Fin :");
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new JDateChooser();
		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setDate(new Date());
		jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Asiento Inicial Ejercicio"));
		this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoAsientoInicialEjercicio = new ProcesoAsientoInicialEjercicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Asiento Inicial Ejercicio DATOS");
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio = new ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(jDesktopPane,this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones(),this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio = null;//new ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoAsientoInicialEjercicio= new GridBagLayout();
		
		
		this.jTableDatosProcesoAsientoInicialEjercicio = new JTableMe();      
		
		String sToolTipProcesoAsientoInicialEjercicio="";
		sToolTipProcesoAsientoInicialEjercicio=ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoAsientoInicialEjercicio+="(Contabilidad.ProcesoAsientoInicialEjercicio)";
		}
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoAsientoInicialEjercicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoAsientoInicialEjercicio.setToolTipText(sToolTipProcesoAsientoInicialEjercicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoAsientoInicialEjercicio);
		this.jTableDatosProcesoAsientoInicialEjercicio.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoAsientoInicialEjercicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionAllowed(true);
		this.jTableDatosProcesoAsientoInicialEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonDuplicarProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonCopiarProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonVerFormProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonCerrarProcesoAsientoInicialEjercicio = new JButtonMe();
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Asiento Inicial Ejercicio";
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoAsientoInicialEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesProcesoAsientoInicialEjercicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio=new ReporteDinamicoJInternalFrame(ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoAsientoInicialEjercicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoAsientoInicialEjercicio=new ImportacionJInternalFrame(ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoAsientoInicialEjercicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setText("Orden");
		this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoAsientoInicialEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,false,this);
			
			//this.cargarOrderByProcesoAsientoInicialEjercicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoAsientoInicialEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,true,this);
			
			//this.cargarOrderByProcesoAsientoInicialEjercicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoAsientoInicialEjercicio.setText("Nuevo");
		this.jButtonDuplicarProcesoAsientoInicialEjercicio.setText("Duplicar");
		this.jButtonCopiarProcesoAsientoInicialEjercicio.setText("Copiar");
		this.jButtonVerFormProcesoAsientoInicialEjercicio.setText("Ver");
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setText("Guardar");
		this.jButtonCerrarProcesoAsientoInicialEjercicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoAsientoInicialEjercicio,"nuevo_button","Nuevo",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoAsientoInicialEjercicio,"duplicar_button","Duplicar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoAsientoInicialEjercicio,"copiar_button","Copiar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoAsientoInicialEjercicio,"ver_form","Ver",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio,"nuevorelaciones_button","Nuevo Rel",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio,"guardarcambiostabla_button","Guardar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoAsientoInicialEjercicio,"cerrar_button","Salir",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio.setToolTipText("Nuevo"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoAsientoInicialEjercicio.setToolTipText("Duplicar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoAsientoInicialEjercicio.setToolTipText("Copiar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoAsientoInicialEjercicio.setToolTipText("Ver"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.setToolTipText("Nuevo Rel"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setToolTipText("Guardar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoAsientoInicialEjercicio.setToolTipText("Salir"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoAsientoInicialEjercicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonDuplicarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoAsientoInicialEjercicio"));
		
		//COPIAR
		sMapKey = "CopiarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCopiarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoAsientoInicialEjercicio"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonVerFormProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoAsientoInicialEjercicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoAsientoInicialEjercicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonModificarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoAsientoInicialEjercicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCerrarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoAsientoInicialEjercicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoAsientoInicialEjercicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setName("jPanelParametrosReportesProcesoAsientoInicialEjercicio"); 
		
		this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio.setName("jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setText("Procesar");
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setToolTipText("Procesar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setText("Procesar");
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setToolTipText("Procesar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setText("Accion");
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoAsientoInicialEjercicio = new JLabelMe();
		
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setText("Acciones");		
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoAsientoInicialEjercicio = new JButtonMe();
		//this.jButtonAnterioresProcesoAsientoInicialEjercicio.setText("<<");
        this.jButtonAnterioresProcesoAsientoInicialEjercicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoAsientoInicialEjercicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoAsientoInicialEjercicio = new JButtonMe();
		//this.jButtonSiguientesProcesoAsientoInicialEjercicio.setText(">>");
        this.jButtonSiguientesProcesoAsientoInicialEjercicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoAsientoInicialEjercicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio,"nuevoguardarcambios_button","Nue",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoAsientoInicialEjercicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoAsientoInicialEjercicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonSiguientesProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoAsientoInicialEjercicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonAnterioresProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoAsientoInicialEjercicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoAsientoInicialEjercicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(this.getWidth(),ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(this.getWidth(),ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(this.getWidth(),ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoAsientoInicialEjercicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoAsientoInicialEjercicio = new GridBagLayout();

			this.jPanelPaginacionProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutPaginacionProcesoAsientoInicialEjercicio);						
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonAnterioresProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					
						
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
			
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
						
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonSiguientesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonNuevoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
						
			
			
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
				this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
				this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			}
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonDuplicarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonCopiarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonVerFormProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.add(this.jButtonCerrarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
		
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoAsientoInicialEjercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoAsientoInicialEjercicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoAsientoInicialEjercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoAsientoInicialEjercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoAsientoInicialEjercicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoAsientoInicialEjercicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosReportesProcesoAsientoInicialEjercicio);
			this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosReportesAccionesProcesoAsientoInicialEjercicio);
			
			
			this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosAuxiliar1ProcesoAsientoInicialEjercicio);
			this.jPanelParametrosAuxiliar2ProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosAuxiliar2ProcesoAsientoInicialEjercicio);
			this.jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosAuxiliar3ProcesoAsientoInicialEjercicio);
			this.jPanelParametrosAuxiliar4ProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosAuxiliar4ProcesoAsientoInicialEjercicio);
			//this.jPanelParametrosAuxiliar5ProcesoAsientoInicialEjercicio.setLayout(gridaBagParametrosAuxiliar2ProcesoAsientoInicialEjercicio);			
			
			
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio.add(this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jPanelParametrosAuxiliar1ProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jPanelParametrosAuxiliar4ProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jCheckBoxGenerarReporteProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jPanelParametrosAuxiliar2ProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jLabelAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
			
			
			/*
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio.add(this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);															
				
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio.add(this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jPanelParametrosAuxiliar3ProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoAsientoInicialEjercicio = new GridBagLayout();

			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutDatosProcesoAsientoInicialEjercicio);
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
			
			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.add(this.jTableDatosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setViewportView(this.jTableDatosProcesoAsientoInicialEjercicio);
		this.jTableDatosProcesoAsientoInicialEjercicio.setFillsViewportHeight(true);
		this.jTableDatosProcesoAsientoInicialEjercicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoAsientoInicialEjercicio= new GridBagLayout();
		this.jPanelAccionesProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutAccionesProcesoAsientoInicialEjercicio);
		
		
		/*	
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
			
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonNuevoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);

		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jLabelid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);

		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);


		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jLabelfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);

		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 1;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);


		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 2;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jLabelfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);

		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 2;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);

		gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 3;
		gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =1;
		jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.add(jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);

		jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.addTab("1.-Por Tipo Documento Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
		jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoAsientoInicialEjercicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoAsientoInicialEjercicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();						
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;		
			//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;		
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);								
		
		
		/*
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/		
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
				
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoAsientoInicialEjercicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoAsientoInicialEjercicio = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutBusquedasParametrosProcesoAsientoInicialEjercicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(false);
		this.jButtonAnterioresProcesoAsientoInicialEjercicio.setVisible(false);
		this.jButtonSiguientesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.setVisible(false);
		
		this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		this.jTtoolBarProcesoAsientoInicialEjercicio.setVisible(false);
			
		this.jMenuItemAnterioresProcesoAsientoInicialEjercicio.setVisible(false);
		this.jMenuItemSiguientesProcesoAsientoInicialEjercicio.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoAsientoInicialEjercicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoAsientoInicialEjercicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setName("jPanelReporteDinamicoProcesoAsientoInicialEjercicio"); 
		
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutReporteDinamicoProcesoAsientoInicialEjercicio);
		
		
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jLabelColumnasSelectReporteProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio=new JScrollPane(this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio);
			
			this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jListColumnasSelectReporteProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio=new JScrollPane(this.jListRelacionesSelectReporteProcesoAsientoInicialEjercicio);
			
			this.jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoAsientoInicialEjercicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoAsientoInicialEjercicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jLabelGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.setToolTipText("Generar EXCEL"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposReportesDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jLabelTiposArchivoReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio.setToolTipText("Generar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio.setToolTipText("Cancelar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoAsientoInicialEjercicio.add(this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoAsientoInicialEjercicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio= new JScrollPane(jPanelReporteDinamicoProcesoAsientoInicialEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoAsientoInicialEjercicio);
		this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoAsientoInicialEjercicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoAsientoInicialEjercicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setName("jPanelImportacionProcesoAsientoInicialEjercicio"); 
		
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutImportacionProcesoAsientoInicialEjercicio);
		
		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoAsientoInicialEjercicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setResizable(true);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setClosable(true);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setResizable(true);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setClosable(true);
	    this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jLabelArchivoImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoAsientoInicialEjercicio = new JFileChooser();		
		this.jFileChooserImportacionProcesoAsientoInicialEjercicio.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio.setToolTipText("Generar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jLabelPathArchivoImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jTextFieldPathArchivoImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio.setToolTipText("Generar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio.setToolTipText("Cancelar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoAsientoInicialEjercicio.add(this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoAsientoInicialEjercicio = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoAsientoInicialEjercicio= new JScrollPane(jPanelImportacionProcesoAsientoInicialEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoAsientoInicialEjercicio);
		this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getContentPane().add(this.jScrollPanelImportacionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoAsientoInicialEjercicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio = new JButtonMe();
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setText("Orden");
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoAsientoInicialEjercicio";
			inputMap = this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoAsientoInicialEjercicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoAsientoInicialEjercicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setName("jPanelOrderByProcesoAsientoInicialEjercicio"); 
			
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutOrderByProcesoAsientoInicialEjercicio);
			
			
			this.jTableDatosProcesoAsientoInicialEjercicioOrderBy = new JTableMe();        
			this.jTableDatosProcesoAsientoInicialEjercicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoAsientoInicialEjercicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoAsientoInicialEjercicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoAsientoInicialEjercicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoAsientoInicialEjercicioOrderBy.setViewportView(this.jTableDatosProcesoAsientoInicialEjercicioOrderBy);
			this.jTableDatosProcesoAsientoInicialEjercicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoAsientoInicialEjercicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoAsientoInicialEjercicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setTitle("Orden");
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setResizable(true);
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setClosable(true);
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipady =150;
				
			this.jPanelOrderByProcesoAsientoInicialEjercicio.add(jScrollPanelDatosProcesoAsientoInicialEjercicioOrderBy, this.gridBagConstraintsProcesoAsientoInicialEjercicio);//this.jTableDatosProcesoAsientoInicialEjercicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio = new JButtonMe();
			this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio.setToolTipText("Cancelar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoAsientoInicialEjercicio.add(this.jButtonCerrarOrderByProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoAsientoInicialEjercicio = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoAsientoInicialEjercicio= new JScrollPane(jPanelOrderByProcesoAsientoInicialEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoAsientoInicialEjercicio);
			
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getContentPane().add(this.jScrollPanelOrderByProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
		
		} else {
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoAsientoInicialEjercicio.getRowHeight();//ProcesoAsientoInicialEjercicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.isSelected()) {
					iHeightTable=ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoAsientoInicialEjercicio.isSelected()) {
					iHeightTable=ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoAsientoInicialEjercicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio!=null && this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoasientoinicialejercicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoAsientoInicialEjercicio> TraerProcesoAsientoInicialEjercicioBeans(List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejercicios) {
					
				if(!(ProcesoAsientoInicialEjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoAsientoInicialEjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoasientoinicialejercicio.setsDetalleGeneralEntityReporte(ProcesoAsientoInicialEjercicioConstantesFunciones.getProcesoAsientoInicialEjercicioDescripcion(procesoasientoinicialejercicio));
										
						
					
						
					
				} else  {
							
					//procesoasientoinicialejercicio.setsDetalleGeneralEntityReporte(procesoasientoinicialejercicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoasientoinicialejerciciobeans.add(procesoasientoinicialejerciciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoasientoinicialejercicios;
    }
	//PARA REPORTES FIN
}
