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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMermaConstantesFunciones;

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
public class ProductoOrdenDetaProduMermaJInternalFrame extends ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoOrdenDetaProduMerma;
	
	protected JMenuBar jmenuBarProductoOrdenDetaProduMerma;
	
	protected JMenu jmenuProductoOrdenDetaProduMerma;
	protected JMenu jmenuDatosProductoOrdenDetaProduMerma;
	protected JMenu jmenuArchivoProductoOrdenDetaProduMerma;
	protected JMenu jmenuAccionesProductoOrdenDetaProduMerma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMerma;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMerma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoOrdenDetaProduMerma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoOrdenDetaProduMerma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomermaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean;
		
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas;		
	public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasEliminados;	
	public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoOrdenDetaProduMerma;		
	protected JButton jButtonAbrirOrderByProductoOrdenDetaProduMerma;
	
	
	//protected JPanel jPanelOrderByProductoOrdenDetaProduMerma;
	//public JScrollPane jScrollPanelOrderByProductoOrdenDetaProduMerma;	
	//protected JButton jButtonCerrarOrderByProductoOrdenDetaProduMerma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoOrdenDetaProduMermaLogic productoordendetaprodumermaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMerma;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMerma;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMerma;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMermaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma;
	//public JScrollPane jScrollPanelImportacionProductoOrdenDetaProduMerma;
	
	
	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMerma;
	
    protected JPanel jPanelPaginacionProductoOrdenDetaProduMerma;
    protected JPanel jPanelParametrosReportesProductoOrdenDetaProduMerma;
	protected JPanel jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma;
	protected JPanel jPanelParametrosAuxiliar2ProductoOrdenDetaProduMerma;
	protected JPanel jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma;
	protected JPanel jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma;
	//protected JPanel jPanelParametrosAuxiliar5ProductoOrdenDetaProduMerma;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoOrdenDetaProduMerma;
	//protected JPanel jPanelImportacionProductoOrdenDetaProduMerma;
	
	
	public JTable jTableDatosProductoOrdenDetaProduMerma;
	
	
	
	//public JTable jTableDatosProductoOrdenDetaProduMermaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoOrdenDetaProduMerma;
	protected JButton jButtonDuplicarProductoOrdenDetaProduMerma;
	protected JButton jButtonCopiarProductoOrdenDetaProduMerma;
	protected JButton jButtonVerFormProductoOrdenDetaProduMerma;
	protected JButton jButtonNuevoRelacionesProductoOrdenDetaProduMerma;
	protected JButton jButtonModificarProductoOrdenDetaProduMerma;
	
    protected JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma;
	protected JButton jButtonCerrarProductoOrdenDetaProduMerma;
	
	
	protected JButton jButtonRecargarInformacionProductoOrdenDetaProduMerma;
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	
	
	protected JButton jButtonAnterioresProductoOrdenDetaProduMerma;
	protected JButton jButtonSiguientesProductoOrdenDetaProduMerma;
	protected JButton jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma;
	//protected JButton jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoOrdenDetaProduMerma;
	//protected JButton jButtonGenerarImportacionProductoOrdenDetaProduMerma;
	//protected JButton jButtonCerrarImportacionProductoOrdenDetaProduMerma;
	//protected JFileChooser jFileChooserImportacionProductoOrdenDetaProduMerma;
	//protected File fileImportacionProductoOrdenDetaProduMerma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonDuplicarToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonCopiarToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonVerFormToolBarProductoOrdenDetaProduMerma;
	public JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMerma;
	
	protected JButton jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonAnterioresToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonSiguientesToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonAbrirOrderByToolBarProductoOrdenDetaProduMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDuplicarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemCopiarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemVerFormProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemAnterioresProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemSiguientesProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemAbrirOrderByProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMerma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma;
	protected JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMerma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma;
	protected JCheckBox jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma;
	protected JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoOrdenDetaProduMerma;
	//public JList<Reporte> jListColumnasSelectReporteProductoOrdenDetaProduMerma;
	//public JScrollPane jScrollColumnasSelectReporteProductoOrdenDetaProduMerma;
	
	//public JLabel jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma;
	//public JList<Reporte> jListRelacionesSelectReporteProductoOrdenDetaProduMerma;
	//public JScrollPane jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoOrdenDetaProduMerma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma;
	
		
	//public JLabel jLabelArchivoImportacionProductoOrdenDetaProduMerma;	
	//public JLabel jLabelPathArchivoImportacionProductoOrdenDetaProduMerma;
	//protected JTextField jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma;
	
	//public JLabel jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma;
	
	//public JLabel jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma;
	//public JList<Reporte> jListColumnasValoresGraficoProductoOrdenDetaProduMerma;
	//public JScrollPane jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMerma;
	public JPanel jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma;
	public JButton jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma;
	public JPanel jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma;
	public JButton jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma;
	public JPanel jPanelFK_IdUnidadProductoOrdenDetaProduMerma;
	public JButton jButtonFK_IdUnidadProductoOrdenDetaProduMerma;
	
	public JPanel jPanelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma;
	public JLabel jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma;
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma;
	public JLabel jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma;
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma;
	public JLabel jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma;
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoOrdenDetaProduMermaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoOrdenDetaProduMerma)	{
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma = jButtonRecargarInformacionProductoOrdenDetaProduMerma;
	}
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMerma() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMerma)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma = jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoOrdenDetaProduMerma() {
		return this.jButtonRecargarInformacionProductoOrdenDetaProduMerma;
	}
	
	
	public List<ProductoOrdenDetaProduMerma> getproductoordendetaprodumermas() {
		return this.productoordendetaprodumermas;
	}

	public void setproductoordendetaprodumermas(List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas) {
		this.productoordendetaprodumermas = productoordendetaprodumermas;
	}
	
	public List<ProductoOrdenDetaProduMerma> getproductoordendetaprodumermasAux() {
		return this.productoordendetaprodumermasAux;
	}

	public void setproductoordendetaprodumermasAux(List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasAux) {
		this.productoordendetaprodumermasAux = productoordendetaprodumermasAux;
	}
	
	public List<ProductoOrdenDetaProduMerma> getproductoordendetaprodumermasEliminados() {
		return this.productoordendetaprodumermasEliminados;
	}

	public void setProductoOrdenDetaProduMermasEliminados(List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasEliminados) {
		this.productoordendetaprodumermasEliminados = productoordendetaprodumermasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoOrdenDetaProduMerma() {
		return jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma = jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoOrdenDetaProduMerma() {
		return jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma;
	}

	public void setjTextFieldValorCampoGeneralProductoOrdenDetaProduMerma(
			JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma) {
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma = jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma;
	}

	public void setBorderResaltarValorCampoGeneralProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma() {
		return this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma;
	}

	public void setjCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma(
			JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma) {
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma = jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma;
	}

	public void setBorderResaltarSeleccionarTodosProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoOrdenDetaProduMerma() {
		return this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma;
	}

	public void setjCheckBoxSeleccionadosProductoOrdenDetaProduMerma(
			JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMerma) {
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma = jCheckBoxSeleccionadosProductoOrdenDetaProduMerma;
	}
	
	public void setBorderResaltarSeleccionadosProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma = jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma;
	}

	public void setBorderResaltarTiposArchivosReportesProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposReportesProductoOrdenDetaProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma = jComboBoxTiposReportesProductoOrdenDetaProduMerma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma() {
	//	return jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma) {
	//	this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma = jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma = jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma;
	//}
	
	public void setBorderResaltarTiposReportesProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma = jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma = jComboBoxTiposPaginacionProductoOrdenDetaProduMerma;
	}
	
	public void setBorderResaltarTiposPaginacionProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma = jComboBoxTiposRelacionesProductoOrdenDetaProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma = jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	}
	
	public void setBorderResaltarTiposRelacionesProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoOrdenDetaProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma() {
	//	return jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma) {
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma = jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoOrdenDetaProduMerma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma .setBorder(borderResaltar);		
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
		this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		
		this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Merma MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoOrdenDetaProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoOrdenDetaProduMerma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"nuevo","nuevo","Nuevo"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"duplicar","duplicar","Duplicar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"copiar","copiar","Copiar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"ver_form","ver_form","Ver"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"recargar","recargar","Recargar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,
							"cerrar","cerrar","Salir"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma;
			
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMerma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMerma;
				
		//protected JButton jButtonModificarToolBarProductoOrdenDetaProduMerma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoOrdenDetaProduMerma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoOrdenDetaProduMerma=new JMenuMe("General");
		this.jmenuArchivoProductoOrdenDetaProduMerma=new JMenuMe("Archivo");
		this.jmenuAccionesProductoOrdenDetaProduMerma=new JMenuMe("Acciones");
		this.jmenuDatosProductoOrdenDetaProduMerma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoOrdenDetaProduMerma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoOrdenDetaProduMerma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoOrdenDetaProduMerma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoOrdenDetaProduMerma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoOrdenDetaProduMerma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoOrdenDetaProduMerma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoOrdenDetaProduMerma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoOrdenDetaProduMerma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoOrdenDetaProduMerma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMerma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMerma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoOrdenDetaProduMerma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMerma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoOrdenDetaProduMerma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoOrdenDetaProduMerma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMerma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoOrdenDetaProduMerma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoOrdenDetaProduMerma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoOrdenDetaProduMerma.add(this.jMenuItemCerrarProductoOrdenDetaProduMerma);
			
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemNuevoProductoOrdenDetaProduMerma);
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma);
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma);
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma);		
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemDuplicarProductoOrdenDetaProduMerma);		
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemCopiarProductoOrdenDetaProduMerma);		
			this.jmenuAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemVerFormProductoOrdenDetaProduMerma);		
			
			this.jmenuDatosProductoOrdenDetaProduMerma.add(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma);				
			this.jmenuDatosProductoOrdenDetaProduMerma.add(this.jMenuItemAnterioresProductoOrdenDetaProduMerma);				
			this.jmenuDatosProductoOrdenDetaProduMerma.add(this.jMenuItemSiguientesProductoOrdenDetaProduMerma);				
			this.jmenuDatosProductoOrdenDetaProduMerma.add(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma);				
			this.jmenuDatosProductoOrdenDetaProduMerma.add(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoOrdenDetaProduMerma.add(this.jmenuArchivoProductoOrdenDetaProduMerma);		
			this.jmenuBarProductoOrdenDetaProduMerma.add(this.jmenuAccionesProductoOrdenDetaProduMerma);		
			this.jmenuBarProductoOrdenDetaProduMerma.add(this.jmenuDatosProductoOrdenDetaProduMerma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoOrdenDetaProduMerma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoOrdenDetaProduMerma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Orden Deta Produ ");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Orden Deta Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma,"buscar_button","Buscar Por Orden Deta Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma = new JLabelMe();
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setText("Orden Deta Produ :");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setToolTipText("Orden Deta Produ");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Tipo Merma Empresa ");
		this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Tipo Merma Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma,"buscar_button","Buscar Por Tipo Merma Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma = new JLabelMe();
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setText("Tipo Merma Empresa :");
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setToolTipText("Tipo Merma Empresa");
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoOrdenDetaProduMerma = new ProductoOrdenDetaProduMermaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden Merma DATOS");
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma = new ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma = null;//new ProductoOrdenDetaProduMermaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMerma= new GridBagLayout();
		
		
		this.jTableDatosProductoOrdenDetaProduMerma = new JTableMe();      
		
		String sToolTipProductoOrdenDetaProduMerma="";
		sToolTipProductoOrdenDetaProduMerma=ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMerma+="(Produccion.ProductoOrdenDetaProduMerma)";
		}
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMerma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoOrdenDetaProduMerma.setToolTipText(sToolTipProductoOrdenDetaProduMerma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoOrdenDetaProduMerma);
		this.jTableDatosProductoOrdenDetaProduMerma.setAutoCreateRowSorter(true);
		this.jTableDatosProductoOrdenDetaProduMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionAllowed(true);
		this.jTableDatosProductoOrdenDetaProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonDuplicarProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonCopiarProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonVerFormProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMerma = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMerma = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Merma";
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMerma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoOrdenDetaProduMerma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoOrdenDetaProduMerma=new ImportacionJInternalFrame(ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoOrdenDetaProduMerma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMerma = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setText("Orden");
		this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,false,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMerma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,true,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMerma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoOrdenDetaProduMerma.setText("Nuevo");
		this.jButtonDuplicarProductoOrdenDetaProduMerma.setText("Duplicar");
		this.jButtonCopiarProductoOrdenDetaProduMerma.setText("Copiar");
		this.jButtonVerFormProductoOrdenDetaProduMerma.setText("Ver");
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMerma,"nuevo_button","Nuevo",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoOrdenDetaProduMerma,"duplicar_button","Duplicar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoOrdenDetaProduMerma,"copiar_button","Copiar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoOrdenDetaProduMerma,"ver_form","Ver",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma,"nuevorelaciones_button","Nuevo Rel",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMerma,"cerrar_button","Salir",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoOrdenDetaProduMerma.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoOrdenDetaProduMerma.setToolTipText("Duplicar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoOrdenDetaProduMerma.setToolTipText("Copiar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoOrdenDetaProduMerma.setToolTipText("Ver"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.setToolTipText("Nuevo Rel"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMerma.setToolTipText("Salir"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMerma"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonDuplicarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoOrdenDetaProduMerma"));
		
		//COPIAR
		sMapKey = "CopiarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCopiarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoOrdenDetaProduMerma"));
		
		//VEr FORM
		sMapKey = "VerFormProductoOrdenDetaProduMerma";
		inputMap = this.jButtonVerFormProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoOrdenDetaProduMerma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoOrdenDetaProduMerma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoOrdenDetaProduMerma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMerma";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMerma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setName("jPanelParametrosReportesProductoOrdenDetaProduMerma"); 
		
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma.setName("jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.setText("Recargar");
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.setToolTipText("Recargar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoOrdenDetaProduMerma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setText("Procesar");
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setToolTipText("Procesar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setVisible(false);
			
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setText("TIPO");       
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.setText("Accion");
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoOrdenDetaProduMerma = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMerma.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoOrdenDetaProduMerma = new JButtonMe();
		//this.jButtonAnterioresProductoOrdenDetaProduMerma.setText("<<");
        this.jButtonAnterioresProductoOrdenDetaProduMerma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoOrdenDetaProduMerma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoOrdenDetaProduMerma = new JButtonMe();
		//this.jButtonSiguientesProductoOrdenDetaProduMerma.setText(">>");
        this.jButtonSiguientesProductoOrdenDetaProduMerma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoOrdenDetaProduMerma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma,"nuevoguardarcambios_button","Nue",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoOrdenDetaProduMerma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoOrdenDetaProduMerma";
		inputMap = this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoOrdenDetaProduMerma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoOrdenDetaProduMerma";
		inputMap = this.jButtonSiguientesProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoOrdenDetaProduMerma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoOrdenDetaProduMerma";
		inputMap = this.jButtonAnterioresProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoOrdenDetaProduMerma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoOrdenDetaProduMerma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoOrdenDetaProduMerma = new GridBagLayout();

			this.jPanelPaginacionProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutPaginacionProductoOrdenDetaProduMerma);						
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonAnterioresProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					
						
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
			
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
						
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonSiguientesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonNuevoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
						
			
			
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			}
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonDuplicarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonCopiarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonVerFormProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoOrdenDetaProduMerma.add(this.jButtonCerrarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoOrdenDetaProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoOrdenDetaProduMerma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMerma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosReportesProductoOrdenDetaProduMerma);
			this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosReportesAccionesProductoOrdenDetaProduMerma);
			
			
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMerma);
			this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMerma);
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMerma);
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMerma);
			//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMerma.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMerma);			
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jButtonRecargarInformacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma.add(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma.add(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma.add(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);																		
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma.add(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jCheckBoxGenerarReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jLabelAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jButtonAbrirOrderByProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);															
				
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma.add(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);															
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	
				
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.add(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoOrdenDetaProduMerma = new GridBagLayout();

			this.jScrollPanelDatosProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutDatosProductoOrdenDetaProduMerma);
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
			
			this.jScrollPanelDatosProductoOrdenDetaProduMerma.add(this.jTableDatosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setViewportView(this.jTableDatosProductoOrdenDetaProduMerma);
		this.jTableDatosProductoOrdenDetaProduMerma.setFillsViewportHeight(true);
		this.jTableDatosProductoOrdenDetaProduMerma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMerma= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMerma);
		
		
		/*	
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
			
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonNuevoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.add(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.add(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx =1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.add(jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.addTab("1.-Por Orden Deta Produ ", jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.add(jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
		jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.add(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx =1;
		jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.add(jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.addTab("2.-Por Tipo Merma Empresa ", jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		jPanelFK_IdUnidadProductoOrdenDetaProduMerma.add(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMerma.add(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMerma.gridx =1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMerma.add(jButtonFK_IdUnidadProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);

		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.addTab("3.-Por Unad ", jPanelFK_IdUnidadProductoOrdenDetaProduMerma);
		jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMerma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;		
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);								
		
		
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/		
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
				
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMerma = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMerma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoOrdenDetaProduMerma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setName("jPanelReporteDinamicoProductoOrdenDetaProduMerma"); 
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMerma);
		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelColumnasSelectReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoOrdenDetaProduMerma = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoOrdenDetaProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma=new JScrollPane(this.jListColumnasSelectReporteProductoOrdenDetaProduMerma);
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma=new JScrollPane(this.jListRelacionesSelectReporteProductoOrdenDetaProduMerma);
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelConGraficoDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma=new JScrollPane(this.jListColumnasValoresGraficoProductoOrdenDetaProduMerma);
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMerma.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.setToolTipText("Generar EXCEL"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMerma.add(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMerma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma= new JScrollPane(jPanelReporteDinamicoProductoOrdenDetaProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMerma);
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getContentPane().add(this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoOrdenDetaProduMerma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoOrdenDetaProduMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoOrdenDetaProduMerma.setName("jPanelImportacionProductoOrdenDetaProduMerma"); 
		
		this.jPanelImportacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutImportacionProductoOrdenDetaProduMerma);
		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoOrdenDetaProduMerma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelArchivoImportacionProductoOrdenDetaProduMerma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jLabelArchivoImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoOrdenDetaProduMerma = new JFileChooser();		
		this.jFileChooserImportacionProductoOrdenDetaProduMerma.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonAbrirImportacionProductoOrdenDetaProduMerma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoOrdenDetaProduMerma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMerma.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jButtonAbrirImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jLabelPathArchivoImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonGenerarImportacionProductoOrdenDetaProduMerma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoOrdenDetaProduMerma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMerma.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jButtonGenerarImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonCerrarImportacionProductoOrdenDetaProduMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoOrdenDetaProduMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoOrdenDetaProduMerma.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMerma.add(this.jButtonCerrarImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMerma = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMerma= new JScrollPane(jPanelImportacionProductoOrdenDetaProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMerma);
		this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getContentPane().add(this.jScrollPanelImportacionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoOrdenDetaProduMerma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma = new JButtonMe();
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setText("Orden");
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoOrdenDetaProduMerma";
			inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoOrdenDetaProduMerma"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoOrdenDetaProduMerma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoOrdenDetaProduMerma.setName("jPanelOrderByProductoOrdenDetaProduMerma"); 
			
			this.jPanelOrderByProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutOrderByProductoOrdenDetaProduMerma);
			
			
			this.jTableDatosProductoOrdenDetaProduMermaOrderBy = new JTableMe();        
			this.jTableDatosProductoOrdenDetaProduMermaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduMermaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrdenDetaProduMermaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrdenDetaProduMermaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrdenDetaProduMermaOrderBy.setViewportView(this.jTableDatosProductoOrdenDetaProduMermaOrderBy);
			this.jTableDatosProductoOrdenDetaProduMermaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrdenDetaProduMermaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMerma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setTitle("Orden");
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setResizable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setClosable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoOrdenDetaProduMerma.ipady =150;
				
			this.jPanelOrderByProductoOrdenDetaProduMerma.add(jScrollPanelDatosProductoOrdenDetaProduMermaOrderBy, this.gridBagConstraintsProductoOrdenDetaProduMerma);//this.jTableDatosProductoOrdenDetaProduMermaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoOrdenDetaProduMerma = new JButtonMe();
			this.jButtonCerrarOrderByProductoOrdenDetaProduMerma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoOrdenDetaProduMerma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoOrdenDetaProduMerma.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoOrdenDetaProduMerma.add(this.jButtonCerrarOrderByProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMerma = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMerma= new JScrollPane(jPanelOrderByProductoOrdenDetaProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMerma);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getContentPane().add(this.jScrollPanelOrderByProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
		
		} else {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoOrdenDetaProduMerma.getRowHeight();//ProductoOrdenDetaProduMermaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMerma.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy()!=null) {
			//if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumermas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoOrdenDetaProduMerma> TraerProductoOrdenDetaProduMermaBeans(List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermas) {
					
				if(!(ProductoOrdenDetaProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoOrdenDetaProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoordendetaprodumerma.setsDetalleGeneralEntityReporte(ProductoOrdenDetaProduMermaConstantesFunciones.getProductoOrdenDetaProduMermaDescripcion(productoordendetaprodumerma));
										
						
					
						
					
				} else  {
							
					//productoordendetaprodumerma.setsDetalleGeneralEntityReporte(productoordendetaprodumerma.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoordendetaprodumermabeans.add(productoordendetaprodumermabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoordendetaprodumermas;
    }
	//PARA REPORTES FIN
}
