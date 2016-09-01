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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.ProductosResumidosConstantesFunciones;

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
public class ProductosResumidosJInternalFrame extends ProductosResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosResumidos;
	
	protected JMenuBar jmenuBarProductosResumidos;
	
	protected JMenu jmenuProductosResumidos;
	protected JMenu jmenuDatosProductosResumidos;
	protected JMenu jmenuArchivoProductosResumidos;
	protected JMenu jmenuAccionesProductosResumidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosResumidos;	
	protected GridBagConstraints gridBagConstraintsProductosResumidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosResumidosDetalleFormJInternalFrame jInternalFrameDetalleFormProductosResumidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosResumidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosResumidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ProductosResumidosSessionBean productosresumidosSessionBean;
		
	
	
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosResumidos> productosresumidoss;		
	public List<ProductosResumidos> productosresumidossEliminados;	
	public List<ProductosResumidos> productosresumidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosResumidos;		
	protected JButton jButtonAbrirOrderByProductosResumidos;
	
	
	//protected JPanel jPanelOrderByProductosResumidos;
	//public JScrollPane jScrollPanelOrderByProductosResumidos;	
	//protected JButton jButtonCerrarOrderByProductosResumidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosResumidosLogic productosresumidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosResumidos;
	public JScrollPane jScrollPanelDatosEdicionProductosResumidos;
	public JScrollPane jScrollPanelDatosGeneralProductosResumidos;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosResumidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosResumidos;
	//public JScrollPane jScrollPanelImportacionProductosResumidos;
	
	
	
	protected JPanel jPanelAccionesProductosResumidos;
	
    protected JPanel jPanelPaginacionProductosResumidos;
    protected JPanel jPanelParametrosReportesProductosResumidos;
	protected JPanel jPanelParametrosReportesAccionesProductosResumidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosResumidos;
	protected JPanel jPanelParametrosAuxiliar2ProductosResumidos;
	protected JPanel jPanelParametrosAuxiliar3ProductosResumidos;
	protected JPanel jPanelParametrosAuxiliar4ProductosResumidos;
	//protected JPanel jPanelParametrosAuxiliar5ProductosResumidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosResumidos;
	//protected JPanel jPanelImportacionProductosResumidos;
	
	
	public JTable jTableDatosProductosResumidos;
	
	
	
	//public JTable jTableDatosProductosResumidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosResumidos;
	protected JButton jButtonDuplicarProductosResumidos;
	protected JButton jButtonCopiarProductosResumidos;
	protected JButton jButtonVerFormProductosResumidos;
	protected JButton jButtonNuevoRelacionesProductosResumidos;
	protected JButton jButtonModificarProductosResumidos;
	
    protected JButton jButtonGuardarCambiosTablaProductosResumidos;
	protected JButton jButtonCerrarProductosResumidos;
	
	
	protected JButton jButtonRecargarInformacionProductosResumidos;
	protected JButton jButtonProcesarInformacionProductosResumidos;
	
	
	protected JButton jButtonAnterioresProductosResumidos;
	protected JButton jButtonSiguientesProductosResumidos;
	protected JButton jButtonNuevoGuardarCambiosProductosResumidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosResumidos;
	//protected JButton jButtonCerrarReporteDinamicoProductosResumidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosResumidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosResumidos;
	//protected JButton jButtonGenerarImportacionProductosResumidos;
	//protected JButton jButtonCerrarImportacionProductosResumidos;
	//protected JFileChooser jFileChooserImportacionProductosResumidos;
	//protected File fileImportacionProductosResumidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosResumidos;
	protected JButton jButtonDuplicarToolBarProductosResumidos;
	protected JButton jButtonNuevoRelacionesToolBarProductosResumidos;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosResumidos;
	protected JButton jButtonCopiarToolBarProductosResumidos;
	protected JButton jButtonVerFormToolBarProductosResumidos;
	public JButton jButtonGuardarCambiosTablaToolBarProductosResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosResumidos;
	protected JButton jButtonCerrarToolBarProductosResumidos;
	
	protected JButton jButtonRecargarInformacionToolBarProductosResumidos;
	protected JButton jButtonProcesarInformacionToolBarProductosResumidos;
	protected JButton jButtonAnterioresToolBarProductosResumidos;
	protected JButton jButtonSiguientesToolBarProductosResumidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosResumidos;
	protected JButton jButtonAbrirOrderByToolBarProductosResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosResumidos;
	protected JMenuItem jMenuItemDuplicarProductosResumidos;
	protected JMenuItem jMenuItemNuevoRelacionesProductosResumidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosResumidos;
	protected JMenuItem jMenuItemCopiarProductosResumidos;
	protected JMenuItem jMenuItemVerFormProductosResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosResumidos;
	protected JMenuItem jMenuItemCerrarProductosResumidos;
	protected JMenuItem jMenuItemDetalleCerrarProductosResumidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosResumidos;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosResumidos;
	protected JMenuItem jMenuItemProcesarInformacionProductosResumidos;
	protected JMenuItem jMenuItemAnterioresProductosResumidos;
	protected JMenuItem jMenuItemSiguientesProductosResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosResumidos;
	protected JMenuItem jMenuItemAbrirOrderByProductosResumidos;
	protected JMenuItem jMenuItemMostrarOcultarProductosResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosResumidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosResumidos;
	protected JCheckBox jCheckBoxSeleccionadosProductosResumidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosResumidos;
	protected JCheckBox jCheckBoxConGraficoReporteProductosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosResumidos;
	protected JTextField jTextFieldValorCampoGeneralProductosResumidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosResumidos;
	//public JList<Reporte> jListColumnasSelectReporteProductosResumidos;
	//public JScrollPane jScrollColumnasSelectReporteProductosResumidos;
	
	//public JLabel jLabelRelacionesSelectReporteProductosResumidos;
	//public JList<Reporte> jListRelacionesSelectReporteProductosResumidos;
	//public JScrollPane jScrollRelacionesSelectReporteProductosResumidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosResumidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosResumidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosResumidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosResumidos;
	
		
	//public JLabel jLabelArchivoImportacionProductosResumidos;	
	//public JLabel jLabelPathArchivoImportacionProductosResumidos;
	//protected JTextField jTextFieldPathArchivoImportacionProductosResumidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosResumidos;
	
	//public JLabel jLabelColumnaCategoriaValorProductosResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosResumidos;
	
	//public JLabel jLabelColumnasValoresGraficoProductosResumidos;
	//public JList<Reporte> jListColumnasValoresGraficoProductosResumidos;
	//public JScrollPane jScrollColumnasValoresGraficoProductosResumidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosResumidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosResumidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosResumidos;
	public JPanel jPanelBusquedaProductosResumidosProductosResumidos;
	public JButton jButtonBusquedaProductosResumidosProductosResumidos;
	
	public JPanel jPanelid_productoBusquedaProductosResumidosProductosResumidos;
	public JLabel jLabelid_productoBusquedaProductosResumidosProductosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProductosResumidosProductosResumidos;
	public JButton jButtonid_productoBusquedaProductosResumidosProductosResumidos= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosResumidosProductosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProductosResumidosProductosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos;
	public JLabel jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos;
	public JButton jButtonfecha_emision_desdeBusquedaProductosResumidosProductosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos;
	public JLabel jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos;
	public JButton jButtonfecha_emision_hastaBusquedaProductosResumidosProductosResumidosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosResumidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosResumidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosResumidos)	{
		this.jButtonRecargarInformacionProductosResumidos = jButtonRecargarInformacionProductosResumidos;
	}
	
	public JButton getjButtonProcesarInformacionProductosResumidos() {
		return this.jButtonProcesarInformacionProductosResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosResumidos)	{
		this.jButtonProcesarInformacionProductosResumidos = jButtonProcesarInformacionProductosResumidos;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosResumidos() {
		return this.jButtonRecargarInformacionProductosResumidos;
	}
	
	
	public List<ProductosResumidos> getproductosresumidoss() {
		return this.productosresumidoss;
	}

	public void setproductosresumidoss(List<ProductosResumidos> productosresumidoss) {
		this.productosresumidoss = productosresumidoss;
	}
	
	public List<ProductosResumidos> getproductosresumidossAux() {
		return this.productosresumidossAux;
	}

	public void setproductosresumidossAux(List<ProductosResumidos> productosresumidossAux) {
		this.productosresumidossAux = productosresumidossAux;
	}
	
	public List<ProductosResumidos> getproductosresumidossEliminados() {
		return this.productosresumidossEliminados;
	}

	public void setProductosResumidossEliminados(List<ProductosResumidos> productosresumidossEliminados) {
		this.productosresumidossEliminados = productosresumidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosResumidos() {
		return jComboBoxTiposSeleccionarProductosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosResumidos(
			JComboBox jComboBoxTiposSeleccionarProductosResumidos) {
		this.jComboBoxTiposSeleccionarProductosResumidos = jComboBoxTiposSeleccionarProductosResumidos;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosResumidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosResumidos() {
		return jTextFieldValorCampoGeneralProductosResumidos;
	}

	public void setjTextFieldValorCampoGeneralProductosResumidos(
			JTextField jTextFieldValorCampoGeneralProductosResumidos) {
		this.jTextFieldValorCampoGeneralProductosResumidos = jTextFieldValorCampoGeneralProductosResumidos;
	}

	public void setBorderResaltarValorCampoGeneralProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosResumidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosResumidos() {
		return this.jCheckBoxSeleccionarTodosProductosResumidos;
	}

	public void setjCheckBoxSeleccionarTodosProductosResumidos(
			JCheckBox jCheckBoxSeleccionarTodosProductosResumidos) {
		this.jCheckBoxSeleccionarTodosProductosResumidos = jCheckBoxSeleccionarTodosProductosResumidos;
	}

	public void setBorderResaltarSeleccionarTodosProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosResumidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosResumidos() {
		return this.jCheckBoxSeleccionadosProductosResumidos;
	}

	public void setjCheckBoxSeleccionadosProductosResumidos(
			JCheckBox jCheckBoxSeleccionadosProductosResumidos) {
		this.jCheckBoxSeleccionadosProductosResumidos = jCheckBoxSeleccionadosProductosResumidos;
	}
	
	public void setBorderResaltarSeleccionadosProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosResumidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosResumidos() {
		return this.jComboBoxTiposArchivosReportesProductosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosResumidos(
			JComboBox jComboBoxTiposArchivosReportesProductosResumidos) {
		this.jComboBoxTiposArchivosReportesProductosResumidos = jComboBoxTiposArchivosReportesProductosResumidos;
	}

	public void setBorderResaltarTiposArchivosReportesProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosResumidos() {
		return this.jComboBoxTiposReportesProductosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosResumidos(
			JComboBox jComboBoxTiposReportesProductosResumidos) {
		this.jComboBoxTiposReportesProductosResumidos = jComboBoxTiposReportesProductosResumidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosResumidos() {
	//	return jComboBoxTiposReportesDinamicoProductosResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosResumidos(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosResumidos) {
	//	this.jComboBoxTiposReportesDinamicoProductosResumidos = jComboBoxTiposReportesDinamicoProductosResumidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosResumidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosResumidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosResumidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos = jComboBoxTiposArchivosReportesDinamicoProductosResumidos;
	//}
	
	public void setBorderResaltarTiposReportesProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosResumidos() {
		return this.jComboBoxTiposGraficosReportesProductosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosResumidos(
			JComboBox jComboBoxTiposGraficosReportesProductosResumidos) {
		this.jComboBoxTiposGraficosReportesProductosResumidos = jComboBoxTiposGraficosReportesProductosResumidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosResumidos() {
		return this.jComboBoxTiposPaginacionProductosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosResumidos(
			JComboBox jComboBoxTiposPaginacionProductosResumidos) {
		this.jComboBoxTiposPaginacionProductosResumidos = jComboBoxTiposPaginacionProductosResumidos;
	}
	
	public void setBorderResaltarTiposPaginacionProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosResumidos() {
		return this.jComboBoxTiposRelacionesProductosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosResumidos() {
		return this.jComboBoxTiposAccionesProductosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosResumidos(
			JComboBox jComboBoxTiposRelacionesProductosResumidos) {
		this.jComboBoxTiposRelacionesProductosResumidos = jComboBoxTiposRelacionesProductosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosResumidos(
			JComboBox jComboBoxTiposAccionesProductosResumidos) {
		this.jComboBoxTiposAccionesProductosResumidos = jComboBoxTiposAccionesProductosResumidos;
	}
	
	public void setBorderResaltarTiposRelacionesProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosResumidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosResumidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosResumidos() {
	//	return jCheckBoxConGraficoDinamicoProductosResumidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosResumidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosResumidos) {
	//	this.jCheckBoxConGraficoDinamicoProductosResumidos = jCheckBoxConGraficoDinamicoProductosResumidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosResumidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosResumidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosResumidos .setBorder(borderResaltar);		
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
		this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
		
		this.productosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosresumidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosResumidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"nuevo","nuevo","Nuevo"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"duplicar","duplicar","Duplicar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"copiar","copiar","Copiar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"ver_form","ver_form","Ver"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"recargar","recargar","Buscar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosResumidos,this.jTtoolBarProductosResumidos,
							"cerrar","cerrar","Salir"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosResumidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosResumidos;
			
				this.jButtonProcesarInformacionToolBarProductosResumidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosResumidos;
				
		//protected JButton jButtonModificarToolBarProductosResumidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosResumidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosResumidos=new JMenuMe("General");
		this.jmenuArchivoProductosResumidos=new JMenuMe("Archivo");
		this.jmenuAccionesProductosResumidos=new JMenuMe("Acciones");
		this.jmenuDatosProductosResumidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosResumidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosResumidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosResumidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosResumidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosResumidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosResumidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosResumidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosResumidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosResumidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosResumidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosResumidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosResumidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosResumidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosResumidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosResumidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosResumidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosResumidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosResumidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosResumidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosResumidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosResumidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosResumidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosResumidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosResumidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosResumidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosResumidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosResumidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosResumidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosResumidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosResumidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosResumidos.add(this.jMenuItemCerrarProductosResumidos);
			
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemNuevoProductosResumidos);
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemNuevoGuardarCambiosProductosResumidos);
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemNuevoRelacionesProductosResumidos);
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemGuardarCambiosTablaProductosResumidos);		
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemDuplicarProductosResumidos);		
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemCopiarProductosResumidos);		
			this.jmenuAccionesProductosResumidos.add(this.jMenuItemVerFormProductosResumidos);		
			
			this.jmenuDatosProductosResumidos.add(this.jMenuItemRecargarInformacionProductosResumidos);				
			this.jmenuDatosProductosResumidos.add(this.jMenuItemAnterioresProductosResumidos);				
			this.jmenuDatosProductosResumidos.add(this.jMenuItemSiguientesProductosResumidos);				
			this.jmenuDatosProductosResumidos.add(this.jMenuItemAbrirOrderByProductosResumidos);				
			this.jmenuDatosProductosResumidos.add(this.jMenuItemMostrarOcultarProductosResumidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosResumidos.add(this.jMenuItemGuardarCambiosProductosResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosResumidos.add(this.jmenuArchivoProductosResumidos);		
			this.jmenuBarProductosResumidos.add(this.jmenuAccionesProductosResumidos);		
			this.jmenuBarProductosResumidos.add(this.jmenuDatosProductosResumidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosResumidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosResumidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosResumidosProductosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosResumidosProductosResumidos.setToolTipText("Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaProductosResumidosProductosResumidos= new JButtonMe();
		this.jButtonBusquedaProductosResumidosProductosResumidos.setText("Buscar");
		this.jButtonBusquedaProductosResumidosProductosResumidos.setToolTipText("Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosResumidosProductosResumidos,"buscar_button","Buscar Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosResumidosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaProductosResumidosProductosResumidos = new JLabelMe();
		jLabelid_productoBusquedaProductosResumidosProductosResumidos.setText("Producto :");
		jLabelid_productoBusquedaProductosResumidosProductosResumidos.setToolTipText("Producto");
		jLabelid_productoBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProductosResumidosProductosResumidos= new JComboBoxMe();
		jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProductosResumidos=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosResumidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProductosResumidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProductosResumidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosResumidos = new ProductosResumidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Resumidos DATOS");
			this.jInternalFrameDetalleFormProductosResumidos = new ProductosResumidosDetalleFormJInternalFrame(jDesktopPane,this.productosresumidosSessionBean.getConGuardarRelaciones(),this.productosresumidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosResumidos = null;//new ProductosResumidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosResumidos= new GridBagLayout();
		
		
		this.jTableDatosProductosResumidos = new JTableMe();      
		
		String sToolTipProductosResumidos="";
		sToolTipProductosResumidos=ProductosResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosResumidos+="(Facturacion.ProductosResumidos)";
		}
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosResumidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosResumidos.setToolTipText(sToolTipProductosResumidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosResumidos);
		this.jTableDatosProductosResumidos.setAutoCreateRowSorter(true);
		this.jTableDatosProductosResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosResumidos.setRowSelectionAllowed(true);
		this.jTableDatosProductosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosResumidos = new JButtonMe();
		this.jButtonDuplicarProductosResumidos = new JButtonMe();
		this.jButtonCopiarProductosResumidos = new JButtonMe();
		this.jButtonVerFormProductosResumidos = new JButtonMe();
		this.jButtonNuevoRelacionesProductosResumidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosResumidos = new JButtonMe();
		this.jButtonCerrarProductosResumidos = new JButtonMe();
		
		this.jScrollPanelDatosProductosResumidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosResumidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Resumidos";
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesProductosResumidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosResumidos=new ReporteDinamicoJInternalFrame(ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosResumidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosResumidos=new ImportacionJInternalFrame(ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosResumidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosResumidos = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosResumidos.setText("Orden");
		this.jButtonAbrirOrderByProductosResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosResumidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosResumidos,false,this);
			
			//this.cargarOrderByProductosResumidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosResumidos,true,this);
			
			//this.cargarOrderByProductosResumidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosResumidos.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosProductosResumidos.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosProductosResumidos.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosProductosResumidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosResumidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosResumidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosResumidos.setText("Nuevo");
		this.jButtonDuplicarProductosResumidos.setText("Duplicar");
		this.jButtonCopiarProductosResumidos.setText("Copiar");
		this.jButtonVerFormProductosResumidos.setText("Ver");
		this.jButtonNuevoRelacionesProductosResumidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosResumidos.setText("Guardar");
		this.jButtonCerrarProductosResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosResumidos,"nuevo_button","Nuevo",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosResumidos,"duplicar_button","Duplicar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosResumidos,"copiar_button","Copiar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosResumidos,"ver_form","Ver",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosResumidos,"nuevorelaciones_button","Nuevo Rel",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosResumidos,"guardarcambiostabla_button","Guardar",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosResumidos,"cerrar_button","Salir",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosResumidos.setToolTipText("Nuevo"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosResumidos.setToolTipText("Duplicar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosResumidos.setToolTipText("Copiar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosResumidos.setToolTipText("Ver"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosResumidos.setToolTipText("Nuevo Rel"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosResumidos.setToolTipText("Guardar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosResumidos.setToolTipText("Salir"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosResumidos";
		inputMap = this.jButtonNuevoProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosResumidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosResumidos";
		inputMap = this.jButtonDuplicarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosResumidos"));
		
		//COPIAR
		sMapKey = "CopiarProductosResumidos";
		inputMap = this.jButtonCopiarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosResumidos"));
		
		//VEr FORM
		sMapKey = "VerFormProductosResumidos";
		inputMap = this.jButtonVerFormProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosResumidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosResumidos";
		inputMap = this.jButtonNuevoRelacionesProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosResumidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosResumidos";
		inputMap = this.jButtonModificarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosResumidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosResumidos";
		inputMap = this.jButtonCerrarProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosResumidos";
		inputMap = this.jButtonGuardarCambiosTablaProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosResumidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosResumidos.setName("jPanelParametrosReportesProductosResumidos"); 
		
		this.jPanelParametrosReportesAccionesProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosResumidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosResumidos.setName("jPanelParametrosReportesAccionesProductosResumidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosResumidos = new JButtonMe();
		this.jButtonRecargarInformacionProductosResumidos.setText("Buscar");
		this.jButtonRecargarInformacionProductosResumidos.setToolTipText("Buscar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosResumidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosResumidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosResumidos = new JButtonMe();
		this.jButtonProcesarInformacionProductosResumidos.setText("Procesar");
		this.jButtonProcesarInformacionProductosResumidos.setToolTipText("Procesar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosResumidos.setVisible(false);
			
		this.jButtonProcesarInformacionProductosResumidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosResumidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosResumidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosResumidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosResumidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosResumidos.setText("TIPO");       
		this.jComboBoxTiposReportesProductosResumidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosResumidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosResumidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosResumidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosResumidos.setText("Accion");
		this.jComboBoxTiposRelacionesProductosResumidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosResumidos.setText("Accion");
		this.jComboBoxTiposAccionesProductosResumidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosResumidos.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosResumidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosResumidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosResumidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosResumidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosResumidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosResumidos = new JLabelMe();
		
		this.jLabelAccionesProductosResumidos.setText("Acciones");		
		this.jLabelAccionesProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosResumidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosResumidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosResumidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosResumidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosResumidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosResumidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosResumidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosResumidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosResumidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosResumidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosResumidos = new JButtonMe();
		//this.jButtonAnterioresProductosResumidos.setText("<<");
        this.jButtonAnterioresProductosResumidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosResumidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosResumidos = new JButtonMe();
		//this.jButtonSiguientesProductosResumidos.setText(">>");
        this.jButtonSiguientesProductosResumidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosResumidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosResumidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosResumidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosResumidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosResumidos,"nuevoguardarcambios_button","Nue",this.productosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosResumidos";
		inputMap = this.jButtonNuevoGuardarCambiosProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosResumidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosResumidos";
		inputMap = this.jButtonRecargarInformacionProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosResumidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosResumidos";
		inputMap = this.jButtonSiguientesProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosResumidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosResumidos";
		inputMap = this.jButtonAnterioresProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosResumidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosResumidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosResumidos.setMinimumSize(new Dimension(this.getWidth(),ProductosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosResumidos.setMaximumSize(new Dimension(this.getWidth(),ProductosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosResumidos.setPreferredSize(new Dimension(this.getWidth(),ProductosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosResumidos = new GridBagLayout();

			this.jPanelPaginacionProductosResumidos.setLayout(gridaBagLayoutPaginacionProductosResumidos);						
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 0;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosResumidos.add(this.jButtonAnterioresProductosResumidos, this.gridBagConstraintsProductosResumidos);
					
						
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosResumidos.gridy = 0;
			
			this.jPanelPaginacionProductosResumidos.add(this.jButtonNuevoGuardarCambiosProductosResumidos, this.gridBagConstraintsProductosResumidos);
						
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosResumidos.gridy = 0;
			this.jPanelPaginacionProductosResumidos.add(this.jButtonSiguientesProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 1;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosResumidos.add(this.jButtonNuevoProductosResumidos, this.gridBagConstraintsProductosResumidos);
						
			
			
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
				this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosResumidos.gridy = 1;
				this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosResumidos.add(this.jButtonGuardarCambiosTablaProductosResumidos, this.gridBagConstraintsProductosResumidos);
			}
			
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 1;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosResumidos.add(this.jButtonDuplicarProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 1;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosResumidos.add(this.jButtonCopiarProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 1;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosResumidos.add(this.jButtonVerFormProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 1;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosResumidos.add(this.jButtonCerrarProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		
		this.jButtonRecargarInformacionProductosResumidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosResumidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosResumidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosResumidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosResumidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosResumidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosResumidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosResumidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosResumidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosResumidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosResumidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosResumidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosResumidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosResumidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosResumidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosResumidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosResumidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosResumidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosResumidos.setLayout(gridaBagParametrosReportesProductosResumidos);
			this.jPanelParametrosReportesAccionesProductosResumidos.setLayout(gridaBagParametrosReportesAccionesProductosResumidos);
			
			
			this.jPanelParametrosAuxiliar1ProductosResumidos.setLayout(gridaBagParametrosAuxiliar1ProductosResumidos);
			this.jPanelParametrosAuxiliar2ProductosResumidos.setLayout(gridaBagParametrosAuxiliar2ProductosResumidos);
			this.jPanelParametrosAuxiliar3ProductosResumidos.setLayout(gridaBagParametrosAuxiliar3ProductosResumidos);
			this.jPanelParametrosAuxiliar4ProductosResumidos.setLayout(gridaBagParametrosAuxiliar4ProductosResumidos);
			//this.jPanelParametrosAuxiliar5ProductosResumidos.setLayout(gridaBagParametrosAuxiliar2ProductosResumidos);			
			
			
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosResumidos.add(this.jButtonRecargarInformacionProductosResumidos, this.gridBagConstraintsProductosResumidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosResumidos.add(this.jComboBoxTiposPaginacionProductosResumidos, this.gridBagConstraintsProductosResumidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosResumidos.add(this.jCheckBoxConAltoMaximoTablaProductosResumidos, this.gridBagConstraintsProductosResumidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosResumidos.add(this.jComboBoxTiposArchivosReportesProductosResumidos, this.gridBagConstraintsProductosResumidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosResumidos.add(this.jPanelParametrosAuxiliar1ProductosResumidos, this.gridBagConstraintsProductosResumidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosResumidos.add(this.jComboBoxTiposReportesProductosResumidos, this.gridBagConstraintsProductosResumidos);																		
			
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosResumidos.add(this.jComboBoxTiposGraficosReportesProductosResumidos, this.gridBagConstraintsProductosResumidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosResumidos.add(this.jPanelParametrosAuxiliar4ProductosResumidos, this.gridBagConstraintsProductosResumidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosResumidos.add(this.jComboBoxTiposReportesProductosResumidos, this.gridBagConstraintsProductosResumidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosResumidos.add(this.jCheckBoxGenerarReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosResumidos.add(this.jPanelParametrosAuxiliar2ProductosResumidos, this.gridBagConstraintsProductosResumidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosResumidos.add(this.jLabelAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
				this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosResumidos.add(this.jButtonAbrirOrderByProductosResumidos, this.gridBagConstraintsProductosResumidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosResumidos.add(this.jComboBoxTiposSeleccionarProductosResumidos, this.gridBagConstraintsProductosResumidos);			
			
			
			/*
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosResumidos.add(this.jCheckBoxSeleccionarTodosProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosResumidos.add(this.jCheckBoxConGraficoReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosResumidos.add(this.jCheckBoxSeleccionarTodosProductosResumidos, this.gridBagConstraintsProductosResumidos);															
				
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosResumidos.add(this.jCheckBoxSeleccionadosProductosResumidos, this.gridBagConstraintsProductosResumidos);															
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosResumidos.add(this.jCheckBoxConGraficoReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosResumidos.add(this.jPanelParametrosAuxiliar3ProductosResumidos, this.gridBagConstraintsProductosResumidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosResumidos.add(this.jComboBoxTiposAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosResumidos = new GridBagLayout();

			this.jScrollPanelDatosProductosResumidos.setLayout(gridaBagLayoutDatosProductosResumidos);
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = 0;
			this.gridBagConstraintsProductosResumidos.gridx = 0;
			
			this.jScrollPanelDatosProductosResumidos.add(this.jTableDatosProductosResumidos, this.gridBagConstraintsProductosResumidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosResumidos.setViewportView(this.jTableDatosProductosResumidos);
		this.jTableDatosProductosResumidos.setFillsViewportHeight(true);
		this.jTableDatosProductosResumidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosResumidos= new GridBagLayout();
		this.jPanelAccionesProductosResumidos.setLayout(gridaBagLayoutAccionesProductosResumidos);
		
		
		/*	
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = 0;
		this.gridBagConstraintsProductosResumidos.gridx = 0;
			
		this.jPanelAccionesProductosResumidos.add(this.jButtonNuevoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosResumidosProductosResumidos= new GridBagLayout();
		gridaBagLayoutBusquedaProductosResumidosProductosResumidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosResumidosProductosResumidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosResumidosProductosResumidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosResumidosProductosResumidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosResumidosProductosResumidos.setLayout(gridaBagLayoutBusquedaProductosResumidosProductosResumidos);

		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 0;
		gridBagConstraintsProductosResumidos.gridx = 0;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jLabelid_productoBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);

		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 0;
		gridBagConstraintsProductosResumidos.gridx = 1;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jComboBoxid_productoBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);


		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 1;
		gridBagConstraintsProductosResumidos.gridx = 0;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jLabelfecha_emision_desdeBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);

		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 1;
		gridBagConstraintsProductosResumidos.gridx = 1;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);


		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 2;
		gridBagConstraintsProductosResumidos.gridx = 0;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jLabelfecha_emision_hastaBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);

		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 2;
		gridBagConstraintsProductosResumidos.gridx = 1;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);

		gridBagConstraintsProductosResumidos = new GridBagConstraints();
		gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosResumidos.gridy = 3;
		gridBagConstraintsProductosResumidos.gridx =1;
		jPanelBusquedaProductosResumidosProductosResumidos.add(jButtonBusquedaProductosResumidosProductosResumidos, gridBagConstraintsProductosResumidos);

		jTabbedPaneBusquedasProductosResumidos.addTab("1.-Por Producto Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaProductosResumidosProductosResumidos);
		jTabbedPaneBusquedasProductosResumidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosResumidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();						
			this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosResumidos.gridx = 0;		
			//this.gridBagConstraintsProductosResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosResumidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosResumidos, this.gridBagConstraintsProductosResumidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosResumidos.gridx = 0;		
		//this.gridBagConstraintsProductosResumidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosResumidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosResumidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosResumidos.gridx = 0;		
			this.gridBagConstraintsProductosResumidos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosResumidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosResumidos, this.gridBagConstraintsProductosResumidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosResumidos, this.gridBagConstraintsProductosResumidos);								
		
		
		/*
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
		*/		
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosResumidos.gridx =0;
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosResumidos, this.gridBagConstraintsProductosResumidos);
				
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosResumidos, this.gridBagConstraintsProductosResumidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosResumidos = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosResumidos.setLayout(gridaBagLayoutBusquedasParametrosProductosResumidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosResumidos, this.gridBagConstraintsProductosResumidos);
			
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosResumidos, this.gridBagConstraintsProductosResumidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosResumidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosResumidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosResumidos.setName("jPanelReporteDinamicoProductosResumidos"); 
		
		this.jPanelReporteDinamicoProductosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosResumidos.setLayout(gridaBagLayoutReporteDinamicoProductosResumidos);
		
		
		this.jInternalFrameReporteDinamicoProductosResumidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosResumidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosResumidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosResumidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosResumidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosResumidos = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosResumidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelColumnasSelectReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosResumidos = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosResumidos=new JScrollPane(this.jListColumnasSelectReporteProductosResumidos);
			
			this.jScrollColumnasSelectReporteProductosResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosResumidos.add(this.jListColumnasSelectReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
		this.jPanelReporteDinamicoProductosResumidos.add(this.jScrollColumnasSelectReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosResumidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosResumidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosResumidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosResumidos=new JScrollPane(this.jListRelacionesSelectReporteProductosResumidos);
			
			this.jScrollRelacionesSelectReporteProductosResumidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosResumidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosResumidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosResumidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosResumidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosResumidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosResumidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosResumidos = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosResumidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelConGraficoDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosResumidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosResumidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosResumidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jCheckBoxConGraficoDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosResumidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelColumnaCategoriaGraficoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosResumidos.add(this.jComboBoxColumnaCategoriaGraficoProductosResumidos, this.gridBagConstraintsProductosResumidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosResumidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelColumnaCategoriaValorProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosResumidos.add(this.jComboBoxColumnaCategoriaValorProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosResumidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosResumidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelColumnasValoresGraficoProductosResumidos, this.gridBagConstraintsProductosResumidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosResumidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosResumidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosResumidos=new JScrollPane(this.jListColumnasValoresGraficoProductosResumidos);
			
			this.jScrollColumnasValoresGraficoProductosResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosResumidos.add(this.jListColumnasSelectReporteProductosResumidos, this.gridBagConstraintsProductosResumidos);
		this.jPanelReporteDinamicoProductosResumidos.add(this.jScrollColumnasValoresGraficoProductosResumidos, this.gridBagConstraintsProductosResumidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosResumidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosResumidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelTiposGraficosReportesDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosResumidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jComboBoxTiposGraficosReportesDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosResumidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosResumidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelGenerarExcelReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosResumidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosResumidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosResumidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosResumidos.setToolTipText("Generar EXCEL"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosResumidos.add(this.jButtonGenerarExcelReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosResumidos.add(this.jComboBoxTiposReportesDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosResumidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosResumidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosResumidos.add(this.jLabelTiposArchivoReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosResumidos.add(this.jComboBoxTiposArchivosReportesDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosResumidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosResumidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosResumidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosResumidos.setToolTipText("Generar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosResumidos.add(this.jButtonGenerarReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosResumidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosResumidos.setToolTipText("Cancelar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosResumidos.add(this.jButtonCerrarReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosResumidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosResumidos= new JScrollPane(jPanelReporteDinamicoProductosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosResumidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosResumidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosResumidos);
		this.jInternalFrameReporteDinamicoProductosResumidos.getContentPane().add(this.jScrollPanelReporteDinamicoProductosResumidos, this.gridBagConstraintsProductosResumidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosResumidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosResumidos.setName("jPanelImportacionProductosResumidos"); 
		
		this.jPanelImportacionProductosResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosResumidos.setLayout(gridaBagLayoutImportacionProductosResumidos);
		
		
		this.jInternalFrameImportacionProductosResumidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosResumidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosResumidos.setResizable(true);
	    this.jInternalFrameImportacionProductosResumidos.setClosable(true);
	    this.jInternalFrameImportacionProductosResumidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosResumidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosResumidos.setResizable(true);
	    this.jInternalFrameImportacionProductosResumidos.setClosable(true);
	    this.jInternalFrameImportacionProductosResumidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosResumidos = new JLabelMe();

		this.jLabelArchivoImportacionProductosResumidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosResumidos.add(this.jLabelArchivoImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosResumidos = new JFileChooser();		
		this.jFileChooserImportacionProductosResumidos.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosResumidos = new JButtonMe();
		this.jButtonAbrirImportacionProductosResumidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosResumidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosResumidos.setToolTipText("Generar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosResumidos.add(this.jButtonAbrirImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosResumidos = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosResumidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosResumidos.add(this.jLabelPathArchivoImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosResumidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosResumidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosResumidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosResumidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosResumidos.add(this.jTextFieldPathArchivoImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosResumidos = new JButtonMe();
		this.jButtonGenerarImportacionProductosResumidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosResumidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosResumidos.setToolTipText("Generar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosResumidos.add(this.jButtonGenerarImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosResumidos = new JButtonMe();
		this.jButtonCerrarImportacionProductosResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosResumidos.setToolTipText("Cancelar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosResumidos.add(this.jButtonCerrarImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosResumidos = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosResumidos= new JScrollPane(jPanelImportacionProductosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
		this.gridBagConstraintsProductosResumidos.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosResumidos.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosResumidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosResumidos);
		this.jInternalFrameImportacionProductosResumidos.getContentPane().add(this.jScrollPanelImportacionProductosResumidos, this.gridBagConstraintsProductosResumidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosResumidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosResumidos = new JButtonMe();
			this.jButtonAbrirOrderByProductosResumidos.setText("Orden");
			this.jButtonAbrirOrderByProductosResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosResumidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosResumidos";
			inputMap = this.jButtonAbrirOrderByProductosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosResumidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosResumidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosResumidos.setName("jPanelOrderByProductosResumidos"); 
			
			this.jPanelOrderByProductosResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosResumidos.setLayout(gridaBagLayoutOrderByProductosResumidos);
			
			
			this.jTableDatosProductosResumidosOrderBy = new JTableMe();        
			this.jTableDatosProductosResumidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosResumidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosResumidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosResumidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosResumidosOrderBy.setViewportView(this.jTableDatosProductosResumidosOrderBy);
			this.jTableDatosProductosResumidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosResumidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosResumidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosResumidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosResumidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosResumidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosResumidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosResumidos.setTitle("Orden");
			this.jInternalFrameOrderByProductosResumidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosResumidos.setResizable(true);
			this.jInternalFrameOrderByProductosResumidos.setClosable(true);
			this.jInternalFrameOrderByProductosResumidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Resumidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosResumidos.ipady =150;
				
			this.jPanelOrderByProductosResumidos.add(jScrollPanelDatosProductosResumidosOrderBy, this.gridBagConstraintsProductosResumidos);//this.jTableDatosProductosResumidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosResumidos = new JButtonMe();
			this.jButtonCerrarOrderByProductosResumidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosResumidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosResumidos.setToolTipText("Cancelar"+" "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosResumidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosResumidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosResumidos.add(this.jButtonCerrarOrderByProductosResumidos, this.gridBagConstraintsProductosResumidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosResumidos = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosResumidos= new JScrollPane(jPanelOrderByProductosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosResumidos = new GridBagConstraints();
			this.gridBagConstraintsProductosResumidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosResumidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosResumidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosResumidos);
			
			this.jInternalFrameOrderByProductosResumidos.getContentPane().add(this.jScrollPanelOrderByProductosResumidos, this.gridBagConstraintsProductosResumidos);			
		
		} else {
			this.jButtonAbrirOrderByProductosResumidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosresumidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosResumidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosResumidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosResumidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosResumidos.getRowHeight();//ProductosResumidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosResumidos.isSelected()) {
					iHeightTable=ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosResumidos.isSelected()) {
					iHeightTable=ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosResumidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosResumidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosResumidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosResumidos!=null && this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy()!=null) {
			//if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosResumidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosResumidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosResumidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosresumidosLogic.getProductosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosresumidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosResumidos> TraerProductosResumidosBeans(List<ProductosResumidos> productosresumidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosResumidos productosresumidos:productosresumidoss) {
					
				if(!(ProductosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosresumidos.setsDetalleGeneralEntityReporte(ProductosResumidosConstantesFunciones.getProductosResumidosDescripcion(productosresumidos));
										
						
					
						
					
				} else  {
							
					//productosresumidos.setsDetalleGeneralEntityReporte(productosresumidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosresumidosbeans.add(productosresumidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosresumidoss;
    }
	//PARA REPORTES FIN
}
