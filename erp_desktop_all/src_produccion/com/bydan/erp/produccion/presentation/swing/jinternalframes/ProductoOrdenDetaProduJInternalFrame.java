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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduConstantesFunciones;

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
public class ProductoOrdenDetaProduJInternalFrame extends ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoOrdenDetaProdu;
	
	protected JMenuBar jmenuBarProductoOrdenDetaProdu;
	
	protected JMenu jmenuProductoOrdenDetaProdu;
	protected JMenu jmenuDatosProductoOrdenDetaProdu;
	protected JMenu jmenuArchivoProductoOrdenDetaProdu;
	protected JMenu jmenuAccionesProductoOrdenDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProdu;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame jInternalFrameDetalleFormProductoOrdenDetaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoOrdenDetaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoOrdenDetaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean;
		
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoOrdenDetaProdu> productoordendetaprodus;		
	public List<ProductoOrdenDetaProdu> productoordendetaprodusEliminados;	
	public List<ProductoOrdenDetaProdu> productoordendetaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoOrdenDetaProdu;		
	protected JButton jButtonAbrirOrderByProductoOrdenDetaProdu;
	
	
	//protected JPanel jPanelOrderByProductoOrdenDetaProdu;
	//public JScrollPane jScrollPanelOrderByProductoOrdenDetaProdu;	
	//protected JButton jButtonCerrarOrderByProductoOrdenDetaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoOrdenDetaProduLogic productoordendetaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrdenDetaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoOrdenDetaProdu;
	//public JScrollPane jScrollPanelImportacionProductoOrdenDetaProdu;
	
	
	
	protected JPanel jPanelAccionesProductoOrdenDetaProdu;
	
    protected JPanel jPanelPaginacionProductoOrdenDetaProdu;
    protected JPanel jPanelParametrosReportesProductoOrdenDetaProdu;
	protected JPanel jPanelParametrosReportesAccionesProductoOrdenDetaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoOrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar2ProductoOrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar3ProductoOrdenDetaProdu;
	protected JPanel jPanelParametrosAuxiliar4ProductoOrdenDetaProdu;
	//protected JPanel jPanelParametrosAuxiliar5ProductoOrdenDetaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoOrdenDetaProdu;
	//protected JPanel jPanelImportacionProductoOrdenDetaProdu;
	
	
	public JTable jTableDatosProductoOrdenDetaProdu;
	
	
	
	//public JTable jTableDatosProductoOrdenDetaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoOrdenDetaProdu;
	protected JButton jButtonDuplicarProductoOrdenDetaProdu;
	protected JButton jButtonCopiarProductoOrdenDetaProdu;
	protected JButton jButtonVerFormProductoOrdenDetaProdu;
	protected JButton jButtonNuevoRelacionesProductoOrdenDetaProdu;
	protected JButton jButtonModificarProductoOrdenDetaProdu;
	
    protected JButton jButtonGuardarCambiosTablaProductoOrdenDetaProdu;
	protected JButton jButtonCerrarProductoOrdenDetaProdu;
	
	
	protected JButton jButtonRecargarInformacionProductoOrdenDetaProdu;
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProdu;
	
	
	protected JButton jButtonAnterioresProductoOrdenDetaProdu;
	protected JButton jButtonSiguientesProductoOrdenDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosProductoOrdenDetaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoOrdenDetaProdu;
	//protected JButton jButtonCerrarReporteDinamicoProductoOrdenDetaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoOrdenDetaProdu;
	//protected JButton jButtonGenerarImportacionProductoOrdenDetaProdu;
	//protected JButton jButtonCerrarImportacionProductoOrdenDetaProdu;
	//protected JFileChooser jFileChooserImportacionProductoOrdenDetaProdu;
	//protected File fileImportacionProductoOrdenDetaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProdu;
	protected JButton jButtonDuplicarToolBarProductoOrdenDetaProdu;
	protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProdu;
	protected JButton jButtonCopiarToolBarProductoOrdenDetaProdu;
	protected JButton jButtonVerFormToolBarProductoOrdenDetaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProdu;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarProductoOrdenDetaProdu;
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProdu;
	protected JButton jButtonAnterioresToolBarProductoOrdenDetaProdu;
	protected JButton jButtonSiguientesToolBarProductoOrdenDetaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu;
	protected JButton jButtonAbrirOrderByToolBarProductoOrdenDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDuplicarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesProductoOrdenDetaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemCopiarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemVerFormProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemAnterioresProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemSiguientesProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemAbrirOrderByProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProdu;
	protected JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProdu;
	protected JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoOrdenDetaProdu;
	//public JList<Reporte> jListColumnasSelectReporteProductoOrdenDetaProdu;
	//public JScrollPane jScrollColumnasSelectReporteProductoOrdenDetaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteProductoOrdenDetaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteProductoOrdenDetaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteProductoOrdenDetaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoOrdenDetaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu;
	
		
	//public JLabel jLabelArchivoImportacionProductoOrdenDetaProdu;	
	//public JLabel jLabelPathArchivoImportacionProductoOrdenDetaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionProductoOrdenDetaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorProductoOrdenDetaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoProductoOrdenDetaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoProductoOrdenDetaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoProductoOrdenDetaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProdu;
	public JPanel jPanelFK_IdBodegaProductoOrdenDetaProdu;
	public JButton jButtonFK_IdBodegaProductoOrdenDetaProdu;
	public JPanel jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu;
	public JButton jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu;
	public JPanel jPanelFK_IdProductoProductoOrdenDetaProdu;
	public JButton jButtonFK_IdProductoProductoOrdenDetaProdu;
	public JPanel jPanelFK_IdUnidadUnadProductoOrdenDetaProdu;
	public JButton jButtonFK_IdUnidadUnadProductoOrdenDetaProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoOrdenDetaProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu;
	public JButton jButtonid_bodegaFK_IdBodegaProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu;
	public JLabel jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu;
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoOrdenDetaProdu;
	public JLabel jLabelid_productoFK_IdProductoProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu;
	public JButton jButtonid_productoFK_IdProductoProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu;
	
	public JPanel jPanelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu;
	public JLabel jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu;
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoOrdenDetaProduBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoOrdenDetaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoOrdenDetaProdu)	{
		this.jButtonRecargarInformacionProductoOrdenDetaProdu = jButtonRecargarInformacionProductoOrdenDetaProdu;
	}
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProdu() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProdu)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProdu = jButtonProcesarInformacionProductoOrdenDetaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoOrdenDetaProdu() {
		return this.jButtonRecargarInformacionProductoOrdenDetaProdu;
	}
	
	
	public List<ProductoOrdenDetaProdu> getproductoordendetaprodus() {
		return this.productoordendetaprodus;
	}

	public void setproductoordendetaprodus(List<ProductoOrdenDetaProdu> productoordendetaprodus) {
		this.productoordendetaprodus = productoordendetaprodus;
	}
	
	public List<ProductoOrdenDetaProdu> getproductoordendetaprodusAux() {
		return this.productoordendetaprodusAux;
	}

	public void setproductoordendetaprodusAux(List<ProductoOrdenDetaProdu> productoordendetaprodusAux) {
		this.productoordendetaprodusAux = productoordendetaprodusAux;
	}
	
	public List<ProductoOrdenDetaProdu> getproductoordendetaprodusEliminados() {
		return this.productoordendetaprodusEliminados;
	}

	public void setProductoOrdenDetaProdusEliminados(List<ProductoOrdenDetaProdu> productoordendetaprodusEliminados) {
		this.productoordendetaprodusEliminados = productoordendetaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoOrdenDetaProdu() {
		return jComboBoxTiposSeleccionarProductoOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProdu) {
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu = jComboBoxTiposSeleccionarProductoOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoOrdenDetaProdu() {
		return jTextFieldValorCampoGeneralProductoOrdenDetaProdu;
	}

	public void setjTextFieldValorCampoGeneralProductoOrdenDetaProdu(
			JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProdu) {
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu = jTextFieldValorCampoGeneralProductoOrdenDetaProdu;
	}

	public void setBorderResaltarValorCampoGeneralProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoOrdenDetaProdu() {
		return this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu;
	}

	public void setjCheckBoxSeleccionarTodosProductoOrdenDetaProdu(
			JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProdu) {
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu = jCheckBoxSeleccionarTodosProductoOrdenDetaProdu;
	}

	public void setBorderResaltarSeleccionarTodosProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoOrdenDetaProdu() {
		return this.jCheckBoxSeleccionadosProductoOrdenDetaProdu;
	}

	public void setjCheckBoxSeleccionadosProductoOrdenDetaProdu(
			JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProdu) {
		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu = jCheckBoxSeleccionadosProductoOrdenDetaProdu;
	}
	
	public void setBorderResaltarSeleccionadosProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProdu) {
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu = jComboBoxTiposArchivosReportesProductoOrdenDetaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposReportesProductoOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposReportesProductoOrdenDetaProdu) {
		this.jComboBoxTiposReportesProductoOrdenDetaProdu = jComboBoxTiposReportesProductoOrdenDetaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoOrdenDetaProdu() {
	//	return jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoOrdenDetaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu) {
	//	this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu = jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu = jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu;
	//}
	
	public void setBorderResaltarTiposReportesProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProdu) {
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu = jComboBoxTiposGraficosReportesProductoOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoOrdenDetaProdu() {
		return this.jComboBoxTiposPaginacionProductoOrdenDetaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProdu) {
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu = jComboBoxTiposPaginacionProductoOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposRelacionesProductoOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProdu) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu = jComboBoxTiposRelacionesProductoOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProdu) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu = jComboBoxTiposAccionesProductoOrdenDetaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoOrdenDetaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoOrdenDetaProdu() {
	//	return jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoOrdenDetaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu) {
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu = jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoOrdenDetaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoOrdenDetaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu .setBorder(borderResaltar);		
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
		this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		
		this.productoordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Producto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoOrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoOrdenDetaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"nuevo","nuevo","Nuevo"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"duplicar","duplicar","Duplicar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"copiar","copiar","Copiar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"ver_form","ver_form","Ver"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"recargar","recargar","Recargar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,
							"cerrar","cerrar","Salir"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu;
			
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProdu;
				
		//protected JButton jButtonModificarToolBarProductoOrdenDetaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoOrdenDetaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoOrdenDetaProdu=new JMenuMe("General");
		this.jmenuArchivoProductoOrdenDetaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesProductoOrdenDetaProdu=new JMenuMe("Acciones");
		this.jmenuDatosProductoOrdenDetaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoOrdenDetaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoOrdenDetaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoOrdenDetaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoOrdenDetaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoOrdenDetaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoOrdenDetaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoOrdenDetaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoOrdenDetaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoOrdenDetaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoOrdenDetaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoOrdenDetaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoOrdenDetaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoOrdenDetaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoOrdenDetaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoOrdenDetaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoOrdenDetaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoOrdenDetaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoOrdenDetaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoOrdenDetaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoOrdenDetaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoOrdenDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoOrdenDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoOrdenDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoOrdenDetaProdu.add(this.jMenuItemCerrarProductoOrdenDetaProdu);
			
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemNuevoProductoOrdenDetaProdu);
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu);
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu);
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu);		
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemDuplicarProductoOrdenDetaProdu);		
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemCopiarProductoOrdenDetaProdu);		
			this.jmenuAccionesProductoOrdenDetaProdu.add(this.jMenuItemVerFormProductoOrdenDetaProdu);		
			
			this.jmenuDatosProductoOrdenDetaProdu.add(this.jMenuItemRecargarInformacionProductoOrdenDetaProdu);				
			this.jmenuDatosProductoOrdenDetaProdu.add(this.jMenuItemAnterioresProductoOrdenDetaProdu);				
			this.jmenuDatosProductoOrdenDetaProdu.add(this.jMenuItemSiguientesProductoOrdenDetaProdu);				
			this.jmenuDatosProductoOrdenDetaProdu.add(this.jMenuItemAbrirOrderByProductoOrdenDetaProdu);				
			this.jmenuDatosProductoOrdenDetaProdu.add(this.jMenuItemMostrarOcultarProductoOrdenDetaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoOrdenDetaProdu.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoOrdenDetaProdu.add(this.jmenuArchivoProductoOrdenDetaProdu);		
			this.jmenuBarProductoOrdenDetaProdu.add(this.jmenuAccionesProductoOrdenDetaProdu);		
			this.jmenuBarProductoOrdenDetaProdu.add(this.jmenuDatosProductoOrdenDetaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoOrdenDetaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoOrdenDetaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoOrdenDetaProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdBodegaProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdBodegaProductoOrdenDetaProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoOrdenDetaProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu.setToolTipText("Buscar Por Orden Deta Produ ");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu.setToolTipText("Buscar Por Orden Deta Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu,"buscar_button","Buscar Por Orden Deta Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu = new JLabelMe();
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setText("Orden Deta Produ :");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setToolTipText("Orden Deta Produ");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoOrdenDetaProdu.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdProductoProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdProductoProductoOrdenDetaProdu.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoOrdenDetaProdu,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.setFocusable(false);

		this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu = new JLabelMe();
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setText("Unad :");
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoOrdenDetaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoOrdenDetaProdu = new ProductoOrdenDetaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden Producto Produccion DATOS");
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu = new ProductoOrdenDetaProduDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaproduSessionBean.getConGuardarRelaciones(),this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu = null;//new ProductoOrdenDetaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProdu= new GridBagLayout();
		
		
		this.jTableDatosProductoOrdenDetaProdu = new JTableMe();      
		
		String sToolTipProductoOrdenDetaProdu="";
		sToolTipProductoOrdenDetaProdu=ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProdu+="(Produccion.ProductoOrdenDetaProdu)";
		}
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoOrdenDetaProdu.setToolTipText(sToolTipProductoOrdenDetaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoOrdenDetaProdu);
		this.jTableDatosProductoOrdenDetaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosProductoOrdenDetaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoOrdenDetaProdu.setRowSelectionAllowed(true);
		this.jTableDatosProductoOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonDuplicarProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonCopiarProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonVerFormProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoOrdenDetaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Producto Produccion";
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoOrdenDetaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoOrdenDetaProdu=new ImportacionJInternalFrame(ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoOrdenDetaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoOrdenDetaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoOrdenDetaProdu.setText("Orden");
		this.jButtonAbrirOrderByProductoOrdenDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProdu,false,this);
			
			//this.cargarOrderByProductoOrdenDetaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProdu,true,this);
			
			//this.cargarOrderByProductoOrdenDetaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoOrdenDetaProdu.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoOrdenDetaProdu.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoOrdenDetaProdu.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProductoOrdenDetaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoOrdenDetaProdu.setText("Nuevo");
		this.jButtonDuplicarProductoOrdenDetaProdu.setText("Duplicar");
		this.jButtonCopiarProductoOrdenDetaProdu.setText("Copiar");
		this.jButtonVerFormProductoOrdenDetaProdu.setText("Ver");
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProdu,"nuevo_button","Nuevo",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoOrdenDetaProdu,"duplicar_button","Duplicar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoOrdenDetaProdu,"copiar_button","Copiar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoOrdenDetaProdu,"ver_form","Ver",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoOrdenDetaProdu,"nuevorelaciones_button","Nuevo Rel",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu,"guardarcambiostabla_button","Guardar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProdu,"cerrar_button","Salir",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoOrdenDetaProdu.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoOrdenDetaProdu.setToolTipText("Duplicar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoOrdenDetaProdu.setToolTipText("Copiar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoOrdenDetaProdu.setToolTipText("Ver"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.setToolTipText("Nuevo Rel"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProdu.setToolTipText("Salir"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoOrdenDetaProdu";
		inputMap = this.jButtonDuplicarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoOrdenDetaProdu"));
		
		//COPIAR
		sMapKey = "CopiarProductoOrdenDetaProdu";
		inputMap = this.jButtonCopiarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoOrdenDetaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormProductoOrdenDetaProdu";
		inputMap = this.jButtonVerFormProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoOrdenDetaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoOrdenDetaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoOrdenDetaProdu";
		inputMap = this.jButtonModificarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoOrdenDetaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProdu";
		inputMap = this.jButtonCerrarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoOrdenDetaProdu.setName("jPanelParametrosReportesProductoOrdenDetaProdu"); 
		
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu.setName("jPanelParametrosReportesAccionesProductoOrdenDetaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.setText("Recargar");
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.setToolTipText("Recargar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoOrdenDetaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setText("Procesar");
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setToolTipText("Procesar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesProductoOrdenDetaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoOrdenDetaProdu = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProdu.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoOrdenDetaProdu = new JButtonMe();
		//this.jButtonAnterioresProductoOrdenDetaProdu.setText("<<");
        this.jButtonAnterioresProductoOrdenDetaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoOrdenDetaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoOrdenDetaProdu = new JButtonMe();
		//this.jButtonSiguientesProductoOrdenDetaProdu.setText(">>");
        this.jButtonSiguientesProductoOrdenDetaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoOrdenDetaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu,"nuevoguardarcambios_button","Nue",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoOrdenDetaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoOrdenDetaProdu";
		inputMap = this.jButtonRecargarInformacionProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoOrdenDetaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoOrdenDetaProdu";
		inputMap = this.jButtonSiguientesProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoOrdenDetaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoOrdenDetaProdu";
		inputMap = this.jButtonAnterioresProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoOrdenDetaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoOrdenDetaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoOrdenDetaProdu = new GridBagLayout();

			this.jPanelPaginacionProductoOrdenDetaProdu.setLayout(gridaBagLayoutPaginacionProductoOrdenDetaProdu);						
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonAnterioresProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					
						
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
			
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
						
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonSiguientesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonNuevoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
						
			
			
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
				this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			}
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonDuplicarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonCopiarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonVerFormProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoOrdenDetaProdu.add(this.jButtonCerrarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoOrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoOrdenDetaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoOrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoOrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoOrdenDetaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoOrdenDetaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.setLayout(gridaBagParametrosReportesProductoOrdenDetaProdu);
			this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu.setLayout(gridaBagParametrosReportesAccionesProductoOrdenDetaProdu);
			
			
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar1ProductoOrdenDetaProdu);
			this.jPanelParametrosAuxiliar2ProductoOrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProdu);
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar3ProductoOrdenDetaProdu);
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar4ProductoOrdenDetaProdu);
			//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProdu.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProdu);			
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jButtonRecargarInformacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu.add(this.jComboBoxTiposPaginacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu.add(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu.add(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jPanelParametrosAuxiliar1ProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProdu.add(this.jComboBoxTiposReportesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);																		
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoOrdenDetaProdu.add(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jPanelParametrosAuxiliar4ProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jComboBoxTiposReportesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jCheckBoxGenerarReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jPanelParametrosAuxiliar2ProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jLabelAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jButtonAbrirOrderByProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);															
				
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu.add(this.jCheckBoxSeleccionadosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);															
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jPanelParametrosAuxiliar3ProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jComboBoxTiposAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
	
				
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProdu.add(this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoOrdenDetaProdu = new GridBagLayout();

			this.jScrollPanelDatosProductoOrdenDetaProdu.setLayout(gridaBagLayoutDatosProductoOrdenDetaProdu);
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
			
			this.jScrollPanelDatosProductoOrdenDetaProdu.add(this.jTableDatosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoOrdenDetaProdu.setViewportView(this.jTableDatosProductoOrdenDetaProdu);
		this.jTableDatosProductoOrdenDetaProdu.setFillsViewportHeight(true);
		this.jTableDatosProductoOrdenDetaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProdu.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProdu);
		
		
		/*	
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
			
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonNuevoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdBodegaProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		jPanelFK_IdBodegaProductoOrdenDetaProdu.add(jLabelid_bodegaFK_IdBodegaProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
		jPanelFK_IdBodegaProductoOrdenDetaProdu.add(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProdu.gridx =1;
		jPanelFK_IdBodegaProductoOrdenDetaProdu.add(jButtonFK_IdBodegaProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		jTabbedPaneBusquedasProductoOrdenDetaProdu.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoOrdenDetaProdu);
		jTabbedPaneBusquedasProductoOrdenDetaProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu.add(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu.add(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProdu.gridx =1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu.add(jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		jTabbedPaneBusquedasProductoOrdenDetaProdu.addTab("2.-Por Orden Deta Produ ", jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);
		jTabbedPaneBusquedasProductoOrdenDetaProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdProductoProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		jPanelFK_IdProductoProductoOrdenDetaProdu.add(jLabelid_productoFK_IdProductoProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
		jPanelFK_IdProductoProductoOrdenDetaProdu.add(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);


		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		jPanelFK_IdProductoProductoOrdenDetaProdu.add(this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProdu.gridx =1;
		jPanelFK_IdProductoProductoOrdenDetaProdu.add(jButtonFK_IdProductoProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		jTabbedPaneBusquedasProductoOrdenDetaProdu.addTab("3.-Por Producto ", jPanelFK_IdProductoProductoOrdenDetaProdu);
		jTabbedPaneBusquedasProductoOrdenDetaProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadUnadProductoOrdenDetaProdu.setLayout(gridaBagLayoutFK_IdUnidadUnadProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		jPanelFK_IdUnidadUnadProductoOrdenDetaProdu.add(jLabelid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
		jPanelFK_IdUnidadUnadProductoOrdenDetaProdu.add(jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProdu.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProdu.gridx =1;
		jPanelFK_IdUnidadUnadProductoOrdenDetaProdu.add(jButtonFK_IdUnidadUnadProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);

		jTabbedPaneBusquedasProductoOrdenDetaProdu.addTab("4.-Por Unad ", jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);
		jTabbedPaneBusquedasProductoOrdenDetaProdu.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;		
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;		
			this.gridBagConstraintsProductoOrdenDetaProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);								
		
		
		/*
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/		
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
				
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoOrdenDetaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoOrdenDetaProdu.setLayout(gridaBagLayoutBusquedasParametrosProductoOrdenDetaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoOrdenDetaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoOrdenDetaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoOrdenDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setName("jPanelReporteDinamicoProductoOrdenDetaProdu"); 
		
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.setLayout(gridaBagLayoutReporteDinamicoProductoOrdenDetaProdu);
		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoOrdenDetaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelColumnasSelectReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoOrdenDetaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoOrdenDetaProdu=new JScrollPane(this.jListColumnasSelectReporteProductoOrdenDetaProdu);
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jListColumnasSelectReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jScrollColumnasSelectReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoOrdenDetaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoOrdenDetaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProdu=new JScrollPane(this.jListRelacionesSelectReporteProductoOrdenDetaProdu);
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoOrdenDetaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoOrdenDetaProdu.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelConGraficoDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelColumnaCategoriaValorProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelColumnasValoresGraficoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoOrdenDetaProdu = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoOrdenDetaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoOrdenDetaProdu.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu=new JScrollPane(this.jListColumnasValoresGraficoProductoOrdenDetaProdu);
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jListColumnasSelectReporteProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jScrollColumnasValoresGraficoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProdu.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu.setToolTipText("Generar EXCEL"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu.setToolTipText("Generar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProdu.add(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu= new JScrollPane(jPanelReporteDinamicoProductoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProdu);
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoOrdenDetaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoOrdenDetaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoOrdenDetaProdu.setName("jPanelImportacionProductoOrdenDetaProdu"); 
		
		this.jPanelImportacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoOrdenDetaProdu.setLayout(gridaBagLayoutImportacionProductoOrdenDetaProdu);
		
		
		this.jInternalFrameImportacionProductoOrdenDetaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoOrdenDetaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoOrdenDetaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelArchivoImportacionProductoOrdenDetaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jLabelArchivoImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoOrdenDetaProdu = new JFileChooser();		
		this.jFileChooserImportacionProductoOrdenDetaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonAbrirImportacionProductoOrdenDetaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoOrdenDetaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoOrdenDetaProdu.setToolTipText("Generar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jButtonAbrirImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoOrdenDetaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoOrdenDetaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jLabelPathArchivoImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jTextFieldPathArchivoImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonGenerarImportacionProductoOrdenDetaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoOrdenDetaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoOrdenDetaProdu.setToolTipText("Generar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jButtonGenerarImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarImportacionProductoOrdenDetaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoOrdenDetaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoOrdenDetaProdu.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProdu.add(this.jButtonCerrarImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoOrdenDetaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoOrdenDetaProdu= new JScrollPane(jPanelImportacionProductoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoOrdenDetaProdu);
		this.jInternalFrameImportacionProductoOrdenDetaProdu.getContentPane().add(this.jScrollPanelImportacionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoOrdenDetaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoOrdenDetaProdu = new JButtonMe();
			this.jButtonAbrirOrderByProductoOrdenDetaProdu.setText("Orden");
			this.jButtonAbrirOrderByProductoOrdenDetaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoOrdenDetaProdu";
			inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoOrdenDetaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoOrdenDetaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoOrdenDetaProdu.setName("jPanelOrderByProductoOrdenDetaProdu"); 
			
			this.jPanelOrderByProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoOrdenDetaProdu.setLayout(gridaBagLayoutOrderByProductoOrdenDetaProdu);
			
			
			this.jTableDatosProductoOrdenDetaProduOrderBy = new JTableMe();        
			this.jTableDatosProductoOrdenDetaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrdenDetaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrdenDetaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrdenDetaProduOrderBy.setViewportView(this.jTableDatosProductoOrdenDetaProduOrderBy);
			this.jTableDatosProductoOrdenDetaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrdenDetaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoOrdenDetaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoOrdenDetaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoOrdenDetaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoOrdenDetaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setTitle("Orden");
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setResizable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setClosable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoOrdenDetaProdu.ipady =150;
				
			this.jPanelOrderByProductoOrdenDetaProdu.add(jScrollPanelDatosProductoOrdenDetaProduOrderBy, this.gridBagConstraintsProductoOrdenDetaProdu);//this.jTableDatosProductoOrdenDetaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoOrdenDetaProdu = new JButtonMe();
			this.jButtonCerrarOrderByProductoOrdenDetaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoOrdenDetaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoOrdenDetaProdu.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoOrdenDetaProdu.add(this.jButtonCerrarOrderByProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoOrdenDetaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoOrdenDetaProdu= new JScrollPane(jPanelOrderByProductoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoOrdenDetaProdu);
			
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getContentPane().add(this.jScrollPanelOrderByProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
		
		} else {
			this.jButtonAbrirOrderByProductoOrdenDetaProdu = new JButtonMe();
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
			&& this.productoordendetaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoOrdenDetaProdu.getRowHeight();//ProductoOrdenDetaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProdu.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoOrdenDetaProdu!=null && this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoOrdenDetaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoordendetaproduLogic.getProductoOrdenDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoOrdenDetaProdu> TraerProductoOrdenDetaProduBeans(List<ProductoOrdenDetaProdu> productoordendetaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodus) {
					
				if(!(ProductoOrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoOrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoordendetaprodu.setsDetalleGeneralEntityReporte(ProductoOrdenDetaProduConstantesFunciones.getProductoOrdenDetaProduDescripcion(productoordendetaprodu));
										
						
					
						
					
				} else  {
							
					//productoordendetaprodu.setsDetalleGeneralEntityReporte(productoordendetaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoordendetaprodubeans.add(productoordendetaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoordendetaprodus;
    }
	//PARA REPORTES FIN
}
