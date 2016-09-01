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
import com.bydan.erp.produccion.util.ProductoProduMaquinaConstantesFunciones;

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
public class ProductoProduMaquinaJInternalFrame extends ProductoProduMaquinaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProduMaquina;
	
	protected JMenuBar jmenuBarProductoProduMaquina;
	
	protected JMenu jmenuProductoProduMaquina;
	protected JMenu jmenuDatosProductoProduMaquina;
	protected JMenu jmenuArchivoProductoProduMaquina;
	protected JMenu jmenuAccionesProductoProduMaquina;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMaquina;	
	protected GridBagConstraints gridBagConstraintsProductoProduMaquina;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProduMaquinaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProduMaquina;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProduMaquina;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProduMaquina;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoareaempresaprodu="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomaquinaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
		
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProduMaquina> productoprodumaquinas;		
	public List<ProductoProduMaquina> productoprodumaquinasEliminados;	
	public List<ProductoProduMaquina> productoprodumaquinasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProduMaquina;		
	protected JButton jButtonAbrirOrderByProductoProduMaquina;
	
	
	//protected JPanel jPanelOrderByProductoProduMaquina;
	//public JScrollPane jScrollPanelOrderByProductoProduMaquina;	
	//protected JButton jButtonCerrarOrderByProductoProduMaquina;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProduMaquinaLogic productoprodumaquinaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProduMaquina;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMaquina;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMaquina;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProduMaquinaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProduMaquina;
	//public JScrollPane jScrollPanelImportacionProductoProduMaquina;
	
	
	
	protected JPanel jPanelAccionesProductoProduMaquina;
	
    protected JPanel jPanelPaginacionProductoProduMaquina;
    protected JPanel jPanelParametrosReportesProductoProduMaquina;
	protected JPanel jPanelParametrosReportesAccionesProductoProduMaquina;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProduMaquina;
	protected JPanel jPanelParametrosAuxiliar2ProductoProduMaquina;
	protected JPanel jPanelParametrosAuxiliar3ProductoProduMaquina;
	protected JPanel jPanelParametrosAuxiliar4ProductoProduMaquina;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProduMaquina;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProduMaquina;
	//protected JPanel jPanelImportacionProductoProduMaquina;
	
	
	public JTable jTableDatosProductoProduMaquina;
	
	
	
	//public JTable jTableDatosProductoProduMaquinaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProduMaquina;
	protected JButton jButtonDuplicarProductoProduMaquina;
	protected JButton jButtonCopiarProductoProduMaquina;
	protected JButton jButtonVerFormProductoProduMaquina;
	protected JButton jButtonNuevoRelacionesProductoProduMaquina;
	protected JButton jButtonModificarProductoProduMaquina;
	
    protected JButton jButtonGuardarCambiosTablaProductoProduMaquina;
	protected JButton jButtonCerrarProductoProduMaquina;
	
	
	protected JButton jButtonRecargarInformacionProductoProduMaquina;
	protected JButton jButtonProcesarInformacionProductoProduMaquina;
	
	
	protected JButton jButtonAnterioresProductoProduMaquina;
	protected JButton jButtonSiguientesProductoProduMaquina;
	protected JButton jButtonNuevoGuardarCambiosProductoProduMaquina;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProduMaquina;
	//protected JButton jButtonCerrarReporteDinamicoProductoProduMaquina;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProduMaquina;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProduMaquina;
	//protected JButton jButtonGenerarImportacionProductoProduMaquina;
	//protected JButton jButtonCerrarImportacionProductoProduMaquina;
	//protected JFileChooser jFileChooserImportacionProductoProduMaquina;
	//protected File fileImportacionProductoProduMaquina;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMaquina;
	protected JButton jButtonDuplicarToolBarProductoProduMaquina;
	protected JButton jButtonNuevoRelacionesToolBarProductoProduMaquina;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProduMaquina;
	protected JButton jButtonCopiarToolBarProductoProduMaquina;
	protected JButton jButtonVerFormToolBarProductoProduMaquina;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProduMaquina;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMaquina;
	protected JButton jButtonCerrarToolBarProductoProduMaquina;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProduMaquina;
	protected JButton jButtonProcesarInformacionToolBarProductoProduMaquina;
	protected JButton jButtonAnterioresToolBarProductoProduMaquina;
	protected JButton jButtonSiguientesToolBarProductoProduMaquina;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProduMaquina;
	protected JButton jButtonAbrirOrderByToolBarProductoProduMaquina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMaquina;
	protected JMenuItem jMenuItemDuplicarProductoProduMaquina;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProduMaquina;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProduMaquina;
	protected JMenuItem jMenuItemCopiarProductoProduMaquina;
	protected JMenuItem jMenuItemVerFormProductoProduMaquina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMaquina;
	protected JMenuItem jMenuItemCerrarProductoProduMaquina;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMaquina;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProduMaquina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMaquina;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProduMaquina;
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMaquina;
	protected JMenuItem jMenuItemAnterioresProductoProduMaquina;
	protected JMenuItem jMenuItemSiguientesProductoProduMaquina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMaquina;
	protected JMenuItem jMenuItemAbrirOrderByProductoProduMaquina;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMaquina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMaquina;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProduMaquina;
	protected JCheckBox jCheckBoxSeleccionadosProductoProduMaquina;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProduMaquina;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProduMaquina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProduMaquina;
	protected JTextField jTextFieldValorCampoGeneralProductoProduMaquina;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProduMaquina;
	//public JList<Reporte> jListColumnasSelectReporteProductoProduMaquina;
	//public JScrollPane jScrollColumnasSelectReporteProductoProduMaquina;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProduMaquina;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProduMaquina;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProduMaquina;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProduMaquina;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProduMaquina;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProduMaquina;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProduMaquina;
	
		
	//public JLabel jLabelArchivoImportacionProductoProduMaquina;	
	//public JLabel jLabelPathArchivoImportacionProductoProduMaquina;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProduMaquina;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProduMaquina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProduMaquina;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProduMaquina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProduMaquina;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProduMaquina;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProduMaquina;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProduMaquina;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProduMaquina;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProduMaquina;
	public JPanel jPanelFK_IdProductoDefiProduProductoProduMaquina;
	public JButton jButtonFK_IdProductoDefiProduProductoProduMaquina;
	public JPanel jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina;
	public JButton jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina;
	public JPanel jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina;
	public JButton jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina;
	public JPanel jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina;
	public JButton jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina;
	public JPanel jPanelFK_IdUnidadProductoProduMaquina;
	public JButton jButtonFK_IdUnidadProductoProduMaquina;
	
	public JPanel jPanelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina;
	public JLabel jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina;
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina;
	public JLabel jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina;
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina;
	public JLabel jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina;
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina;
	public JLabel jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina;
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoProduMaquina;
	public JLabel jLabelid_unidadFK_IdUnidadProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoProduMaquina;
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMaquinaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoProduMaquinaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProduMaquina)	{
		this.jButtonRecargarInformacionProductoProduMaquina = jButtonRecargarInformacionProductoProduMaquina;
	}
	
	public JButton getjButtonProcesarInformacionProductoProduMaquina() {
		return this.jButtonProcesarInformacionProductoProduMaquina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMaquina)	{
		this.jButtonProcesarInformacionProductoProduMaquina = jButtonProcesarInformacionProductoProduMaquina;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProduMaquina() {
		return this.jButtonRecargarInformacionProductoProduMaquina;
	}
	
	
	public List<ProductoProduMaquina> getproductoprodumaquinas() {
		return this.productoprodumaquinas;
	}

	public void setproductoprodumaquinas(List<ProductoProduMaquina> productoprodumaquinas) {
		this.productoprodumaquinas = productoprodumaquinas;
	}
	
	public List<ProductoProduMaquina> getproductoprodumaquinasAux() {
		return this.productoprodumaquinasAux;
	}

	public void setproductoprodumaquinasAux(List<ProductoProduMaquina> productoprodumaquinasAux) {
		this.productoprodumaquinasAux = productoprodumaquinasAux;
	}
	
	public List<ProductoProduMaquina> getproductoprodumaquinasEliminados() {
		return this.productoprodumaquinasEliminados;
	}

	public void setProductoProduMaquinasEliminados(List<ProductoProduMaquina> productoprodumaquinasEliminados) {
		this.productoprodumaquinasEliminados = productoprodumaquinasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProduMaquina() {
		return jComboBoxTiposSeleccionarProductoProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProduMaquina(
			JComboBox jComboBoxTiposSeleccionarProductoProduMaquina) {
		this.jComboBoxTiposSeleccionarProductoProduMaquina = jComboBoxTiposSeleccionarProductoProduMaquina;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProduMaquina() {
		return jTextFieldValorCampoGeneralProductoProduMaquina;
	}

	public void setjTextFieldValorCampoGeneralProductoProduMaquina(
			JTextField jTextFieldValorCampoGeneralProductoProduMaquina) {
		this.jTextFieldValorCampoGeneralProductoProduMaquina = jTextFieldValorCampoGeneralProductoProduMaquina;
	}

	public void setBorderResaltarValorCampoGeneralProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProduMaquina .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProduMaquina() {
		return this.jCheckBoxSeleccionarTodosProductoProduMaquina;
	}

	public void setjCheckBoxSeleccionarTodosProductoProduMaquina(
			JCheckBox jCheckBoxSeleccionarTodosProductoProduMaquina) {
		this.jCheckBoxSeleccionarTodosProductoProduMaquina = jCheckBoxSeleccionarTodosProductoProduMaquina;
	}

	public void setBorderResaltarSeleccionarTodosProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProduMaquina() {
		return this.jCheckBoxSeleccionadosProductoProduMaquina;
	}

	public void setjCheckBoxSeleccionadosProductoProduMaquina(
			JCheckBox jCheckBoxSeleccionadosProductoProduMaquina) {
		this.jCheckBoxSeleccionadosProductoProduMaquina = jCheckBoxSeleccionadosProductoProduMaquina;
	}
	
	public void setBorderResaltarSeleccionadosProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProduMaquina() {
		return this.jComboBoxTiposArchivosReportesProductoProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProduMaquina(
			JComboBox jComboBoxTiposArchivosReportesProductoProduMaquina) {
		this.jComboBoxTiposArchivosReportesProductoProduMaquina = jComboBoxTiposArchivosReportesProductoProduMaquina;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProduMaquina() {
		return this.jComboBoxTiposReportesProductoProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProduMaquina(
			JComboBox jComboBoxTiposReportesProductoProduMaquina) {
		this.jComboBoxTiposReportesProductoProduMaquina = jComboBoxTiposReportesProductoProduMaquina;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProduMaquina() {
	//	return jComboBoxTiposReportesDinamicoProductoProduMaquina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProduMaquina(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProduMaquina) {
	//	this.jComboBoxTiposReportesDinamicoProductoProduMaquina = jComboBoxTiposReportesDinamicoProductoProduMaquina;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProduMaquina() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProduMaquina(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina = jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina;
	//}
	
	public void setBorderResaltarTiposReportesProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProduMaquina() {
		return this.jComboBoxTiposGraficosReportesProductoProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProduMaquina(
			JComboBox jComboBoxTiposGraficosReportesProductoProduMaquina) {
		this.jComboBoxTiposGraficosReportesProductoProduMaquina = jComboBoxTiposGraficosReportesProductoProduMaquina;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProduMaquina() {
		return this.jComboBoxTiposPaginacionProductoProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProduMaquina(
			JComboBox jComboBoxTiposPaginacionProductoProduMaquina) {
		this.jComboBoxTiposPaginacionProductoProduMaquina = jComboBoxTiposPaginacionProductoProduMaquina;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProduMaquina() {
		return this.jComboBoxTiposRelacionesProductoProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMaquina() {
		return this.jComboBoxTiposAccionesProductoProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMaquina(
			JComboBox jComboBoxTiposRelacionesProductoProduMaquina) {
		this.jComboBoxTiposRelacionesProductoProduMaquina = jComboBoxTiposRelacionesProductoProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMaquina(
			JComboBox jComboBoxTiposAccionesProductoProduMaquina) {
		this.jComboBoxTiposAccionesProductoProduMaquina = jComboBoxTiposAccionesProductoProduMaquina;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProduMaquina .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProduMaquina() {
	//	return jCheckBoxConGraficoDinamicoProductoProduMaquina;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProduMaquina(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProduMaquina) {
	//	this.jCheckBoxConGraficoDinamicoProductoProduMaquina = jCheckBoxConGraficoDinamicoProductoProduMaquina;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProduMaquina() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProduMaquina.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProduMaquina .setBorder(borderResaltar);		
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
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumaquinaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduMaquinaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Maquina Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProduMaquina= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"nuevo","nuevo","Nuevo"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"duplicar","duplicar","Duplicar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"copiar","copiar","Copiar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"ver_form","ver_form","Ver"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"recargar","recargar","Recargar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProduMaquina,this.jTtoolBarProductoProduMaquina,
							"cerrar","cerrar","Salir"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProduMaquina=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProduMaquina;
			
				this.jButtonProcesarInformacionToolBarProductoProduMaquina=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProduMaquina;
				
		//protected JButton jButtonModificarToolBarProductoProduMaquina;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProduMaquina=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProduMaquina=new JMenuMe("General");
		this.jmenuArchivoProductoProduMaquina=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProduMaquina=new JMenuMe("Acciones");
		this.jmenuDatosProductoProduMaquina=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMaquina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMaquina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMaquina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProduMaquina= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProduMaquina.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProduMaquina,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProduMaquina= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProduMaquina.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProduMaquina,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProduMaquina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMaquina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMaquina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProduMaquina= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProduMaquina.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProduMaquina,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProduMaquina= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProduMaquina.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProduMaquina,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProduMaquina= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProduMaquina.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProduMaquina,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProduMaquina= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProduMaquina.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProduMaquina,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProduMaquina= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProduMaquina.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProduMaquina,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProduMaquina= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProduMaquina.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProduMaquina,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProduMaquina= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProduMaquina.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProduMaquina,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProduMaquina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProduMaquina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProduMaquina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProduMaquina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProduMaquina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProduMaquina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProduMaquina= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProduMaquina.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProduMaquina,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProduMaquina.add(this.jMenuItemCerrarProductoProduMaquina);
			
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemNuevoProductoProduMaquina);
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemNuevoGuardarCambiosProductoProduMaquina);
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemNuevoRelacionesProductoProduMaquina);
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemGuardarCambiosTablaProductoProduMaquina);		
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemDuplicarProductoProduMaquina);		
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemCopiarProductoProduMaquina);		
			this.jmenuAccionesProductoProduMaquina.add(this.jMenuItemVerFormProductoProduMaquina);		
			
			this.jmenuDatosProductoProduMaquina.add(this.jMenuItemRecargarInformacionProductoProduMaquina);				
			this.jmenuDatosProductoProduMaquina.add(this.jMenuItemAnterioresProductoProduMaquina);				
			this.jmenuDatosProductoProduMaquina.add(this.jMenuItemSiguientesProductoProduMaquina);				
			this.jmenuDatosProductoProduMaquina.add(this.jMenuItemAbrirOrderByProductoProduMaquina);				
			this.jmenuDatosProductoProduMaquina.add(this.jMenuItemMostrarOcultarProductoProduMaquina);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProduMaquina.add(this.jMenuItemGuardarCambiosProductoProduMaquina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProduMaquina.add(this.jmenuArchivoProductoProduMaquina);		
			this.jmenuBarProductoProduMaquina.add(this.jmenuAccionesProductoProduMaquina);		
			this.jmenuBarProductoProduMaquina.add(this.jmenuDatosProductoProduMaquina);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProduMaquina);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProduMaquina() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProductoDefiProduProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDefiProduProductoProduMaquina.setToolTipText("Buscar Por Producto Defi Produ ");
		this.jButtonFK_IdProductoDefiProduProductoProduMaquina= new JButtonMe();
		this.jButtonFK_IdProductoDefiProduProductoProduMaquina.setText("Buscar");
		this.jButtonFK_IdProductoDefiProduProductoProduMaquina.setToolTipText("Buscar Por Producto Defi Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDefiProduProductoProduMaquina,"buscar_button","Buscar Por Producto Defi Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDefiProduProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina = new JLabelMe();
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setText("Producto Defi Produ :");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setToolTipText("Producto Defi Produ");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina.setToolTipText("Buscar Por Tipo Area Empresa Produ ");
		this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina.setToolTipText("Buscar Por Tipo Area Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina,"buscar_button","Buscar Por Tipo Area Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina = new JLabelMe();
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setText("Tipo Area Empresa Produ :");
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setToolTipText("Tipo Area Empresa Produ");
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina.setToolTipText("Buscar Por Tipo Merma Empresa ");
		this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina.setToolTipText("Buscar Por Tipo Merma Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina,"buscar_button","Buscar Por Tipo Merma Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina = new JLabelMe();
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setText("Tipo Merma Empresa :");
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setToolTipText("Tipo Merma Empresa");
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina,"buscar_button","Buscar Por Tipo Proceso Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina = new JLabelMe();
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setText("Tipo Proceso Empresa Produ :");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setToolTipText("Tipo Proceso Empresa Produ");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoProduMaquina.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoProduMaquina= new JButtonMe();
		this.jButtonFK_IdUnidadProductoProduMaquina.setText("Buscar");
		this.jButtonFK_IdUnidadProductoProduMaquina.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoProduMaquina,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoProduMaquina = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoProduMaquina.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoProduMaquina.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoProduMaquina=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProduMaquina.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMaquina.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMaquina.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProduMaquina = new ProductoProduMaquinaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Maquina Produccion DATOS");
			this.jInternalFrameDetalleFormProductoProduMaquina = new ProductoProduMaquinaDetalleFormJInternalFrame(jDesktopPane,this.productoprodumaquinaSessionBean.getConGuardarRelaciones(),this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProduMaquina = null;//new ProductoProduMaquinaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMaquina= new GridBagLayout();
		
		
		this.jTableDatosProductoProduMaquina = new JTableMe();      
		
		String sToolTipProductoProduMaquina="";
		sToolTipProductoProduMaquina=ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMaquina+="(Produccion.ProductoProduMaquina)";
		}
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMaquina+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProduMaquina.setToolTipText(sToolTipProductoProduMaquina);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProduMaquina);
		this.jTableDatosProductoProduMaquina.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProduMaquina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProduMaquina.setRowSelectionAllowed(true);
		this.jTableDatosProductoProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProduMaquina = new JButtonMe();
		this.jButtonDuplicarProductoProduMaquina = new JButtonMe();
		this.jButtonCopiarProductoProduMaquina = new JButtonMe();
		this.jButtonVerFormProductoProduMaquina = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProduMaquina = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina = new JButtonMe();
		this.jButtonCerrarProductoProduMaquina = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMaquina = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProduMaquina = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Maquina Produccion";
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMaquina.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProduMaquina=new ReporteDinamicoJInternalFrame(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProduMaquina();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProduMaquina=new ImportacionJInternalFrame(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProduMaquina();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProduMaquina = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProduMaquina.setText("Orden");
		this.jButtonAbrirOrderByProductoProduMaquina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMaquina,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMaquina,false,this);
			
			//this.cargarOrderByProductoProduMaquina(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMaquina,true,this);
			
			//this.cargarOrderByProductoProduMaquina(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProduMaquina.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoProduMaquina.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoProduMaquina.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProductoProduMaquina.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMaquina.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMaquina.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProduMaquina.setText("Nuevo");
		this.jButtonDuplicarProductoProduMaquina.setText("Duplicar");
		this.jButtonCopiarProductoProduMaquina.setText("Copiar");
		this.jButtonVerFormProductoProduMaquina.setText("Ver");
		this.jButtonNuevoRelacionesProductoProduMaquina.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.setText("Guardar");
		this.jButtonCerrarProductoProduMaquina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMaquina,"nuevo_button","Nuevo",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProduMaquina,"duplicar_button","Duplicar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProduMaquina,"copiar_button","Copiar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProduMaquina,"ver_form","Ver",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProduMaquina,"nuevorelaciones_button","Nuevo Rel",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMaquina,"guardarcambiostabla_button","Guardar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMaquina,"cerrar_button","Salir",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProduMaquina.setToolTipText("Nuevo"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProduMaquina.setToolTipText("Duplicar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProduMaquina.setToolTipText("Copiar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProduMaquina.setToolTipText("Ver"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProduMaquina.setToolTipText("Nuevo Rel"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.setToolTipText("Guardar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMaquina.setToolTipText("Salir"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMaquina";
		inputMap = this.jButtonNuevoProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMaquina"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProduMaquina";
		inputMap = this.jButtonDuplicarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProduMaquina"));
		
		//COPIAR
		sMapKey = "CopiarProductoProduMaquina";
		inputMap = this.jButtonCopiarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProduMaquina"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProduMaquina";
		inputMap = this.jButtonVerFormProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProduMaquina"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProduMaquina";
		inputMap = this.jButtonNuevoRelacionesProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProduMaquina"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProduMaquina";
		inputMap = this.jButtonModificarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProduMaquina"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMaquina";
		inputMap = this.jButtonCerrarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMaquina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMaquina";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMaquina"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProduMaquina.setName("jPanelParametrosReportesProductoProduMaquina"); 
		
		this.jPanelParametrosReportesAccionesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProduMaquina.setName("jPanelParametrosReportesAccionesProductoProduMaquina"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProduMaquina = new JButtonMe();
		this.jButtonRecargarInformacionProductoProduMaquina.setText("Recargar");
		this.jButtonRecargarInformacionProductoProduMaquina.setToolTipText("Recargar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProduMaquina,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProduMaquina = new JButtonMe();
		this.jButtonProcesarInformacionProductoProduMaquina.setText("Procesar");
		this.jButtonProcesarInformacionProductoProduMaquina.setToolTipText("Procesar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProduMaquina.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProduMaquina.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMaquina.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMaquina.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMaquina.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProduMaquina.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMaquina.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProduMaquina.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMaquina.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProduMaquina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProduMaquina.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProduMaquina.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProduMaquina.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProduMaquina.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMaquina.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMaquina.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProduMaquina.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProduMaquina.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProduMaquina=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProduMaquina.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMaquina.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMaquina.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProduMaquina = new JLabelMe();
		
		this.jLabelAccionesProductoProduMaquina.setText("Acciones");		
		this.jLabelAccionesProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProduMaquina.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProduMaquina.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProduMaquina = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProduMaquina.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProduMaquina.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProduMaquina = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProduMaquina.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProduMaquina.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProduMaquina = new JButtonMe();
		//this.jButtonAnterioresProductoProduMaquina.setText("<<");
        this.jButtonAnterioresProductoProduMaquina.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProduMaquina,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProduMaquina = new JButtonMe();
		//this.jButtonSiguientesProductoProduMaquina.setText(">>");
        this.jButtonSiguientesProductoProduMaquina.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProduMaquina,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProduMaquina = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProduMaquina.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProduMaquina.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProduMaquina,"nuevoguardarcambios_button","Nue",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProduMaquina";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProduMaquina"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProduMaquina";
		inputMap = this.jButtonRecargarInformacionProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProduMaquina"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProduMaquina";
		inputMap = this.jButtonSiguientesProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProduMaquina"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProduMaquina";
		inputMap = this.jButtonAnterioresProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProduMaquina"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProduMaquina();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProduMaquina.setMinimumSize(new Dimension(this.getWidth(),ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMaquina.setMaximumSize(new Dimension(this.getWidth(),ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMaquina.setPreferredSize(new Dimension(this.getWidth(),ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProduMaquina = new GridBagLayout();

			this.jPanelPaginacionProductoProduMaquina.setLayout(gridaBagLayoutPaginacionProductoProduMaquina);						
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 0;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonAnterioresProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					
						
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMaquina.gridy = 0;
			
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonNuevoGuardarCambiosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
						
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMaquina.gridy = 0;
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonSiguientesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonNuevoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
						
			
			
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProduMaquina.gridy = 1;
				this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProduMaquina.add(this.jButtonGuardarCambiosTablaProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			}
			
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonDuplicarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonCopiarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonVerFormProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProduMaquina.add(this.jButtonCerrarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		
		this.jButtonRecargarInformacionProductoProduMaquina.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMaquina.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMaquina.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProduMaquina.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMaquina.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMaquina.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProduMaquina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMaquina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMaquina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProduMaquina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMaquina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMaquina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProduMaquina.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMaquina.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMaquina.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProduMaquina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMaquina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMaquina.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProduMaquina.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMaquina.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMaquina.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProduMaquina = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProduMaquina = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProduMaquina.setLayout(gridaBagParametrosReportesProductoProduMaquina);
			this.jPanelParametrosReportesAccionesProductoProduMaquina.setLayout(gridaBagParametrosReportesAccionesProductoProduMaquina);
			
			
			this.jPanelParametrosAuxiliar1ProductoProduMaquina.setLayout(gridaBagParametrosAuxiliar1ProductoProduMaquina);
			this.jPanelParametrosAuxiliar2ProductoProduMaquina.setLayout(gridaBagParametrosAuxiliar2ProductoProduMaquina);
			this.jPanelParametrosAuxiliar3ProductoProduMaquina.setLayout(gridaBagParametrosAuxiliar3ProductoProduMaquina);
			this.jPanelParametrosAuxiliar4ProductoProduMaquina.setLayout(gridaBagParametrosAuxiliar4ProductoProduMaquina);
			//this.jPanelParametrosAuxiliar5ProductoProduMaquina.setLayout(gridaBagParametrosAuxiliar2ProductoProduMaquina);			
			
			
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jButtonRecargarInformacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMaquina.add(this.jComboBoxTiposPaginacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMaquina.add(this.jCheckBoxConAltoMaximoTablaProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMaquina.add(this.jComboBoxTiposArchivosReportesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jPanelParametrosAuxiliar1ProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProduMaquina.add(this.jComboBoxTiposReportesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);																		
			
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProduMaquina.add(this.jComboBoxTiposGraficosReportesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jPanelParametrosAuxiliar4ProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jComboBoxTiposReportesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jCheckBoxGenerarReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jPanelParametrosAuxiliar2ProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jLabelAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProduMaquina.add(this.jButtonAbrirOrderByProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jComboBoxTiposSeleccionarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			
			
			/*
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jCheckBoxSeleccionarTodosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jCheckBoxConGraficoReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMaquina.add(this.jCheckBoxSeleccionarTodosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);															
				
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMaquina.add(this.jCheckBoxSeleccionadosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);															
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMaquina.add(this.jCheckBoxConGraficoReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jPanelParametrosAuxiliar3ProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jComboBoxTiposAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
	
				
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMaquina.add(this.jTextFieldValorCampoGeneralProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProduMaquina = new GridBagLayout();

			this.jScrollPanelDatosProductoProduMaquina.setLayout(gridaBagLayoutDatosProductoProduMaquina);
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = 0;
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;
			
			this.jScrollPanelDatosProductoProduMaquina.add(this.jTableDatosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProduMaquina.setViewportView(this.jTableDatosProductoProduMaquina);
		this.jTableDatosProductoProduMaquina.setFillsViewportHeight(true);
		this.jTableDatosProductoProduMaquina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMaquina= new GridBagLayout();
		this.jPanelAccionesProductoProduMaquina.setLayout(gridaBagLayoutAccionesProductoProduMaquina);
		
		
		/*	
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
			
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonNuevoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDefiProduProductoProduMaquina.setLayout(gridaBagLayoutFK_IdProductoDefiProduProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 0;
		jPanelFK_IdProductoDefiProduProductoProduMaquina.add(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 1;
		jPanelFK_IdProductoDefiProduProductoProduMaquina.add(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 1;
		gridBagConstraintsProductoProduMaquina.gridx =1;
		jPanelFK_IdProductoDefiProduProductoProduMaquina.add(jButtonFK_IdProductoDefiProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		jTabbedPaneBusquedasProductoProduMaquina.addTab("1.-Por Producto Defi Produ ", jPanelFK_IdProductoDefiProduProductoProduMaquina);
		jTabbedPaneBusquedasProductoProduMaquina.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina.setLayout(gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 0;
		jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina.add(jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 1;
		jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina.add(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 1;
		gridBagConstraintsProductoProduMaquina.gridx =1;
		jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina.add(jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		jTabbedPaneBusquedasProductoProduMaquina.addTab("2.-Por Tipo Area Empresa Produ ", jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);
		jTabbedPaneBusquedasProductoProduMaquina.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina.setLayout(gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 0;
		jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina.add(jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 1;
		jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina.add(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 1;
		gridBagConstraintsProductoProduMaquina.gridx =1;
		jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina.add(jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		jTabbedPaneBusquedasProductoProduMaquina.addTab("3.-Por Tipo Merma Empresa ", jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);
		jTabbedPaneBusquedasProductoProduMaquina.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setLayout(gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 0;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina.add(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina.add(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 1;
		gridBagConstraintsProductoProduMaquina.gridx =1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina.add(jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		jTabbedPaneBusquedasProductoProduMaquina.addTab("4.-Por Tipo Proceso Empresa Produ ", jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
		jTabbedPaneBusquedasProductoProduMaquina.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoProduMaquina.setLayout(gridaBagLayoutFK_IdUnidadProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 0;
		jPanelFK_IdUnidadProductoProduMaquina.add(jLabelid_unidadFK_IdUnidadProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 0;
		gridBagConstraintsProductoProduMaquina.gridx = 1;
		jPanelFK_IdUnidadProductoProduMaquina.add(jComboBoxid_unidadFK_IdUnidadProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMaquina.gridy = 1;
		gridBagConstraintsProductoProduMaquina.gridx =1;
		jPanelFK_IdUnidadProductoProduMaquina.add(jButtonFK_IdUnidadProductoProduMaquina, gridBagConstraintsProductoProduMaquina);

		jTabbedPaneBusquedasProductoProduMaquina.addTab("5.-Por Unad ", jPanelFK_IdUnidadProductoProduMaquina);
		jTabbedPaneBusquedasProductoProduMaquina.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMaquina);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;		
			//this.gridBagConstraintsProductoProduMaquina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMaquina.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;		
		//this.gridBagConstraintsProductoProduMaquina.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProduMaquina);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;		
			this.gridBagConstraintsProductoProduMaquina.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProduMaquina.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);								
		
		
		/*
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		*/		
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMaquina.gridx =0;
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMaquina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
				
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMaquina = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProduMaquina.setLayout(gridaBagLayoutBusquedasParametrosProductoProduMaquina);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProduMaquina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProduMaquina;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProduMaquina() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProduMaquina = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProduMaquina.setName("jPanelReporteDinamicoProductoProduMaquina"); 
		
		this.jPanelReporteDinamicoProductoProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProduMaquina.setLayout(gridaBagLayoutReporteDinamicoProductoProduMaquina);
		
		
		this.jInternalFrameReporteDinamicoProductoProduMaquina= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProduMaquina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMaquina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProduMaquina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProduMaquina.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProduMaquina.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMaquina.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMaquina.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProduMaquina = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProduMaquina.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelColumnasSelectReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProduMaquina = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProduMaquina.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProduMaquina=new JScrollPane(this.jListColumnasSelectReporteProductoProduMaquina);
			
			this.jScrollColumnasSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProduMaquina.add(this.jListColumnasSelectReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jScrollColumnasSelectReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProduMaquina = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProduMaquina.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProduMaquina = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProduMaquina.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProduMaquina=new JScrollPane(this.jListRelacionesSelectReporteProductoProduMaquina);
			
			this.jScrollRelacionesSelectReporteProductoProduMaquina.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMaquina.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMaquina.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProduMaquina = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProduMaquina = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProduMaquina = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProduMaquina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProduMaquina = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProduMaquina.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelConGraficoDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProduMaquina.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProduMaquina.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProduMaquina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMaquina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMaquina.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jCheckBoxConGraficoDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProduMaquina = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProduMaquina.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelColumnaCategoriaGraficoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProduMaquina = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProduMaquina.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelColumnaCategoriaValorProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProduMaquina.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jComboBoxColumnaCategoriaValorProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProduMaquina = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProduMaquina.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelColumnasValoresGraficoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProduMaquina = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProduMaquina.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProduMaquina=new JScrollPane(this.jListColumnasValoresGraficoProductoProduMaquina);
			
			this.jScrollColumnasValoresGraficoProductoProduMaquina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMaquina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMaquina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProduMaquina.add(this.jListColumnasSelectReporteProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jScrollColumnasValoresGraficoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelTiposGraficosReportesDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMaquina.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelGenerarExcelReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina.setToolTipText("Generar EXCEL"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProduMaquina.add(this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jComboBoxTiposReportesDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jLabelTiposArchivoReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProduMaquina = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProduMaquina.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProduMaquina,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProduMaquina.setToolTipText("Generar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jButtonGenerarReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProduMaquina = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProduMaquina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProduMaquina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProduMaquina.setToolTipText("Cancelar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMaquina.add(this.jButtonCerrarReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProduMaquina = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProduMaquina= new JScrollPane(jPanelReporteDinamicoProductoProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProduMaquina.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProduMaquina);
		this.jInternalFrameReporteDinamicoProductoProduMaquina.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProduMaquina() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProduMaquina = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProduMaquina.setName("jPanelImportacionProductoProduMaquina"); 
		
		this.jPanelImportacionProductoProduMaquina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMaquina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMaquina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProduMaquina.setLayout(gridaBagLayoutImportacionProductoProduMaquina);
		
		
		this.jInternalFrameImportacionProductoProduMaquina= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProduMaquina= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProduMaquina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMaquina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMaquina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProduMaquina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMaquina.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMaquina.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMaquina.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMaquina.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProduMaquina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMaquina.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMaquina.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMaquina.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProduMaquina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMaquina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMaquina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProduMaquina = new JLabelMe();

		this.jLabelArchivoImportacionProductoProduMaquina.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMaquina.add(this.jLabelArchivoImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProduMaquina = new JFileChooser();		
		this.jFileChooserImportacionProductoProduMaquina.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProduMaquina = new JButtonMe();
		this.jButtonAbrirImportacionProductoProduMaquina.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProduMaquina,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProduMaquina.setToolTipText("Generar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMaquina.add(this.jButtonAbrirImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProduMaquina = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProduMaquina.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMaquina.add(this.jLabelPathArchivoImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProduMaquina=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProduMaquina.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMaquina.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMaquina.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMaquina.add(this.jTextFieldPathArchivoImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProduMaquina = new JButtonMe();
		this.jButtonGenerarImportacionProductoProduMaquina.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProduMaquina,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProduMaquina.setToolTipText("Generar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMaquina.add(this.jButtonGenerarImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProduMaquina = new JButtonMe();
		this.jButtonCerrarImportacionProductoProduMaquina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProduMaquina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProduMaquina.setToolTipText("Cancelar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMaquina.add(this.jButtonCerrarImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProduMaquina = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProduMaquina= new JScrollPane(jPanelImportacionProductoProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProduMaquina.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProduMaquina.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProduMaquina);
		this.jInternalFrameImportacionProductoProduMaquina.getContentPane().add(this.jScrollPanelImportacionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProduMaquina(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProduMaquina = new JButtonMe();
			this.jButtonAbrirOrderByProductoProduMaquina.setText("Orden");
			this.jButtonAbrirOrderByProductoProduMaquina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMaquina,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProduMaquina";
			inputMap = this.jButtonAbrirOrderByProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProduMaquina"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProduMaquina = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProduMaquina.setName("jPanelOrderByProductoProduMaquina"); 
			
			this.jPanelOrderByProductoProduMaquina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMaquina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMaquina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProduMaquina.setLayout(gridaBagLayoutOrderByProductoProduMaquina);
			
			
			this.jTableDatosProductoProduMaquinaOrderBy = new JTableMe();        
			this.jTableDatosProductoProduMaquinaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProduMaquinaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProduMaquinaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProduMaquinaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProduMaquinaOrderBy.setViewportView(this.jTableDatosProductoProduMaquinaOrderBy);
			this.jTableDatosProductoProduMaquinaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProduMaquinaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProduMaquina= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProduMaquina= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProduMaquina = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProduMaquina= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProduMaquina.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProduMaquina.setTitle("Orden");
			this.jInternalFrameOrderByProductoProduMaquina.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProduMaquina.setResizable(true);
			this.jInternalFrameOrderByProductoProduMaquina.setClosable(true);
			this.jInternalFrameOrderByProductoProduMaquina.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProduMaquina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMaquina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMaquina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMaquina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProduMaquina.ipady =150;
				
			this.jPanelOrderByProductoProduMaquina.add(jScrollPanelDatosProductoProduMaquinaOrderBy, this.gridBagConstraintsProductoProduMaquina);//this.jTableDatosProductoProduMaquinaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProduMaquina = new JButtonMe();
			this.jButtonCerrarOrderByProductoProduMaquina.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProduMaquina,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProduMaquina.setToolTipText("Cancelar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMaquina.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProduMaquina.add(this.jButtonCerrarOrderByProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProduMaquina = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProduMaquina= new JScrollPane(jPanelOrderByProductoProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProduMaquina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProduMaquina.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProduMaquina);
			
			this.jInternalFrameOrderByProductoProduMaquina.getContentPane().add(this.jScrollPanelOrderByProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
		
		} else {
			this.jButtonAbrirOrderByProductoProduMaquina = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoprodumaquinaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProduMaquina.getRowHeight();//ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.isSelected()) {
					iHeightTable=ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMaquina.isSelected()) {
					iHeightTable=ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProduMaquina.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMaquina.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMaquina.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProduMaquina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMaquina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMaquina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProduMaquina!=null && this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy()!=null) {
			//if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProduMaquina.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProduMaquina.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProduMaquina.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProduMaquina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMaquina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMaquina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoprodumaquinaLogic.getProductoProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumaquinas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProduMaquina> TraerProductoProduMaquinaBeans(List<ProductoProduMaquina> productoprodumaquinas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProduMaquina productoprodumaquina:productoprodumaquinas) {
					
				if(!(ProductoProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoprodumaquina.setsDetalleGeneralEntityReporte(ProductoProduMaquinaConstantesFunciones.getProductoProduMaquinaDescripcion(productoprodumaquina));
										
						
					
						
					
				} else  {
							
					//productoprodumaquina.setsDetalleGeneralEntityReporte(productoprodumaquina.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoprodumaquinabeans.add(productoprodumaquinabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoprodumaquinas;
    }
	//PARA REPORTES FIN
}
