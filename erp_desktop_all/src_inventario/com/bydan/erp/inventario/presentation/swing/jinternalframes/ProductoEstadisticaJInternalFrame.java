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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.ProductoEstadisticaConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class ProductoEstadisticaJInternalFrame extends ProductoEstadisticaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoEstadistica;
	
	protected JMenuBar jmenuBarProductoEstadistica;
	
	protected JMenu jmenuProductoEstadistica;
	protected JMenu jmenuDatosProductoEstadistica;
	protected JMenu jmenuArchivoProductoEstadistica;
	protected JMenu jmenuAccionesProductoEstadistica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoEstadistica;	
	protected GridBagConstraints gridBagConstraintsProductoEstadistica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoEstadisticaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoEstadistica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoEstadistica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoEstadistica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoEstadisticaSessionBean productoestadisticaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoEstadistica> productoestadisticas;		
	public List<ProductoEstadistica> productoestadisticasEliminados;	
	public List<ProductoEstadistica> productoestadisticasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoEstadistica;		
	protected JButton jButtonAbrirOrderByProductoEstadistica;
	
	
	//protected JPanel jPanelOrderByProductoEstadistica;
	//public JScrollPane jScrollPanelOrderByProductoEstadistica;	
	//protected JButton jButtonCerrarOrderByProductoEstadistica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoEstadisticaLogic productoestadisticaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoEstadistica;
	public JScrollPane jScrollPanelDatosEdicionProductoEstadistica;
	public JScrollPane jScrollPanelDatosGeneralProductoEstadistica;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoEstadisticaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoEstadistica;
	//public JScrollPane jScrollPanelImportacionProductoEstadistica;
	
	
	
	protected JPanel jPanelAccionesProductoEstadistica;
	
    protected JPanel jPanelPaginacionProductoEstadistica;
    protected JPanel jPanelParametrosReportesProductoEstadistica;
	protected JPanel jPanelParametrosReportesAccionesProductoEstadistica;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoEstadistica;
	protected JPanel jPanelParametrosAuxiliar2ProductoEstadistica;
	protected JPanel jPanelParametrosAuxiliar3ProductoEstadistica;
	protected JPanel jPanelParametrosAuxiliar4ProductoEstadistica;
	//protected JPanel jPanelParametrosAuxiliar5ProductoEstadistica;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoEstadistica;
	//protected JPanel jPanelImportacionProductoEstadistica;
	
	
	public JTable jTableDatosProductoEstadistica;
	
	
	
	//public JTable jTableDatosProductoEstadisticaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoEstadistica;
	protected JButton jButtonDuplicarProductoEstadistica;
	protected JButton jButtonCopiarProductoEstadistica;
	protected JButton jButtonVerFormProductoEstadistica;
	protected JButton jButtonNuevoRelacionesProductoEstadistica;
	protected JButton jButtonModificarProductoEstadistica;
	
    protected JButton jButtonGuardarCambiosTablaProductoEstadistica;
	protected JButton jButtonCerrarProductoEstadistica;
	
	
	protected JButton jButtonRecargarInformacionProductoEstadistica;
	protected JButton jButtonProcesarInformacionProductoEstadistica;
	
	
	protected JButton jButtonAnterioresProductoEstadistica;
	protected JButton jButtonSiguientesProductoEstadistica;
	protected JButton jButtonNuevoGuardarCambiosProductoEstadistica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoEstadistica;
	//protected JButton jButtonCerrarReporteDinamicoProductoEstadistica;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoEstadistica;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoEstadistica;
	//protected JButton jButtonGenerarImportacionProductoEstadistica;
	//protected JButton jButtonCerrarImportacionProductoEstadistica;
	//protected JFileChooser jFileChooserImportacionProductoEstadistica;
	//protected File fileImportacionProductoEstadistica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoEstadistica;
	protected JButton jButtonDuplicarToolBarProductoEstadistica;
	protected JButton jButtonNuevoRelacionesToolBarProductoEstadistica;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoEstadistica;
	protected JButton jButtonCopiarToolBarProductoEstadistica;
	protected JButton jButtonVerFormToolBarProductoEstadistica;
	public JButton jButtonGuardarCambiosTablaToolBarProductoEstadistica;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoEstadistica;
	protected JButton jButtonCerrarToolBarProductoEstadistica;
	
	protected JButton jButtonRecargarInformacionToolBarProductoEstadistica;
	protected JButton jButtonProcesarInformacionToolBarProductoEstadistica;
	protected JButton jButtonAnterioresToolBarProductoEstadistica;
	protected JButton jButtonSiguientesToolBarProductoEstadistica;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoEstadistica;
	protected JButton jButtonAbrirOrderByToolBarProductoEstadistica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoEstadistica;
	protected JMenuItem jMenuItemDuplicarProductoEstadistica;
	protected JMenuItem jMenuItemNuevoRelacionesProductoEstadistica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoEstadistica;
	protected JMenuItem jMenuItemCopiarProductoEstadistica;
	protected JMenuItem jMenuItemVerFormProductoEstadistica;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoEstadistica;
	protected JMenuItem jMenuItemCerrarProductoEstadistica;
	protected JMenuItem jMenuItemDetalleCerrarProductoEstadistica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoEstadistica;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoEstadistica;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoEstadistica;
	protected JMenuItem jMenuItemProcesarInformacionProductoEstadistica;
	protected JMenuItem jMenuItemAnterioresProductoEstadistica;
	protected JMenuItem jMenuItemSiguientesProductoEstadistica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoEstadistica;
	protected JMenuItem jMenuItemAbrirOrderByProductoEstadistica;
	protected JMenuItem jMenuItemMostrarOcultarProductoEstadistica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoEstadistica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoEstadistica;
	protected JCheckBox jCheckBoxSeleccionadosProductoEstadistica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoEstadistica;
	protected JCheckBox jCheckBoxConGraficoReporteProductoEstadistica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoEstadistica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoEstadistica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoEstadistica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoEstadistica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoEstadistica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoEstadistica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoEstadistica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoEstadistica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoEstadistica;
	protected JTextField jTextFieldValorCampoGeneralProductoEstadistica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoEstadistica;
	//public JList<Reporte> jListColumnasSelectReporteProductoEstadistica;
	//public JScrollPane jScrollColumnasSelectReporteProductoEstadistica;
	
	//public JLabel jLabelRelacionesSelectReporteProductoEstadistica;
	//public JList<Reporte> jListRelacionesSelectReporteProductoEstadistica;
	//public JScrollPane jScrollRelacionesSelectReporteProductoEstadistica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoEstadistica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoEstadistica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoEstadistica;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoEstadistica;
	
		
	//public JLabel jLabelArchivoImportacionProductoEstadistica;	
	//public JLabel jLabelPathArchivoImportacionProductoEstadistica;
	//protected JTextField jTextFieldPathArchivoImportacionProductoEstadistica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoEstadistica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoEstadistica;
	
	//public JLabel jLabelColumnaCategoriaValorProductoEstadistica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoEstadistica;
	
	//public JLabel jLabelColumnasValoresGraficoProductoEstadistica;
	//public JList<Reporte> jListColumnasValoresGraficoProductoEstadistica;
	//public JScrollPane jScrollColumnasValoresGraficoProductoEstadistica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoEstadistica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoEstadistica;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoEstadistica;
	public JPanel jPanelFK_IdBodegaProductoEstadistica;
	public JButton jButtonFK_IdBodegaProductoEstadistica;
	public JPanel jPanelFK_IdProductoProductoEstadistica;
	public JButton jButtonFK_IdProductoProductoEstadistica;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoEstadistica;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoEstadistica;
	public JButton jButtonid_bodegaFK_IdBodegaProductoEstadistica= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoEstadisticaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoEstadistica;
	public JLabel jLabelid_productoFK_IdProductoProductoEstadistica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoEstadistica;
	public JButton jButtonid_productoFK_IdProductoProductoEstadistica= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoEstadisticaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoEstadisticaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoEstadistica;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoEstadisticaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEstadisticaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoEstadistica)	{
		this.jButtonRecargarInformacionProductoEstadistica = jButtonRecargarInformacionProductoEstadistica;
	}
	
	public JButton getjButtonProcesarInformacionProductoEstadistica() {
		return this.jButtonProcesarInformacionProductoEstadistica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoEstadistica)	{
		this.jButtonProcesarInformacionProductoEstadistica = jButtonProcesarInformacionProductoEstadistica;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoEstadistica() {
		return this.jButtonRecargarInformacionProductoEstadistica;
	}
	
	
	public List<ProductoEstadistica> getproductoestadisticas() {
		return this.productoestadisticas;
	}

	public void setproductoestadisticas(List<ProductoEstadistica> productoestadisticas) {
		this.productoestadisticas = productoestadisticas;
	}
	
	public List<ProductoEstadistica> getproductoestadisticasAux() {
		return this.productoestadisticasAux;
	}

	public void setproductoestadisticasAux(List<ProductoEstadistica> productoestadisticasAux) {
		this.productoestadisticasAux = productoestadisticasAux;
	}
	
	public List<ProductoEstadistica> getproductoestadisticasEliminados() {
		return this.productoestadisticasEliminados;
	}

	public void setProductoEstadisticasEliminados(List<ProductoEstadistica> productoestadisticasEliminados) {
		this.productoestadisticasEliminados = productoestadisticasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoEstadistica() {
		return jComboBoxTiposSeleccionarProductoEstadistica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoEstadistica(
			JComboBox jComboBoxTiposSeleccionarProductoEstadistica) {
		this.jComboBoxTiposSeleccionarProductoEstadistica = jComboBoxTiposSeleccionarProductoEstadistica;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoEstadistica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoEstadistica() {
		return jTextFieldValorCampoGeneralProductoEstadistica;
	}

	public void setjTextFieldValorCampoGeneralProductoEstadistica(
			JTextField jTextFieldValorCampoGeneralProductoEstadistica) {
		this.jTextFieldValorCampoGeneralProductoEstadistica = jTextFieldValorCampoGeneralProductoEstadistica;
	}

	public void setBorderResaltarValorCampoGeneralProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoEstadistica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoEstadistica() {
		return this.jCheckBoxSeleccionarTodosProductoEstadistica;
	}

	public void setjCheckBoxSeleccionarTodosProductoEstadistica(
			JCheckBox jCheckBoxSeleccionarTodosProductoEstadistica) {
		this.jCheckBoxSeleccionarTodosProductoEstadistica = jCheckBoxSeleccionarTodosProductoEstadistica;
	}

	public void setBorderResaltarSeleccionarTodosProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoEstadistica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoEstadistica() {
		return this.jCheckBoxSeleccionadosProductoEstadistica;
	}

	public void setjCheckBoxSeleccionadosProductoEstadistica(
			JCheckBox jCheckBoxSeleccionadosProductoEstadistica) {
		this.jCheckBoxSeleccionadosProductoEstadistica = jCheckBoxSeleccionadosProductoEstadistica;
	}
	
	public void setBorderResaltarSeleccionadosProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoEstadistica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoEstadistica() {
		return this.jComboBoxTiposArchivosReportesProductoEstadistica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoEstadistica(
			JComboBox jComboBoxTiposArchivosReportesProductoEstadistica) {
		this.jComboBoxTiposArchivosReportesProductoEstadistica = jComboBoxTiposArchivosReportesProductoEstadistica;
	}

	public void setBorderResaltarTiposArchivosReportesProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoEstadistica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoEstadistica() {
		return this.jComboBoxTiposReportesProductoEstadistica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoEstadistica(
			JComboBox jComboBoxTiposReportesProductoEstadistica) {
		this.jComboBoxTiposReportesProductoEstadistica = jComboBoxTiposReportesProductoEstadistica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoEstadistica() {
	//	return jComboBoxTiposReportesDinamicoProductoEstadistica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoEstadistica(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoEstadistica) {
	//	this.jComboBoxTiposReportesDinamicoProductoEstadistica = jComboBoxTiposReportesDinamicoProductoEstadistica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoEstadistica() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoEstadistica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoEstadistica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoEstadistica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica = jComboBoxTiposArchivosReportesDinamicoProductoEstadistica;
	//}
	
	public void setBorderResaltarTiposReportesProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoEstadistica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoEstadistica() {
		return this.jComboBoxTiposGraficosReportesProductoEstadistica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoEstadistica(
			JComboBox jComboBoxTiposGraficosReportesProductoEstadistica) {
		this.jComboBoxTiposGraficosReportesProductoEstadistica = jComboBoxTiposGraficosReportesProductoEstadistica;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoEstadistica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoEstadistica() {
		return this.jComboBoxTiposPaginacionProductoEstadistica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoEstadistica(
			JComboBox jComboBoxTiposPaginacionProductoEstadistica) {
		this.jComboBoxTiposPaginacionProductoEstadistica = jComboBoxTiposPaginacionProductoEstadistica;
	}
	
	public void setBorderResaltarTiposPaginacionProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoEstadistica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoEstadistica() {
		return this.jComboBoxTiposRelacionesProductoEstadistica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoEstadistica() {
		return this.jComboBoxTiposAccionesProductoEstadistica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoEstadistica(
			JComboBox jComboBoxTiposRelacionesProductoEstadistica) {
		this.jComboBoxTiposRelacionesProductoEstadistica = jComboBoxTiposRelacionesProductoEstadistica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoEstadistica(
			JComboBox jComboBoxTiposAccionesProductoEstadistica) {
		this.jComboBoxTiposAccionesProductoEstadistica = jComboBoxTiposAccionesProductoEstadistica;
	}
	
	public void setBorderResaltarTiposRelacionesProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoEstadistica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoEstadistica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoEstadistica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoEstadistica() {
	//	return jCheckBoxConGraficoDinamicoProductoEstadistica;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoEstadistica(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoEstadistica) {
	//	this.jCheckBoxConGraficoDinamicoProductoEstadistica = jCheckBoxConGraficoDinamicoProductoEstadistica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoEstadistica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoEstadistica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoEstadistica .setBorder(borderResaltar);		
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
		this.productoestadisticaSessionBean=new ProductoEstadisticaSessionBean();
		
		this.productoestadisticaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoestadisticaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoestadisticaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoEstadisticaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estadistica MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoEstadisticaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoEstadistica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoEstadistica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"nuevo","nuevo","Nuevo"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"duplicar","duplicar","Duplicar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"copiar","copiar","Copiar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"ver_form","ver_form","Ver"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"recargar","recargar","Recargar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoEstadistica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoEstadistica,this.jTtoolBarProductoEstadistica,
							"cerrar","cerrar","Salir"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoEstadistica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoEstadistica;
			
				this.jButtonProcesarInformacionToolBarProductoEstadistica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoEstadistica;
				
		//protected JButton jButtonModificarToolBarProductoEstadistica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoEstadistica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoEstadistica=new JMenuMe("General");
		this.jmenuArchivoProductoEstadistica=new JMenuMe("Archivo");
		this.jmenuAccionesProductoEstadistica=new JMenuMe("Acciones");
		this.jmenuDatosProductoEstadistica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoEstadistica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoEstadistica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoEstadistica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoEstadistica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoEstadistica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoEstadistica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoEstadistica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoEstadistica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoEstadistica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoEstadistica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoEstadistica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoEstadistica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoEstadistica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoEstadistica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoEstadistica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoEstadistica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoEstadistica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoEstadistica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoEstadistica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoEstadistica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoEstadistica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoEstadistica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoEstadistica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoEstadistica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoEstadistica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoEstadistica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoEstadistica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoEstadistica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoEstadistica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoEstadistica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoEstadistica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoEstadistica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoEstadistica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoEstadistica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoEstadistica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoEstadistica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoEstadistica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoEstadistica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoEstadistica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoEstadistica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoEstadistica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoEstadistica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoEstadistica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoEstadistica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoEstadistica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoEstadistica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoEstadistica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoEstadistica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoEstadistica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoEstadistica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoEstadistica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoEstadistica.add(this.jMenuItemCerrarProductoEstadistica);
			
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemNuevoProductoEstadistica);
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemNuevoGuardarCambiosProductoEstadistica);
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemNuevoRelacionesProductoEstadistica);
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemGuardarCambiosTablaProductoEstadistica);		
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemDuplicarProductoEstadistica);		
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemCopiarProductoEstadistica);		
			this.jmenuAccionesProductoEstadistica.add(this.jMenuItemVerFormProductoEstadistica);		
			
			this.jmenuDatosProductoEstadistica.add(this.jMenuItemRecargarInformacionProductoEstadistica);				
			this.jmenuDatosProductoEstadistica.add(this.jMenuItemAnterioresProductoEstadistica);				
			this.jmenuDatosProductoEstadistica.add(this.jMenuItemSiguientesProductoEstadistica);				
			this.jmenuDatosProductoEstadistica.add(this.jMenuItemAbrirOrderByProductoEstadistica);				
			this.jmenuDatosProductoEstadistica.add(this.jMenuItemMostrarOcultarProductoEstadistica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoEstadistica.add(this.jMenuItemGuardarCambiosProductoEstadistica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoEstadistica.add(this.jmenuArchivoProductoEstadistica);		
			this.jmenuBarProductoEstadistica.add(this.jmenuAccionesProductoEstadistica);		
			this.jmenuBarProductoEstadistica.add(this.jmenuDatosProductoEstadistica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoEstadistica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoEstadistica() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoEstadistica.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoEstadistica= new JButtonMe();
		this.jButtonFK_IdBodegaProductoEstadistica.setText("Buscar");
		this.jButtonFK_IdBodegaProductoEstadistica.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoEstadistica,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoEstadistica = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoEstadistica.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoEstadistica.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoEstadistica= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoEstadistica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoEstadistica.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoEstadistica= new JButtonMe();
		this.jButtonFK_IdProductoProductoEstadistica.setText("Buscar");
		this.jButtonFK_IdProductoProductoEstadistica.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoEstadistica,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoEstadistica = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoEstadistica.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoEstadistica.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoEstadistica= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica.setFocusable(false);


		this.jTabbedPaneBusquedasProductoEstadistica=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoEstadistica.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoEstadistica.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoEstadistica.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoEstadistica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoEstadistica = new ProductoEstadisticaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estadistica DATOS");
			this.jInternalFrameDetalleFormProductoEstadistica = new ProductoEstadisticaDetalleFormJInternalFrame(jDesktopPane,this.productoestadisticaSessionBean.getConGuardarRelaciones(),this.productoestadisticaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoEstadistica = null;//new ProductoEstadisticaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoEstadistica= new GridBagLayout();
		
		
		this.jTableDatosProductoEstadistica = new JTableMe();      
		
		String sToolTipProductoEstadistica="";
		sToolTipProductoEstadistica=ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoEstadistica+="(Inventario.ProductoEstadistica)";
		}
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoEstadistica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoEstadistica.setToolTipText(sToolTipProductoEstadistica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoEstadistica);
		this.jTableDatosProductoEstadistica.setAutoCreateRowSorter(true);
		this.jTableDatosProductoEstadistica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoEstadistica.setRowSelectionAllowed(true);
		this.jTableDatosProductoEstadistica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoEstadistica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoEstadistica = new JButtonMe();
		this.jButtonDuplicarProductoEstadistica = new JButtonMe();
		this.jButtonCopiarProductoEstadistica = new JButtonMe();
		this.jButtonVerFormProductoEstadistica = new JButtonMe();
		this.jButtonNuevoRelacionesProductoEstadistica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoEstadistica = new JButtonMe();
		this.jButtonCerrarProductoEstadistica = new JButtonMe();
		
		this.jScrollPanelDatosProductoEstadistica = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoEstadistica = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estadistica";
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoEstadistica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoEstadistica.setToolTipText("Acciones");
        this.jPanelAccionesProductoEstadistica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoEstadistica=new ReporteDinamicoJInternalFrame(ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoEstadistica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoEstadistica=new ImportacionJInternalFrame(ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoEstadistica();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoEstadistica = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoEstadistica.setText("Orden");
		this.jButtonAbrirOrderByProductoEstadistica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoEstadistica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoEstadistica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEstadistica,false,this);
			
			//this.cargarOrderByProductoEstadistica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoEstadistica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEstadistica,true,this);
			
			//this.cargarOrderByProductoEstadistica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoEstadistica.setMinimumSize(new Dimension(400,50));//3530
		this.jTableDatosProductoEstadistica.setMaximumSize(new Dimension(400,50));//3530
		this.jTableDatosProductoEstadistica.setPreferredSize(new Dimension(400,50));//3530
		
		this.jScrollPanelDatosProductoEstadistica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoEstadistica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoEstadistica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoEstadistica.setText("Nuevo");
		this.jButtonDuplicarProductoEstadistica.setText("Duplicar");
		this.jButtonCopiarProductoEstadistica.setText("Copiar");
		this.jButtonVerFormProductoEstadistica.setText("Ver");
		this.jButtonNuevoRelacionesProductoEstadistica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoEstadistica.setText("Guardar");
		this.jButtonCerrarProductoEstadistica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoEstadistica,"nuevo_button","Nuevo",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoEstadistica,"duplicar_button","Duplicar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoEstadistica,"copiar_button","Copiar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoEstadistica,"ver_form","Ver",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoEstadistica,"nuevorelaciones_button","Nuevo Rel",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoEstadistica,"guardarcambiostabla_button","Guardar",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoEstadistica,"cerrar_button","Salir",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoEstadistica.setToolTipText("Nuevo"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoEstadistica.setToolTipText("Duplicar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoEstadistica.setToolTipText("Copiar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoEstadistica.setToolTipText("Ver"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoEstadistica.setToolTipText("Nuevo Rel"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoEstadistica.setToolTipText("Guardar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoEstadistica.setToolTipText("Salir"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoEstadistica";
		inputMap = this.jButtonNuevoProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoEstadistica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoEstadistica"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoEstadistica";
		inputMap = this.jButtonDuplicarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoEstadistica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoEstadistica"));
		
		//COPIAR
		sMapKey = "CopiarProductoEstadistica";
		inputMap = this.jButtonCopiarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoEstadistica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoEstadistica"));
		
		//VEr FORM
		sMapKey = "VerFormProductoEstadistica";
		inputMap = this.jButtonVerFormProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoEstadistica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoEstadistica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoEstadistica";
		inputMap = this.jButtonNuevoRelacionesProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoEstadistica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoEstadistica";
		inputMap = this.jButtonModificarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoEstadistica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoEstadistica";
		inputMap = this.jButtonCerrarProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoEstadistica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoEstadistica";
		inputMap = this.jButtonGuardarCambiosTablaProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoEstadistica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoEstadistica.setName("jPanelParametrosReportesProductoEstadistica"); 
		
		this.jPanelParametrosReportesAccionesProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoEstadistica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoEstadistica.setName("jPanelParametrosReportesAccionesProductoEstadistica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoEstadistica = new JButtonMe();
		this.jButtonRecargarInformacionProductoEstadistica.setText("Recargar");
		this.jButtonRecargarInformacionProductoEstadistica.setToolTipText("Recargar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoEstadistica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoEstadistica = new JButtonMe();
		this.jButtonProcesarInformacionProductoEstadistica.setText("Procesar");
		this.jButtonProcesarInformacionProductoEstadistica.setToolTipText("Procesar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoEstadistica.setVisible(false);
			
		this.jButtonProcesarInformacionProductoEstadistica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoEstadistica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoEstadistica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEstadistica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoEstadistica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEstadistica.setText("TIPO");       
		this.jComboBoxTiposReportesProductoEstadistica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoEstadistica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoEstadistica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoEstadistica.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoEstadistica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoEstadistica.setText("Accion");
		this.jComboBoxTiposRelacionesProductoEstadistica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoEstadistica.setText("Accion");
		this.jComboBoxTiposAccionesProductoEstadistica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoEstadistica.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoEstadistica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoEstadistica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoEstadistica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoEstadistica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoEstadistica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoEstadistica = new JLabelMe();
		
		this.jLabelAccionesProductoEstadistica.setText("Acciones");		
		this.jLabelAccionesProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoEstadistica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoEstadistica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoEstadistica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoEstadistica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoEstadistica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoEstadistica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoEstadistica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoEstadistica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoEstadistica.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoEstadistica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoEstadistica = new JButtonMe();
		//this.jButtonAnterioresProductoEstadistica.setText("<<");
        this.jButtonAnterioresProductoEstadistica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoEstadistica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoEstadistica = new JButtonMe();
		//this.jButtonSiguientesProductoEstadistica.setText(">>");
        this.jButtonSiguientesProductoEstadistica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoEstadistica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoEstadistica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoEstadistica.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoEstadistica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoEstadistica,"nuevoguardarcambios_button","Nue",this.productoestadisticaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoEstadistica";
		inputMap = this.jButtonNuevoGuardarCambiosProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoEstadistica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoEstadistica";
		inputMap = this.jButtonRecargarInformacionProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoEstadistica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoEstadistica";
		inputMap = this.jButtonSiguientesProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoEstadistica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoEstadistica";
		inputMap = this.jButtonAnterioresProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoEstadistica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoEstadistica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoEstadistica.setMinimumSize(new Dimension(this.getWidth(),ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoEstadistica.setMaximumSize(new Dimension(this.getWidth(),ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoEstadistica.setPreferredSize(new Dimension(this.getWidth(),ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoEstadisticaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoEstadistica = new GridBagLayout();

			this.jPanelPaginacionProductoEstadistica.setLayout(gridaBagLayoutPaginacionProductoEstadistica);						
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 0;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonAnterioresProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					
						
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoEstadistica.gridy = 0;
			
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonNuevoGuardarCambiosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
						
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoEstadistica.gridy = 0;
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonSiguientesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 1;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonNuevoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
						
			
			
			if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
				this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoEstadistica.gridy = 1;
				this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoEstadistica.add(this.jButtonGuardarCambiosTablaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			}
			
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 1;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonDuplicarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 1;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonCopiarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 1;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonVerFormProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 1;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoEstadistica.add(this.jButtonCerrarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		
		this.jButtonRecargarInformacionProductoEstadistica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoEstadistica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoEstadistica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoEstadistica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoEstadistica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoEstadistica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoEstadistica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoEstadistica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoEstadistica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoEstadistica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoEstadistica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoEstadistica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoEstadistica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoEstadistica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoEstadistica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoEstadistica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoEstadistica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoEstadistica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoEstadistica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEstadistica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEstadistica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoEstadistica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoEstadistica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoEstadistica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoEstadistica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoEstadistica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoEstadistica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoEstadistica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoEstadistica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoEstadistica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoEstadistica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoEstadistica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoEstadistica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoEstadistica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoEstadistica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoEstadistica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoEstadistica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoEstadistica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoEstadistica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoEstadistica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoEstadistica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoEstadistica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoEstadistica.setLayout(gridaBagParametrosReportesProductoEstadistica);
			this.jPanelParametrosReportesAccionesProductoEstadistica.setLayout(gridaBagParametrosReportesAccionesProductoEstadistica);
			
			
			this.jPanelParametrosAuxiliar1ProductoEstadistica.setLayout(gridaBagParametrosAuxiliar1ProductoEstadistica);
			this.jPanelParametrosAuxiliar2ProductoEstadistica.setLayout(gridaBagParametrosAuxiliar2ProductoEstadistica);
			this.jPanelParametrosAuxiliar3ProductoEstadistica.setLayout(gridaBagParametrosAuxiliar3ProductoEstadistica);
			this.jPanelParametrosAuxiliar4ProductoEstadistica.setLayout(gridaBagParametrosAuxiliar4ProductoEstadistica);
			//this.jPanelParametrosAuxiliar5ProductoEstadistica.setLayout(gridaBagParametrosAuxiliar2ProductoEstadistica);			
			
			
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEstadistica.add(this.jButtonRecargarInformacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEstadistica.add(this.jComboBoxTiposPaginacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEstadistica.add(this.jCheckBoxConAltoMaximoTablaProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoEstadistica.add(this.jComboBoxTiposArchivosReportesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEstadistica.add(this.jPanelParametrosAuxiliar1ProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoEstadistica.add(this.jComboBoxTiposReportesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);																		
			
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoEstadistica.add(this.jComboBoxTiposGraficosReportesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEstadistica.add(this.jPanelParametrosAuxiliar4ProductoEstadistica, this.gridBagConstraintsProductoEstadistica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEstadistica.add(this.jComboBoxTiposReportesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEstadistica.add(this.jCheckBoxGenerarReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEstadistica.add(this.jPanelParametrosAuxiliar2ProductoEstadistica, this.gridBagConstraintsProductoEstadistica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEstadistica.add(this.jLabelAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
				this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoEstadistica.add(this.jButtonAbrirOrderByProductoEstadistica, this.gridBagConstraintsProductoEstadistica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEstadistica.add(this.jComboBoxTiposSeleccionarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			
			
			/*
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEstadistica.add(this.jCheckBoxSeleccionarTodosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoEstadistica.add(this.jCheckBoxConGraficoReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoEstadistica.add(this.jCheckBoxSeleccionarTodosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);															
				
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoEstadistica.add(this.jCheckBoxSeleccionadosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);															
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoEstadistica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoEstadistica.add(this.jCheckBoxConGraficoReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoEstadistica.add(this.jPanelParametrosAuxiliar3ProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEstadistica.add(this.jComboBoxTiposAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
	
				
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoEstadistica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoEstadistica.add(this.jTextFieldValorCampoGeneralProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoEstadistica = new GridBagLayout();

			this.jScrollPanelDatosProductoEstadistica.setLayout(gridaBagLayoutDatosProductoEstadistica);
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = 0;
			this.gridBagConstraintsProductoEstadistica.gridx = 0;
			
			this.jScrollPanelDatosProductoEstadistica.add(this.jTableDatosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoEstadistica.setViewportView(this.jTableDatosProductoEstadistica);
		this.jTableDatosProductoEstadistica.setFillsViewportHeight(true);
		this.jTableDatosProductoEstadistica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoEstadistica= new GridBagLayout();
		this.jPanelAccionesProductoEstadistica.setLayout(gridaBagLayoutAccionesProductoEstadistica);
		
		
		/*	
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = 0;
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
			
		this.jPanelAccionesProductoEstadistica.add(this.jButtonNuevoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoEstadistica= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoEstadistica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoEstadistica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoEstadistica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoEstadistica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoEstadistica.setLayout(gridaBagLayoutFK_IdBodegaProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 0;
		gridBagConstraintsProductoEstadistica.gridx = 0;
		jPanelFK_IdBodegaProductoEstadistica.add(jLabelid_bodegaFK_IdBodegaProductoEstadistica, gridBagConstraintsProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 0;
		gridBagConstraintsProductoEstadistica.gridx = 1;
		jPanelFK_IdBodegaProductoEstadistica.add(jComboBoxid_bodegaFK_IdBodegaProductoEstadistica, gridBagConstraintsProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 1;
		gridBagConstraintsProductoEstadistica.gridx =1;
		jPanelFK_IdBodegaProductoEstadistica.add(jButtonFK_IdBodegaProductoEstadistica, gridBagConstraintsProductoEstadistica);

		jTabbedPaneBusquedasProductoEstadistica.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoEstadistica);
		jTabbedPaneBusquedasProductoEstadistica.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoEstadistica= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoEstadistica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoEstadistica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoEstadistica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoEstadistica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoEstadistica.setLayout(gridaBagLayoutFK_IdProductoProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 0;
		gridBagConstraintsProductoEstadistica.gridx = 0;
		jPanelFK_IdProductoProductoEstadistica.add(jLabelid_productoFK_IdProductoProductoEstadistica, gridBagConstraintsProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 0;
		gridBagConstraintsProductoEstadistica.gridx = 1;
		jPanelFK_IdProductoProductoEstadistica.add(jComboBoxid_productoFK_IdProductoProductoEstadistica, gridBagConstraintsProductoEstadistica);


		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoEstadistica.gridy = 0;
		gridBagConstraintsProductoEstadistica.gridx = 0;
		jPanelFK_IdProductoProductoEstadistica.add(this.jButtonBuscarFK_IdProductoid_productoProductoEstadistica, gridBagConstraintsProductoEstadistica);

		gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoEstadistica.gridy = 1;
		gridBagConstraintsProductoEstadistica.gridx =1;
		jPanelFK_IdProductoProductoEstadistica.add(jButtonFK_IdProductoProductoEstadistica, gridBagConstraintsProductoEstadistica);

		jTabbedPaneBusquedasProductoEstadistica.addTab("2.-Por Producto ", jPanelFK_IdProductoProductoEstadistica);
		jTabbedPaneBusquedasProductoEstadistica.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoEstadistica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoEstadistica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();						
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEstadistica.gridx = 0;		
			//this.gridBagConstraintsProductoEstadistica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoEstadistica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoEstadistica, this.gridBagConstraintsProductoEstadistica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoEstadistica.gridx = 0;		
		//this.gridBagConstraintsProductoEstadistica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoEstadistica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoEstadistica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEstadistica.gridx = 0;		
			this.gridBagConstraintsProductoEstadistica.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoEstadistica.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoEstadistica, this.gridBagConstraintsProductoEstadistica);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);								
		
		
		/*
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		*/		
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoEstadistica.gridx =0;
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoEstadistica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
				
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoEstadisticaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoEstadistica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoEstadistica = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoEstadistica.setLayout(gridaBagLayoutBusquedasParametrosProductoEstadistica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoEstadistica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoEstadistica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEstadistica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEstadistica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
			
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoEstadistica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoEstadistica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoEstadistica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoEstadistica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoEstadistica.setName("jPanelReporteDinamicoProductoEstadistica"); 
		
		this.jPanelReporteDinamicoProductoEstadistica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoEstadistica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoEstadistica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoEstadistica.setLayout(gridaBagLayoutReporteDinamicoProductoEstadistica);
		
		
		this.jInternalFrameReporteDinamicoProductoEstadistica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoEstadistica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoEstadistica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoEstadistica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoEstadistica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoEstadistica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoEstadistica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoEstadistica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoEstadistica.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoEstadistica.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoEstadistica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoEstadistica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoEstadistica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoEstadistica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoEstadistica = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoEstadistica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelColumnasSelectReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoEstadistica = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoEstadistica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoEstadistica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoEstadistica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoEstadistica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoEstadistica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoEstadistica=new JScrollPane(this.jListColumnasSelectReporteProductoEstadistica);
			
			this.jScrollColumnasSelectReporteProductoEstadistica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoEstadistica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoEstadistica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoEstadistica.add(this.jListColumnasSelectReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jScrollColumnasSelectReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoEstadistica = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoEstadistica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoEstadistica = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoEstadistica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoEstadistica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoEstadistica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoEstadistica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoEstadistica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoEstadistica=new JScrollPane(this.jListRelacionesSelectReporteProductoEstadistica);
			
			this.jScrollRelacionesSelectReporteProductoEstadistica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoEstadistica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoEstadistica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoEstadistica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoEstadistica = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoEstadistica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoEstadistica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoEstadistica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoEstadistica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoEstadistica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoEstadistica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoEstadistica = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoEstadistica.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelConGraficoDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoEstadistica = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoEstadistica.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoEstadistica.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoEstadistica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoEstadistica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoEstadistica.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jCheckBoxConGraficoDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoEstadistica = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoEstadistica.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelColumnaCategoriaGraficoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jComboBoxColumnaCategoriaGraficoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoEstadistica = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoEstadistica.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelColumnaCategoriaValorProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoEstadistica.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoEstadistica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoEstadistica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoEstadistica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoEstadistica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jComboBoxColumnaCategoriaValorProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoEstadistica = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoEstadistica.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelColumnasValoresGraficoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoEstadistica = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoEstadistica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoEstadistica.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoEstadistica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoEstadistica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoEstadistica.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoEstadistica=new JScrollPane(this.jListColumnasValoresGraficoProductoEstadistica);
			
			this.jScrollColumnasValoresGraficoProductoEstadistica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoEstadistica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoEstadistica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoEstadistica.add(this.jListColumnasSelectReporteProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jScrollColumnasValoresGraficoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoEstadistica = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoEstadistica.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelTiposGraficosReportesDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoEstadistica.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jComboBoxTiposGraficosReportesDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoEstadistica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoEstadistica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelGenerarExcelReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoEstadistica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoEstadistica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoEstadistica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoEstadistica.setToolTipText("Generar EXCEL"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		//this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoEstadistica.add(this.jButtonGenerarExcelReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jComboBoxTiposReportesDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoEstadistica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoEstadistica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jLabelTiposArchivoReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jComboBoxTiposArchivosReportesDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoEstadistica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoEstadistica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoEstadistica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoEstadistica.setToolTipText("Generar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jButtonGenerarReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoEstadistica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoEstadistica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoEstadistica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoEstadistica.setToolTipText("Cancelar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoEstadistica.add(this.jButtonCerrarReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoEstadistica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoEstadistica= new JScrollPane(jPanelReporteDinamicoProductoEstadistica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoEstadistica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoEstadistica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoEstadistica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoEstadistica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoEstadistica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoEstadistica);
		this.jInternalFrameReporteDinamicoProductoEstadistica.getContentPane().add(this.jScrollPanelReporteDinamicoProductoEstadistica, this.gridBagConstraintsProductoEstadistica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoEstadistica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoEstadistica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoEstadistica.setName("jPanelImportacionProductoEstadistica"); 
		
		this.jPanelImportacionProductoEstadistica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoEstadistica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoEstadistica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoEstadistica.setLayout(gridaBagLayoutImportacionProductoEstadistica);
		
		
		this.jInternalFrameImportacionProductoEstadistica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoEstadistica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoEstadistica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoEstadistica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoEstadistica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoEstadistica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoEstadistica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoEstadistica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoEstadistica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoEstadistica.setResizable(true);
	    this.jInternalFrameImportacionProductoEstadistica.setClosable(true);
	    this.jInternalFrameImportacionProductoEstadistica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoEstadistica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoEstadistica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoEstadistica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoEstadistica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoEstadistica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoEstadistica.setResizable(true);
	    this.jInternalFrameImportacionProductoEstadistica.setClosable(true);
	    this.jInternalFrameImportacionProductoEstadistica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoEstadistica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoEstadistica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoEstadistica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoEstadistica = new JLabelMe();

		this.jLabelArchivoImportacionProductoEstadistica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoEstadistica.add(this.jLabelArchivoImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoEstadistica = new JFileChooser();		
		this.jFileChooserImportacionProductoEstadistica.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoEstadistica = new JButtonMe();
		this.jButtonAbrirImportacionProductoEstadistica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoEstadistica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoEstadistica.setToolTipText("Generar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEstadistica.add(this.jButtonAbrirImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoEstadistica = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoEstadistica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoEstadistica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoEstadistica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoEstadistica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoEstadistica.add(this.jLabelPathArchivoImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoEstadistica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoEstadistica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoEstadistica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoEstadistica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEstadistica.add(this.jTextFieldPathArchivoImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoEstadistica = new JButtonMe();
		this.jButtonGenerarImportacionProductoEstadistica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoEstadistica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoEstadistica.setToolTipText("Generar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEstadistica.add(this.jButtonGenerarImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoEstadistica = new JButtonMe();
		this.jButtonCerrarImportacionProductoEstadistica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoEstadistica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoEstadistica.setToolTipText("Cancelar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEstadistica.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoEstadistica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoEstadistica.add(this.jButtonCerrarImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoEstadistica = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoEstadistica= new JScrollPane(jPanelImportacionProductoEstadistica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
		this.gridBagConstraintsProductoEstadistica.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoEstadistica.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoEstadistica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoEstadistica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoEstadistica);
		this.jInternalFrameImportacionProductoEstadistica.getContentPane().add(this.jScrollPanelImportacionProductoEstadistica, this.gridBagConstraintsProductoEstadistica);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoEstadistica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoEstadistica = new JButtonMe();
			this.jButtonAbrirOrderByProductoEstadistica.setText("Orden");
			this.jButtonAbrirOrderByProductoEstadistica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoEstadistica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoEstadistica";
			inputMap = this.jButtonAbrirOrderByProductoEstadistica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoEstadistica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoEstadistica"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoEstadistica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoEstadistica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoEstadistica.setName("jPanelOrderByProductoEstadistica"); 
			
			this.jPanelOrderByProductoEstadistica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoEstadistica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoEstadistica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoEstadistica.setLayout(gridaBagLayoutOrderByProductoEstadistica);
			
			
			this.jTableDatosProductoEstadisticaOrderBy = new JTableMe();        
			this.jTableDatosProductoEstadisticaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoEstadisticaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoEstadisticaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoEstadisticaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoEstadisticaOrderBy.setViewportView(this.jTableDatosProductoEstadisticaOrderBy);
			this.jTableDatosProductoEstadisticaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoEstadisticaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoEstadistica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoEstadistica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoEstadistica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoEstadistica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoEstadistica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoEstadistica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoEstadistica.setTitle("Orden");
			this.jInternalFrameOrderByProductoEstadistica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoEstadistica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoEstadistica.setResizable(true);
			this.jInternalFrameOrderByProductoEstadistica.setClosable(true);
			this.jInternalFrameOrderByProductoEstadistica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoEstadistica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoEstadistica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoEstadistica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadisticas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoEstadistica.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoEstadistica.ipady =150;
				
			this.jPanelOrderByProductoEstadistica.add(jScrollPanelDatosProductoEstadisticaOrderBy, this.gridBagConstraintsProductoEstadistica);//this.jTableDatosProductoEstadisticaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoEstadistica = new JButtonMe();
			this.jButtonCerrarOrderByProductoEstadistica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoEstadistica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoEstadistica.setToolTipText("Cancelar"+" "+ProductoEstadisticaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoEstadistica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEstadistica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoEstadistica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoEstadistica.add(this.jButtonCerrarOrderByProductoEstadistica, this.gridBagConstraintsProductoEstadistica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoEstadistica = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoEstadistica= new JScrollPane(jPanelOrderByProductoEstadistica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoEstadistica = new GridBagConstraints();
			this.gridBagConstraintsProductoEstadistica.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoEstadistica.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoEstadistica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoEstadistica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoEstadistica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoEstadistica);
			
			this.jInternalFrameOrderByProductoEstadistica.getContentPane().add(this.jScrollPanelOrderByProductoEstadistica, this.gridBagConstraintsProductoEstadistica);			
		
		} else {
			this.jButtonAbrirOrderByProductoEstadistica = new JButtonMe();
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
		int iWidthTableCalculado=0;//7130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoestadisticaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoEstadistica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoEstadistica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoEstadistica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoEstadistica.getRowHeight();//ProductoEstadisticaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoEstadistica.isSelected()) {
					iHeightTable=ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoEstadistica.isSelected()) {
					iHeightTable=ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoEstadisticaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoEstadistica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoEstadistica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoEstadistica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoEstadistica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoEstadistica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoEstadistica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoEstadistica!=null && this.jInternalFrameOrderByProductoEstadistica.getjTableDatosOrderBy()!=null) {
			//if(!this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoEstadistica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoEstadistica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoEstadistica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoEstadistica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoEstadistica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoEstadistica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoEstadistica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoEstadistica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoEstadistica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoEstadistica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoestadisticaLogic.getProductoEstadisticas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoestadisticas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoEstadistica> TraerProductoEstadisticaBeans(List<ProductoEstadistica> productoestadisticas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoEstadistica productoestadistica:productoestadisticas) {
					
				if(!(ProductoEstadisticaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoEstadisticaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoestadistica.setsDetalleGeneralEntityReporte(ProductoEstadisticaConstantesFunciones.getProductoEstadisticaDescripcion(productoestadistica));
										
						
					
						
					
				} else  {
							
					//productoestadistica.setsDetalleGeneralEntityReporte(productoestadistica.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoestadisticabeans.add(productoestadisticabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoestadisticas;
    }
	//PARA REPORTES FIN
}
