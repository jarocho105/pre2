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
import com.bydan.erp.produccion.util.ProductoProduManoConstantesFunciones;

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
public class ProductoProduManoJInternalFrame extends ProductoProduManoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProduMano;
	
	protected JMenuBar jmenuBarProductoProduMano;
	
	protected JMenu jmenuProductoProduMano;
	protected JMenu jmenuDatosProductoProduMano;
	protected JMenu jmenuArchivoProductoProduMano;
	protected JMenu jmenuAccionesProductoProduMano;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMano;	
	protected GridBagConstraints gridBagConstraintsProductoProduMano;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProduManoDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProduMano;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProduMano;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProduMano;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomanoproduempresa="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduManoSessionBean productoprodumanoSessionBean;
		
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProduMano> productoprodumanos;		
	public List<ProductoProduMano> productoprodumanosEliminados;	
	public List<ProductoProduMano> productoprodumanosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProduMano;		
	protected JButton jButtonAbrirOrderByProductoProduMano;
	
	
	//protected JPanel jPanelOrderByProductoProduMano;
	//public JScrollPane jScrollPanelOrderByProductoProduMano;	
	//protected JButton jButtonCerrarOrderByProductoProduMano;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProduManoLogic productoprodumanoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProduMano;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMano;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMano;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProduManoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProduMano;
	//public JScrollPane jScrollPanelImportacionProductoProduMano;
	
	
	
	protected JPanel jPanelAccionesProductoProduMano;
	
    protected JPanel jPanelPaginacionProductoProduMano;
    protected JPanel jPanelParametrosReportesProductoProduMano;
	protected JPanel jPanelParametrosReportesAccionesProductoProduMano;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProduMano;
	protected JPanel jPanelParametrosAuxiliar2ProductoProduMano;
	protected JPanel jPanelParametrosAuxiliar3ProductoProduMano;
	protected JPanel jPanelParametrosAuxiliar4ProductoProduMano;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProduMano;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProduMano;
	//protected JPanel jPanelImportacionProductoProduMano;
	
	
	public JTable jTableDatosProductoProduMano;
	
	
	
	//public JTable jTableDatosProductoProduManoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProduMano;
	protected JButton jButtonDuplicarProductoProduMano;
	protected JButton jButtonCopiarProductoProduMano;
	protected JButton jButtonVerFormProductoProduMano;
	protected JButton jButtonNuevoRelacionesProductoProduMano;
	protected JButton jButtonModificarProductoProduMano;
	
    protected JButton jButtonGuardarCambiosTablaProductoProduMano;
	protected JButton jButtonCerrarProductoProduMano;
	
	
	protected JButton jButtonRecargarInformacionProductoProduMano;
	protected JButton jButtonProcesarInformacionProductoProduMano;
	
	
	protected JButton jButtonAnterioresProductoProduMano;
	protected JButton jButtonSiguientesProductoProduMano;
	protected JButton jButtonNuevoGuardarCambiosProductoProduMano;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProduMano;
	//protected JButton jButtonCerrarReporteDinamicoProductoProduMano;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProduMano;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProduMano;
	//protected JButton jButtonGenerarImportacionProductoProduMano;
	//protected JButton jButtonCerrarImportacionProductoProduMano;
	//protected JFileChooser jFileChooserImportacionProductoProduMano;
	//protected File fileImportacionProductoProduMano;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMano;
	protected JButton jButtonDuplicarToolBarProductoProduMano;
	protected JButton jButtonNuevoRelacionesToolBarProductoProduMano;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProduMano;
	protected JButton jButtonCopiarToolBarProductoProduMano;
	protected JButton jButtonVerFormToolBarProductoProduMano;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProduMano;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMano;
	protected JButton jButtonCerrarToolBarProductoProduMano;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProduMano;
	protected JButton jButtonProcesarInformacionToolBarProductoProduMano;
	protected JButton jButtonAnterioresToolBarProductoProduMano;
	protected JButton jButtonSiguientesToolBarProductoProduMano;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProduMano;
	protected JButton jButtonAbrirOrderByToolBarProductoProduMano;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMano;
	protected JMenuItem jMenuItemDuplicarProductoProduMano;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProduMano;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProduMano;
	protected JMenuItem jMenuItemCopiarProductoProduMano;
	protected JMenuItem jMenuItemVerFormProductoProduMano;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMano;
	protected JMenuItem jMenuItemCerrarProductoProduMano;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMano;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProduMano;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMano;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProduMano;
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMano;
	protected JMenuItem jMenuItemAnterioresProductoProduMano;
	protected JMenuItem jMenuItemSiguientesProductoProduMano;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMano;
	protected JMenuItem jMenuItemAbrirOrderByProductoProduMano;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMano;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMano;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProduMano;
	protected JCheckBox jCheckBoxSeleccionadosProductoProduMano;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProduMano;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProduMano;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMano;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProduMano;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProduMano;
	protected JTextField jTextFieldValorCampoGeneralProductoProduMano;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProduMano;
	//public JList<Reporte> jListColumnasSelectReporteProductoProduMano;
	//public JScrollPane jScrollColumnasSelectReporteProductoProduMano;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProduMano;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProduMano;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProduMano;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProduMano;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProduMano;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProduMano;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProduMano;
	
		
	//public JLabel jLabelArchivoImportacionProductoProduMano;	
	//public JLabel jLabelPathArchivoImportacionProductoProduMano;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProduMano;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProduMano;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProduMano;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProduMano;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProduMano;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProduMano;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProduMano;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProduMano;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProduMano;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProduMano;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProduMano;
	public JPanel jPanelFK_IdProductoDefiProduProductoProduMano;
	public JButton jButtonFK_IdProductoDefiProduProductoProduMano;
	public JPanel jPanelFK_IdTipoManoProduEmpresaProductoProduMano;
	public JButton jButtonFK_IdTipoManoProduEmpresaProductoProduMano;
	public JPanel jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano;
	public JButton jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano;
	public JPanel jPanelFK_IdUnidadProductoProduMano;
	public JButton jButtonFK_IdUnidadProductoProduMano;
	
	public JPanel jPanelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano;
	public JLabel jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano;
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMano= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano;
	public JLabel jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano;
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano;
	public JLabel jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano;
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoProduMano;
	public JLabel jLabelid_unidadFK_IdUnidadProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoProduMano;
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMano= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduManoBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoProduManoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProduMano)	{
		this.jButtonRecargarInformacionProductoProduMano = jButtonRecargarInformacionProductoProduMano;
	}
	
	public JButton getjButtonProcesarInformacionProductoProduMano() {
		return this.jButtonProcesarInformacionProductoProduMano;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMano)	{
		this.jButtonProcesarInformacionProductoProduMano = jButtonProcesarInformacionProductoProduMano;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProduMano() {
		return this.jButtonRecargarInformacionProductoProduMano;
	}
	
	
	public List<ProductoProduMano> getproductoprodumanos() {
		return this.productoprodumanos;
	}

	public void setproductoprodumanos(List<ProductoProduMano> productoprodumanos) {
		this.productoprodumanos = productoprodumanos;
	}
	
	public List<ProductoProduMano> getproductoprodumanosAux() {
		return this.productoprodumanosAux;
	}

	public void setproductoprodumanosAux(List<ProductoProduMano> productoprodumanosAux) {
		this.productoprodumanosAux = productoprodumanosAux;
	}
	
	public List<ProductoProduMano> getproductoprodumanosEliminados() {
		return this.productoprodumanosEliminados;
	}

	public void setProductoProduManosEliminados(List<ProductoProduMano> productoprodumanosEliminados) {
		this.productoprodumanosEliminados = productoprodumanosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProduMano() {
		return jComboBoxTiposSeleccionarProductoProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProduMano(
			JComboBox jComboBoxTiposSeleccionarProductoProduMano) {
		this.jComboBoxTiposSeleccionarProductoProduMano = jComboBoxTiposSeleccionarProductoProduMano;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProduMano .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProduMano() {
		return jTextFieldValorCampoGeneralProductoProduMano;
	}

	public void setjTextFieldValorCampoGeneralProductoProduMano(
			JTextField jTextFieldValorCampoGeneralProductoProduMano) {
		this.jTextFieldValorCampoGeneralProductoProduMano = jTextFieldValorCampoGeneralProductoProduMano;
	}

	public void setBorderResaltarValorCampoGeneralProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProduMano .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProduMano() {
		return this.jCheckBoxSeleccionarTodosProductoProduMano;
	}

	public void setjCheckBoxSeleccionarTodosProductoProduMano(
			JCheckBox jCheckBoxSeleccionarTodosProductoProduMano) {
		this.jCheckBoxSeleccionarTodosProductoProduMano = jCheckBoxSeleccionarTodosProductoProduMano;
	}

	public void setBorderResaltarSeleccionarTodosProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProduMano .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProduMano() {
		return this.jCheckBoxSeleccionadosProductoProduMano;
	}

	public void setjCheckBoxSeleccionadosProductoProduMano(
			JCheckBox jCheckBoxSeleccionadosProductoProduMano) {
		this.jCheckBoxSeleccionadosProductoProduMano = jCheckBoxSeleccionadosProductoProduMano;
	}
	
	public void setBorderResaltarSeleccionadosProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProduMano .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProduMano() {
		return this.jComboBoxTiposArchivosReportesProductoProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProduMano(
			JComboBox jComboBoxTiposArchivosReportesProductoProduMano) {
		this.jComboBoxTiposArchivosReportesProductoProduMano = jComboBoxTiposArchivosReportesProductoProduMano;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProduMano() {
		return this.jComboBoxTiposReportesProductoProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProduMano(
			JComboBox jComboBoxTiposReportesProductoProduMano) {
		this.jComboBoxTiposReportesProductoProduMano = jComboBoxTiposReportesProductoProduMano;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProduMano() {
	//	return jComboBoxTiposReportesDinamicoProductoProduMano;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProduMano(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProduMano) {
	//	this.jComboBoxTiposReportesDinamicoProductoProduMano = jComboBoxTiposReportesDinamicoProductoProduMano;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProduMano() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProduMano;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProduMano(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMano) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano = jComboBoxTiposArchivosReportesDinamicoProductoProduMano;
	//}
	
	public void setBorderResaltarTiposReportesProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProduMano() {
		return this.jComboBoxTiposGraficosReportesProductoProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProduMano(
			JComboBox jComboBoxTiposGraficosReportesProductoProduMano) {
		this.jComboBoxTiposGraficosReportesProductoProduMano = jComboBoxTiposGraficosReportesProductoProduMano;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProduMano() {
		return this.jComboBoxTiposPaginacionProductoProduMano;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProduMano(
			JComboBox jComboBoxTiposPaginacionProductoProduMano) {
		this.jComboBoxTiposPaginacionProductoProduMano = jComboBoxTiposPaginacionProductoProduMano;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProduMano .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProduMano() {
		return this.jComboBoxTiposRelacionesProductoProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMano() {
		return this.jComboBoxTiposAccionesProductoProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMano(
			JComboBox jComboBoxTiposRelacionesProductoProduMano) {
		this.jComboBoxTiposRelacionesProductoProduMano = jComboBoxTiposRelacionesProductoProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMano(
			JComboBox jComboBoxTiposAccionesProductoProduMano) {
		this.jComboBoxTiposAccionesProductoProduMano = jComboBoxTiposAccionesProductoProduMano;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProduMano .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProduMano() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProduMano .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProduMano() {
	//	return jCheckBoxConGraficoDinamicoProductoProduMano;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProduMano(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProduMano) {
	//	this.jCheckBoxConGraficoDinamicoProductoProduMano = jCheckBoxConGraficoDinamicoProductoProduMano;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProduMano() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProduMano.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProduMano .setBorder(borderResaltar);		
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
		this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		
		this.productoprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumanoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduManoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Mano De Obra Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProduMano= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"nuevo","nuevo","Nuevo"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"duplicar","duplicar","Duplicar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"copiar","copiar","Copiar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"ver_form","ver_form","Ver"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"recargar","recargar","Recargar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProduMano,this.jTtoolBarProductoProduMano,
							"cerrar","cerrar","Salir"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProduMano=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProduMano;
			
				this.jButtonProcesarInformacionToolBarProductoProduMano=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProduMano;
				
		//protected JButton jButtonModificarToolBarProductoProduMano;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProduMano=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProduMano=new JMenuMe("General");
		this.jmenuArchivoProductoProduMano=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProduMano=new JMenuMe("Acciones");
		this.jmenuDatosProductoProduMano=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMano= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMano.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMano,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProduMano= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProduMano.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProduMano,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProduMano= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProduMano.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProduMano,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProduMano= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMano.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMano,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProduMano= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProduMano.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProduMano,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProduMano= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProduMano.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProduMano,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProduMano= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProduMano.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProduMano,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProduMano= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProduMano.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProduMano,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProduMano= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProduMano.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProduMano,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProduMano= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProduMano.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProduMano,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProduMano= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProduMano.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProduMano,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProduMano= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProduMano.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProduMano,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMano,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProduMano= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProduMano.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProduMano,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMano,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProduMano= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProduMano.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProduMano,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProduMano.add(this.jMenuItemCerrarProductoProduMano);
			
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemNuevoProductoProduMano);
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemNuevoGuardarCambiosProductoProduMano);
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemNuevoRelacionesProductoProduMano);
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemGuardarCambiosTablaProductoProduMano);		
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemDuplicarProductoProduMano);		
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemCopiarProductoProduMano);		
			this.jmenuAccionesProductoProduMano.add(this.jMenuItemVerFormProductoProduMano);		
			
			this.jmenuDatosProductoProduMano.add(this.jMenuItemRecargarInformacionProductoProduMano);				
			this.jmenuDatosProductoProduMano.add(this.jMenuItemAnterioresProductoProduMano);				
			this.jmenuDatosProductoProduMano.add(this.jMenuItemSiguientesProductoProduMano);				
			this.jmenuDatosProductoProduMano.add(this.jMenuItemAbrirOrderByProductoProduMano);				
			this.jmenuDatosProductoProduMano.add(this.jMenuItemMostrarOcultarProductoProduMano);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProduMano.add(this.jMenuItemGuardarCambiosProductoProduMano);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProduMano.add(this.jmenuArchivoProductoProduMano);		
			this.jmenuBarProductoProduMano.add(this.jmenuAccionesProductoProduMano);		
			this.jmenuBarProductoProduMano.add(this.jmenuDatosProductoProduMano);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProduMano);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProduMano() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProductoDefiProduProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDefiProduProductoProduMano.setToolTipText("Buscar Por Producto Defi Produ ");
		this.jButtonFK_IdProductoDefiProduProductoProduMano= new JButtonMe();
		this.jButtonFK_IdProductoDefiProduProductoProduMano.setText("Buscar");
		this.jButtonFK_IdProductoDefiProduProductoProduMano.setToolTipText("Buscar Por Producto Defi Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDefiProduProductoProduMano,"buscar_button","Buscar Por Producto Defi Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDefiProduProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano = new JLabelMe();
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setText("Producto Defi Produ :");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setToolTipText("Producto Defi Produ");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano= new JComboBoxMe();
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano.setToolTipText("Buscar Por Tipo Mano Obra Empresa ");
		this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano= new JButtonMe();
		this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano.setText("Buscar");
		this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano.setToolTipText("Buscar Por Tipo Mano Obra Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano,"buscar_button","Buscar Por Tipo Mano Obra Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano = new JLabelMe();
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setText("Tipo Mano Obra Empresa :");
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setToolTipText("Tipo Mano Obra Empresa");
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano= new JComboBoxMe();
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano= new JButtonMe();
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano.setText("Buscar");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano,"buscar_button","Buscar Por Tipo Proceso Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano = new JLabelMe();
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setText("Tipo Proceso Empresa Produ :");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setToolTipText("Tipo Proceso Empresa Produ");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoProduMano.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoProduMano= new JButtonMe();
		this.jButtonFK_IdUnidadProductoProduMano.setText("Buscar");
		this.jButtonFK_IdUnidadProductoProduMano.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoProduMano,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoProduMano = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoProduMano.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoProduMano.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoProduMano= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoProduMano=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProduMano.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMano.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMano.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProduMano = new ProductoProduManoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Mano De Obra Produccion DATOS");
			this.jInternalFrameDetalleFormProductoProduMano = new ProductoProduManoDetalleFormJInternalFrame(jDesktopPane,this.productoprodumanoSessionBean.getConGuardarRelaciones(),this.productoprodumanoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProduMano = null;//new ProductoProduManoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMano= new GridBagLayout();
		
		
		this.jTableDatosProductoProduMano = new JTableMe();      
		
		String sToolTipProductoProduMano="";
		sToolTipProductoProduMano=ProductoProduManoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMano+="(Produccion.ProductoProduMano)";
		}
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMano+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProduMano.setToolTipText(sToolTipProductoProduMano);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProduMano);
		this.jTableDatosProductoProduMano.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProduMano.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProduMano.setRowSelectionAllowed(true);
		this.jTableDatosProductoProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProduMano,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProduMano = new JButtonMe();
		this.jButtonDuplicarProductoProduMano = new JButtonMe();
		this.jButtonCopiarProductoProduMano = new JButtonMe();
		this.jButtonVerFormProductoProduMano = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProduMano = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProduMano = new JButtonMe();
		this.jButtonCerrarProductoProduMano = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMano = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProduMano = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Mano De Obra Produccion";
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMano.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMano.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProduMano=new ReporteDinamicoJInternalFrame(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProduMano();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProduMano=new ImportacionJInternalFrame(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProduMano();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProduMano = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProduMano.setText("Orden");
		this.jButtonAbrirOrderByProductoProduMano.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMano,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMano,false,this);
			
			//this.cargarOrderByProductoProduMano(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMano,true,this);
			
			//this.cargarOrderByProductoProduMano(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProduMano.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosProductoProduMano.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosProductoProduMano.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosProductoProduMano.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMano.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMano.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProduMano.setText("Nuevo");
		this.jButtonDuplicarProductoProduMano.setText("Duplicar");
		this.jButtonCopiarProductoProduMano.setText("Copiar");
		this.jButtonVerFormProductoProduMano.setText("Ver");
		this.jButtonNuevoRelacionesProductoProduMano.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProduMano.setText("Guardar");
		this.jButtonCerrarProductoProduMano.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMano,"nuevo_button","Nuevo",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProduMano,"duplicar_button","Duplicar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProduMano,"copiar_button","Copiar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProduMano,"ver_form","Ver",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProduMano,"nuevorelaciones_button","Nuevo Rel",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMano,"guardarcambiostabla_button","Guardar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMano,"cerrar_button","Salir",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProduMano.setToolTipText("Nuevo"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProduMano.setToolTipText("Duplicar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProduMano.setToolTipText("Copiar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProduMano.setToolTipText("Ver"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProduMano.setToolTipText("Nuevo Rel"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProduMano.setToolTipText("Guardar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMano.setToolTipText("Salir"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMano";
		inputMap = this.jButtonNuevoProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMano"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProduMano";
		inputMap = this.jButtonDuplicarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProduMano"));
		
		//COPIAR
		sMapKey = "CopiarProductoProduMano";
		inputMap = this.jButtonCopiarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProduMano"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProduMano";
		inputMap = this.jButtonVerFormProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProduMano"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProduMano";
		inputMap = this.jButtonNuevoRelacionesProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProduMano"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProduMano";
		inputMap = this.jButtonModificarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProduMano"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMano";
		inputMap = this.jButtonCerrarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMano"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMano";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMano"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProduMano.setName("jPanelParametrosReportesProductoProduMano"); 
		
		this.jPanelParametrosReportesAccionesProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProduMano.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProduMano.setName("jPanelParametrosReportesAccionesProductoProduMano"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProduMano = new JButtonMe();
		this.jButtonRecargarInformacionProductoProduMano.setText("Recargar");
		this.jButtonRecargarInformacionProductoProduMano.setToolTipText("Recargar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProduMano,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProduMano = new JButtonMe();
		this.jButtonProcesarInformacionProductoProduMano.setText("Procesar");
		this.jButtonProcesarInformacionProductoProduMano.setToolTipText("Procesar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProduMano.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProduMano.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMano.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMano.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMano.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProduMano.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMano.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProduMano.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMano.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProduMano.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProduMano.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProduMano.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProduMano.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProduMano.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMano.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMano.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProduMano.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProduMano.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProduMano=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProduMano.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMano.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMano.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProduMano = new JLabelMe();
		
		this.jLabelAccionesProductoProduMano.setText("Acciones");		
		this.jLabelAccionesProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProduMano.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProduMano.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProduMano = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProduMano.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProduMano.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProduMano = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProduMano.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProduMano.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProduMano.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProduMano.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProduMano = new JButtonMe();
		//this.jButtonAnterioresProductoProduMano.setText("<<");
        this.jButtonAnterioresProductoProduMano.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProduMano,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProduMano = new JButtonMe();
		//this.jButtonSiguientesProductoProduMano.setText(">>");
        this.jButtonSiguientesProductoProduMano.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProduMano,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProduMano = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProduMano.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProduMano.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProduMano,"nuevoguardarcambios_button","Nue",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProduMano";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProduMano"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProduMano";
		inputMap = this.jButtonRecargarInformacionProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProduMano"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProduMano";
		inputMap = this.jButtonSiguientesProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProduMano"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProduMano";
		inputMap = this.jButtonAnterioresProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProduMano"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProduMano();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProduMano.setMinimumSize(new Dimension(this.getWidth(),ProductoProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMano.setMaximumSize(new Dimension(this.getWidth(),ProductoProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMano.setPreferredSize(new Dimension(this.getWidth(),ProductoProduManoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduManoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProduMano = new GridBagLayout();

			this.jPanelPaginacionProductoProduMano.setLayout(gridaBagLayoutPaginacionProductoProduMano);						
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 0;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProduMano.add(this.jButtonAnterioresProductoProduMano, this.gridBagConstraintsProductoProduMano);
					
						
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMano.gridy = 0;
			
			this.jPanelPaginacionProductoProduMano.add(this.jButtonNuevoGuardarCambiosProductoProduMano, this.gridBagConstraintsProductoProduMano);
						
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMano.gridy = 0;
			this.jPanelPaginacionProductoProduMano.add(this.jButtonSiguientesProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 1;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMano.add(this.jButtonNuevoProductoProduMano, this.gridBagConstraintsProductoProduMano);
						
			
			
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProduMano.gridy = 1;
				this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProduMano.add(this.jButtonGuardarCambiosTablaProductoProduMano, this.gridBagConstraintsProductoProduMano);
			}
			
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 1;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMano.add(this.jButtonDuplicarProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 1;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMano.add(this.jButtonCopiarProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 1;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMano.add(this.jButtonVerFormProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 1;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProduMano.add(this.jButtonCerrarProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		
		this.jButtonRecargarInformacionProductoProduMano.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMano.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMano.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProduMano.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMano.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMano.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProduMano.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMano.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMano.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProduMano.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMano.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMano.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProduMano.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMano.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMano.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProduMano.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMano.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMano.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProduMano.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMano.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMano.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProduMano.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMano.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMano.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProduMano = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProduMano = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProduMano = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProduMano.setLayout(gridaBagParametrosReportesProductoProduMano);
			this.jPanelParametrosReportesAccionesProductoProduMano.setLayout(gridaBagParametrosReportesAccionesProductoProduMano);
			
			
			this.jPanelParametrosAuxiliar1ProductoProduMano.setLayout(gridaBagParametrosAuxiliar1ProductoProduMano);
			this.jPanelParametrosAuxiliar2ProductoProduMano.setLayout(gridaBagParametrosAuxiliar2ProductoProduMano);
			this.jPanelParametrosAuxiliar3ProductoProduMano.setLayout(gridaBagParametrosAuxiliar3ProductoProduMano);
			this.jPanelParametrosAuxiliar4ProductoProduMano.setLayout(gridaBagParametrosAuxiliar4ProductoProduMano);
			//this.jPanelParametrosAuxiliar5ProductoProduMano.setLayout(gridaBagParametrosAuxiliar2ProductoProduMano);			
			
			
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMano.add(this.jButtonRecargarInformacionProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMano.add(this.jComboBoxTiposPaginacionProductoProduMano, this.gridBagConstraintsProductoProduMano);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMano.add(this.jCheckBoxConAltoMaximoTablaProductoProduMano, this.gridBagConstraintsProductoProduMano);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMano.add(this.jComboBoxTiposArchivosReportesProductoProduMano, this.gridBagConstraintsProductoProduMano);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMano.add(this.jPanelParametrosAuxiliar1ProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProduMano.add(this.jComboBoxTiposReportesProductoProduMano, this.gridBagConstraintsProductoProduMano);																		
			
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProduMano.add(this.jComboBoxTiposGraficosReportesProductoProduMano, this.gridBagConstraintsProductoProduMano);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMano.add(this.jPanelParametrosAuxiliar4ProductoProduMano, this.gridBagConstraintsProductoProduMano);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMano.add(this.jComboBoxTiposReportesProductoProduMano, this.gridBagConstraintsProductoProduMano);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMano.add(this.jCheckBoxGenerarReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMano.add(this.jPanelParametrosAuxiliar2ProductoProduMano, this.gridBagConstraintsProductoProduMano);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMano.add(this.jLabelAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProduMano.add(this.jButtonAbrirOrderByProductoProduMano, this.gridBagConstraintsProductoProduMano);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMano.add(this.jComboBoxTiposSeleccionarProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			
			
			/*
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMano.add(this.jCheckBoxSeleccionarTodosProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMano.add(this.jCheckBoxConGraficoReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMano.add(this.jCheckBoxSeleccionarTodosProductoProduMano, this.gridBagConstraintsProductoProduMano);															
				
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMano.add(this.jCheckBoxSeleccionadosProductoProduMano, this.gridBagConstraintsProductoProduMano);															
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMano.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMano.add(this.jCheckBoxConGraficoReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMano.add(this.jPanelParametrosAuxiliar3ProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMano.add(this.jComboBoxTiposAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
	
				
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMano.add(this.jTextFieldValorCampoGeneralProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProduMano = new GridBagLayout();

			this.jScrollPanelDatosProductoProduMano.setLayout(gridaBagLayoutDatosProductoProduMano);
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = 0;
			this.gridBagConstraintsProductoProduMano.gridx = 0;
			
			this.jScrollPanelDatosProductoProduMano.add(this.jTableDatosProductoProduMano, this.gridBagConstraintsProductoProduMano);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProduMano.setViewportView(this.jTableDatosProductoProduMano);
		this.jTableDatosProductoProduMano.setFillsViewportHeight(true);
		this.jTableDatosProductoProduMano.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMano= new GridBagLayout();
		this.jPanelAccionesProductoProduMano.setLayout(gridaBagLayoutAccionesProductoProduMano);
		
		
		/*	
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 0;
			
		this.jPanelAccionesProductoProduMano.add(this.jButtonNuevoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProductoDefiProduProductoProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDefiProduProductoProduMano.setLayout(gridaBagLayoutFK_IdProductoDefiProduProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 0;
		jPanelFK_IdProductoDefiProduProductoProduMano.add(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 1;
		jPanelFK_IdProductoDefiProduProductoProduMano.add(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 1;
		gridBagConstraintsProductoProduMano.gridx =1;
		jPanelFK_IdProductoDefiProduProductoProduMano.add(jButtonFK_IdProductoDefiProduProductoProduMano, gridBagConstraintsProductoProduMano);

		jTabbedPaneBusquedasProductoProduMano.addTab("1.-Por Producto Defi Produ ", jPanelFK_IdProductoDefiProduProductoProduMano);
		jTabbedPaneBusquedasProductoProduMano.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoManoProduEmpresaProductoProduMano.setLayout(gridaBagLayoutFK_IdTipoManoProduEmpresaProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 0;
		jPanelFK_IdTipoManoProduEmpresaProductoProduMano.add(jLabelid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 1;
		jPanelFK_IdTipoManoProduEmpresaProductoProduMano.add(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 1;
		gridBagConstraintsProductoProduMano.gridx =1;
		jPanelFK_IdTipoManoProduEmpresaProductoProduMano.add(jButtonFK_IdTipoManoProduEmpresaProductoProduMano, gridBagConstraintsProductoProduMano);

		jTabbedPaneBusquedasProductoProduMano.addTab("2.-Por Tipo Mano Obra Empresa ", jPanelFK_IdTipoManoProduEmpresaProductoProduMano);
		jTabbedPaneBusquedasProductoProduMano.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano.setLayout(gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 0;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano.add(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano.add(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 1;
		gridBagConstraintsProductoProduMano.gridx =1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano.add(jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano, gridBagConstraintsProductoProduMano);

		jTabbedPaneBusquedasProductoProduMano.addTab("3.-Por Tipo Proceso Empresa Produ ", jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);
		jTabbedPaneBusquedasProductoProduMano.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoProduMano= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoProduMano.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMano.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMano.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoProduMano.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoProduMano.setLayout(gridaBagLayoutFK_IdUnidadProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 0;
		jPanelFK_IdUnidadProductoProduMano.add(jLabelid_unidadFK_IdUnidadProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 0;
		gridBagConstraintsProductoProduMano.gridx = 1;
		jPanelFK_IdUnidadProductoProduMano.add(jComboBoxid_unidadFK_IdUnidadProductoProduMano, gridBagConstraintsProductoProduMano);

		gridBagConstraintsProductoProduMano = new GridBagConstraints();
		gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMano.gridy = 1;
		gridBagConstraintsProductoProduMano.gridx =1;
		jPanelFK_IdUnidadProductoProduMano.add(jButtonFK_IdUnidadProductoProduMano, gridBagConstraintsProductoProduMano);

		jTabbedPaneBusquedasProductoProduMano.addTab("4.-Por Unad ", jPanelFK_IdUnidadProductoProduMano);
		jTabbedPaneBusquedasProductoProduMano.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMano = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMano);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMano.gridx = 0;		
			//this.gridBagConstraintsProductoProduMano.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMano.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProduMano, this.gridBagConstraintsProductoProduMano);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMano.gridx = 0;		
		//this.gridBagConstraintsProductoProduMano.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProduMano.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProduMano);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMano.gridx = 0;		
			this.gridBagConstraintsProductoProduMano.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProduMano.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProduMano, this.gridBagConstraintsProductoProduMano);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProduMano, this.gridBagConstraintsProductoProduMano);								
		
		
		/*
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
		*/		
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMano.gridx =0;
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMano.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMano, this.gridBagConstraintsProductoProduMano);
				
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProduMano, this.gridBagConstraintsProductoProduMano);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProduMano= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMano = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProduMano.setLayout(gridaBagLayoutBusquedasParametrosProductoProduMano);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProduMano=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProduMano;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProduMano() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProduMano = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProduMano.setName("jPanelReporteDinamicoProductoProduMano"); 
		
		this.jPanelReporteDinamicoProductoProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProduMano.setLayout(gridaBagLayoutReporteDinamicoProductoProduMano);
		
		
		this.jInternalFrameReporteDinamicoProductoProduMano= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProduMano = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMano= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProduMano.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProduMano.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProduMano.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMano.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMano.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProduMano = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProduMano.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelColumnasSelectReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProduMano = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProduMano.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProduMano.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMano.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProduMano=new JScrollPane(this.jListColumnasSelectReporteProductoProduMano);
			
			this.jScrollColumnasSelectReporteProductoProduMano.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMano.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMano.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProduMano.add(this.jListColumnasSelectReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
		this.jPanelReporteDinamicoProductoProduMano.add(this.jScrollColumnasSelectReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProduMano = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProduMano.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProduMano = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProduMano.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProduMano.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMano.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProduMano=new JScrollPane(this.jListRelacionesSelectReporteProductoProduMano);
			
			this.jScrollRelacionesSelectReporteProductoProduMano.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMano.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMano.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProduMano = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProduMano = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProduMano = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProduMano = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProduMano.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProduMano = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProduMano.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelConGraficoDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProduMano.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProduMano.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProduMano.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMano.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMano.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jCheckBoxConGraficoDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProduMano = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProduMano.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelColumnaCategoriaGraficoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProduMano.add(this.jComboBoxColumnaCategoriaGraficoProductoProduMano, this.gridBagConstraintsProductoProduMano);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProduMano = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProduMano.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelColumnaCategoriaValorProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProduMano.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProduMano.add(this.jComboBoxColumnaCategoriaValorProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProduMano = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProduMano.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelColumnasValoresGraficoProductoProduMano, this.gridBagConstraintsProductoProduMano);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProduMano = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProduMano.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProduMano.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProduMano.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMano.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMano.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProduMano=new JScrollPane(this.jListColumnasValoresGraficoProductoProduMano);
			
			this.jScrollColumnasValoresGraficoProductoProduMano.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMano.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMano.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProduMano.add(this.jListColumnasSelectReporteProductoProduMano, this.gridBagConstraintsProductoProduMano);
		this.jPanelReporteDinamicoProductoProduMano.add(this.jScrollColumnasValoresGraficoProductoProduMano, this.gridBagConstraintsProductoProduMano);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProduMano = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProduMano.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelTiposGraficosReportesDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMano.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProduMano = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProduMano.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelGenerarExcelReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMano = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProduMano.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProduMano,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMano.setToolTipText("Generar EXCEL"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProduMano.add(this.jButtonGenerarExcelReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMano.add(this.jComboBoxTiposReportesDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProduMano = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProduMano.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMano.add(this.jLabelTiposArchivoReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMano.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProduMano = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProduMano.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProduMano,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProduMano.setToolTipText("Generar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMano.add(this.jButtonGenerarReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProduMano = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProduMano.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProduMano,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProduMano.setToolTipText("Cancelar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMano.add(this.jButtonCerrarReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProduMano = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProduMano= new JScrollPane(jPanelReporteDinamicoProductoProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProduMano.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMano.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMano.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMano.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProduMano.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProduMano);
		this.jInternalFrameReporteDinamicoProductoProduMano.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProduMano, this.gridBagConstraintsProductoProduMano);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProduMano() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProduMano = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProduMano.setName("jPanelImportacionProductoProduMano"); 
		
		this.jPanelImportacionProductoProduMano.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMano.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMano.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProduMano.setLayout(gridaBagLayoutImportacionProductoProduMano);
		
		
		this.jInternalFrameImportacionProductoProduMano= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProduMano= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProduMano = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMano= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMano.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProduMano.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMano.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMano.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMano.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMano.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMano.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProduMano.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMano.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMano.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMano.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProduMano.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMano.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMano.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProduMano = new JLabelMe();

		this.jLabelArchivoImportacionProductoProduMano.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMano.add(this.jLabelArchivoImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProduMano = new JFileChooser();		
		this.jFileChooserImportacionProductoProduMano.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProduMano = new JButtonMe();
		this.jButtonAbrirImportacionProductoProduMano.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProduMano,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProduMano.setToolTipText("Generar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMano.add(this.jButtonAbrirImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProduMano = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProduMano.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMano.add(this.jLabelPathArchivoImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProduMano=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProduMano.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMano.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMano.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMano.add(this.jTextFieldPathArchivoImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProduMano = new JButtonMe();
		this.jButtonGenerarImportacionProductoProduMano.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProduMano,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProduMano.setToolTipText("Generar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMano.add(this.jButtonGenerarImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProduMano = new JButtonMe();
		this.jButtonCerrarImportacionProductoProduMano.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProduMano,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProduMano.setToolTipText("Cancelar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMano.add(this.jButtonCerrarImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProduMano = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProduMano= new JScrollPane(jPanelImportacionProductoProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProduMano.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProduMano.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProduMano);
		this.jInternalFrameImportacionProductoProduMano.getContentPane().add(this.jScrollPanelImportacionProductoProduMano, this.gridBagConstraintsProductoProduMano);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProduMano(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProduMano = new JButtonMe();
			this.jButtonAbrirOrderByProductoProduMano.setText("Orden");
			this.jButtonAbrirOrderByProductoProduMano.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMano,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProduMano";
			inputMap = this.jButtonAbrirOrderByProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProduMano"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProduMano = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProduMano.setName("jPanelOrderByProductoProduMano"); 
			
			this.jPanelOrderByProductoProduMano.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMano.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMano.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProduMano.setLayout(gridaBagLayoutOrderByProductoProduMano);
			
			
			this.jTableDatosProductoProduManoOrderBy = new JTableMe();        
			this.jTableDatosProductoProduManoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProduManoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProduManoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProduManoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProduManoOrderBy.setViewportView(this.jTableDatosProductoProduManoOrderBy);
			this.jTableDatosProductoProduManoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProduManoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProduMano= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProduMano= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProduMano = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProduMano= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProduMano.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProduMano.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProduMano.setTitle("Orden");
			this.jInternalFrameOrderByProductoProduMano.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProduMano.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProduMano.setResizable(true);
			this.jInternalFrameOrderByProductoProduMano.setClosable(true);
			this.jInternalFrameOrderByProductoProduMano.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProduMano.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMano.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMano.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMano.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProduMano.ipady =150;
				
			this.jPanelOrderByProductoProduMano.add(jScrollPanelDatosProductoProduManoOrderBy, this.gridBagConstraintsProductoProduMano);//this.jTableDatosProductoProduManoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProduMano = new JButtonMe();
			this.jButtonCerrarOrderByProductoProduMano.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProduMano,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProduMano.setToolTipText("Cancelar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMano.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProduMano.add(this.jButtonCerrarOrderByProductoProduMano, this.gridBagConstraintsProductoProduMano);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProduMano = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProduMano= new JScrollPane(jPanelOrderByProductoProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProduMano.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProduMano.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProduMano.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProduMano);
			
			this.jInternalFrameOrderByProductoProduMano.getContentPane().add(this.jScrollPanelOrderByProductoProduMano, this.gridBagConstraintsProductoProduMano);			
		
		} else {
			this.jButtonAbrirOrderByProductoProduMano = new JButtonMe();
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
			&& this.productoprodumanoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProduMano.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProduMano.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProduMano.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProduMano.getRowHeight();//ProductoProduManoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMano.isSelected()) {
					iHeightTable=ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMano.isSelected()) {
					iHeightTable=ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduManoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProduMano.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMano.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMano.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProduMano.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMano.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMano.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProduMano!=null && this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy()!=null) {
			//if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProduMano.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProduMano.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProduMano.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProduMano.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMano.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMano.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoprodumanoLogic.getProductoProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumanos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProduMano> TraerProductoProduManoBeans(List<ProductoProduMano> productoprodumanos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProduMano productoprodumano:productoprodumanos) {
					
				if(!(ProductoProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoprodumano.setsDetalleGeneralEntityReporte(ProductoProduManoConstantesFunciones.getProductoProduManoDescripcion(productoprodumano));
										
						
					
						
					
				} else  {
							
					//productoprodumano.setsDetalleGeneralEntityReporte(productoprodumano.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoprodumanobeans.add(productoprodumanobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoprodumanos;
    }
	//PARA REPORTES FIN
}
