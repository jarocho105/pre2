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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduManoConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProductoOrdenDetaProduManoJInternalFrame extends ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoOrdenDetaProduMano;
	
	protected JMenuBar jmenuBarProductoOrdenDetaProduMano;
	
	protected JMenu jmenuProductoOrdenDetaProduMano;
	protected JMenu jmenuDatosProductoOrdenDetaProduMano;
	protected JMenu jmenuArchivoProductoOrdenDetaProduMano;
	protected JMenu jmenuAccionesProductoOrdenDetaProduMano;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMano;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMano;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame jInternalFrameDetalleFormProductoOrdenDetaProduMano;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoOrdenDetaProduMano;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoOrdenDetaProduMano;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomanoproduempresa="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean;
		
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoOrdenDetaProduMano> productoordendetaprodumanos;		
	public List<ProductoOrdenDetaProduMano> productoordendetaprodumanosEliminados;	
	public List<ProductoOrdenDetaProduMano> productoordendetaprodumanosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoOrdenDetaProduMano;		
	protected JButton jButtonAbrirOrderByProductoOrdenDetaProduMano;
	
	
	//protected JPanel jPanelOrderByProductoOrdenDetaProduMano;
	//public JScrollPane jScrollPanelOrderByProductoOrdenDetaProduMano;	
	//protected JButton jButtonCerrarOrderByProductoOrdenDetaProduMano;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMano;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMano;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMano;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrdenDetaProduManoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoOrdenDetaProduMano;
	//public JScrollPane jScrollPanelImportacionProductoOrdenDetaProduMano;
	
	
	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMano;
	
    protected JPanel jPanelPaginacionProductoOrdenDetaProduMano;
    protected JPanel jPanelParametrosReportesProductoOrdenDetaProduMano;
	protected JPanel jPanelParametrosReportesAccionesProductoOrdenDetaProduMano;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano;
	protected JPanel jPanelParametrosAuxiliar2ProductoOrdenDetaProduMano;
	protected JPanel jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano;
	protected JPanel jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano;
	//protected JPanel jPanelParametrosAuxiliar5ProductoOrdenDetaProduMano;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoOrdenDetaProduMano;
	//protected JPanel jPanelImportacionProductoOrdenDetaProduMano;
	
	
	public JTable jTableDatosProductoOrdenDetaProduMano;
	
	
	
	//public JTable jTableDatosProductoOrdenDetaProduManoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoOrdenDetaProduMano;
	protected JButton jButtonDuplicarProductoOrdenDetaProduMano;
	protected JButton jButtonCopiarProductoOrdenDetaProduMano;
	protected JButton jButtonVerFormProductoOrdenDetaProduMano;
	protected JButton jButtonNuevoRelacionesProductoOrdenDetaProduMano;
	protected JButton jButtonModificarProductoOrdenDetaProduMano;
	
    protected JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMano;
	protected JButton jButtonCerrarProductoOrdenDetaProduMano;
	
	
	protected JButton jButtonRecargarInformacionProductoOrdenDetaProduMano;
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMano;
	
	
	protected JButton jButtonAnterioresProductoOrdenDetaProduMano;
	protected JButton jButtonSiguientesProductoOrdenDetaProduMano;
	protected JButton jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano;
	//protected JButton jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoOrdenDetaProduMano;
	//protected JButton jButtonGenerarImportacionProductoOrdenDetaProduMano;
	//protected JButton jButtonCerrarImportacionProductoOrdenDetaProduMano;
	//protected JFileChooser jFileChooserImportacionProductoOrdenDetaProduMano;
	//protected File fileImportacionProductoOrdenDetaProduMano;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonDuplicarToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonCopiarToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonVerFormToolBarProductoOrdenDetaProduMano;
	public JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMano;
	
	protected JButton jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonAnterioresToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonSiguientesToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonAbrirOrderByToolBarProductoOrdenDetaProduMano;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDuplicarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemNuevoRelacionesProductoOrdenDetaProduMano;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemCopiarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemVerFormProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemAnterioresProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemSiguientesProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemAbrirOrderByProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMano;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMano;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano;
	protected JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMano;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano;
	protected JCheckBox jCheckBoxConGraficoReporteProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMano;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMano;
	protected JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMano;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoOrdenDetaProduMano;
	//public JList<Reporte> jListColumnasSelectReporteProductoOrdenDetaProduMano;
	//public JScrollPane jScrollColumnasSelectReporteProductoOrdenDetaProduMano;
	
	//public JLabel jLabelRelacionesSelectReporteProductoOrdenDetaProduMano;
	//public JList<Reporte> jListRelacionesSelectReporteProductoOrdenDetaProduMano;
	//public JScrollPane jScrollRelacionesSelectReporteProductoOrdenDetaProduMano;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoOrdenDetaProduMano;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano;
	
		
	//public JLabel jLabelArchivoImportacionProductoOrdenDetaProduMano;	
	//public JLabel jLabelPathArchivoImportacionProductoOrdenDetaProduMano;
	//protected JTextField jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano;
	
	//public JLabel jLabelColumnaCategoriaValorProductoOrdenDetaProduMano;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano;
	
	//public JLabel jLabelColumnasValoresGraficoProductoOrdenDetaProduMano;
	//public JList<Reporte> jListColumnasValoresGraficoProductoOrdenDetaProduMano;
	//public JScrollPane jScrollColumnasValoresGraficoProductoOrdenDetaProduMano;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMano;
	public JPanel jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano;
	public JButton jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano;
	public JPanel jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano;
	public JButton jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano;
	public JPanel jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano;
	public JButton jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano;
	public JPanel jPanelFK_IdUnidadProductoOrdenDetaProduMano;
	public JButton jButtonFK_IdUnidadProductoOrdenDetaProduMano;
	
	public JPanel jPanelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano;
	public JLabel jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano;
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano;
	public JLabel jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano;
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano;
	public JLabel jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano;
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoOrdenDetaProduMano;
	public JLabel jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano;
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoOrdenDetaProduManoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoOrdenDetaProduMano)	{
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano = jButtonRecargarInformacionProductoOrdenDetaProduMano;
	}
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMano() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMano;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMano)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano = jButtonProcesarInformacionProductoOrdenDetaProduMano;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoOrdenDetaProduMano() {
		return this.jButtonRecargarInformacionProductoOrdenDetaProduMano;
	}
	
	
	public List<ProductoOrdenDetaProduMano> getproductoordendetaprodumanos() {
		return this.productoordendetaprodumanos;
	}

	public void setproductoordendetaprodumanos(List<ProductoOrdenDetaProduMano> productoordendetaprodumanos) {
		this.productoordendetaprodumanos = productoordendetaprodumanos;
	}
	
	public List<ProductoOrdenDetaProduMano> getproductoordendetaprodumanosAux() {
		return this.productoordendetaprodumanosAux;
	}

	public void setproductoordendetaprodumanosAux(List<ProductoOrdenDetaProduMano> productoordendetaprodumanosAux) {
		this.productoordendetaprodumanosAux = productoordendetaprodumanosAux;
	}
	
	public List<ProductoOrdenDetaProduMano> getproductoordendetaprodumanosEliminados() {
		return this.productoordendetaprodumanosEliminados;
	}

	public void setProductoOrdenDetaProduManosEliminados(List<ProductoOrdenDetaProduMano> productoordendetaprodumanosEliminados) {
		this.productoordendetaprodumanosEliminados = productoordendetaprodumanosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoOrdenDetaProduMano() {
		return jComboBoxTiposSeleccionarProductoOrdenDetaProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMano) {
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano = jComboBoxTiposSeleccionarProductoOrdenDetaProduMano;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoOrdenDetaProduMano() {
		return jTextFieldValorCampoGeneralProductoOrdenDetaProduMano;
	}

	public void setjTextFieldValorCampoGeneralProductoOrdenDetaProduMano(
			JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMano) {
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano = jTextFieldValorCampoGeneralProductoOrdenDetaProduMano;
	}

	public void setBorderResaltarValorCampoGeneralProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoOrdenDetaProduMano() {
		return this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano;
	}

	public void setjCheckBoxSeleccionarTodosProductoOrdenDetaProduMano(
			JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano) {
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano = jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano;
	}

	public void setBorderResaltarSeleccionarTodosProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoOrdenDetaProduMano() {
		return this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano;
	}

	public void setjCheckBoxSeleccionadosProductoOrdenDetaProduMano(
			JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMano) {
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano = jCheckBoxSeleccionadosProductoOrdenDetaProduMano;
	}
	
	public void setBorderResaltarSeleccionadosProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano = jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano;
	}

	public void setBorderResaltarTiposArchivosReportesProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposReportesProductoOrdenDetaProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano = jComboBoxTiposReportesProductoOrdenDetaProduMano;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano() {
	//	return jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano) {
	//	this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano = jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano = jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano;
	//}
	
	public void setBorderResaltarTiposReportesProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano = jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMano) {
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano = jComboBoxTiposPaginacionProductoOrdenDetaProduMano;
	}
	
	public void setBorderResaltarTiposPaginacionProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano = jComboBoxTiposRelacionesProductoOrdenDetaProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano = jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	}
	
	public void setBorderResaltarTiposRelacionesProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoOrdenDetaProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano() {
	//	return jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano) {
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano = jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoOrdenDetaProduMano() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoOrdenDetaProduMano.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano .setBorder(borderResaltar);		
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
		this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		
		this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduManoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden  Mano De Obra MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoOrdenDetaProduMano= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"nuevo","nuevo","Nuevo"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"duplicar","duplicar","Duplicar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"copiar","copiar","Copiar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"ver_form","ver_form","Ver"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"recargar","recargar","Recargar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,
							"cerrar","cerrar","Salir"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano;
			
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMano=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMano;
				
		//protected JButton jButtonModificarToolBarProductoOrdenDetaProduMano;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoOrdenDetaProduMano=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoOrdenDetaProduMano=new JMenuMe("General");
		this.jmenuArchivoProductoOrdenDetaProduMano=new JMenuMe("Archivo");
		this.jmenuAccionesProductoOrdenDetaProduMano=new JMenuMe("Acciones");
		this.jmenuDatosProductoOrdenDetaProduMano=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMano= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMano.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMano,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoOrdenDetaProduMano= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoOrdenDetaProduMano.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoOrdenDetaProduMano,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoOrdenDetaProduMano= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoOrdenDetaProduMano.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoOrdenDetaProduMano,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoOrdenDetaProduMano= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoOrdenDetaProduMano.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoOrdenDetaProduMano,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMano= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMano.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoOrdenDetaProduMano,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMano= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoOrdenDetaProduMano.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoOrdenDetaProduMano,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMano= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoOrdenDetaProduMano.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoOrdenDetaProduMano,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoOrdenDetaProduMano.add(this.jMenuItemCerrarProductoOrdenDetaProduMano);
			
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemNuevoProductoOrdenDetaProduMano);
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano);
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano);
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano);		
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemDuplicarProductoOrdenDetaProduMano);		
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemCopiarProductoOrdenDetaProduMano);		
			this.jmenuAccionesProductoOrdenDetaProduMano.add(this.jMenuItemVerFormProductoOrdenDetaProduMano);		
			
			this.jmenuDatosProductoOrdenDetaProduMano.add(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano);				
			this.jmenuDatosProductoOrdenDetaProduMano.add(this.jMenuItemAnterioresProductoOrdenDetaProduMano);				
			this.jmenuDatosProductoOrdenDetaProduMano.add(this.jMenuItemSiguientesProductoOrdenDetaProduMano);				
			this.jmenuDatosProductoOrdenDetaProduMano.add(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano);				
			this.jmenuDatosProductoOrdenDetaProduMano.add(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMano.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoOrdenDetaProduMano.add(this.jmenuArchivoProductoOrdenDetaProduMano);		
			this.jmenuBarProductoOrdenDetaProduMano.add(this.jmenuAccionesProductoOrdenDetaProduMano);		
			this.jmenuBarProductoOrdenDetaProduMano.add(this.jmenuDatosProductoOrdenDetaProduMano);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoOrdenDetaProduMano);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoOrdenDetaProduMano() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setToolTipText("Buscar Por Orden Deta Produ ");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setToolTipText("Buscar Por Orden Deta Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano,"buscar_button","Buscar Por Orden Deta Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano = new JLabelMe();
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setText("Orden Deta Produ :");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setToolTipText("Orden Deta Produ");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setToolTipText("Buscar Por Tipo Mano Obra Empresa ");
		this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setToolTipText("Buscar Por Tipo Mano Obra Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano,"buscar_button","Buscar Por Tipo Mano Obra Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano = new JLabelMe();
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setText("Tipo Mano Obra Empresa :");
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setToolTipText("Tipo Mano Obra Empresa");
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano,"buscar_button","Buscar Por Tipo Proceso Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano = new JLabelMe();
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setText("Tipo Proceso Empresa Produ :");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setToolTipText("Tipo Proceso Empresa Produ");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoOrdenDetaProduMano.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMano.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoOrdenDetaProduMano,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoOrdenDetaProduMano=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoOrdenDetaProduMano = new ProductoOrdenDetaProduManoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden  Mano De Obra DATOS");
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano = new ProductoOrdenDetaProduManoDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano = null;//new ProductoOrdenDetaProduManoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMano= new GridBagLayout();
		
		
		this.jTableDatosProductoOrdenDetaProduMano = new JTableMe();      
		
		String sToolTipProductoOrdenDetaProduMano="";
		sToolTipProductoOrdenDetaProduMano=ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMano+="(Produccion.ProductoOrdenDetaProduMano)";
		}
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMano+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoOrdenDetaProduMano.setToolTipText(sToolTipProductoOrdenDetaProduMano);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoOrdenDetaProduMano);
		this.jTableDatosProductoOrdenDetaProduMano.setAutoCreateRowSorter(true);
		this.jTableDatosProductoOrdenDetaProduMano.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionAllowed(true);
		this.jTableDatosProductoOrdenDetaProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonDuplicarProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonCopiarProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonVerFormProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMano = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMano = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden  Mano De Obra";
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMano.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMano.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoOrdenDetaProduMano();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoOrdenDetaProduMano=new ImportacionJInternalFrame(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoOrdenDetaProduMano();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMano = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setText("Orden");
		this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMano,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMano,false,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMano(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMano,true,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMano(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoOrdenDetaProduMano.setText("Nuevo");
		this.jButtonDuplicarProductoOrdenDetaProduMano.setText("Duplicar");
		this.jButtonCopiarProductoOrdenDetaProduMano.setText("Copiar");
		this.jButtonVerFormProductoOrdenDetaProduMano.setText("Ver");
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMano.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMano,"nuevo_button","Nuevo",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoOrdenDetaProduMano,"duplicar_button","Duplicar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoOrdenDetaProduMano,"copiar_button","Copiar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoOrdenDetaProduMano,"ver_form","Ver",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoOrdenDetaProduMano,"nuevorelaciones_button","Nuevo Rel",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMano,"cerrar_button","Salir",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoOrdenDetaProduMano.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoOrdenDetaProduMano.setToolTipText("Duplicar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoOrdenDetaProduMano.setToolTipText("Copiar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoOrdenDetaProduMano.setToolTipText("Ver"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.setToolTipText("Nuevo Rel"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMano.setToolTipText("Salir"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMano"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoOrdenDetaProduMano";
		inputMap = this.jButtonDuplicarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoOrdenDetaProduMano"));
		
		//COPIAR
		sMapKey = "CopiarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCopiarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoOrdenDetaProduMano"));
		
		//VEr FORM
		sMapKey = "VerFormProductoOrdenDetaProduMano";
		inputMap = this.jButtonVerFormProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoOrdenDetaProduMano"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoOrdenDetaProduMano"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoOrdenDetaProduMano";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoOrdenDetaProduMano"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMano"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMano";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMano"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoOrdenDetaProduMano.setName("jPanelParametrosReportesProductoOrdenDetaProduMano"); 
		
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano.setName("jPanelParametrosReportesAccionesProductoOrdenDetaProduMano"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.setText("Recargar");
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.setToolTipText("Recargar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoOrdenDetaProduMano,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setText("Procesar");
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setToolTipText("Procesar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setVisible(false);
			
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setText("TIPO");       
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.setText("Accion");
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoOrdenDetaProduMano = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMano.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoOrdenDetaProduMano = new JButtonMe();
		//this.jButtonAnterioresProductoOrdenDetaProduMano.setText("<<");
        this.jButtonAnterioresProductoOrdenDetaProduMano.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoOrdenDetaProduMano,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoOrdenDetaProduMano = new JButtonMe();
		//this.jButtonSiguientesProductoOrdenDetaProduMano.setText(">>");
        this.jButtonSiguientesProductoOrdenDetaProduMano.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoOrdenDetaProduMano,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano,"nuevoguardarcambios_button","Nue",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoOrdenDetaProduMano"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoOrdenDetaProduMano";
		inputMap = this.jButtonRecargarInformacionProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoOrdenDetaProduMano"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoOrdenDetaProduMano";
		inputMap = this.jButtonSiguientesProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoOrdenDetaProduMano"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoOrdenDetaProduMano";
		inputMap = this.jButtonAnterioresProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoOrdenDetaProduMano"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoOrdenDetaProduMano();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoOrdenDetaProduMano = new GridBagLayout();

			this.jPanelPaginacionProductoOrdenDetaProduMano.setLayout(gridaBagLayoutPaginacionProductoOrdenDetaProduMano);						
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonAnterioresProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					
						
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
			
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
						
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonSiguientesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonNuevoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
						
			
			
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			}
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonDuplicarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonCopiarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonVerFormProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoOrdenDetaProduMano.add(this.jButtonCerrarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoOrdenDetaProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoOrdenDetaProduMano = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMano = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.setLayout(gridaBagParametrosReportesProductoOrdenDetaProduMano);
			this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano.setLayout(gridaBagParametrosReportesAccionesProductoOrdenDetaProduMano);
			
			
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano.setLayout(gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMano);
			this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMano.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMano);
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano.setLayout(gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMano);
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano.setLayout(gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMano);
			//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMano.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMano);			
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jButtonRecargarInformacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano.add(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano.add(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano.add(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);																		
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano.add(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jCheckBoxGenerarReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jLabelAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jButtonAbrirOrderByProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);															
				
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano.add(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);															
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jComboBoxTiposAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
	
				
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.add(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoOrdenDetaProduMano = new GridBagLayout();

			this.jScrollPanelDatosProductoOrdenDetaProduMano.setLayout(gridaBagLayoutDatosProductoOrdenDetaProduMano);
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
			
			this.jScrollPanelDatosProductoOrdenDetaProduMano.add(this.jTableDatosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setViewportView(this.jTableDatosProductoOrdenDetaProduMano);
		this.jTableDatosProductoOrdenDetaProduMano.setFillsViewportHeight(true);
		this.jTableDatosProductoOrdenDetaProduMano.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMano= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMano.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMano);
		
		
		/*	
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
			
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonNuevoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setLayout(gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano.add(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano.add(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx =1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano.add(jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		jTabbedPaneBusquedasProductoOrdenDetaProduMano.addTab("1.-Por Orden Deta Produ ", jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
		jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setLayout(gridaBagLayoutFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.add(jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
		jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.add(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx =1;
		jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.add(jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		jTabbedPaneBusquedasProductoOrdenDetaProduMano.addTab("2.-Por Tipo Mano Obra Empresa ", jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
		jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setLayout(gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.add(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.add(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx =1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.add(jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		jTabbedPaneBusquedasProductoOrdenDetaProduMano.addTab("3.-Por Tipo Proceso Empresa Produ ", jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
		jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoOrdenDetaProduMano.setLayout(gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		jPanelFK_IdUnidadProductoOrdenDetaProduMano.add(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMano.add(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMano.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMano.gridx =1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMano.add(jButtonFK_IdUnidadProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);

		jTabbedPaneBusquedasProductoOrdenDetaProduMano.addTab("4.-Por Unad ", jPanelFK_IdUnidadProductoOrdenDetaProduMano);
		jTabbedPaneBusquedasProductoOrdenDetaProduMano.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMano);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMano.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;		
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);								
		
		
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/		
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMano.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
				
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMano = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMano.setLayout(gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMano);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoOrdenDetaProduMano() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMano = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setName("jPanelReporteDinamicoProductoOrdenDetaProduMano"); 
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.setLayout(gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMano);
		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelColumnasSelectReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoOrdenDetaProduMano = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoOrdenDetaProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano=new JScrollPane(this.jListColumnasSelectReporteProductoOrdenDetaProduMano);
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMano.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMano = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMano=new JScrollPane(this.jListRelacionesSelectReporteProductoOrdenDetaProduMano);
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMano.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMano.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMano.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMano = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelConGraficoDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMano = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMano.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano=new JScrollPane(this.jListColumnasValoresGraficoProductoOrdenDetaProduMano);
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMano.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.setToolTipText("Generar EXCEL"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano.setToolTipText("Generar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMano.add(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMano = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano= new JScrollPane(jPanelReporteDinamicoProductoOrdenDetaProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMano);
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getContentPane().add(this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoOrdenDetaProduMano() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoOrdenDetaProduMano = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoOrdenDetaProduMano.setName("jPanelImportacionProductoOrdenDetaProduMano"); 
		
		this.jPanelImportacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoOrdenDetaProduMano.setLayout(gridaBagLayoutImportacionProductoOrdenDetaProduMano);
		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoOrdenDetaProduMano= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMano = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMano.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelArchivoImportacionProductoOrdenDetaProduMano.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jLabelArchivoImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoOrdenDetaProduMano = new JFileChooser();		
		this.jFileChooserImportacionProductoOrdenDetaProduMano.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonAbrirImportacionProductoOrdenDetaProduMano.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoOrdenDetaProduMano,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMano.setToolTipText("Generar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jButtonAbrirImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jLabelPathArchivoImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonGenerarImportacionProductoOrdenDetaProduMano.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoOrdenDetaProduMano,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMano.setToolTipText("Generar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jButtonGenerarImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonCerrarImportacionProductoOrdenDetaProduMano.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoOrdenDetaProduMano,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoOrdenDetaProduMano.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMano.add(this.jButtonCerrarImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMano = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMano= new JScrollPane(jPanelImportacionProductoOrdenDetaProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMano);
		this.jInternalFrameImportacionProductoOrdenDetaProduMano.getContentPane().add(this.jScrollPanelImportacionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoOrdenDetaProduMano(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano = new JButtonMe();
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setText("Orden");
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMano,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoOrdenDetaProduMano";
			inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoOrdenDetaProduMano"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoOrdenDetaProduMano = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoOrdenDetaProduMano.setName("jPanelOrderByProductoOrdenDetaProduMano"); 
			
			this.jPanelOrderByProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoOrdenDetaProduMano.setLayout(gridaBagLayoutOrderByProductoOrdenDetaProduMano);
			
			
			this.jTableDatosProductoOrdenDetaProduManoOrderBy = new JTableMe();        
			this.jTableDatosProductoOrdenDetaProduManoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduManoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrdenDetaProduManoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrdenDetaProduManoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrdenDetaProduManoOrderBy.setViewportView(this.jTableDatosProductoOrdenDetaProduManoOrderBy);
			this.jTableDatosProductoOrdenDetaProduManoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrdenDetaProduManoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoOrdenDetaProduMano= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoOrdenDetaProduMano= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoOrdenDetaProduMano = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMano= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setTitle("Orden");
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setResizable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setClosable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoOrdenDetaProduMano.ipady =150;
				
			this.jPanelOrderByProductoOrdenDetaProduMano.add(jScrollPanelDatosProductoOrdenDetaProduManoOrderBy, this.gridBagConstraintsProductoOrdenDetaProduMano);//this.jTableDatosProductoOrdenDetaProduManoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoOrdenDetaProduMano = new JButtonMe();
			this.jButtonCerrarOrderByProductoOrdenDetaProduMano.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoOrdenDetaProduMano,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoOrdenDetaProduMano.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoOrdenDetaProduMano.add(this.jButtonCerrarOrderByProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMano = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMano= new JScrollPane(jPanelOrderByProductoOrdenDetaProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMano);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getContentPane().add(this.jScrollPanelOrderByProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
		
		} else {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano = new JButtonMe();
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
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoOrdenDetaProduMano.getRowHeight();//ProductoOrdenDetaProduManoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMano.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoOrdenDetaProduMano!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy()!=null) {
			//if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumanos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoOrdenDetaProduMano> TraerProductoOrdenDetaProduManoBeans(List<ProductoOrdenDetaProduMano> productoordendetaprodumanos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanos) {
					
				if(!(ProductoOrdenDetaProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoOrdenDetaProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoordendetaprodumano.setsDetalleGeneralEntityReporte(ProductoOrdenDetaProduManoConstantesFunciones.getProductoOrdenDetaProduManoDescripcion(productoordendetaprodumano));
										
						
					
						
					
				} else  {
							
					//productoordendetaprodumano.setsDetalleGeneralEntityReporte(productoordendetaprodumano.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoordendetaprodumanobeans.add(productoordendetaprodumanobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoordendetaprodumanos;
    }
	//PARA REPORTES FIN
}
