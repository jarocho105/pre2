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
import com.bydan.erp.contabilidad.util.report.EstadosFlujosCajasConstantesFunciones;

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
public class EstadosFlujosCajasJInternalFrame extends EstadosFlujosCajasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadosFlujosCajas;
	
	protected JMenuBar jmenuBarEstadosFlujosCajas;
	
	protected JMenu jmenuEstadosFlujosCajas;
	protected JMenu jmenuDatosEstadosFlujosCajas;
	protected JMenu jmenuArchivoEstadosFlujosCajas;
	protected JMenu jmenuAccionesEstadosFlujosCajas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadosFlujosCajas;	
	protected GridBagConstraints gridBagConstraintsEstadosFlujosCajas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadosFlujosCajasDetalleFormJInternalFrame jInternalFrameDetalleFormEstadosFlujosCajas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadosFlujosCajas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadosFlujosCajas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";
	
	public EstadosFlujosCajasSessionBean estadosflujoscajasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadosFlujosCajas> estadosflujoscajass;		
	public List<EstadosFlujosCajas> estadosflujoscajassEliminados;	
	public List<EstadosFlujosCajas> estadosflujoscajassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadosFlujosCajas;		
	protected JButton jButtonAbrirOrderByEstadosFlujosCajas;
	
	
	//protected JPanel jPanelOrderByEstadosFlujosCajas;
	//public JScrollPane jScrollPanelOrderByEstadosFlujosCajas;	
	//protected JButton jButtonCerrarOrderByEstadosFlujosCajas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadosFlujosCajasLogic estadosflujoscajasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadosFlujosCajas;
	public JScrollPane jScrollPanelDatosEdicionEstadosFlujosCajas;
	public JScrollPane jScrollPanelDatosGeneralEstadosFlujosCajas;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadosFlujosCajasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadosFlujosCajas;
	//public JScrollPane jScrollPanelImportacionEstadosFlujosCajas;
	
	
	
	protected JPanel jPanelAccionesEstadosFlujosCajas;
	
    protected JPanel jPanelPaginacionEstadosFlujosCajas;
    protected JPanel jPanelParametrosReportesEstadosFlujosCajas;
	protected JPanel jPanelParametrosReportesAccionesEstadosFlujosCajas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadosFlujosCajas;
	protected JPanel jPanelParametrosAuxiliar2EstadosFlujosCajas;
	protected JPanel jPanelParametrosAuxiliar3EstadosFlujosCajas;
	protected JPanel jPanelParametrosAuxiliar4EstadosFlujosCajas;
	//protected JPanel jPanelParametrosAuxiliar5EstadosFlujosCajas;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadosFlujosCajas;
	//protected JPanel jPanelImportacionEstadosFlujosCajas;
	
	
	public JTable jTableDatosEstadosFlujosCajas;
	
	
	
	//public JTable jTableDatosEstadosFlujosCajasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadosFlujosCajas;
	protected JButton jButtonDuplicarEstadosFlujosCajas;
	protected JButton jButtonCopiarEstadosFlujosCajas;
	protected JButton jButtonVerFormEstadosFlujosCajas;
	protected JButton jButtonNuevoRelacionesEstadosFlujosCajas;
	protected JButton jButtonModificarEstadosFlujosCajas;
	
    protected JButton jButtonGuardarCambiosTablaEstadosFlujosCajas;
	protected JButton jButtonCerrarEstadosFlujosCajas;
	
	
	protected JButton jButtonRecargarInformacionEstadosFlujosCajas;
	protected JButton jButtonProcesarInformacionEstadosFlujosCajas;
	
	
	protected JButton jButtonAnterioresEstadosFlujosCajas;
	protected JButton jButtonSiguientesEstadosFlujosCajas;
	protected JButton jButtonNuevoGuardarCambiosEstadosFlujosCajas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadosFlujosCajas;
	//protected JButton jButtonCerrarReporteDinamicoEstadosFlujosCajas;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadosFlujosCajas;
	//protected JButton jButtonGenerarImportacionEstadosFlujosCajas;
	//protected JButton jButtonCerrarImportacionEstadosFlujosCajas;
	//protected JFileChooser jFileChooserImportacionEstadosFlujosCajas;
	//protected File fileImportacionEstadosFlujosCajas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadosFlujosCajas;
	protected JButton jButtonDuplicarToolBarEstadosFlujosCajas;
	protected JButton jButtonNuevoRelacionesToolBarEstadosFlujosCajas;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadosFlujosCajas;
	protected JButton jButtonCopiarToolBarEstadosFlujosCajas;
	protected JButton jButtonVerFormToolBarEstadosFlujosCajas;
	public JButton jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadosFlujosCajas;
	protected JButton jButtonCerrarToolBarEstadosFlujosCajas;
	
	protected JButton jButtonRecargarInformacionToolBarEstadosFlujosCajas;
	protected JButton jButtonProcesarInformacionToolBarEstadosFlujosCajas;
	protected JButton jButtonAnterioresToolBarEstadosFlujosCajas;
	protected JButton jButtonSiguientesToolBarEstadosFlujosCajas;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas;
	protected JButton jButtonAbrirOrderByToolBarEstadosFlujosCajas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadosFlujosCajas;
	protected JMenuItem jMenuItemDuplicarEstadosFlujosCajas;
	protected JMenuItem jMenuItemNuevoRelacionesEstadosFlujosCajas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadosFlujosCajas;
	protected JMenuItem jMenuItemCopiarEstadosFlujosCajas;
	protected JMenuItem jMenuItemVerFormEstadosFlujosCajas;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadosFlujosCajas;
	protected JMenuItem jMenuItemCerrarEstadosFlujosCajas;
	protected JMenuItem jMenuItemDetalleCerrarEstadosFlujosCajas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadosFlujosCajas;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadosFlujosCajas;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadosFlujosCajas;
	protected JMenuItem jMenuItemProcesarInformacionEstadosFlujosCajas;
	protected JMenuItem jMenuItemAnterioresEstadosFlujosCajas;
	protected JMenuItem jMenuItemSiguientesEstadosFlujosCajas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadosFlujosCajas;
	protected JMenuItem jMenuItemAbrirOrderByEstadosFlujosCajas;
	protected JMenuItem jMenuItemMostrarOcultarEstadosFlujosCajas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadosFlujosCajas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadosFlujosCajas;
	protected JCheckBox jCheckBoxSeleccionadosEstadosFlujosCajas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadosFlujosCajas;
	protected JCheckBox jCheckBoxConGraficoReporteEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadosFlujosCajas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadosFlujosCajas;
	protected JTextField jTextFieldValorCampoGeneralEstadosFlujosCajas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadosFlujosCajas;
	//public JList<Reporte> jListColumnasSelectReporteEstadosFlujosCajas;
	//public JScrollPane jScrollColumnasSelectReporteEstadosFlujosCajas;
	
	//public JLabel jLabelRelacionesSelectReporteEstadosFlujosCajas;
	//public JList<Reporte> jListRelacionesSelectReporteEstadosFlujosCajas;
	//public JScrollPane jScrollRelacionesSelectReporteEstadosFlujosCajas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadosFlujosCajas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadosFlujosCajas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas;
	
		
	//public JLabel jLabelArchivoImportacionEstadosFlujosCajas;	
	//public JLabel jLabelPathArchivoImportacionEstadosFlujosCajas;
	//protected JTextField jTextFieldPathArchivoImportacionEstadosFlujosCajas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadosFlujosCajas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas;
	
	//public JLabel jLabelColumnaCategoriaValorEstadosFlujosCajas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadosFlujosCajas;
	
	//public JLabel jLabelColumnasValoresGraficoEstadosFlujosCajas;
	//public JList<Reporte> jListColumnasValoresGraficoEstadosFlujosCajas;
	//public JScrollPane jScrollColumnasValoresGraficoEstadosFlujosCajas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadosFlujosCajas;
	public JPanel jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JButton jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	
	public JPanel jPanelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JLabel jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JButton jButtonid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JLabel jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JButton jButtonid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JLabel jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas;
	public JButton jButtonid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajasBusqueda= new JButtonMe();

	
	
	
	
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
	public EstadosFlujosCajasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadosFlujosCajas)	{
		this.jButtonRecargarInformacionEstadosFlujosCajas = jButtonRecargarInformacionEstadosFlujosCajas;
	}
	
	public JButton getjButtonProcesarInformacionEstadosFlujosCajas() {
		return this.jButtonProcesarInformacionEstadosFlujosCajas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadosFlujosCajas)	{
		this.jButtonProcesarInformacionEstadosFlujosCajas = jButtonProcesarInformacionEstadosFlujosCajas;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadosFlujosCajas() {
		return this.jButtonRecargarInformacionEstadosFlujosCajas;
	}
	
	
	public List<EstadosFlujosCajas> getestadosflujoscajass() {
		return this.estadosflujoscajass;
	}

	public void setestadosflujoscajass(List<EstadosFlujosCajas> estadosflujoscajass) {
		this.estadosflujoscajass = estadosflujoscajass;
	}
	
	public List<EstadosFlujosCajas> getestadosflujoscajassAux() {
		return this.estadosflujoscajassAux;
	}

	public void setestadosflujoscajassAux(List<EstadosFlujosCajas> estadosflujoscajassAux) {
		this.estadosflujoscajassAux = estadosflujoscajassAux;
	}
	
	public List<EstadosFlujosCajas> getestadosflujoscajassEliminados() {
		return this.estadosflujoscajassEliminados;
	}

	public void setEstadosFlujosCajassEliminados(List<EstadosFlujosCajas> estadosflujoscajassEliminados) {
		this.estadosflujoscajassEliminados = estadosflujoscajassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadosFlujosCajas() {
		return jComboBoxTiposSeleccionarEstadosFlujosCajas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadosFlujosCajas(
			JComboBox jComboBoxTiposSeleccionarEstadosFlujosCajas) {
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas = jComboBoxTiposSeleccionarEstadosFlujosCajas;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadosFlujosCajas() {
		return jTextFieldValorCampoGeneralEstadosFlujosCajas;
	}

	public void setjTextFieldValorCampoGeneralEstadosFlujosCajas(
			JTextField jTextFieldValorCampoGeneralEstadosFlujosCajas) {
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas = jTextFieldValorCampoGeneralEstadosFlujosCajas;
	}

	public void setBorderResaltarValorCampoGeneralEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadosFlujosCajas() {
		return this.jCheckBoxSeleccionarTodosEstadosFlujosCajas;
	}

	public void setjCheckBoxSeleccionarTodosEstadosFlujosCajas(
			JCheckBox jCheckBoxSeleccionarTodosEstadosFlujosCajas) {
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas = jCheckBoxSeleccionarTodosEstadosFlujosCajas;
	}

	public void setBorderResaltarSeleccionarTodosEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadosFlujosCajas() {
		return this.jCheckBoxSeleccionadosEstadosFlujosCajas;
	}

	public void setjCheckBoxSeleccionadosEstadosFlujosCajas(
			JCheckBox jCheckBoxSeleccionadosEstadosFlujosCajas) {
		this.jCheckBoxSeleccionadosEstadosFlujosCajas = jCheckBoxSeleccionadosEstadosFlujosCajas;
	}
	
	public void setBorderResaltarSeleccionadosEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadosFlujosCajas() {
		return this.jComboBoxTiposArchivosReportesEstadosFlujosCajas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadosFlujosCajas(
			JComboBox jComboBoxTiposArchivosReportesEstadosFlujosCajas) {
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas = jComboBoxTiposArchivosReportesEstadosFlujosCajas;
	}

	public void setBorderResaltarTiposArchivosReportesEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadosFlujosCajas() {
		return this.jComboBoxTiposReportesEstadosFlujosCajas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadosFlujosCajas(
			JComboBox jComboBoxTiposReportesEstadosFlujosCajas) {
		this.jComboBoxTiposReportesEstadosFlujosCajas = jComboBoxTiposReportesEstadosFlujosCajas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadosFlujosCajas() {
	//	return jComboBoxTiposReportesDinamicoEstadosFlujosCajas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadosFlujosCajas(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadosFlujosCajas) {
	//	this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas = jComboBoxTiposReportesDinamicoEstadosFlujosCajas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas = jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas;
	//}
	
	public void setBorderResaltarTiposReportesEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadosFlujosCajas() {
		return this.jComboBoxTiposGraficosReportesEstadosFlujosCajas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadosFlujosCajas(
			JComboBox jComboBoxTiposGraficosReportesEstadosFlujosCajas) {
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas = jComboBoxTiposGraficosReportesEstadosFlujosCajas;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadosFlujosCajas() {
		return this.jComboBoxTiposPaginacionEstadosFlujosCajas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadosFlujosCajas(
			JComboBox jComboBoxTiposPaginacionEstadosFlujosCajas) {
		this.jComboBoxTiposPaginacionEstadosFlujosCajas = jComboBoxTiposPaginacionEstadosFlujosCajas;
	}
	
	public void setBorderResaltarTiposPaginacionEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadosFlujosCajas() {
		return this.jComboBoxTiposRelacionesEstadosFlujosCajas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadosFlujosCajas() {
		return this.jComboBoxTiposAccionesEstadosFlujosCajas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadosFlujosCajas(
			JComboBox jComboBoxTiposRelacionesEstadosFlujosCajas) {
		this.jComboBoxTiposRelacionesEstadosFlujosCajas = jComboBoxTiposRelacionesEstadosFlujosCajas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadosFlujosCajas(
			JComboBox jComboBoxTiposAccionesEstadosFlujosCajas) {
		this.jComboBoxTiposAccionesEstadosFlujosCajas = jComboBoxTiposAccionesEstadosFlujosCajas;
	}
	
	public void setBorderResaltarTiposRelacionesEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadosFlujosCajas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadosFlujosCajas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadosFlujosCajas() {
	//	return jCheckBoxConGraficoDinamicoEstadosFlujosCajas;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadosFlujosCajas(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadosFlujosCajas) {
	//	this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas = jCheckBoxConGraficoDinamicoEstadosFlujosCajas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadosFlujosCajas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadosFlujosCajas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas .setBorder(borderResaltar);		
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
		this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
		
		this.estadosflujoscajasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosflujoscajasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosflujoscajasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadosFlujosCajasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estados Flujos Cajas MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadosFlujosCajasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadosFlujosCajas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"nuevo","nuevo","Nuevo"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"duplicar","duplicar","Duplicar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"copiar","copiar","Copiar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"ver_form","ver_form","Ver"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"recargar","recargar","Buscar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,
							"cerrar","cerrar","Salir"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadosFlujosCajas;
			
				this.jButtonProcesarInformacionToolBarEstadosFlujosCajas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadosFlujosCajas;
				
		//protected JButton jButtonModificarToolBarEstadosFlujosCajas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadosFlujosCajas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadosFlujosCajas=new JMenuMe("General");
		this.jmenuArchivoEstadosFlujosCajas=new JMenuMe("Archivo");
		this.jmenuAccionesEstadosFlujosCajas=new JMenuMe("Acciones");
		this.jmenuDatosEstadosFlujosCajas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadosFlujosCajas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadosFlujosCajas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadosFlujosCajas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadosFlujosCajas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadosFlujosCajas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadosFlujosCajas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadosFlujosCajas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadosFlujosCajas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadosFlujosCajas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadosFlujosCajas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadosFlujosCajas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadosFlujosCajas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadosFlujosCajas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadosFlujosCajas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadosFlujosCajas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadosFlujosCajas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadosFlujosCajas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadosFlujosCajas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadosFlujosCajas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadosFlujosCajas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadosFlujosCajas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadosFlujosCajas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadosFlujosCajas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadosFlujosCajas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadosFlujosCajas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadosFlujosCajas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadosFlujosCajas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadosFlujosCajas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadosFlujosCajas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadosFlujosCajas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadosFlujosCajas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadosFlujosCajas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadosFlujosCajas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadosFlujosCajas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadosFlujosCajas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadosFlujosCajas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadosFlujosCajas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadosFlujosCajas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadosFlujosCajas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadosFlujosCajas.add(this.jMenuItemCerrarEstadosFlujosCajas);
			
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemNuevoEstadosFlujosCajas);
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas);
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemNuevoRelacionesEstadosFlujosCajas);
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas);		
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemDuplicarEstadosFlujosCajas);		
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemCopiarEstadosFlujosCajas);		
			this.jmenuAccionesEstadosFlujosCajas.add(this.jMenuItemVerFormEstadosFlujosCajas);		
			
			this.jmenuDatosEstadosFlujosCajas.add(this.jMenuItemRecargarInformacionEstadosFlujosCajas);				
			this.jmenuDatosEstadosFlujosCajas.add(this.jMenuItemAnterioresEstadosFlujosCajas);				
			this.jmenuDatosEstadosFlujosCajas.add(this.jMenuItemSiguientesEstadosFlujosCajas);				
			this.jmenuDatosEstadosFlujosCajas.add(this.jMenuItemAbrirOrderByEstadosFlujosCajas);				
			this.jmenuDatosEstadosFlujosCajas.add(this.jMenuItemMostrarOcultarEstadosFlujosCajas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadosFlujosCajas.add(this.jMenuItemGuardarCambiosEstadosFlujosCajas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadosFlujosCajas.add(this.jmenuArchivoEstadosFlujosCajas);		
			this.jmenuBarEstadosFlujosCajas.add(this.jmenuAccionesEstadosFlujosCajas);		
			this.jmenuBarEstadosFlujosCajas.add(this.jmenuDatosEstadosFlujosCajas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadosFlujosCajas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadosFlujosCajas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Centro Activad ");
		this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JButtonMe();
		this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas.setText("Buscar");
		this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Centro Activad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas,"buscar_button","Buscar Por Ejercicio Por Periodo Por Centro Activad ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas = new JLabelMe();
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas = new JLabelMe();
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setText("Periodo :");
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setToolTipText("Periodo");
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas = new JLabelMe();
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setText("Centro Activad :");
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setToolTipText("Centro Activad");
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadosFlujosCajas=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadosFlujosCajas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadosFlujosCajas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadosFlujosCajas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadosFlujosCajas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadosFlujosCajas = new EstadosFlujosCajasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estados Flujos Cajas DATOS");
			this.jInternalFrameDetalleFormEstadosFlujosCajas = new EstadosFlujosCajasDetalleFormJInternalFrame(jDesktopPane,this.estadosflujoscajasSessionBean.getConGuardarRelaciones(),this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadosFlujosCajas = null;//new EstadosFlujosCajasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadosFlujosCajas= new GridBagLayout();
		
		
		this.jTableDatosEstadosFlujosCajas = new JTableMe();      
		
		String sToolTipEstadosFlujosCajas="";
		sToolTipEstadosFlujosCajas=EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadosFlujosCajas+="(Contabilidad.EstadosFlujosCajas)";
		}
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadosFlujosCajas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadosFlujosCajas.setToolTipText(sToolTipEstadosFlujosCajas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadosFlujosCajas);
		this.jTableDatosEstadosFlujosCajas.setAutoCreateRowSorter(true);
		this.jTableDatosEstadosFlujosCajas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadosFlujosCajas.setRowSelectionAllowed(true);
		this.jTableDatosEstadosFlujosCajas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadosFlujosCajas = new JButtonMe();
		this.jButtonDuplicarEstadosFlujosCajas = new JButtonMe();
		this.jButtonCopiarEstadosFlujosCajas = new JButtonMe();
		this.jButtonVerFormEstadosFlujosCajas = new JButtonMe();
		this.jButtonNuevoRelacionesEstadosFlujosCajas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas = new JButtonMe();
		this.jButtonCerrarEstadosFlujosCajas = new JButtonMe();
		
		this.jScrollPanelDatosEstadosFlujosCajas = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadosFlujosCajas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estados Flujos Cajas";
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadosFlujosCajas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadosFlujosCajas.setToolTipText("Acciones");
        this.jPanelAccionesEstadosFlujosCajas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadosFlujosCajas=new ReporteDinamicoJInternalFrame(EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadosFlujosCajas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadosFlujosCajas=new ImportacionJInternalFrame(EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadosFlujosCajas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadosFlujosCajas = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadosFlujosCajas.setText("Orden");
		this.jButtonAbrirOrderByEstadosFlujosCajas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadosFlujosCajas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadosFlujosCajas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosFlujosCajas,false,this);
			
			//this.cargarOrderByEstadosFlujosCajas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadosFlujosCajas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosFlujosCajas,true,this);
			
			//this.cargarOrderByEstadosFlujosCajas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadosFlujosCajas.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEstadosFlujosCajas.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEstadosFlujosCajas.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEstadosFlujosCajas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadosFlujosCajas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadosFlujosCajas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadosFlujosCajas.setText("Nuevo");
		this.jButtonDuplicarEstadosFlujosCajas.setText("Duplicar");
		this.jButtonCopiarEstadosFlujosCajas.setText("Copiar");
		this.jButtonVerFormEstadosFlujosCajas.setText("Ver");
		this.jButtonNuevoRelacionesEstadosFlujosCajas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setText("Guardar");
		this.jButtonCerrarEstadosFlujosCajas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadosFlujosCajas,"nuevo_button","Nuevo",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadosFlujosCajas,"duplicar_button","Duplicar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadosFlujosCajas,"copiar_button","Copiar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadosFlujosCajas,"ver_form","Ver",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadosFlujosCajas,"nuevorelaciones_button","Nuevo Rel",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadosFlujosCajas,"guardarcambiostabla_button","Guardar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadosFlujosCajas,"cerrar_button","Salir",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadosFlujosCajas.setToolTipText("Nuevo"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadosFlujosCajas.setToolTipText("Duplicar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadosFlujosCajas.setToolTipText("Copiar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadosFlujosCajas.setToolTipText("Ver"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadosFlujosCajas.setToolTipText("Nuevo Rel"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setToolTipText("Guardar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadosFlujosCajas.setToolTipText("Salir"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadosFlujosCajas";
		inputMap = this.jButtonNuevoEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadosFlujosCajas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadosFlujosCajas"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadosFlujosCajas";
		inputMap = this.jButtonDuplicarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadosFlujosCajas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadosFlujosCajas"));
		
		//COPIAR
		sMapKey = "CopiarEstadosFlujosCajas";
		inputMap = this.jButtonCopiarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadosFlujosCajas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadosFlujosCajas"));
		
		//VEr FORM
		sMapKey = "VerFormEstadosFlujosCajas";
		inputMap = this.jButtonVerFormEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadosFlujosCajas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadosFlujosCajas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadosFlujosCajas";
		inputMap = this.jButtonNuevoRelacionesEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadosFlujosCajas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadosFlujosCajas";
		inputMap = this.jButtonModificarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadosFlujosCajas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadosFlujosCajas";
		inputMap = this.jButtonCerrarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadosFlujosCajas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadosFlujosCajas";
		inputMap = this.jButtonGuardarCambiosTablaEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadosFlujosCajas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadosFlujosCajas.setName("jPanelParametrosReportesEstadosFlujosCajas"); 
		
		this.jPanelParametrosReportesAccionesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadosFlujosCajas.setName("jPanelParametrosReportesAccionesEstadosFlujosCajas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadosFlujosCajas = new JButtonMe();
		this.jButtonRecargarInformacionEstadosFlujosCajas.setText("Buscar");
		this.jButtonRecargarInformacionEstadosFlujosCajas.setToolTipText("Buscar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadosFlujosCajas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEstadosFlujosCajas.setVisible(false);
		
		
		this.jButtonProcesarInformacionEstadosFlujosCajas = new JButtonMe();
		this.jButtonProcesarInformacionEstadosFlujosCajas.setText("Procesar");
		this.jButtonProcesarInformacionEstadosFlujosCajas.setToolTipText("Procesar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadosFlujosCajas.setVisible(false);
			
		this.jButtonProcesarInformacionEstadosFlujosCajas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadosFlujosCajas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadosFlujosCajas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setText("TIPO");       
		this.jComboBoxTiposReportesEstadosFlujosCajas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadosFlujosCajas.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadosFlujosCajas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadosFlujosCajas.setText("Accion");
		this.jComboBoxTiposRelacionesEstadosFlujosCajas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadosFlujosCajas.setText("Accion");
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadosFlujosCajas = new JLabelMe();
		
		this.jLabelAccionesEstadosFlujosCajas.setText("Acciones");		
		this.jLabelAccionesEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadosFlujosCajas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadosFlujosCajas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadosFlujosCajas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadosFlujosCajas = new JButtonMe();
		//this.jButtonAnterioresEstadosFlujosCajas.setText("<<");
        this.jButtonAnterioresEstadosFlujosCajas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadosFlujosCajas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadosFlujosCajas = new JButtonMe();
		//this.jButtonSiguientesEstadosFlujosCajas.setText(">>");
        this.jButtonSiguientesEstadosFlujosCajas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadosFlujosCajas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadosFlujosCajas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadosFlujosCajas,"nuevoguardarcambios_button","Nue",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadosFlujosCajas";
		inputMap = this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadosFlujosCajas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadosFlujosCajas";
		inputMap = this.jButtonRecargarInformacionEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadosFlujosCajas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadosFlujosCajas";
		inputMap = this.jButtonSiguientesEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadosFlujosCajas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadosFlujosCajas";
		inputMap = this.jButtonAnterioresEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadosFlujosCajas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadosFlujosCajas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadosFlujosCajas.setMinimumSize(new Dimension(this.getWidth(),EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadosFlujosCajas.setMaximumSize(new Dimension(this.getWidth(),EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadosFlujosCajas.setPreferredSize(new Dimension(this.getWidth(),EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadosFlujosCajasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadosFlujosCajas = new GridBagLayout();

			this.jPanelPaginacionEstadosFlujosCajas.setLayout(gridaBagLayoutPaginacionEstadosFlujosCajas);						
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonAnterioresEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					
						
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
			
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonNuevoGuardarCambiosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
						
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonSiguientesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonNuevoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
						
			
			
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
				this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
				this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonGuardarCambiosTablaEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			}
			
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonDuplicarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonCopiarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonVerFormEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 1;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadosFlujosCajas.add(this.jButtonCerrarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		
		this.jButtonRecargarInformacionEstadosFlujosCajas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadosFlujosCajas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadosFlujosCajas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadosFlujosCajas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadosFlujosCajas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadosFlujosCajas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadosFlujosCajas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadosFlujosCajas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadosFlujosCajas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadosFlujosCajas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadosFlujosCajas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadosFlujosCajas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadosFlujosCajas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadosFlujosCajas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadosFlujosCajas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadosFlujosCajas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadosFlujosCajas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadosFlujosCajas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadosFlujosCajas.setLayout(gridaBagParametrosReportesEstadosFlujosCajas);
			this.jPanelParametrosReportesAccionesEstadosFlujosCajas.setLayout(gridaBagParametrosReportesAccionesEstadosFlujosCajas);
			
			
			this.jPanelParametrosAuxiliar1EstadosFlujosCajas.setLayout(gridaBagParametrosAuxiliar1EstadosFlujosCajas);
			this.jPanelParametrosAuxiliar2EstadosFlujosCajas.setLayout(gridaBagParametrosAuxiliar2EstadosFlujosCajas);
			this.jPanelParametrosAuxiliar3EstadosFlujosCajas.setLayout(gridaBagParametrosAuxiliar3EstadosFlujosCajas);
			this.jPanelParametrosAuxiliar4EstadosFlujosCajas.setLayout(gridaBagParametrosAuxiliar4EstadosFlujosCajas);
			//this.jPanelParametrosAuxiliar5EstadosFlujosCajas.setLayout(gridaBagParametrosAuxiliar2EstadosFlujosCajas);			
			
			
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jButtonRecargarInformacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosFlujosCajas.add(this.jComboBoxTiposPaginacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosFlujosCajas.add(this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadosFlujosCajas.add(this.jComboBoxTiposArchivosReportesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jPanelParametrosAuxiliar1EstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadosFlujosCajas.add(this.jComboBoxTiposReportesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);																		
			
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EstadosFlujosCajas.add(this.jComboBoxTiposGraficosReportesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jPanelParametrosAuxiliar4EstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jComboBoxTiposReportesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jCheckBoxGenerarReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jPanelParametrosAuxiliar2EstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jLabelAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
				this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jButtonAbrirOrderByEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jComboBoxTiposSeleccionarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
			
			
			/*
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jCheckBoxSeleccionarTodosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jCheckBoxConGraficoReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosFlujosCajas.add(this.jCheckBoxSeleccionarTodosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);															
				
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosFlujosCajas.add(this.jCheckBoxSeleccionadosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);															
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadosFlujosCajas.add(this.jCheckBoxConGraficoReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jPanelParametrosAuxiliar3EstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadosFlujosCajas.add(this.jComboBoxTiposAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadosFlujosCajas = new GridBagLayout();

			this.jScrollPanelDatosEstadosFlujosCajas.setLayout(gridaBagLayoutDatosEstadosFlujosCajas);
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
			
			this.jScrollPanelDatosEstadosFlujosCajas.add(this.jTableDatosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadosFlujosCajas.setViewportView(this.jTableDatosEstadosFlujosCajas);
		this.jTableDatosEstadosFlujosCajas.setFillsViewportHeight(true);
		this.jTableDatosEstadosFlujosCajas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadosFlujosCajas= new GridBagLayout();
		this.jPanelAccionesEstadosFlujosCajas.setLayout(gridaBagLayoutAccionesEstadosFlujosCajas);
		
		
		/*	
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
			
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonNuevoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas= new GridBagLayout();
		gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.setLayout(gridaBagLayoutBusquedaEstadosFlujosCajasEstadosFlujosCajas);

		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jLabelid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);

		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		gridBagConstraintsEstadosFlujosCajas.gridx = 1;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);


		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 1;
		gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jLabelid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);

		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 1;
		gridBagConstraintsEstadosFlujosCajas.gridx = 1;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);


		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 2;
		gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jLabelid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);

		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 2;
		gridBagConstraintsEstadosFlujosCajas.gridx = 1;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);

		gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadosFlujosCajas.gridy = 3;
		gridBagConstraintsEstadosFlujosCajas.gridx =1;
		jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas.add(jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);

		jTabbedPaneBusquedasEstadosFlujosCajas.addTab("1.-Por Ejercicio Por Periodo Por Centro Activad ", jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);
		jTabbedPaneBusquedasEstadosFlujosCajas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadosFlujosCajas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();						
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;		
			//this.gridBagConstraintsEstadosFlujosCajas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadosFlujosCajas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;		
		//this.gridBagConstraintsEstadosFlujosCajas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadosFlujosCajas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;		
			this.gridBagConstraintsEstadosFlujosCajas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadosFlujosCajas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);								
		
		
		/*
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		*/		
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadosFlujosCajas.gridx =0;
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadosFlujosCajas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
				
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadosFlujosCajas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadosFlujosCajas = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadosFlujosCajas.setLayout(gridaBagLayoutBusquedasParametrosEstadosFlujosCajas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadosFlujosCajas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadosFlujosCajas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadosFlujosCajas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadosFlujosCajas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadosFlujosCajas.setName("jPanelReporteDinamicoEstadosFlujosCajas"); 
		
		this.jPanelReporteDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadosFlujosCajas.setLayout(gridaBagLayoutReporteDinamicoEstadosFlujosCajas);
		
		
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadosFlujosCajas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadosFlujosCajas = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadosFlujosCajas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelColumnasSelectReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadosFlujosCajas = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadosFlujosCajas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadosFlujosCajas=new JScrollPane(this.jListColumnasSelectReporteEstadosFlujosCajas);
			
			this.jScrollColumnasSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jListColumnasSelectReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jScrollColumnasSelectReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadosFlujosCajas = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadosFlujosCajas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadosFlujosCajas = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadosFlujosCajas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadosFlujosCajas=new JScrollPane(this.jListRelacionesSelectReporteEstadosFlujosCajas);
			
			this.jScrollRelacionesSelectReporteEstadosFlujosCajas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadosFlujosCajas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadosFlujosCajas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadosFlujosCajas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEstadosFlujosCajas = new JLabelMe();

		this.jLabelConGraficoDinamicoEstadosFlujosCajas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelConGraficoDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jCheckBoxConGraficoDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelColumnaCategoriaGraficoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEstadosFlujosCajas = new JLabelMe();

		this.jLabelColumnaCategoriaValorEstadosFlujosCajas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelColumnaCategoriaValorEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jComboBoxColumnaCategoriaValorEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEstadosFlujosCajas = new JLabelMe();

		this.jLabelColumnasValoresGraficoEstadosFlujosCajas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelColumnasValoresGraficoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEstadosFlujosCajas = new JList<Reporte>();
		this.jListColumnasValoresGraficoEstadosFlujosCajas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEstadosFlujosCajas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEstadosFlujosCajas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadosFlujosCajas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadosFlujosCajas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEstadosFlujosCajas=new JScrollPane(this.jListColumnasValoresGraficoEstadosFlujosCajas);
			
			this.jScrollColumnasValoresGraficoEstadosFlujosCajas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadosFlujosCajas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadosFlujosCajas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jListColumnasSelectReporteEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jScrollColumnasValoresGraficoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelTiposGraficosReportesDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadosFlujosCajas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jComboBoxTiposGraficosReportesDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelGenerarExcelReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas.setToolTipText("Generar EXCEL"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jComboBoxTiposReportesDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jLabelTiposArchivoReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jComboBoxTiposArchivosReportesDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadosFlujosCajas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadosFlujosCajas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadosFlujosCajas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadosFlujosCajas.setToolTipText("Generar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jButtonGenerarReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadosFlujosCajas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadosFlujosCajas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadosFlujosCajas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadosFlujosCajas.setToolTipText("Cancelar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadosFlujosCajas.add(this.jButtonCerrarReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadosFlujosCajas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas= new JScrollPane(jPanelReporteDinamicoEstadosFlujosCajas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadosFlujosCajas);
		this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getContentPane().add(this.jScrollPanelReporteDinamicoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadosFlujosCajas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadosFlujosCajas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadosFlujosCajas.setName("jPanelImportacionEstadosFlujosCajas"); 
		
		this.jPanelImportacionEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadosFlujosCajas.setLayout(gridaBagLayoutImportacionEstadosFlujosCajas);
		
		
		this.jInternalFrameImportacionEstadosFlujosCajas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadosFlujosCajas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadosFlujosCajas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadosFlujosCajas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadosFlujosCajas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadosFlujosCajas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadosFlujosCajas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadosFlujosCajas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadosFlujosCajas.setResizable(true);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setClosable(true);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadosFlujosCajas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadosFlujosCajas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadosFlujosCajas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadosFlujosCajas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadosFlujosCajas.setResizable(true);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setClosable(true);
	    this.jInternalFrameImportacionEstadosFlujosCajas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadosFlujosCajas = new JLabelMe();

		this.jLabelArchivoImportacionEstadosFlujosCajas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadosFlujosCajas.add(this.jLabelArchivoImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadosFlujosCajas = new JFileChooser();		
		this.jFileChooserImportacionEstadosFlujosCajas.setToolTipText("ESCOGER ARCHIVO"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadosFlujosCajas = new JButtonMe();
		this.jButtonAbrirImportacionEstadosFlujosCajas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadosFlujosCajas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadosFlujosCajas.setToolTipText("Generar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosFlujosCajas.add(this.jButtonAbrirImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadosFlujosCajas = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadosFlujosCajas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadosFlujosCajas.add(this.jLabelPathArchivoImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadosFlujosCajas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadosFlujosCajas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadosFlujosCajas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadosFlujosCajas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosFlujosCajas.add(this.jTextFieldPathArchivoImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadosFlujosCajas = new JButtonMe();
		this.jButtonGenerarImportacionEstadosFlujosCajas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadosFlujosCajas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadosFlujosCajas.setToolTipText("Generar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosFlujosCajas.add(this.jButtonGenerarImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadosFlujosCajas = new JButtonMe();
		this.jButtonCerrarImportacionEstadosFlujosCajas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadosFlujosCajas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadosFlujosCajas.setToolTipText("Cancelar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadosFlujosCajas.add(this.jButtonCerrarImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadosFlujosCajas = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadosFlujosCajas= new JScrollPane(jPanelImportacionEstadosFlujosCajas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadosFlujosCajas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadosFlujosCajas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadosFlujosCajas);
		this.jInternalFrameImportacionEstadosFlujosCajas.getContentPane().add(this.jScrollPanelImportacionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadosFlujosCajas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadosFlujosCajas = new JButtonMe();
			this.jButtonAbrirOrderByEstadosFlujosCajas.setText("Orden");
			this.jButtonAbrirOrderByEstadosFlujosCajas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadosFlujosCajas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadosFlujosCajas";
			inputMap = this.jButtonAbrirOrderByEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadosFlujosCajas"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadosFlujosCajas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadosFlujosCajas.setName("jPanelOrderByEstadosFlujosCajas"); 
			
			this.jPanelOrderByEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadosFlujosCajas.setLayout(gridaBagLayoutOrderByEstadosFlujosCajas);
			
			
			this.jTableDatosEstadosFlujosCajasOrderBy = new JTableMe();        
			this.jTableDatosEstadosFlujosCajasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadosFlujosCajasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadosFlujosCajasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadosFlujosCajasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadosFlujosCajasOrderBy.setViewportView(this.jTableDatosEstadosFlujosCajasOrderBy);
			this.jTableDatosEstadosFlujosCajasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadosFlujosCajasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadosFlujosCajas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadosFlujosCajas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadosFlujosCajas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadosFlujosCajas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadosFlujosCajas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadosFlujosCajas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadosFlujosCajas.setTitle("Orden");
			this.jInternalFrameOrderByEstadosFlujosCajas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadosFlujosCajas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadosFlujosCajas.setResizable(true);
			this.jInternalFrameOrderByEstadosFlujosCajas.setClosable(true);
			this.jInternalFrameOrderByEstadosFlujosCajas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadosFlujosCajas.ipady =150;
				
			this.jPanelOrderByEstadosFlujosCajas.add(jScrollPanelDatosEstadosFlujosCajasOrderBy, this.gridBagConstraintsEstadosFlujosCajas);//this.jTableDatosEstadosFlujosCajasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadosFlujosCajas = new JButtonMe();
			this.jButtonCerrarOrderByEstadosFlujosCajas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadosFlujosCajas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadosFlujosCajas.setToolTipText("Cancelar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadosFlujosCajas.add(this.jButtonCerrarOrderByEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadosFlujosCajas = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadosFlujosCajas= new JScrollPane(jPanelOrderByEstadosFlujosCajas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadosFlujosCajas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadosFlujosCajas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadosFlujosCajas);
			
			this.jInternalFrameOrderByEstadosFlujosCajas.getContentPane().add(this.jScrollPanelOrderByEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
		
		} else {
			this.jButtonAbrirOrderByEstadosFlujosCajas = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.estadosflujoscajasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEstadosFlujosCajas.getRowHeight();//EstadosFlujosCajasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.isSelected()) {
					iHeightTable=EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadosFlujosCajas.isSelected()) {
					iHeightTable=EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadosFlujosCajasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadosFlujosCajas!=null && this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy()!=null) {
			//if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadosFlujosCajas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadosFlujosCajas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadosFlujosCajas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=estadosflujoscajasLogic.getEstadosFlujosCajass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosflujoscajass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadosFlujosCajas> TraerEstadosFlujosCajasBeans(List<EstadosFlujosCajas> estadosflujoscajass,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajass) {
					
				if(!(EstadosFlujosCajasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadosFlujosCajasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadosflujoscajas.setsDetalleGeneralEntityReporte(EstadosFlujosCajasConstantesFunciones.getEstadosFlujosCajasDescripcion(estadosflujoscajas));
										
						
					
						
					
				} else  {
							
					//estadosflujoscajas.setsDetalleGeneralEntityReporte(estadosflujoscajas.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadosflujoscajasbeans.add(estadosflujoscajasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadosflujoscajass;
    }
	//PARA REPORTES FIN
}
