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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.inventario.util.report.ConsumosBodegasConstantesFunciones;

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
public class ConsumosBodegasJInternalFrame extends ConsumosBodegasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsumosBodegas;
	
	protected JMenuBar jmenuBarConsumosBodegas;
	
	protected JMenu jmenuConsumosBodegas;
	protected JMenu jmenuDatosConsumosBodegas;
	protected JMenu jmenuArchivoConsumosBodegas;
	protected JMenu jmenuAccionesConsumosBodegas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsumosBodegas;	
	protected GridBagConstraints gridBagConstraintsConsumosBodegas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsumosBodegasDetalleFormJInternalFrame jInternalFrameDetalleFormConsumosBodegas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsumosBodegas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsumosBodegas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ConsumosBodegasSessionBean consumosbodegasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConsumosBodegas> consumosbodegass;		
	public List<ConsumosBodegas> consumosbodegassEliminados;	
	public List<ConsumosBodegas> consumosbodegassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsumosBodegas;		
	protected JButton jButtonAbrirOrderByConsumosBodegas;
	
	
	//protected JPanel jPanelOrderByConsumosBodegas;
	//public JScrollPane jScrollPanelOrderByConsumosBodegas;	
	//protected JButton jButtonCerrarOrderByConsumosBodegas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsumosBodegasLogic consumosbodegasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsumosBodegas;
	public JScrollPane jScrollPanelDatosEdicionConsumosBodegas;
	public JScrollPane jScrollPanelDatosGeneralConsumosBodegas;
    
	
	
	//public JScrollPane jScrollPanelDatosConsumosBodegasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsumosBodegas;
	//public JScrollPane jScrollPanelImportacionConsumosBodegas;
	
	
	
	protected JPanel jPanelAccionesConsumosBodegas;
	
    protected JPanel jPanelPaginacionConsumosBodegas;
    protected JPanel jPanelParametrosReportesConsumosBodegas;
	protected JPanel jPanelParametrosReportesAccionesConsumosBodegas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConsumosBodegas;
	protected JPanel jPanelParametrosAuxiliar2ConsumosBodegas;
	protected JPanel jPanelParametrosAuxiliar3ConsumosBodegas;
	protected JPanel jPanelParametrosAuxiliar4ConsumosBodegas;
	//protected JPanel jPanelParametrosAuxiliar5ConsumosBodegas;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsumosBodegas;
	//protected JPanel jPanelImportacionConsumosBodegas;
	
	
	public JTable jTableDatosConsumosBodegas;
	
	
	
	//public JTable jTableDatosConsumosBodegasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsumosBodegas;
	protected JButton jButtonDuplicarConsumosBodegas;
	protected JButton jButtonCopiarConsumosBodegas;
	protected JButton jButtonVerFormConsumosBodegas;
	protected JButton jButtonNuevoRelacionesConsumosBodegas;
	protected JButton jButtonModificarConsumosBodegas;
	
    protected JButton jButtonGuardarCambiosTablaConsumosBodegas;
	protected JButton jButtonCerrarConsumosBodegas;
	
	
	protected JButton jButtonRecargarInformacionConsumosBodegas;
	protected JButton jButtonProcesarInformacionConsumosBodegas;
	
	
	protected JButton jButtonAnterioresConsumosBodegas;
	protected JButton jButtonSiguientesConsumosBodegas;
	protected JButton jButtonNuevoGuardarCambiosConsumosBodegas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsumosBodegas;
	//protected JButton jButtonCerrarReporteDinamicoConsumosBodegas;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsumosBodegas;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsumosBodegas;
	//protected JButton jButtonGenerarImportacionConsumosBodegas;
	//protected JButton jButtonCerrarImportacionConsumosBodegas;
	//protected JFileChooser jFileChooserImportacionConsumosBodegas;
	//protected File fileImportacionConsumosBodegas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsumosBodegas;
	protected JButton jButtonDuplicarToolBarConsumosBodegas;
	protected JButton jButtonNuevoRelacionesToolBarConsumosBodegas;
	
	
	public JButton jButtonGuardarCambiosToolBarConsumosBodegas;
	protected JButton jButtonCopiarToolBarConsumosBodegas;
	protected JButton jButtonVerFormToolBarConsumosBodegas;
	public JButton jButtonGuardarCambiosTablaToolBarConsumosBodegas;
	protected JButton jButtonMostrarOcultarTablaToolBarConsumosBodegas;
	protected JButton jButtonCerrarToolBarConsumosBodegas;
	
	protected JButton jButtonRecargarInformacionToolBarConsumosBodegas;
	protected JButton jButtonProcesarInformacionToolBarConsumosBodegas;
	protected JButton jButtonAnterioresToolBarConsumosBodegas;
	protected JButton jButtonSiguientesToolBarConsumosBodegas;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsumosBodegas;
	protected JButton jButtonAbrirOrderByToolBarConsumosBodegas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsumosBodegas;
	protected JMenuItem jMenuItemDuplicarConsumosBodegas;
	protected JMenuItem jMenuItemNuevoRelacionesConsumosBodegas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsumosBodegas;
	protected JMenuItem jMenuItemCopiarConsumosBodegas;
	protected JMenuItem jMenuItemVerFormConsumosBodegas;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsumosBodegas;
	protected JMenuItem jMenuItemCerrarConsumosBodegas;
	protected JMenuItem jMenuItemDetalleCerrarConsumosBodegas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsumosBodegas;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsumosBodegas;
	
	protected JMenuItem jMenuItemRecargarInformacionConsumosBodegas;
	protected JMenuItem jMenuItemProcesarInformacionConsumosBodegas;
	protected JMenuItem jMenuItemAnterioresConsumosBodegas;
	protected JMenuItem jMenuItemSiguientesConsumosBodegas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsumosBodegas;
	protected JMenuItem jMenuItemAbrirOrderByConsumosBodegas;
	protected JMenuItem jMenuItemMostrarOcultarConsumosBodegas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsumosBodegas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsumosBodegas;
	protected JCheckBox jCheckBoxSeleccionadosConsumosBodegas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsumosBodegas;
	protected JCheckBox jCheckBoxConGraficoReporteConsumosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsumosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsumosBodegas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsumosBodegas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsumosBodegas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsumosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsumosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsumosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsumosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsumosBodegas;
	protected JTextField jTextFieldValorCampoGeneralConsumosBodegas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsumosBodegas;
	//public JList<Reporte> jListColumnasSelectReporteConsumosBodegas;
	//public JScrollPane jScrollColumnasSelectReporteConsumosBodegas;
	
	//public JLabel jLabelRelacionesSelectReporteConsumosBodegas;
	//public JList<Reporte> jListRelacionesSelectReporteConsumosBodegas;
	//public JScrollPane jScrollRelacionesSelectReporteConsumosBodegas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsumosBodegas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsumosBodegas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsumosBodegas;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsumosBodegas;
	
		
	//public JLabel jLabelArchivoImportacionConsumosBodegas;	
	//public JLabel jLabelPathArchivoImportacionConsumosBodegas;
	//protected JTextField jTextFieldPathArchivoImportacionConsumosBodegas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsumosBodegas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsumosBodegas;
	
	//public JLabel jLabelColumnaCategoriaValorConsumosBodegas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsumosBodegas;
	
	//public JLabel jLabelColumnasValoresGraficoConsumosBodegas;
	//public JList<Reporte> jListColumnasValoresGraficoConsumosBodegas;
	//public JScrollPane jScrollColumnasValoresGraficoConsumosBodegas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsumosBodegas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsumosBodegas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsumosBodegas;
	public JPanel jPanelBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonBusquedaConsumosBodegasConsumosBodegas;
	
	public JPanel jPanelid_transaccionBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonid_transaccionBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaConsumosBodegasConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonid_lineaBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConsumosBodegasConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonid_linea_grupoBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConsumosBodegasConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConsumosBodegasConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonid_linea_marcaBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConsumosBodegasConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas;
	public JLabel jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas;
	public JButton jButtonfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsumosBodegasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsumosBodegas)	{
		this.jButtonRecargarInformacionConsumosBodegas = jButtonRecargarInformacionConsumosBodegas;
	}
	
	public JButton getjButtonProcesarInformacionConsumosBodegas() {
		return this.jButtonProcesarInformacionConsumosBodegas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsumosBodegas)	{
		this.jButtonProcesarInformacionConsumosBodegas = jButtonProcesarInformacionConsumosBodegas;
	}
	
	
	public JButton getjButtonRecargarInformacionConsumosBodegas() {
		return this.jButtonRecargarInformacionConsumosBodegas;
	}
	
	
	public List<ConsumosBodegas> getconsumosbodegass() {
		return this.consumosbodegass;
	}

	public void setconsumosbodegass(List<ConsumosBodegas> consumosbodegass) {
		this.consumosbodegass = consumosbodegass;
	}
	
	public List<ConsumosBodegas> getconsumosbodegassAux() {
		return this.consumosbodegassAux;
	}

	public void setconsumosbodegassAux(List<ConsumosBodegas> consumosbodegassAux) {
		this.consumosbodegassAux = consumosbodegassAux;
	}
	
	public List<ConsumosBodegas> getconsumosbodegassEliminados() {
		return this.consumosbodegassEliminados;
	}

	public void setConsumosBodegassEliminados(List<ConsumosBodegas> consumosbodegassEliminados) {
		this.consumosbodegassEliminados = consumosbodegassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsumosBodegas() {
		return jComboBoxTiposSeleccionarConsumosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsumosBodegas(
			JComboBox jComboBoxTiposSeleccionarConsumosBodegas) {
		this.jComboBoxTiposSeleccionarConsumosBodegas = jComboBoxTiposSeleccionarConsumosBodegas;
	}
	
	public void setBorderResaltarTiposSeleccionarConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsumosBodegas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsumosBodegas() {
		return jTextFieldValorCampoGeneralConsumosBodegas;
	}

	public void setjTextFieldValorCampoGeneralConsumosBodegas(
			JTextField jTextFieldValorCampoGeneralConsumosBodegas) {
		this.jTextFieldValorCampoGeneralConsumosBodegas = jTextFieldValorCampoGeneralConsumosBodegas;
	}

	public void setBorderResaltarValorCampoGeneralConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsumosBodegas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsumosBodegas() {
		return this.jCheckBoxSeleccionarTodosConsumosBodegas;
	}

	public void setjCheckBoxSeleccionarTodosConsumosBodegas(
			JCheckBox jCheckBoxSeleccionarTodosConsumosBodegas) {
		this.jCheckBoxSeleccionarTodosConsumosBodegas = jCheckBoxSeleccionarTodosConsumosBodegas;
	}

	public void setBorderResaltarSeleccionarTodosConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsumosBodegas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsumosBodegas() {
		return this.jCheckBoxSeleccionadosConsumosBodegas;
	}

	public void setjCheckBoxSeleccionadosConsumosBodegas(
			JCheckBox jCheckBoxSeleccionadosConsumosBodegas) {
		this.jCheckBoxSeleccionadosConsumosBodegas = jCheckBoxSeleccionadosConsumosBodegas;
	}
	
	public void setBorderResaltarSeleccionadosConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsumosBodegas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsumosBodegas() {
		return this.jComboBoxTiposArchivosReportesConsumosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsumosBodegas(
			JComboBox jComboBoxTiposArchivosReportesConsumosBodegas) {
		this.jComboBoxTiposArchivosReportesConsumosBodegas = jComboBoxTiposArchivosReportesConsumosBodegas;
	}

	public void setBorderResaltarTiposArchivosReportesConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsumosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsumosBodegas() {
		return this.jComboBoxTiposReportesConsumosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsumosBodegas(
			JComboBox jComboBoxTiposReportesConsumosBodegas) {
		this.jComboBoxTiposReportesConsumosBodegas = jComboBoxTiposReportesConsumosBodegas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsumosBodegas() {
	//	return jComboBoxTiposReportesDinamicoConsumosBodegas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsumosBodegas(
	//		JComboBox jComboBoxTiposReportesDinamicoConsumosBodegas) {
	//	this.jComboBoxTiposReportesDinamicoConsumosBodegas = jComboBoxTiposReportesDinamicoConsumosBodegas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsumosBodegas() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsumosBodegas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsumosBodegas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsumosBodegas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas = jComboBoxTiposArchivosReportesDinamicoConsumosBodegas;
	//}
	
	public void setBorderResaltarTiposReportesConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsumosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsumosBodegas() {
		return this.jComboBoxTiposGraficosReportesConsumosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsumosBodegas(
			JComboBox jComboBoxTiposGraficosReportesConsumosBodegas) {
		this.jComboBoxTiposGraficosReportesConsumosBodegas = jComboBoxTiposGraficosReportesConsumosBodegas;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsumosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsumosBodegas() {
		return this.jComboBoxTiposPaginacionConsumosBodegas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsumosBodegas(
			JComboBox jComboBoxTiposPaginacionConsumosBodegas) {
		this.jComboBoxTiposPaginacionConsumosBodegas = jComboBoxTiposPaginacionConsumosBodegas;
	}
	
	public void setBorderResaltarTiposPaginacionConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsumosBodegas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsumosBodegas() {
		return this.jComboBoxTiposRelacionesConsumosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsumosBodegas() {
		return this.jComboBoxTiposAccionesConsumosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsumosBodegas(
			JComboBox jComboBoxTiposRelacionesConsumosBodegas) {
		this.jComboBoxTiposRelacionesConsumosBodegas = jComboBoxTiposRelacionesConsumosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsumosBodegas(
			JComboBox jComboBoxTiposAccionesConsumosBodegas) {
		this.jComboBoxTiposAccionesConsumosBodegas = jComboBoxTiposAccionesConsumosBodegas;
	}
	
	public void setBorderResaltarTiposRelacionesConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsumosBodegas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsumosBodegas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsumosBodegas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsumosBodegas() {
	//	return jCheckBoxConGraficoDinamicoConsumosBodegas;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsumosBodegas(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsumosBodegas) {
	//	this.jCheckBoxConGraficoDinamicoConsumosBodegas = jCheckBoxConGraficoDinamicoConsumosBodegas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsumosBodegas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsumosBodegas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsumosBodegas .setBorder(borderResaltar);		
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
		this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
		
		this.consumosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consumosbodegasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsumosBodegasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consumos Bodegas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsumosBodegasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsumosBodegas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"nuevo","nuevo","Nuevo"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"duplicar","duplicar","Duplicar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"copiar","copiar","Copiar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"ver_form","ver_form","Ver"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"recargar","recargar","Buscar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsumosBodegas,this.jTtoolBarConsumosBodegas,
							"cerrar","cerrar","Salir"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsumosBodegas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsumosBodegas;
			
				this.jButtonProcesarInformacionToolBarConsumosBodegas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsumosBodegas;
				
		//protected JButton jButtonModificarToolBarConsumosBodegas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsumosBodegas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsumosBodegas=new JMenuMe("General");
		this.jmenuArchivoConsumosBodegas=new JMenuMe("Archivo");
		this.jmenuAccionesConsumosBodegas=new JMenuMe("Acciones");
		this.jmenuDatosConsumosBodegas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsumosBodegas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsumosBodegas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsumosBodegas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsumosBodegas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsumosBodegas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsumosBodegas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsumosBodegas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsumosBodegas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsumosBodegas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsumosBodegas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsumosBodegas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsumosBodegas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsumosBodegas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsumosBodegas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsumosBodegas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsumosBodegas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsumosBodegas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsumosBodegas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsumosBodegas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsumosBodegas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsumosBodegas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsumosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsumosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsumosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsumosBodegas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsumosBodegas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsumosBodegas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsumosBodegas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsumosBodegas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsumosBodegas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsumosBodegas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsumosBodegas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsumosBodegas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsumosBodegas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsumosBodegas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsumosBodegas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsumosBodegas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsumosBodegas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsumosBodegas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsumosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsumosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsumosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsumosBodegas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsumosBodegas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsumosBodegas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsumosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsumosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsumosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsumosBodegas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsumosBodegas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsumosBodegas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsumosBodegas.add(this.jMenuItemCerrarConsumosBodegas);
			
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemNuevoConsumosBodegas);
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemNuevoGuardarCambiosConsumosBodegas);
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemNuevoRelacionesConsumosBodegas);
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemGuardarCambiosTablaConsumosBodegas);		
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemDuplicarConsumosBodegas);		
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemCopiarConsumosBodegas);		
			this.jmenuAccionesConsumosBodegas.add(this.jMenuItemVerFormConsumosBodegas);		
			
			this.jmenuDatosConsumosBodegas.add(this.jMenuItemRecargarInformacionConsumosBodegas);				
			this.jmenuDatosConsumosBodegas.add(this.jMenuItemAnterioresConsumosBodegas);				
			this.jmenuDatosConsumosBodegas.add(this.jMenuItemSiguientesConsumosBodegas);				
			this.jmenuDatosConsumosBodegas.add(this.jMenuItemAbrirOrderByConsumosBodegas);				
			this.jmenuDatosConsumosBodegas.add(this.jMenuItemMostrarOcultarConsumosBodegas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsumosBodegas.add(this.jMenuItemGuardarCambiosConsumosBodegas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsumosBodegas.add(this.jmenuArchivoConsumosBodegas);		
			this.jmenuBarConsumosBodegas.add(this.jmenuAccionesConsumosBodegas);		
			this.jmenuBarConsumosBodegas.add(this.jmenuDatosConsumosBodegas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsumosBodegas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsumosBodegas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConsumosBodegasConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaConsumosBodegasConsumosBodegas= new JButtonMe();
		this.jButtonBusquedaConsumosBodegasConsumosBodegas.setText("Buscar");
		this.jButtonBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConsumosBodegasConsumosBodegas,"buscar_button","Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConsumosBodegasConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas.setText("Transaccion :");
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas.setText("Linea :");
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Linea");
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas= new JComboBoxMe();
		jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasConsumosBodegas=new JTabbedPane();


		this.jTabbedPaneBusquedasConsumosBodegas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasConsumosBodegas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasConsumosBodegas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsumosBodegas = new ConsumosBodegasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consumos Bodegas DATOS");
			this.jInternalFrameDetalleFormConsumosBodegas = new ConsumosBodegasDetalleFormJInternalFrame(jDesktopPane,this.consumosbodegasSessionBean.getConGuardarRelaciones(),this.consumosbodegasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsumosBodegas = null;//new ConsumosBodegasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsumosBodegas= new GridBagLayout();
		
		
		this.jTableDatosConsumosBodegas = new JTableMe();      
		
		String sToolTipConsumosBodegas="";
		sToolTipConsumosBodegas=ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsumosBodegas+="(Inventario.ConsumosBodegas)";
		}
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsumosBodegas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsumosBodegas.setToolTipText(sToolTipConsumosBodegas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsumosBodegas);
		this.jTableDatosConsumosBodegas.setAutoCreateRowSorter(true);
		this.jTableDatosConsumosBodegas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsumosBodegas.setRowSelectionAllowed(true);
		this.jTableDatosConsumosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsumosBodegas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsumosBodegas = new JButtonMe();
		this.jButtonDuplicarConsumosBodegas = new JButtonMe();
		this.jButtonCopiarConsumosBodegas = new JButtonMe();
		this.jButtonVerFormConsumosBodegas = new JButtonMe();
		this.jButtonNuevoRelacionesConsumosBodegas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsumosBodegas = new JButtonMe();
		this.jButtonCerrarConsumosBodegas = new JButtonMe();
		
		this.jScrollPanelDatosConsumosBodegas = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsumosBodegas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consumos Bodegas";
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases" + this.sPath));
		} else {
			this.jScrollPanelDatosConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsumosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesConsumosBodegas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsumosBodegas=new ReporteDinamicoJInternalFrame(ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsumosBodegas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsumosBodegas=new ImportacionJInternalFrame(ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsumosBodegas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsumosBodegas = new JButtonMe();
		
		this.jButtonAbrirOrderByConsumosBodegas.setText("Orden");
		this.jButtonAbrirOrderByConsumosBodegas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsumosBodegas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsumosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosBodegas,false,this);
			
			//this.cargarOrderByConsumosBodegas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsumosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosBodegas,true,this);
			
			//this.cargarOrderByConsumosBodegas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsumosBodegas.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosConsumosBodegas.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosConsumosBodegas.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosConsumosBodegas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsumosBodegas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsumosBodegas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsumosBodegas.setText("Nuevo");
		this.jButtonDuplicarConsumosBodegas.setText("Duplicar");
		this.jButtonCopiarConsumosBodegas.setText("Copiar");
		this.jButtonVerFormConsumosBodegas.setText("Ver");
		this.jButtonNuevoRelacionesConsumosBodegas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.setText("Guardar");
		this.jButtonCerrarConsumosBodegas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsumosBodegas,"nuevo_button","Nuevo",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsumosBodegas,"duplicar_button","Duplicar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsumosBodegas,"copiar_button","Copiar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsumosBodegas,"ver_form","Ver",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsumosBodegas,"nuevorelaciones_button","Nuevo Rel",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsumosBodegas,"guardarcambiostabla_button","Guardar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsumosBodegas,"cerrar_button","Salir",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsumosBodegas.setToolTipText("Nuevo"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsumosBodegas.setToolTipText("Duplicar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsumosBodegas.setToolTipText("Copiar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsumosBodegas.setToolTipText("Ver"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsumosBodegas.setToolTipText("Nuevo Rel"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.setToolTipText("Guardar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsumosBodegas.setToolTipText("Salir"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsumosBodegas";
		inputMap = this.jButtonNuevoConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsumosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsumosBodegas"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsumosBodegas";
		inputMap = this.jButtonDuplicarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsumosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsumosBodegas"));
		
		//COPIAR
		sMapKey = "CopiarConsumosBodegas";
		inputMap = this.jButtonCopiarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsumosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsumosBodegas"));
		
		//VEr FORM
		sMapKey = "VerFormConsumosBodegas";
		inputMap = this.jButtonVerFormConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsumosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsumosBodegas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsumosBodegas";
		inputMap = this.jButtonNuevoRelacionesConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsumosBodegas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsumosBodegas";
		inputMap = this.jButtonModificarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsumosBodegas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsumosBodegas";
		inputMap = this.jButtonCerrarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsumosBodegas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsumosBodegas";
		inputMap = this.jButtonGuardarCambiosTablaConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsumosBodegas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsumosBodegas.setName("jPanelParametrosReportesConsumosBodegas"); 
		
		this.jPanelParametrosReportesAccionesConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsumosBodegas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsumosBodegas.setName("jPanelParametrosReportesAccionesConsumosBodegas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsumosBodegas = new JButtonMe();
		this.jButtonRecargarInformacionConsumosBodegas.setText("Buscar");
		this.jButtonRecargarInformacionConsumosBodegas.setToolTipText("Buscar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsumosBodegas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConsumosBodegas.setVisible(false);
		
		
		this.jButtonProcesarInformacionConsumosBodegas = new JButtonMe();
		this.jButtonProcesarInformacionConsumosBodegas.setText("Procesar");
		this.jButtonProcesarInformacionConsumosBodegas.setToolTipText("Procesar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsumosBodegas.setVisible(false);
			
		this.jButtonProcesarInformacionConsumosBodegas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsumosBodegas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsumosBodegas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosBodegas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsumosBodegas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosBodegas.setText("TIPO");       
		this.jComboBoxTiposReportesConsumosBodegas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosBodegas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsumosBodegas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsumosBodegas.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsumosBodegas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsumosBodegas.setText("Accion");
		this.jComboBoxTiposRelacionesConsumosBodegas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsumosBodegas.setText("Accion");
		this.jComboBoxTiposAccionesConsumosBodegas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsumosBodegas.setText("Accion");
		this.jComboBoxTiposSeleccionarConsumosBodegas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsumosBodegas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsumosBodegas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsumosBodegas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsumosBodegas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsumosBodegas = new JLabelMe();
		
		this.jLabelAccionesConsumosBodegas.setText("Acciones");		
		this.jLabelAccionesConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsumosBodegas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsumosBodegas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsumosBodegas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsumosBodegas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsumosBodegas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsumosBodegas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsumosBodegas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsumosBodegas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsumosBodegas.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsumosBodegas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsumosBodegas = new JButtonMe();
		//this.jButtonAnterioresConsumosBodegas.setText("<<");
        this.jButtonAnterioresConsumosBodegas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsumosBodegas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsumosBodegas = new JButtonMe();
		//this.jButtonSiguientesConsumosBodegas.setText(">>");
        this.jButtonSiguientesConsumosBodegas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsumosBodegas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsumosBodegas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsumosBodegas.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsumosBodegas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsumosBodegas,"nuevoguardarcambios_button","Nue",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsumosBodegas";
		inputMap = this.jButtonNuevoGuardarCambiosConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsumosBodegas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsumosBodegas";
		inputMap = this.jButtonRecargarInformacionConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsumosBodegas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsumosBodegas";
		inputMap = this.jButtonSiguientesConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsumosBodegas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsumosBodegas";
		inputMap = this.jButtonAnterioresConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsumosBodegas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsumosBodegas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsumosBodegas.setMinimumSize(new Dimension(this.getWidth(),ConsumosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsumosBodegas.setMaximumSize(new Dimension(this.getWidth(),ConsumosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsumosBodegas.setPreferredSize(new Dimension(this.getWidth(),ConsumosBodegasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosBodegasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsumosBodegas = new GridBagLayout();

			this.jPanelPaginacionConsumosBodegas.setLayout(gridaBagLayoutPaginacionConsumosBodegas);						
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 0;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonAnterioresConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					
						
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsumosBodegas.gridy = 0;
			
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonNuevoGuardarCambiosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
						
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsumosBodegas.gridy = 0;
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonSiguientesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 1;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonNuevoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
						
			
			
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
				this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsumosBodegas.gridy = 1;
				this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsumosBodegas.add(this.jButtonGuardarCambiosTablaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			}
			
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 1;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonDuplicarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 1;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonCopiarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 1;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonVerFormConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 1;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsumosBodegas.add(this.jButtonCerrarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		
		this.jButtonRecargarInformacionConsumosBodegas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsumosBodegas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsumosBodegas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsumosBodegas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsumosBodegas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsumosBodegas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsumosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsumosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsumosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsumosBodegas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsumosBodegas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsumosBodegas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsumosBodegas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsumosBodegas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsumosBodegas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsumosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsumosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsumosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsumosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsumosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsumosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsumosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsumosBodegas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsumosBodegas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsumosBodegas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsumosBodegas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsumosBodegas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsumosBodegas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsumosBodegas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsumosBodegas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsumosBodegas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsumosBodegas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsumosBodegas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsumosBodegas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsumosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsumosBodegas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConsumosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConsumosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConsumosBodegas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConsumosBodegas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsumosBodegas.setLayout(gridaBagParametrosReportesConsumosBodegas);
			this.jPanelParametrosReportesAccionesConsumosBodegas.setLayout(gridaBagParametrosReportesAccionesConsumosBodegas);
			
			
			this.jPanelParametrosAuxiliar1ConsumosBodegas.setLayout(gridaBagParametrosAuxiliar1ConsumosBodegas);
			this.jPanelParametrosAuxiliar2ConsumosBodegas.setLayout(gridaBagParametrosAuxiliar2ConsumosBodegas);
			this.jPanelParametrosAuxiliar3ConsumosBodegas.setLayout(gridaBagParametrosAuxiliar3ConsumosBodegas);
			this.jPanelParametrosAuxiliar4ConsumosBodegas.setLayout(gridaBagParametrosAuxiliar4ConsumosBodegas);
			//this.jPanelParametrosAuxiliar5ConsumosBodegas.setLayout(gridaBagParametrosAuxiliar2ConsumosBodegas);			
			
			
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosBodegas.add(this.jButtonRecargarInformacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosBodegas.add(this.jComboBoxTiposPaginacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosBodegas.add(this.jCheckBoxConAltoMaximoTablaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosBodegas.add(this.jComboBoxTiposArchivosReportesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosBodegas.add(this.jPanelParametrosAuxiliar1ConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConsumosBodegas.add(this.jComboBoxTiposReportesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);																		
			
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConsumosBodegas.add(this.jComboBoxTiposGraficosReportesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosBodegas.add(this.jPanelParametrosAuxiliar4ConsumosBodegas, this.gridBagConstraintsConsumosBodegas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosBodegas.add(this.jComboBoxTiposReportesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosBodegas.add(this.jCheckBoxGenerarReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosBodegas.add(this.jPanelParametrosAuxiliar2ConsumosBodegas, this.gridBagConstraintsConsumosBodegas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosBodegas.add(this.jLabelAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
				this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsumosBodegas.add(this.jButtonAbrirOrderByConsumosBodegas, this.gridBagConstraintsConsumosBodegas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosBodegas.add(this.jComboBoxTiposSeleccionarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
			
			
			/*
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosBodegas.add(this.jCheckBoxSeleccionarTodosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosBodegas.add(this.jCheckBoxConGraficoReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosBodegas.add(this.jCheckBoxSeleccionarTodosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);															
				
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosBodegas.add(this.jCheckBoxSeleccionadosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);															
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosBodegas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosBodegas.add(this.jCheckBoxConGraficoReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosBodegas.add(this.jPanelParametrosAuxiliar3ConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosBodegas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosBodegas.add(this.jComboBoxTiposAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsumosBodegas = new GridBagLayout();

			this.jScrollPanelDatosConsumosBodegas.setLayout(gridaBagLayoutDatosConsumosBodegas);
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = 0;
			this.gridBagConstraintsConsumosBodegas.gridx = 0;
			
			this.jScrollPanelDatosConsumosBodegas.add(this.jTableDatosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsumosBodegas.setViewportView(this.jTableDatosConsumosBodegas);
		this.jTableDatosConsumosBodegas.setFillsViewportHeight(true);
		this.jTableDatosConsumosBodegas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsumosBodegas= new GridBagLayout();
		this.jPanelAccionesConsumosBodegas.setLayout(gridaBagLayoutAccionesConsumosBodegas);
		
		
		/*	
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
			
		this.jPanelAccionesConsumosBodegas.add(this.jButtonNuevoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas= new GridBagLayout();
		gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConsumosBodegasConsumosBodegas.setLayout(gridaBagLayoutBusquedaConsumosBodegasConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 0;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelid_transaccionBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 0;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 1;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelid_lineaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 1;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 2;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelid_linea_grupoBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 2;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 3;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 3;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 4;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelid_linea_marcaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 4;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 5;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 5;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);


		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 6;
		gridBagConstraintsConsumosBodegas.gridx = 0;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jLabelfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 6;
		gridBagConstraintsConsumosBodegas.gridx = 1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosBodegas.gridy = 7;
		gridBagConstraintsConsumosBodegas.gridx =1;
		jPanelBusquedaConsumosBodegasConsumosBodegas.add(jButtonBusquedaConsumosBodegasConsumosBodegas, gridBagConstraintsConsumosBodegas);

		jTabbedPaneBusquedasConsumosBodegas.addTab("1.-Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaConsumosBodegasConsumosBodegas);
		jTabbedPaneBusquedasConsumosBodegas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsumosBodegas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsumosBodegas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();						
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosBodegas.gridx = 0;		
			//this.gridBagConstraintsConsumosBodegas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsumosBodegas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsumosBodegas.gridx = 0;		
		//this.gridBagConstraintsConsumosBodegas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsumosBodegas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsumosBodegas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosBodegas.gridx = 0;		
			this.gridBagConstraintsConsumosBodegas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsumosBodegas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsumosBodegas, this.gridBagConstraintsConsumosBodegas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);								
		
		
		/*
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		*/		
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsumosBodegas.gridx =0;
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsumosBodegas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
				
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsumosBodegas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsumosBodegas = new GridBagLayout();
			this.jPanelBusquedasParametrosConsumosBodegas.setLayout(gridaBagLayoutBusquedasParametrosConsumosBodegas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsumosBodegas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsumosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsumosBodegas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsumosBodegas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsumosBodegas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsumosBodegas.setName("jPanelReporteDinamicoConsumosBodegas"); 
		
		this.jPanelReporteDinamicoConsumosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsumosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsumosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsumosBodegas.setLayout(gridaBagLayoutReporteDinamicoConsumosBodegas);
		
		
		this.jInternalFrameReporteDinamicoConsumosBodegas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsumosBodegas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsumosBodegas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsumosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsumosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsumosBodegas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsumosBodegas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsumosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsumosBodegas.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsumosBodegas.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsumosBodegas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsumosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsumosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsumosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsumosBodegas = new JLabelMe();

		this.jLabelColumnasSelectReporteConsumosBodegas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelColumnasSelectReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsumosBodegas = new JList<Reporte>();
		this.jListColumnasSelectReporteConsumosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsumosBodegas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsumosBodegas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsumosBodegas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsumosBodegas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsumosBodegas=new JScrollPane(this.jListColumnasSelectReporteConsumosBodegas);
			
			this.jScrollColumnasSelectReporteConsumosBodegas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsumosBodegas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsumosBodegas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsumosBodegas.add(this.jListColumnasSelectReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jScrollColumnasSelectReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsumosBodegas = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsumosBodegas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsumosBodegas = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsumosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsumosBodegas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsumosBodegas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsumosBodegas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsumosBodegas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsumosBodegas=new JScrollPane(this.jListRelacionesSelectReporteConsumosBodegas);
			
			this.jScrollRelacionesSelectReporteConsumosBodegas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsumosBodegas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsumosBodegas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConsumosBodegas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsumosBodegas = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsumosBodegas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsumosBodegas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsumosBodegas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsumosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsumosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsumosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConsumosBodegas = new JLabelMe();

		this.jLabelConGraficoDinamicoConsumosBodegas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelConGraficoDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConsumosBodegas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConsumosBodegas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConsumosBodegas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsumosBodegas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsumosBodegas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jCheckBoxConGraficoDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConsumosBodegas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConsumosBodegas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelColumnaCategoriaGraficoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jComboBoxColumnaCategoriaGraficoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConsumosBodegas = new JLabelMe();

		this.jLabelColumnaCategoriaValorConsumosBodegas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelColumnaCategoriaValorConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConsumosBodegas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConsumosBodegas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConsumosBodegas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsumosBodegas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsumosBodegas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jComboBoxColumnaCategoriaValorConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConsumosBodegas = new JLabelMe();

		this.jLabelColumnasValoresGraficoConsumosBodegas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelColumnasValoresGraficoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConsumosBodegas = new JList<Reporte>();
		this.jListColumnasValoresGraficoConsumosBodegas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConsumosBodegas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConsumosBodegas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsumosBodegas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsumosBodegas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConsumosBodegas=new JScrollPane(this.jListColumnasValoresGraficoConsumosBodegas);
			
			this.jScrollColumnasValoresGraficoConsumosBodegas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsumosBodegas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsumosBodegas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConsumosBodegas.add(this.jListColumnasSelectReporteConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jScrollColumnasValoresGraficoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConsumosBodegas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConsumosBodegas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelTiposGraficosReportesDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsumosBodegas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jComboBoxTiposGraficosReportesDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsumosBodegas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsumosBodegas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelGenerarExcelReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsumosBodegas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsumosBodegas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsumosBodegas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsumosBodegas.setToolTipText("Generar EXCEL"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsumosBodegas.add(this.jButtonGenerarExcelReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jComboBoxTiposReportesDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsumosBodegas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsumosBodegas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jLabelTiposArchivoReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jComboBoxTiposArchivosReportesDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsumosBodegas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsumosBodegas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsumosBodegas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsumosBodegas.setToolTipText("Generar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jButtonGenerarReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsumosBodegas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsumosBodegas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsumosBodegas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsumosBodegas.setToolTipText("Cancelar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosBodegas.add(this.jButtonCerrarReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsumosBodegas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsumosBodegas= new JScrollPane(jPanelReporteDinamicoConsumosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsumosBodegas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsumosBodegas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsumosBodegas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsumosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsumosBodegas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsumosBodegas);
		this.jInternalFrameReporteDinamicoConsumosBodegas.getContentPane().add(this.jScrollPanelReporteDinamicoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsumosBodegas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsumosBodegas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsumosBodegas.setName("jPanelImportacionConsumosBodegas"); 
		
		this.jPanelImportacionConsumosBodegas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsumosBodegas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsumosBodegas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsumosBodegas.setLayout(gridaBagLayoutImportacionConsumosBodegas);
		
		
		this.jInternalFrameImportacionConsumosBodegas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsumosBodegas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsumosBodegas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsumosBodegas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsumosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsumosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsumosBodegas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsumosBodegas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsumosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsumosBodegas.setResizable(true);
	    this.jInternalFrameImportacionConsumosBodegas.setClosable(true);
	    this.jInternalFrameImportacionConsumosBodegas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsumosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsumosBodegas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsumosBodegas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsumosBodegas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsumosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsumosBodegas.setResizable(true);
	    this.jInternalFrameImportacionConsumosBodegas.setClosable(true);
	    this.jInternalFrameImportacionConsumosBodegas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsumosBodegas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsumosBodegas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsumosBodegas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsumosBodegas = new JLabelMe();

		this.jLabelArchivoImportacionConsumosBodegas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsumosBodegas.add(this.jLabelArchivoImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsumosBodegas = new JFileChooser();		
		this.jFileChooserImportacionConsumosBodegas.setToolTipText("ESCOGER ARCHIVO"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsumosBodegas = new JButtonMe();
		this.jButtonAbrirImportacionConsumosBodegas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsumosBodegas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsumosBodegas.setToolTipText("Generar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosBodegas.add(this.jButtonAbrirImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsumosBodegas = new JLabelMe();

		this.jLabelPathArchivoImportacionConsumosBodegas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsumosBodegas.add(this.jLabelPathArchivoImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsumosBodegas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsumosBodegas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsumosBodegas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsumosBodegas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosBodegas.add(this.jTextFieldPathArchivoImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsumosBodegas = new JButtonMe();
		this.jButtonGenerarImportacionConsumosBodegas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsumosBodegas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsumosBodegas.setToolTipText("Generar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosBodegas.add(this.jButtonGenerarImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsumosBodegas = new JButtonMe();
		this.jButtonCerrarImportacionConsumosBodegas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsumosBodegas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsumosBodegas.setToolTipText("Cancelar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosBodegas.add(this.jButtonCerrarImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsumosBodegas = new GridBagLayout();
		
		this.jScrollPanelImportacionConsumosBodegas= new JScrollPane(jPanelImportacionConsumosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iPosYImportacion;
		this.gridBagConstraintsConsumosBodegas.gridx =iPosXImportacion;
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsumosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsumosBodegas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsumosBodegas);
		this.jInternalFrameImportacionConsumosBodegas.getContentPane().add(this.jScrollPanelImportacionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsumosBodegas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsumosBodegas = new JButtonMe();
			this.jButtonAbrirOrderByConsumosBodegas.setText("Orden");
			this.jButtonAbrirOrderByConsumosBodegas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsumosBodegas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsumosBodegas";
			inputMap = this.jButtonAbrirOrderByConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsumosBodegas"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsumosBodegas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsumosBodegas.setName("jPanelOrderByConsumosBodegas"); 
			
			this.jPanelOrderByConsumosBodegas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsumosBodegas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsumosBodegas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsumosBodegas.setLayout(gridaBagLayoutOrderByConsumosBodegas);
			
			
			this.jTableDatosConsumosBodegasOrderBy = new JTableMe();        
			this.jTableDatosConsumosBodegasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsumosBodegasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsumosBodegasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsumosBodegasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsumosBodegasOrderBy.setViewportView(this.jTableDatosConsumosBodegasOrderBy);
			this.jTableDatosConsumosBodegasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsumosBodegasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsumosBodegas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsumosBodegas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsumosBodegas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsumosBodegas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsumosBodegas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsumosBodegas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsumosBodegas.setTitle("Orden");
			this.jInternalFrameOrderByConsumosBodegas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsumosBodegas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsumosBodegas.setResizable(true);
			this.jInternalFrameOrderByConsumosBodegas.setClosable(true);
			this.jInternalFrameOrderByConsumosBodegas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsumosBodegas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsumosBodegas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsumosBodegas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsumosBodegas.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsumosBodegas.ipady =150;
				
			this.jPanelOrderByConsumosBodegas.add(jScrollPanelDatosConsumosBodegasOrderBy, this.gridBagConstraintsConsumosBodegas);//this.jTableDatosConsumosBodegasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsumosBodegas = new JButtonMe();
			this.jButtonCerrarOrderByConsumosBodegas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsumosBodegas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsumosBodegas.setToolTipText("Cancelar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsumosBodegas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsumosBodegas.add(this.jButtonCerrarOrderByConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsumosBodegas = new GridBagLayout();
			
			this.jScrollPanelOrderByConsumosBodegas= new JScrollPane(jPanelOrderByConsumosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsumosBodegas.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsumosBodegas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsumosBodegas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsumosBodegas);
			
			this.jInternalFrameOrderByConsumosBodegas.getContentPane().add(this.jScrollPanelOrderByConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
		
		} else {
			this.jButtonAbrirOrderByConsumosBodegas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.consumosbodegasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsumosBodegas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConsumosBodegas.getRowHeight();//ConsumosBodegasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsumosBodegas.isSelected()) {
					iHeightTable=ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsumosBodegas.isSelected()) {
					iHeightTable=ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsumosBodegasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsumosBodegas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsumosBodegas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsumosBodegas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsumosBodegas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsumosBodegas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsumosBodegas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsumosBodegas!=null && this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy()!=null) {
			//if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsumosBodegas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsumosBodegas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsumosBodegas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsumosBodegas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsumosBodegas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsumosBodegas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=consumosbodegasLogic.getConsumosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosbodegass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConsumosBodegas> TraerConsumosBodegasBeans(List<ConsumosBodegas> consumosbodegass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConsumosBodegas consumosbodegas:consumosbodegass) {
					
				if(!(ConsumosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsumosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consumosbodegas.setsDetalleGeneralEntityReporte(ConsumosBodegasConstantesFunciones.getConsumosBodegasDescripcion(consumosbodegas));
										
						
					
						
					
				} else  {
							
					//consumosbodegas.setsDetalleGeneralEntityReporte(consumosbodegas.getsDetalleGeneralEntityReporte());
										
				}
				
				//consumosbodegasbeans.add(consumosbodegasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consumosbodegass;
    }
	//PARA REPORTES FIN
}
