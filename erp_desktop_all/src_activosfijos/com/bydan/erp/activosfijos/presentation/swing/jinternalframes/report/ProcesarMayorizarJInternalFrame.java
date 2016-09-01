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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ProcesarMayorizarConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ProcesarMayorizarJInternalFrame extends ProcesarMayorizarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesarMayorizar;
	
	protected JMenuBar jmenuBarProcesarMayorizar;
	
	protected JMenu jmenuProcesarMayorizar;
	protected JMenu jmenuDatosProcesarMayorizar;
	protected JMenu jmenuArchivoProcesarMayorizar;
	protected JMenu jmenuAccionesProcesarMayorizar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarMayorizar;	
	protected GridBagConstraints gridBagConstraintsProcesarMayorizar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesarMayorizarDetalleFormJInternalFrame jInternalFrameDetalleFormProcesarMayorizar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesarMayorizar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesarMayorizar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesarMayorizarSessionBean procesarmayorizarSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesarMayorizar> procesarmayorizars;		
	public List<ProcesarMayorizar> procesarmayorizarsEliminados;	
	public List<ProcesarMayorizar> procesarmayorizarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesarMayorizar;		
	protected JButton jButtonAbrirOrderByProcesarMayorizar;
	
	
	//protected JPanel jPanelOrderByProcesarMayorizar;
	//public JScrollPane jScrollPanelOrderByProcesarMayorizar;	
	//protected JButton jButtonCerrarOrderByProcesarMayorizar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesarMayorizarLogic procesarmayorizarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesarMayorizar;
	public JScrollPane jScrollPanelDatosEdicionProcesarMayorizar;
	public JScrollPane jScrollPanelDatosGeneralProcesarMayorizar;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesarMayorizarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesarMayorizar;
	//public JScrollPane jScrollPanelImportacionProcesarMayorizar;
	
	
	
	protected JPanel jPanelAccionesProcesarMayorizar;
	
    protected JPanel jPanelPaginacionProcesarMayorizar;
    protected JPanel jPanelParametrosReportesProcesarMayorizar;
	protected JPanel jPanelParametrosReportesAccionesProcesarMayorizar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesarMayorizar;
	protected JPanel jPanelParametrosAuxiliar2ProcesarMayorizar;
	protected JPanel jPanelParametrosAuxiliar3ProcesarMayorizar;
	protected JPanel jPanelParametrosAuxiliar4ProcesarMayorizar;
	//protected JPanel jPanelParametrosAuxiliar5ProcesarMayorizar;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesarMayorizar;
	//protected JPanel jPanelImportacionProcesarMayorizar;
	
	
	public JTable jTableDatosProcesarMayorizar;
	
	
	
	//public JTable jTableDatosProcesarMayorizarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesarMayorizar;
	protected JButton jButtonDuplicarProcesarMayorizar;
	protected JButton jButtonCopiarProcesarMayorizar;
	protected JButton jButtonVerFormProcesarMayorizar;
	protected JButton jButtonNuevoRelacionesProcesarMayorizar;
	protected JButton jButtonModificarProcesarMayorizar;
	
    protected JButton jButtonGuardarCambiosTablaProcesarMayorizar;
	protected JButton jButtonCerrarProcesarMayorizar;
	
	
	protected JButton jButtonRecargarInformacionProcesarMayorizar;
	protected JButton jButtonProcesarInformacionProcesarMayorizar;
	
	
	protected JButton jButtonAnterioresProcesarMayorizar;
	protected JButton jButtonSiguientesProcesarMayorizar;
	protected JButton jButtonNuevoGuardarCambiosProcesarMayorizar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesarMayorizar;
	//protected JButton jButtonCerrarReporteDinamicoProcesarMayorizar;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesarMayorizar;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesarMayorizar;
	//protected JButton jButtonGenerarImportacionProcesarMayorizar;
	//protected JButton jButtonCerrarImportacionProcesarMayorizar;
	//protected JFileChooser jFileChooserImportacionProcesarMayorizar;
	//protected File fileImportacionProcesarMayorizar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarMayorizar;
	protected JButton jButtonDuplicarToolBarProcesarMayorizar;
	protected JButton jButtonNuevoRelacionesToolBarProcesarMayorizar;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesarMayorizar;
	protected JButton jButtonCopiarToolBarProcesarMayorizar;
	protected JButton jButtonVerFormToolBarProcesarMayorizar;
	public JButton jButtonGuardarCambiosTablaToolBarProcesarMayorizar;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarMayorizar;
	protected JButton jButtonCerrarToolBarProcesarMayorizar;
	
	protected JButton jButtonRecargarInformacionToolBarProcesarMayorizar;
	protected JButton jButtonProcesarInformacionToolBarProcesarMayorizar;
	protected JButton jButtonAnterioresToolBarProcesarMayorizar;
	protected JButton jButtonSiguientesToolBarProcesarMayorizar;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesarMayorizar;
	protected JButton jButtonAbrirOrderByToolBarProcesarMayorizar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarMayorizar;
	protected JMenuItem jMenuItemDuplicarProcesarMayorizar;
	protected JMenuItem jMenuItemNuevoRelacionesProcesarMayorizar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesarMayorizar;
	protected JMenuItem jMenuItemCopiarProcesarMayorizar;
	protected JMenuItem jMenuItemVerFormProcesarMayorizar;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarMayorizar;
	protected JMenuItem jMenuItemCerrarProcesarMayorizar;
	protected JMenuItem jMenuItemDetalleCerrarProcesarMayorizar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesarMayorizar;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarMayorizar;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesarMayorizar;
	protected JMenuItem jMenuItemProcesarInformacionProcesarMayorizar;
	protected JMenuItem jMenuItemAnterioresProcesarMayorizar;
	protected JMenuItem jMenuItemSiguientesProcesarMayorizar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarMayorizar;
	protected JMenuItem jMenuItemAbrirOrderByProcesarMayorizar;
	protected JMenuItem jMenuItemMostrarOcultarProcesarMayorizar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarMayorizar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesarMayorizar;
	protected JCheckBox jCheckBoxSeleccionadosProcesarMayorizar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesarMayorizar;
	protected JCheckBox jCheckBoxConGraficoReporteProcesarMayorizar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesarMayorizar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesarMayorizar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesarMayorizar;
	protected JTextField jTextFieldValorCampoGeneralProcesarMayorizar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesarMayorizar;
	//public JList<Reporte> jListColumnasSelectReporteProcesarMayorizar;
	//public JScrollPane jScrollColumnasSelectReporteProcesarMayorizar;
	
	//public JLabel jLabelRelacionesSelectReporteProcesarMayorizar;
	//public JList<Reporte> jListRelacionesSelectReporteProcesarMayorizar;
	//public JScrollPane jScrollRelacionesSelectReporteProcesarMayorizar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesarMayorizar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesarMayorizar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesarMayorizar;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesarMayorizar;
	
		
	//public JLabel jLabelArchivoImportacionProcesarMayorizar;	
	//public JLabel jLabelPathArchivoImportacionProcesarMayorizar;
	//protected JTextField jTextFieldPathArchivoImportacionProcesarMayorizar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesarMayorizar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesarMayorizar;
	
	//public JLabel jLabelColumnaCategoriaValorProcesarMayorizar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesarMayorizar;
	
	//public JLabel jLabelColumnasValoresGraficoProcesarMayorizar;
	//public JList<Reporte> jListColumnasValoresGraficoProcesarMayorizar;
	//public JScrollPane jScrollColumnasValoresGraficoProcesarMayorizar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesarMayorizar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesarMayorizar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesarMayorizar;
	public JPanel jPanelBusquedaProcesarMayorizarProcesarMayorizar;
	public JButton jButtonBusquedaProcesarMayorizarProcesarMayorizar;
	
	public JPanel jPanelid_anioBusquedaProcesarMayorizarProcesarMayorizar;
	public JLabel jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar;
	public JButton jButtonid_anioBusquedaProcesarMayorizarProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesarMayorizarProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesarMayorizarProcesarMayorizarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaProcesarMayorizarProcesarMayorizar;
	public JLabel jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar;
	public JButton jButtonid_mesBusquedaProcesarMayorizarProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesarMayorizarProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesarMayorizarProcesarMayorizarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar;
	public JLabel jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar;
	public JButton jButtonid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizarBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesarMayorizarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesarMayorizar)	{
		this.jButtonRecargarInformacionProcesarMayorizar = jButtonRecargarInformacionProcesarMayorizar;
	}
	
	public JButton getjButtonProcesarInformacionProcesarMayorizar() {
		return this.jButtonProcesarInformacionProcesarMayorizar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarMayorizar)	{
		this.jButtonProcesarInformacionProcesarMayorizar = jButtonProcesarInformacionProcesarMayorizar;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesarMayorizar() {
		return this.jButtonRecargarInformacionProcesarMayorizar;
	}
	
	
	public List<ProcesarMayorizar> getprocesarmayorizars() {
		return this.procesarmayorizars;
	}

	public void setprocesarmayorizars(List<ProcesarMayorizar> procesarmayorizars) {
		this.procesarmayorizars = procesarmayorizars;
	}
	
	public List<ProcesarMayorizar> getprocesarmayorizarsAux() {
		return this.procesarmayorizarsAux;
	}

	public void setprocesarmayorizarsAux(List<ProcesarMayorizar> procesarmayorizarsAux) {
		this.procesarmayorizarsAux = procesarmayorizarsAux;
	}
	
	public List<ProcesarMayorizar> getprocesarmayorizarsEliminados() {
		return this.procesarmayorizarsEliminados;
	}

	public void setProcesarMayorizarsEliminados(List<ProcesarMayorizar> procesarmayorizarsEliminados) {
		this.procesarmayorizarsEliminados = procesarmayorizarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesarMayorizar() {
		return jComboBoxTiposSeleccionarProcesarMayorizar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesarMayorizar(
			JComboBox jComboBoxTiposSeleccionarProcesarMayorizar) {
		this.jComboBoxTiposSeleccionarProcesarMayorizar = jComboBoxTiposSeleccionarProcesarMayorizar;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesarMayorizar() {
		return jTextFieldValorCampoGeneralProcesarMayorizar;
	}

	public void setjTextFieldValorCampoGeneralProcesarMayorizar(
			JTextField jTextFieldValorCampoGeneralProcesarMayorizar) {
		this.jTextFieldValorCampoGeneralProcesarMayorizar = jTextFieldValorCampoGeneralProcesarMayorizar;
	}

	public void setBorderResaltarValorCampoGeneralProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesarMayorizar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesarMayorizar() {
		return this.jCheckBoxSeleccionarTodosProcesarMayorizar;
	}

	public void setjCheckBoxSeleccionarTodosProcesarMayorizar(
			JCheckBox jCheckBoxSeleccionarTodosProcesarMayorizar) {
		this.jCheckBoxSeleccionarTodosProcesarMayorizar = jCheckBoxSeleccionarTodosProcesarMayorizar;
	}

	public void setBorderResaltarSeleccionarTodosProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesarMayorizar() {
		return this.jCheckBoxSeleccionadosProcesarMayorizar;
	}

	public void setjCheckBoxSeleccionadosProcesarMayorizar(
			JCheckBox jCheckBoxSeleccionadosProcesarMayorizar) {
		this.jCheckBoxSeleccionadosProcesarMayorizar = jCheckBoxSeleccionadosProcesarMayorizar;
	}
	
	public void setBorderResaltarSeleccionadosProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesarMayorizar() {
		return this.jComboBoxTiposArchivosReportesProcesarMayorizar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesarMayorizar(
			JComboBox jComboBoxTiposArchivosReportesProcesarMayorizar) {
		this.jComboBoxTiposArchivosReportesProcesarMayorizar = jComboBoxTiposArchivosReportesProcesarMayorizar;
	}

	public void setBorderResaltarTiposArchivosReportesProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesarMayorizar() {
		return this.jComboBoxTiposReportesProcesarMayorizar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesarMayorizar(
			JComboBox jComboBoxTiposReportesProcesarMayorizar) {
		this.jComboBoxTiposReportesProcesarMayorizar = jComboBoxTiposReportesProcesarMayorizar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesarMayorizar() {
	//	return jComboBoxTiposReportesDinamicoProcesarMayorizar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesarMayorizar(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesarMayorizar) {
	//	this.jComboBoxTiposReportesDinamicoProcesarMayorizar = jComboBoxTiposReportesDinamicoProcesarMayorizar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesarMayorizar() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesarMayorizar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar = jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar;
	//}
	
	public void setBorderResaltarTiposReportesProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesarMayorizar() {
		return this.jComboBoxTiposGraficosReportesProcesarMayorizar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesarMayorizar(
			JComboBox jComboBoxTiposGraficosReportesProcesarMayorizar) {
		this.jComboBoxTiposGraficosReportesProcesarMayorizar = jComboBoxTiposGraficosReportesProcesarMayorizar;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesarMayorizar() {
		return this.jComboBoxTiposPaginacionProcesarMayorizar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesarMayorizar(
			JComboBox jComboBoxTiposPaginacionProcesarMayorizar) {
		this.jComboBoxTiposPaginacionProcesarMayorizar = jComboBoxTiposPaginacionProcesarMayorizar;
	}
	
	public void setBorderResaltarTiposPaginacionProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesarMayorizar() {
		return this.jComboBoxTiposRelacionesProcesarMayorizar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarMayorizar() {
		return this.jComboBoxTiposAccionesProcesarMayorizar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarMayorizar(
			JComboBox jComboBoxTiposRelacionesProcesarMayorizar) {
		this.jComboBoxTiposRelacionesProcesarMayorizar = jComboBoxTiposRelacionesProcesarMayorizar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarMayorizar(
			JComboBox jComboBoxTiposAccionesProcesarMayorizar) {
		this.jComboBoxTiposAccionesProcesarMayorizar = jComboBoxTiposAccionesProcesarMayorizar;
	}
	
	public void setBorderResaltarTiposRelacionesProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesarMayorizar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesarMayorizar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesarMayorizar() {
	//	return jCheckBoxConGraficoDinamicoProcesarMayorizar;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesarMayorizar(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesarMayorizar) {
	//	this.jCheckBoxConGraficoDinamicoProcesarMayorizar = jCheckBoxConGraficoDinamicoProcesarMayorizar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesarMayorizar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesarMayorizar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesarMayorizar .setBorder(borderResaltar);		
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
		this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
		
		this.procesarmayorizarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarmayorizarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarmayorizarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarMayorizarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Mayorizar MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesarMayorizarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesarMayorizar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"nuevo","nuevo","Nuevo"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"duplicar","duplicar","Duplicar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"copiar","copiar","Copiar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"ver_form","ver_form","Ver"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"recargar","recargar","Buscar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesarMayorizar,this.jTtoolBarProcesarMayorizar,
							"cerrar","cerrar","Salir"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesarMayorizar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesarMayorizar;
			
				this.jButtonProcesarInformacionToolBarProcesarMayorizar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesarMayorizar;
				
		//protected JButton jButtonModificarToolBarProcesarMayorizar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesarMayorizar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesarMayorizar=new JMenuMe("General");
		this.jmenuArchivoProcesarMayorizar=new JMenuMe("Archivo");
		this.jmenuAccionesProcesarMayorizar=new JMenuMe("Acciones");
		this.jmenuDatosProcesarMayorizar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarMayorizar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarMayorizar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarMayorizar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesarMayorizar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesarMayorizar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesarMayorizar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesarMayorizar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesarMayorizar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesarMayorizar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesarMayorizar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarMayorizar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarMayorizar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesarMayorizar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesarMayorizar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesarMayorizar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesarMayorizar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesarMayorizar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesarMayorizar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesarMayorizar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesarMayorizar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesarMayorizar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarMayorizar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarMayorizar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarMayorizar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesarMayorizar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesarMayorizar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesarMayorizar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesarMayorizar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesarMayorizar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesarMayorizar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesarMayorizar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesarMayorizar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesarMayorizar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesarMayorizar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesarMayorizar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesarMayorizar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesarMayorizar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesarMayorizar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesarMayorizar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarMayorizar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarMayorizar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarMayorizar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesarMayorizar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesarMayorizar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesarMayorizar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarMayorizar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarMayorizar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarMayorizar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesarMayorizar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesarMayorizar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesarMayorizar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesarMayorizar.add(this.jMenuItemCerrarProcesarMayorizar);
			
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemNuevoProcesarMayorizar);
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemNuevoGuardarCambiosProcesarMayorizar);
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemNuevoRelacionesProcesarMayorizar);
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemGuardarCambiosTablaProcesarMayorizar);		
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemDuplicarProcesarMayorizar);		
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemCopiarProcesarMayorizar);		
			this.jmenuAccionesProcesarMayorizar.add(this.jMenuItemVerFormProcesarMayorizar);		
			
			this.jmenuDatosProcesarMayorizar.add(this.jMenuItemRecargarInformacionProcesarMayorizar);				
			this.jmenuDatosProcesarMayorizar.add(this.jMenuItemAnterioresProcesarMayorizar);				
			this.jmenuDatosProcesarMayorizar.add(this.jMenuItemSiguientesProcesarMayorizar);				
			this.jmenuDatosProcesarMayorizar.add(this.jMenuItemAbrirOrderByProcesarMayorizar);				
			this.jmenuDatosProcesarMayorizar.add(this.jMenuItemMostrarOcultarProcesarMayorizar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesarMayorizar.add(this.jMenuItemGuardarCambiosProcesarMayorizar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesarMayorizar.add(this.jmenuArchivoProcesarMayorizar);		
			this.jmenuBarProcesarMayorizar.add(this.jmenuAccionesProcesarMayorizar);		
			this.jmenuBarProcesarMayorizar.add(this.jmenuDatosProcesarMayorizar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesarMayorizar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesarMayorizar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesarMayorizarProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesarMayorizarProcesarMayorizar.setToolTipText("Buscar Por Anio Por Mes Por Tipo Documento ");
		this.jButtonBusquedaProcesarMayorizarProcesarMayorizar= new JButtonMe();
		this.jButtonBusquedaProcesarMayorizarProcesarMayorizar.setText("Buscar");
		this.jButtonBusquedaProcesarMayorizarProcesarMayorizar.setToolTipText("Buscar Por Anio Por Mes Por Tipo Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesarMayorizarProcesarMayorizar,"buscar_button","Buscar Por Anio Por Mes Por Tipo Documento ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesarMayorizarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar = new JLabelMe();
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar.setText("Anio :");
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar = new JLabelMe();
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar.setText("Mes :");
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar = new JLabelMe();
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setText("Tipo Documento :");
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesarMayorizar=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesarMayorizar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesarMayorizar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesarMayorizar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesarMayorizar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesarMayorizar = new ProcesarMayorizarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Procesar Mayorizar DATOS");
			this.jInternalFrameDetalleFormProcesarMayorizar = new ProcesarMayorizarDetalleFormJInternalFrame(jDesktopPane,this.procesarmayorizarSessionBean.getConGuardarRelaciones(),this.procesarmayorizarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesarMayorizar = null;//new ProcesarMayorizarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarMayorizar= new GridBagLayout();
		
		
		this.jTableDatosProcesarMayorizar = new JTableMe();      
		
		String sToolTipProcesarMayorizar="";
		sToolTipProcesarMayorizar=ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarMayorizar+="(ActivosFijos.ProcesarMayorizar)";
		}
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarMayorizar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesarMayorizar.setToolTipText(sToolTipProcesarMayorizar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesarMayorizar);
		this.jTableDatosProcesarMayorizar.setAutoCreateRowSorter(true);
		this.jTableDatosProcesarMayorizar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesarMayorizar.setRowSelectionAllowed(true);
		this.jTableDatosProcesarMayorizar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesarMayorizar = new JButtonMe();
		this.jButtonDuplicarProcesarMayorizar = new JButtonMe();
		this.jButtonCopiarProcesarMayorizar = new JButtonMe();
		this.jButtonVerFormProcesarMayorizar = new JButtonMe();
		this.jButtonNuevoRelacionesProcesarMayorizar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar = new JButtonMe();
		this.jButtonCerrarProcesarMayorizar = new JButtonMe();
		
		this.jScrollPanelDatosProcesarMayorizar = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesarMayorizar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Mayorizar";
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarMayorizar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarMayorizar.setToolTipText("Acciones");
        this.jPanelAccionesProcesarMayorizar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesarMayorizar=new ReporteDinamicoJInternalFrame(ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesarMayorizar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesarMayorizar=new ImportacionJInternalFrame(ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesarMayorizar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesarMayorizar = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesarMayorizar.setText("Orden");
		this.jButtonAbrirOrderByProcesarMayorizar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarMayorizar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarMayorizar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarMayorizar,false,this);
			
			//this.cargarOrderByProcesarMayorizar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesarMayorizar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarMayorizar,true,this);
			
			//this.cargarOrderByProcesarMayorizar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesarMayorizar.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesarMayorizar.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesarMayorizar.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesarMayorizar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarMayorizar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesarMayorizar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesarMayorizar.setText("Nuevo");
		this.jButtonDuplicarProcesarMayorizar.setText("Duplicar");
		this.jButtonCopiarProcesarMayorizar.setText("Copiar");
		this.jButtonVerFormProcesarMayorizar.setText("Ver");
		this.jButtonNuevoRelacionesProcesarMayorizar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.setText("Guardar");
		this.jButtonCerrarProcesarMayorizar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarMayorizar,"nuevo_button","Nuevo",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesarMayorizar,"duplicar_button","Duplicar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesarMayorizar,"copiar_button","Copiar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesarMayorizar,"ver_form","Ver",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesarMayorizar,"nuevorelaciones_button","Nuevo Rel",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarMayorizar,"guardarcambiostabla_button","Guardar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarMayorizar,"cerrar_button","Salir",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesarMayorizar.setToolTipText("Nuevo"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesarMayorizar.setToolTipText("Duplicar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesarMayorizar.setToolTipText("Copiar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesarMayorizar.setToolTipText("Ver"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesarMayorizar.setToolTipText("Nuevo Rel"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.setToolTipText("Guardar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarMayorizar.setToolTipText("Salir"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarMayorizar";
		inputMap = this.jButtonNuevoProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarMayorizar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarMayorizar"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesarMayorizar";
		inputMap = this.jButtonDuplicarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesarMayorizar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesarMayorizar"));
		
		//COPIAR
		sMapKey = "CopiarProcesarMayorizar";
		inputMap = this.jButtonCopiarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesarMayorizar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesarMayorizar"));
		
		//VEr FORM
		sMapKey = "VerFormProcesarMayorizar";
		inputMap = this.jButtonVerFormProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesarMayorizar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesarMayorizar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesarMayorizar";
		inputMap = this.jButtonNuevoRelacionesProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesarMayorizar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesarMayorizar";
		inputMap = this.jButtonModificarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesarMayorizar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesarMayorizar";
		inputMap = this.jButtonCerrarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarMayorizar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarMayorizar";
		inputMap = this.jButtonGuardarCambiosTablaProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarMayorizar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesarMayorizar.setName("jPanelParametrosReportesProcesarMayorizar"); 
		
		this.jPanelParametrosReportesAccionesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesarMayorizar.setName("jPanelParametrosReportesAccionesProcesarMayorizar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesarMayorizar = new JButtonMe();
		this.jButtonRecargarInformacionProcesarMayorizar.setText("Buscar");
		this.jButtonRecargarInformacionProcesarMayorizar.setToolTipText("Buscar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesarMayorizar,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionProcesarMayorizar = new JButtonMe();
		this.jButtonProcesarInformacionProcesarMayorizar.setText("Procesar");
		this.jButtonProcesarInformacionProcesarMayorizar.setToolTipText("Procesar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesarMayorizar.setVisible(false);
			
		this.jButtonProcesarInformacionProcesarMayorizar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarMayorizar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesarMayorizar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarMayorizar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesarMayorizar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarMayorizar.setText("TIPO");       
		this.jComboBoxTiposReportesProcesarMayorizar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesarMayorizar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesarMayorizar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesarMayorizar.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesarMayorizar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesarMayorizar.setText("Accion");
		this.jComboBoxTiposRelacionesProcesarMayorizar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarMayorizar.setText("Accion");
		this.jComboBoxTiposAccionesProcesarMayorizar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesarMayorizar.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesarMayorizar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesarMayorizar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesarMayorizar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarMayorizar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesarMayorizar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesarMayorizar = new JLabelMe();
		
		this.jLabelAccionesProcesarMayorizar.setText("Acciones");		
		this.jLabelAccionesProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesarMayorizar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesarMayorizar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesarMayorizar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesarMayorizar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesarMayorizar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesarMayorizar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesarMayorizar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesarMayorizar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesarMayorizar.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesarMayorizar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesarMayorizar = new JButtonMe();
		//this.jButtonAnterioresProcesarMayorizar.setText("<<");
        this.jButtonAnterioresProcesarMayorizar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesarMayorizar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesarMayorizar = new JButtonMe();
		//this.jButtonSiguientesProcesarMayorizar.setText(">>");
        this.jButtonSiguientesProcesarMayorizar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesarMayorizar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesarMayorizar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesarMayorizar.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesarMayorizar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesarMayorizar,"nuevoguardarcambios_button","Nue",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesarMayorizar";
		inputMap = this.jButtonNuevoGuardarCambiosProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesarMayorizar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesarMayorizar";
		inputMap = this.jButtonRecargarInformacionProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesarMayorizar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesarMayorizar";
		inputMap = this.jButtonSiguientesProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesarMayorizar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesarMayorizar";
		inputMap = this.jButtonAnterioresProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesarMayorizar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesarMayorizar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesarMayorizar.setMinimumSize(new Dimension(this.getWidth(),ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarMayorizar.setMaximumSize(new Dimension(this.getWidth(),ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesarMayorizar.setPreferredSize(new Dimension(this.getWidth(),ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesarMayorizarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesarMayorizar = new GridBagLayout();

			this.jPanelPaginacionProcesarMayorizar.setLayout(gridaBagLayoutPaginacionProcesarMayorizar);						
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 0;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonAnterioresProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					
						
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarMayorizar.gridy = 0;
			
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonNuevoGuardarCambiosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
						
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesarMayorizar.gridy = 0;
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonSiguientesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonNuevoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
						
			
			
			if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
				this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesarMayorizar.gridy = 1;
				this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesarMayorizar.add(this.jButtonGuardarCambiosTablaProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			}
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonProcesarInformacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonDuplicarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonCopiarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonVerFormProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 1;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesarMayorizar.add(this.jButtonCerrarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
		
		
		this.jButtonRecargarInformacionProcesarMayorizar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarMayorizar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesarMayorizar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesarMayorizar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarMayorizar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesarMayorizar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesarMayorizar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarMayorizar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesarMayorizar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesarMayorizar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarMayorizar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesarMayorizar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesarMayorizar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarMayorizar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesarMayorizar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesarMayorizar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarMayorizar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesarMayorizar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesarMayorizar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarMayorizar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarMayorizar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesarMayorizar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarMayorizar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesarMayorizar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesarMayorizar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarMayorizar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesarMayorizar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesarMayorizar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarMayorizar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesarMayorizar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesarMayorizar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarMayorizar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesarMayorizar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesarMayorizar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesarMayorizar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesarMayorizar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesarMayorizar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesarMayorizar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesarMayorizar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesarMayorizar.setLayout(gridaBagParametrosReportesProcesarMayorizar);
			this.jPanelParametrosReportesAccionesProcesarMayorizar.setLayout(gridaBagParametrosReportesAccionesProcesarMayorizar);
			
			
			this.jPanelParametrosAuxiliar1ProcesarMayorizar.setLayout(gridaBagParametrosAuxiliar1ProcesarMayorizar);
			this.jPanelParametrosAuxiliar2ProcesarMayorizar.setLayout(gridaBagParametrosAuxiliar2ProcesarMayorizar);
			this.jPanelParametrosAuxiliar3ProcesarMayorizar.setLayout(gridaBagParametrosAuxiliar3ProcesarMayorizar);
			this.jPanelParametrosAuxiliar4ProcesarMayorizar.setLayout(gridaBagParametrosAuxiliar4ProcesarMayorizar);
			//this.jPanelParametrosAuxiliar5ProcesarMayorizar.setLayout(gridaBagParametrosAuxiliar2ProcesarMayorizar);			
			
			
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jButtonRecargarInformacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarMayorizar.add(this.jComboBoxTiposPaginacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarMayorizar.add(this.jCheckBoxConAltoMaximoTablaProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesarMayorizar.add(this.jComboBoxTiposArchivosReportesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jPanelParametrosAuxiliar1ProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesarMayorizar.add(this.jComboBoxTiposReportesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jPanelParametrosAuxiliar4ProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jComboBoxTiposReportesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jCheckBoxGenerarReporteProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jPanelParametrosAuxiliar2ProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jLabelAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jComboBoxTiposSeleccionarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
			
			
			/*
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jCheckBoxSeleccionarTodosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarMayorizar.add(this.jCheckBoxSeleccionarTodosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);															
				
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesarMayorizar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesarMayorizar.add(this.jCheckBoxSeleccionadosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jPanelParametrosAuxiliar3ProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesarMayorizar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesarMayorizar.add(this.jComboBoxTiposAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesarMayorizar = new GridBagLayout();

			this.jScrollPanelDatosProcesarMayorizar.setLayout(gridaBagLayoutDatosProcesarMayorizar);
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = 0;
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;
			
			this.jScrollPanelDatosProcesarMayorizar.add(this.jTableDatosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesarMayorizar.setViewportView(this.jTableDatosProcesarMayorizar);
		this.jTableDatosProcesarMayorizar.setFillsViewportHeight(true);
		this.jTableDatosProcesarMayorizar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesarMayorizar= new GridBagLayout();
		this.jPanelAccionesProcesarMayorizar.setLayout(gridaBagLayoutAccionesProcesarMayorizar);
		
		
		/*	
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
			
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonNuevoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar= new GridBagLayout();
		gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.setLayout(gridaBagLayoutBusquedaProcesarMayorizarProcesarMayorizar);

		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 0;
		gridBagConstraintsProcesarMayorizar.gridx = 0;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jLabelid_anioBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);

		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 0;
		gridBagConstraintsProcesarMayorizar.gridx = 1;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jComboBoxid_anioBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);


		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 1;
		gridBagConstraintsProcesarMayorizar.gridx = 0;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jLabelid_mesBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);

		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 1;
		gridBagConstraintsProcesarMayorizar.gridx = 1;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jComboBoxid_mesBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);


		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 2;
		gridBagConstraintsProcesarMayorizar.gridx = 0;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jLabelid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);

		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 2;
		gridBagConstraintsProcesarMayorizar.gridx = 1;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jComboBoxid_tipo_documentoBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);

		gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesarMayorizar.gridy = 3;
		gridBagConstraintsProcesarMayorizar.gridx =1;
		jPanelBusquedaProcesarMayorizarProcesarMayorizar.add(jButtonBusquedaProcesarMayorizarProcesarMayorizar, gridBagConstraintsProcesarMayorizar);

		jTabbedPaneBusquedasProcesarMayorizar.addTab("1.-Por Anio Por Mes Por Tipo Documento ", jPanelBusquedaProcesarMayorizarProcesarMayorizar);
		jTabbedPaneBusquedasProcesarMayorizar.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarMayorizar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();						
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;		
			//this.gridBagConstraintsProcesarMayorizar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarMayorizar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;		
		//this.gridBagConstraintsProcesarMayorizar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesarMayorizar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;		
			this.gridBagConstraintsProcesarMayorizar.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesarMayorizar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);								
		
		
		/*
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		*/		
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarMayorizar.gridx =0;
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarMayorizar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
				
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesarMayorizar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarMayorizar = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesarMayorizar.setLayout(gridaBagLayoutBusquedasParametrosProcesarMayorizar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesarMayorizar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarMayorizar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarMayorizar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarMayorizar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		*/
		
			
     	//pack();
		
		
		
		this.jButtonRecargarInformacionProcesarMayorizar.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesarMayorizar.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesarMayorizar.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesarMayorizar.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesarMayorizar.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesarMayorizar.setVisible(false);
		this.jMenuItemRecargarInformacionProcesarMayorizar.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesarMayorizar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesarMayorizar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesarMayorizar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesarMayorizar.setName("jPanelReporteDinamicoProcesarMayorizar"); 
		
		this.jPanelReporteDinamicoProcesarMayorizar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarMayorizar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesarMayorizar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesarMayorizar.setLayout(gridaBagLayoutReporteDinamicoProcesarMayorizar);
		
		
		this.jInternalFrameReporteDinamicoProcesarMayorizar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesarMayorizar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarMayorizar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesarMayorizar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesarMayorizar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesarMayorizar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesarMayorizar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesarMayorizar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesarMayorizar.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesarMayorizar.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesarMayorizar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesarMayorizar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarMayorizar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesarMayorizar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesarMayorizar = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesarMayorizar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jLabelColumnasSelectReporteProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesarMayorizar = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesarMayorizar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesarMayorizar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesarMayorizar=new JScrollPane(this.jListColumnasSelectReporteProcesarMayorizar);
			
			this.jScrollColumnasSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesarMayorizar.add(this.jListColumnasSelectReporteProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jScrollColumnasSelectReporteProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesarMayorizar = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesarMayorizar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesarMayorizar = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesarMayorizar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesarMayorizar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesarMayorizar=new JScrollPane(this.jListRelacionesSelectReporteProcesarMayorizar);
			
			this.jScrollRelacionesSelectReporteProcesarMayorizar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarMayorizar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesarMayorizar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesarMayorizar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesarMayorizar = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesarMayorizar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesarMayorizar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesarMayorizar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesarMayorizar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarMayorizar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesarMayorizar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jLabelGenerarExcelReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar.setToolTipText("Generar EXCEL"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesarMayorizar.add(this.jButtonGenerarExcelReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jComboBoxTiposReportesDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jLabelTiposArchivoReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jComboBoxTiposArchivosReportesDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesarMayorizar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesarMayorizar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesarMayorizar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesarMayorizar.setToolTipText("Generar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jButtonGenerarReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesarMayorizar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesarMayorizar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesarMayorizar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesarMayorizar.setToolTipText("Cancelar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesarMayorizar.add(this.jButtonCerrarReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesarMayorizar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesarMayorizar= new JScrollPane(jPanelReporteDinamicoProcesarMayorizar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesarMayorizar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarMayorizar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesarMayorizar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesarMayorizar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesarMayorizar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesarMayorizar);
		this.jInternalFrameReporteDinamicoProcesarMayorizar.getContentPane().add(this.jScrollPanelReporteDinamicoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesarMayorizar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesarMayorizar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesarMayorizar.setName("jPanelImportacionProcesarMayorizar"); 
		
		this.jPanelImportacionProcesarMayorizar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarMayorizar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesarMayorizar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesarMayorizar.setLayout(gridaBagLayoutImportacionProcesarMayorizar);
		
		
		this.jInternalFrameImportacionProcesarMayorizar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesarMayorizar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesarMayorizar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesarMayorizar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesarMayorizar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarMayorizar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarMayorizar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesarMayorizar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarMayorizar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarMayorizar.setResizable(true);
	    this.jInternalFrameImportacionProcesarMayorizar.setClosable(true);
	    this.jInternalFrameImportacionProcesarMayorizar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesarMayorizar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesarMayorizar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesarMayorizar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesarMayorizar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesarMayorizar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesarMayorizar.setResizable(true);
	    this.jInternalFrameImportacionProcesarMayorizar.setClosable(true);
	    this.jInternalFrameImportacionProcesarMayorizar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesarMayorizar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarMayorizar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesarMayorizar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesarMayorizar = new JLabelMe();

		this.jLabelArchivoImportacionProcesarMayorizar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarMayorizar.add(this.jLabelArchivoImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesarMayorizar = new JFileChooser();		
		this.jFileChooserImportacionProcesarMayorizar.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesarMayorizar = new JButtonMe();
		this.jButtonAbrirImportacionProcesarMayorizar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesarMayorizar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesarMayorizar.setToolTipText("Generar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarMayorizar.add(this.jButtonAbrirImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesarMayorizar = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesarMayorizar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesarMayorizar.add(this.jLabelPathArchivoImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesarMayorizar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesarMayorizar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarMayorizar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesarMayorizar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarMayorizar.add(this.jTextFieldPathArchivoImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesarMayorizar = new JButtonMe();
		this.jButtonGenerarImportacionProcesarMayorizar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesarMayorizar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesarMayorizar.setToolTipText("Generar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarMayorizar.add(this.jButtonGenerarImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesarMayorizar = new JButtonMe();
		this.jButtonCerrarImportacionProcesarMayorizar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesarMayorizar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesarMayorizar.setToolTipText("Cancelar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesarMayorizar.add(this.jButtonCerrarImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesarMayorizar = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesarMayorizar= new JScrollPane(jPanelImportacionProcesarMayorizar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesarMayorizar.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesarMayorizar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesarMayorizar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesarMayorizar);
		this.jInternalFrameImportacionProcesarMayorizar.getContentPane().add(this.jScrollPanelImportacionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesarMayorizar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesarMayorizar = new JButtonMe();
			this.jButtonAbrirOrderByProcesarMayorizar.setText("Orden");
			this.jButtonAbrirOrderByProcesarMayorizar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesarMayorizar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesarMayorizar";
			inputMap = this.jButtonAbrirOrderByProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesarMayorizar"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesarMayorizar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesarMayorizar.setName("jPanelOrderByProcesarMayorizar"); 
			
			this.jPanelOrderByProcesarMayorizar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarMayorizar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesarMayorizar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesarMayorizar.setLayout(gridaBagLayoutOrderByProcesarMayorizar);
			
			
			this.jTableDatosProcesarMayorizarOrderBy = new JTableMe();        
			this.jTableDatosProcesarMayorizarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesarMayorizarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesarMayorizarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesarMayorizarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesarMayorizarOrderBy.setViewportView(this.jTableDatosProcesarMayorizarOrderBy);
			this.jTableDatosProcesarMayorizarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesarMayorizarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesarMayorizar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesarMayorizar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesarMayorizar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesarMayorizar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesarMayorizar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesarMayorizar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesarMayorizar.setTitle("Orden");
			this.jInternalFrameOrderByProcesarMayorizar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesarMayorizar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesarMayorizar.setResizable(true);
			this.jInternalFrameOrderByProcesarMayorizar.setClosable(true);
			this.jInternalFrameOrderByProcesarMayorizar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesarMayorizar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarMayorizar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesarMayorizar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesarMayorizar.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesarMayorizar.ipady =150;
				
			this.jPanelOrderByProcesarMayorizar.add(jScrollPanelDatosProcesarMayorizarOrderBy, this.gridBagConstraintsProcesarMayorizar);//this.jTableDatosProcesarMayorizarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesarMayorizar = new JButtonMe();
			this.jButtonCerrarOrderByProcesarMayorizar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesarMayorizar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesarMayorizar.setToolTipText("Cancelar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesarMayorizar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesarMayorizar.add(this.jButtonCerrarOrderByProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesarMayorizar = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesarMayorizar= new JScrollPane(jPanelOrderByProcesarMayorizar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesarMayorizar.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesarMayorizar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesarMayorizar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesarMayorizar);
			
			this.jInternalFrameOrderByProcesarMayorizar.getContentPane().add(this.jScrollPanelOrderByProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
		
		} else {
			this.jButtonAbrirOrderByProcesarMayorizar = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesarmayorizarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesarMayorizar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesarMayorizar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesarMayorizar.getRowHeight();//ProcesarMayorizarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.isSelected()) {
					iHeightTable=ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesarMayorizar.isSelected()) {
					iHeightTable=ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesarMayorizarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesarMayorizar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarMayorizar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesarMayorizar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesarMayorizar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarMayorizar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesarMayorizar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesarMayorizar!=null && this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy()!=null) {
			//if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesarMayorizar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesarMayorizar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesarMayorizar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesarMayorizar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesarMayorizar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarMayorizar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesarMayorizar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesarmayorizarLogic.getProcesarMayorizars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarmayorizars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesarMayorizar> TraerProcesarMayorizarBeans(List<ProcesarMayorizar> procesarmayorizars,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesarMayorizar procesarmayorizar:procesarmayorizars) {
					
				if(!(ProcesarMayorizarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesarMayorizarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesarmayorizar.setsDetalleGeneralEntityReporte(ProcesarMayorizarConstantesFunciones.getProcesarMayorizarDescripcion(procesarmayorizar));
										
						
					
						
					
				} else  {
							
					//procesarmayorizar.setsDetalleGeneralEntityReporte(procesarmayorizar.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesarmayorizarbeans.add(procesarmayorizarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesarmayorizars;
    }
	//PARA REPORTES FIN
}
