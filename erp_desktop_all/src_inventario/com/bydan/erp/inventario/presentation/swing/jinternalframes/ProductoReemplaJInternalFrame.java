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
import com.bydan.erp.inventario.util.ProductoReemplaConstantesFunciones;

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
public class ProductoReemplaJInternalFrame extends ProductoReemplaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoReempla;
	
	protected JMenuBar jmenuBarProductoReempla;
	
	protected JMenu jmenuProductoReempla;
	protected JMenu jmenuDatosProductoReempla;
	protected JMenu jmenuArchivoProductoReempla;
	protected JMenu jmenuAccionesProductoReempla;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoReempla;	
	protected GridBagConstraints gridBagConstraintsProductoReempla;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoReemplaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoReempla;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoReempla;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoReempla;	
	
	
	public ProductoReemplaBeanSwingJInternalFrameTree jInternalFrameTreeProductoReempla;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productoreempla="";
	
	public ProductoReemplaSessionBean productoreemplaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoReempla> productoreemplas;		
	public List<ProductoReempla> productoreemplasEliminados;	
	public List<ProductoReempla> productoreemplasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoReempla;		
	protected JButton jButtonAbrirOrderByProductoReempla;
	
	
	//protected JPanel jPanelOrderByProductoReempla;
	//public JScrollPane jScrollPanelOrderByProductoReempla;	
	//protected JButton jButtonCerrarOrderByProductoReempla;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoReemplaLogic productoreemplaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoReempla;
	public JScrollPane jScrollPanelDatosEdicionProductoReempla;
	public JScrollPane jScrollPanelDatosGeneralProductoReempla;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoReemplaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoReempla;
	//public JScrollPane jScrollPanelImportacionProductoReempla;
	
	
	
	protected JPanel jPanelAccionesProductoReempla;
	
    protected JPanel jPanelPaginacionProductoReempla;
    protected JPanel jPanelParametrosReportesProductoReempla;
	protected JPanel jPanelParametrosReportesAccionesProductoReempla;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoReempla;
	protected JPanel jPanelParametrosAuxiliar2ProductoReempla;
	protected JPanel jPanelParametrosAuxiliar3ProductoReempla;
	protected JPanel jPanelParametrosAuxiliar4ProductoReempla;
	//protected JPanel jPanelParametrosAuxiliar5ProductoReempla;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoReempla;
	//protected JPanel jPanelImportacionProductoReempla;
	
	
	public JTable jTableDatosProductoReempla;
	
	
	
	//public JTable jTableDatosProductoReemplaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoReempla;
	protected JButton jButtonDuplicarProductoReempla;
	protected JButton jButtonCopiarProductoReempla;
	protected JButton jButtonVerFormProductoReempla;
	protected JButton jButtonNuevoRelacionesProductoReempla;
	protected JButton jButtonModificarProductoReempla;
	
    protected JButton jButtonGuardarCambiosTablaProductoReempla;
	protected JButton jButtonCerrarProductoReempla;
	
	
	protected JButton jButtonRecargarInformacionProductoReempla;
	protected JButton jButtonProcesarInformacionProductoReempla;
	
	
	protected JButton jButtonAnterioresProductoReempla;
	protected JButton jButtonSiguientesProductoReempla;
	protected JButton jButtonNuevoGuardarCambiosProductoReempla;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoReempla;
	//protected JButton jButtonCerrarReporteDinamicoProductoReempla;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoReempla;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoReempla;
	//protected JButton jButtonGenerarImportacionProductoReempla;
	//protected JButton jButtonCerrarImportacionProductoReempla;
	//protected JFileChooser jFileChooserImportacionProductoReempla;
	//protected File fileImportacionProductoReempla;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoReempla;
	protected JButton jButtonDuplicarToolBarProductoReempla;
	protected JButton jButtonNuevoRelacionesToolBarProductoReempla;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoReempla;
	protected JButton jButtonCopiarToolBarProductoReempla;
	protected JButton jButtonVerFormToolBarProductoReempla;
	public JButton jButtonGuardarCambiosTablaToolBarProductoReempla;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoReempla;
	protected JButton jButtonCerrarToolBarProductoReempla;
	
	protected JButton jButtonRecargarInformacionToolBarProductoReempla;
	protected JButton jButtonProcesarInformacionToolBarProductoReempla;
	protected JButton jButtonAnterioresToolBarProductoReempla;
	protected JButton jButtonSiguientesToolBarProductoReempla;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoReempla;
	protected JButton jButtonAbrirOrderByToolBarProductoReempla;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoReempla;
	protected JMenuItem jMenuItemDuplicarProductoReempla;
	protected JMenuItem jMenuItemNuevoRelacionesProductoReempla;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoReempla;
	protected JMenuItem jMenuItemCopiarProductoReempla;
	protected JMenuItem jMenuItemVerFormProductoReempla;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoReempla;
	protected JMenuItem jMenuItemCerrarProductoReempla;
	protected JMenuItem jMenuItemDetalleCerrarProductoReempla;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoReempla;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoReempla;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoReempla;
	protected JMenuItem jMenuItemProcesarInformacionProductoReempla;
	protected JMenuItem jMenuItemAnterioresProductoReempla;
	protected JMenuItem jMenuItemSiguientesProductoReempla;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoReempla;
	protected JMenuItem jMenuItemAbrirOrderByProductoReempla;
	protected JMenuItem jMenuItemMostrarOcultarProductoReempla;
	
	
	//MENU
	
	protected JButton jButtonArbolProductoReempla;	
	
	protected JLabel jLabelAccionesProductoReempla;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoReempla;
	protected JCheckBox jCheckBoxSeleccionadosProductoReempla;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoReempla;
	protected JCheckBox jCheckBoxConGraficoReporteProductoReempla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoReempla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoReempla;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoReempla;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoReempla;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoReempla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoReempla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoReempla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoReempla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoReempla;
	protected JTextField jTextFieldValorCampoGeneralProductoReempla;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoReempla;
	//public JList<Reporte> jListColumnasSelectReporteProductoReempla;
	//public JScrollPane jScrollColumnasSelectReporteProductoReempla;
	
	//public JLabel jLabelRelacionesSelectReporteProductoReempla;
	//public JList<Reporte> jListRelacionesSelectReporteProductoReempla;
	//public JScrollPane jScrollRelacionesSelectReporteProductoReempla;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoReempla;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoReempla;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoReempla;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoReempla;
	
		
	//public JLabel jLabelArchivoImportacionProductoReempla;	
	//public JLabel jLabelPathArchivoImportacionProductoReempla;
	//protected JTextField jTextFieldPathArchivoImportacionProductoReempla;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoReempla;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoReempla;
	
	//public JLabel jLabelColumnaCategoriaValorProductoReempla;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoReempla;
	
	//public JLabel jLabelColumnasValoresGraficoProductoReempla;
	//public JList<Reporte> jListColumnasValoresGraficoProductoReempla;
	//public JScrollPane jScrollColumnasValoresGraficoProductoReempla;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoReempla;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoReempla;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoReempla;
	public JPanel jPanelFK_IdBodegaProductoReempla;
	public JButton jButtonFK_IdBodegaProductoReempla;
	public JPanel jPanelFK_IdProductoProductoReempla;
	public JButton jButtonFK_IdProductoProductoReempla;
	public JPanel jPanelFK_IdProductoReemplaProductoReempla;
	public JButton jButtonFK_IdProductoReemplaProductoReempla;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoReempla;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoReempla;
	public JButton jButtonid_bodegaFK_IdBodegaProductoReempla= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoReemplaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoReempla;
	public JLabel jLabelid_productoFK_IdProductoProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoReempla;
	public JButton jButtonid_productoFK_IdProductoProductoReempla= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoReemplaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoReempla;
	
	public JPanel jPanelid_producto_reemplaFK_IdProductoReemplaProductoReempla;
	public JLabel jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla;
	public JButton jButtonid_producto_reemplaFK_IdProductoReemplaProductoReempla= new JButtonMe();
	public JButton jButtonid_producto_reemplaFK_IdProductoReemplaProductoReemplaUpdate= new JButtonMe();
	public JButton jButtonid_producto_reemplaFK_IdProductoReemplaProductoReemplaBusqueda= new JButtonMe();
	public JButton jButtonid_producto_reemplaFK_IdProductoReemplaProductoReemplaArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoReemplaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoReemplaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoReempla)	{
		this.jButtonRecargarInformacionProductoReempla = jButtonRecargarInformacionProductoReempla;
	}
	
	public JButton getjButtonProcesarInformacionProductoReempla() {
		return this.jButtonProcesarInformacionProductoReempla;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoReempla)	{
		this.jButtonProcesarInformacionProductoReempla = jButtonProcesarInformacionProductoReempla;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoReempla() {
		return this.jButtonRecargarInformacionProductoReempla;
	}
	
	public JButton getjButtonArbolProductoReempla() {
		return this.jButtonArbolProductoReempla;
	}
	
	public void setjButtonArbol(JButton jButtonArbolProductoReempla)	{
		this.jButtonArbolProductoReempla = jButtonArbolProductoReempla;
	}
	
	public List<ProductoReempla> getproductoreemplas() {
		return this.productoreemplas;
	}

	public void setproductoreemplas(List<ProductoReempla> productoreemplas) {
		this.productoreemplas = productoreemplas;
	}
	
	public List<ProductoReempla> getproductoreemplasAux() {
		return this.productoreemplasAux;
	}

	public void setproductoreemplasAux(List<ProductoReempla> productoreemplasAux) {
		this.productoreemplasAux = productoreemplasAux;
	}
	
	public List<ProductoReempla> getproductoreemplasEliminados() {
		return this.productoreemplasEliminados;
	}

	public void setProductoReemplasEliminados(List<ProductoReempla> productoreemplasEliminados) {
		this.productoreemplasEliminados = productoreemplasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoReempla() {
		return jComboBoxTiposSeleccionarProductoReempla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoReempla(
			JComboBox jComboBoxTiposSeleccionarProductoReempla) {
		this.jComboBoxTiposSeleccionarProductoReempla = jComboBoxTiposSeleccionarProductoReempla;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoReempla .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoReempla() {
		return jTextFieldValorCampoGeneralProductoReempla;
	}

	public void setjTextFieldValorCampoGeneralProductoReempla(
			JTextField jTextFieldValorCampoGeneralProductoReempla) {
		this.jTextFieldValorCampoGeneralProductoReempla = jTextFieldValorCampoGeneralProductoReempla;
	}

	public void setBorderResaltarValorCampoGeneralProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoReempla .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoReempla() {
		return this.jCheckBoxSeleccionarTodosProductoReempla;
	}

	public void setjCheckBoxSeleccionarTodosProductoReempla(
			JCheckBox jCheckBoxSeleccionarTodosProductoReempla) {
		this.jCheckBoxSeleccionarTodosProductoReempla = jCheckBoxSeleccionarTodosProductoReempla;
	}

	public void setBorderResaltarSeleccionarTodosProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoReempla .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoReempla() {
		return this.jCheckBoxSeleccionadosProductoReempla;
	}

	public void setjCheckBoxSeleccionadosProductoReempla(
			JCheckBox jCheckBoxSeleccionadosProductoReempla) {
		this.jCheckBoxSeleccionadosProductoReempla = jCheckBoxSeleccionadosProductoReempla;
	}
	
	public void setBorderResaltarSeleccionadosProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoReempla .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoReempla() {
		return this.jComboBoxTiposArchivosReportesProductoReempla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoReempla(
			JComboBox jComboBoxTiposArchivosReportesProductoReempla) {
		this.jComboBoxTiposArchivosReportesProductoReempla = jComboBoxTiposArchivosReportesProductoReempla;
	}

	public void setBorderResaltarTiposArchivosReportesProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoReempla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoReempla() {
		return this.jComboBoxTiposReportesProductoReempla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoReempla(
			JComboBox jComboBoxTiposReportesProductoReempla) {
		this.jComboBoxTiposReportesProductoReempla = jComboBoxTiposReportesProductoReempla;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoReempla() {
	//	return jComboBoxTiposReportesDinamicoProductoReempla;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoReempla(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoReempla) {
	//	this.jComboBoxTiposReportesDinamicoProductoReempla = jComboBoxTiposReportesDinamicoProductoReempla;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoReempla() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoReempla;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoReempla(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoReempla) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoReempla = jComboBoxTiposArchivosReportesDinamicoProductoReempla;
	//}
	
	public void setBorderResaltarTiposReportesProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoReempla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoReempla() {
		return this.jComboBoxTiposGraficosReportesProductoReempla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoReempla(
			JComboBox jComboBoxTiposGraficosReportesProductoReempla) {
		this.jComboBoxTiposGraficosReportesProductoReempla = jComboBoxTiposGraficosReportesProductoReempla;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoReempla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoReempla() {
		return this.jComboBoxTiposPaginacionProductoReempla;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoReempla(
			JComboBox jComboBoxTiposPaginacionProductoReempla) {
		this.jComboBoxTiposPaginacionProductoReempla = jComboBoxTiposPaginacionProductoReempla;
	}
	
	public void setBorderResaltarTiposPaginacionProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoReempla .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoReempla() {
		return this.jComboBoxTiposRelacionesProductoReempla;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoReempla() {
		return this.jComboBoxTiposAccionesProductoReempla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoReempla(
			JComboBox jComboBoxTiposRelacionesProductoReempla) {
		this.jComboBoxTiposRelacionesProductoReempla = jComboBoxTiposRelacionesProductoReempla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoReempla(
			JComboBox jComboBoxTiposAccionesProductoReempla) {
		this.jComboBoxTiposAccionesProductoReempla = jComboBoxTiposAccionesProductoReempla;
	}
	
	public void setBorderResaltarTiposRelacionesProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoReempla .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoReempla() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoReempla.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoReempla .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoReempla() {
	//	return jCheckBoxConGraficoDinamicoProductoReempla;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoReempla(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoReempla) {
	//	this.jCheckBoxConGraficoDinamicoProductoReempla = jCheckBoxConGraficoDinamicoProductoReempla;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoReempla() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoReempla.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoReempla .setBorder(borderResaltar);		
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
		this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		
		this.productoreemplaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoreemplaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoreemplaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoReemplaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Reemplazo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoReempla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoReempla= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"nuevo","nuevo","Nuevo"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"duplicar","duplicar","Duplicar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"copiar","copiar","Copiar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"ver_form","ver_form","Ver"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"recargar","recargar","Recargar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoReempla,this.jTtoolBarProductoReempla,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoReempla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoReempla,this.jTtoolBarProductoReempla,
							"cerrar","cerrar","Salir"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoReempla=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoReempla;
			
				this.jButtonProcesarInformacionToolBarProductoReempla=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoReempla;
				
		//protected JButton jButtonModificarToolBarProductoReempla;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoReempla=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoReempla=new JMenuMe("General");
		this.jmenuArchivoProductoReempla=new JMenuMe("Archivo");
		this.jmenuAccionesProductoReempla=new JMenuMe("Acciones");
		this.jmenuDatosProductoReempla=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoReempla= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoReempla.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoReempla,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoReempla= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoReempla.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoReempla,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoReempla= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoReempla.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoReempla,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoReempla= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoReempla.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoReempla,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoReempla= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoReempla.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoReempla,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoReempla= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoReempla.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoReempla,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoReempla= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoReempla.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoReempla,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoReempla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoReempla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoReempla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoReempla= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoReempla.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoReempla,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoReempla= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoReempla.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoReempla,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoReempla= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoReempla.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoReempla,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoReempla= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoReempla.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoReempla,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoReempla= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoReempla.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoReempla,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoReempla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoReempla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoReempla,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoReempla= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoReempla.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoReempla,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoReempla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoReempla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoReempla,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoReempla= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoReempla.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoReempla,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoReempla.add(this.jMenuItemCerrarProductoReempla);
			
			this.jmenuAccionesProductoReempla.add(this.jMenuItemNuevoProductoReempla);
			this.jmenuAccionesProductoReempla.add(this.jMenuItemNuevoGuardarCambiosProductoReempla);
			this.jmenuAccionesProductoReempla.add(this.jMenuItemNuevoRelacionesProductoReempla);
			this.jmenuAccionesProductoReempla.add(this.jMenuItemGuardarCambiosTablaProductoReempla);		
			this.jmenuAccionesProductoReempla.add(this.jMenuItemDuplicarProductoReempla);		
			this.jmenuAccionesProductoReempla.add(this.jMenuItemCopiarProductoReempla);		
			this.jmenuAccionesProductoReempla.add(this.jMenuItemVerFormProductoReempla);		
			
			this.jmenuDatosProductoReempla.add(this.jMenuItemRecargarInformacionProductoReempla);				
			this.jmenuDatosProductoReempla.add(this.jMenuItemAnterioresProductoReempla);				
			this.jmenuDatosProductoReempla.add(this.jMenuItemSiguientesProductoReempla);				
			this.jmenuDatosProductoReempla.add(this.jMenuItemAbrirOrderByProductoReempla);				
			this.jmenuDatosProductoReempla.add(this.jMenuItemMostrarOcultarProductoReempla);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoReempla.add(this.jMenuItemGuardarCambiosProductoReempla);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoReempla.add(this.jmenuArchivoProductoReempla);		
			this.jmenuBarProductoReempla.add(this.jmenuAccionesProductoReempla);		
			this.jmenuBarProductoReempla.add(this.jmenuDatosProductoReempla);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoReempla);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoReempla() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoReempla.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoReempla= new JButtonMe();
		this.jButtonFK_IdBodegaProductoReempla.setText("Buscar");
		this.jButtonFK_IdBodegaProductoReempla.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoReempla,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoReempla = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoReempla.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoReempla.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoReempla= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoReempla.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoReempla= new JButtonMe();
		this.jButtonFK_IdProductoProductoReempla.setText("Buscar");
		this.jButtonFK_IdProductoProductoReempla.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoReempla,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoReempla = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoReempla.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoReempla.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoReempla= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoReempla= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.setFocusable(false);

		this.jPanelFK_IdProductoReemplaProductoReempla=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoReemplaProductoReempla.setToolTipText("Buscar Por Producto Reempla ");
		this.jButtonFK_IdProductoReemplaProductoReempla= new JButtonMe();
		this.jButtonFK_IdProductoReemplaProductoReempla.setText("Buscar");
		this.jButtonFK_IdProductoReemplaProductoReempla.setToolTipText("Buscar Por Producto Reempla ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoReemplaProductoReempla,"buscar_button","Buscar Por Producto Reempla ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoReemplaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla = new JLabelMe();
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla.setText("Producto Reempla :");
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla.setToolTipText("Producto Reempla");
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla= new JComboBoxMe();
		jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoReempla=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoReempla.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoReempla.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoReempla.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoReempla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoReempla = new ProductoReemplaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Reemplazo DATOS");
			this.jInternalFrameDetalleFormProductoReempla = new ProductoReemplaDetalleFormJInternalFrame(jDesktopPane,this.productoreemplaSessionBean.getConGuardarRelaciones(),this.productoreemplaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoReempla = null;//new ProductoReemplaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoReempla= new GridBagLayout();
		
		
		this.jTableDatosProductoReempla = new JTableMe();      
		
		String sToolTipProductoReempla="";
		sToolTipProductoReempla=ProductoReemplaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoReempla+="(Inventario.ProductoReempla)";
		}
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoReempla+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoReempla.setToolTipText(sToolTipProductoReempla);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoReempla);
		this.jTableDatosProductoReempla.setAutoCreateRowSorter(true);
		this.jTableDatosProductoReempla.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoReempla.setRowSelectionAllowed(true);
		this.jTableDatosProductoReempla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoReempla,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoReempla = new JButtonMe();
		this.jButtonDuplicarProductoReempla = new JButtonMe();
		this.jButtonCopiarProductoReempla = new JButtonMe();
		this.jButtonVerFormProductoReempla = new JButtonMe();
		this.jButtonNuevoRelacionesProductoReempla = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoReempla = new JButtonMe();
		this.jButtonCerrarProductoReempla = new JButtonMe();
		
		this.jScrollPanelDatosProductoReempla = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoReempla = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Reemplazo";
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoReempla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoReempla.setToolTipText("Acciones");
        this.jPanelAccionesProductoReempla.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoReempla=new ReporteDinamicoJInternalFrame(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoReempla();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoReempla=new ImportacionJInternalFrame(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoReempla();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoReempla = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoReempla.setText("Orden");
		this.jButtonAbrirOrderByProductoReempla.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoReempla,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoReempla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoReempla,false,this);
			
			//this.cargarOrderByProductoReempla(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoReempla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoReempla,true,this);
			
			//this.cargarOrderByProductoReempla(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoReempla.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProductoReempla.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProductoReempla.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProductoReempla.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoReempla.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoReempla.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoReempla.setText("Nuevo");
		this.jButtonDuplicarProductoReempla.setText("Duplicar");
		this.jButtonCopiarProductoReempla.setText("Copiar");
		this.jButtonVerFormProductoReempla.setText("Ver");
		this.jButtonNuevoRelacionesProductoReempla.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoReempla.setText("Guardar");
		this.jButtonCerrarProductoReempla.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoReempla,"nuevo_button","Nuevo",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoReempla,"duplicar_button","Duplicar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoReempla,"copiar_button","Copiar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoReempla,"ver_form","Ver",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoReempla,"nuevorelaciones_button","Nuevo Rel",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoReempla,"guardarcambiostabla_button","Guardar",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoReempla,"cerrar_button","Salir",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoReempla.setToolTipText("Nuevo"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoReempla.setToolTipText("Duplicar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoReempla.setToolTipText("Copiar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoReempla.setToolTipText("Ver"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoReempla.setToolTipText("Nuevo Rel"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoReempla.setToolTipText("Guardar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoReempla.setToolTipText("Salir"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoReempla";
		inputMap = this.jButtonNuevoProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoReempla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoReempla"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoReempla";
		inputMap = this.jButtonDuplicarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoReempla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoReempla"));
		
		//COPIAR
		sMapKey = "CopiarProductoReempla";
		inputMap = this.jButtonCopiarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoReempla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoReempla"));
		
		//VEr FORM
		sMapKey = "VerFormProductoReempla";
		inputMap = this.jButtonVerFormProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoReempla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoReempla"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoReempla";
		inputMap = this.jButtonNuevoRelacionesProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoReempla"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoReempla";
		inputMap = this.jButtonModificarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoReempla"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoReempla";
		inputMap = this.jButtonCerrarProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoReempla"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoReempla";
		inputMap = this.jButtonGuardarCambiosTablaProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoReempla"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoReempla.setName("jPanelParametrosReportesProductoReempla"); 
		
		this.jPanelParametrosReportesAccionesProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoReempla.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoReempla.setName("jPanelParametrosReportesAccionesProductoReempla"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoReempla, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoReempla = new JButtonMe();
		this.jButtonRecargarInformacionProductoReempla.setText("Recargar");
		this.jButtonRecargarInformacionProductoReempla.setToolTipText("Recargar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoReempla,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoReempla = new JButtonMe();
		this.jButtonProcesarInformacionProductoReempla.setText("Procesar");
		this.jButtonProcesarInformacionProductoReempla.setToolTipText("Procesar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoReempla.setVisible(false);
			
		this.jButtonProcesarInformacionProductoReempla.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoReempla.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoReempla.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolProductoReempla = new JButtonMe();
		this.jButtonArbolProductoReempla.setText("Arbol");		
		this.jButtonArbolProductoReempla.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoReempla.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoReempla.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoReempla.setText("TIPO");       
		this.jComboBoxTiposReportesProductoReempla.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoReempla.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoReempla.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoReempla.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoReempla.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoReempla.setText("Accion");
		this.jComboBoxTiposRelacionesProductoReempla.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoReempla.setText("Accion");
		this.jComboBoxTiposAccionesProductoReempla.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoReempla = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoReempla.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoReempla.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoReempla=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoReempla.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoReempla.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoReempla.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoReempla = new JLabelMe();
		
		this.jLabelAccionesProductoReempla.setText("Acciones");		
		this.jLabelAccionesProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoReempla = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoReempla.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoReempla.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoReempla = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoReempla.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoReempla.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoReempla = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoReempla.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoReempla.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoReempla = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoReempla.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoReempla.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoReempla = new JButtonMe();
		//this.jButtonAnterioresProductoReempla.setText("<<");
        this.jButtonAnterioresProductoReempla.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoReempla,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoReempla = new JButtonMe();
		//this.jButtonSiguientesProductoReempla.setText(">>");
        this.jButtonSiguientesProductoReempla.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoReempla,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoReempla = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoReempla.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoReempla.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoReempla,"nuevoguardarcambios_button","Nue",this.productoreemplaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoReempla";
		inputMap = this.jButtonNuevoGuardarCambiosProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoReempla"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoReempla";
		inputMap = this.jButtonRecargarInformacionProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoReempla"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoReempla";
		inputMap = this.jButtonSiguientesProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoReempla"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoReempla";
		inputMap = this.jButtonAnterioresProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoReempla"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoReempla();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoReempla.setMinimumSize(new Dimension(this.getWidth(),ProductoReemplaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoReemplaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoReempla.setMaximumSize(new Dimension(this.getWidth(),ProductoReemplaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoReemplaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoReempla.setPreferredSize(new Dimension(this.getWidth(),ProductoReemplaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoReemplaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoReempla = new GridBagLayout();

			this.jPanelPaginacionProductoReempla.setLayout(gridaBagLayoutPaginacionProductoReempla);						
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 0;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoReempla.add(this.jButtonAnterioresProductoReempla, this.gridBagConstraintsProductoReempla);
					
						
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoReempla.gridy = 0;
			
			this.jPanelPaginacionProductoReempla.add(this.jButtonNuevoGuardarCambiosProductoReempla, this.gridBagConstraintsProductoReempla);
						
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoReempla.gridy = 0;
			this.jPanelPaginacionProductoReempla.add(this.jButtonSiguientesProductoReempla, this.gridBagConstraintsProductoReempla);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 1;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoReempla.add(this.jButtonNuevoProductoReempla, this.gridBagConstraintsProductoReempla);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProductoReempla = new GridBagConstraints();
				this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoReempla.gridy = 1;
				this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProductoReempla.add(this.jButtonNuevoRelacionesProductoReempla, this.gridBagConstraintsProductoReempla);
			}
			
			
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoReempla = new GridBagConstraints();
				this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoReempla.gridy = 1;
				this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoReempla.add(this.jButtonGuardarCambiosTablaProductoReempla, this.gridBagConstraintsProductoReempla);
			}
			
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 1;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoReempla.add(this.jButtonDuplicarProductoReempla, this.gridBagConstraintsProductoReempla);
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 1;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoReempla.add(this.jButtonCopiarProductoReempla, this.gridBagConstraintsProductoReempla);
		
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 1;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoReempla.add(this.jButtonVerFormProductoReempla, this.gridBagConstraintsProductoReempla);
		
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 1;
			this.gridBagConstraintsProductoReempla.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoReempla.add(this.jButtonCerrarProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		
		this.jButtonRecargarInformacionProductoReempla.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoReempla.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoReempla.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolProductoReempla.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolProductoReempla.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolProductoReempla.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoReempla.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoReempla.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoReempla.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoReempla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoReempla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoReempla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoReempla.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoReempla.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoReempla.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoReempla.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoReempla.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoReempla.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoReempla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoReempla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoReempla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoReempla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoReempla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoReempla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoReempla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoReempla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoReempla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoReempla.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoReempla.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoReempla.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoReempla.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoReempla.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoReempla.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoReempla.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoReempla.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoReempla.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoReempla.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoReempla.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoReempla.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoReempla = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoReempla = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoReempla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoReempla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoReempla = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoReempla = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoReempla.setLayout(gridaBagParametrosReportesProductoReempla);
			this.jPanelParametrosReportesAccionesProductoReempla.setLayout(gridaBagParametrosReportesAccionesProductoReempla);
			
			
			this.jPanelParametrosAuxiliar1ProductoReempla.setLayout(gridaBagParametrosAuxiliar1ProductoReempla);
			this.jPanelParametrosAuxiliar2ProductoReempla.setLayout(gridaBagParametrosAuxiliar2ProductoReempla);
			this.jPanelParametrosAuxiliar3ProductoReempla.setLayout(gridaBagParametrosAuxiliar3ProductoReempla);
			this.jPanelParametrosAuxiliar4ProductoReempla.setLayout(gridaBagParametrosAuxiliar4ProductoReempla);
			//this.jPanelParametrosAuxiliar5ProductoReempla.setLayout(gridaBagParametrosAuxiliar2ProductoReempla);			
			
			
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoReempla.add(this.jButtonRecargarInformacionProductoReempla, this.gridBagConstraintsProductoReempla);			
			
			

			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoReempla.add(this.jButtonArbolProductoReempla, this.gridBagConstraintsProductoReempla);
			
			
			
			//PAGINACION
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoReempla.add(this.jComboBoxTiposPaginacionProductoReempla, this.gridBagConstraintsProductoReempla);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoReempla.add(this.jCheckBoxConAltoMaximoTablaProductoReempla, this.gridBagConstraintsProductoReempla);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoReempla.add(this.jComboBoxTiposArchivosReportesProductoReempla, this.gridBagConstraintsProductoReempla);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoReempla.add(this.jPanelParametrosAuxiliar1ProductoReempla, this.gridBagConstraintsProductoReempla);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoReempla.add(this.jComboBoxTiposReportesProductoReempla, this.gridBagConstraintsProductoReempla);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoReempla.add(this.jPanelParametrosAuxiliar4ProductoReempla, this.gridBagConstraintsProductoReempla);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoReempla.add(this.jComboBoxTiposReportesProductoReempla, this.gridBagConstraintsProductoReempla);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoReempla.add(this.jCheckBoxGenerarReporteProductoReempla, this.gridBagConstraintsProductoReempla);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoReempla.add(this.jPanelParametrosAuxiliar2ProductoReempla, this.gridBagConstraintsProductoReempla);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoReempla.add(this.jLabelAccionesProductoReempla, this.gridBagConstraintsProductoReempla);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoReempla = new GridBagConstraints();
				this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoReempla.add(this.jButtonAbrirOrderByProductoReempla, this.gridBagConstraintsProductoReempla);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoReempla.add(this.jComboBoxTiposSeleccionarProductoReempla, this.gridBagConstraintsProductoReempla);			
			
			
			/*
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoReempla.add(this.jCheckBoxSeleccionarTodosProductoReempla, this.gridBagConstraintsProductoReempla);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoReempla.add(this.jCheckBoxSeleccionarTodosProductoReempla, this.gridBagConstraintsProductoReempla);															
				
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoReempla.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoReempla.add(this.jCheckBoxSeleccionadosProductoReempla, this.gridBagConstraintsProductoReempla);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoReempla.add(this.jPanelParametrosAuxiliar3ProductoReempla, this.gridBagConstraintsProductoReempla);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoReempla.add(this.jComboBoxTiposRelacionesProductoReempla, this.gridBagConstraintsProductoReempla);
				
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoReempla.add(this.jComboBoxTiposAccionesProductoReempla, this.gridBagConstraintsProductoReempla);
	
				
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoReempla.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoReempla.add(this.jTextFieldValorCampoGeneralProductoReempla, this.gridBagConstraintsProductoReempla);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoReempla = new GridBagLayout();

			this.jScrollPanelDatosProductoReempla.setLayout(gridaBagLayoutDatosProductoReempla);
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = 0;
			this.gridBagConstraintsProductoReempla.gridx = 0;
			
			this.jScrollPanelDatosProductoReempla.add(this.jTableDatosProductoReempla, this.gridBagConstraintsProductoReempla);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoReempla.setViewportView(this.jTableDatosProductoReempla);
		this.jTableDatosProductoReempla.setFillsViewportHeight(true);
		this.jTableDatosProductoReempla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoReempla= new GridBagLayout();
		this.jPanelAccionesProductoReempla.setLayout(gridaBagLayoutAccionesProductoReempla);
		
		
		/*	
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = 0;
		this.gridBagConstraintsProductoReempla.gridx = 0;
			
		this.jPanelAccionesProductoReempla.add(this.jButtonNuevoProductoReempla, this.gridBagConstraintsProductoReempla);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoReempla= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoReempla.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoReempla.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoReempla.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoReempla.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoReempla.setLayout(gridaBagLayoutFK_IdBodegaProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 0;
		jPanelFK_IdBodegaProductoReempla.add(jLabelid_bodegaFK_IdBodegaProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 1;
		jPanelFK_IdBodegaProductoReempla.add(jComboBoxid_bodegaFK_IdBodegaProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 1;
		gridBagConstraintsProductoReempla.gridx =1;
		jPanelFK_IdBodegaProductoReempla.add(jButtonFK_IdBodegaProductoReempla, gridBagConstraintsProductoReempla);

		jTabbedPaneBusquedasProductoReempla.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoReempla);
		jTabbedPaneBusquedasProductoReempla.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoReempla= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoReempla.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoReempla.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoReempla.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoReempla.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoReempla.setLayout(gridaBagLayoutFK_IdProductoProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 0;
		jPanelFK_IdProductoProductoReempla.add(jLabelid_productoFK_IdProductoProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 1;
		jPanelFK_IdProductoProductoReempla.add(jComboBoxid_productoFK_IdProductoProductoReempla, gridBagConstraintsProductoReempla);


		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 0;
		jPanelFK_IdProductoProductoReempla.add(this.jButtonBuscarFK_IdProductoid_productoProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 1;
		gridBagConstraintsProductoReempla.gridx =1;
		jPanelFK_IdProductoProductoReempla.add(jButtonFK_IdProductoProductoReempla, gridBagConstraintsProductoReempla);

		jTabbedPaneBusquedasProductoReempla.addTab("2.-Por Producto ", jPanelFK_IdProductoProductoReempla);
		jTabbedPaneBusquedasProductoReempla.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoReemplaProductoReempla= new GridBagLayout();
		gridaBagLayoutFK_IdProductoReemplaProductoReempla.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoReemplaProductoReempla.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoReemplaProductoReempla.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoReemplaProductoReempla.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoReemplaProductoReempla.setLayout(gridaBagLayoutFK_IdProductoReemplaProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 0;
		jPanelFK_IdProductoReemplaProductoReempla.add(jLabelid_producto_reemplaFK_IdProductoReemplaProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 0;
		gridBagConstraintsProductoReempla.gridx = 1;
		jPanelFK_IdProductoReemplaProductoReempla.add(jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla, gridBagConstraintsProductoReempla);

		gridBagConstraintsProductoReempla = new GridBagConstraints();
		gridBagConstraintsProductoReempla.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoReempla.gridy = 1;
		gridBagConstraintsProductoReempla.gridx =1;
		jPanelFK_IdProductoReemplaProductoReempla.add(jButtonFK_IdProductoReemplaProductoReempla, gridBagConstraintsProductoReempla);

		jTabbedPaneBusquedasProductoReempla.addTab("3.-Por Producto Reempla ", jPanelFK_IdProductoReemplaProductoReempla);
		jTabbedPaneBusquedasProductoReempla.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoReempla = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoReempla);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();						
			this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoReempla.gridx = 0;		
			//this.gridBagConstraintsProductoReempla.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoReempla.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoReempla, this.gridBagConstraintsProductoReempla);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoReempla.gridx = 0;		
		//this.gridBagConstraintsProductoReempla.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoReempla.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoReempla);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoReempla.gridx = 0;		
			this.gridBagConstraintsProductoReempla.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoReempla.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoReempla, this.gridBagConstraintsProductoReempla);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoReempla, this.gridBagConstraintsProductoReempla);								
		
		
		/*
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoReempla, this.gridBagConstraintsProductoReempla);
		*/		
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoReempla.gridx =0;
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoReempla.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoReempla, this.gridBagConstraintsProductoReempla);
				
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoReempla, this.gridBagConstraintsProductoReempla);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeProductoReempla = new ProductoReemplaBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeProductoReempla.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeProductoReempla.setTitle("Reemplazo ARBOL");
		this.jInternalFrameTreeProductoReempla.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reemplazo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeProductoReempla.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeProductoReempla.setResizable(true);
	    this.jInternalFrameTreeProductoReempla.setClosable(true);
	    this.jInternalFrameTreeProductoReempla.setMaximizable(true);
			
			
		if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoReempla= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoReempla = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoReempla.setLayout(gridaBagLayoutBusquedasParametrosProductoReempla);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoReempla=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoReempla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoReempla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoReempla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoReempla, this.gridBagConstraintsProductoReempla);
			
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoReempla, this.gridBagConstraintsProductoReempla);
		
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoReempla, this.gridBagConstraintsProductoReempla);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoReempla;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoReempla() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoReempla = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoReempla.setName("jPanelReporteDinamicoProductoReempla"); 
		
		this.jPanelReporteDinamicoProductoReempla.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoReempla.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoReempla.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoReempla.setLayout(gridaBagLayoutReporteDinamicoProductoReempla);
		
		
		this.jInternalFrameReporteDinamicoProductoReempla= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoReempla = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoReempla= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoReempla.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoReempla.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoReempla.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoReempla.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoReempla.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoReempla.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoReempla.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoReempla.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoReempla.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoReempla = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoReempla.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoReempla.add(this.jLabelColumnasSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoReempla = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoReempla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoReempla.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoReempla.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoReempla.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoReempla.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoReempla=new JScrollPane(this.jListColumnasSelectReporteProductoReempla);
			
			this.jScrollColumnasSelectReporteProductoReempla.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoReempla.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoReempla.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoReempla.add(this.jListColumnasSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		this.jPanelReporteDinamicoProductoReempla.add(this.jScrollColumnasSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoReempla = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoReempla.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoReempla.add(this.jLabelRelacionesSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoReempla = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoReempla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoReempla.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoReempla.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoReempla.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoReempla.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoReempla=new JScrollPane(this.jListRelacionesSelectReporteProductoReempla);
			
			this.jScrollRelacionesSelectReporteProductoReempla.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoReempla.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoReempla.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoReempla.add(this.jListRelacionesSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		this.jPanelReporteDinamicoProductoReempla.add(this.jScrollRelacionesSelectReporteProductoReempla, this.gridBagConstraintsProductoReempla);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProductoReempla = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoReempla = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoReempla = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoReempla = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoReempla.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoReempla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoReempla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoReempla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoReempla = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoReempla.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoReempla.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoReempla.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoReempla.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoReempla = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoReempla.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoReempla.add(this.jLabelGenerarExcelReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoReempla = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoReempla.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoReempla,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoReempla.setToolTipText("Generar EXCEL"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		//this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoReempla.add(this.jButtonGenerarExcelReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoReempla.add(this.jComboBoxTiposReportesDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoReempla = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoReempla.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoReempla.add(this.jLabelTiposArchivoReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoReempla.add(this.jComboBoxTiposArchivosReportesDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoReempla = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoReempla.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoReempla,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoReempla.setToolTipText("Generar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoReempla.add(this.jButtonGenerarReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoReempla = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoReempla.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoReempla,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoReempla.setToolTipText("Cancelar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoReempla.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoReempla.add(this.jButtonCerrarReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoReempla = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoReempla= new JScrollPane(jPanelReporteDinamicoProductoReempla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoReempla.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoReempla.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoReempla.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoReempla.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoReempla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoReempla.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoReempla);
		this.jInternalFrameReporteDinamicoProductoReempla.getContentPane().add(this.jScrollPanelReporteDinamicoProductoReempla, this.gridBagConstraintsProductoReempla);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoReempla() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoReempla = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoReempla.setName("jPanelImportacionProductoReempla"); 
		
		this.jPanelImportacionProductoReempla.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoReempla.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoReempla.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoReempla.setLayout(gridaBagLayoutImportacionProductoReempla);
		
		
		this.jInternalFrameImportacionProductoReempla= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoReempla= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoReempla = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoReempla= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoReempla.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoReempla.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoReempla.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoReempla.setResizable(true);
	    this.jInternalFrameImportacionProductoReempla.setClosable(true);
	    this.jInternalFrameImportacionProductoReempla.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoReempla.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoReempla.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoReempla.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoReempla.setResizable(true);
	    this.jInternalFrameImportacionProductoReempla.setClosable(true);
	    this.jInternalFrameImportacionProductoReempla.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoReempla.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoReempla.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoReempla.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoReempla = new JLabelMe();

		this.jLabelArchivoImportacionProductoReempla.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoReempla.add(this.jLabelArchivoImportacionProductoReempla, this.gridBagConstraintsProductoReempla);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoReempla = new JFileChooser();		
		this.jFileChooserImportacionProductoReempla.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoReempla = new JButtonMe();
		this.jButtonAbrirImportacionProductoReempla.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoReempla,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoReempla.setToolTipText("Generar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoReempla.add(this.jButtonAbrirImportacionProductoReempla, this.gridBagConstraintsProductoReempla);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoReempla = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoReempla.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoReempla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoReempla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoReempla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoReempla.add(this.jLabelPathArchivoImportacionProductoReempla, this.gridBagConstraintsProductoReempla);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoReempla=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoReempla.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoReempla.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoReempla.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoReempla.add(this.jTextFieldPathArchivoImportacionProductoReempla, this.gridBagConstraintsProductoReempla);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoReempla = new JButtonMe();
		this.jButtonGenerarImportacionProductoReempla.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoReempla,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoReempla.setToolTipText("Generar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoReempla.add(this.jButtonGenerarImportacionProductoReempla, this.gridBagConstraintsProductoReempla);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoReempla = new JButtonMe();
		this.jButtonCerrarImportacionProductoReempla.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoReempla,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoReempla.setToolTipText("Cancelar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoReempla.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoReempla.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoReempla.add(this.jButtonCerrarImportacionProductoReempla, this.gridBagConstraintsProductoReempla);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoReempla = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoReempla= new JScrollPane(jPanelImportacionProductoReempla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoReempla.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoReempla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoReempla.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoReempla);
		this.jInternalFrameImportacionProductoReempla.getContentPane().add(this.jScrollPanelImportacionProductoReempla, this.gridBagConstraintsProductoReempla);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoReempla(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoReempla = new JButtonMe();
			this.jButtonAbrirOrderByProductoReempla.setText("Orden");
			this.jButtonAbrirOrderByProductoReempla.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoReempla,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoReempla";
			inputMap = this.jButtonAbrirOrderByProductoReempla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoReempla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoReempla"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoReempla = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoReempla.setName("jPanelOrderByProductoReempla"); 
			
			this.jPanelOrderByProductoReempla.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoReempla.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoReempla.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoReempla.setLayout(gridaBagLayoutOrderByProductoReempla);
			
			
			this.jTableDatosProductoReemplaOrderBy = new JTableMe();        
			this.jTableDatosProductoReemplaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoReemplaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoReemplaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoReemplaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoReemplaOrderBy.setViewportView(this.jTableDatosProductoReemplaOrderBy);
			this.jTableDatosProductoReemplaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoReemplaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoReempla= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoReempla= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoReempla = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoReempla= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoReempla.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoReempla.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoReempla.setTitle("Orden");
			this.jInternalFrameOrderByProductoReempla.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoReempla.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoReempla.setResizable(true);
			this.jInternalFrameOrderByProductoReempla.setClosable(true);
			this.jInternalFrameOrderByProductoReempla.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoReempla.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoReempla.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoReempla.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reemplazos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoReempla.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoReempla.ipady =150;
				
			this.jPanelOrderByProductoReempla.add(jScrollPanelDatosProductoReemplaOrderBy, this.gridBagConstraintsProductoReempla);//this.jTableDatosProductoReemplaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoReempla = new JButtonMe();
			this.jButtonCerrarOrderByProductoReempla.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoReempla,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoReempla.setToolTipText("Cancelar"+" "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoReempla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoReempla.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoReempla.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoReempla.add(this.jButtonCerrarOrderByProductoReempla, this.gridBagConstraintsProductoReempla);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoReempla = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoReempla= new JScrollPane(jPanelOrderByProductoReempla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoReempla = new GridBagConstraints();
			this.gridBagConstraintsProductoReempla.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoReempla.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoReempla.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoReempla.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoReempla.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoReempla);
			
			this.jInternalFrameOrderByProductoReempla.getContentPane().add(this.jScrollPanelOrderByProductoReempla, this.gridBagConstraintsProductoReempla);			
		
		} else {
			this.jButtonAbrirOrderByProductoReempla = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoreemplaSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosProductoReempla.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoReempla.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoReempla.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoReempla.getRowHeight();//ProductoReemplaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoReempla.isSelected()) {
					iHeightTable=ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoReempla.isSelected()) {
					iHeightTable=ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoReemplaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoReempla.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoReempla.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoReempla.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoReempla.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoReempla.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoReempla.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoReempla!=null && this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy()!=null) {
			//if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoReempla.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoReempla.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoReempla.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoReempla.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoReempla.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoReempla.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoreemplaLogic.getProductoReemplas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoreemplas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoReempla> TraerProductoReemplaBeans(List<ProductoReempla> productoreemplas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoReempla productoreempla:productoreemplas) {
					
				if(!(ProductoReemplaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoReemplaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoreempla.setsDetalleGeneralEntityReporte(ProductoReemplaConstantesFunciones.getProductoReemplaDescripcion(productoreempla));
										
						
					
					

					if(productoreempla.getProductoReemplas()!=null && Funciones.existeClass(classes,ProductoReempla.class)) {
						try{productoreempla.setproductoreemplasDescripcionReporte(new JRBeanCollectionDataSource(ProductoReemplaJInternalFrame.TraerProductoReemplaBeans(productoreempla.getProductoReemplas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//productoreempla.setsDetalleGeneralEntityReporte(productoreempla.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoreemplabeans.add(productoreemplabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoreemplas;
    }
	//PARA REPORTES FIN
}
