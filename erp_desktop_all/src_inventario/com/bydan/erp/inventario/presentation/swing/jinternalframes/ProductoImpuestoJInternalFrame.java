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
import com.bydan.erp.inventario.util.ProductoImpuestoConstantesFunciones;

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
public class ProductoImpuestoJInternalFrame extends ProductoImpuestoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoImpuesto;
	
	protected JMenuBar jmenuBarProductoImpuesto;
	
	protected JMenu jmenuProductoImpuesto;
	protected JMenu jmenuDatosProductoImpuesto;
	protected JMenu jmenuArchivoProductoImpuesto;
	protected JMenu jmenuAccionesProductoImpuesto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoImpuesto;	
	protected GridBagConstraints gridBagConstraintsProductoImpuesto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoImpuestoDetalleFormJInternalFrame jInternalFrameDetalleFormProductoImpuesto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoImpuesto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoImpuesto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_impuestoinven="";
	
	public ProductoImpuestoSessionBean productoimpuestoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoImpuesto> productoimpuestos;		
	public List<ProductoImpuesto> productoimpuestosEliminados;	
	public List<ProductoImpuesto> productoimpuestosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoImpuesto;		
	protected JButton jButtonAbrirOrderByProductoImpuesto;
	
	
	//protected JPanel jPanelOrderByProductoImpuesto;
	//public JScrollPane jScrollPanelOrderByProductoImpuesto;	
	//protected JButton jButtonCerrarOrderByProductoImpuesto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoImpuestoLogic productoimpuestoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoImpuesto;
	public JScrollPane jScrollPanelDatosEdicionProductoImpuesto;
	public JScrollPane jScrollPanelDatosGeneralProductoImpuesto;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoImpuestoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoImpuesto;
	//public JScrollPane jScrollPanelImportacionProductoImpuesto;
	
	
	
	protected JPanel jPanelAccionesProductoImpuesto;
	
    protected JPanel jPanelPaginacionProductoImpuesto;
    protected JPanel jPanelParametrosReportesProductoImpuesto;
	protected JPanel jPanelParametrosReportesAccionesProductoImpuesto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoImpuesto;
	protected JPanel jPanelParametrosAuxiliar2ProductoImpuesto;
	protected JPanel jPanelParametrosAuxiliar3ProductoImpuesto;
	protected JPanel jPanelParametrosAuxiliar4ProductoImpuesto;
	//protected JPanel jPanelParametrosAuxiliar5ProductoImpuesto;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoImpuesto;
	//protected JPanel jPanelImportacionProductoImpuesto;
	
	
	public JTable jTableDatosProductoImpuesto;
	
	
	
	//public JTable jTableDatosProductoImpuestoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoImpuesto;
	protected JButton jButtonDuplicarProductoImpuesto;
	protected JButton jButtonCopiarProductoImpuesto;
	protected JButton jButtonVerFormProductoImpuesto;
	protected JButton jButtonNuevoRelacionesProductoImpuesto;
	protected JButton jButtonModificarProductoImpuesto;
	
    protected JButton jButtonGuardarCambiosTablaProductoImpuesto;
	protected JButton jButtonCerrarProductoImpuesto;
	
	
	protected JButton jButtonRecargarInformacionProductoImpuesto;
	protected JButton jButtonProcesarInformacionProductoImpuesto;
	
	
	protected JButton jButtonAnterioresProductoImpuesto;
	protected JButton jButtonSiguientesProductoImpuesto;
	protected JButton jButtonNuevoGuardarCambiosProductoImpuesto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoImpuesto;
	//protected JButton jButtonCerrarReporteDinamicoProductoImpuesto;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoImpuesto;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoImpuesto;
	//protected JButton jButtonGenerarImportacionProductoImpuesto;
	//protected JButton jButtonCerrarImportacionProductoImpuesto;
	//protected JFileChooser jFileChooserImportacionProductoImpuesto;
	//protected File fileImportacionProductoImpuesto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoImpuesto;
	protected JButton jButtonDuplicarToolBarProductoImpuesto;
	protected JButton jButtonNuevoRelacionesToolBarProductoImpuesto;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoImpuesto;
	protected JButton jButtonCopiarToolBarProductoImpuesto;
	protected JButton jButtonVerFormToolBarProductoImpuesto;
	public JButton jButtonGuardarCambiosTablaToolBarProductoImpuesto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoImpuesto;
	protected JButton jButtonCerrarToolBarProductoImpuesto;
	
	protected JButton jButtonRecargarInformacionToolBarProductoImpuesto;
	protected JButton jButtonProcesarInformacionToolBarProductoImpuesto;
	protected JButton jButtonAnterioresToolBarProductoImpuesto;
	protected JButton jButtonSiguientesToolBarProductoImpuesto;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoImpuesto;
	protected JButton jButtonAbrirOrderByToolBarProductoImpuesto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoImpuesto;
	protected JMenuItem jMenuItemDuplicarProductoImpuesto;
	protected JMenuItem jMenuItemNuevoRelacionesProductoImpuesto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoImpuesto;
	protected JMenuItem jMenuItemCopiarProductoImpuesto;
	protected JMenuItem jMenuItemVerFormProductoImpuesto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoImpuesto;
	protected JMenuItem jMenuItemCerrarProductoImpuesto;
	protected JMenuItem jMenuItemDetalleCerrarProductoImpuesto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoImpuesto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoImpuesto;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoImpuesto;
	protected JMenuItem jMenuItemProcesarInformacionProductoImpuesto;
	protected JMenuItem jMenuItemAnterioresProductoImpuesto;
	protected JMenuItem jMenuItemSiguientesProductoImpuesto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoImpuesto;
	protected JMenuItem jMenuItemAbrirOrderByProductoImpuesto;
	protected JMenuItem jMenuItemMostrarOcultarProductoImpuesto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoImpuesto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoImpuesto;
	protected JCheckBox jCheckBoxSeleccionadosProductoImpuesto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoImpuesto;
	protected JCheckBox jCheckBoxConGraficoReporteProductoImpuesto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoImpuesto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoImpuesto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoImpuesto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoImpuesto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoImpuesto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoImpuesto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoImpuesto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoImpuesto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoImpuesto;
	protected JTextField jTextFieldValorCampoGeneralProductoImpuesto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoImpuesto;
	//public JList<Reporte> jListColumnasSelectReporteProductoImpuesto;
	//public JScrollPane jScrollColumnasSelectReporteProductoImpuesto;
	
	//public JLabel jLabelRelacionesSelectReporteProductoImpuesto;
	//public JList<Reporte> jListRelacionesSelectReporteProductoImpuesto;
	//public JScrollPane jScrollRelacionesSelectReporteProductoImpuesto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoImpuesto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoImpuesto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoImpuesto;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoImpuesto;
	
		
	//public JLabel jLabelArchivoImportacionProductoImpuesto;	
	//public JLabel jLabelPathArchivoImportacionProductoImpuesto;
	//protected JTextField jTextFieldPathArchivoImportacionProductoImpuesto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoImpuesto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoImpuesto;
	
	//public JLabel jLabelColumnaCategoriaValorProductoImpuesto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoImpuesto;
	
	//public JLabel jLabelColumnasValoresGraficoProductoImpuesto;
	//public JList<Reporte> jListColumnasValoresGraficoProductoImpuesto;
	//public JScrollPane jScrollColumnasValoresGraficoProductoImpuesto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoImpuesto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoImpuesto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoImpuesto;
	public JPanel jPanelFK_IdBodegaProductoImpuesto;
	public JButton jButtonFK_IdBodegaProductoImpuesto;
	public JPanel jPanelFK_IdImpuestoInvenProductoImpuesto;
	public JButton jButtonFK_IdImpuestoInvenProductoImpuesto;
	public JPanel jPanelFK_IdProductoProductoImpuesto;
	public JButton jButtonFK_IdProductoProductoImpuesto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoImpuesto;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoImpuesto;
	public JButton jButtonid_bodegaFK_IdBodegaProductoImpuesto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoImpuestoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto;
	public JLabel jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto;
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto= new JButtonMe();
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_impuesto_invenFK_IdImpuestoInvenProductoImpuestoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoImpuesto;
	public JLabel jLabelid_productoFK_IdProductoProductoImpuesto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoImpuesto;
	public JButton jButtonid_productoFK_IdProductoProductoImpuesto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoImpuestoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoImpuestoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoImpuesto;
	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoImpuestoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoImpuestoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoImpuesto)	{
		this.jButtonRecargarInformacionProductoImpuesto = jButtonRecargarInformacionProductoImpuesto;
	}
	
	public JButton getjButtonProcesarInformacionProductoImpuesto() {
		return this.jButtonProcesarInformacionProductoImpuesto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoImpuesto)	{
		this.jButtonProcesarInformacionProductoImpuesto = jButtonProcesarInformacionProductoImpuesto;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoImpuesto() {
		return this.jButtonRecargarInformacionProductoImpuesto;
	}
	
	
	public List<ProductoImpuesto> getproductoimpuestos() {
		return this.productoimpuestos;
	}

	public void setproductoimpuestos(List<ProductoImpuesto> productoimpuestos) {
		this.productoimpuestos = productoimpuestos;
	}
	
	public List<ProductoImpuesto> getproductoimpuestosAux() {
		return this.productoimpuestosAux;
	}

	public void setproductoimpuestosAux(List<ProductoImpuesto> productoimpuestosAux) {
		this.productoimpuestosAux = productoimpuestosAux;
	}
	
	public List<ProductoImpuesto> getproductoimpuestosEliminados() {
		return this.productoimpuestosEliminados;
	}

	public void setProductoImpuestosEliminados(List<ProductoImpuesto> productoimpuestosEliminados) {
		this.productoimpuestosEliminados = productoimpuestosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoImpuesto() {
		return jComboBoxTiposSeleccionarProductoImpuesto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoImpuesto(
			JComboBox jComboBoxTiposSeleccionarProductoImpuesto) {
		this.jComboBoxTiposSeleccionarProductoImpuesto = jComboBoxTiposSeleccionarProductoImpuesto;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoImpuesto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoImpuesto() {
		return jTextFieldValorCampoGeneralProductoImpuesto;
	}

	public void setjTextFieldValorCampoGeneralProductoImpuesto(
			JTextField jTextFieldValorCampoGeneralProductoImpuesto) {
		this.jTextFieldValorCampoGeneralProductoImpuesto = jTextFieldValorCampoGeneralProductoImpuesto;
	}

	public void setBorderResaltarValorCampoGeneralProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoImpuesto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoImpuesto() {
		return this.jCheckBoxSeleccionarTodosProductoImpuesto;
	}

	public void setjCheckBoxSeleccionarTodosProductoImpuesto(
			JCheckBox jCheckBoxSeleccionarTodosProductoImpuesto) {
		this.jCheckBoxSeleccionarTodosProductoImpuesto = jCheckBoxSeleccionarTodosProductoImpuesto;
	}

	public void setBorderResaltarSeleccionarTodosProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoImpuesto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoImpuesto() {
		return this.jCheckBoxSeleccionadosProductoImpuesto;
	}

	public void setjCheckBoxSeleccionadosProductoImpuesto(
			JCheckBox jCheckBoxSeleccionadosProductoImpuesto) {
		this.jCheckBoxSeleccionadosProductoImpuesto = jCheckBoxSeleccionadosProductoImpuesto;
	}
	
	public void setBorderResaltarSeleccionadosProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoImpuesto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoImpuesto() {
		return this.jComboBoxTiposArchivosReportesProductoImpuesto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoImpuesto(
			JComboBox jComboBoxTiposArchivosReportesProductoImpuesto) {
		this.jComboBoxTiposArchivosReportesProductoImpuesto = jComboBoxTiposArchivosReportesProductoImpuesto;
	}

	public void setBorderResaltarTiposArchivosReportesProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoImpuesto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoImpuesto() {
		return this.jComboBoxTiposReportesProductoImpuesto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoImpuesto(
			JComboBox jComboBoxTiposReportesProductoImpuesto) {
		this.jComboBoxTiposReportesProductoImpuesto = jComboBoxTiposReportesProductoImpuesto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoImpuesto() {
	//	return jComboBoxTiposReportesDinamicoProductoImpuesto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoImpuesto(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoImpuesto) {
	//	this.jComboBoxTiposReportesDinamicoProductoImpuesto = jComboBoxTiposReportesDinamicoProductoImpuesto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoImpuesto() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoImpuesto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoImpuesto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoImpuesto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto = jComboBoxTiposArchivosReportesDinamicoProductoImpuesto;
	//}
	
	public void setBorderResaltarTiposReportesProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoImpuesto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoImpuesto() {
		return this.jComboBoxTiposGraficosReportesProductoImpuesto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoImpuesto(
			JComboBox jComboBoxTiposGraficosReportesProductoImpuesto) {
		this.jComboBoxTiposGraficosReportesProductoImpuesto = jComboBoxTiposGraficosReportesProductoImpuesto;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoImpuesto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoImpuesto() {
		return this.jComboBoxTiposPaginacionProductoImpuesto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoImpuesto(
			JComboBox jComboBoxTiposPaginacionProductoImpuesto) {
		this.jComboBoxTiposPaginacionProductoImpuesto = jComboBoxTiposPaginacionProductoImpuesto;
	}
	
	public void setBorderResaltarTiposPaginacionProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoImpuesto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoImpuesto() {
		return this.jComboBoxTiposRelacionesProductoImpuesto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoImpuesto() {
		return this.jComboBoxTiposAccionesProductoImpuesto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoImpuesto(
			JComboBox jComboBoxTiposRelacionesProductoImpuesto) {
		this.jComboBoxTiposRelacionesProductoImpuesto = jComboBoxTiposRelacionesProductoImpuesto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoImpuesto(
			JComboBox jComboBoxTiposAccionesProductoImpuesto) {
		this.jComboBoxTiposAccionesProductoImpuesto = jComboBoxTiposAccionesProductoImpuesto;
	}
	
	public void setBorderResaltarTiposRelacionesProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoImpuesto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoImpuesto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoImpuesto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoImpuesto() {
	//	return jCheckBoxConGraficoDinamicoProductoImpuesto;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoImpuesto(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoImpuesto) {
	//	this.jCheckBoxConGraficoDinamicoProductoImpuesto = jCheckBoxConGraficoDinamicoProductoImpuesto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoImpuesto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoImpuesto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoImpuesto .setBorder(borderResaltar);		
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
		this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		
		this.productoimpuestoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoimpuestoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoimpuestoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoImpuestoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Impuesto MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoImpuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoImpuesto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"nuevo","nuevo","Nuevo"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"duplicar","duplicar","Duplicar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"copiar","copiar","Copiar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"ver_form","ver_form","Ver"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"recargar","recargar","Recargar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoImpuesto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoImpuesto,this.jTtoolBarProductoImpuesto,
							"cerrar","cerrar","Salir"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoImpuesto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoImpuesto;
			
				this.jButtonProcesarInformacionToolBarProductoImpuesto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoImpuesto;
				
		//protected JButton jButtonModificarToolBarProductoImpuesto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoImpuesto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoImpuesto=new JMenuMe("General");
		this.jmenuArchivoProductoImpuesto=new JMenuMe("Archivo");
		this.jmenuAccionesProductoImpuesto=new JMenuMe("Acciones");
		this.jmenuDatosProductoImpuesto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoImpuesto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoImpuesto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoImpuesto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoImpuesto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoImpuesto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoImpuesto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoImpuesto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoImpuesto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoImpuesto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoImpuesto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoImpuesto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoImpuesto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoImpuesto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoImpuesto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoImpuesto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoImpuesto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoImpuesto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoImpuesto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoImpuesto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoImpuesto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoImpuesto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoImpuesto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoImpuesto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoImpuesto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoImpuesto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoImpuesto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoImpuesto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoImpuesto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoImpuesto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoImpuesto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoImpuesto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoImpuesto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoImpuesto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoImpuesto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoImpuesto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoImpuesto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoImpuesto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoImpuesto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoImpuesto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoImpuesto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoImpuesto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoImpuesto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoImpuesto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoImpuesto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoImpuesto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoImpuesto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoImpuesto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoImpuesto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoImpuesto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoImpuesto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoImpuesto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoImpuesto.add(this.jMenuItemCerrarProductoImpuesto);
			
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemNuevoProductoImpuesto);
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemNuevoGuardarCambiosProductoImpuesto);
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemNuevoRelacionesProductoImpuesto);
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemGuardarCambiosTablaProductoImpuesto);		
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemDuplicarProductoImpuesto);		
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemCopiarProductoImpuesto);		
			this.jmenuAccionesProductoImpuesto.add(this.jMenuItemVerFormProductoImpuesto);		
			
			this.jmenuDatosProductoImpuesto.add(this.jMenuItemRecargarInformacionProductoImpuesto);				
			this.jmenuDatosProductoImpuesto.add(this.jMenuItemAnterioresProductoImpuesto);				
			this.jmenuDatosProductoImpuesto.add(this.jMenuItemSiguientesProductoImpuesto);				
			this.jmenuDatosProductoImpuesto.add(this.jMenuItemAbrirOrderByProductoImpuesto);				
			this.jmenuDatosProductoImpuesto.add(this.jMenuItemMostrarOcultarProductoImpuesto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoImpuesto.add(this.jMenuItemGuardarCambiosProductoImpuesto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoImpuesto.add(this.jmenuArchivoProductoImpuesto);		
			this.jmenuBarProductoImpuesto.add(this.jmenuAccionesProductoImpuesto);		
			this.jmenuBarProductoImpuesto.add(this.jmenuDatosProductoImpuesto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoImpuesto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoImpuesto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoImpuesto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoImpuesto= new JButtonMe();
		this.jButtonFK_IdBodegaProductoImpuesto.setText("Buscar");
		this.jButtonFK_IdBodegaProductoImpuesto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoImpuesto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoImpuesto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoImpuesto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoImpuesto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoImpuesto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdImpuestoInvenProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdImpuestoInvenProductoImpuesto.setToolTipText("Buscar Por Impuesto Inven ");
		this.jButtonFK_IdImpuestoInvenProductoImpuesto= new JButtonMe();
		this.jButtonFK_IdImpuestoInvenProductoImpuesto.setText("Buscar");
		this.jButtonFK_IdImpuestoInvenProductoImpuesto.setToolTipText("Buscar Por Impuesto Inven ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdImpuestoInvenProductoImpuesto,"buscar_button","Buscar Por Impuesto Inven ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdImpuestoInvenProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto = new JLabelMe();
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setText("Impuesto Inven :");
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setToolTipText("Impuesto Inven");
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto= new JComboBoxMe();
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoImpuesto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoImpuesto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoImpuesto= new JButtonMe();
		this.jButtonFK_IdProductoProductoImpuesto.setText("Buscar");
		this.jButtonFK_IdProductoProductoImpuesto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoImpuesto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoImpuesto = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoImpuesto.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoImpuesto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoImpuesto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.setFocusable(false);


		this.jTabbedPaneBusquedasProductoImpuesto=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoImpuesto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoImpuesto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoImpuesto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoImpuesto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoImpuesto = new ProductoImpuestoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Impuesto DATOS");
			this.jInternalFrameDetalleFormProductoImpuesto = new ProductoImpuestoDetalleFormJInternalFrame(jDesktopPane,this.productoimpuestoSessionBean.getConGuardarRelaciones(),this.productoimpuestoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoImpuesto = null;//new ProductoImpuestoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoImpuesto= new GridBagLayout();
		
		
		this.jTableDatosProductoImpuesto = new JTableMe();      
		
		String sToolTipProductoImpuesto="";
		sToolTipProductoImpuesto=ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoImpuesto+="(Inventario.ProductoImpuesto)";
		}
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoImpuesto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoImpuesto.setToolTipText(sToolTipProductoImpuesto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoImpuesto);
		this.jTableDatosProductoImpuesto.setAutoCreateRowSorter(true);
		this.jTableDatosProductoImpuesto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoImpuesto.setRowSelectionAllowed(true);
		this.jTableDatosProductoImpuesto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoImpuesto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoImpuesto = new JButtonMe();
		this.jButtonDuplicarProductoImpuesto = new JButtonMe();
		this.jButtonCopiarProductoImpuesto = new JButtonMe();
		this.jButtonVerFormProductoImpuesto = new JButtonMe();
		this.jButtonNuevoRelacionesProductoImpuesto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoImpuesto = new JButtonMe();
		this.jButtonCerrarProductoImpuesto = new JButtonMe();
		
		this.jScrollPanelDatosProductoImpuesto = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoImpuesto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Impuesto";
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoImpuesto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoImpuesto.setToolTipText("Acciones");
        this.jPanelAccionesProductoImpuesto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoImpuesto=new ReporteDinamicoJInternalFrame(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoImpuesto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoImpuesto=new ImportacionJInternalFrame(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoImpuesto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoImpuesto = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoImpuesto.setText("Orden");
		this.jButtonAbrirOrderByProductoImpuesto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoImpuesto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoImpuesto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoImpuesto,false,this);
			
			//this.cargarOrderByProductoImpuesto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoImpuesto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoImpuesto,true,this);
			
			//this.cargarOrderByProductoImpuesto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoImpuesto.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosProductoImpuesto.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosProductoImpuesto.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosProductoImpuesto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoImpuesto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoImpuesto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoImpuesto.setText("Nuevo");
		this.jButtonDuplicarProductoImpuesto.setText("Duplicar");
		this.jButtonCopiarProductoImpuesto.setText("Copiar");
		this.jButtonVerFormProductoImpuesto.setText("Ver");
		this.jButtonNuevoRelacionesProductoImpuesto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.setText("Guardar");
		this.jButtonCerrarProductoImpuesto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoImpuesto,"nuevo_button","Nuevo",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoImpuesto,"duplicar_button","Duplicar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoImpuesto,"copiar_button","Copiar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoImpuesto,"ver_form","Ver",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoImpuesto,"nuevorelaciones_button","Nuevo Rel",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoImpuesto,"guardarcambiostabla_button","Guardar",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoImpuesto,"cerrar_button","Salir",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoImpuesto.setToolTipText("Nuevo"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoImpuesto.setToolTipText("Duplicar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoImpuesto.setToolTipText("Copiar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoImpuesto.setToolTipText("Ver"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoImpuesto.setToolTipText("Nuevo Rel"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.setToolTipText("Guardar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoImpuesto.setToolTipText("Salir"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoImpuesto";
		inputMap = this.jButtonNuevoProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoImpuesto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoImpuesto"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoImpuesto";
		inputMap = this.jButtonDuplicarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoImpuesto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoImpuesto"));
		
		//COPIAR
		sMapKey = "CopiarProductoImpuesto";
		inputMap = this.jButtonCopiarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoImpuesto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoImpuesto"));
		
		//VEr FORM
		sMapKey = "VerFormProductoImpuesto";
		inputMap = this.jButtonVerFormProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoImpuesto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoImpuesto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoImpuesto";
		inputMap = this.jButtonNuevoRelacionesProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoImpuesto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoImpuesto";
		inputMap = this.jButtonModificarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoImpuesto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoImpuesto";
		inputMap = this.jButtonCerrarProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoImpuesto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoImpuesto";
		inputMap = this.jButtonGuardarCambiosTablaProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoImpuesto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoImpuesto.setName("jPanelParametrosReportesProductoImpuesto"); 
		
		this.jPanelParametrosReportesAccionesProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoImpuesto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoImpuesto.setName("jPanelParametrosReportesAccionesProductoImpuesto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoImpuesto = new JButtonMe();
		this.jButtonRecargarInformacionProductoImpuesto.setText("Recargar");
		this.jButtonRecargarInformacionProductoImpuesto.setToolTipText("Recargar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoImpuesto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoImpuesto = new JButtonMe();
		this.jButtonProcesarInformacionProductoImpuesto.setText("Procesar");
		this.jButtonProcesarInformacionProductoImpuesto.setToolTipText("Procesar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoImpuesto.setVisible(false);
			
		this.jButtonProcesarInformacionProductoImpuesto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoImpuesto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoImpuesto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoImpuesto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoImpuesto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoImpuesto.setText("TIPO");       
		this.jComboBoxTiposReportesProductoImpuesto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoImpuesto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoImpuesto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoImpuesto.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoImpuesto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoImpuesto.setText("Accion");
		this.jComboBoxTiposRelacionesProductoImpuesto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoImpuesto.setText("Accion");
		this.jComboBoxTiposAccionesProductoImpuesto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoImpuesto.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoImpuesto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoImpuesto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoImpuesto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoImpuesto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoImpuesto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoImpuesto = new JLabelMe();
		
		this.jLabelAccionesProductoImpuesto.setText("Acciones");		
		this.jLabelAccionesProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoImpuesto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoImpuesto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoImpuesto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoImpuesto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoImpuesto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoImpuesto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoImpuesto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoImpuesto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoImpuesto.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoImpuesto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoImpuesto = new JButtonMe();
		//this.jButtonAnterioresProductoImpuesto.setText("<<");
        this.jButtonAnterioresProductoImpuesto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoImpuesto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoImpuesto = new JButtonMe();
		//this.jButtonSiguientesProductoImpuesto.setText(">>");
        this.jButtonSiguientesProductoImpuesto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoImpuesto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoImpuesto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoImpuesto.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoImpuesto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoImpuesto,"nuevoguardarcambios_button","Nue",this.productoimpuestoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoImpuesto";
		inputMap = this.jButtonNuevoGuardarCambiosProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoImpuesto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoImpuesto";
		inputMap = this.jButtonRecargarInformacionProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoImpuesto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoImpuesto";
		inputMap = this.jButtonSiguientesProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoImpuesto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoImpuesto";
		inputMap = this.jButtonAnterioresProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoImpuesto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoImpuesto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoImpuesto.setMinimumSize(new Dimension(this.getWidth(),ProductoImpuestoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoImpuestoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoImpuesto.setMaximumSize(new Dimension(this.getWidth(),ProductoImpuestoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoImpuestoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoImpuesto.setPreferredSize(new Dimension(this.getWidth(),ProductoImpuestoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoImpuestoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoImpuesto = new GridBagLayout();

			this.jPanelPaginacionProductoImpuesto.setLayout(gridaBagLayoutPaginacionProductoImpuesto);						
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 0;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonAnterioresProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					
						
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoImpuesto.gridy = 0;
			
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonNuevoGuardarCambiosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
						
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoImpuesto.gridy = 0;
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonSiguientesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 1;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonNuevoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
						
			
			
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
				this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoImpuesto.gridy = 1;
				this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoImpuesto.add(this.jButtonGuardarCambiosTablaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			}
			
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 1;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonDuplicarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 1;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonCopiarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 1;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonVerFormProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 1;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoImpuesto.add(this.jButtonCerrarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		
		this.jButtonRecargarInformacionProductoImpuesto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoImpuesto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoImpuesto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoImpuesto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoImpuesto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoImpuesto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoImpuesto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoImpuesto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoImpuesto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoImpuesto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoImpuesto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoImpuesto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoImpuesto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoImpuesto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoImpuesto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoImpuesto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoImpuesto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoImpuesto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoImpuesto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoImpuesto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoImpuesto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoImpuesto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoImpuesto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoImpuesto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoImpuesto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoImpuesto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoImpuesto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoImpuesto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoImpuesto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoImpuesto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoImpuesto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoImpuesto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoImpuesto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoImpuesto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoImpuesto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoImpuesto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoImpuesto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoImpuesto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoImpuesto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoImpuesto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoImpuesto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoImpuesto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoImpuesto.setLayout(gridaBagParametrosReportesProductoImpuesto);
			this.jPanelParametrosReportesAccionesProductoImpuesto.setLayout(gridaBagParametrosReportesAccionesProductoImpuesto);
			
			
			this.jPanelParametrosAuxiliar1ProductoImpuesto.setLayout(gridaBagParametrosAuxiliar1ProductoImpuesto);
			this.jPanelParametrosAuxiliar2ProductoImpuesto.setLayout(gridaBagParametrosAuxiliar2ProductoImpuesto);
			this.jPanelParametrosAuxiliar3ProductoImpuesto.setLayout(gridaBagParametrosAuxiliar3ProductoImpuesto);
			this.jPanelParametrosAuxiliar4ProductoImpuesto.setLayout(gridaBagParametrosAuxiliar4ProductoImpuesto);
			//this.jPanelParametrosAuxiliar5ProductoImpuesto.setLayout(gridaBagParametrosAuxiliar2ProductoImpuesto);			
			
			
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoImpuesto.add(this.jButtonRecargarInformacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoImpuesto.add(this.jComboBoxTiposPaginacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoImpuesto.add(this.jCheckBoxConAltoMaximoTablaProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoImpuesto.add(this.jComboBoxTiposArchivosReportesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoImpuesto.add(this.jPanelParametrosAuxiliar1ProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoImpuesto.add(this.jComboBoxTiposReportesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);																		
			
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoImpuesto.add(this.jComboBoxTiposGraficosReportesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoImpuesto.add(this.jPanelParametrosAuxiliar4ProductoImpuesto, this.gridBagConstraintsProductoImpuesto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoImpuesto.add(this.jComboBoxTiposReportesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoImpuesto.add(this.jCheckBoxGenerarReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoImpuesto.add(this.jPanelParametrosAuxiliar2ProductoImpuesto, this.gridBagConstraintsProductoImpuesto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoImpuesto.add(this.jLabelAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
				this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoImpuesto.add(this.jButtonAbrirOrderByProductoImpuesto, this.gridBagConstraintsProductoImpuesto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoImpuesto.add(this.jComboBoxTiposSeleccionarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			
			
			/*
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoImpuesto.add(this.jCheckBoxSeleccionarTodosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoImpuesto.add(this.jCheckBoxConGraficoReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoImpuesto.add(this.jCheckBoxSeleccionarTodosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);															
				
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoImpuesto.add(this.jCheckBoxSeleccionadosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);															
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoImpuesto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoImpuesto.add(this.jCheckBoxConGraficoReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoImpuesto.add(this.jPanelParametrosAuxiliar3ProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoImpuesto.add(this.jComboBoxTiposAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
	
				
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoImpuesto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoImpuesto.add(this.jTextFieldValorCampoGeneralProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoImpuesto = new GridBagLayout();

			this.jScrollPanelDatosProductoImpuesto.setLayout(gridaBagLayoutDatosProductoImpuesto);
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = 0;
			this.gridBagConstraintsProductoImpuesto.gridx = 0;
			
			this.jScrollPanelDatosProductoImpuesto.add(this.jTableDatosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoImpuesto.setViewportView(this.jTableDatosProductoImpuesto);
		this.jTableDatosProductoImpuesto.setFillsViewportHeight(true);
		this.jTableDatosProductoImpuesto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoImpuesto= new GridBagLayout();
		this.jPanelAccionesProductoImpuesto.setLayout(gridaBagLayoutAccionesProductoImpuesto);
		
		
		/*	
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = 0;
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
			
		this.jPanelAccionesProductoImpuesto.add(this.jButtonNuevoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoImpuesto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoImpuesto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoImpuesto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoImpuesto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoImpuesto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoImpuesto.setLayout(gridaBagLayoutFK_IdBodegaProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 0;
		jPanelFK_IdBodegaProductoImpuesto.add(jLabelid_bodegaFK_IdBodegaProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 1;
		jPanelFK_IdBodegaProductoImpuesto.add(jComboBoxid_bodegaFK_IdBodegaProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 1;
		gridBagConstraintsProductoImpuesto.gridx =1;
		jPanelFK_IdBodegaProductoImpuesto.add(jButtonFK_IdBodegaProductoImpuesto, gridBagConstraintsProductoImpuesto);

		jTabbedPaneBusquedasProductoImpuesto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoImpuesto);
		jTabbedPaneBusquedasProductoImpuesto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto= new GridBagLayout();
		gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdImpuestoInvenProductoImpuesto.setLayout(gridaBagLayoutFK_IdImpuestoInvenProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 0;
		jPanelFK_IdImpuestoInvenProductoImpuesto.add(jLabelid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 1;
		jPanelFK_IdImpuestoInvenProductoImpuesto.add(jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 1;
		gridBagConstraintsProductoImpuesto.gridx =1;
		jPanelFK_IdImpuestoInvenProductoImpuesto.add(jButtonFK_IdImpuestoInvenProductoImpuesto, gridBagConstraintsProductoImpuesto);

		jTabbedPaneBusquedasProductoImpuesto.addTab("2.-Por Impuesto Inven ", jPanelFK_IdImpuestoInvenProductoImpuesto);
		jTabbedPaneBusquedasProductoImpuesto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoImpuesto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoImpuesto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoImpuesto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoImpuesto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoImpuesto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoImpuesto.setLayout(gridaBagLayoutFK_IdProductoProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 0;
		jPanelFK_IdProductoProductoImpuesto.add(jLabelid_productoFK_IdProductoProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 1;
		jPanelFK_IdProductoProductoImpuesto.add(jComboBoxid_productoFK_IdProductoProductoImpuesto, gridBagConstraintsProductoImpuesto);


		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoImpuesto.gridy = 0;
		gridBagConstraintsProductoImpuesto.gridx = 0;
		jPanelFK_IdProductoProductoImpuesto.add(this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto, gridBagConstraintsProductoImpuesto);

		gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoImpuesto.gridy = 1;
		gridBagConstraintsProductoImpuesto.gridx =1;
		jPanelFK_IdProductoProductoImpuesto.add(jButtonFK_IdProductoProductoImpuesto, gridBagConstraintsProductoImpuesto);

		jTabbedPaneBusquedasProductoImpuesto.addTab("3.-Por Producto ", jPanelFK_IdProductoProductoImpuesto);
		jTabbedPaneBusquedasProductoImpuesto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoImpuesto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoImpuesto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();						
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoImpuesto.gridx = 0;		
			//this.gridBagConstraintsProductoImpuesto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoImpuesto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoImpuesto, this.gridBagConstraintsProductoImpuesto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoImpuesto.gridx = 0;		
		//this.gridBagConstraintsProductoImpuesto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoImpuesto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoImpuesto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoImpuesto.gridx = 0;		
			this.gridBagConstraintsProductoImpuesto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoImpuesto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoImpuesto, this.gridBagConstraintsProductoImpuesto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);								
		
		
		/*
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		*/		
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoImpuesto.gridx =0;
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoImpuesto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
				
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoImpuesto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoImpuesto = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoImpuesto.setLayout(gridaBagLayoutBusquedasParametrosProductoImpuesto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoImpuesto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoImpuesto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoImpuesto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoImpuesto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
			
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoImpuesto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoImpuesto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoImpuesto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoImpuesto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoImpuesto.setName("jPanelReporteDinamicoProductoImpuesto"); 
		
		this.jPanelReporteDinamicoProductoImpuesto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoImpuesto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoImpuesto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoImpuesto.setLayout(gridaBagLayoutReporteDinamicoProductoImpuesto);
		
		
		this.jInternalFrameReporteDinamicoProductoImpuesto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoImpuesto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoImpuesto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoImpuesto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoImpuesto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoImpuesto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoImpuesto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoImpuesto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoImpuesto.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoImpuesto.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoImpuesto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoImpuesto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoImpuesto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoImpuesto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoImpuesto = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoImpuesto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelColumnasSelectReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoImpuesto = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoImpuesto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoImpuesto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoImpuesto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoImpuesto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoImpuesto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoImpuesto=new JScrollPane(this.jListColumnasSelectReporteProductoImpuesto);
			
			this.jScrollColumnasSelectReporteProductoImpuesto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoImpuesto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoImpuesto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoImpuesto.add(this.jListColumnasSelectReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jScrollColumnasSelectReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoImpuesto = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoImpuesto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoImpuesto = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoImpuesto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoImpuesto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoImpuesto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoImpuesto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoImpuesto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoImpuesto=new JScrollPane(this.jListRelacionesSelectReporteProductoImpuesto);
			
			this.jScrollRelacionesSelectReporteProductoImpuesto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoImpuesto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoImpuesto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoImpuesto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoImpuesto = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoImpuesto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoImpuesto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoImpuesto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoImpuesto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoImpuesto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoImpuesto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoImpuesto = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoImpuesto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelConGraficoDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoImpuesto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoImpuesto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoImpuesto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoImpuesto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoImpuesto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoImpuesto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jCheckBoxConGraficoDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoImpuesto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoImpuesto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelColumnaCategoriaGraficoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jComboBoxColumnaCategoriaGraficoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoImpuesto = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoImpuesto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelColumnaCategoriaValorProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoImpuesto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoImpuesto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoImpuesto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoImpuesto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoImpuesto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jComboBoxColumnaCategoriaValorProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoImpuesto = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoImpuesto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelColumnasValoresGraficoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoImpuesto = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoImpuesto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoImpuesto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoImpuesto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoImpuesto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoImpuesto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoImpuesto=new JScrollPane(this.jListColumnasValoresGraficoProductoImpuesto);
			
			this.jScrollColumnasValoresGraficoProductoImpuesto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoImpuesto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoImpuesto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoImpuesto.add(this.jListColumnasSelectReporteProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jScrollColumnasValoresGraficoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoImpuesto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoImpuesto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelTiposGraficosReportesDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoImpuesto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jComboBoxTiposGraficosReportesDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoImpuesto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoImpuesto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelGenerarExcelReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoImpuesto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoImpuesto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoImpuesto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoImpuesto.setToolTipText("Generar EXCEL"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		//this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoImpuesto.add(this.jButtonGenerarExcelReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jComboBoxTiposReportesDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoImpuesto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoImpuesto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jLabelTiposArchivoReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jComboBoxTiposArchivosReportesDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoImpuesto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoImpuesto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoImpuesto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoImpuesto.setToolTipText("Generar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jButtonGenerarReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoImpuesto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoImpuesto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoImpuesto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoImpuesto.setToolTipText("Cancelar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoImpuesto.add(this.jButtonCerrarReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoImpuesto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoImpuesto= new JScrollPane(jPanelReporteDinamicoProductoImpuesto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoImpuesto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoImpuesto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoImpuesto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoImpuesto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoImpuesto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoImpuesto);
		this.jInternalFrameReporteDinamicoProductoImpuesto.getContentPane().add(this.jScrollPanelReporteDinamicoProductoImpuesto, this.gridBagConstraintsProductoImpuesto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoImpuesto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoImpuesto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoImpuesto.setName("jPanelImportacionProductoImpuesto"); 
		
		this.jPanelImportacionProductoImpuesto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoImpuesto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoImpuesto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoImpuesto.setLayout(gridaBagLayoutImportacionProductoImpuesto);
		
		
		this.jInternalFrameImportacionProductoImpuesto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoImpuesto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoImpuesto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoImpuesto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoImpuesto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoImpuesto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoImpuesto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoImpuesto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoImpuesto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoImpuesto.setResizable(true);
	    this.jInternalFrameImportacionProductoImpuesto.setClosable(true);
	    this.jInternalFrameImportacionProductoImpuesto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoImpuesto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoImpuesto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoImpuesto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoImpuesto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoImpuesto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoImpuesto.setResizable(true);
	    this.jInternalFrameImportacionProductoImpuesto.setClosable(true);
	    this.jInternalFrameImportacionProductoImpuesto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoImpuesto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoImpuesto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoImpuesto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoImpuesto = new JLabelMe();

		this.jLabelArchivoImportacionProductoImpuesto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoImpuesto.add(this.jLabelArchivoImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoImpuesto = new JFileChooser();		
		this.jFileChooserImportacionProductoImpuesto.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoImpuesto = new JButtonMe();
		this.jButtonAbrirImportacionProductoImpuesto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoImpuesto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoImpuesto.setToolTipText("Generar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoImpuesto.add(this.jButtonAbrirImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoImpuesto = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoImpuesto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoImpuesto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoImpuesto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoImpuesto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoImpuesto.add(this.jLabelPathArchivoImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoImpuesto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoImpuesto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoImpuesto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoImpuesto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoImpuesto.add(this.jTextFieldPathArchivoImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoImpuesto = new JButtonMe();
		this.jButtonGenerarImportacionProductoImpuesto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoImpuesto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoImpuesto.setToolTipText("Generar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoImpuesto.add(this.jButtonGenerarImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoImpuesto = new JButtonMe();
		this.jButtonCerrarImportacionProductoImpuesto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoImpuesto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoImpuesto.setToolTipText("Cancelar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoImpuesto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoImpuesto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoImpuesto.add(this.jButtonCerrarImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoImpuesto = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoImpuesto= new JScrollPane(jPanelImportacionProductoImpuesto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
		this.gridBagConstraintsProductoImpuesto.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoImpuesto.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoImpuesto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoImpuesto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoImpuesto);
		this.jInternalFrameImportacionProductoImpuesto.getContentPane().add(this.jScrollPanelImportacionProductoImpuesto, this.gridBagConstraintsProductoImpuesto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoImpuesto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoImpuesto = new JButtonMe();
			this.jButtonAbrirOrderByProductoImpuesto.setText("Orden");
			this.jButtonAbrirOrderByProductoImpuesto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoImpuesto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoImpuesto";
			inputMap = this.jButtonAbrirOrderByProductoImpuesto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoImpuesto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoImpuesto"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoImpuesto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoImpuesto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoImpuesto.setName("jPanelOrderByProductoImpuesto"); 
			
			this.jPanelOrderByProductoImpuesto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoImpuesto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoImpuesto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoImpuesto.setLayout(gridaBagLayoutOrderByProductoImpuesto);
			
			
			this.jTableDatosProductoImpuestoOrderBy = new JTableMe();        
			this.jTableDatosProductoImpuestoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoImpuestoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoImpuestoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoImpuestoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoImpuestoOrderBy.setViewportView(this.jTableDatosProductoImpuestoOrderBy);
			this.jTableDatosProductoImpuestoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoImpuestoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoImpuesto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoImpuesto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoImpuesto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoImpuesto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoImpuesto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoImpuesto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoImpuesto.setTitle("Orden");
			this.jInternalFrameOrderByProductoImpuesto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoImpuesto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoImpuesto.setResizable(true);
			this.jInternalFrameOrderByProductoImpuesto.setClosable(true);
			this.jInternalFrameOrderByProductoImpuesto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoImpuesto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoImpuesto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoImpuesto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Impuestos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoImpuesto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoImpuesto.ipady =150;
				
			this.jPanelOrderByProductoImpuesto.add(jScrollPanelDatosProductoImpuestoOrderBy, this.gridBagConstraintsProductoImpuesto);//this.jTableDatosProductoImpuestoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoImpuesto = new JButtonMe();
			this.jButtonCerrarOrderByProductoImpuesto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoImpuesto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoImpuesto.setToolTipText("Cancelar"+" "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoImpuesto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoImpuesto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoImpuesto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoImpuesto.add(this.jButtonCerrarOrderByProductoImpuesto, this.gridBagConstraintsProductoImpuesto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoImpuesto = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoImpuesto= new JScrollPane(jPanelOrderByProductoImpuesto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoImpuesto = new GridBagConstraints();
			this.gridBagConstraintsProductoImpuesto.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoImpuesto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoImpuesto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoImpuesto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoImpuesto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoImpuesto);
			
			this.jInternalFrameOrderByProductoImpuesto.getContentPane().add(this.jScrollPanelOrderByProductoImpuesto, this.gridBagConstraintsProductoImpuesto);			
		
		} else {
			this.jButtonAbrirOrderByProductoImpuesto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoimpuestoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoImpuesto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoImpuesto.getRowHeight();//ProductoImpuestoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoImpuesto.isSelected()) {
					iHeightTable=ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoImpuesto.isSelected()) {
					iHeightTable=ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoImpuestoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoImpuesto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoImpuesto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoImpuesto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoImpuesto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoImpuesto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoImpuesto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoImpuesto!=null && this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy()!=null) {
			//if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoImpuesto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoImpuesto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoImpuesto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoImpuesto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoImpuesto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoImpuesto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoimpuestoLogic.getProductoImpuestos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoimpuestos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoImpuesto> TraerProductoImpuestoBeans(List<ProductoImpuesto> productoimpuestos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoImpuesto productoimpuesto:productoimpuestos) {
					
				if(!(ProductoImpuestoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoImpuestoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoimpuesto.setsDetalleGeneralEntityReporte(ProductoImpuestoConstantesFunciones.getProductoImpuestoDescripcion(productoimpuesto));
										
						
					
						
					
				} else  {
							
					//productoimpuesto.setsDetalleGeneralEntityReporte(productoimpuesto.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoimpuestobeans.add(productoimpuestobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoimpuestos;
    }
	//PARA REPORTES FIN
}
