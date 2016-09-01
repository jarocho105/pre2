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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleEvaluacionProveedorConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleEvaluacionProveedorJInternalFrame extends DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleEvaluacionProveedor;
	
	protected JMenuBar jmenuBarDetalleEvaluacionProveedor;
	
	protected JMenu jmenuDetalleEvaluacionProveedor;
	protected JMenu jmenuDatosDetalleEvaluacionProveedor;
	protected JMenu jmenuArchivoDetalleEvaluacionProveedor;
	protected JMenu jmenuAccionesDetalleEvaluacionProveedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleEvaluacionProveedor;	
	protected GridBagConstraints gridBagConstraintsDetalleEvaluacionProveedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleEvaluacionProveedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleEvaluacionProveedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleEvaluacionProveedor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EvaluacionProveedorBeanSwingJInternalFrame evaluacionproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionproveedor="";

	protected PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntaevaluacion="";

	protected SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subpreguntaevaluacion="";

	protected SiNoBeanSwingJInternalFrame sinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sino="";
	
	public DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EvaluacionProveedorSessionBean evaluacionproveedorSessionBean;
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
	public SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean;
	public SiNoSessionBean sinoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleEvaluacionProveedor> detalleevaluacionproveedors;		
	public List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsEliminados;	
	public List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleEvaluacionProveedor;		
	protected JButton jButtonAbrirOrderByDetalleEvaluacionProveedor;
	
	
	//protected JPanel jPanelOrderByDetalleEvaluacionProveedor;
	//public JScrollPane jScrollPanelOrderByDetalleEvaluacionProveedor;	
	//protected JButton jButtonCerrarOrderByDetalleEvaluacionProveedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosGeneralDetalleEvaluacionProveedor;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleEvaluacionProveedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleEvaluacionProveedor;
	//public JScrollPane jScrollPanelImportacionDetalleEvaluacionProveedor;
	
	
	
	protected JPanel jPanelAccionesDetalleEvaluacionProveedor;
	
    protected JPanel jPanelPaginacionDetalleEvaluacionProveedor;
    protected JPanel jPanelParametrosReportesDetalleEvaluacionProveedor;
	protected JPanel jPanelParametrosReportesAccionesDetalleEvaluacionProveedor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleEvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar2DetalleEvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar3DetalleEvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar4DetalleEvaluacionProveedor;
	//protected JPanel jPanelParametrosAuxiliar5DetalleEvaluacionProveedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleEvaluacionProveedor;
	//protected JPanel jPanelImportacionDetalleEvaluacionProveedor;
	
	
	public JTable jTableDatosDetalleEvaluacionProveedor;
	
	
	
	//public JTable jTableDatosDetalleEvaluacionProveedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleEvaluacionProveedor;
	protected JButton jButtonDuplicarDetalleEvaluacionProveedor;
	protected JButton jButtonCopiarDetalleEvaluacionProveedor;
	protected JButton jButtonVerFormDetalleEvaluacionProveedor;
	protected JButton jButtonNuevoRelacionesDetalleEvaluacionProveedor;
	protected JButton jButtonModificarDetalleEvaluacionProveedor;
	
    protected JButton jButtonGuardarCambiosTablaDetalleEvaluacionProveedor;
	protected JButton jButtonCerrarDetalleEvaluacionProveedor;
	
	
	protected JButton jButtonRecargarInformacionDetalleEvaluacionProveedor;
	protected JButton jButtonProcesarInformacionDetalleEvaluacionProveedor;
	
	
	protected JButton jButtonAnterioresDetalleEvaluacionProveedor;
	protected JButton jButtonSiguientesDetalleEvaluacionProveedor;
	protected JButton jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor;
	//protected JButton jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleEvaluacionProveedor;
	//protected JButton jButtonGenerarImportacionDetalleEvaluacionProveedor;
	//protected JButton jButtonCerrarImportacionDetalleEvaluacionProveedor;
	//protected JFileChooser jFileChooserImportacionDetalleEvaluacionProveedor;
	//protected File fileImportacionDetalleEvaluacionProveedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonDuplicarToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonCopiarToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonVerFormToolBarDetalleEvaluacionProveedor;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonCerrarToolBarDetalleEvaluacionProveedor;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonAnterioresToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonSiguientesToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonAbrirOrderByToolBarDetalleEvaluacionProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDuplicarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleEvaluacionProveedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemCopiarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemVerFormDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemCerrarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemProcesarInformacionDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemAnterioresDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemSiguientesDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemAbrirOrderByDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleEvaluacionProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleEvaluacionProveedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor;
	protected JCheckBox jCheckBoxSeleccionadosDetalleEvaluacionProveedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleEvaluacionProveedor;
	protected JTextField jTextFieldValorCampoGeneralDetalleEvaluacionProveedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleEvaluacionProveedor;
	//public JList<Reporte> jListColumnasSelectReporteDetalleEvaluacionProveedor;
	//public JScrollPane jScrollColumnasSelectReporteDetalleEvaluacionProveedor;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleEvaluacionProveedor;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleEvaluacionProveedor;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleEvaluacionProveedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleEvaluacionProveedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor;
	
		
	//public JLabel jLabelArchivoImportacionDetalleEvaluacionProveedor;	
	//public JLabel jLabelPathArchivoImportacionDetalleEvaluacionProveedor;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleEvaluacionProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleEvaluacionProveedor;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleEvaluacionProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleEvaluacionProveedor;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleEvaluacionProveedor;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleEvaluacionProveedor;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleEvaluacionProveedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleEvaluacionProveedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionProveedor;
	public JPanel jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor;
	public JButton jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor;
	public JPanel jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JButton jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JPanel jPanelFK_IdSiNoDetalleEvaluacionProveedor;
	public JButton jButtonFK_IdSiNoDetalleEvaluacionProveedor;
	public JPanel jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JButton jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor;
	
	public JPanel jPanelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor;
	public JLabel jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor;
	public JButton jButtonid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JLabel jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_si_noFK_IdSiNoDetalleEvaluacionProveedor;
	public JLabel jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor;
	public JButton jButtonid_si_noFK_IdSiNoDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_si_noFK_IdSiNoDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_si_noFK_IdSiNoDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JLabel jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor;
	public JButton jButtonid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleEvaluacionProveedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleEvaluacionProveedor)	{
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor = jButtonRecargarInformacionDetalleEvaluacionProveedor;
	}
	
	public JButton getjButtonProcesarInformacionDetalleEvaluacionProveedor() {
		return this.jButtonProcesarInformacionDetalleEvaluacionProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleEvaluacionProveedor)	{
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor = jButtonProcesarInformacionDetalleEvaluacionProveedor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleEvaluacionProveedor() {
		return this.jButtonRecargarInformacionDetalleEvaluacionProveedor;
	}
	
	
	public List<DetalleEvaluacionProveedor> getdetalleevaluacionproveedors() {
		return this.detalleevaluacionproveedors;
	}

	public void setdetalleevaluacionproveedors(List<DetalleEvaluacionProveedor> detalleevaluacionproveedors) {
		this.detalleevaluacionproveedors = detalleevaluacionproveedors;
	}
	
	public List<DetalleEvaluacionProveedor> getdetalleevaluacionproveedorsAux() {
		return this.detalleevaluacionproveedorsAux;
	}

	public void setdetalleevaluacionproveedorsAux(List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsAux) {
		this.detalleevaluacionproveedorsAux = detalleevaluacionproveedorsAux;
	}
	
	public List<DetalleEvaluacionProveedor> getdetalleevaluacionproveedorsEliminados() {
		return this.detalleevaluacionproveedorsEliminados;
	}

	public void setDetalleEvaluacionProveedorsEliminados(List<DetalleEvaluacionProveedor> detalleevaluacionproveedorsEliminados) {
		this.detalleevaluacionproveedorsEliminados = detalleevaluacionproveedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleEvaluacionProveedor() {
		return jComboBoxTiposSeleccionarDetalleEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposSeleccionarDetalleEvaluacionProveedor) {
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor = jComboBoxTiposSeleccionarDetalleEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleEvaluacionProveedor() {
		return jTextFieldValorCampoGeneralDetalleEvaluacionProveedor;
	}

	public void setjTextFieldValorCampoGeneralDetalleEvaluacionProveedor(
			JTextField jTextFieldValorCampoGeneralDetalleEvaluacionProveedor) {
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor = jTextFieldValorCampoGeneralDetalleEvaluacionProveedor;
	}

	public void setBorderResaltarValorCampoGeneralDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleEvaluacionProveedor() {
		return this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor;
	}

	public void setjCheckBoxSeleccionarTodosDetalleEvaluacionProveedor(
			JCheckBox jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor) {
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor = jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor;
	}

	public void setBorderResaltarSeleccionarTodosDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleEvaluacionProveedor() {
		return this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor;
	}

	public void setjCheckBoxSeleccionadosDetalleEvaluacionProveedor(
			JCheckBox jCheckBoxSeleccionadosDetalleEvaluacionProveedor) {
		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor = jCheckBoxSeleccionadosDetalleEvaluacionProveedor;
	}
	
	public void setBorderResaltarSeleccionadosDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor = jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposReportesDetalleEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposReportesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor = jComboBoxTiposReportesDetalleEvaluacionProveedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor() {
	//	return jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor) {
	//	this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor = jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor = jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor;
	//}
	
	public void setBorderResaltarTiposReportesDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor = jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposPaginacionDetalleEvaluacionProveedor) {
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor = jComboBoxTiposPaginacionDetalleEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposRelacionesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor = jComboBoxTiposRelacionesDetalleEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor = jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor() {
	//	return jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor) {
	//	this.jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor = jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleEvaluacionProveedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleEvaluacionProveedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor .setBorder(borderResaltar);		
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
		this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		
		this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleEvaluacionProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Evaluacion Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionProveedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"nuevo","nuevo","Nuevo"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"duplicar","duplicar","Duplicar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"copiar","copiar","Copiar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"ver_form","ver_form","Ver"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"recargar","recargar","Recargar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"cerrar","cerrar","Salir"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleEvaluacionProveedor;
			
				this.jButtonProcesarInformacionToolBarDetalleEvaluacionProveedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionProveedor;
				
		//protected JButton jButtonModificarToolBarDetalleEvaluacionProveedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleEvaluacionProveedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleEvaluacionProveedor=new JMenuMe("General");
		this.jmenuArchivoDetalleEvaluacionProveedor=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleEvaluacionProveedor=new JMenuMe("Acciones");
		this.jmenuDatosDetalleEvaluacionProveedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleEvaluacionProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleEvaluacionProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleEvaluacionProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleEvaluacionProveedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleEvaluacionProveedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleEvaluacionProveedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleEvaluacionProveedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleEvaluacionProveedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleEvaluacionProveedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleEvaluacionProveedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleEvaluacionProveedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleEvaluacionProveedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleEvaluacionProveedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleEvaluacionProveedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleEvaluacionProveedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleEvaluacionProveedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleEvaluacionProveedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleEvaluacionProveedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleEvaluacionProveedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleEvaluacionProveedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleEvaluacionProveedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleEvaluacionProveedor.add(this.jMenuItemCerrarDetalleEvaluacionProveedor);
			
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemNuevoDetalleEvaluacionProveedor);
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor);
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemNuevoRelacionesDetalleEvaluacionProveedor);
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor);		
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemDuplicarDetalleEvaluacionProveedor);		
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemCopiarDetalleEvaluacionProveedor);		
			this.jmenuAccionesDetalleEvaluacionProveedor.add(this.jMenuItemVerFormDetalleEvaluacionProveedor);		
			
			this.jmenuDatosDetalleEvaluacionProveedor.add(this.jMenuItemRecargarInformacionDetalleEvaluacionProveedor);				
			this.jmenuDatosDetalleEvaluacionProveedor.add(this.jMenuItemAnterioresDetalleEvaluacionProveedor);				
			this.jmenuDatosDetalleEvaluacionProveedor.add(this.jMenuItemSiguientesDetalleEvaluacionProveedor);				
			this.jmenuDatosDetalleEvaluacionProveedor.add(this.jMenuItemAbrirOrderByDetalleEvaluacionProveedor);				
			this.jmenuDatosDetalleEvaluacionProveedor.add(this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleEvaluacionProveedor.add(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuArchivoDetalleEvaluacionProveedor);		
			this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuAccionesDetalleEvaluacionProveedor);		
			this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuDatosDetalleEvaluacionProveedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleEvaluacionProveedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleEvaluacionProveedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setToolTipText("Buscar Por Evaluacion Proveedor ");
		this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setToolTipText("Buscar Por Evaluacion Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor,"buscar_button","Buscar Por Evaluacion Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor = new JLabelMe();
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setText("Evaluacion Proveedor :");
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setToolTipText("Evaluacion Proveedor");
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar Por Pregunta Evaluacion ");
		this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar Por Pregunta Evaluacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor,"buscar_button","Buscar Por Pregunta Evaluacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor = new JLabelMe();
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setText("Pregunta Evaluacion :");
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Pregunta Evaluacion");
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSiNoDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSiNoDetalleEvaluacionProveedor.setToolTipText("Buscar Por Si No ");
		this.jButtonFK_IdSiNoDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonFK_IdSiNoDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonFK_IdSiNoDetalleEvaluacionProveedor.setToolTipText("Buscar Por Si No ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSiNoDetalleEvaluacionProveedor,"buscar_button","Buscar Por Si No ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSiNoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor = new JLabelMe();
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setText("Si No :");
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setToolTipText("Si No");
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar Por Sub Pregunta Evaluacion ");
		this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar Por Sub Pregunta Evaluacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor,"buscar_button","Buscar Por Sub Pregunta Evaluacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor = new JLabelMe();
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setText("Sub Pregunta Evaluacion :");
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setToolTipText("Sub Pregunta Evaluacion");
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleEvaluacionProveedor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleEvaluacionProveedor = new DetalleEvaluacionProveedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Evaluacion Proveedor DATOS");
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor = new DetalleEvaluacionProveedorDetalleFormJInternalFrame(jDesktopPane,this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleEvaluacionProveedor = null;//new DetalleEvaluacionProveedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleEvaluacionProveedor= new GridBagLayout();
		
		
		this.jTableDatosDetalleEvaluacionProveedor = new JTableMe();      
		
		String sToolTipDetalleEvaluacionProveedor="";
		sToolTipDetalleEvaluacionProveedor=DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleEvaluacionProveedor+="(Cartera.DetalleEvaluacionProveedor)";
		}
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleEvaluacionProveedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleEvaluacionProveedor.setToolTipText(sToolTipDetalleEvaluacionProveedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleEvaluacionProveedor);
		this.jTableDatosDetalleEvaluacionProveedor.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleEvaluacionProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleEvaluacionProveedor.setRowSelectionAllowed(true);
		this.jTableDatosDetalleEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonDuplicarDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonCopiarDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonVerFormDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarDetalleEvaluacionProveedor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleEvaluacionProveedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Evaluacion Proveedor";
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleEvaluacionProveedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor=new ReporteDinamicoJInternalFrame(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleEvaluacionProveedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleEvaluacionProveedor=new ImportacionJInternalFrame(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleEvaluacionProveedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleEvaluacionProveedor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setText("Orden");
		this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleEvaluacionProveedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionProveedor,false,this);
			
			//this.cargarOrderByDetalleEvaluacionProveedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionProveedor,true,this);
			
			//this.cargarOrderByDetalleEvaluacionProveedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleEvaluacionProveedor.setText("Nuevo");
		this.jButtonDuplicarDetalleEvaluacionProveedor.setText("Duplicar");
		this.jButtonCopiarDetalleEvaluacionProveedor.setText("Copiar");
		this.jButtonVerFormDetalleEvaluacionProveedor.setText("Ver");
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setText("Guardar");
		this.jButtonCerrarDetalleEvaluacionProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleEvaluacionProveedor,"nuevo_button","Nuevo",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleEvaluacionProveedor,"duplicar_button","Duplicar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleEvaluacionProveedor,"copiar_button","Copiar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleEvaluacionProveedor,"ver_form","Ver",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleEvaluacionProveedor,"nuevorelaciones_button","Nuevo Rel",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor,"guardarcambiostabla_button","Guardar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleEvaluacionProveedor,"cerrar_button","Salir",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleEvaluacionProveedor.setToolTipText("Nuevo"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleEvaluacionProveedor.setToolTipText("Duplicar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleEvaluacionProveedor.setToolTipText("Copiar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleEvaluacionProveedor.setToolTipText("Ver"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.setToolTipText("Nuevo Rel"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setToolTipText("Guardar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleEvaluacionProveedor.setToolTipText("Salir"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleEvaluacionProveedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleEvaluacionProveedor";
		inputMap = this.jButtonDuplicarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleEvaluacionProveedor"));
		
		//COPIAR
		sMapKey = "CopiarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCopiarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleEvaluacionProveedor"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleEvaluacionProveedor";
		inputMap = this.jButtonVerFormDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleEvaluacionProveedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleEvaluacionProveedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleEvaluacionProveedor";
		inputMap = this.jButtonModificarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleEvaluacionProveedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCerrarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleEvaluacionProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleEvaluacionProveedor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleEvaluacionProveedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleEvaluacionProveedor.setName("jPanelParametrosReportesDetalleEvaluacionProveedor"); 
		
		this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor.setName("jPanelParametrosReportesAccionesDetalleEvaluacionProveedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.setText("Recargar");
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.setToolTipText("Recargar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleEvaluacionProveedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setText("Procesar");
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setToolTipText("Procesar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleEvaluacionProveedor = new JLabelMe();
		
		this.jLabelAccionesDetalleEvaluacionProveedor.setText("Acciones");		
		this.jLabelAccionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleEvaluacionProveedor = new JButtonMe();
		//this.jButtonAnterioresDetalleEvaluacionProveedor.setText("<<");
        this.jButtonAnterioresDetalleEvaluacionProveedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleEvaluacionProveedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleEvaluacionProveedor = new JButtonMe();
		//this.jButtonSiguientesDetalleEvaluacionProveedor.setText(">>");
        this.jButtonSiguientesDetalleEvaluacionProveedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleEvaluacionProveedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor,"nuevoguardarcambios_button","Nue",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleEvaluacionProveedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleEvaluacionProveedor";
		inputMap = this.jButtonRecargarInformacionDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleEvaluacionProveedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleEvaluacionProveedor";
		inputMap = this.jButtonSiguientesDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleEvaluacionProveedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleEvaluacionProveedor";
		inputMap = this.jButtonAnterioresDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleEvaluacionProveedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleEvaluacionProveedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(this.getWidth(),DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(this.getWidth(),DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(this.getWidth(),DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleEvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleEvaluacionProveedor = new GridBagLayout();

			this.jPanelPaginacionDetalleEvaluacionProveedor.setLayout(gridaBagLayoutPaginacionDetalleEvaluacionProveedor);						
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonAnterioresDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					
						
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
			
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonNuevoGuardarCambiosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
						
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonSiguientesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonNuevoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
						
			
			
			if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			}
			
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonDuplicarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonCopiarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonVerFormDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleEvaluacionProveedor.add(this.jButtonCerrarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
		
		
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleEvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleEvaluacionProveedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleEvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleEvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleEvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleEvaluacionProveedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.setLayout(gridaBagParametrosReportesDetalleEvaluacionProveedor);
			this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor.setLayout(gridaBagParametrosReportesAccionesDetalleEvaluacionProveedor);
			
			
			this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar1DetalleEvaluacionProveedor);
			this.jPanelParametrosAuxiliar2DetalleEvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar2DetalleEvaluacionProveedor);
			this.jPanelParametrosAuxiliar3DetalleEvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar3DetalleEvaluacionProveedor);
			this.jPanelParametrosAuxiliar4DetalleEvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar4DetalleEvaluacionProveedor);
			//this.jPanelParametrosAuxiliar5DetalleEvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar2DetalleEvaluacionProveedor);			
			
			
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jButtonRecargarInformacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor.add(this.jComboBoxTiposPaginacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor.add(this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor.add(this.jComboBoxTiposArchivosReportesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jPanelParametrosAuxiliar1DetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleEvaluacionProveedor.add(this.jComboBoxTiposReportesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jPanelParametrosAuxiliar4DetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jComboBoxTiposReportesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jCheckBoxGenerarReporteDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jPanelParametrosAuxiliar2DetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jLabelAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jButtonAbrirOrderByDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jComboBoxTiposSeleccionarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			
			
			/*
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleEvaluacionProveedor.add(this.jCheckBoxSeleccionarTodosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);															
				
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleEvaluacionProveedor.add(this.jCheckBoxSeleccionadosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jPanelParametrosAuxiliar3DetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jComboBoxTiposAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
	
				
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleEvaluacionProveedor.add(this.jTextFieldValorCampoGeneralDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleEvaluacionProveedor = new GridBagLayout();

			this.jScrollPanelDatosDetalleEvaluacionProveedor.setLayout(gridaBagLayoutDatosDetalleEvaluacionProveedor);
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
			
			this.jScrollPanelDatosDetalleEvaluacionProveedor.add(this.jTableDatosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setViewportView(this.jTableDatosDetalleEvaluacionProveedor);
		this.jTableDatosDetalleEvaluacionProveedor.setFillsViewportHeight(true);
		this.jTableDatosDetalleEvaluacionProveedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesDetalleEvaluacionProveedor.setLayout(gridaBagLayoutAccionesDetalleEvaluacionProveedor);
		
		
		/*	
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
			
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonNuevoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.setLayout(gridaBagLayoutFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.add(jLabelid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
		jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.add(jComboBoxid_evaluacion_proveedorFK_IdEvaluacionProveedorDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx =1;
		jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor.add(jButtonFK_IdEvaluacionProveedorDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		jTabbedPaneBusquedasDetalleEvaluacionProveedor.addTab("1.-Por Evaluacion Proveedor ", jPanelFK_IdEvaluacionProveedorDetalleEvaluacionProveedor);
		jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.setLayout(gridaBagLayoutFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.add(jLabelid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
		jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.add(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx =1;
		jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor.add(jButtonFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		jTabbedPaneBusquedasDetalleEvaluacionProveedor.addTab("2.-Por Pregunta Evaluacion ", jPanelFK_IdPreguntaEvaluacionDetalleEvaluacionProveedor);
		jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSiNoDetalleEvaluacionProveedor.setLayout(gridaBagLayoutFK_IdSiNoDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		jPanelFK_IdSiNoDetalleEvaluacionProveedor.add(jLabelid_si_noFK_IdSiNoDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
		jPanelFK_IdSiNoDetalleEvaluacionProveedor.add(jComboBoxid_si_noFK_IdSiNoDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx =1;
		jPanelFK_IdSiNoDetalleEvaluacionProveedor.add(jButtonFK_IdSiNoDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		jTabbedPaneBusquedasDetalleEvaluacionProveedor.addTab("3.-Por Si No ", jPanelFK_IdSiNoDetalleEvaluacionProveedor);
		jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.setLayout(gridaBagLayoutFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.add(jLabelid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
		jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.add(jComboBoxid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleEvaluacionProveedor.gridy = 1;
		gridBagConstraintsDetalleEvaluacionProveedor.gridx =1;
		jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor.add(jButtonFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);

		jTabbedPaneBusquedasDetalleEvaluacionProveedor.addTab("4.-Por Sub Pregunta Evaluacion ", jPanelFK_IdSubPreguntaEvaluacionDetalleEvaluacionProveedor);
		jTabbedPaneBusquedasDetalleEvaluacionProveedor.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleEvaluacionProveedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;		
			//this.gridBagConstraintsDetalleEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;		
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);								
		
		
		/*
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/		
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleEvaluacionProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
				
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleEvaluacionProveedor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleEvaluacionProveedor.setLayout(gridaBagLayoutBusquedasParametrosDetalleEvaluacionProveedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleEvaluacionProveedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleEvaluacionProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setName("jPanelReporteDinamicoDetalleEvaluacionProveedor"); 
		
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.setLayout(gridaBagLayoutReporteDinamicoDetalleEvaluacionProveedor);
		
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jLabelColumnasSelectReporteDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleEvaluacionProveedor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor=new JScrollPane(this.jListColumnasSelectReporteDetalleEvaluacionProveedor);
			
			this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jListColumnasSelectReporteDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleEvaluacionProveedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleEvaluacionProveedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleEvaluacionProveedor=new JScrollPane(this.jListRelacionesSelectReporteDetalleEvaluacionProveedor);
			
			this.jScrollRelacionesSelectReporteDetalleEvaluacionProveedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleEvaluacionProveedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleEvaluacionProveedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleEvaluacionProveedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleEvaluacionProveedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jLabelGenerarExcelReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor.setToolTipText("Generar EXCEL"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jComboBoxTiposReportesDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jLabelTiposArchivoReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor.setToolTipText("Generar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jButtonGenerarReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor.setToolTipText("Cancelar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleEvaluacionProveedor.add(this.jButtonCerrarReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleEvaluacionProveedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor= new JScrollPane(jPanelReporteDinamicoDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleEvaluacionProveedor);
		this.jInternalFrameReporteDinamicoDetalleEvaluacionProveedor.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleEvaluacionProveedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleEvaluacionProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleEvaluacionProveedor.setName("jPanelImportacionDetalleEvaluacionProveedor"); 
		
		this.jPanelImportacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleEvaluacionProveedor.setLayout(gridaBagLayoutImportacionDetalleEvaluacionProveedor);
		
		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleEvaluacionProveedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleEvaluacionProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameImportacionDetalleEvaluacionProveedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelArchivoImportacionDetalleEvaluacionProveedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jLabelArchivoImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleEvaluacionProveedor = new JFileChooser();		
		this.jFileChooserImportacionDetalleEvaluacionProveedor.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonAbrirImportacionDetalleEvaluacionProveedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleEvaluacionProveedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleEvaluacionProveedor.setToolTipText("Generar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jButtonAbrirImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jLabelPathArchivoImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jTextFieldPathArchivoImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarImportacionDetalleEvaluacionProveedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleEvaluacionProveedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleEvaluacionProveedor.setToolTipText("Generar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jButtonGenerarImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarImportacionDetalleEvaluacionProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleEvaluacionProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleEvaluacionProveedor.setToolTipText("Cancelar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleEvaluacionProveedor.add(this.jButtonCerrarImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleEvaluacionProveedor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleEvaluacionProveedor= new JScrollPane(jPanelImportacionDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleEvaluacionProveedor);
		this.jInternalFrameImportacionDetalleEvaluacionProveedor.getContentPane().add(this.jScrollPanelImportacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleEvaluacionProveedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor = new JButtonMe();
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setText("Orden");
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleEvaluacionProveedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleEvaluacionProveedor";
			inputMap = this.jButtonAbrirOrderByDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleEvaluacionProveedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleEvaluacionProveedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleEvaluacionProveedor.setName("jPanelOrderByDetalleEvaluacionProveedor"); 
			
			this.jPanelOrderByDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleEvaluacionProveedor.setLayout(gridaBagLayoutOrderByDetalleEvaluacionProveedor);
			
			
			this.jTableDatosDetalleEvaluacionProveedorOrderBy = new JTableMe();        
			this.jTableDatosDetalleEvaluacionProveedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleEvaluacionProveedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleEvaluacionProveedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleEvaluacionProveedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleEvaluacionProveedorOrderBy.setViewportView(this.jTableDatosDetalleEvaluacionProveedorOrderBy);
			this.jTableDatosDetalleEvaluacionProveedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleEvaluacionProveedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleEvaluacionProveedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleEvaluacionProveedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleEvaluacionProveedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleEvaluacionProveedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setTitle("Orden");
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setResizable(true);
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setClosable(true);
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleEvaluacionProveedor.ipady =150;
				
			this.jPanelOrderByDetalleEvaluacionProveedor.add(jScrollPanelDatosDetalleEvaluacionProveedorOrderBy, this.gridBagConstraintsDetalleEvaluacionProveedor);//this.jTableDatosDetalleEvaluacionProveedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleEvaluacionProveedor = new JButtonMe();
			this.jButtonCerrarOrderByDetalleEvaluacionProveedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleEvaluacionProveedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleEvaluacionProveedor.setToolTipText("Cancelar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleEvaluacionProveedor.add(this.jButtonCerrarOrderByDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleEvaluacionProveedor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleEvaluacionProveedor= new JScrollPane(jPanelOrderByDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleEvaluacionProveedor);
			
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getContentPane().add(this.jScrollPanelOrderByDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
		
		} else {
			this.jButtonAbrirOrderByDetalleEvaluacionProveedor = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleEvaluacionProveedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleEvaluacionProveedor.getRowHeight();//DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.isSelected()) {
					iHeightTable=DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleEvaluacionProveedor.isSelected()) {
					iHeightTable=DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleEvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleEvaluacionProveedor!=null && this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleEvaluacionProveedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionproveedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleEvaluacionProveedor> TraerDetalleEvaluacionProveedorBeans(List<DetalleEvaluacionProveedor> detalleevaluacionproveedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleEvaluacionProveedor detalleevaluacionproveedor:detalleevaluacionproveedors) {
					
				if(!(DetalleEvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleEvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleevaluacionproveedor.setsDetalleGeneralEntityReporte(DetalleEvaluacionProveedorConstantesFunciones.getDetalleEvaluacionProveedorDescripcion(detalleevaluacionproveedor));
										
						
					
						
					
				} else  {
							
					//detalleevaluacionproveedor.setsDetalleGeneralEntityReporte(detalleevaluacionproveedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleevaluacionproveedorbeans.add(detalleevaluacionproveedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleevaluacionproveedors;
    }
	//PARA REPORTES FIN
}
