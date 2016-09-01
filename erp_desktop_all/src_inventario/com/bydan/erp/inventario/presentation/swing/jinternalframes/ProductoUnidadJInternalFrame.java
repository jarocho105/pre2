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
import com.bydan.erp.inventario.util.ProductoUnidadConstantesFunciones;

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
public class ProductoUnidadJInternalFrame extends ProductoUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoUnidad;
	
	protected JMenuBar jmenuBarProductoUnidad;
	
	protected JMenu jmenuProductoUnidad;
	protected JMenu jmenuDatosProductoUnidad;
	protected JMenu jmenuArchivoProductoUnidad;
	protected JMenu jmenuAccionesProductoUnidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoUnidad;	
	protected GridBagConstraints gridBagConstraintsProductoUnidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoUnidadDetalleFormJInternalFrame jInternalFrameDetalleFormProductoUnidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoUnidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoUnidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoUnidadSessionBean productounidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoUnidad> productounidads;		
	public List<ProductoUnidad> productounidadsEliminados;	
	public List<ProductoUnidad> productounidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoUnidad;		
	protected JButton jButtonAbrirOrderByProductoUnidad;
	
	
	//protected JPanel jPanelOrderByProductoUnidad;
	//public JScrollPane jScrollPanelOrderByProductoUnidad;	
	//protected JButton jButtonCerrarOrderByProductoUnidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoUnidadLogic productounidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoUnidad;
	public JScrollPane jScrollPanelDatosEdicionProductoUnidad;
	public JScrollPane jScrollPanelDatosGeneralProductoUnidad;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoUnidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoUnidad;
	//public JScrollPane jScrollPanelImportacionProductoUnidad;
	
	
	
	protected JPanel jPanelAccionesProductoUnidad;
	
    protected JPanel jPanelPaginacionProductoUnidad;
    protected JPanel jPanelParametrosReportesProductoUnidad;
	protected JPanel jPanelParametrosReportesAccionesProductoUnidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoUnidad;
	protected JPanel jPanelParametrosAuxiliar2ProductoUnidad;
	protected JPanel jPanelParametrosAuxiliar3ProductoUnidad;
	protected JPanel jPanelParametrosAuxiliar4ProductoUnidad;
	//protected JPanel jPanelParametrosAuxiliar5ProductoUnidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoUnidad;
	//protected JPanel jPanelImportacionProductoUnidad;
	
	
	public JTable jTableDatosProductoUnidad;
	
	
	
	//public JTable jTableDatosProductoUnidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoUnidad;
	protected JButton jButtonDuplicarProductoUnidad;
	protected JButton jButtonCopiarProductoUnidad;
	protected JButton jButtonVerFormProductoUnidad;
	protected JButton jButtonNuevoRelacionesProductoUnidad;
	protected JButton jButtonModificarProductoUnidad;
	
    protected JButton jButtonGuardarCambiosTablaProductoUnidad;
	protected JButton jButtonCerrarProductoUnidad;
	
	
	protected JButton jButtonRecargarInformacionProductoUnidad;
	protected JButton jButtonProcesarInformacionProductoUnidad;
	
	
	protected JButton jButtonAnterioresProductoUnidad;
	protected JButton jButtonSiguientesProductoUnidad;
	protected JButton jButtonNuevoGuardarCambiosProductoUnidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoUnidad;
	//protected JButton jButtonCerrarReporteDinamicoProductoUnidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoUnidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoUnidad;
	//protected JButton jButtonGenerarImportacionProductoUnidad;
	//protected JButton jButtonCerrarImportacionProductoUnidad;
	//protected JFileChooser jFileChooserImportacionProductoUnidad;
	//protected File fileImportacionProductoUnidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoUnidad;
	protected JButton jButtonDuplicarToolBarProductoUnidad;
	protected JButton jButtonNuevoRelacionesToolBarProductoUnidad;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoUnidad;
	protected JButton jButtonCopiarToolBarProductoUnidad;
	protected JButton jButtonVerFormToolBarProductoUnidad;
	public JButton jButtonGuardarCambiosTablaToolBarProductoUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoUnidad;
	protected JButton jButtonCerrarToolBarProductoUnidad;
	
	protected JButton jButtonRecargarInformacionToolBarProductoUnidad;
	protected JButton jButtonProcesarInformacionToolBarProductoUnidad;
	protected JButton jButtonAnterioresToolBarProductoUnidad;
	protected JButton jButtonSiguientesToolBarProductoUnidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoUnidad;
	protected JButton jButtonAbrirOrderByToolBarProductoUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoUnidad;
	protected JMenuItem jMenuItemDuplicarProductoUnidad;
	protected JMenuItem jMenuItemNuevoRelacionesProductoUnidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoUnidad;
	protected JMenuItem jMenuItemCopiarProductoUnidad;
	protected JMenuItem jMenuItemVerFormProductoUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoUnidad;
	protected JMenuItem jMenuItemCerrarProductoUnidad;
	protected JMenuItem jMenuItemDetalleCerrarProductoUnidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoUnidad;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoUnidad;
	protected JMenuItem jMenuItemProcesarInformacionProductoUnidad;
	protected JMenuItem jMenuItemAnterioresProductoUnidad;
	protected JMenuItem jMenuItemSiguientesProductoUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoUnidad;
	protected JMenuItem jMenuItemAbrirOrderByProductoUnidad;
	protected JMenuItem jMenuItemMostrarOcultarProductoUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoUnidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoUnidad;
	protected JCheckBox jCheckBoxSeleccionadosProductoUnidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoUnidad;
	protected JCheckBox jCheckBoxConGraficoReporteProductoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoUnidad;
	protected JTextField jTextFieldValorCampoGeneralProductoUnidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoUnidad;
	//public JList<Reporte> jListColumnasSelectReporteProductoUnidad;
	//public JScrollPane jScrollColumnasSelectReporteProductoUnidad;
	
	//public JLabel jLabelRelacionesSelectReporteProductoUnidad;
	//public JList<Reporte> jListRelacionesSelectReporteProductoUnidad;
	//public JScrollPane jScrollRelacionesSelectReporteProductoUnidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoUnidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoUnidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoUnidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoUnidad;
	
		
	//public JLabel jLabelArchivoImportacionProductoUnidad;	
	//public JLabel jLabelPathArchivoImportacionProductoUnidad;
	//protected JTextField jTextFieldPathArchivoImportacionProductoUnidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoUnidad;
	
	//public JLabel jLabelColumnaCategoriaValorProductoUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoUnidad;
	
	//public JLabel jLabelColumnasValoresGraficoProductoUnidad;
	//public JList<Reporte> jListColumnasValoresGraficoProductoUnidad;
	//public JScrollPane jScrollColumnasValoresGraficoProductoUnidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoUnidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoUnidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoUnidad;
	public JPanel jPanelFK_IdBodegaProductoUnidad;
	public JButton jButtonFK_IdBodegaProductoUnidad;
	public JPanel jPanelFK_IdProductoProductoUnidad;
	public JButton jButtonFK_IdProductoProductoUnidad;
	public JPanel jPanelFK_IdUnidadProductoUnidad;
	public JButton jButtonFK_IdUnidadProductoUnidad;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoUnidad;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoUnidad;
	public JButton jButtonid_bodegaFK_IdBodegaProductoUnidad= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoUnidad;
	public JLabel jLabelid_productoFK_IdProductoProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoUnidad;
	public JButton jButtonid_productoFK_IdProductoProductoUnidad= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoUnidadBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoUnidad;
	
	public JPanel jPanelid_unidadFK_IdUnidadProductoUnidad;
	public JLabel jLabelid_unidadFK_IdUnidadProductoUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoUnidad;
	public JButton jButtonid_unidadFK_IdUnidadProductoUnidad= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoUnidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoUnidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoUnidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoUnidad)	{
		this.jButtonRecargarInformacionProductoUnidad = jButtonRecargarInformacionProductoUnidad;
	}
	
	public JButton getjButtonProcesarInformacionProductoUnidad() {
		return this.jButtonProcesarInformacionProductoUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoUnidad)	{
		this.jButtonProcesarInformacionProductoUnidad = jButtonProcesarInformacionProductoUnidad;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoUnidad() {
		return this.jButtonRecargarInformacionProductoUnidad;
	}
	
	
	public List<ProductoUnidad> getproductounidads() {
		return this.productounidads;
	}

	public void setproductounidads(List<ProductoUnidad> productounidads) {
		this.productounidads = productounidads;
	}
	
	public List<ProductoUnidad> getproductounidadsAux() {
		return this.productounidadsAux;
	}

	public void setproductounidadsAux(List<ProductoUnidad> productounidadsAux) {
		this.productounidadsAux = productounidadsAux;
	}
	
	public List<ProductoUnidad> getproductounidadsEliminados() {
		return this.productounidadsEliminados;
	}

	public void setProductoUnidadsEliminados(List<ProductoUnidad> productounidadsEliminados) {
		this.productounidadsEliminados = productounidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoUnidad() {
		return jComboBoxTiposSeleccionarProductoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoUnidad(
			JComboBox jComboBoxTiposSeleccionarProductoUnidad) {
		this.jComboBoxTiposSeleccionarProductoUnidad = jComboBoxTiposSeleccionarProductoUnidad;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoUnidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoUnidad() {
		return jTextFieldValorCampoGeneralProductoUnidad;
	}

	public void setjTextFieldValorCampoGeneralProductoUnidad(
			JTextField jTextFieldValorCampoGeneralProductoUnidad) {
		this.jTextFieldValorCampoGeneralProductoUnidad = jTextFieldValorCampoGeneralProductoUnidad;
	}

	public void setBorderResaltarValorCampoGeneralProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoUnidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoUnidad() {
		return this.jCheckBoxSeleccionarTodosProductoUnidad;
	}

	public void setjCheckBoxSeleccionarTodosProductoUnidad(
			JCheckBox jCheckBoxSeleccionarTodosProductoUnidad) {
		this.jCheckBoxSeleccionarTodosProductoUnidad = jCheckBoxSeleccionarTodosProductoUnidad;
	}

	public void setBorderResaltarSeleccionarTodosProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoUnidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoUnidad() {
		return this.jCheckBoxSeleccionadosProductoUnidad;
	}

	public void setjCheckBoxSeleccionadosProductoUnidad(
			JCheckBox jCheckBoxSeleccionadosProductoUnidad) {
		this.jCheckBoxSeleccionadosProductoUnidad = jCheckBoxSeleccionadosProductoUnidad;
	}
	
	public void setBorderResaltarSeleccionadosProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoUnidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoUnidad() {
		return this.jComboBoxTiposArchivosReportesProductoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoUnidad(
			JComboBox jComboBoxTiposArchivosReportesProductoUnidad) {
		this.jComboBoxTiposArchivosReportesProductoUnidad = jComboBoxTiposArchivosReportesProductoUnidad;
	}

	public void setBorderResaltarTiposArchivosReportesProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoUnidad() {
		return this.jComboBoxTiposReportesProductoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoUnidad(
			JComboBox jComboBoxTiposReportesProductoUnidad) {
		this.jComboBoxTiposReportesProductoUnidad = jComboBoxTiposReportesProductoUnidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoUnidad() {
	//	return jComboBoxTiposReportesDinamicoProductoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoUnidad(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoUnidad) {
	//	this.jComboBoxTiposReportesDinamicoProductoUnidad = jComboBoxTiposReportesDinamicoProductoUnidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoUnidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoUnidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoUnidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad = jComboBoxTiposArchivosReportesDinamicoProductoUnidad;
	//}
	
	public void setBorderResaltarTiposReportesProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoUnidad() {
		return this.jComboBoxTiposGraficosReportesProductoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoUnidad(
			JComboBox jComboBoxTiposGraficosReportesProductoUnidad) {
		this.jComboBoxTiposGraficosReportesProductoUnidad = jComboBoxTiposGraficosReportesProductoUnidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoUnidad() {
		return this.jComboBoxTiposPaginacionProductoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoUnidad(
			JComboBox jComboBoxTiposPaginacionProductoUnidad) {
		this.jComboBoxTiposPaginacionProductoUnidad = jComboBoxTiposPaginacionProductoUnidad;
	}
	
	public void setBorderResaltarTiposPaginacionProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoUnidad() {
		return this.jComboBoxTiposRelacionesProductoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoUnidad() {
		return this.jComboBoxTiposAccionesProductoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoUnidad(
			JComboBox jComboBoxTiposRelacionesProductoUnidad) {
		this.jComboBoxTiposRelacionesProductoUnidad = jComboBoxTiposRelacionesProductoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoUnidad(
			JComboBox jComboBoxTiposAccionesProductoUnidad) {
		this.jComboBoxTiposAccionesProductoUnidad = jComboBoxTiposAccionesProductoUnidad;
	}
	
	public void setBorderResaltarTiposRelacionesProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoUnidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoUnidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoUnidad() {
	//	return jCheckBoxConGraficoDinamicoProductoUnidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoUnidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoUnidad) {
	//	this.jCheckBoxConGraficoDinamicoProductoUnidad = jCheckBoxConGraficoDinamicoProductoUnidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoUnidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoUnidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoUnidad .setBorder(borderResaltar);		
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
		this.productounidadSessionBean=new ProductoUnidadSessionBean();
		
		this.productounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productounidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoUnidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"nuevo","nuevo","Nuevo"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"duplicar","duplicar","Duplicar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"copiar","copiar","Copiar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"ver_form","ver_form","Ver"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"recargar","recargar","Recargar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoUnidad,this.jTtoolBarProductoUnidad,
							"cerrar","cerrar","Salir"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoUnidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoUnidad;
			
				this.jButtonProcesarInformacionToolBarProductoUnidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoUnidad;
				
		//protected JButton jButtonModificarToolBarProductoUnidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoUnidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoUnidad=new JMenuMe("General");
		this.jmenuArchivoProductoUnidad=new JMenuMe("Archivo");
		this.jmenuAccionesProductoUnidad=new JMenuMe("Acciones");
		this.jmenuDatosProductoUnidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoUnidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoUnidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoUnidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoUnidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoUnidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoUnidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoUnidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoUnidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoUnidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoUnidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoUnidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoUnidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoUnidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoUnidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoUnidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoUnidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoUnidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoUnidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoUnidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoUnidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoUnidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoUnidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoUnidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoUnidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoUnidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoUnidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoUnidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoUnidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoUnidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoUnidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoUnidad.add(this.jMenuItemCerrarProductoUnidad);
			
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemNuevoProductoUnidad);
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemNuevoGuardarCambiosProductoUnidad);
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemNuevoRelacionesProductoUnidad);
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemGuardarCambiosTablaProductoUnidad);		
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemDuplicarProductoUnidad);		
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemCopiarProductoUnidad);		
			this.jmenuAccionesProductoUnidad.add(this.jMenuItemVerFormProductoUnidad);		
			
			this.jmenuDatosProductoUnidad.add(this.jMenuItemRecargarInformacionProductoUnidad);				
			this.jmenuDatosProductoUnidad.add(this.jMenuItemAnterioresProductoUnidad);				
			this.jmenuDatosProductoUnidad.add(this.jMenuItemSiguientesProductoUnidad);				
			this.jmenuDatosProductoUnidad.add(this.jMenuItemAbrirOrderByProductoUnidad);				
			this.jmenuDatosProductoUnidad.add(this.jMenuItemMostrarOcultarProductoUnidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoUnidad.add(this.jMenuItemGuardarCambiosProductoUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoUnidad.add(this.jmenuArchivoProductoUnidad);		
			this.jmenuBarProductoUnidad.add(this.jmenuAccionesProductoUnidad);		
			this.jmenuBarProductoUnidad.add(this.jmenuDatosProductoUnidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoUnidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoUnidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoUnidad.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoUnidad= new JButtonMe();
		this.jButtonFK_IdBodegaProductoUnidad.setText("Buscar");
		this.jButtonFK_IdBodegaProductoUnidad.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoUnidad,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoUnidad = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoUnidad.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoUnidad.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoUnidad= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoUnidad.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoUnidad= new JButtonMe();
		this.jButtonFK_IdProductoProductoUnidad.setText("Buscar");
		this.jButtonFK_IdProductoProductoUnidad.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoUnidad,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoUnidad = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoUnidad.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoUnidad.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoUnidad= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.setFocusable(false);

		this.jPanelFK_IdUnidadProductoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoUnidad.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoUnidad= new JButtonMe();
		this.jButtonFK_IdUnidadProductoUnidad.setText("Buscar");
		this.jButtonFK_IdUnidadProductoUnidad.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoUnidad,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoUnidad = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoUnidad.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoUnidad.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoUnidad= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoUnidad=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoUnidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoUnidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoUnidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoUnidad = new ProductoUnidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Unidad DATOS");
			this.jInternalFrameDetalleFormProductoUnidad = new ProductoUnidadDetalleFormJInternalFrame(jDesktopPane,this.productounidadSessionBean.getConGuardarRelaciones(),this.productounidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoUnidad = null;//new ProductoUnidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoUnidad= new GridBagLayout();
		
		
		this.jTableDatosProductoUnidad = new JTableMe();      
		
		String sToolTipProductoUnidad="";
		sToolTipProductoUnidad=ProductoUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoUnidad+="(Inventario.ProductoUnidad)";
		}
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoUnidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoUnidad.setToolTipText(sToolTipProductoUnidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoUnidad);
		this.jTableDatosProductoUnidad.setAutoCreateRowSorter(true);
		this.jTableDatosProductoUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoUnidad.setRowSelectionAllowed(true);
		this.jTableDatosProductoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoUnidad = new JButtonMe();
		this.jButtonDuplicarProductoUnidad = new JButtonMe();
		this.jButtonCopiarProductoUnidad = new JButtonMe();
		this.jButtonVerFormProductoUnidad = new JButtonMe();
		this.jButtonNuevoRelacionesProductoUnidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoUnidad = new JButtonMe();
		this.jButtonCerrarProductoUnidad = new JButtonMe();
		
		this.jScrollPanelDatosProductoUnidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoUnidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Unidad";
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesProductoUnidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoUnidad=new ReporteDinamicoJInternalFrame(ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoUnidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoUnidad=new ImportacionJInternalFrame(ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoUnidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoUnidad = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoUnidad.setText("Orden");
		this.jButtonAbrirOrderByProductoUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoUnidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoUnidad,false,this);
			
			//this.cargarOrderByProductoUnidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoUnidad,true,this);
			
			//this.cargarOrderByProductoUnidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoUnidad.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProductoUnidad.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProductoUnidad.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProductoUnidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoUnidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoUnidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoUnidad.setText("Nuevo");
		this.jButtonDuplicarProductoUnidad.setText("Duplicar");
		this.jButtonCopiarProductoUnidad.setText("Copiar");
		this.jButtonVerFormProductoUnidad.setText("Ver");
		this.jButtonNuevoRelacionesProductoUnidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoUnidad.setText("Guardar");
		this.jButtonCerrarProductoUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoUnidad,"nuevo_button","Nuevo",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoUnidad,"duplicar_button","Duplicar",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoUnidad,"copiar_button","Copiar",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoUnidad,"ver_form","Ver",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoUnidad,"nuevorelaciones_button","Nuevo Rel",this.productounidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoUnidad,"guardarcambiostabla_button","Guardar",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoUnidad,"cerrar_button","Salir",this.productounidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoUnidad.setToolTipText("Nuevo"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoUnidad.setToolTipText("Duplicar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoUnidad.setToolTipText("Copiar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoUnidad.setToolTipText("Ver"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoUnidad.setToolTipText("Nuevo Rel"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoUnidad.setToolTipText("Guardar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoUnidad.setToolTipText("Salir"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoUnidad";
		inputMap = this.jButtonNuevoProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoUnidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoUnidad";
		inputMap = this.jButtonDuplicarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoUnidad"));
		
		//COPIAR
		sMapKey = "CopiarProductoUnidad";
		inputMap = this.jButtonCopiarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoUnidad"));
		
		//VEr FORM
		sMapKey = "VerFormProductoUnidad";
		inputMap = this.jButtonVerFormProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoUnidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoUnidad";
		inputMap = this.jButtonNuevoRelacionesProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoUnidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoUnidad";
		inputMap = this.jButtonModificarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoUnidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoUnidad";
		inputMap = this.jButtonCerrarProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoUnidad";
		inputMap = this.jButtonGuardarCambiosTablaProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoUnidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoUnidad.setName("jPanelParametrosReportesProductoUnidad"); 
		
		this.jPanelParametrosReportesAccionesProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoUnidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoUnidad.setName("jPanelParametrosReportesAccionesProductoUnidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoUnidad = new JButtonMe();
		this.jButtonRecargarInformacionProductoUnidad.setText("Recargar");
		this.jButtonRecargarInformacionProductoUnidad.setToolTipText("Recargar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoUnidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoUnidad = new JButtonMe();
		this.jButtonProcesarInformacionProductoUnidad.setText("Procesar");
		this.jButtonProcesarInformacionProductoUnidad.setToolTipText("Procesar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoUnidad.setVisible(false);
			
		this.jButtonProcesarInformacionProductoUnidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoUnidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoUnidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoUnidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoUnidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoUnidad.setText("TIPO");       
		this.jComboBoxTiposReportesProductoUnidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoUnidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoUnidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoUnidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoUnidad.setText("Accion");
		this.jComboBoxTiposRelacionesProductoUnidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoUnidad.setText("Accion");
		this.jComboBoxTiposAccionesProductoUnidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoUnidad.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoUnidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoUnidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoUnidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoUnidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoUnidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoUnidad = new JLabelMe();
		
		this.jLabelAccionesProductoUnidad.setText("Acciones");		
		this.jLabelAccionesProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoUnidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoUnidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoUnidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoUnidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoUnidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoUnidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoUnidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoUnidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoUnidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoUnidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoUnidad = new JButtonMe();
		//this.jButtonAnterioresProductoUnidad.setText("<<");
        this.jButtonAnterioresProductoUnidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoUnidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoUnidad = new JButtonMe();
		//this.jButtonSiguientesProductoUnidad.setText(">>");
        this.jButtonSiguientesProductoUnidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoUnidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoUnidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoUnidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoUnidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoUnidad,"nuevoguardarcambios_button","Nue",this.productounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoUnidad";
		inputMap = this.jButtonNuevoGuardarCambiosProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoUnidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoUnidad";
		inputMap = this.jButtonRecargarInformacionProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoUnidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoUnidad";
		inputMap = this.jButtonSiguientesProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoUnidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoUnidad";
		inputMap = this.jButtonAnterioresProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoUnidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoUnidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoUnidad.setMinimumSize(new Dimension(this.getWidth(),ProductoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoUnidad.setMaximumSize(new Dimension(this.getWidth(),ProductoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoUnidad.setPreferredSize(new Dimension(this.getWidth(),ProductoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoUnidad = new GridBagLayout();

			this.jPanelPaginacionProductoUnidad.setLayout(gridaBagLayoutPaginacionProductoUnidad);						
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 0;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoUnidad.add(this.jButtonAnterioresProductoUnidad, this.gridBagConstraintsProductoUnidad);
					
						
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoUnidad.gridy = 0;
			
			this.jPanelPaginacionProductoUnidad.add(this.jButtonNuevoGuardarCambiosProductoUnidad, this.gridBagConstraintsProductoUnidad);
						
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoUnidad.gridy = 0;
			this.jPanelPaginacionProductoUnidad.add(this.jButtonSiguientesProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 1;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoUnidad.add(this.jButtonNuevoProductoUnidad, this.gridBagConstraintsProductoUnidad);
						
			
			
			if(!this.productounidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
				this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoUnidad.gridy = 1;
				this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoUnidad.add(this.jButtonGuardarCambiosTablaProductoUnidad, this.gridBagConstraintsProductoUnidad);
			}
			
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 1;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoUnidad.add(this.jButtonDuplicarProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 1;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoUnidad.add(this.jButtonCopiarProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 1;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoUnidad.add(this.jButtonVerFormProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 1;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoUnidad.add(this.jButtonCerrarProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		
		this.jButtonRecargarInformacionProductoUnidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoUnidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoUnidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoUnidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoUnidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoUnidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoUnidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoUnidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoUnidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoUnidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoUnidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoUnidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoUnidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoUnidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoUnidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoUnidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoUnidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoUnidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoUnidad.setLayout(gridaBagParametrosReportesProductoUnidad);
			this.jPanelParametrosReportesAccionesProductoUnidad.setLayout(gridaBagParametrosReportesAccionesProductoUnidad);
			
			
			this.jPanelParametrosAuxiliar1ProductoUnidad.setLayout(gridaBagParametrosAuxiliar1ProductoUnidad);
			this.jPanelParametrosAuxiliar2ProductoUnidad.setLayout(gridaBagParametrosAuxiliar2ProductoUnidad);
			this.jPanelParametrosAuxiliar3ProductoUnidad.setLayout(gridaBagParametrosAuxiliar3ProductoUnidad);
			this.jPanelParametrosAuxiliar4ProductoUnidad.setLayout(gridaBagParametrosAuxiliar4ProductoUnidad);
			//this.jPanelParametrosAuxiliar5ProductoUnidad.setLayout(gridaBagParametrosAuxiliar2ProductoUnidad);			
			
			
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoUnidad.add(this.jButtonRecargarInformacionProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoUnidad.add(this.jComboBoxTiposPaginacionProductoUnidad, this.gridBagConstraintsProductoUnidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoUnidad.add(this.jCheckBoxConAltoMaximoTablaProductoUnidad, this.gridBagConstraintsProductoUnidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoUnidad.add(this.jComboBoxTiposArchivosReportesProductoUnidad, this.gridBagConstraintsProductoUnidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoUnidad.add(this.jPanelParametrosAuxiliar1ProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoUnidad.add(this.jComboBoxTiposReportesProductoUnidad, this.gridBagConstraintsProductoUnidad);																		
			
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoUnidad.add(this.jComboBoxTiposGraficosReportesProductoUnidad, this.gridBagConstraintsProductoUnidad);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoUnidad.add(this.jPanelParametrosAuxiliar4ProductoUnidad, this.gridBagConstraintsProductoUnidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoUnidad.add(this.jComboBoxTiposReportesProductoUnidad, this.gridBagConstraintsProductoUnidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoUnidad.add(this.jCheckBoxGenerarReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoUnidad.add(this.jPanelParametrosAuxiliar2ProductoUnidad, this.gridBagConstraintsProductoUnidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoUnidad.add(this.jLabelAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
				this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoUnidad.add(this.jButtonAbrirOrderByProductoUnidad, this.gridBagConstraintsProductoUnidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoUnidad.add(this.jComboBoxTiposSeleccionarProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			
			
			/*
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoUnidad.add(this.jCheckBoxSeleccionarTodosProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoUnidad.add(this.jCheckBoxConGraficoReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoUnidad.add(this.jCheckBoxSeleccionarTodosProductoUnidad, this.gridBagConstraintsProductoUnidad);															
				
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoUnidad.add(this.jCheckBoxSeleccionadosProductoUnidad, this.gridBagConstraintsProductoUnidad);															
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoUnidad.add(this.jCheckBoxConGraficoReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoUnidad.add(this.jPanelParametrosAuxiliar3ProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoUnidad.add(this.jComboBoxTiposAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
	
				
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoUnidad.add(this.jTextFieldValorCampoGeneralProductoUnidad, this.gridBagConstraintsProductoUnidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoUnidad = new GridBagLayout();

			this.jScrollPanelDatosProductoUnidad.setLayout(gridaBagLayoutDatosProductoUnidad);
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = 0;
			this.gridBagConstraintsProductoUnidad.gridx = 0;
			
			this.jScrollPanelDatosProductoUnidad.add(this.jTableDatosProductoUnidad, this.gridBagConstraintsProductoUnidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoUnidad.setViewportView(this.jTableDatosProductoUnidad);
		this.jTableDatosProductoUnidad.setFillsViewportHeight(true);
		this.jTableDatosProductoUnidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoUnidad= new GridBagLayout();
		this.jPanelAccionesProductoUnidad.setLayout(gridaBagLayoutAccionesProductoUnidad);
		
		
		/*	
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = 0;
		this.gridBagConstraintsProductoUnidad.gridx = 0;
			
		this.jPanelAccionesProductoUnidad.add(this.jButtonNuevoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoUnidad.setLayout(gridaBagLayoutFK_IdBodegaProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 0;
		jPanelFK_IdBodegaProductoUnidad.add(jLabelid_bodegaFK_IdBodegaProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 1;
		jPanelFK_IdBodegaProductoUnidad.add(jComboBoxid_bodegaFK_IdBodegaProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 1;
		gridBagConstraintsProductoUnidad.gridx =1;
		jPanelFK_IdBodegaProductoUnidad.add(jButtonFK_IdBodegaProductoUnidad, gridBagConstraintsProductoUnidad);

		jTabbedPaneBusquedasProductoUnidad.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoUnidad);
		jTabbedPaneBusquedasProductoUnidad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoUnidad.setLayout(gridaBagLayoutFK_IdProductoProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 0;
		jPanelFK_IdProductoProductoUnidad.add(jLabelid_productoFK_IdProductoProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 1;
		jPanelFK_IdProductoProductoUnidad.add(jComboBoxid_productoFK_IdProductoProductoUnidad, gridBagConstraintsProductoUnidad);


		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 0;
		jPanelFK_IdProductoProductoUnidad.add(this.jButtonBuscarFK_IdProductoid_productoProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 1;
		gridBagConstraintsProductoUnidad.gridx =1;
		jPanelFK_IdProductoProductoUnidad.add(jButtonFK_IdProductoProductoUnidad, gridBagConstraintsProductoUnidad);

		jTabbedPaneBusquedasProductoUnidad.addTab("2.-Por Producto ", jPanelFK_IdProductoProductoUnidad);
		jTabbedPaneBusquedasProductoUnidad.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoUnidad.setLayout(gridaBagLayoutFK_IdUnidadProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 0;
		jPanelFK_IdUnidadProductoUnidad.add(jLabelid_unidadFK_IdUnidadProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 0;
		gridBagConstraintsProductoUnidad.gridx = 1;
		jPanelFK_IdUnidadProductoUnidad.add(jComboBoxid_unidadFK_IdUnidadProductoUnidad, gridBagConstraintsProductoUnidad);

		gridBagConstraintsProductoUnidad = new GridBagConstraints();
		gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoUnidad.gridy = 1;
		gridBagConstraintsProductoUnidad.gridx =1;
		jPanelFK_IdUnidadProductoUnidad.add(jButtonFK_IdUnidadProductoUnidad, gridBagConstraintsProductoUnidad);

		jTabbedPaneBusquedasProductoUnidad.addTab("3.-Por Unad ", jPanelFK_IdUnidadProductoUnidad);
		jTabbedPaneBusquedasProductoUnidad.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoUnidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();						
			this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoUnidad.gridx = 0;		
			//this.gridBagConstraintsProductoUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoUnidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoUnidad, this.gridBagConstraintsProductoUnidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoUnidad.gridx = 0;		
		//this.gridBagConstraintsProductoUnidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoUnidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoUnidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoUnidad.gridx = 0;		
			this.gridBagConstraintsProductoUnidad.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoUnidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoUnidad, this.gridBagConstraintsProductoUnidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoUnidad, this.gridBagConstraintsProductoUnidad);								
		
		
		/*
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
		*/		
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoUnidad.gridx =0;
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoUnidad, this.gridBagConstraintsProductoUnidad);
				
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoUnidad, this.gridBagConstraintsProductoUnidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoUnidad = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoUnidad.setLayout(gridaBagLayoutBusquedasParametrosProductoUnidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoUnidad, this.gridBagConstraintsProductoUnidad);
			
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoUnidad, this.gridBagConstraintsProductoUnidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoUnidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoUnidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoUnidad.setName("jPanelReporteDinamicoProductoUnidad"); 
		
		this.jPanelReporteDinamicoProductoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoUnidad.setLayout(gridaBagLayoutReporteDinamicoProductoUnidad);
		
		
		this.jInternalFrameReporteDinamicoProductoUnidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoUnidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoUnidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoUnidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoUnidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoUnidad = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoUnidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelColumnasSelectReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoUnidad = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoUnidad=new JScrollPane(this.jListColumnasSelectReporteProductoUnidad);
			
			this.jScrollColumnasSelectReporteProductoUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoUnidad.add(this.jListColumnasSelectReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
		this.jPanelReporteDinamicoProductoUnidad.add(this.jScrollColumnasSelectReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoUnidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoUnidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoUnidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoUnidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoUnidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoUnidad=new JScrollPane(this.jListRelacionesSelectReporteProductoUnidad);
			
			this.jScrollRelacionesSelectReporteProductoUnidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoUnidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoUnidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoUnidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoUnidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoUnidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoUnidad = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoUnidad.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelConGraficoDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoUnidad.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoUnidad.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoUnidad.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jCheckBoxConGraficoDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoUnidad.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelColumnaCategoriaGraficoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoUnidad.add(this.jComboBoxColumnaCategoriaGraficoProductoUnidad, this.gridBagConstraintsProductoUnidad);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoUnidad.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelColumnaCategoriaValorProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoUnidad.add(this.jComboBoxColumnaCategoriaValorProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoUnidad = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoUnidad.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelColumnasValoresGraficoProductoUnidad, this.gridBagConstraintsProductoUnidad);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoUnidad = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoUnidad.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoUnidad=new JScrollPane(this.jListColumnasValoresGraficoProductoUnidad);
			
			this.jScrollColumnasValoresGraficoProductoUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoUnidad.add(this.jListColumnasSelectReporteProductoUnidad, this.gridBagConstraintsProductoUnidad);
		this.jPanelReporteDinamicoProductoUnidad.add(this.jScrollColumnasValoresGraficoProductoUnidad, this.gridBagConstraintsProductoUnidad);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoUnidad = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoUnidad.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelTiposGraficosReportesDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoUnidad.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jComboBoxTiposGraficosReportesDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoUnidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoUnidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelGenerarExcelReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoUnidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoUnidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoUnidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoUnidad.setToolTipText("Generar EXCEL"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoUnidad.add(this.jButtonGenerarExcelReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoUnidad.add(this.jComboBoxTiposReportesDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoUnidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoUnidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoUnidad.add(this.jLabelTiposArchivoReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoUnidad.add(this.jComboBoxTiposArchivosReportesDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoUnidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoUnidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoUnidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoUnidad.setToolTipText("Generar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoUnidad.add(this.jButtonGenerarReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoUnidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoUnidad.setToolTipText("Cancelar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoUnidad.add(this.jButtonCerrarReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoUnidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoUnidad= new JScrollPane(jPanelReporteDinamicoProductoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoUnidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoUnidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoUnidad);
		this.jInternalFrameReporteDinamicoProductoUnidad.getContentPane().add(this.jScrollPanelReporteDinamicoProductoUnidad, this.gridBagConstraintsProductoUnidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoUnidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoUnidad.setName("jPanelImportacionProductoUnidad"); 
		
		this.jPanelImportacionProductoUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoUnidad.setLayout(gridaBagLayoutImportacionProductoUnidad);
		
		
		this.jInternalFrameImportacionProductoUnidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoUnidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoUnidad.setResizable(true);
	    this.jInternalFrameImportacionProductoUnidad.setClosable(true);
	    this.jInternalFrameImportacionProductoUnidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoUnidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoUnidad.setResizable(true);
	    this.jInternalFrameImportacionProductoUnidad.setClosable(true);
	    this.jInternalFrameImportacionProductoUnidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoUnidad = new JLabelMe();

		this.jLabelArchivoImportacionProductoUnidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoUnidad.add(this.jLabelArchivoImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoUnidad = new JFileChooser();		
		this.jFileChooserImportacionProductoUnidad.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoUnidad = new JButtonMe();
		this.jButtonAbrirImportacionProductoUnidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoUnidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoUnidad.setToolTipText("Generar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoUnidad.add(this.jButtonAbrirImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoUnidad = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoUnidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoUnidad.add(this.jLabelPathArchivoImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoUnidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoUnidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoUnidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoUnidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoUnidad.add(this.jTextFieldPathArchivoImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoUnidad = new JButtonMe();
		this.jButtonGenerarImportacionProductoUnidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoUnidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoUnidad.setToolTipText("Generar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoUnidad.add(this.jButtonGenerarImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoUnidad = new JButtonMe();
		this.jButtonCerrarImportacionProductoUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoUnidad.setToolTipText("Cancelar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoUnidad.add(this.jButtonCerrarImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoUnidad = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoUnidad= new JScrollPane(jPanelImportacionProductoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
		this.gridBagConstraintsProductoUnidad.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoUnidad.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoUnidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoUnidad);
		this.jInternalFrameImportacionProductoUnidad.getContentPane().add(this.jScrollPanelImportacionProductoUnidad, this.gridBagConstraintsProductoUnidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoUnidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoUnidad = new JButtonMe();
			this.jButtonAbrirOrderByProductoUnidad.setText("Orden");
			this.jButtonAbrirOrderByProductoUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoUnidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoUnidad";
			inputMap = this.jButtonAbrirOrderByProductoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoUnidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoUnidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoUnidad.setName("jPanelOrderByProductoUnidad"); 
			
			this.jPanelOrderByProductoUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoUnidad.setLayout(gridaBagLayoutOrderByProductoUnidad);
			
			
			this.jTableDatosProductoUnidadOrderBy = new JTableMe();        
			this.jTableDatosProductoUnidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoUnidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoUnidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoUnidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoUnidadOrderBy.setViewportView(this.jTableDatosProductoUnidadOrderBy);
			this.jTableDatosProductoUnidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoUnidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoUnidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoUnidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoUnidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoUnidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoUnidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoUnidad.setTitle("Orden");
			this.jInternalFrameOrderByProductoUnidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoUnidad.setResizable(true);
			this.jInternalFrameOrderByProductoUnidad.setClosable(true);
			this.jInternalFrameOrderByProductoUnidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Unidads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoUnidad.ipady =150;
				
			this.jPanelOrderByProductoUnidad.add(jScrollPanelDatosProductoUnidadOrderBy, this.gridBagConstraintsProductoUnidad);//this.jTableDatosProductoUnidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoUnidad = new JButtonMe();
			this.jButtonCerrarOrderByProductoUnidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoUnidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoUnidad.setToolTipText("Cancelar"+" "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoUnidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoUnidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoUnidad.add(this.jButtonCerrarOrderByProductoUnidad, this.gridBagConstraintsProductoUnidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoUnidad = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoUnidad= new JScrollPane(jPanelOrderByProductoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoUnidad = new GridBagConstraints();
			this.gridBagConstraintsProductoUnidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoUnidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoUnidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoUnidad);
			
			this.jInternalFrameOrderByProductoUnidad.getContentPane().add(this.jScrollPanelOrderByProductoUnidad, this.gridBagConstraintsProductoUnidad);			
		
		} else {
			this.jButtonAbrirOrderByProductoUnidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productounidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoUnidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoUnidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoUnidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoUnidad.getRowHeight();//ProductoUnidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoUnidad.isSelected()) {
					iHeightTable=ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoUnidad.isSelected()) {
					iHeightTable=ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoUnidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoUnidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoUnidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoUnidad!=null && this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy()!=null) {
			//if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoUnidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoUnidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoUnidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productounidadLogic.getProductoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productounidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoUnidad> TraerProductoUnidadBeans(List<ProductoUnidad> productounidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoUnidad productounidad:productounidads) {
					
				if(!(ProductoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productounidad.setsDetalleGeneralEntityReporte(ProductoUnidadConstantesFunciones.getProductoUnidadDescripcion(productounidad));
										
						
					
						
					
				} else  {
							
					//productounidad.setsDetalleGeneralEntityReporte(productounidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//productounidadbeans.add(productounidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productounidads;
    }
	//PARA REPORTES FIN
}
