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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ExistenciasCostosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ExistenciasCostosJInternalFrame extends ExistenciasCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarExistenciasCostos;
	
	protected JMenuBar jmenuBarExistenciasCostos;
	
	protected JMenu jmenuExistenciasCostos;
	protected JMenu jmenuDatosExistenciasCostos;
	protected JMenu jmenuArchivoExistenciasCostos;
	protected JMenu jmenuAccionesExistenciasCostos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutExistenciasCostos;	
	protected GridBagConstraints gridBagConstraintsExistenciasCostos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ExistenciasCostosDetalleFormJInternalFrame jInternalFrameDetalleFormExistenciasCostos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoExistenciasCostos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionExistenciasCostos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ExistenciasCostosSessionBean existenciascostosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ExistenciasCostos> existenciascostoss;		
	public List<ExistenciasCostos> existenciascostossEliminados;	
	public List<ExistenciasCostos> existenciascostossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByExistenciasCostos;		
	protected JButton jButtonAbrirOrderByExistenciasCostos;
	
	
	//protected JPanel jPanelOrderByExistenciasCostos;
	//public JScrollPane jScrollPanelOrderByExistenciasCostos;	
	//protected JButton jButtonCerrarOrderByExistenciasCostos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ExistenciasCostosLogic existenciascostosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosExistenciasCostos;
	public JScrollPane jScrollPanelDatosEdicionExistenciasCostos;
	public JScrollPane jScrollPanelDatosGeneralExistenciasCostos;
    
	
	
	//public JScrollPane jScrollPanelDatosExistenciasCostosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoExistenciasCostos;
	//public JScrollPane jScrollPanelImportacionExistenciasCostos;
	
	
	
	protected JPanel jPanelAccionesExistenciasCostos;
	
    protected JPanel jPanelPaginacionExistenciasCostos;
    protected JPanel jPanelParametrosReportesExistenciasCostos;
	protected JPanel jPanelParametrosReportesAccionesExistenciasCostos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ExistenciasCostos;
	protected JPanel jPanelParametrosAuxiliar2ExistenciasCostos;
	protected JPanel jPanelParametrosAuxiliar3ExistenciasCostos;
	protected JPanel jPanelParametrosAuxiliar4ExistenciasCostos;
	//protected JPanel jPanelParametrosAuxiliar5ExistenciasCostos;
	
	
	
	//protected JPanel jPanelReporteDinamicoExistenciasCostos;
	//protected JPanel jPanelImportacionExistenciasCostos;
	
	
	public JTable jTableDatosExistenciasCostos;
	
	
	
	//public JTable jTableDatosExistenciasCostosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoExistenciasCostos;
	protected JButton jButtonDuplicarExistenciasCostos;
	protected JButton jButtonCopiarExistenciasCostos;
	protected JButton jButtonVerFormExistenciasCostos;
	protected JButton jButtonNuevoRelacionesExistenciasCostos;
	protected JButton jButtonModificarExistenciasCostos;
	
    protected JButton jButtonGuardarCambiosTablaExistenciasCostos;
	protected JButton jButtonCerrarExistenciasCostos;
	
	
	protected JButton jButtonRecargarInformacionExistenciasCostos;
	protected JButton jButtonProcesarInformacionExistenciasCostos;
	
	
	protected JButton jButtonAnterioresExistenciasCostos;
	protected JButton jButtonSiguientesExistenciasCostos;
	protected JButton jButtonNuevoGuardarCambiosExistenciasCostos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoExistenciasCostos;
	//protected JButton jButtonCerrarReporteDinamicoExistenciasCostos;
	//protected JButton jButtonGenerarExcelReporteDinamicoExistenciasCostos;	
	
	
	
	//protected JButton jButtonAbrirImportacionExistenciasCostos;
	//protected JButton jButtonGenerarImportacionExistenciasCostos;
	//protected JButton jButtonCerrarImportacionExistenciasCostos;
	//protected JFileChooser jFileChooserImportacionExistenciasCostos;
	//protected File fileImportacionExistenciasCostos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarExistenciasCostos;
	protected JButton jButtonDuplicarToolBarExistenciasCostos;
	protected JButton jButtonNuevoRelacionesToolBarExistenciasCostos;
	
	
	public JButton jButtonGuardarCambiosToolBarExistenciasCostos;
	protected JButton jButtonCopiarToolBarExistenciasCostos;
	protected JButton jButtonVerFormToolBarExistenciasCostos;
	public JButton jButtonGuardarCambiosTablaToolBarExistenciasCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarExistenciasCostos;
	protected JButton jButtonCerrarToolBarExistenciasCostos;
	
	protected JButton jButtonRecargarInformacionToolBarExistenciasCostos;
	protected JButton jButtonProcesarInformacionToolBarExistenciasCostos;
	protected JButton jButtonAnterioresToolBarExistenciasCostos;
	protected JButton jButtonSiguientesToolBarExistenciasCostos;
	protected JButton jButtonNuevoGuardarCambiosToolBarExistenciasCostos;
	protected JButton jButtonAbrirOrderByToolBarExistenciasCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoExistenciasCostos;
	protected JMenuItem jMenuItemDuplicarExistenciasCostos;
	protected JMenuItem jMenuItemNuevoRelacionesExistenciasCostos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosExistenciasCostos;
	protected JMenuItem jMenuItemCopiarExistenciasCostos;
	protected JMenuItem jMenuItemVerFormExistenciasCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaExistenciasCostos;
	protected JMenuItem jMenuItemCerrarExistenciasCostos;
	protected JMenuItem jMenuItemDetalleCerrarExistenciasCostos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByExistenciasCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarExistenciasCostos;
	
	protected JMenuItem jMenuItemRecargarInformacionExistenciasCostos;
	protected JMenuItem jMenuItemProcesarInformacionExistenciasCostos;
	protected JMenuItem jMenuItemAnterioresExistenciasCostos;
	protected JMenuItem jMenuItemSiguientesExistenciasCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosExistenciasCostos;
	protected JMenuItem jMenuItemAbrirOrderByExistenciasCostos;
	protected JMenuItem jMenuItemMostrarOcultarExistenciasCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesExistenciasCostos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosExistenciasCostos;
	protected JCheckBox jCheckBoxSeleccionadosExistenciasCostos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaExistenciasCostos;
	protected JCheckBox jCheckBoxConGraficoReporteExistenciasCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesExistenciasCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesExistenciasCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoExistenciasCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoExistenciasCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesExistenciasCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionExistenciasCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesExistenciasCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesExistenciasCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarExistenciasCostos;
	protected JTextField jTextFieldValorCampoGeneralExistenciasCostos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteExistenciasCostos;
	//public JList<Reporte> jListColumnasSelectReporteExistenciasCostos;
	//public JScrollPane jScrollColumnasSelectReporteExistenciasCostos;
	
	//public JLabel jLabelRelacionesSelectReporteExistenciasCostos;
	//public JList<Reporte> jListRelacionesSelectReporteExistenciasCostos;
	//public JScrollPane jScrollRelacionesSelectReporteExistenciasCostos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoExistenciasCostos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoExistenciasCostos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoExistenciasCostos;
	//public JLabel jLabelTiposArchivoReporteDinamicoExistenciasCostos;
	
		
	//public JLabel jLabelArchivoImportacionExistenciasCostos;	
	//public JLabel jLabelPathArchivoImportacionExistenciasCostos;
	//protected JTextField jTextFieldPathArchivoImportacionExistenciasCostos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoExistenciasCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoExistenciasCostos;
	
	//public JLabel jLabelColumnaCategoriaValorExistenciasCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorExistenciasCostos;
	
	//public JLabel jLabelColumnasValoresGraficoExistenciasCostos;
	//public JList<Reporte> jListColumnasValoresGraficoExistenciasCostos;
	//public JScrollPane jScrollColumnasValoresGraficoExistenciasCostos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoExistenciasCostos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoExistenciasCostos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasExistenciasCostos;
	public JPanel jPanelBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonBusquedaExistenciasCostosExistenciasCostos;
	
	public JPanel jPanelid_lineaBusquedaExistenciasCostosExistenciasCostos;
	public JLabel jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonid_lineaBusquedaExistenciasCostosExistenciasCostos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaExistenciasCostosExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaExistenciasCostosExistenciasCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos;
	public JLabel jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonid_linea_grupoBusquedaExistenciasCostosExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaExistenciasCostosExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaExistenciasCostosExistenciasCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos;
	public JLabel jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaExistenciasCostosExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaExistenciasCostosExistenciasCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos;
	public JLabel jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonid_linea_marcaBusquedaExistenciasCostosExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaExistenciasCostosExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaExistenciasCostosExistenciasCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos;
	public JLabel jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos;
	public JButton jButtonfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostosBusqueda= new JButtonMe();

	
	
	
	
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
	public ExistenciasCostosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionExistenciasCostos)	{
		this.jButtonRecargarInformacionExistenciasCostos = jButtonRecargarInformacionExistenciasCostos;
	}
	
	public JButton getjButtonProcesarInformacionExistenciasCostos() {
		return this.jButtonProcesarInformacionExistenciasCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionExistenciasCostos)	{
		this.jButtonProcesarInformacionExistenciasCostos = jButtonProcesarInformacionExistenciasCostos;
	}
	
	
	public JButton getjButtonRecargarInformacionExistenciasCostos() {
		return this.jButtonRecargarInformacionExistenciasCostos;
	}
	
	
	public List<ExistenciasCostos> getexistenciascostoss() {
		return this.existenciascostoss;
	}

	public void setexistenciascostoss(List<ExistenciasCostos> existenciascostoss) {
		this.existenciascostoss = existenciascostoss;
	}
	
	public List<ExistenciasCostos> getexistenciascostossAux() {
		return this.existenciascostossAux;
	}

	public void setexistenciascostossAux(List<ExistenciasCostos> existenciascostossAux) {
		this.existenciascostossAux = existenciascostossAux;
	}
	
	public List<ExistenciasCostos> getexistenciascostossEliminados() {
		return this.existenciascostossEliminados;
	}

	public void setExistenciasCostossEliminados(List<ExistenciasCostos> existenciascostossEliminados) {
		this.existenciascostossEliminados = existenciascostossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarExistenciasCostos() {
		return jComboBoxTiposSeleccionarExistenciasCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarExistenciasCostos(
			JComboBox jComboBoxTiposSeleccionarExistenciasCostos) {
		this.jComboBoxTiposSeleccionarExistenciasCostos = jComboBoxTiposSeleccionarExistenciasCostos;
	}
	
	public void setBorderResaltarTiposSeleccionarExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarExistenciasCostos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralExistenciasCostos() {
		return jTextFieldValorCampoGeneralExistenciasCostos;
	}

	public void setjTextFieldValorCampoGeneralExistenciasCostos(
			JTextField jTextFieldValorCampoGeneralExistenciasCostos) {
		this.jTextFieldValorCampoGeneralExistenciasCostos = jTextFieldValorCampoGeneralExistenciasCostos;
	}

	public void setBorderResaltarValorCampoGeneralExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralExistenciasCostos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosExistenciasCostos() {
		return this.jCheckBoxSeleccionarTodosExistenciasCostos;
	}

	public void setjCheckBoxSeleccionarTodosExistenciasCostos(
			JCheckBox jCheckBoxSeleccionarTodosExistenciasCostos) {
		this.jCheckBoxSeleccionarTodosExistenciasCostos = jCheckBoxSeleccionarTodosExistenciasCostos;
	}

	public void setBorderResaltarSeleccionarTodosExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosExistenciasCostos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosExistenciasCostos() {
		return this.jCheckBoxSeleccionadosExistenciasCostos;
	}

	public void setjCheckBoxSeleccionadosExistenciasCostos(
			JCheckBox jCheckBoxSeleccionadosExistenciasCostos) {
		this.jCheckBoxSeleccionadosExistenciasCostos = jCheckBoxSeleccionadosExistenciasCostos;
	}
	
	public void setBorderResaltarSeleccionadosExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosExistenciasCostos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesExistenciasCostos() {
		return this.jComboBoxTiposArchivosReportesExistenciasCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesExistenciasCostos(
			JComboBox jComboBoxTiposArchivosReportesExistenciasCostos) {
		this.jComboBoxTiposArchivosReportesExistenciasCostos = jComboBoxTiposArchivosReportesExistenciasCostos;
	}

	public void setBorderResaltarTiposArchivosReportesExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesExistenciasCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesExistenciasCostos() {
		return this.jComboBoxTiposReportesExistenciasCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesExistenciasCostos(
			JComboBox jComboBoxTiposReportesExistenciasCostos) {
		this.jComboBoxTiposReportesExistenciasCostos = jComboBoxTiposReportesExistenciasCostos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoExistenciasCostos() {
	//	return jComboBoxTiposReportesDinamicoExistenciasCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoExistenciasCostos(
	//		JComboBox jComboBoxTiposReportesDinamicoExistenciasCostos) {
	//	this.jComboBoxTiposReportesDinamicoExistenciasCostos = jComboBoxTiposReportesDinamicoExistenciasCostos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoExistenciasCostos() {
	//	return jComboBoxTiposArchivosReportesDinamicoExistenciasCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoExistenciasCostos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoExistenciasCostos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos = jComboBoxTiposArchivosReportesDinamicoExistenciasCostos;
	//}
	
	public void setBorderResaltarTiposReportesExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesExistenciasCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesExistenciasCostos() {
		return this.jComboBoxTiposGraficosReportesExistenciasCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesExistenciasCostos(
			JComboBox jComboBoxTiposGraficosReportesExistenciasCostos) {
		this.jComboBoxTiposGraficosReportesExistenciasCostos = jComboBoxTiposGraficosReportesExistenciasCostos;
	}
	
	public void setBorderResaltarTiposGraficosReportesExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesExistenciasCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionExistenciasCostos() {
		return this.jComboBoxTiposPaginacionExistenciasCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionExistenciasCostos(
			JComboBox jComboBoxTiposPaginacionExistenciasCostos) {
		this.jComboBoxTiposPaginacionExistenciasCostos = jComboBoxTiposPaginacionExistenciasCostos;
	}
	
	public void setBorderResaltarTiposPaginacionExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionExistenciasCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesExistenciasCostos() {
		return this.jComboBoxTiposRelacionesExistenciasCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesExistenciasCostos() {
		return this.jComboBoxTiposAccionesExistenciasCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesExistenciasCostos(
			JComboBox jComboBoxTiposRelacionesExistenciasCostos) {
		this.jComboBoxTiposRelacionesExistenciasCostos = jComboBoxTiposRelacionesExistenciasCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesExistenciasCostos(
			JComboBox jComboBoxTiposAccionesExistenciasCostos) {
		this.jComboBoxTiposAccionesExistenciasCostos = jComboBoxTiposAccionesExistenciasCostos;
	}
	
	public void setBorderResaltarTiposRelacionesExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesExistenciasCostos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesExistenciasCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesExistenciasCostos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoExistenciasCostos() {
	//	return jCheckBoxConGraficoDinamicoExistenciasCostos;
	//}

	//public void setjCheckBoxConGraficoDinamicoExistenciasCostos(
	//		JCheckBox jCheckBoxConGraficoDinamicoExistenciasCostos) {
	//	this.jCheckBoxConGraficoDinamicoExistenciasCostos = jCheckBoxConGraficoDinamicoExistenciasCostos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoExistenciasCostos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarExistenciasCostos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoExistenciasCostos .setBorder(borderResaltar);		
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
		this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
		
		this.existenciascostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciascostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.existenciascostosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ExistenciasCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Existencias Costos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
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
		
		ExistenciasCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarExistenciasCostos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"nuevo","nuevo","Nuevo"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"duplicar","duplicar","Duplicar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"copiar","copiar","Copiar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"ver_form","ver_form","Ver"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"recargar","recargar","Buscar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarExistenciasCostos,this.jTtoolBarExistenciasCostos,
							"cerrar","cerrar","Salir"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarExistenciasCostos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarExistenciasCostos;
			
				this.jButtonProcesarInformacionToolBarExistenciasCostos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarExistenciasCostos;
				
		//protected JButton jButtonModificarToolBarExistenciasCostos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarExistenciasCostos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuExistenciasCostos=new JMenuMe("General");
		this.jmenuArchivoExistenciasCostos=new JMenuMe("Archivo");
		this.jmenuAccionesExistenciasCostos=new JMenuMe("Acciones");
		this.jmenuDatosExistenciasCostos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoExistenciasCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoExistenciasCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoExistenciasCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarExistenciasCostos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarExistenciasCostos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarExistenciasCostos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesExistenciasCostos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesExistenciasCostos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesExistenciasCostos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosExistenciasCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosExistenciasCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosExistenciasCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarExistenciasCostos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarExistenciasCostos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarExistenciasCostos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormExistenciasCostos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormExistenciasCostos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormExistenciasCostos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaExistenciasCostos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaExistenciasCostos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaExistenciasCostos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarExistenciasCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarExistenciasCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarExistenciasCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionExistenciasCostos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionExistenciasCostos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionExistenciasCostos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionExistenciasCostos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionExistenciasCostos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionExistenciasCostos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresExistenciasCostos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresExistenciasCostos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresExistenciasCostos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesExistenciasCostos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesExistenciasCostos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesExistenciasCostos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByExistenciasCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByExistenciasCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByExistenciasCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarExistenciasCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarExistenciasCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarExistenciasCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByExistenciasCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByExistenciasCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByExistenciasCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarExistenciasCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarExistenciasCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarExistenciasCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosExistenciasCostos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosExistenciasCostos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosExistenciasCostos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoExistenciasCostos.add(this.jMenuItemCerrarExistenciasCostos);
			
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemNuevoExistenciasCostos);
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemNuevoGuardarCambiosExistenciasCostos);
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemNuevoRelacionesExistenciasCostos);
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemGuardarCambiosTablaExistenciasCostos);		
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemDuplicarExistenciasCostos);		
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemCopiarExistenciasCostos);		
			this.jmenuAccionesExistenciasCostos.add(this.jMenuItemVerFormExistenciasCostos);		
			
			this.jmenuDatosExistenciasCostos.add(this.jMenuItemRecargarInformacionExistenciasCostos);				
			this.jmenuDatosExistenciasCostos.add(this.jMenuItemAnterioresExistenciasCostos);				
			this.jmenuDatosExistenciasCostos.add(this.jMenuItemSiguientesExistenciasCostos);				
			this.jmenuDatosExistenciasCostos.add(this.jMenuItemAbrirOrderByExistenciasCostos);				
			this.jmenuDatosExistenciasCostos.add(this.jMenuItemMostrarOcultarExistenciasCostos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesExistenciasCostos.add(this.jMenuItemGuardarCambiosExistenciasCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarExistenciasCostos.add(this.jmenuArchivoExistenciasCostos);		
			this.jmenuBarExistenciasCostos.add(this.jmenuAccionesExistenciasCostos);		
			this.jmenuBarExistenciasCostos.add(this.jmenuDatosExistenciasCostos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarExistenciasCostos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasExistenciasCostos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaExistenciasCostosExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");
		this.jButtonBusquedaExistenciasCostosExistenciasCostos= new JButtonMe();
		this.jButtonBusquedaExistenciasCostosExistenciasCostos.setText("Buscar");
		this.jButtonBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaExistenciasCostosExistenciasCostos,"buscar_button","Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaExistenciasCostosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos = new JLabelMe();
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos.setText("Linea :");
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Linea");
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos = new JLabelMe();
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos = new JLabelMe();
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasExistenciasCostos=new JTabbedPane();


		this.jTabbedPaneBusquedasExistenciasCostos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasExistenciasCostos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasExistenciasCostos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleExistenciasCostos = new ExistenciasCostosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Existencias Costos DATOS");
			this.jInternalFrameDetalleFormExistenciasCostos = new ExistenciasCostosDetalleFormJInternalFrame(jDesktopPane,this.existenciascostosSessionBean.getConGuardarRelaciones(),this.existenciascostosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormExistenciasCostos = null;//new ExistenciasCostosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutExistenciasCostos= new GridBagLayout();
		
		
		this.jTableDatosExistenciasCostos = new JTableMe();      
		
		String sToolTipExistenciasCostos="";
		sToolTipExistenciasCostos=ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipExistenciasCostos+="(Inventario.ExistenciasCostos)";
		}
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipExistenciasCostos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosExistenciasCostos.setToolTipText(sToolTipExistenciasCostos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosExistenciasCostos);
		this.jTableDatosExistenciasCostos.setAutoCreateRowSorter(true);
		this.jTableDatosExistenciasCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosExistenciasCostos.setRowSelectionAllowed(true);
		this.jTableDatosExistenciasCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosExistenciasCostos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoExistenciasCostos = new JButtonMe();
		this.jButtonDuplicarExistenciasCostos = new JButtonMe();
		this.jButtonCopiarExistenciasCostos = new JButtonMe();
		this.jButtonVerFormExistenciasCostos = new JButtonMe();
		this.jButtonNuevoRelacionesExistenciasCostos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaExistenciasCostos = new JButtonMe();
		this.jButtonCerrarExistenciasCostos = new JButtonMe();
		
		this.jScrollPanelDatosExistenciasCostos = new JScrollPane();   
        this.jScrollPanelDatosGeneralExistenciasCostos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Existencias Costos";
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesExistenciasCostos.setToolTipText("Acciones");
        this.jPanelAccionesExistenciasCostos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoExistenciasCostos=new ReporteDinamicoJInternalFrame(ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoExistenciasCostos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionExistenciasCostos=new ImportacionJInternalFrame(ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionExistenciasCostos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByExistenciasCostos = new JButtonMe();
		
		this.jButtonAbrirOrderByExistenciasCostos.setText("Orden");
		this.jButtonAbrirOrderByExistenciasCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByExistenciasCostos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByExistenciasCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasCostos,false,this);
			
			//this.cargarOrderByExistenciasCostos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByExistenciasCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasCostos,true,this);
			
			//this.cargarOrderByExistenciasCostos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosExistenciasCostos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosExistenciasCostos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosExistenciasCostos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosExistenciasCostos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosExistenciasCostos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosExistenciasCostos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoExistenciasCostos.setText("Nuevo");
		this.jButtonDuplicarExistenciasCostos.setText("Duplicar");
		this.jButtonCopiarExistenciasCostos.setText("Copiar");
		this.jButtonVerFormExistenciasCostos.setText("Ver");
		this.jButtonNuevoRelacionesExistenciasCostos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.setText("Guardar");
		this.jButtonCerrarExistenciasCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoExistenciasCostos,"nuevo_button","Nuevo",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarExistenciasCostos,"duplicar_button","Duplicar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarExistenciasCostos,"copiar_button","Copiar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormExistenciasCostos,"ver_form","Ver",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesExistenciasCostos,"nuevorelaciones_button","Nuevo Rel",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaExistenciasCostos,"guardarcambiostabla_button","Guardar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarExistenciasCostos,"cerrar_button","Salir",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoExistenciasCostos.setToolTipText("Nuevo"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarExistenciasCostos.setToolTipText("Duplicar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarExistenciasCostos.setToolTipText("Copiar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormExistenciasCostos.setToolTipText("Ver"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesExistenciasCostos.setToolTipText("Nuevo Rel"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.setToolTipText("Guardar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarExistenciasCostos.setToolTipText("Salir"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoExistenciasCostos";
		inputMap = this.jButtonNuevoExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoExistenciasCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoExistenciasCostos"));
		
		//DUPLICAR
		sMapKey = "DuplicarExistenciasCostos";
		inputMap = this.jButtonDuplicarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarExistenciasCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarExistenciasCostos"));
		
		//COPIAR
		sMapKey = "CopiarExistenciasCostos";
		inputMap = this.jButtonCopiarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarExistenciasCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarExistenciasCostos"));
		
		//VEr FORM
		sMapKey = "VerFormExistenciasCostos";
		inputMap = this.jButtonVerFormExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormExistenciasCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormExistenciasCostos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesExistenciasCostos";
		inputMap = this.jButtonNuevoRelacionesExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesExistenciasCostos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarExistenciasCostos";
		inputMap = this.jButtonModificarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarExistenciasCostos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarExistenciasCostos";
		inputMap = this.jButtonCerrarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarExistenciasCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaExistenciasCostos";
		inputMap = this.jButtonGuardarCambiosTablaExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaExistenciasCostos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesExistenciasCostos.setName("jPanelParametrosReportesExistenciasCostos"); 
		
		this.jPanelParametrosReportesAccionesExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesExistenciasCostos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesExistenciasCostos.setName("jPanelParametrosReportesAccionesExistenciasCostos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionExistenciasCostos = new JButtonMe();
		this.jButtonRecargarInformacionExistenciasCostos.setText("Buscar");
		this.jButtonRecargarInformacionExistenciasCostos.setToolTipText("Buscar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionExistenciasCostos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionExistenciasCostos.setVisible(false);
		
		
		this.jButtonProcesarInformacionExistenciasCostos = new JButtonMe();
		this.jButtonProcesarInformacionExistenciasCostos.setText("Procesar");
		this.jButtonProcesarInformacionExistenciasCostos.setToolTipText("Procesar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionExistenciasCostos.setVisible(false);
			
		this.jButtonProcesarInformacionExistenciasCostos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionExistenciasCostos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionExistenciasCostos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasCostos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesExistenciasCostos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasCostos.setText("TIPO");       
		this.jComboBoxTiposReportesExistenciasCostos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesExistenciasCostos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesExistenciasCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionExistenciasCostos.setText("Paginacion");
		this.jComboBoxTiposPaginacionExistenciasCostos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesExistenciasCostos.setText("Accion");
		this.jComboBoxTiposRelacionesExistenciasCostos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesExistenciasCostos.setText("Accion");
		this.jComboBoxTiposAccionesExistenciasCostos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarExistenciasCostos.setText("Accion");
		this.jComboBoxTiposSeleccionarExistenciasCostos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralExistenciasCostos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralExistenciasCostos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralExistenciasCostos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralExistenciasCostos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesExistenciasCostos = new JLabelMe();
		
		this.jLabelAccionesExistenciasCostos.setText("Acciones");		
		this.jLabelAccionesExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosExistenciasCostos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosExistenciasCostos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosExistenciasCostos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosExistenciasCostos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosExistenciasCostos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaExistenciasCostos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaExistenciasCostos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaExistenciasCostos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteExistenciasCostos.setText("Graf.");
		this.jCheckBoxConGraficoReporteExistenciasCostos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresExistenciasCostos = new JButtonMe();
		//this.jButtonAnterioresExistenciasCostos.setText("<<");
        this.jButtonAnterioresExistenciasCostos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresExistenciasCostos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesExistenciasCostos = new JButtonMe();
		//this.jButtonSiguientesExistenciasCostos.setText(">>");
        this.jButtonSiguientesExistenciasCostos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesExistenciasCostos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosExistenciasCostos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosExistenciasCostos.setText("Nue");
        this.jButtonNuevoGuardarCambiosExistenciasCostos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosExistenciasCostos,"nuevoguardarcambios_button","Nue",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosExistenciasCostos";
		inputMap = this.jButtonNuevoGuardarCambiosExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosExistenciasCostos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionExistenciasCostos";
		inputMap = this.jButtonRecargarInformacionExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionExistenciasCostos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesExistenciasCostos";
		inputMap = this.jButtonSiguientesExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesExistenciasCostos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresExistenciasCostos";
		inputMap = this.jButtonAnterioresExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresExistenciasCostos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasExistenciasCostos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesExistenciasCostos.setMinimumSize(new Dimension(this.getWidth(),ExistenciasCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesExistenciasCostos.setMaximumSize(new Dimension(this.getWidth(),ExistenciasCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesExistenciasCostos.setPreferredSize(new Dimension(this.getWidth(),ExistenciasCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ExistenciasCostosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionExistenciasCostos = new GridBagLayout();

			this.jPanelPaginacionExistenciasCostos.setLayout(gridaBagLayoutPaginacionExistenciasCostos);						
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 0;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonAnterioresExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					
						
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsExistenciasCostos.gridy = 0;
			
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonNuevoGuardarCambiosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
						
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsExistenciasCostos.gridy = 0;
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonSiguientesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 1;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonNuevoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
						
			
			
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
				this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsExistenciasCostos.gridy = 1;
				this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionExistenciasCostos.add(this.jButtonGuardarCambiosTablaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			}
			
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 1;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonDuplicarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 1;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonCopiarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 1;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonVerFormExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 1;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionExistenciasCostos.add(this.jButtonCerrarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		
		this.jButtonRecargarInformacionExistenciasCostos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionExistenciasCostos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionExistenciasCostos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesExistenciasCostos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesExistenciasCostos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesExistenciasCostos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesExistenciasCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesExistenciasCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesExistenciasCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesExistenciasCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesExistenciasCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesExistenciasCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionExistenciasCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionExistenciasCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionExistenciasCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesExistenciasCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesExistenciasCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesExistenciasCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesExistenciasCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarExistenciasCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarExistenciasCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarExistenciasCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaExistenciasCostos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaExistenciasCostos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaExistenciasCostos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteExistenciasCostos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteExistenciasCostos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteExistenciasCostos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosExistenciasCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosExistenciasCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosExistenciasCostos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosExistenciasCostos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosExistenciasCostos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosExistenciasCostos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesExistenciasCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesExistenciasCostos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ExistenciasCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ExistenciasCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ExistenciasCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ExistenciasCostos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesExistenciasCostos.setLayout(gridaBagParametrosReportesExistenciasCostos);
			this.jPanelParametrosReportesAccionesExistenciasCostos.setLayout(gridaBagParametrosReportesAccionesExistenciasCostos);
			
			
			this.jPanelParametrosAuxiliar1ExistenciasCostos.setLayout(gridaBagParametrosAuxiliar1ExistenciasCostos);
			this.jPanelParametrosAuxiliar2ExistenciasCostos.setLayout(gridaBagParametrosAuxiliar2ExistenciasCostos);
			this.jPanelParametrosAuxiliar3ExistenciasCostos.setLayout(gridaBagParametrosAuxiliar3ExistenciasCostos);
			this.jPanelParametrosAuxiliar4ExistenciasCostos.setLayout(gridaBagParametrosAuxiliar4ExistenciasCostos);
			//this.jPanelParametrosAuxiliar5ExistenciasCostos.setLayout(gridaBagParametrosAuxiliar2ExistenciasCostos);			
			
			
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasCostos.add(this.jButtonRecargarInformacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasCostos.add(this.jComboBoxTiposPaginacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasCostos.add(this.jCheckBoxConAltoMaximoTablaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ExistenciasCostos.add(this.jComboBoxTiposArchivosReportesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasCostos.add(this.jPanelParametrosAuxiliar1ExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ExistenciasCostos.add(this.jComboBoxTiposReportesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);																		
			
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ExistenciasCostos.add(this.jComboBoxTiposGraficosReportesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasCostos.add(this.jPanelParametrosAuxiliar4ExistenciasCostos, this.gridBagConstraintsExistenciasCostos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasCostos.add(this.jComboBoxTiposReportesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasCostos.add(this.jCheckBoxGenerarReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasCostos.add(this.jPanelParametrosAuxiliar2ExistenciasCostos, this.gridBagConstraintsExistenciasCostos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasCostos.add(this.jLabelAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
				this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesExistenciasCostos.add(this.jButtonAbrirOrderByExistenciasCostos, this.gridBagConstraintsExistenciasCostos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasCostos.add(this.jComboBoxTiposSeleccionarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
			
			
			/*
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasCostos.add(this.jCheckBoxSeleccionarTodosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesExistenciasCostos.add(this.jCheckBoxConGraficoReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasCostos.add(this.jCheckBoxSeleccionarTodosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);															
				
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasCostos.add(this.jCheckBoxSeleccionadosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);															
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsExistenciasCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ExistenciasCostos.add(this.jCheckBoxConGraficoReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesExistenciasCostos.add(this.jPanelParametrosAuxiliar3ExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsExistenciasCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesExistenciasCostos.add(this.jComboBoxTiposAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosExistenciasCostos = new GridBagLayout();

			this.jScrollPanelDatosExistenciasCostos.setLayout(gridaBagLayoutDatosExistenciasCostos);
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = 0;
			this.gridBagConstraintsExistenciasCostos.gridx = 0;
			
			this.jScrollPanelDatosExistenciasCostos.add(this.jTableDatosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosExistenciasCostos.setViewportView(this.jTableDatosExistenciasCostos);
		this.jTableDatosExistenciasCostos.setFillsViewportHeight(true);
		this.jTableDatosExistenciasCostos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesExistenciasCostos= new GridBagLayout();
		this.jPanelAccionesExistenciasCostos.setLayout(gridaBagLayoutAccionesExistenciasCostos);
		
		
		/*	
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
			
		this.jPanelAccionesExistenciasCostos.add(this.jButtonNuevoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos= new GridBagLayout();
		gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaExistenciasCostosExistenciasCostos.setLayout(gridaBagLayoutBusquedaExistenciasCostosExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 0;
		gridBagConstraintsExistenciasCostos.gridx = 0;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jLabelid_lineaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 0;
		gridBagConstraintsExistenciasCostos.gridx = 1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);


		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 1;
		gridBagConstraintsExistenciasCostos.gridx = 0;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jLabelid_linea_grupoBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 1;
		gridBagConstraintsExistenciasCostos.gridx = 1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);


		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 2;
		gridBagConstraintsExistenciasCostos.gridx = 0;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jLabelid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 2;
		gridBagConstraintsExistenciasCostos.gridx = 1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);


		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 3;
		gridBagConstraintsExistenciasCostos.gridx = 0;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jLabelid_linea_marcaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 3;
		gridBagConstraintsExistenciasCostos.gridx = 1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);


		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 4;
		gridBagConstraintsExistenciasCostos.gridx = 0;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jLabelfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 4;
		gridBagConstraintsExistenciasCostos.gridx = 1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsExistenciasCostos.gridy = 5;
		gridBagConstraintsExistenciasCostos.gridx =1;
		jPanelBusquedaExistenciasCostosExistenciasCostos.add(jButtonBusquedaExistenciasCostosExistenciasCostos, gridBagConstraintsExistenciasCostos);

		jTabbedPaneBusquedasExistenciasCostos.addTab("1.-Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ", jPanelBusquedaExistenciasCostosExistenciasCostos);
		jTabbedPaneBusquedasExistenciasCostos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutExistenciasCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutExistenciasCostos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();						
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasCostos.gridx = 0;		
			//this.gridBagConstraintsExistenciasCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsExistenciasCostos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsExistenciasCostos.gridx = 0;		
		//this.gridBagConstraintsExistenciasCostos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsExistenciasCostos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsExistenciasCostos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasCostos.gridx = 0;		
			this.gridBagConstraintsExistenciasCostos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsExistenciasCostos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasExistenciasCostos, this.gridBagConstraintsExistenciasCostos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);								
		
		
		/*
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		*/		
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsExistenciasCostos.gridx =0;
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsExistenciasCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
				
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosExistenciasCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosExistenciasCostos = new GridBagLayout();
			this.jPanelBusquedasParametrosExistenciasCostos.setLayout(gridaBagLayoutBusquedasParametrosExistenciasCostos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralExistenciasCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralExistenciasCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralExistenciasCostos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoExistenciasCostos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoExistenciasCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoExistenciasCostos.setName("jPanelReporteDinamicoExistenciasCostos"); 
		
		this.jPanelReporteDinamicoExistenciasCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoExistenciasCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoExistenciasCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoExistenciasCostos.setLayout(gridaBagLayoutReporteDinamicoExistenciasCostos);
		
		
		this.jInternalFrameReporteDinamicoExistenciasCostos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoExistenciasCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteExistenciasCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoExistenciasCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoExistenciasCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoExistenciasCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoExistenciasCostos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoExistenciasCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoExistenciasCostos.setResizable(true);
	    this.jInternalFrameReporteDinamicoExistenciasCostos.setClosable(true);
	    this.jInternalFrameReporteDinamicoExistenciasCostos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoExistenciasCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoExistenciasCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoExistenciasCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteExistenciasCostos = new JLabelMe();

		this.jLabelColumnasSelectReporteExistenciasCostos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelColumnasSelectReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteExistenciasCostos = new JList<Reporte>();
		this.jListColumnasSelectReporteExistenciasCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteExistenciasCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteExistenciasCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteExistenciasCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteExistenciasCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteExistenciasCostos=new JScrollPane(this.jListColumnasSelectReporteExistenciasCostos);
			
			this.jScrollColumnasSelectReporteExistenciasCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteExistenciasCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteExistenciasCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoExistenciasCostos.add(this.jListColumnasSelectReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jScrollColumnasSelectReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteExistenciasCostos = new JLabelMe();

		this.jLabelRelacionesSelectReporteExistenciasCostos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteExistenciasCostos = new JList<Reporte>();
		this.jListRelacionesSelectReporteExistenciasCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteExistenciasCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteExistenciasCostos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteExistenciasCostos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteExistenciasCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteExistenciasCostos=new JScrollPane(this.jListRelacionesSelectReporteExistenciasCostos);
			
			this.jScrollRelacionesSelectReporteExistenciasCostos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteExistenciasCostos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteExistenciasCostos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoExistenciasCostos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoExistenciasCostos = new JComboBoxMe();
		this.jListColumnasValoresGraficoExistenciasCostos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoExistenciasCostos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoExistenciasCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoExistenciasCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoExistenciasCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoExistenciasCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoExistenciasCostos = new JLabelMe();

		this.jLabelConGraficoDinamicoExistenciasCostos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelConGraficoDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoExistenciasCostos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoExistenciasCostos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoExistenciasCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoExistenciasCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoExistenciasCostos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jCheckBoxConGraficoDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoExistenciasCostos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoExistenciasCostos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelColumnaCategoriaGraficoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jComboBoxColumnaCategoriaGraficoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorExistenciasCostos = new JLabelMe();

		this.jLabelColumnaCategoriaValorExistenciasCostos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelColumnaCategoriaValorExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorExistenciasCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorExistenciasCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorExistenciasCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorExistenciasCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorExistenciasCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jComboBoxColumnaCategoriaValorExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoExistenciasCostos = new JLabelMe();

		this.jLabelColumnasValoresGraficoExistenciasCostos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelColumnasValoresGraficoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoExistenciasCostos = new JList<Reporte>();
		this.jListColumnasValoresGraficoExistenciasCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoExistenciasCostos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoExistenciasCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoExistenciasCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoExistenciasCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoExistenciasCostos=new JScrollPane(this.jListColumnasValoresGraficoExistenciasCostos);
			
			this.jScrollColumnasValoresGraficoExistenciasCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoExistenciasCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoExistenciasCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoExistenciasCostos.add(this.jListColumnasSelectReporteExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jScrollColumnasValoresGraficoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoExistenciasCostos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoExistenciasCostos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelTiposGraficosReportesDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoExistenciasCostos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jComboBoxTiposGraficosReportesDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoExistenciasCostos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoExistenciasCostos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelGenerarExcelReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoExistenciasCostos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoExistenciasCostos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoExistenciasCostos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoExistenciasCostos.setToolTipText("Generar EXCEL"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoExistenciasCostos.add(this.jButtonGenerarExcelReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jComboBoxTiposReportesDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoExistenciasCostos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoExistenciasCostos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jLabelTiposArchivoReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jComboBoxTiposArchivosReportesDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoExistenciasCostos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoExistenciasCostos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoExistenciasCostos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoExistenciasCostos.setToolTipText("Generar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jButtonGenerarReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoExistenciasCostos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoExistenciasCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoExistenciasCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoExistenciasCostos.setToolTipText("Cancelar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoExistenciasCostos.add(this.jButtonCerrarReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalExistenciasCostos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoExistenciasCostos= new JScrollPane(jPanelReporteDinamicoExistenciasCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoExistenciasCostos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoExistenciasCostos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoExistenciasCostos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoExistenciasCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoExistenciasCostos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalExistenciasCostos);
		this.jInternalFrameReporteDinamicoExistenciasCostos.getContentPane().add(this.jScrollPanelReporteDinamicoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionExistenciasCostos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionExistenciasCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionExistenciasCostos.setName("jPanelImportacionExistenciasCostos"); 
		
		this.jPanelImportacionExistenciasCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionExistenciasCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionExistenciasCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionExistenciasCostos.setLayout(gridaBagLayoutImportacionExistenciasCostos);
		
		
		this.jInternalFrameImportacionExistenciasCostos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionExistenciasCostos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionExistenciasCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteExistenciasCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionExistenciasCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionExistenciasCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionExistenciasCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionExistenciasCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionExistenciasCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionExistenciasCostos.setResizable(true);
	    this.jInternalFrameImportacionExistenciasCostos.setClosable(true);
	    this.jInternalFrameImportacionExistenciasCostos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionExistenciasCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionExistenciasCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionExistenciasCostos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionExistenciasCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionExistenciasCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionExistenciasCostos.setResizable(true);
	    this.jInternalFrameImportacionExistenciasCostos.setClosable(true);
	    this.jInternalFrameImportacionExistenciasCostos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionExistenciasCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionExistenciasCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionExistenciasCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionExistenciasCostos = new JLabelMe();

		this.jLabelArchivoImportacionExistenciasCostos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionExistenciasCostos.add(this.jLabelArchivoImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionExistenciasCostos = new JFileChooser();		
		this.jFileChooserImportacionExistenciasCostos.setToolTipText("ESCOGER ARCHIVO"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionExistenciasCostos = new JButtonMe();
		this.jButtonAbrirImportacionExistenciasCostos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionExistenciasCostos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionExistenciasCostos.setToolTipText("Generar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasCostos.add(this.jButtonAbrirImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionExistenciasCostos = new JLabelMe();

		this.jLabelPathArchivoImportacionExistenciasCostos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionExistenciasCostos.add(this.jLabelPathArchivoImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionExistenciasCostos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionExistenciasCostos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionExistenciasCostos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionExistenciasCostos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasCostos.add(this.jTextFieldPathArchivoImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionExistenciasCostos = new JButtonMe();
		this.jButtonGenerarImportacionExistenciasCostos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionExistenciasCostos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionExistenciasCostos.setToolTipText("Generar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasCostos.add(this.jButtonGenerarImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionExistenciasCostos = new JButtonMe();
		this.jButtonCerrarImportacionExistenciasCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionExistenciasCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionExistenciasCostos.setToolTipText("Cancelar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionExistenciasCostos.add(this.jButtonCerrarImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalExistenciasCostos = new GridBagLayout();
		
		this.jScrollPanelImportacionExistenciasCostos= new JScrollPane(jPanelImportacionExistenciasCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iPosYImportacion;
		this.gridBagConstraintsExistenciasCostos.gridx =iPosXImportacion;
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionExistenciasCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionExistenciasCostos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalExistenciasCostos);
		this.jInternalFrameImportacionExistenciasCostos.getContentPane().add(this.jScrollPanelImportacionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByExistenciasCostos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByExistenciasCostos = new JButtonMe();
			this.jButtonAbrirOrderByExistenciasCostos.setText("Orden");
			this.jButtonAbrirOrderByExistenciasCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByExistenciasCostos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByExistenciasCostos";
			inputMap = this.jButtonAbrirOrderByExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByExistenciasCostos"));
		
		
			GridBagLayout gridaBagLayoutOrderByExistenciasCostos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByExistenciasCostos.setName("jPanelOrderByExistenciasCostos"); 
			
			this.jPanelOrderByExistenciasCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByExistenciasCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByExistenciasCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByExistenciasCostos.setLayout(gridaBagLayoutOrderByExistenciasCostos);
			
			
			this.jTableDatosExistenciasCostosOrderBy = new JTableMe();        
			this.jTableDatosExistenciasCostosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosExistenciasCostosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosExistenciasCostosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosExistenciasCostosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosExistenciasCostosOrderBy.setViewportView(this.jTableDatosExistenciasCostosOrderBy);
			this.jTableDatosExistenciasCostosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosExistenciasCostosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByExistenciasCostos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByExistenciasCostos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByExistenciasCostos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteExistenciasCostos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByExistenciasCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByExistenciasCostos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByExistenciasCostos.setTitle("Orden");
			this.jInternalFrameOrderByExistenciasCostos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByExistenciasCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByExistenciasCostos.setResizable(true);
			this.jInternalFrameOrderByExistenciasCostos.setClosable(true);
			this.jInternalFrameOrderByExistenciasCostos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByExistenciasCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByExistenciasCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByExistenciasCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsExistenciasCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsExistenciasCostos.ipady =150;
				
			this.jPanelOrderByExistenciasCostos.add(jScrollPanelDatosExistenciasCostosOrderBy, this.gridBagConstraintsExistenciasCostos);//this.jTableDatosExistenciasCostosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByExistenciasCostos = new JButtonMe();
			this.jButtonCerrarOrderByExistenciasCostos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByExistenciasCostos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByExistenciasCostos.setToolTipText("Cancelar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsExistenciasCostos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByExistenciasCostos.add(this.jButtonCerrarOrderByExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalExistenciasCostos = new GridBagLayout();
			
			this.jScrollPanelOrderByExistenciasCostos= new JScrollPane(jPanelOrderByExistenciasCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy =iPosYOrderBy;
			this.gridBagConstraintsExistenciasCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByExistenciasCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByExistenciasCostos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalExistenciasCostos);
			
			this.jInternalFrameOrderByExistenciasCostos.getContentPane().add(this.jScrollPanelOrderByExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
		
		} else {
			this.jButtonAbrirOrderByExistenciasCostos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.existenciascostosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosExistenciasCostos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosExistenciasCostos.getRowHeight();//ExistenciasCostosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaExistenciasCostos.isSelected()) {
					iHeightTable=ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaExistenciasCostos.isSelected()) {
					iHeightTable=ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ExistenciasCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosExistenciasCostos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosExistenciasCostos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosExistenciasCostos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosExistenciasCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosExistenciasCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosExistenciasCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByExistenciasCostos!=null && this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy()!=null) {
			//if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByExistenciasCostos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByExistenciasCostos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByExistenciasCostos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosExistenciasCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosExistenciasCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosExistenciasCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=existenciascostosLogic.getExistenciasCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciascostoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ExistenciasCostos> TraerExistenciasCostosBeans(List<ExistenciasCostos> existenciascostoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ExistenciasCostos existenciascostos:existenciascostoss) {
					
				if(!(ExistenciasCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ExistenciasCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					existenciascostos.setsDetalleGeneralEntityReporte(ExistenciasCostosConstantesFunciones.getExistenciasCostosDescripcion(existenciascostos));
										
						
					
						
					
				} else  {
							
					//existenciascostos.setsDetalleGeneralEntityReporte(existenciascostos.getsDetalleGeneralEntityReporte());
										
				}
				
				//existenciascostosbeans.add(existenciascostosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return existenciascostoss;
    }
	//PARA REPORTES FIN
}
