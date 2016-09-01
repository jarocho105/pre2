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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.DetalleEvaluacionNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class DetalleEvaluacionNomiJInternalFrame extends DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleEvaluacionNomi;
	
	protected JMenuBar jmenuBarDetalleEvaluacionNomi;
	
	protected JMenu jmenuDetalleEvaluacionNomi;
	protected JMenu jmenuDatosDetalleEvaluacionNomi;
	protected JMenu jmenuArchivoDetalleEvaluacionNomi;
	protected JMenu jmenuAccionesDetalleEvaluacionNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleEvaluacionNomi;	
	protected GridBagConstraints gridBagConstraintsDetalleEvaluacionNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleEvaluacionNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleEvaluacionNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleEvaluacionNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionnomi="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntanomi="";
	
	public DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public PreguntaNomiSessionBean preguntanomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleEvaluacionNomi> detalleevaluacionnomis;		
	public List<DetalleEvaluacionNomi> detalleevaluacionnomisEliminados;	
	public List<DetalleEvaluacionNomi> detalleevaluacionnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleEvaluacionNomi;		
	protected JButton jButtonAbrirOrderByDetalleEvaluacionNomi;
	
	
	//protected JPanel jPanelOrderByDetalleEvaluacionNomi;
	//public JScrollPane jScrollPanelOrderByDetalleEvaluacionNomi;	
	//protected JButton jButtonCerrarOrderByDetalleEvaluacionNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleEvaluacionNomi;
	public JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionNomi;
	public JScrollPane jScrollPanelDatosGeneralDetalleEvaluacionNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleEvaluacionNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleEvaluacionNomi;
	//public JScrollPane jScrollPanelImportacionDetalleEvaluacionNomi;
	
	
	
	protected JPanel jPanelAccionesDetalleEvaluacionNomi;
	
    protected JPanel jPanelPaginacionDetalleEvaluacionNomi;
    protected JPanel jPanelParametrosReportesDetalleEvaluacionNomi;
	protected JPanel jPanelParametrosReportesAccionesDetalleEvaluacionNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleEvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar2DetalleEvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar3DetalleEvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar4DetalleEvaluacionNomi;
	//protected JPanel jPanelParametrosAuxiliar5DetalleEvaluacionNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleEvaluacionNomi;
	//protected JPanel jPanelImportacionDetalleEvaluacionNomi;
	
	
	public JTable jTableDatosDetalleEvaluacionNomi;
	
	
	
	//public JTable jTableDatosDetalleEvaluacionNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleEvaluacionNomi;
	protected JButton jButtonDuplicarDetalleEvaluacionNomi;
	protected JButton jButtonCopiarDetalleEvaluacionNomi;
	protected JButton jButtonVerFormDetalleEvaluacionNomi;
	protected JButton jButtonNuevoRelacionesDetalleEvaluacionNomi;
	protected JButton jButtonModificarDetalleEvaluacionNomi;
	
    protected JButton jButtonGuardarCambiosTablaDetalleEvaluacionNomi;
	protected JButton jButtonCerrarDetalleEvaluacionNomi;
	
	
	protected JButton jButtonRecargarInformacionDetalleEvaluacionNomi;
	protected JButton jButtonProcesarInformacionDetalleEvaluacionNomi;
	
	
	protected JButton jButtonAnterioresDetalleEvaluacionNomi;
	protected JButton jButtonSiguientesDetalleEvaluacionNomi;
	protected JButton jButtonNuevoGuardarCambiosDetalleEvaluacionNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleEvaluacionNomi;
	//protected JButton jButtonCerrarReporteDinamicoDetalleEvaluacionNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleEvaluacionNomi;
	//protected JButton jButtonGenerarImportacionDetalleEvaluacionNomi;
	//protected JButton jButtonCerrarImportacionDetalleEvaluacionNomi;
	//protected JFileChooser jFileChooserImportacionDetalleEvaluacionNomi;
	//protected File fileImportacionDetalleEvaluacionNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleEvaluacionNomi;
	protected JButton jButtonDuplicarToolBarDetalleEvaluacionNomi;
	protected JButton jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleEvaluacionNomi;
	protected JButton jButtonCopiarToolBarDetalleEvaluacionNomi;
	protected JButton jButtonVerFormToolBarDetalleEvaluacionNomi;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleEvaluacionNomi;
	protected JButton jButtonCerrarToolBarDetalleEvaluacionNomi;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleEvaluacionNomi;
	protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionNomi;
	protected JButton jButtonAnterioresToolBarDetalleEvaluacionNomi;
	protected JButton jButtonSiguientesToolBarDetalleEvaluacionNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi;
	protected JButton jButtonAbrirOrderByToolBarDetalleEvaluacionNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDuplicarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleEvaluacionNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemCopiarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemVerFormDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemCerrarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleCerrarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemProcesarInformacionDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemAnterioresDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemSiguientesDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemAbrirOrderByDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemMostrarOcultarDetalleEvaluacionNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleEvaluacionNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleEvaluacionNomi;
	protected JCheckBox jCheckBoxSeleccionadosDetalleEvaluacionNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleEvaluacionNomi;
	protected JTextField jTextFieldValorCampoGeneralDetalleEvaluacionNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleEvaluacionNomi;
	//public JList<Reporte> jListColumnasSelectReporteDetalleEvaluacionNomi;
	//public JScrollPane jScrollColumnasSelectReporteDetalleEvaluacionNomi;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleEvaluacionNomi;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleEvaluacionNomi;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleEvaluacionNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleEvaluacionNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi;
	
		
	//public JLabel jLabelArchivoImportacionDetalleEvaluacionNomi;	
	//public JLabel jLabelPathArchivoImportacionDetalleEvaluacionNomi;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleEvaluacionNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleEvaluacionNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleEvaluacionNomi;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleEvaluacionNomi;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleEvaluacionNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionNomi;
	public JPanel jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi;
	public JButton jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi;
	public JPanel jPanelFK_IdFormatoNomiDetalleEvaluacionNomi;
	public JButton jButtonFK_IdFormatoNomiDetalleEvaluacionNomi;
	public JPanel jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi;
	public JButton jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi;
	
	public JPanel jPanelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi;
	public JLabel jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi;
	public JButton jButtonid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi;
	public JLabel jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi;
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi;
	public JLabel jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi;
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleEvaluacionNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleEvaluacionNomi)	{
		this.jButtonRecargarInformacionDetalleEvaluacionNomi = jButtonRecargarInformacionDetalleEvaluacionNomi;
	}
	
	public JButton getjButtonProcesarInformacionDetalleEvaluacionNomi() {
		return this.jButtonProcesarInformacionDetalleEvaluacionNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleEvaluacionNomi)	{
		this.jButtonProcesarInformacionDetalleEvaluacionNomi = jButtonProcesarInformacionDetalleEvaluacionNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleEvaluacionNomi() {
		return this.jButtonRecargarInformacionDetalleEvaluacionNomi;
	}
	
	
	public List<DetalleEvaluacionNomi> getdetalleevaluacionnomis() {
		return this.detalleevaluacionnomis;
	}

	public void setdetalleevaluacionnomis(List<DetalleEvaluacionNomi> detalleevaluacionnomis) {
		this.detalleevaluacionnomis = detalleevaluacionnomis;
	}
	
	public List<DetalleEvaluacionNomi> getdetalleevaluacionnomisAux() {
		return this.detalleevaluacionnomisAux;
	}

	public void setdetalleevaluacionnomisAux(List<DetalleEvaluacionNomi> detalleevaluacionnomisAux) {
		this.detalleevaluacionnomisAux = detalleevaluacionnomisAux;
	}
	
	public List<DetalleEvaluacionNomi> getdetalleevaluacionnomisEliminados() {
		return this.detalleevaluacionnomisEliminados;
	}

	public void setDetalleEvaluacionNomisEliminados(List<DetalleEvaluacionNomi> detalleevaluacionnomisEliminados) {
		this.detalleevaluacionnomisEliminados = detalleevaluacionnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleEvaluacionNomi() {
		return jComboBoxTiposSeleccionarDetalleEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposSeleccionarDetalleEvaluacionNomi) {
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi = jComboBoxTiposSeleccionarDetalleEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleEvaluacionNomi() {
		return jTextFieldValorCampoGeneralDetalleEvaluacionNomi;
	}

	public void setjTextFieldValorCampoGeneralDetalleEvaluacionNomi(
			JTextField jTextFieldValorCampoGeneralDetalleEvaluacionNomi) {
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi = jTextFieldValorCampoGeneralDetalleEvaluacionNomi;
	}

	public void setBorderResaltarValorCampoGeneralDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleEvaluacionNomi() {
		return this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi;
	}

	public void setjCheckBoxSeleccionarTodosDetalleEvaluacionNomi(
			JCheckBox jCheckBoxSeleccionarTodosDetalleEvaluacionNomi) {
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi = jCheckBoxSeleccionarTodosDetalleEvaluacionNomi;
	}

	public void setBorderResaltarSeleccionarTodosDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleEvaluacionNomi() {
		return this.jCheckBoxSeleccionadosDetalleEvaluacionNomi;
	}

	public void setjCheckBoxSeleccionadosDetalleEvaluacionNomi(
			JCheckBox jCheckBoxSeleccionadosDetalleEvaluacionNomi) {
		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi = jCheckBoxSeleccionadosDetalleEvaluacionNomi;
	}
	
	public void setBorderResaltarSeleccionadosDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposArchivosReportesDetalleEvaluacionNomi) {
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi = jComboBoxTiposArchivosReportesDetalleEvaluacionNomi;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposReportesDetalleEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposReportesDetalleEvaluacionNomi) {
		this.jComboBoxTiposReportesDetalleEvaluacionNomi = jComboBoxTiposReportesDetalleEvaluacionNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleEvaluacionNomi() {
	//	return jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleEvaluacionNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi) {
	//	this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi = jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi = jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi;
	//}
	
	public void setBorderResaltarTiposReportesDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposGraficosReportesDetalleEvaluacionNomi) {
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi = jComboBoxTiposGraficosReportesDetalleEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleEvaluacionNomi() {
		return this.jComboBoxTiposPaginacionDetalleEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposPaginacionDetalleEvaluacionNomi) {
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi = jComboBoxTiposPaginacionDetalleEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposRelacionesDetalleEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposAccionesDetalleEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposRelacionesDetalleEvaluacionNomi) {
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi = jComboBoxTiposRelacionesDetalleEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesDetalleEvaluacionNomi) {
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi = jComboBoxTiposAccionesDetalleEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleEvaluacionNomi() {
	//	return jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleEvaluacionNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi) {
	//	this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi = jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleEvaluacionNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleEvaluacionNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi .setBorder(borderResaltar);		
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
		this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		
		this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleEvaluacionNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Evaluacion Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"nuevo","nuevo","Nuevo"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"duplicar","duplicar","Duplicar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"copiar","copiar","Copiar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"ver_form","ver_form","Ver"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"recargar","recargar","Recargar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"cerrar","cerrar","Salir"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi;
			
				this.jButtonProcesarInformacionToolBarDetalleEvaluacionNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionNomi;
				
		//protected JButton jButtonModificarToolBarDetalleEvaluacionNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleEvaluacionNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleEvaluacionNomi=new JMenuMe("General");
		this.jmenuArchivoDetalleEvaluacionNomi=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleEvaluacionNomi=new JMenuMe("Acciones");
		this.jmenuDatosDetalleEvaluacionNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleEvaluacionNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleEvaluacionNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleEvaluacionNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleEvaluacionNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleEvaluacionNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleEvaluacionNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleEvaluacionNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleEvaluacionNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleEvaluacionNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleEvaluacionNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleEvaluacionNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleEvaluacionNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleEvaluacionNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleEvaluacionNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleEvaluacionNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleEvaluacionNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleEvaluacionNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleEvaluacionNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleEvaluacionNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleEvaluacionNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleEvaluacionNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleEvaluacionNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleEvaluacionNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleEvaluacionNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleEvaluacionNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleEvaluacionNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleEvaluacionNomi.add(this.jMenuItemCerrarDetalleEvaluacionNomi);
			
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemNuevoDetalleEvaluacionNomi);
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi);
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi);
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi);		
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemDuplicarDetalleEvaluacionNomi);		
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemCopiarDetalleEvaluacionNomi);		
			this.jmenuAccionesDetalleEvaluacionNomi.add(this.jMenuItemVerFormDetalleEvaluacionNomi);		
			
			this.jmenuDatosDetalleEvaluacionNomi.add(this.jMenuItemRecargarInformacionDetalleEvaluacionNomi);				
			this.jmenuDatosDetalleEvaluacionNomi.add(this.jMenuItemAnterioresDetalleEvaluacionNomi);				
			this.jmenuDatosDetalleEvaluacionNomi.add(this.jMenuItemSiguientesDetalleEvaluacionNomi);				
			this.jmenuDatosDetalleEvaluacionNomi.add(this.jMenuItemAbrirOrderByDetalleEvaluacionNomi);				
			this.jmenuDatosDetalleEvaluacionNomi.add(this.jMenuItemMostrarOcultarDetalleEvaluacionNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleEvaluacionNomi.add(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuArchivoDetalleEvaluacionNomi);		
			this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuAccionesDetalleEvaluacionNomi);		
			this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuDatosDetalleEvaluacionNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleEvaluacionNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleEvaluacionNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Evaluacion Nomi ");
		this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Evaluacion Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi,"buscar_button","Buscar Por Evaluacion Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi = new JLabelMe();
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setText("Evaluacion Nomi :");
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setToolTipText("Evaluacion Nomi");
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Formato Nomi ");
		this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Formato Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi,"buscar_button","Buscar Por Formato Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi = new JLabelMe();
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setText("Formato Nomi :");
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setToolTipText("Formato Nomi");
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Pregunta Nomi ");
		this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi.setToolTipText("Buscar Por Pregunta Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi,"buscar_button","Buscar Por Pregunta Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi = new JLabelMe();
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setText("Pregunta Nomi :");
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setToolTipText("Pregunta Nomi");
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleEvaluacionNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleEvaluacionNomi = new DetalleEvaluacionNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Evaluacion Nomi DATOS");
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi = new DetalleEvaluacionNomiDetalleFormJInternalFrame(jDesktopPane,this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi = null;//new DetalleEvaluacionNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleEvaluacionNomi= new GridBagLayout();
		
		
		this.jTableDatosDetalleEvaluacionNomi = new JTableMe();      
		
		String sToolTipDetalleEvaluacionNomi="";
		sToolTipDetalleEvaluacionNomi=DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleEvaluacionNomi+="(Nomina.DetalleEvaluacionNomi)";
		}
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleEvaluacionNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleEvaluacionNomi.setToolTipText(sToolTipDetalleEvaluacionNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleEvaluacionNomi);
		this.jTableDatosDetalleEvaluacionNomi.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleEvaluacionNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleEvaluacionNomi.setRowSelectionAllowed(true);
		this.jTableDatosDetalleEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonDuplicarDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonCopiarDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonVerFormDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarDetalleEvaluacionNomi = new JButtonMe();
		
		this.jScrollPanelDatosDetalleEvaluacionNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleEvaluacionNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Evaluacion Nomi";
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesDetalleEvaluacionNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi=new ReporteDinamicoJInternalFrame(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleEvaluacionNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleEvaluacionNomi=new ImportacionJInternalFrame(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleEvaluacionNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleEvaluacionNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleEvaluacionNomi.setText("Orden");
		this.jButtonAbrirOrderByDetalleEvaluacionNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleEvaluacionNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionNomi,false,this);
			
			//this.cargarOrderByDetalleEvaluacionNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionNomi,true,this);
			
			//this.cargarOrderByDetalleEvaluacionNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleEvaluacionNomi.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosDetalleEvaluacionNomi.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosDetalleEvaluacionNomi.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleEvaluacionNomi.setText("Nuevo");
		this.jButtonDuplicarDetalleEvaluacionNomi.setText("Duplicar");
		this.jButtonCopiarDetalleEvaluacionNomi.setText("Copiar");
		this.jButtonVerFormDetalleEvaluacionNomi.setText("Ver");
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setText("Guardar");
		this.jButtonCerrarDetalleEvaluacionNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleEvaluacionNomi,"nuevo_button","Nuevo",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleEvaluacionNomi,"duplicar_button","Duplicar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleEvaluacionNomi,"copiar_button","Copiar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleEvaluacionNomi,"ver_form","Ver",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleEvaluacionNomi,"nuevorelaciones_button","Nuevo Rel",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi,"guardarcambiostabla_button","Guardar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleEvaluacionNomi,"cerrar_button","Salir",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleEvaluacionNomi.setToolTipText("Nuevo"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleEvaluacionNomi.setToolTipText("Duplicar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleEvaluacionNomi.setToolTipText("Copiar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleEvaluacionNomi.setToolTipText("Ver"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.setToolTipText("Nuevo Rel"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setToolTipText("Guardar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleEvaluacionNomi.setToolTipText("Salir"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleEvaluacionNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleEvaluacionNomi";
		inputMap = this.jButtonDuplicarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleEvaluacionNomi"));
		
		//COPIAR
		sMapKey = "CopiarDetalleEvaluacionNomi";
		inputMap = this.jButtonCopiarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleEvaluacionNomi"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleEvaluacionNomi";
		inputMap = this.jButtonVerFormDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleEvaluacionNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoRelacionesDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleEvaluacionNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleEvaluacionNomi";
		inputMap = this.jButtonModificarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleEvaluacionNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleEvaluacionNomi";
		inputMap = this.jButtonCerrarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleEvaluacionNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleEvaluacionNomi";
		inputMap = this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleEvaluacionNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleEvaluacionNomi.setName("jPanelParametrosReportesDetalleEvaluacionNomi"); 
		
		this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi.setName("jPanelParametrosReportesAccionesDetalleEvaluacionNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.setText("Recargar");
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.setToolTipText("Recargar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleEvaluacionNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setText("Procesar");
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setToolTipText("Procesar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleEvaluacionNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleEvaluacionNomi = new JLabelMe();
		
		this.jLabelAccionesDetalleEvaluacionNomi.setText("Acciones");		
		this.jLabelAccionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleEvaluacionNomi = new JButtonMe();
		//this.jButtonAnterioresDetalleEvaluacionNomi.setText("<<");
        this.jButtonAnterioresDetalleEvaluacionNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleEvaluacionNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleEvaluacionNomi = new JButtonMe();
		//this.jButtonSiguientesDetalleEvaluacionNomi.setText(">>");
        this.jButtonSiguientesDetalleEvaluacionNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleEvaluacionNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi,"nuevoguardarcambios_button","Nue",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleEvaluacionNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleEvaluacionNomi";
		inputMap = this.jButtonRecargarInformacionDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleEvaluacionNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleEvaluacionNomi";
		inputMap = this.jButtonSiguientesDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleEvaluacionNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleEvaluacionNomi";
		inputMap = this.jButtonAnterioresDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleEvaluacionNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleEvaluacionNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(this.getWidth(),DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(this.getWidth(),DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(this.getWidth(),DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleEvaluacionNomi = new GridBagLayout();

			this.jPanelPaginacionDetalleEvaluacionNomi.setLayout(gridaBagLayoutPaginacionDetalleEvaluacionNomi);						
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonAnterioresDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					
						
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
			
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
						
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonSiguientesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonNuevoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
						
			
			
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
				this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			}
			
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonDuplicarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonCopiarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonVerFormDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleEvaluacionNomi.add(this.jButtonCerrarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleEvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleEvaluacionNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleEvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleEvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleEvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleEvaluacionNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.setLayout(gridaBagParametrosReportesDetalleEvaluacionNomi);
			this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi.setLayout(gridaBagParametrosReportesAccionesDetalleEvaluacionNomi);
			
			
			this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi.setLayout(gridaBagParametrosAuxiliar1DetalleEvaluacionNomi);
			this.jPanelParametrosAuxiliar2DetalleEvaluacionNomi.setLayout(gridaBagParametrosAuxiliar2DetalleEvaluacionNomi);
			this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi.setLayout(gridaBagParametrosAuxiliar3DetalleEvaluacionNomi);
			this.jPanelParametrosAuxiliar4DetalleEvaluacionNomi.setLayout(gridaBagParametrosAuxiliar4DetalleEvaluacionNomi);
			//this.jPanelParametrosAuxiliar5DetalleEvaluacionNomi.setLayout(gridaBagParametrosAuxiliar2DetalleEvaluacionNomi);			
			
			
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jButtonRecargarInformacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi.add(this.jComboBoxTiposPaginacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi.add(this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi.add(this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jPanelParametrosAuxiliar1DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleEvaluacionNomi.add(this.jComboBoxTiposReportesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);																		
			
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleEvaluacionNomi.add(this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jPanelParametrosAuxiliar4DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jComboBoxTiposReportesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jCheckBoxGenerarReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jPanelParametrosAuxiliar2DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jLabelAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jButtonAbrirOrderByDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			
			
			/*
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi.add(this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);															
				
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi.add(this.jCheckBoxSeleccionadosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);															
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi.add(this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jPanelParametrosAuxiliar3DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jComboBoxTiposAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
	
				
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionNomi.add(this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleEvaluacionNomi = new GridBagLayout();

			this.jScrollPanelDatosDetalleEvaluacionNomi.setLayout(gridaBagLayoutDatosDetalleEvaluacionNomi);
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
			
			this.jScrollPanelDatosDetalleEvaluacionNomi.add(this.jTableDatosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleEvaluacionNomi.setViewportView(this.jTableDatosDetalleEvaluacionNomi);
		this.jTableDatosDetalleEvaluacionNomi.setFillsViewportHeight(true);
		this.jTableDatosDetalleEvaluacionNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesDetalleEvaluacionNomi.setLayout(gridaBagLayoutAccionesDetalleEvaluacionNomi);
		
		
		/*	
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
			
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonNuevoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi.setLayout(gridaBagLayoutFK_IdEvaluacionNomiDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi.add(jLabelid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
		jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi.add(jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
		gridBagConstraintsDetalleEvaluacionNomi.gridx =1;
		jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi.add(jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		jTabbedPaneBusquedasDetalleEvaluacionNomi.addTab("1.-Por Evaluacion Nomi ", jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);
		jTabbedPaneBusquedasDetalleEvaluacionNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiDetalleEvaluacionNomi.setLayout(gridaBagLayoutFK_IdFormatoNomiDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		jPanelFK_IdFormatoNomiDetalleEvaluacionNomi.add(jLabelid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
		jPanelFK_IdFormatoNomiDetalleEvaluacionNomi.add(jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
		gridBagConstraintsDetalleEvaluacionNomi.gridx =1;
		jPanelFK_IdFormatoNomiDetalleEvaluacionNomi.add(jButtonFK_IdFormatoNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		jTabbedPaneBusquedasDetalleEvaluacionNomi.addTab("2.-Por Formato Nomi ", jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);
		jTabbedPaneBusquedasDetalleEvaluacionNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi.setLayout(gridaBagLayoutFK_IdPreguntaNomiDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi.add(jLabelid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
		jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi.add(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionNomi.gridy = 1;
		gridBagConstraintsDetalleEvaluacionNomi.gridx =1;
		jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi.add(jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);

		jTabbedPaneBusquedasDetalleEvaluacionNomi.addTab("3.-Por Pregunta Nomi ", jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);
		jTabbedPaneBusquedasDetalleEvaluacionNomi.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleEvaluacionNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();						
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;		
			//this.gridBagConstraintsDetalleEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;		
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;		
			this.gridBagConstraintsDetalleEvaluacionNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);								
		
		
		/*
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/		
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =0;
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleEvaluacionNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
				
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleEvaluacionNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleEvaluacionNomi.setLayout(gridaBagLayoutBusquedasParametrosDetalleEvaluacionNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleEvaluacionNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleEvaluacionNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleEvaluacionNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setName("jPanelReporteDinamicoDetalleEvaluacionNomi"); 
		
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.setLayout(gridaBagLayoutReporteDinamicoDetalleEvaluacionNomi);
		
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleEvaluacionNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleEvaluacionNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelColumnasSelectReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleEvaluacionNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleEvaluacionNomi=new JScrollPane(this.jListColumnasSelectReporteDetalleEvaluacionNomi);
			
			this.jScrollColumnasSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jListColumnasSelectReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jScrollColumnasSelectReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleEvaluacionNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleEvaluacionNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleEvaluacionNomi=new JScrollPane(this.jListRelacionesSelectReporteDetalleEvaluacionNomi);
			
			this.jScrollRelacionesSelectReporteDetalleEvaluacionNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleEvaluacionNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleEvaluacionNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleEvaluacionNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleEvaluacionNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelConGraficoDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jCheckBoxConGraficoDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelColumnaCategoriaGraficoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelColumnaCategoriaValorDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jComboBoxColumnaCategoriaValorDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelColumnasValoresGraficoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleEvaluacionNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleEvaluacionNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi=new JScrollPane(this.jListColumnasValoresGraficoDetalleEvaluacionNomi);
			
			this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jListColumnasSelectReporteDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jScrollColumnasValoresGraficoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelTiposGraficosReportesDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi.setToolTipText("Generar EXCEL"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jComboBoxTiposReportesDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi.setToolTipText("Generar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi.setToolTipText("Cancelar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionNomi.add(this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleEvaluacionNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi= new JScrollPane(jPanelReporteDinamicoDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleEvaluacionNomi);
		this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleEvaluacionNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleEvaluacionNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleEvaluacionNomi.setName("jPanelImportacionDetalleEvaluacionNomi"); 
		
		this.jPanelImportacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleEvaluacionNomi.setLayout(gridaBagLayoutImportacionDetalleEvaluacionNomi);
		
		
		this.jInternalFrameImportacionDetalleEvaluacionNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleEvaluacionNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleEvaluacionNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleEvaluacionNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setResizable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setClosable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setResizable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setClosable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelArchivoImportacionDetalleEvaluacionNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jLabelArchivoImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleEvaluacionNomi = new JFileChooser();		
		this.jFileChooserImportacionDetalleEvaluacionNomi.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonAbrirImportacionDetalleEvaluacionNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleEvaluacionNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleEvaluacionNomi.setToolTipText("Generar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jButtonAbrirImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleEvaluacionNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleEvaluacionNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jLabelPathArchivoImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jTextFieldPathArchivoImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarImportacionDetalleEvaluacionNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleEvaluacionNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleEvaluacionNomi.setToolTipText("Generar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jButtonGenerarImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarImportacionDetalleEvaluacionNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleEvaluacionNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleEvaluacionNomi.setToolTipText("Cancelar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionNomi.add(this.jButtonCerrarImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleEvaluacionNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleEvaluacionNomi= new JScrollPane(jPanelImportacionDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleEvaluacionNomi);
		this.jInternalFrameImportacionDetalleEvaluacionNomi.getContentPane().add(this.jScrollPanelImportacionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleEvaluacionNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleEvaluacionNomi = new JButtonMe();
			this.jButtonAbrirOrderByDetalleEvaluacionNomi.setText("Orden");
			this.jButtonAbrirOrderByDetalleEvaluacionNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleEvaluacionNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleEvaluacionNomi";
			inputMap = this.jButtonAbrirOrderByDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleEvaluacionNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleEvaluacionNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleEvaluacionNomi.setName("jPanelOrderByDetalleEvaluacionNomi"); 
			
			this.jPanelOrderByDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleEvaluacionNomi.setLayout(gridaBagLayoutOrderByDetalleEvaluacionNomi);
			
			
			this.jTableDatosDetalleEvaluacionNomiOrderBy = new JTableMe();        
			this.jTableDatosDetalleEvaluacionNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleEvaluacionNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleEvaluacionNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleEvaluacionNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleEvaluacionNomiOrderBy.setViewportView(this.jTableDatosDetalleEvaluacionNomiOrderBy);
			this.jTableDatosDetalleEvaluacionNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleEvaluacionNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleEvaluacionNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleEvaluacionNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleEvaluacionNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleEvaluacionNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setTitle("Orden");
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setResizable(true);
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setClosable(true);
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleEvaluacionNomi.ipady =150;
				
			this.jPanelOrderByDetalleEvaluacionNomi.add(jScrollPanelDatosDetalleEvaluacionNomiOrderBy, this.gridBagConstraintsDetalleEvaluacionNomi);//this.jTableDatosDetalleEvaluacionNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleEvaluacionNomi = new JButtonMe();
			this.jButtonCerrarOrderByDetalleEvaluacionNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleEvaluacionNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleEvaluacionNomi.setToolTipText("Cancelar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleEvaluacionNomi.add(this.jButtonCerrarOrderByDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleEvaluacionNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleEvaluacionNomi= new JScrollPane(jPanelOrderByDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleEvaluacionNomi);
			
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getContentPane().add(this.jScrollPanelOrderByDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
		
		} else {
			this.jButtonAbrirOrderByDetalleEvaluacionNomi = new JButtonMe();
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
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()
			) {
		}
		
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
		int iCountColumns=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleEvaluacionNomi.getRowHeight();//DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.isSelected()) {
					iHeightTable=DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionNomi.isSelected()) {
					iHeightTable=DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleEvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleEvaluacionNomi!=null && this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleEvaluacionNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleEvaluacionNomi> TraerDetalleEvaluacionNomiBeans(List<DetalleEvaluacionNomi> detalleevaluacionnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomis) {
					
				if(!(DetalleEvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleEvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleevaluacionnomi.setsDetalleGeneralEntityReporte(DetalleEvaluacionNomiConstantesFunciones.getDetalleEvaluacionNomiDescripcion(detalleevaluacionnomi));
										
					detalleevaluacionnomi.setcalifica1_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica1Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica2_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica2Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica3_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica3Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica4_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica4Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica5_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica5Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica6_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica6Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica7_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica7Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica8_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica8Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica9_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica9Descripcion(detalleevaluacionnomi));detalleevaluacionnomi.setcalifica10_descripcion(DetalleEvaluacionNomiConstantesFunciones.getcalifica10Descripcion(detalleevaluacionnomi));	
					
						
					
				} else  {
							
					//detalleevaluacionnomi.setsDetalleGeneralEntityReporte(detalleevaluacionnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleevaluacionnomibeans.add(detalleevaluacionnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleevaluacionnomis;
    }
	//PARA REPORTES FIN
}
