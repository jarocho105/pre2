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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.report.AntiguedadesInventariosConstantesFunciones;

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
public class AntiguedadesInventariosJInternalFrame extends AntiguedadesInventariosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAntiguedadesInventarios;
	
	protected JMenuBar jmenuBarAntiguedadesInventarios;
	
	protected JMenu jmenuAntiguedadesInventarios;
	protected JMenu jmenuDatosAntiguedadesInventarios;
	protected JMenu jmenuArchivoAntiguedadesInventarios;
	protected JMenu jmenuAccionesAntiguedadesInventarios;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAntiguedadesInventarios;	
	protected GridBagConstraints gridBagConstraintsAntiguedadesInventarios;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AntiguedadesInventariosDetalleFormJInternalFrame jInternalFrameDetalleFormAntiguedadesInventarios;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAntiguedadesInventarios;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAntiguedadesInventarios;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public AntiguedadesInventariosSessionBean antiguedadesinventariosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AntiguedadesInventarios> antiguedadesinventarioss;		
	public List<AntiguedadesInventarios> antiguedadesinventariossEliminados;	
	public List<AntiguedadesInventarios> antiguedadesinventariossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAntiguedadesInventarios;		
	protected JButton jButtonAbrirOrderByAntiguedadesInventarios;
	
	
	//protected JPanel jPanelOrderByAntiguedadesInventarios;
	//public JScrollPane jScrollPanelOrderByAntiguedadesInventarios;	
	//protected JButton jButtonCerrarOrderByAntiguedadesInventarios;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AntiguedadesInventariosLogic antiguedadesinventariosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAntiguedadesInventarios;
	public JScrollPane jScrollPanelDatosEdicionAntiguedadesInventarios;
	public JScrollPane jScrollPanelDatosGeneralAntiguedadesInventarios;
    
	
	
	//public JScrollPane jScrollPanelDatosAntiguedadesInventariosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAntiguedadesInventarios;
	//public JScrollPane jScrollPanelImportacionAntiguedadesInventarios;
	
	
	
	protected JPanel jPanelAccionesAntiguedadesInventarios;
	
    protected JPanel jPanelPaginacionAntiguedadesInventarios;
    protected JPanel jPanelParametrosReportesAntiguedadesInventarios;
	protected JPanel jPanelParametrosReportesAccionesAntiguedadesInventarios;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AntiguedadesInventarios;
	protected JPanel jPanelParametrosAuxiliar2AntiguedadesInventarios;
	protected JPanel jPanelParametrosAuxiliar3AntiguedadesInventarios;
	protected JPanel jPanelParametrosAuxiliar4AntiguedadesInventarios;
	//protected JPanel jPanelParametrosAuxiliar5AntiguedadesInventarios;
	
	
	
	//protected JPanel jPanelReporteDinamicoAntiguedadesInventarios;
	//protected JPanel jPanelImportacionAntiguedadesInventarios;
	
	
	public JTable jTableDatosAntiguedadesInventarios;
	
	
	
	//public JTable jTableDatosAntiguedadesInventariosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAntiguedadesInventarios;
	protected JButton jButtonDuplicarAntiguedadesInventarios;
	protected JButton jButtonCopiarAntiguedadesInventarios;
	protected JButton jButtonVerFormAntiguedadesInventarios;
	protected JButton jButtonNuevoRelacionesAntiguedadesInventarios;
	protected JButton jButtonModificarAntiguedadesInventarios;
	
    protected JButton jButtonGuardarCambiosTablaAntiguedadesInventarios;
	protected JButton jButtonCerrarAntiguedadesInventarios;
	
	
	protected JButton jButtonRecargarInformacionAntiguedadesInventarios;
	protected JButton jButtonProcesarInformacionAntiguedadesInventarios;
	
	
	protected JButton jButtonAnterioresAntiguedadesInventarios;
	protected JButton jButtonSiguientesAntiguedadesInventarios;
	protected JButton jButtonNuevoGuardarCambiosAntiguedadesInventarios;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAntiguedadesInventarios;
	//protected JButton jButtonCerrarReporteDinamicoAntiguedadesInventarios;
	//protected JButton jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios;	
	
	
	
	//protected JButton jButtonAbrirImportacionAntiguedadesInventarios;
	//protected JButton jButtonGenerarImportacionAntiguedadesInventarios;
	//protected JButton jButtonCerrarImportacionAntiguedadesInventarios;
	//protected JFileChooser jFileChooserImportacionAntiguedadesInventarios;
	//protected File fileImportacionAntiguedadesInventarios;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAntiguedadesInventarios;
	protected JButton jButtonDuplicarToolBarAntiguedadesInventarios;
	protected JButton jButtonNuevoRelacionesToolBarAntiguedadesInventarios;
	
	
	public JButton jButtonGuardarCambiosToolBarAntiguedadesInventarios;
	protected JButton jButtonCopiarToolBarAntiguedadesInventarios;
	protected JButton jButtonVerFormToolBarAntiguedadesInventarios;
	public JButton jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios;
	protected JButton jButtonMostrarOcultarTablaToolBarAntiguedadesInventarios;
	protected JButton jButtonCerrarToolBarAntiguedadesInventarios;
	
	protected JButton jButtonRecargarInformacionToolBarAntiguedadesInventarios;
	protected JButton jButtonProcesarInformacionToolBarAntiguedadesInventarios;
	protected JButton jButtonAnterioresToolBarAntiguedadesInventarios;
	protected JButton jButtonSiguientesToolBarAntiguedadesInventarios;
	protected JButton jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios;
	protected JButton jButtonAbrirOrderByToolBarAntiguedadesInventarios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAntiguedadesInventarios;
	protected JMenuItem jMenuItemDuplicarAntiguedadesInventarios;
	protected JMenuItem jMenuItemNuevoRelacionesAntiguedadesInventarios;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAntiguedadesInventarios;
	protected JMenuItem jMenuItemCopiarAntiguedadesInventarios;
	protected JMenuItem jMenuItemVerFormAntiguedadesInventarios;
	protected JMenuItem jMenuItemGuardarCambiosTablaAntiguedadesInventarios;
	protected JMenuItem jMenuItemCerrarAntiguedadesInventarios;
	protected JMenuItem jMenuItemDetalleCerrarAntiguedadesInventarios;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAntiguedadesInventarios;
	protected JMenuItem jMenuItemDetalleMostarOcultarAntiguedadesInventarios;
	
	protected JMenuItem jMenuItemRecargarInformacionAntiguedadesInventarios;
	protected JMenuItem jMenuItemProcesarInformacionAntiguedadesInventarios;
	protected JMenuItem jMenuItemAnterioresAntiguedadesInventarios;
	protected JMenuItem jMenuItemSiguientesAntiguedadesInventarios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAntiguedadesInventarios;
	protected JMenuItem jMenuItemAbrirOrderByAntiguedadesInventarios;
	protected JMenuItem jMenuItemMostrarOcultarAntiguedadesInventarios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAntiguedadesInventarios;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAntiguedadesInventarios;
	protected JCheckBox jCheckBoxSeleccionadosAntiguedadesInventarios;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAntiguedadesInventarios;
	protected JCheckBox jCheckBoxConGraficoReporteAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAntiguedadesInventarios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAntiguedadesInventarios;
	protected JTextField jTextFieldValorCampoGeneralAntiguedadesInventarios;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAntiguedadesInventarios;
	//public JList<Reporte> jListColumnasSelectReporteAntiguedadesInventarios;
	//public JScrollPane jScrollColumnasSelectReporteAntiguedadesInventarios;
	
	//public JLabel jLabelRelacionesSelectReporteAntiguedadesInventarios;
	//public JList<Reporte> jListRelacionesSelectReporteAntiguedadesInventarios;
	//public JScrollPane jScrollRelacionesSelectReporteAntiguedadesInventarios;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAntiguedadesInventarios;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAntiguedadesInventarios;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios;
	//public JLabel jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios;
	
		
	//public JLabel jLabelArchivoImportacionAntiguedadesInventarios;	
	//public JLabel jLabelPathArchivoImportacionAntiguedadesInventarios;
	//protected JTextField jTextFieldPathArchivoImportacionAntiguedadesInventarios;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAntiguedadesInventarios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAntiguedadesInventarios;
	
	//public JLabel jLabelColumnaCategoriaValorAntiguedadesInventarios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAntiguedadesInventarios;
	
	//public JLabel jLabelColumnasValoresGraficoAntiguedadesInventarios;
	//public JList<Reporte> jListColumnasValoresGraficoAntiguedadesInventarios;
	//public JScrollPane jScrollColumnasValoresGraficoAntiguedadesInventarios;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAntiguedadesInventarios;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAntiguedadesInventarios;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAntiguedadesInventarios;
	public JPanel jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	
	public JPanel jPanelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JLabel jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios;
	public JButton jButtonfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventariosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AntiguedadesInventariosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAntiguedadesInventarios)	{
		this.jButtonRecargarInformacionAntiguedadesInventarios = jButtonRecargarInformacionAntiguedadesInventarios;
	}
	
	public JButton getjButtonProcesarInformacionAntiguedadesInventarios() {
		return this.jButtonProcesarInformacionAntiguedadesInventarios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAntiguedadesInventarios)	{
		this.jButtonProcesarInformacionAntiguedadesInventarios = jButtonProcesarInformacionAntiguedadesInventarios;
	}
	
	
	public JButton getjButtonRecargarInformacionAntiguedadesInventarios() {
		return this.jButtonRecargarInformacionAntiguedadesInventarios;
	}
	
	
	public List<AntiguedadesInventarios> getantiguedadesinventarioss() {
		return this.antiguedadesinventarioss;
	}

	public void setantiguedadesinventarioss(List<AntiguedadesInventarios> antiguedadesinventarioss) {
		this.antiguedadesinventarioss = antiguedadesinventarioss;
	}
	
	public List<AntiguedadesInventarios> getantiguedadesinventariossAux() {
		return this.antiguedadesinventariossAux;
	}

	public void setantiguedadesinventariossAux(List<AntiguedadesInventarios> antiguedadesinventariossAux) {
		this.antiguedadesinventariossAux = antiguedadesinventariossAux;
	}
	
	public List<AntiguedadesInventarios> getantiguedadesinventariossEliminados() {
		return this.antiguedadesinventariossEliminados;
	}

	public void setAntiguedadesInventariossEliminados(List<AntiguedadesInventarios> antiguedadesinventariossEliminados) {
		this.antiguedadesinventariossEliminados = antiguedadesinventariossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAntiguedadesInventarios() {
		return jComboBoxTiposSeleccionarAntiguedadesInventarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAntiguedadesInventarios(
			JComboBox jComboBoxTiposSeleccionarAntiguedadesInventarios) {
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios = jComboBoxTiposSeleccionarAntiguedadesInventarios;
	}
	
	public void setBorderResaltarTiposSeleccionarAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAntiguedadesInventarios() {
		return jTextFieldValorCampoGeneralAntiguedadesInventarios;
	}

	public void setjTextFieldValorCampoGeneralAntiguedadesInventarios(
			JTextField jTextFieldValorCampoGeneralAntiguedadesInventarios) {
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios = jTextFieldValorCampoGeneralAntiguedadesInventarios;
	}

	public void setBorderResaltarValorCampoGeneralAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAntiguedadesInventarios() {
		return this.jCheckBoxSeleccionarTodosAntiguedadesInventarios;
	}

	public void setjCheckBoxSeleccionarTodosAntiguedadesInventarios(
			JCheckBox jCheckBoxSeleccionarTodosAntiguedadesInventarios) {
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios = jCheckBoxSeleccionarTodosAntiguedadesInventarios;
	}

	public void setBorderResaltarSeleccionarTodosAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAntiguedadesInventarios() {
		return this.jCheckBoxSeleccionadosAntiguedadesInventarios;
	}

	public void setjCheckBoxSeleccionadosAntiguedadesInventarios(
			JCheckBox jCheckBoxSeleccionadosAntiguedadesInventarios) {
		this.jCheckBoxSeleccionadosAntiguedadesInventarios = jCheckBoxSeleccionadosAntiguedadesInventarios;
	}
	
	public void setBorderResaltarSeleccionadosAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAntiguedadesInventarios() {
		return this.jComboBoxTiposArchivosReportesAntiguedadesInventarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAntiguedadesInventarios(
			JComboBox jComboBoxTiposArchivosReportesAntiguedadesInventarios) {
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios = jComboBoxTiposArchivosReportesAntiguedadesInventarios;
	}

	public void setBorderResaltarTiposArchivosReportesAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAntiguedadesInventarios() {
		return this.jComboBoxTiposReportesAntiguedadesInventarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAntiguedadesInventarios(
			JComboBox jComboBoxTiposReportesAntiguedadesInventarios) {
		this.jComboBoxTiposReportesAntiguedadesInventarios = jComboBoxTiposReportesAntiguedadesInventarios;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAntiguedadesInventarios() {
	//	return jComboBoxTiposReportesDinamicoAntiguedadesInventarios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAntiguedadesInventarios(
	//		JComboBox jComboBoxTiposReportesDinamicoAntiguedadesInventarios) {
	//	this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios = jComboBoxTiposReportesDinamicoAntiguedadesInventarios;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios() {
	//	return jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios = jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios;
	//}
	
	public void setBorderResaltarTiposReportesAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAntiguedadesInventarios() {
		return this.jComboBoxTiposGraficosReportesAntiguedadesInventarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAntiguedadesInventarios(
			JComboBox jComboBoxTiposGraficosReportesAntiguedadesInventarios) {
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios = jComboBoxTiposGraficosReportesAntiguedadesInventarios;
	}
	
	public void setBorderResaltarTiposGraficosReportesAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAntiguedadesInventarios() {
		return this.jComboBoxTiposPaginacionAntiguedadesInventarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAntiguedadesInventarios(
			JComboBox jComboBoxTiposPaginacionAntiguedadesInventarios) {
		this.jComboBoxTiposPaginacionAntiguedadesInventarios = jComboBoxTiposPaginacionAntiguedadesInventarios;
	}
	
	public void setBorderResaltarTiposPaginacionAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAntiguedadesInventarios() {
		return this.jComboBoxTiposRelacionesAntiguedadesInventarios;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAntiguedadesInventarios() {
		return this.jComboBoxTiposAccionesAntiguedadesInventarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAntiguedadesInventarios(
			JComboBox jComboBoxTiposRelacionesAntiguedadesInventarios) {
		this.jComboBoxTiposRelacionesAntiguedadesInventarios = jComboBoxTiposRelacionesAntiguedadesInventarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAntiguedadesInventarios(
			JComboBox jComboBoxTiposAccionesAntiguedadesInventarios) {
		this.jComboBoxTiposAccionesAntiguedadesInventarios = jComboBoxTiposAccionesAntiguedadesInventarios;
	}
	
	public void setBorderResaltarTiposRelacionesAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAntiguedadesInventarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAntiguedadesInventarios .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAntiguedadesInventarios() {
	//	return jCheckBoxConGraficoDinamicoAntiguedadesInventarios;
	//}

	//public void setjCheckBoxConGraficoDinamicoAntiguedadesInventarios(
	//		JCheckBox jCheckBoxConGraficoDinamicoAntiguedadesInventarios) {
	//	this.jCheckBoxConGraficoDinamicoAntiguedadesInventarios = jCheckBoxConGraficoDinamicoAntiguedadesInventarios;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAntiguedadesInventarios() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAntiguedadesInventarios.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAntiguedadesInventarios .setBorder(borderResaltar);		
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
		this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
		
		this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.antiguedadesinventariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AntiguedadesInventariosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Antiguedades Inventarios MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
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
		
		AntiguedadesInventariosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAntiguedadesInventarios= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"nuevo","nuevo","Nuevo"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"duplicar","duplicar","Duplicar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"copiar","copiar","Copiar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"ver_form","ver_form","Ver"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"recargar","recargar","Buscar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,
							"cerrar","cerrar","Salir"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAntiguedadesInventarios;
			
				this.jButtonProcesarInformacionToolBarAntiguedadesInventarios=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAntiguedadesInventarios;
				
		//protected JButton jButtonModificarToolBarAntiguedadesInventarios;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAntiguedadesInventarios=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAntiguedadesInventarios=new JMenuMe("General");
		this.jmenuArchivoAntiguedadesInventarios=new JMenuMe("Archivo");
		this.jmenuAccionesAntiguedadesInventarios=new JMenuMe("Acciones");
		this.jmenuDatosAntiguedadesInventarios=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAntiguedadesInventarios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAntiguedadesInventarios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAntiguedadesInventarios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAntiguedadesInventarios= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAntiguedadesInventarios.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAntiguedadesInventarios,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAntiguedadesInventarios= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAntiguedadesInventarios.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAntiguedadesInventarios,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAntiguedadesInventarios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAntiguedadesInventarios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAntiguedadesInventarios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAntiguedadesInventarios= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAntiguedadesInventarios.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAntiguedadesInventarios,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAntiguedadesInventarios= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAntiguedadesInventarios.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAntiguedadesInventarios,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAntiguedadesInventarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAntiguedadesInventarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAntiguedadesInventarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAntiguedadesInventarios= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAntiguedadesInventarios.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAntiguedadesInventarios,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAntiguedadesInventarios= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAntiguedadesInventarios.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAntiguedadesInventarios,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAntiguedadesInventarios= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAntiguedadesInventarios.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAntiguedadesInventarios,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAntiguedadesInventarios= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAntiguedadesInventarios.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAntiguedadesInventarios,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAntiguedadesInventarios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAntiguedadesInventarios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAntiguedadesInventarios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAntiguedadesInventarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAntiguedadesInventarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAntiguedadesInventarios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAntiguedadesInventarios.add(this.jMenuItemCerrarAntiguedadesInventarios);
			
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemNuevoAntiguedadesInventarios);
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios);
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemNuevoRelacionesAntiguedadesInventarios);
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios);		
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemDuplicarAntiguedadesInventarios);		
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemCopiarAntiguedadesInventarios);		
			this.jmenuAccionesAntiguedadesInventarios.add(this.jMenuItemVerFormAntiguedadesInventarios);		
			
			this.jmenuDatosAntiguedadesInventarios.add(this.jMenuItemRecargarInformacionAntiguedadesInventarios);				
			this.jmenuDatosAntiguedadesInventarios.add(this.jMenuItemAnterioresAntiguedadesInventarios);				
			this.jmenuDatosAntiguedadesInventarios.add(this.jMenuItemSiguientesAntiguedadesInventarios);				
			this.jmenuDatosAntiguedadesInventarios.add(this.jMenuItemAbrirOrderByAntiguedadesInventarios);				
			this.jmenuDatosAntiguedadesInventarios.add(this.jMenuItemMostrarOcultarAntiguedadesInventarios);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAntiguedadesInventarios.add(this.jMenuItemGuardarCambiosAntiguedadesInventarios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAntiguedadesInventarios.add(this.jmenuArchivoAntiguedadesInventarios);		
			this.jmenuBarAntiguedadesInventarios.add(this.jmenuAccionesAntiguedadesInventarios);		
			this.jmenuBarAntiguedadesInventarios.add(this.jmenuDatosAntiguedadesInventarios);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAntiguedadesInventarios);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAntiguedadesInventarios() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JButtonMe();
		this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Buscar");
		this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Bodega :");
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Linea :");
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Linea");
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios = new JLabelMe();
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText("Fecha Ultima Venta Hasta :");
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setToolTipText("Fecha Ultima Venta Hasta");
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasAntiguedadesInventarios=new JTabbedPane();


		this.jTabbedPaneBusquedasAntiguedadesInventarios.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasAntiguedadesInventarios.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasAntiguedadesInventarios.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAntiguedadesInventarios = new AntiguedadesInventariosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Antiguedades Inventarios DATOS");
			this.jInternalFrameDetalleFormAntiguedadesInventarios = new AntiguedadesInventariosDetalleFormJInternalFrame(jDesktopPane,this.antiguedadesinventariosSessionBean.getConGuardarRelaciones(),this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAntiguedadesInventarios = null;//new AntiguedadesInventariosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAntiguedadesInventarios= new GridBagLayout();
		
		
		this.jTableDatosAntiguedadesInventarios = new JTableMe();      
		
		String sToolTipAntiguedadesInventarios="";
		sToolTipAntiguedadesInventarios=AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAntiguedadesInventarios+="(Inventario.AntiguedadesInventarios)";
		}
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			sToolTipAntiguedadesInventarios+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAntiguedadesInventarios.setToolTipText(sToolTipAntiguedadesInventarios);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAntiguedadesInventarios);
		this.jTableDatosAntiguedadesInventarios.setAutoCreateRowSorter(true);
		this.jTableDatosAntiguedadesInventarios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAntiguedadesInventarios.setRowSelectionAllowed(true);
		this.jTableDatosAntiguedadesInventarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAntiguedadesInventarios = new JButtonMe();
		this.jButtonDuplicarAntiguedadesInventarios = new JButtonMe();
		this.jButtonCopiarAntiguedadesInventarios = new JButtonMe();
		this.jButtonVerFormAntiguedadesInventarios = new JButtonMe();
		this.jButtonNuevoRelacionesAntiguedadesInventarios = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios = new JButtonMe();
		this.jButtonCerrarAntiguedadesInventarios = new JButtonMe();
		
		this.jScrollPanelDatosAntiguedadesInventarios = new JScrollPane();   
        this.jScrollPanelDatosGeneralAntiguedadesInventarios = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Antiguedades Inventarios";
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses" + this.sPath));
		} else {
			this.jScrollPanelDatosAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAntiguedadesInventarios.setToolTipText("Acciones");
        this.jPanelAccionesAntiguedadesInventarios.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAntiguedadesInventarios=new ReporteDinamicoJInternalFrame(AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAntiguedadesInventarios();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAntiguedadesInventarios=new ImportacionJInternalFrame(AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAntiguedadesInventarios();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAntiguedadesInventarios = new JButtonMe();
		
		this.jButtonAbrirOrderByAntiguedadesInventarios.setText("Orden");
		this.jButtonAbrirOrderByAntiguedadesInventarios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAntiguedadesInventarios,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAntiguedadesInventarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAntiguedadesInventarios,false,this);
			
			//this.cargarOrderByAntiguedadesInventarios(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAntiguedadesInventarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAntiguedadesInventarios,true,this);
			
			//this.cargarOrderByAntiguedadesInventarios(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAntiguedadesInventarios.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosAntiguedadesInventarios.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosAntiguedadesInventarios.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosAntiguedadesInventarios.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAntiguedadesInventarios.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAntiguedadesInventarios.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAntiguedadesInventarios.setText("Nuevo");
		this.jButtonDuplicarAntiguedadesInventarios.setText("Duplicar");
		this.jButtonCopiarAntiguedadesInventarios.setText("Copiar");
		this.jButtonVerFormAntiguedadesInventarios.setText("Ver");
		this.jButtonNuevoRelacionesAntiguedadesInventarios.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setText("Guardar");
		this.jButtonCerrarAntiguedadesInventarios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAntiguedadesInventarios,"nuevo_button","Nuevo",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAntiguedadesInventarios,"duplicar_button","Duplicar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAntiguedadesInventarios,"copiar_button","Copiar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAntiguedadesInventarios,"ver_form","Ver",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAntiguedadesInventarios,"nuevorelaciones_button","Nuevo Rel",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAntiguedadesInventarios,"guardarcambiostabla_button","Guardar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAntiguedadesInventarios,"cerrar_button","Salir",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAntiguedadesInventarios.setToolTipText("Nuevo"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAntiguedadesInventarios.setToolTipText("Duplicar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAntiguedadesInventarios.setToolTipText("Copiar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAntiguedadesInventarios.setToolTipText("Ver"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAntiguedadesInventarios.setToolTipText("Nuevo Rel"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setToolTipText("Guardar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAntiguedadesInventarios.setToolTipText("Salir"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAntiguedadesInventarios";
		inputMap = this.jButtonNuevoAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAntiguedadesInventarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAntiguedadesInventarios"));
		
		//DUPLICAR
		sMapKey = "DuplicarAntiguedadesInventarios";
		inputMap = this.jButtonDuplicarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAntiguedadesInventarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAntiguedadesInventarios"));
		
		//COPIAR
		sMapKey = "CopiarAntiguedadesInventarios";
		inputMap = this.jButtonCopiarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAntiguedadesInventarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAntiguedadesInventarios"));
		
		//VEr FORM
		sMapKey = "VerFormAntiguedadesInventarios";
		inputMap = this.jButtonVerFormAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAntiguedadesInventarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAntiguedadesInventarios"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAntiguedadesInventarios";
		inputMap = this.jButtonNuevoRelacionesAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAntiguedadesInventarios"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAntiguedadesInventarios";
		inputMap = this.jButtonModificarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAntiguedadesInventarios"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAntiguedadesInventarios";
		inputMap = this.jButtonCerrarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAntiguedadesInventarios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAntiguedadesInventarios";
		inputMap = this.jButtonGuardarCambiosTablaAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAntiguedadesInventarios"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAntiguedadesInventarios.setName("jPanelParametrosReportesAntiguedadesInventarios"); 
		
		this.jPanelParametrosReportesAccionesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAntiguedadesInventarios.setName("jPanelParametrosReportesAccionesAntiguedadesInventarios"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAntiguedadesInventarios = new JButtonMe();
		this.jButtonRecargarInformacionAntiguedadesInventarios.setText("Buscar");
		this.jButtonRecargarInformacionAntiguedadesInventarios.setToolTipText("Buscar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAntiguedadesInventarios,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionAntiguedadesInventarios.setVisible(false);
		
		
		this.jButtonProcesarInformacionAntiguedadesInventarios = new JButtonMe();
		this.jButtonProcesarInformacionAntiguedadesInventarios.setText("Procesar");
		this.jButtonProcesarInformacionAntiguedadesInventarios.setToolTipText("Procesar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAntiguedadesInventarios.setVisible(false);
			
		this.jButtonProcesarInformacionAntiguedadesInventarios.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAntiguedadesInventarios.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAntiguedadesInventarios.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setText("TIPO");       
		this.jComboBoxTiposReportesAntiguedadesInventarios.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAntiguedadesInventarios.setText("Paginacion");
		this.jComboBoxTiposPaginacionAntiguedadesInventarios.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAntiguedadesInventarios.setText("Accion");
		this.jComboBoxTiposRelacionesAntiguedadesInventarios.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAntiguedadesInventarios.setText("Accion");
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setText("Accion");
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAntiguedadesInventarios = new JLabelMe();
		
		this.jLabelAccionesAntiguedadesInventarios.setText("Acciones");		
		this.jLabelAccionesAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAntiguedadesInventarios = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAntiguedadesInventarios.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAntiguedadesInventarios.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setText("Graf.");
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAntiguedadesInventarios = new JButtonMe();
		//this.jButtonAnterioresAntiguedadesInventarios.setText("<<");
        this.jButtonAnterioresAntiguedadesInventarios.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAntiguedadesInventarios,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAntiguedadesInventarios = new JButtonMe();
		//this.jButtonSiguientesAntiguedadesInventarios.setText(">>");
        this.jButtonSiguientesAntiguedadesInventarios.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAntiguedadesInventarios,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAntiguedadesInventarios = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.setText("Nue");
        this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAntiguedadesInventarios,"nuevoguardarcambios_button","Nue",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAntiguedadesInventarios";
		inputMap = this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAntiguedadesInventarios"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAntiguedadesInventarios";
		inputMap = this.jButtonRecargarInformacionAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAntiguedadesInventarios"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAntiguedadesInventarios";
		inputMap = this.jButtonSiguientesAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAntiguedadesInventarios"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAntiguedadesInventarios";
		inputMap = this.jButtonAnterioresAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAntiguedadesInventarios"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAntiguedadesInventarios();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAntiguedadesInventarios.setMinimumSize(new Dimension(this.getWidth(),AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAntiguedadesInventarios.setMaximumSize(new Dimension(this.getWidth(),AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAntiguedadesInventarios.setPreferredSize(new Dimension(this.getWidth(),AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AntiguedadesInventariosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAntiguedadesInventarios = new GridBagLayout();

			this.jPanelPaginacionAntiguedadesInventarios.setLayout(gridaBagLayoutPaginacionAntiguedadesInventarios);						
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonAnterioresAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					
						
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
			
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonNuevoGuardarCambiosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
						
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonSiguientesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonNuevoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
						
			
			
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
				this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
				this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonGuardarCambiosTablaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			}
			
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonDuplicarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonCopiarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonVerFormAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 1;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAntiguedadesInventarios.add(this.jButtonCerrarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
		
		
		this.jButtonRecargarInformacionAntiguedadesInventarios.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAntiguedadesInventarios.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAntiguedadesInventarios.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAntiguedadesInventarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAntiguedadesInventarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAntiguedadesInventarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAntiguedadesInventarios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAntiguedadesInventarios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAntiguedadesInventarios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAntiguedadesInventarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAntiguedadesInventarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAntiguedadesInventarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAntiguedadesInventarios.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAntiguedadesInventarios.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAntiguedadesInventarios.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAntiguedadesInventarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAntiguedadesInventarios = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AntiguedadesInventarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AntiguedadesInventarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AntiguedadesInventarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AntiguedadesInventarios = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAntiguedadesInventarios.setLayout(gridaBagParametrosReportesAntiguedadesInventarios);
			this.jPanelParametrosReportesAccionesAntiguedadesInventarios.setLayout(gridaBagParametrosReportesAccionesAntiguedadesInventarios);
			
			
			this.jPanelParametrosAuxiliar1AntiguedadesInventarios.setLayout(gridaBagParametrosAuxiliar1AntiguedadesInventarios);
			this.jPanelParametrosAuxiliar2AntiguedadesInventarios.setLayout(gridaBagParametrosAuxiliar2AntiguedadesInventarios);
			this.jPanelParametrosAuxiliar3AntiguedadesInventarios.setLayout(gridaBagParametrosAuxiliar3AntiguedadesInventarios);
			this.jPanelParametrosAuxiliar4AntiguedadesInventarios.setLayout(gridaBagParametrosAuxiliar4AntiguedadesInventarios);
			//this.jPanelParametrosAuxiliar5AntiguedadesInventarios.setLayout(gridaBagParametrosAuxiliar2AntiguedadesInventarios);			
			
			
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jButtonRecargarInformacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AntiguedadesInventarios.add(this.jComboBoxTiposPaginacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AntiguedadesInventarios.add(this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AntiguedadesInventarios.add(this.jComboBoxTiposArchivosReportesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jPanelParametrosAuxiliar1AntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AntiguedadesInventarios.add(this.jComboBoxTiposReportesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jPanelParametrosAuxiliar4AntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jComboBoxTiposReportesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jCheckBoxGenerarReporteAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jPanelParametrosAuxiliar2AntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jLabelAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
				this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jButtonAbrirOrderByAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jComboBoxTiposSeleccionarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
			
			
			/*
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jCheckBoxSeleccionarTodosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AntiguedadesInventarios.add(this.jCheckBoxSeleccionarTodosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);															
				
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AntiguedadesInventarios.add(this.jCheckBoxSeleccionadosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jPanelParametrosAuxiliar3AntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAntiguedadesInventarios.add(this.jComboBoxTiposAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAntiguedadesInventarios = new GridBagLayout();

			this.jScrollPanelDatosAntiguedadesInventarios.setLayout(gridaBagLayoutDatosAntiguedadesInventarios);
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
			
			this.jScrollPanelDatosAntiguedadesInventarios.add(this.jTableDatosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAntiguedadesInventarios.setViewportView(this.jTableDatosAntiguedadesInventarios);
		this.jTableDatosAntiguedadesInventarios.setFillsViewportHeight(true);
		this.jTableDatosAntiguedadesInventarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAntiguedadesInventarios= new GridBagLayout();
		this.jPanelAccionesAntiguedadesInventarios.setLayout(gridaBagLayoutAccionesAntiguedadesInventarios);
		
		
		/*	
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
			
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonNuevoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios= new GridBagLayout();
		gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.setLayout(gridaBagLayoutBusquedaAntiguedadesInventariosAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);


		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 1;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 1;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);


		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 2;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 2;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);


		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 3;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 3;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);


		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 4;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 4;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);


		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 5;
		gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jLabelfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 5;
		gridBagConstraintsAntiguedadesInventarios.gridx = 1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAntiguedadesInventarios.gridy = 6;
		gridBagConstraintsAntiguedadesInventarios.gridx =1;
		jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios.add(jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);

		jTabbedPaneBusquedasAntiguedadesInventarios.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ", jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);
		jTabbedPaneBusquedasAntiguedadesInventarios.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAntiguedadesInventarios);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();						
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;		
			//this.gridBagConstraintsAntiguedadesInventarios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAntiguedadesInventarios.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;		
		//this.gridBagConstraintsAntiguedadesInventarios.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAntiguedadesInventarios);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;		
			this.gridBagConstraintsAntiguedadesInventarios.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAntiguedadesInventarios.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);								
		
		
		/*
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		*/		
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAntiguedadesInventarios.gridx =0;
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAntiguedadesInventarios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
				
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAntiguedadesInventarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAntiguedadesInventarios = new GridBagLayout();
			this.jPanelBusquedasParametrosAntiguedadesInventarios.setLayout(gridaBagLayoutBusquedasParametrosAntiguedadesInventarios);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAntiguedadesInventarios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAntiguedadesInventarios;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAntiguedadesInventarios() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAntiguedadesInventarios = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAntiguedadesInventarios.setName("jPanelReporteDinamicoAntiguedadesInventarios"); 
		
		this.jPanelReporteDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAntiguedadesInventarios.setLayout(gridaBagLayoutReporteDinamicoAntiguedadesInventarios);
		
		
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAntiguedadesInventarios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setResizable(true);
	    this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setClosable(true);
	    this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAntiguedadesInventarios = new JLabelMe();

		this.jLabelColumnasSelectReporteAntiguedadesInventarios.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jLabelColumnasSelectReporteAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAntiguedadesInventarios = new JList<Reporte>();
		this.jListColumnasSelectReporteAntiguedadesInventarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAntiguedadesInventarios.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAntiguedadesInventarios=new JScrollPane(this.jListColumnasSelectReporteAntiguedadesInventarios);
			
			this.jScrollColumnasSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jListColumnasSelectReporteAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jScrollColumnasSelectReporteAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAntiguedadesInventarios = new JLabelMe();

		this.jLabelRelacionesSelectReporteAntiguedadesInventarios.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAntiguedadesInventarios = new JList<Reporte>();
		this.jListRelacionesSelectReporteAntiguedadesInventarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAntiguedadesInventarios.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAntiguedadesInventarios=new JScrollPane(this.jListRelacionesSelectReporteAntiguedadesInventarios);
			
			this.jScrollRelacionesSelectReporteAntiguedadesInventarios.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAntiguedadesInventarios.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAntiguedadesInventarios.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAntiguedadesInventarios = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAntiguedadesInventarios = new JComboBoxMe();
		this.jListColumnasValoresGraficoAntiguedadesInventarios = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jLabelGenerarExcelReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios.setToolTipText("Generar EXCEL"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jComboBoxTiposReportesDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jLabelTiposArchivoReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jComboBoxTiposArchivosReportesDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAntiguedadesInventarios = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAntiguedadesInventarios.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAntiguedadesInventarios,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAntiguedadesInventarios.setToolTipText("Generar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jButtonGenerarReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAntiguedadesInventarios = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAntiguedadesInventarios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAntiguedadesInventarios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAntiguedadesInventarios.setToolTipText("Cancelar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAntiguedadesInventarios.add(this.jButtonCerrarReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAntiguedadesInventarios = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios= new JScrollPane(jPanelReporteDinamicoAntiguedadesInventarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAntiguedadesInventarios);
		this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getContentPane().add(this.jScrollPanelReporteDinamicoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAntiguedadesInventarios() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAntiguedadesInventarios = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAntiguedadesInventarios.setName("jPanelImportacionAntiguedadesInventarios"); 
		
		this.jPanelImportacionAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAntiguedadesInventarios.setLayout(gridaBagLayoutImportacionAntiguedadesInventarios);
		
		
		this.jInternalFrameImportacionAntiguedadesInventarios= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAntiguedadesInventarios= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAntiguedadesInventarios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAntiguedadesInventarios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAntiguedadesInventarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAntiguedadesInventarios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAntiguedadesInventarios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAntiguedadesInventarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAntiguedadesInventarios.setResizable(true);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setClosable(true);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAntiguedadesInventarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAntiguedadesInventarios.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAntiguedadesInventarios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAntiguedadesInventarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAntiguedadesInventarios.setResizable(true);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setClosable(true);
	    this.jInternalFrameImportacionAntiguedadesInventarios.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAntiguedadesInventarios = new JLabelMe();

		this.jLabelArchivoImportacionAntiguedadesInventarios.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAntiguedadesInventarios.add(this.jLabelArchivoImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAntiguedadesInventarios = new JFileChooser();		
		this.jFileChooserImportacionAntiguedadesInventarios.setToolTipText("ESCOGER ARCHIVO"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAntiguedadesInventarios = new JButtonMe();
		this.jButtonAbrirImportacionAntiguedadesInventarios.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAntiguedadesInventarios,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAntiguedadesInventarios.setToolTipText("Generar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAntiguedadesInventarios.add(this.jButtonAbrirImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAntiguedadesInventarios = new JLabelMe();

		this.jLabelPathArchivoImportacionAntiguedadesInventarios.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAntiguedadesInventarios.add(this.jLabelPathArchivoImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAntiguedadesInventarios=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAntiguedadesInventarios.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAntiguedadesInventarios.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAntiguedadesInventarios.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAntiguedadesInventarios.add(this.jTextFieldPathArchivoImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAntiguedadesInventarios = new JButtonMe();
		this.jButtonGenerarImportacionAntiguedadesInventarios.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAntiguedadesInventarios,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAntiguedadesInventarios.setToolTipText("Generar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAntiguedadesInventarios.add(this.jButtonGenerarImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAntiguedadesInventarios = new JButtonMe();
		this.jButtonCerrarImportacionAntiguedadesInventarios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAntiguedadesInventarios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAntiguedadesInventarios.setToolTipText("Cancelar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAntiguedadesInventarios.add(this.jButtonCerrarImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAntiguedadesInventarios = new GridBagLayout();
		
		this.jScrollPanelImportacionAntiguedadesInventarios= new JScrollPane(jPanelImportacionAntiguedadesInventarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iPosYImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXImportacion;
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAntiguedadesInventarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAntiguedadesInventarios.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAntiguedadesInventarios);
		this.jInternalFrameImportacionAntiguedadesInventarios.getContentPane().add(this.jScrollPanelImportacionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAntiguedadesInventarios(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAntiguedadesInventarios = new JButtonMe();
			this.jButtonAbrirOrderByAntiguedadesInventarios.setText("Orden");
			this.jButtonAbrirOrderByAntiguedadesInventarios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAntiguedadesInventarios,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAntiguedadesInventarios";
			inputMap = this.jButtonAbrirOrderByAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAntiguedadesInventarios"));
		
		
			GridBagLayout gridaBagLayoutOrderByAntiguedadesInventarios = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAntiguedadesInventarios.setName("jPanelOrderByAntiguedadesInventarios"); 
			
			this.jPanelOrderByAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAntiguedadesInventarios.setLayout(gridaBagLayoutOrderByAntiguedadesInventarios);
			
			
			this.jTableDatosAntiguedadesInventariosOrderBy = new JTableMe();        
			this.jTableDatosAntiguedadesInventariosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAntiguedadesInventariosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAntiguedadesInventariosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAntiguedadesInventariosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAntiguedadesInventariosOrderBy.setViewportView(this.jTableDatosAntiguedadesInventariosOrderBy);
			this.jTableDatosAntiguedadesInventariosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAntiguedadesInventariosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAntiguedadesInventarios= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAntiguedadesInventarios= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAntiguedadesInventarios = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAntiguedadesInventarios= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAntiguedadesInventarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAntiguedadesInventarios.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAntiguedadesInventarios.setTitle("Orden");
			this.jInternalFrameOrderByAntiguedadesInventarios.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAntiguedadesInventarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAntiguedadesInventarios.setResizable(true);
			this.jInternalFrameOrderByAntiguedadesInventarios.setClosable(true);
			this.jInternalFrameOrderByAntiguedadesInventarios.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXOrderBy;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAntiguedadesInventarios.ipady =150;
				
			this.jPanelOrderByAntiguedadesInventarios.add(jScrollPanelDatosAntiguedadesInventariosOrderBy, this.gridBagConstraintsAntiguedadesInventarios);//this.jTableDatosAntiguedadesInventariosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAntiguedadesInventarios = new JButtonMe();
			this.jButtonCerrarOrderByAntiguedadesInventarios.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAntiguedadesInventarios,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAntiguedadesInventarios.setToolTipText("Cancelar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAntiguedadesInventarios.add(this.jButtonCerrarOrderByAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAntiguedadesInventarios = new GridBagLayout();
			
			this.jScrollPanelOrderByAntiguedadesInventarios= new JScrollPane(jPanelOrderByAntiguedadesInventarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iPosYOrderBy;
			this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXOrderBy;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAntiguedadesInventarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAntiguedadesInventarios.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAntiguedadesInventarios);
			
			this.jInternalFrameOrderByAntiguedadesInventarios.getContentPane().add(this.jScrollPanelOrderByAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
		
		} else {
			this.jButtonAbrirOrderByAntiguedadesInventarios = new JButtonMe();
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
		//	&& this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosAntiguedadesInventarios.getRowHeight();//AntiguedadesInventariosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.isSelected()) {
					iHeightTable=AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAntiguedadesInventarios.isSelected()) {
					iHeightTable=AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AntiguedadesInventariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAntiguedadesInventarios!=null && this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy()!=null) {
			//if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAntiguedadesInventarios.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAntiguedadesInventarios.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAntiguedadesInventarios.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=antiguedadesinventariosLogic.getAntiguedadesInventarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=antiguedadesinventarioss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AntiguedadesInventarios> TraerAntiguedadesInventariosBeans(List<AntiguedadesInventarios> antiguedadesinventarioss,ArrayList<Classe> classes)throws Exception {
		try {
			for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventarioss) {
					
				if(!(AntiguedadesInventariosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AntiguedadesInventariosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					antiguedadesinventarios.setsDetalleGeneralEntityReporte(AntiguedadesInventariosConstantesFunciones.getAntiguedadesInventariosDescripcion(antiguedadesinventarios));
										
						
					
						
					
				} else  {
							
					//antiguedadesinventarios.setsDetalleGeneralEntityReporte(antiguedadesinventarios.getsDetalleGeneralEntityReporte());
										
				}
				
				//antiguedadesinventariosbeans.add(antiguedadesinventariosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return antiguedadesinventarioss;
    }
	//PARA REPORTES FIN
}
