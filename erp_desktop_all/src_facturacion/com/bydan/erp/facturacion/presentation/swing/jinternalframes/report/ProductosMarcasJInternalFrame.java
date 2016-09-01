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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProductosMarcasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProductosMarcasJInternalFrame extends ProductosMarcasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosMarcas;
	
	protected JMenuBar jmenuBarProductosMarcas;
	
	protected JMenu jmenuProductosMarcas;
	protected JMenu jmenuDatosProductosMarcas;
	protected JMenu jmenuArchivoProductosMarcas;
	protected JMenu jmenuAccionesProductosMarcas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosMarcas;	
	protected GridBagConstraints gridBagConstraintsProductosMarcas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosMarcasDetalleFormJInternalFrame jInternalFrameDetalleFormProductosMarcas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosMarcas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosMarcas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductosMarcasSessionBean productosmarcasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosMarcas> productosmarcass;		
	public List<ProductosMarcas> productosmarcassEliminados;	
	public List<ProductosMarcas> productosmarcassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosMarcas;		
	protected JButton jButtonAbrirOrderByProductosMarcas;
	
	
	//protected JPanel jPanelOrderByProductosMarcas;
	//public JScrollPane jScrollPanelOrderByProductosMarcas;	
	//protected JButton jButtonCerrarOrderByProductosMarcas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosMarcasLogic productosmarcasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosMarcas;
	public JScrollPane jScrollPanelDatosEdicionProductosMarcas;
	public JScrollPane jScrollPanelDatosGeneralProductosMarcas;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosMarcasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosMarcas;
	//public JScrollPane jScrollPanelImportacionProductosMarcas;
	
	
	
	protected JPanel jPanelAccionesProductosMarcas;
	
    protected JPanel jPanelPaginacionProductosMarcas;
    protected JPanel jPanelParametrosReportesProductosMarcas;
	protected JPanel jPanelParametrosReportesAccionesProductosMarcas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosMarcas;
	protected JPanel jPanelParametrosAuxiliar2ProductosMarcas;
	protected JPanel jPanelParametrosAuxiliar3ProductosMarcas;
	protected JPanel jPanelParametrosAuxiliar4ProductosMarcas;
	//protected JPanel jPanelParametrosAuxiliar5ProductosMarcas;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosMarcas;
	//protected JPanel jPanelImportacionProductosMarcas;
	
	
	public JTable jTableDatosProductosMarcas;
	
	
	
	//public JTable jTableDatosProductosMarcasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosMarcas;
	protected JButton jButtonDuplicarProductosMarcas;
	protected JButton jButtonCopiarProductosMarcas;
	protected JButton jButtonVerFormProductosMarcas;
	protected JButton jButtonNuevoRelacionesProductosMarcas;
	protected JButton jButtonModificarProductosMarcas;
	
    protected JButton jButtonGuardarCambiosTablaProductosMarcas;
	protected JButton jButtonCerrarProductosMarcas;
	
	
	protected JButton jButtonRecargarInformacionProductosMarcas;
	protected JButton jButtonProcesarInformacionProductosMarcas;
	
	
	protected JButton jButtonAnterioresProductosMarcas;
	protected JButton jButtonSiguientesProductosMarcas;
	protected JButton jButtonNuevoGuardarCambiosProductosMarcas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosMarcas;
	//protected JButton jButtonCerrarReporteDinamicoProductosMarcas;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosMarcas;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosMarcas;
	//protected JButton jButtonGenerarImportacionProductosMarcas;
	//protected JButton jButtonCerrarImportacionProductosMarcas;
	//protected JFileChooser jFileChooserImportacionProductosMarcas;
	//protected File fileImportacionProductosMarcas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosMarcas;
	protected JButton jButtonDuplicarToolBarProductosMarcas;
	protected JButton jButtonNuevoRelacionesToolBarProductosMarcas;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosMarcas;
	protected JButton jButtonCopiarToolBarProductosMarcas;
	protected JButton jButtonVerFormToolBarProductosMarcas;
	public JButton jButtonGuardarCambiosTablaToolBarProductosMarcas;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosMarcas;
	protected JButton jButtonCerrarToolBarProductosMarcas;
	
	protected JButton jButtonRecargarInformacionToolBarProductosMarcas;
	protected JButton jButtonProcesarInformacionToolBarProductosMarcas;
	protected JButton jButtonAnterioresToolBarProductosMarcas;
	protected JButton jButtonSiguientesToolBarProductosMarcas;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosMarcas;
	protected JButton jButtonAbrirOrderByToolBarProductosMarcas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosMarcas;
	protected JMenuItem jMenuItemDuplicarProductosMarcas;
	protected JMenuItem jMenuItemNuevoRelacionesProductosMarcas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosMarcas;
	protected JMenuItem jMenuItemCopiarProductosMarcas;
	protected JMenuItem jMenuItemVerFormProductosMarcas;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosMarcas;
	protected JMenuItem jMenuItemCerrarProductosMarcas;
	protected JMenuItem jMenuItemDetalleCerrarProductosMarcas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosMarcas;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosMarcas;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosMarcas;
	protected JMenuItem jMenuItemProcesarInformacionProductosMarcas;
	protected JMenuItem jMenuItemAnterioresProductosMarcas;
	protected JMenuItem jMenuItemSiguientesProductosMarcas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosMarcas;
	protected JMenuItem jMenuItemAbrirOrderByProductosMarcas;
	protected JMenuItem jMenuItemMostrarOcultarProductosMarcas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosMarcas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosMarcas;
	protected JCheckBox jCheckBoxSeleccionadosProductosMarcas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosMarcas;
	protected JCheckBox jCheckBoxConGraficoReporteProductosMarcas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosMarcas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosMarcas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosMarcas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosMarcas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosMarcas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosMarcas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosMarcas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosMarcas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosMarcas;
	protected JTextField jTextFieldValorCampoGeneralProductosMarcas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosMarcas;
	//public JList<Reporte> jListColumnasSelectReporteProductosMarcas;
	//public JScrollPane jScrollColumnasSelectReporteProductosMarcas;
	
	//public JLabel jLabelRelacionesSelectReporteProductosMarcas;
	//public JList<Reporte> jListRelacionesSelectReporteProductosMarcas;
	//public JScrollPane jScrollRelacionesSelectReporteProductosMarcas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosMarcas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosMarcas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosMarcas;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosMarcas;
	
		
	//public JLabel jLabelArchivoImportacionProductosMarcas;	
	//public JLabel jLabelPathArchivoImportacionProductosMarcas;
	//protected JTextField jTextFieldPathArchivoImportacionProductosMarcas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosMarcas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosMarcas;
	
	//public JLabel jLabelColumnaCategoriaValorProductosMarcas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosMarcas;
	
	//public JLabel jLabelColumnasValoresGraficoProductosMarcas;
	//public JList<Reporte> jListColumnasValoresGraficoProductosMarcas;
	//public JScrollPane jScrollColumnasValoresGraficoProductosMarcas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosMarcas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosMarcas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosMarcas;
	public JPanel jPanelBusquedaProductosMarcasProductosMarcas;
	public JButton jButtonBusquedaProductosMarcasProductosMarcas;
	
	public JPanel jPanelid_productoBusquedaProductosMarcasProductosMarcas;
	public JLabel jLabelid_productoBusquedaProductosMarcasProductosMarcas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProductosMarcasProductosMarcas;
	public JButton jButtonid_productoBusquedaProductosMarcasProductosMarcas= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosMarcasProductosMarcasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosMarcasProductosMarcasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas;
	public JLabel jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas;
	public JButton jButtonfecha_emision_desdeBusquedaProductosMarcasProductosMarcasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas;
	public JLabel jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas;
	public JButton jButtonfecha_emision_hastaBusquedaProductosMarcasProductosMarcasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosMarcasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosMarcasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosMarcas)	{
		this.jButtonRecargarInformacionProductosMarcas = jButtonRecargarInformacionProductosMarcas;
	}
	
	public JButton getjButtonProcesarInformacionProductosMarcas() {
		return this.jButtonProcesarInformacionProductosMarcas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosMarcas)	{
		this.jButtonProcesarInformacionProductosMarcas = jButtonProcesarInformacionProductosMarcas;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosMarcas() {
		return this.jButtonRecargarInformacionProductosMarcas;
	}
	
	
	public List<ProductosMarcas> getproductosmarcass() {
		return this.productosmarcass;
	}

	public void setproductosmarcass(List<ProductosMarcas> productosmarcass) {
		this.productosmarcass = productosmarcass;
	}
	
	public List<ProductosMarcas> getproductosmarcassAux() {
		return this.productosmarcassAux;
	}

	public void setproductosmarcassAux(List<ProductosMarcas> productosmarcassAux) {
		this.productosmarcassAux = productosmarcassAux;
	}
	
	public List<ProductosMarcas> getproductosmarcassEliminados() {
		return this.productosmarcassEliminados;
	}

	public void setProductosMarcassEliminados(List<ProductosMarcas> productosmarcassEliminados) {
		this.productosmarcassEliminados = productosmarcassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosMarcas() {
		return jComboBoxTiposSeleccionarProductosMarcas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosMarcas(
			JComboBox jComboBoxTiposSeleccionarProductosMarcas) {
		this.jComboBoxTiposSeleccionarProductosMarcas = jComboBoxTiposSeleccionarProductosMarcas;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosMarcas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosMarcas() {
		return jTextFieldValorCampoGeneralProductosMarcas;
	}

	public void setjTextFieldValorCampoGeneralProductosMarcas(
			JTextField jTextFieldValorCampoGeneralProductosMarcas) {
		this.jTextFieldValorCampoGeneralProductosMarcas = jTextFieldValorCampoGeneralProductosMarcas;
	}

	public void setBorderResaltarValorCampoGeneralProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosMarcas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosMarcas() {
		return this.jCheckBoxSeleccionarTodosProductosMarcas;
	}

	public void setjCheckBoxSeleccionarTodosProductosMarcas(
			JCheckBox jCheckBoxSeleccionarTodosProductosMarcas) {
		this.jCheckBoxSeleccionarTodosProductosMarcas = jCheckBoxSeleccionarTodosProductosMarcas;
	}

	public void setBorderResaltarSeleccionarTodosProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosMarcas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosMarcas() {
		return this.jCheckBoxSeleccionadosProductosMarcas;
	}

	public void setjCheckBoxSeleccionadosProductosMarcas(
			JCheckBox jCheckBoxSeleccionadosProductosMarcas) {
		this.jCheckBoxSeleccionadosProductosMarcas = jCheckBoxSeleccionadosProductosMarcas;
	}
	
	public void setBorderResaltarSeleccionadosProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosMarcas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosMarcas() {
		return this.jComboBoxTiposArchivosReportesProductosMarcas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosMarcas(
			JComboBox jComboBoxTiposArchivosReportesProductosMarcas) {
		this.jComboBoxTiposArchivosReportesProductosMarcas = jComboBoxTiposArchivosReportesProductosMarcas;
	}

	public void setBorderResaltarTiposArchivosReportesProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosMarcas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosMarcas() {
		return this.jComboBoxTiposReportesProductosMarcas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosMarcas(
			JComboBox jComboBoxTiposReportesProductosMarcas) {
		this.jComboBoxTiposReportesProductosMarcas = jComboBoxTiposReportesProductosMarcas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosMarcas() {
	//	return jComboBoxTiposReportesDinamicoProductosMarcas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosMarcas(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosMarcas) {
	//	this.jComboBoxTiposReportesDinamicoProductosMarcas = jComboBoxTiposReportesDinamicoProductosMarcas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosMarcas() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosMarcas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosMarcas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosMarcas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas = jComboBoxTiposArchivosReportesDinamicoProductosMarcas;
	//}
	
	public void setBorderResaltarTiposReportesProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosMarcas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosMarcas() {
		return this.jComboBoxTiposGraficosReportesProductosMarcas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosMarcas(
			JComboBox jComboBoxTiposGraficosReportesProductosMarcas) {
		this.jComboBoxTiposGraficosReportesProductosMarcas = jComboBoxTiposGraficosReportesProductosMarcas;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosMarcas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosMarcas() {
		return this.jComboBoxTiposPaginacionProductosMarcas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosMarcas(
			JComboBox jComboBoxTiposPaginacionProductosMarcas) {
		this.jComboBoxTiposPaginacionProductosMarcas = jComboBoxTiposPaginacionProductosMarcas;
	}
	
	public void setBorderResaltarTiposPaginacionProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosMarcas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosMarcas() {
		return this.jComboBoxTiposRelacionesProductosMarcas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosMarcas() {
		return this.jComboBoxTiposAccionesProductosMarcas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosMarcas(
			JComboBox jComboBoxTiposRelacionesProductosMarcas) {
		this.jComboBoxTiposRelacionesProductosMarcas = jComboBoxTiposRelacionesProductosMarcas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosMarcas(
			JComboBox jComboBoxTiposAccionesProductosMarcas) {
		this.jComboBoxTiposAccionesProductosMarcas = jComboBoxTiposAccionesProductosMarcas;
	}
	
	public void setBorderResaltarTiposRelacionesProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosMarcas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosMarcas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosMarcas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosMarcas() {
	//	return jCheckBoxConGraficoDinamicoProductosMarcas;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosMarcas(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosMarcas) {
	//	this.jCheckBoxConGraficoDinamicoProductosMarcas = jCheckBoxConGraficoDinamicoProductosMarcas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosMarcas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosMarcas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosMarcas .setBorder(borderResaltar);		
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
		this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
		
		this.productosmarcasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosmarcasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosmarcasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosMarcasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosMarcasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Marcas MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosMarcasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosMarcas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosMarcas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"nuevo","nuevo","Nuevo"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"duplicar","duplicar","Duplicar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"copiar","copiar","Copiar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"ver_form","ver_form","Ver"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"recargar","recargar","Buscar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosMarcas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosMarcas,this.jTtoolBarProductosMarcas,
							"cerrar","cerrar","Salir"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosMarcas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosMarcas;
			
				this.jButtonProcesarInformacionToolBarProductosMarcas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosMarcas;
				
		//protected JButton jButtonModificarToolBarProductosMarcas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosMarcas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosMarcas=new JMenuMe("General");
		this.jmenuArchivoProductosMarcas=new JMenuMe("Archivo");
		this.jmenuAccionesProductosMarcas=new JMenuMe("Acciones");
		this.jmenuDatosProductosMarcas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosMarcas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosMarcas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosMarcas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosMarcas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosMarcas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosMarcas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosMarcas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosMarcas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosMarcas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosMarcas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosMarcas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosMarcas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosMarcas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosMarcas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosMarcas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosMarcas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosMarcas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosMarcas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosMarcas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosMarcas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosMarcas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosMarcas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosMarcas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosMarcas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosMarcas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosMarcas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosMarcas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosMarcas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosMarcas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosMarcas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosMarcas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosMarcas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosMarcas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosMarcas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosMarcas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosMarcas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosMarcas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosMarcas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosMarcas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosMarcas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosMarcas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosMarcas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosMarcas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosMarcas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosMarcas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosMarcas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosMarcas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosMarcas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosMarcas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosMarcas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosMarcas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosMarcas.add(this.jMenuItemCerrarProductosMarcas);
			
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemNuevoProductosMarcas);
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemNuevoGuardarCambiosProductosMarcas);
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemNuevoRelacionesProductosMarcas);
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemGuardarCambiosTablaProductosMarcas);		
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemDuplicarProductosMarcas);		
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemCopiarProductosMarcas);		
			this.jmenuAccionesProductosMarcas.add(this.jMenuItemVerFormProductosMarcas);		
			
			this.jmenuDatosProductosMarcas.add(this.jMenuItemRecargarInformacionProductosMarcas);				
			this.jmenuDatosProductosMarcas.add(this.jMenuItemAnterioresProductosMarcas);				
			this.jmenuDatosProductosMarcas.add(this.jMenuItemSiguientesProductosMarcas);				
			this.jmenuDatosProductosMarcas.add(this.jMenuItemAbrirOrderByProductosMarcas);				
			this.jmenuDatosProductosMarcas.add(this.jMenuItemMostrarOcultarProductosMarcas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosMarcas.add(this.jMenuItemGuardarCambiosProductosMarcas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosMarcas.add(this.jmenuArchivoProductosMarcas);		
			this.jmenuBarProductosMarcas.add(this.jmenuAccionesProductosMarcas);		
			this.jmenuBarProductosMarcas.add(this.jmenuDatosProductosMarcas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosMarcas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosMarcas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosMarcasProductosMarcas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosMarcasProductosMarcas.setToolTipText("Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaProductosMarcasProductosMarcas= new JButtonMe();
		this.jButtonBusquedaProductosMarcasProductosMarcas.setText("Buscar");
		this.jButtonBusquedaProductosMarcasProductosMarcas.setToolTipText("Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosMarcasProductosMarcas,"buscar_button","Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosMarcasProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaProductosMarcasProductosMarcas = new JLabelMe();
		jLabelid_productoBusquedaProductosMarcasProductosMarcas.setText("Producto :");
		jLabelid_productoBusquedaProductosMarcasProductosMarcas.setToolTipText("Producto");
		jLabelid_productoBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProductosMarcasProductosMarcas= new JComboBoxMe();
		jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProductosMarcas=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosMarcas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProductosMarcas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProductosMarcas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosMarcas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosMarcas = new ProductosMarcasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Marcas DATOS");
			this.jInternalFrameDetalleFormProductosMarcas = new ProductosMarcasDetalleFormJInternalFrame(jDesktopPane,this.productosmarcasSessionBean.getConGuardarRelaciones(),this.productosmarcasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosMarcas = null;//new ProductosMarcasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosMarcas= new GridBagLayout();
		
		
		this.jTableDatosProductosMarcas = new JTableMe();      
		
		String sToolTipProductosMarcas="";
		sToolTipProductosMarcas=ProductosMarcasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosMarcas+="(Facturacion.ProductosMarcas)";
		}
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosMarcas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosMarcas.setToolTipText(sToolTipProductosMarcas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosMarcas);
		this.jTableDatosProductosMarcas.setAutoCreateRowSorter(true);
		this.jTableDatosProductosMarcas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosMarcas.setRowSelectionAllowed(true);
		this.jTableDatosProductosMarcas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosMarcas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosMarcas = new JButtonMe();
		this.jButtonDuplicarProductosMarcas = new JButtonMe();
		this.jButtonCopiarProductosMarcas = new JButtonMe();
		this.jButtonVerFormProductosMarcas = new JButtonMe();
		this.jButtonNuevoRelacionesProductosMarcas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosMarcas = new JButtonMe();
		this.jButtonCerrarProductosMarcas = new JButtonMe();
		
		this.jScrollPanelDatosProductosMarcas = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosMarcas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Marcas";
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosMarcas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosMarcas.setToolTipText("Acciones");
        this.jPanelAccionesProductosMarcas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosMarcas=new ReporteDinamicoJInternalFrame(ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosMarcas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosMarcas=new ImportacionJInternalFrame(ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosMarcas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosMarcas = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosMarcas.setText("Orden");
		this.jButtonAbrirOrderByProductosMarcas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosMarcas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosMarcas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosMarcas,false,this);
			
			//this.cargarOrderByProductosMarcas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosMarcas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosMarcas,true,this);
			
			//this.cargarOrderByProductosMarcas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosMarcas.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosProductosMarcas.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosProductosMarcas.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosProductosMarcas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosMarcas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosMarcas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosMarcas.setText("Nuevo");
		this.jButtonDuplicarProductosMarcas.setText("Duplicar");
		this.jButtonCopiarProductosMarcas.setText("Copiar");
		this.jButtonVerFormProductosMarcas.setText("Ver");
		this.jButtonNuevoRelacionesProductosMarcas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosMarcas.setText("Guardar");
		this.jButtonCerrarProductosMarcas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosMarcas,"nuevo_button","Nuevo",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosMarcas,"duplicar_button","Duplicar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosMarcas,"copiar_button","Copiar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosMarcas,"ver_form","Ver",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosMarcas,"nuevorelaciones_button","Nuevo Rel",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosMarcas,"guardarcambiostabla_button","Guardar",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosMarcas,"cerrar_button","Salir",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosMarcas.setToolTipText("Nuevo"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosMarcas.setToolTipText("Duplicar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosMarcas.setToolTipText("Copiar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosMarcas.setToolTipText("Ver"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosMarcas.setToolTipText("Nuevo Rel"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosMarcas.setToolTipText("Guardar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosMarcas.setToolTipText("Salir"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosMarcas";
		inputMap = this.jButtonNuevoProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosMarcas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosMarcas"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosMarcas";
		inputMap = this.jButtonDuplicarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosMarcas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosMarcas"));
		
		//COPIAR
		sMapKey = "CopiarProductosMarcas";
		inputMap = this.jButtonCopiarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosMarcas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosMarcas"));
		
		//VEr FORM
		sMapKey = "VerFormProductosMarcas";
		inputMap = this.jButtonVerFormProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosMarcas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosMarcas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosMarcas";
		inputMap = this.jButtonNuevoRelacionesProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosMarcas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosMarcas";
		inputMap = this.jButtonModificarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosMarcas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosMarcas";
		inputMap = this.jButtonCerrarProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosMarcas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosMarcas";
		inputMap = this.jButtonGuardarCambiosTablaProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosMarcas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosMarcas.setName("jPanelParametrosReportesProductosMarcas"); 
		
		this.jPanelParametrosReportesAccionesProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosMarcas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosMarcas.setName("jPanelParametrosReportesAccionesProductosMarcas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosMarcas = new JButtonMe();
		this.jButtonRecargarInformacionProductosMarcas.setText("Buscar");
		this.jButtonRecargarInformacionProductosMarcas.setToolTipText("Buscar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosMarcas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosMarcas.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosMarcas = new JButtonMe();
		this.jButtonProcesarInformacionProductosMarcas.setText("Procesar");
		this.jButtonProcesarInformacionProductosMarcas.setToolTipText("Procesar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosMarcas.setVisible(false);
			
		this.jButtonProcesarInformacionProductosMarcas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosMarcas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosMarcas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosMarcas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosMarcas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosMarcas.setText("TIPO");       
		this.jComboBoxTiposReportesProductosMarcas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosMarcas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosMarcas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosMarcas.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosMarcas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosMarcas.setText("Accion");
		this.jComboBoxTiposRelacionesProductosMarcas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosMarcas.setText("Accion");
		this.jComboBoxTiposAccionesProductosMarcas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosMarcas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosMarcas.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosMarcas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosMarcas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosMarcas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosMarcas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosMarcas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosMarcas = new JLabelMe();
		
		this.jLabelAccionesProductosMarcas.setText("Acciones");		
		this.jLabelAccionesProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosMarcas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosMarcas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosMarcas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosMarcas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosMarcas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosMarcas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosMarcas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosMarcas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosMarcas.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosMarcas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosMarcas = new JButtonMe();
		//this.jButtonAnterioresProductosMarcas.setText("<<");
        this.jButtonAnterioresProductosMarcas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosMarcas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosMarcas = new JButtonMe();
		//this.jButtonSiguientesProductosMarcas.setText(">>");
        this.jButtonSiguientesProductosMarcas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosMarcas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosMarcas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosMarcas.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosMarcas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosMarcas,"nuevoguardarcambios_button","Nue",this.productosmarcasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosMarcas";
		inputMap = this.jButtonNuevoGuardarCambiosProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosMarcas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosMarcas";
		inputMap = this.jButtonRecargarInformacionProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosMarcas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosMarcas";
		inputMap = this.jButtonSiguientesProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosMarcas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosMarcas";
		inputMap = this.jButtonAnterioresProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosMarcas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosMarcas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosMarcas.setMinimumSize(new Dimension(this.getWidth(),ProductosMarcasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosMarcasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosMarcas.setMaximumSize(new Dimension(this.getWidth(),ProductosMarcasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosMarcasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosMarcas.setPreferredSize(new Dimension(this.getWidth(),ProductosMarcasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosMarcasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosMarcas = new GridBagLayout();

			this.jPanelPaginacionProductosMarcas.setLayout(gridaBagLayoutPaginacionProductosMarcas);						
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 0;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosMarcas.add(this.jButtonAnterioresProductosMarcas, this.gridBagConstraintsProductosMarcas);
					
						
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosMarcas.gridy = 0;
			
			this.jPanelPaginacionProductosMarcas.add(this.jButtonNuevoGuardarCambiosProductosMarcas, this.gridBagConstraintsProductosMarcas);
						
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosMarcas.gridy = 0;
			this.jPanelPaginacionProductosMarcas.add(this.jButtonSiguientesProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 1;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosMarcas.add(this.jButtonNuevoProductosMarcas, this.gridBagConstraintsProductosMarcas);
						
			
			
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
				this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosMarcas.gridy = 1;
				this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosMarcas.add(this.jButtonGuardarCambiosTablaProductosMarcas, this.gridBagConstraintsProductosMarcas);
			}
			
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 1;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosMarcas.add(this.jButtonDuplicarProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 1;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosMarcas.add(this.jButtonCopiarProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 1;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosMarcas.add(this.jButtonVerFormProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 1;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosMarcas.add(this.jButtonCerrarProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		
		this.jButtonRecargarInformacionProductosMarcas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosMarcas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosMarcas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosMarcas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosMarcas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosMarcas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosMarcas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosMarcas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosMarcas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosMarcas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosMarcas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosMarcas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosMarcas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosMarcas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosMarcas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosMarcas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosMarcas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosMarcas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosMarcas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosMarcas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosMarcas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosMarcas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosMarcas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosMarcas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosMarcas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosMarcas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosMarcas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosMarcas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosMarcas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosMarcas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosMarcas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosMarcas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosMarcas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosMarcas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosMarcas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosMarcas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosMarcas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosMarcas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosMarcas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosMarcas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosMarcas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosMarcas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosMarcas.setLayout(gridaBagParametrosReportesProductosMarcas);
			this.jPanelParametrosReportesAccionesProductosMarcas.setLayout(gridaBagParametrosReportesAccionesProductosMarcas);
			
			
			this.jPanelParametrosAuxiliar1ProductosMarcas.setLayout(gridaBagParametrosAuxiliar1ProductosMarcas);
			this.jPanelParametrosAuxiliar2ProductosMarcas.setLayout(gridaBagParametrosAuxiliar2ProductosMarcas);
			this.jPanelParametrosAuxiliar3ProductosMarcas.setLayout(gridaBagParametrosAuxiliar3ProductosMarcas);
			this.jPanelParametrosAuxiliar4ProductosMarcas.setLayout(gridaBagParametrosAuxiliar4ProductosMarcas);
			//this.jPanelParametrosAuxiliar5ProductosMarcas.setLayout(gridaBagParametrosAuxiliar2ProductosMarcas);			
			
			
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosMarcas.add(this.jButtonRecargarInformacionProductosMarcas, this.gridBagConstraintsProductosMarcas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosMarcas.add(this.jComboBoxTiposPaginacionProductosMarcas, this.gridBagConstraintsProductosMarcas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosMarcas.add(this.jCheckBoxConAltoMaximoTablaProductosMarcas, this.gridBagConstraintsProductosMarcas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosMarcas.add(this.jComboBoxTiposArchivosReportesProductosMarcas, this.gridBagConstraintsProductosMarcas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosMarcas.add(this.jPanelParametrosAuxiliar1ProductosMarcas, this.gridBagConstraintsProductosMarcas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosMarcas.add(this.jComboBoxTiposReportesProductosMarcas, this.gridBagConstraintsProductosMarcas);																		
			
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosMarcas.add(this.jComboBoxTiposGraficosReportesProductosMarcas, this.gridBagConstraintsProductosMarcas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosMarcas.add(this.jPanelParametrosAuxiliar4ProductosMarcas, this.gridBagConstraintsProductosMarcas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosMarcas.add(this.jComboBoxTiposReportesProductosMarcas, this.gridBagConstraintsProductosMarcas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosMarcas.add(this.jCheckBoxGenerarReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosMarcas.add(this.jPanelParametrosAuxiliar2ProductosMarcas, this.gridBagConstraintsProductosMarcas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosMarcas.add(this.jLabelAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
				this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosMarcas.add(this.jButtonAbrirOrderByProductosMarcas, this.gridBagConstraintsProductosMarcas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosMarcas.add(this.jComboBoxTiposSeleccionarProductosMarcas, this.gridBagConstraintsProductosMarcas);			
			
			
			/*
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosMarcas.add(this.jCheckBoxSeleccionarTodosProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosMarcas.add(this.jCheckBoxConGraficoReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosMarcas.add(this.jCheckBoxSeleccionarTodosProductosMarcas, this.gridBagConstraintsProductosMarcas);															
				
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosMarcas.add(this.jCheckBoxSeleccionadosProductosMarcas, this.gridBagConstraintsProductosMarcas);															
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosMarcas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosMarcas.add(this.jCheckBoxConGraficoReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosMarcas.add(this.jPanelParametrosAuxiliar3ProductosMarcas, this.gridBagConstraintsProductosMarcas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosMarcas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosMarcas.add(this.jComboBoxTiposAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosMarcas = new GridBagLayout();

			this.jScrollPanelDatosProductosMarcas.setLayout(gridaBagLayoutDatosProductosMarcas);
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = 0;
			this.gridBagConstraintsProductosMarcas.gridx = 0;
			
			this.jScrollPanelDatosProductosMarcas.add(this.jTableDatosProductosMarcas, this.gridBagConstraintsProductosMarcas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosMarcas.setViewportView(this.jTableDatosProductosMarcas);
		this.jTableDatosProductosMarcas.setFillsViewportHeight(true);
		this.jTableDatosProductosMarcas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosMarcas= new GridBagLayout();
		this.jPanelAccionesProductosMarcas.setLayout(gridaBagLayoutAccionesProductosMarcas);
		
		
		/*	
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = 0;
		this.gridBagConstraintsProductosMarcas.gridx = 0;
			
		this.jPanelAccionesProductosMarcas.add(this.jButtonNuevoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosMarcasProductosMarcas= new GridBagLayout();
		gridaBagLayoutBusquedaProductosMarcasProductosMarcas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosMarcasProductosMarcas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosMarcasProductosMarcas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosMarcasProductosMarcas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosMarcasProductosMarcas.setLayout(gridaBagLayoutBusquedaProductosMarcasProductosMarcas);

		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 0;
		gridBagConstraintsProductosMarcas.gridx = 0;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jLabelid_productoBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);

		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 0;
		gridBagConstraintsProductosMarcas.gridx = 1;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jComboBoxid_productoBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);


		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 1;
		gridBagConstraintsProductosMarcas.gridx = 0;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jLabelfecha_emision_desdeBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);

		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 1;
		gridBagConstraintsProductosMarcas.gridx = 1;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);


		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 2;
		gridBagConstraintsProductosMarcas.gridx = 0;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jLabelfecha_emision_hastaBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);

		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 2;
		gridBagConstraintsProductosMarcas.gridx = 1;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);

		gridBagConstraintsProductosMarcas = new GridBagConstraints();
		gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosMarcas.gridy = 3;
		gridBagConstraintsProductosMarcas.gridx =1;
		jPanelBusquedaProductosMarcasProductosMarcas.add(jButtonBusquedaProductosMarcasProductosMarcas, gridBagConstraintsProductosMarcas);

		jTabbedPaneBusquedasProductosMarcas.addTab("1.-Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaProductosMarcasProductosMarcas);
		jTabbedPaneBusquedasProductosMarcas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosMarcas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosMarcas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();						
			this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosMarcas.gridx = 0;		
			//this.gridBagConstraintsProductosMarcas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosMarcas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosMarcas, this.gridBagConstraintsProductosMarcas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosMarcas.gridx = 0;		
		//this.gridBagConstraintsProductosMarcas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosMarcas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosMarcas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosMarcas.gridx = 0;		
			this.gridBagConstraintsProductosMarcas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosMarcas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosMarcas, this.gridBagConstraintsProductosMarcas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosMarcas, this.gridBagConstraintsProductosMarcas);								
		
		
		/*
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
		*/		
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosMarcas.gridx =0;
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosMarcas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosMarcas, this.gridBagConstraintsProductosMarcas);
				
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosMarcas, this.gridBagConstraintsProductosMarcas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosMarcas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosMarcas = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosMarcas.setLayout(gridaBagLayoutBusquedasParametrosProductosMarcas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosMarcas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosMarcas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosMarcas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosMarcas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosMarcas, this.gridBagConstraintsProductosMarcas);
			
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosMarcas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosMarcas, this.gridBagConstraintsProductosMarcas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosMarcas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosMarcas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosMarcas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosMarcas.setName("jPanelReporteDinamicoProductosMarcas"); 
		
		this.jPanelReporteDinamicoProductosMarcas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosMarcas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosMarcas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosMarcas.setLayout(gridaBagLayoutReporteDinamicoProductosMarcas);
		
		
		this.jInternalFrameReporteDinamicoProductosMarcas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosMarcas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosMarcas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosMarcas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosMarcas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosMarcas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosMarcas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosMarcas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosMarcas.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosMarcas.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosMarcas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosMarcas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosMarcas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosMarcas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosMarcas = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosMarcas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelColumnasSelectReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosMarcas = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosMarcas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosMarcas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosMarcas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosMarcas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosMarcas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosMarcas=new JScrollPane(this.jListColumnasSelectReporteProductosMarcas);
			
			this.jScrollColumnasSelectReporteProductosMarcas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosMarcas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosMarcas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosMarcas.add(this.jListColumnasSelectReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
		this.jPanelReporteDinamicoProductosMarcas.add(this.jScrollColumnasSelectReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosMarcas = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosMarcas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosMarcas = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosMarcas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosMarcas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosMarcas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosMarcas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosMarcas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosMarcas=new JScrollPane(this.jListRelacionesSelectReporteProductosMarcas);
			
			this.jScrollRelacionesSelectReporteProductosMarcas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosMarcas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosMarcas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosMarcas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosMarcas = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosMarcas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosMarcas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosMarcas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosMarcas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosMarcas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosMarcas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosMarcas = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosMarcas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelConGraficoDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosMarcas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosMarcas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosMarcas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosMarcas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosMarcas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosMarcas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jCheckBoxConGraficoDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosMarcas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosMarcas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelColumnaCategoriaGraficoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosMarcas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosMarcas.add(this.jComboBoxColumnaCategoriaGraficoProductosMarcas, this.gridBagConstraintsProductosMarcas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosMarcas = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosMarcas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelColumnaCategoriaValorProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosMarcas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosMarcas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosMarcas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosMarcas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosMarcas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosMarcas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosMarcas.add(this.jComboBoxColumnaCategoriaValorProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosMarcas = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosMarcas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelColumnasValoresGraficoProductosMarcas, this.gridBagConstraintsProductosMarcas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosMarcas = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosMarcas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosMarcas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosMarcas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosMarcas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosMarcas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosMarcas=new JScrollPane(this.jListColumnasValoresGraficoProductosMarcas);
			
			this.jScrollColumnasValoresGraficoProductosMarcas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosMarcas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosMarcas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosMarcas.add(this.jListColumnasSelectReporteProductosMarcas, this.gridBagConstraintsProductosMarcas);
		this.jPanelReporteDinamicoProductosMarcas.add(this.jScrollColumnasValoresGraficoProductosMarcas, this.gridBagConstraintsProductosMarcas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosMarcas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosMarcas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelTiposGraficosReportesDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosMarcas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jComboBoxTiposGraficosReportesDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosMarcas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosMarcas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelGenerarExcelReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosMarcas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosMarcas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosMarcas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosMarcas.setToolTipText("Generar EXCEL"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		//this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosMarcas.add(this.jButtonGenerarExcelReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosMarcas.add(this.jComboBoxTiposReportesDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosMarcas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosMarcas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosMarcas.add(this.jLabelTiposArchivoReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosMarcas.add(this.jComboBoxTiposArchivosReportesDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosMarcas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosMarcas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosMarcas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosMarcas.setToolTipText("Generar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosMarcas.add(this.jButtonGenerarReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosMarcas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosMarcas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosMarcas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosMarcas.setToolTipText("Cancelar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosMarcas.add(this.jButtonCerrarReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosMarcas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosMarcas= new JScrollPane(jPanelReporteDinamicoProductosMarcas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosMarcas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosMarcas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosMarcas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosMarcas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosMarcas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosMarcas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosMarcas);
		this.jInternalFrameReporteDinamicoProductosMarcas.getContentPane().add(this.jScrollPanelReporteDinamicoProductosMarcas, this.gridBagConstraintsProductosMarcas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosMarcas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosMarcas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosMarcas.setName("jPanelImportacionProductosMarcas"); 
		
		this.jPanelImportacionProductosMarcas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosMarcas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosMarcas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosMarcas.setLayout(gridaBagLayoutImportacionProductosMarcas);
		
		
		this.jInternalFrameImportacionProductosMarcas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosMarcas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosMarcas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosMarcas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosMarcas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosMarcas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosMarcas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosMarcas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosMarcas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosMarcas.setResizable(true);
	    this.jInternalFrameImportacionProductosMarcas.setClosable(true);
	    this.jInternalFrameImportacionProductosMarcas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosMarcas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosMarcas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosMarcas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosMarcas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosMarcas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosMarcas.setResizable(true);
	    this.jInternalFrameImportacionProductosMarcas.setClosable(true);
	    this.jInternalFrameImportacionProductosMarcas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosMarcas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosMarcas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosMarcas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosMarcas = new JLabelMe();

		this.jLabelArchivoImportacionProductosMarcas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosMarcas.add(this.jLabelArchivoImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosMarcas = new JFileChooser();		
		this.jFileChooserImportacionProductosMarcas.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosMarcas = new JButtonMe();
		this.jButtonAbrirImportacionProductosMarcas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosMarcas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosMarcas.setToolTipText("Generar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosMarcas.add(this.jButtonAbrirImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosMarcas = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosMarcas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosMarcas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosMarcas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosMarcas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosMarcas.add(this.jLabelPathArchivoImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosMarcas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosMarcas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosMarcas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosMarcas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosMarcas.add(this.jTextFieldPathArchivoImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosMarcas = new JButtonMe();
		this.jButtonGenerarImportacionProductosMarcas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosMarcas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosMarcas.setToolTipText("Generar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosMarcas.add(this.jButtonGenerarImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosMarcas = new JButtonMe();
		this.jButtonCerrarImportacionProductosMarcas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosMarcas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosMarcas.setToolTipText("Cancelar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosMarcas.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosMarcas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosMarcas.add(this.jButtonCerrarImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosMarcas = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosMarcas= new JScrollPane(jPanelImportacionProductosMarcas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
		this.gridBagConstraintsProductosMarcas.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosMarcas.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosMarcas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosMarcas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosMarcas);
		this.jInternalFrameImportacionProductosMarcas.getContentPane().add(this.jScrollPanelImportacionProductosMarcas, this.gridBagConstraintsProductosMarcas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosMarcas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosMarcas = new JButtonMe();
			this.jButtonAbrirOrderByProductosMarcas.setText("Orden");
			this.jButtonAbrirOrderByProductosMarcas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosMarcas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosMarcas";
			inputMap = this.jButtonAbrirOrderByProductosMarcas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosMarcas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosMarcas"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosMarcas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosMarcas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosMarcas.setName("jPanelOrderByProductosMarcas"); 
			
			this.jPanelOrderByProductosMarcas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosMarcas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosMarcas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosMarcas.setLayout(gridaBagLayoutOrderByProductosMarcas);
			
			
			this.jTableDatosProductosMarcasOrderBy = new JTableMe();        
			this.jTableDatosProductosMarcasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosMarcasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosMarcasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosMarcasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosMarcasOrderBy.setViewportView(this.jTableDatosProductosMarcasOrderBy);
			this.jTableDatosProductosMarcasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosMarcasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosMarcas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosMarcas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosMarcas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosMarcas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosMarcas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosMarcas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosMarcas.setTitle("Orden");
			this.jInternalFrameOrderByProductosMarcas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosMarcas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosMarcas.setResizable(true);
			this.jInternalFrameOrderByProductosMarcas.setClosable(true);
			this.jInternalFrameOrderByProductosMarcas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosMarcas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosMarcas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosMarcas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Marcases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosMarcas.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosMarcas.ipady =150;
				
			this.jPanelOrderByProductosMarcas.add(jScrollPanelDatosProductosMarcasOrderBy, this.gridBagConstraintsProductosMarcas);//this.jTableDatosProductosMarcasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosMarcas = new JButtonMe();
			this.jButtonCerrarOrderByProductosMarcas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosMarcas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosMarcas.setToolTipText("Cancelar"+" "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosMarcas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosMarcas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosMarcas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosMarcas.add(this.jButtonCerrarOrderByProductosMarcas, this.gridBagConstraintsProductosMarcas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosMarcas = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosMarcas= new JScrollPane(jPanelOrderByProductosMarcas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosMarcas = new GridBagConstraints();
			this.gridBagConstraintsProductosMarcas.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosMarcas.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosMarcas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosMarcas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosMarcas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosMarcas);
			
			this.jInternalFrameOrderByProductosMarcas.getContentPane().add(this.jScrollPanelOrderByProductosMarcas, this.gridBagConstraintsProductosMarcas);			
		
		} else {
			this.jButtonAbrirOrderByProductosMarcas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosmarcasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosMarcas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosMarcas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosMarcas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosMarcas.getRowHeight();//ProductosMarcasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosMarcas.isSelected()) {
					iHeightTable=ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosMarcas.isSelected()) {
					iHeightTable=ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosMarcasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosMarcas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosMarcas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosMarcas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosMarcas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosMarcas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosMarcas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosMarcas!=null && this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy()!=null) {
			//if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosMarcas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosMarcas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosMarcas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosMarcas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosMarcas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosMarcas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosmarcasLogic.getProductosMarcass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosmarcass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosMarcas> TraerProductosMarcasBeans(List<ProductosMarcas> productosmarcass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosMarcas productosmarcas:productosmarcass) {
					
				if(!(ProductosMarcasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosMarcasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosmarcas.setsDetalleGeneralEntityReporte(ProductosMarcasConstantesFunciones.getProductosMarcasDescripcion(productosmarcas));
										
						
					
						
					
				} else  {
							
					//productosmarcas.setsDetalleGeneralEntityReporte(productosmarcas.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosmarcasbeans.add(productosmarcasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosmarcass;
    }
	//PARA REPORTES FIN
}
