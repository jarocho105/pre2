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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ProductosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ProductosJInternalFrame extends ProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductos;
	
	protected JMenuBar jmenuBarProductos;
	
	protected JMenu jmenuProductos;
	protected JMenu jmenuDatosProductos;
	protected JMenu jmenuArchivoProductos;
	protected JMenu jmenuAccionesProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductos;	
	protected GridBagConstraints gridBagConstraintsProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosDetalleFormJInternalFrame jInternalFrameDetalleFormProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductosSessionBean productosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Productos> productoss;		
	public List<Productos> productossEliminados;	
	public List<Productos> productossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductos;		
	protected JButton jButtonAbrirOrderByProductos;
	
	
	//protected JPanel jPanelOrderByProductos;
	//public JScrollPane jScrollPanelOrderByProductos;	
	//protected JButton jButtonCerrarOrderByProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosLogic productosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductos;
	public JScrollPane jScrollPanelDatosEdicionProductos;
	public JScrollPane jScrollPanelDatosGeneralProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductos;
	//public JScrollPane jScrollPanelImportacionProductos;
	
	
	
	protected JPanel jPanelAccionesProductos;
	
    protected JPanel jPanelPaginacionProductos;
    protected JPanel jPanelParametrosReportesProductos;
	protected JPanel jPanelParametrosReportesAccionesProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Productos;
	protected JPanel jPanelParametrosAuxiliar2Productos;
	protected JPanel jPanelParametrosAuxiliar3Productos;
	protected JPanel jPanelParametrosAuxiliar4Productos;
	//protected JPanel jPanelParametrosAuxiliar5Productos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductos;
	//protected JPanel jPanelImportacionProductos;
	
	
	public JTable jTableDatosProductos;
	
	
	
	//public JTable jTableDatosProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductos;
	protected JButton jButtonDuplicarProductos;
	protected JButton jButtonCopiarProductos;
	protected JButton jButtonVerFormProductos;
	protected JButton jButtonNuevoRelacionesProductos;
	protected JButton jButtonModificarProductos;
	
    protected JButton jButtonGuardarCambiosTablaProductos;
	protected JButton jButtonCerrarProductos;
	
	
	protected JButton jButtonRecargarInformacionProductos;
	protected JButton jButtonProcesarInformacionProductos;
	
	
	protected JButton jButtonAnterioresProductos;
	protected JButton jButtonSiguientesProductos;
	protected JButton jButtonNuevoGuardarCambiosProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductos;
	//protected JButton jButtonCerrarReporteDinamicoProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductos;
	//protected JButton jButtonGenerarImportacionProductos;
	//protected JButton jButtonCerrarImportacionProductos;
	//protected JFileChooser jFileChooserImportacionProductos;
	//protected File fileImportacionProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductos;
	protected JButton jButtonDuplicarToolBarProductos;
	protected JButton jButtonNuevoRelacionesToolBarProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarProductos;
	protected JButton jButtonCopiarToolBarProductos;
	protected JButton jButtonVerFormToolBarProductos;
	public JButton jButtonGuardarCambiosTablaToolBarProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductos;
	protected JButton jButtonCerrarToolBarProductos;
	
	protected JButton jButtonRecargarInformacionToolBarProductos;
	protected JButton jButtonProcesarInformacionToolBarProductos;
	protected JButton jButtonAnterioresToolBarProductos;
	protected JButton jButtonSiguientesToolBarProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductos;
	protected JButton jButtonAbrirOrderByToolBarProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductos;
	protected JMenuItem jMenuItemDuplicarProductos;
	protected JMenuItem jMenuItemNuevoRelacionesProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductos;
	protected JMenuItem jMenuItemCopiarProductos;
	protected JMenuItem jMenuItemVerFormProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductos;
	protected JMenuItem jMenuItemCerrarProductos;
	protected JMenuItem jMenuItemDetalleCerrarProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionProductos;
	protected JMenuItem jMenuItemProcesarInformacionProductos;
	protected JMenuItem jMenuItemAnterioresProductos;
	protected JMenuItem jMenuItemSiguientesProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductos;
	protected JMenuItem jMenuItemAbrirOrderByProductos;
	protected JMenuItem jMenuItemMostrarOcultarProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductos;
	protected JCheckBox jCheckBoxSeleccionadosProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductos;
	protected JCheckBox jCheckBoxConGraficoReporteProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductos;
	protected JTextField jTextFieldValorCampoGeneralProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductos;
	//public JList<Reporte> jListColumnasSelectReporteProductos;
	//public JScrollPane jScrollColumnasSelectReporteProductos;
	
	//public JLabel jLabelRelacionesSelectReporteProductos;
	//public JList<Reporte> jListRelacionesSelectReporteProductos;
	//public JScrollPane jScrollRelacionesSelectReporteProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductos;
	
		
	//public JLabel jLabelArchivoImportacionProductos;	
	//public JLabel jLabelPathArchivoImportacionProductos;
	//protected JTextField jTextFieldPathArchivoImportacionProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductos;
	
	//public JLabel jLabelColumnaCategoriaValorProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductos;
	
	//public JLabel jLabelColumnasValoresGraficoProductos;
	//public JList<Reporte> jListColumnasValoresGraficoProductos;
	//public JScrollPane jScrollColumnasValoresGraficoProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductos;
	public JPanel jPanelBusquedaProductosProductos;
	public JButton jButtonBusquedaProductosProductos;
	
	public JPanel jPanelfecha_inicioBusquedaProductosProductos;
	public JLabel jLabelfecha_inicioBusquedaProductosProductos;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaProductosProductos;

	public JDateChooser jDateChooserfecha_inicioBusquedaProductosProductos;
	public JButton jButtonfecha_inicioBusquedaProductosProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaProductosProductos;
	public JLabel jLabelfecha_finBusquedaProductosProductos;
	//public JFormattedTextField jDateChooserfecha_finBusquedaProductosProductos;

	public JDateChooser jDateChooserfecha_finBusquedaProductosProductos;
	public JButton jButtonfecha_finBusquedaProductosProductosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductos)	{
		this.jButtonRecargarInformacionProductos = jButtonRecargarInformacionProductos;
	}
	
	public JButton getjButtonProcesarInformacionProductos() {
		return this.jButtonProcesarInformacionProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductos)	{
		this.jButtonProcesarInformacionProductos = jButtonProcesarInformacionProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionProductos() {
		return this.jButtonRecargarInformacionProductos;
	}
	
	
	public List<Productos> getproductoss() {
		return this.productoss;
	}

	public void setproductoss(List<Productos> productoss) {
		this.productoss = productoss;
	}
	
	public List<Productos> getproductossAux() {
		return this.productossAux;
	}

	public void setproductossAux(List<Productos> productossAux) {
		this.productossAux = productossAux;
	}
	
	public List<Productos> getproductossEliminados() {
		return this.productossEliminados;
	}

	public void setProductossEliminados(List<Productos> productossEliminados) {
		this.productossEliminados = productossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductos() {
		return jComboBoxTiposSeleccionarProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductos(
			JComboBox jComboBoxTiposSeleccionarProductos) {
		this.jComboBoxTiposSeleccionarProductos = jComboBoxTiposSeleccionarProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductos() {
		return jTextFieldValorCampoGeneralProductos;
	}

	public void setjTextFieldValorCampoGeneralProductos(
			JTextField jTextFieldValorCampoGeneralProductos) {
		this.jTextFieldValorCampoGeneralProductos = jTextFieldValorCampoGeneralProductos;
	}

	public void setBorderResaltarValorCampoGeneralProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductos() {
		return this.jCheckBoxSeleccionarTodosProductos;
	}

	public void setjCheckBoxSeleccionarTodosProductos(
			JCheckBox jCheckBoxSeleccionarTodosProductos) {
		this.jCheckBoxSeleccionarTodosProductos = jCheckBoxSeleccionarTodosProductos;
	}

	public void setBorderResaltarSeleccionarTodosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductos() {
		return this.jCheckBoxSeleccionadosProductos;
	}

	public void setjCheckBoxSeleccionadosProductos(
			JCheckBox jCheckBoxSeleccionadosProductos) {
		this.jCheckBoxSeleccionadosProductos = jCheckBoxSeleccionadosProductos;
	}
	
	public void setBorderResaltarSeleccionadosProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductos() {
		return this.jComboBoxTiposArchivosReportesProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductos(
			JComboBox jComboBoxTiposArchivosReportesProductos) {
		this.jComboBoxTiposArchivosReportesProductos = jComboBoxTiposArchivosReportesProductos;
	}

	public void setBorderResaltarTiposArchivosReportesProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductos() {
		return this.jComboBoxTiposReportesProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductos(
			JComboBox jComboBoxTiposReportesProductos) {
		this.jComboBoxTiposReportesProductos = jComboBoxTiposReportesProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductos() {
	//	return jComboBoxTiposReportesDinamicoProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoProductos) {
	//	this.jComboBoxTiposReportesDinamicoProductos = jComboBoxTiposReportesDinamicoProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductos = jComboBoxTiposArchivosReportesDinamicoProductos;
	//}
	
	public void setBorderResaltarTiposReportesProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductos() {
		return this.jComboBoxTiposGraficosReportesProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductos(
			JComboBox jComboBoxTiposGraficosReportesProductos) {
		this.jComboBoxTiposGraficosReportesProductos = jComboBoxTiposGraficosReportesProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductos() {
		return this.jComboBoxTiposPaginacionProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductos(
			JComboBox jComboBoxTiposPaginacionProductos) {
		this.jComboBoxTiposPaginacionProductos = jComboBoxTiposPaginacionProductos;
	}
	
	public void setBorderResaltarTiposPaginacionProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductos() {
		return this.jComboBoxTiposRelacionesProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductos() {
		return this.jComboBoxTiposAccionesProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductos(
			JComboBox jComboBoxTiposRelacionesProductos) {
		this.jComboBoxTiposRelacionesProductos = jComboBoxTiposRelacionesProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductos(
			JComboBox jComboBoxTiposAccionesProductos) {
		this.jComboBoxTiposAccionesProductos = jComboBoxTiposAccionesProductos;
	}
	
	public void setBorderResaltarTiposRelacionesProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductos() {
	//	return jCheckBoxConGraficoDinamicoProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductos) {
	//	this.jCheckBoxConGraficoDinamicoProductos = jCheckBoxConGraficoDinamicoProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductos .setBorder(borderResaltar);		
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
		this.productosSessionBean=new ProductosSessionBean();
		
		this.productosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Productos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductos,this.jTtoolBarProductos,
							"nuevo","nuevo","Nuevo"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductos,this.jTtoolBarProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductos,this.jTtoolBarProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductos,this.jTtoolBarProductos,
							"duplicar","duplicar","Duplicar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductos,this.jTtoolBarProductos,
							"copiar","copiar","Copiar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductos,this.jTtoolBarProductos,
							"ver_form","ver_form","Ver"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductos,this.jTtoolBarProductos,
							"recargar","recargar","Buscar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductos,this.jTtoolBarProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductos,this.jTtoolBarProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductos,this.jTtoolBarProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductos,this.jTtoolBarProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductos,this.jTtoolBarProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductos,this.jTtoolBarProductos,
							"cerrar","cerrar","Salir"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductos;
			
				this.jButtonProcesarInformacionToolBarProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductos;
				
		//protected JButton jButtonModificarToolBarProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductos=new JMenuMe("General");
		this.jmenuArchivoProductos=new JMenuMe("Archivo");
		this.jmenuAccionesProductos=new JMenuMe("Acciones");
		this.jmenuDatosProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductos.add(this.jMenuItemCerrarProductos);
			
			this.jmenuAccionesProductos.add(this.jMenuItemNuevoProductos);
			this.jmenuAccionesProductos.add(this.jMenuItemNuevoGuardarCambiosProductos);
			this.jmenuAccionesProductos.add(this.jMenuItemNuevoRelacionesProductos);
			this.jmenuAccionesProductos.add(this.jMenuItemGuardarCambiosTablaProductos);		
			this.jmenuAccionesProductos.add(this.jMenuItemDuplicarProductos);		
			this.jmenuAccionesProductos.add(this.jMenuItemCopiarProductos);		
			this.jmenuAccionesProductos.add(this.jMenuItemVerFormProductos);		
			
			this.jmenuDatosProductos.add(this.jMenuItemRecargarInformacionProductos);				
			this.jmenuDatosProductos.add(this.jMenuItemAnterioresProductos);				
			this.jmenuDatosProductos.add(this.jMenuItemSiguientesProductos);				
			this.jmenuDatosProductos.add(this.jMenuItemAbrirOrderByProductos);				
			this.jmenuDatosProductos.add(this.jMenuItemMostrarOcultarProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductos.add(this.jMenuItemGuardarCambiosProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductos.add(this.jmenuArchivoProductos);		
			this.jmenuBarProductos.add(this.jmenuAccionesProductos);		
			this.jmenuBarProductos.add(this.jmenuDatosProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosProductos.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaProductosProductos= new JButtonMe();
		this.jButtonBusquedaProductosProductos.setText("Buscar");
		this.jButtonBusquedaProductosProductos.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosProductos,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaProductosProductos = new JLabelMe();
		jLabelfecha_inicioBusquedaProductosProductos.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaProductosProductos.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaProductosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProductosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProductosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaProductosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaProductosProductos= new JDateChooser();
		jDateChooserfecha_inicioBusquedaProductosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProductosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProductosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaProductosProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaProductosProductos.setDate(new Date());
		jDateChooserfecha_inicioBusquedaProductosProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaProductosProductos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaProductosProductos = new JLabelMe();
		jLabelfecha_finBusquedaProductosProductos.setText("Fecha Fin :");
		jLabelfecha_finBusquedaProductosProductos.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaProductosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProductosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProductosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaProductosProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaProductosProductos= new JDateChooser();
		jDateChooserfecha_finBusquedaProductosProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProductosProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProductosProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaProductosProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaProductosProductos.setDate(new Date());
		jDateChooserfecha_finBusquedaProductosProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaProductosProductos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductos = new ProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos DATOS");
			this.jInternalFrameDetalleFormProductos = new ProductosDetalleFormJInternalFrame(jDesktopPane,this.productosSessionBean.getConGuardarRelaciones(),this.productosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductos = null;//new ProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductos= new GridBagLayout();
		
		
		this.jTableDatosProductos = new JTableMe();      
		
		String sToolTipProductos="";
		sToolTipProductos=ProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductos+="(PuntoVenta.Productos)";
		}
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductos.setToolTipText(sToolTipProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductos);
		this.jTableDatosProductos.setAutoCreateRowSorter(true);
		this.jTableDatosProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductos.setRowSelectionAllowed(true);
		this.jTableDatosProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductos = new JButtonMe();
		this.jButtonDuplicarProductos = new JButtonMe();
		this.jButtonCopiarProductos = new JButtonMe();
		this.jButtonVerFormProductos = new JButtonMe();
		this.jButtonNuevoRelacionesProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductos = new JButtonMe();
		this.jButtonCerrarProductos = new JButtonMe();
		
		this.jScrollPanelDatosProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos";
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductos.setToolTipText("Acciones");
        this.jPanelAccionesProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductos=new ReporteDinamicoJInternalFrame(ProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductos=new ImportacionJInternalFrame(ProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByProductos.setText("Orden");
		this.jButtonAbrirOrderByProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductos,false,this);
			
			//this.cargarOrderByProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductos,true,this);
			
			//this.cargarOrderByProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductos.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosProductos.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosProductos.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductos.setText("Nuevo");
		this.jButtonDuplicarProductos.setText("Duplicar");
		this.jButtonCopiarProductos.setText("Copiar");
		this.jButtonVerFormProductos.setText("Ver");
		this.jButtonNuevoRelacionesProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductos.setText("Guardar");
		this.jButtonCerrarProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductos,"nuevo_button","Nuevo",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductos,"duplicar_button","Duplicar",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductos,"copiar_button","Copiar",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductos,"ver_form","Ver",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductos,"nuevorelaciones_button","Nuevo Rel",this.productosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductos,"guardarcambiostabla_button","Guardar",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductos,"cerrar_button","Salir",this.productosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductos.setToolTipText("Nuevo"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductos.setToolTipText("Duplicar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductos.setToolTipText("Copiar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductos.setToolTipText("Ver"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductos.setToolTipText("Nuevo Rel"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductos.setToolTipText("Guardar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductos.setToolTipText("Salir"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductos";
		inputMap = this.jButtonNuevoProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductos";
		inputMap = this.jButtonDuplicarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductos"));
		
		//COPIAR
		sMapKey = "CopiarProductos";
		inputMap = this.jButtonCopiarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductos"));
		
		//VEr FORM
		sMapKey = "VerFormProductos";
		inputMap = this.jButtonVerFormProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductos";
		inputMap = this.jButtonNuevoRelacionesProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductos";
		inputMap = this.jButtonModificarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductos";
		inputMap = this.jButtonCerrarProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductos";
		inputMap = this.jButtonGuardarCambiosTablaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Productos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Productos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Productos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Productos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Productos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductos.setName("jPanelParametrosReportesProductos"); 
		
		this.jPanelParametrosReportesAccionesProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductos.setName("jPanelParametrosReportesAccionesProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductos = new JButtonMe();
		this.jButtonRecargarInformacionProductos.setText("Buscar");
		this.jButtonRecargarInformacionProductos.setToolTipText("Buscar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductos = new JButtonMe();
		this.jButtonProcesarInformacionProductos.setText("Procesar");
		this.jButtonProcesarInformacionProductos.setToolTipText("Procesar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductos.setVisible(false);
			
		this.jButtonProcesarInformacionProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductos.setText("TIPO");       
		this.jComboBoxTiposReportesProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductos.setText("Accion");
		this.jComboBoxTiposRelacionesProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductos.setText("Accion");
		this.jComboBoxTiposAccionesProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductos = new JLabelMe();
		
		this.jLabelAccionesProductos.setText("Acciones");		
		this.jLabelAccionesProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductos = new JButtonMe();
		//this.jButtonAnterioresProductos.setText("<<");
        this.jButtonAnterioresProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductos = new JButtonMe();
		//this.jButtonSiguientesProductos.setText(">>");
        this.jButtonSiguientesProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductos,"nuevoguardarcambios_button","Nue",this.productosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductos";
		inputMap = this.jButtonNuevoGuardarCambiosProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductos";
		inputMap = this.jButtonRecargarInformacionProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductos";
		inputMap = this.jButtonSiguientesProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductos";
		inputMap = this.jButtonAnterioresProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductos.setMinimumSize(new Dimension(this.getWidth(),ProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductos.setMaximumSize(new Dimension(this.getWidth(),ProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductos.setPreferredSize(new Dimension(this.getWidth(),ProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductos = new GridBagLayout();

			this.jPanelPaginacionProductos.setLayout(gridaBagLayoutPaginacionProductos);						
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 0;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductos.add(this.jButtonAnterioresProductos, this.gridBagConstraintsProductos);
					
						
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductos.gridy = 0;
			
			this.jPanelPaginacionProductos.add(this.jButtonNuevoGuardarCambiosProductos, this.gridBagConstraintsProductos);
						
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductos.gridy = 0;
			this.jPanelPaginacionProductos.add(this.jButtonSiguientesProductos, this.gridBagConstraintsProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 1;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductos.add(this.jButtonNuevoProductos, this.gridBagConstraintsProductos);
						
			
			
			if(!this.productosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductos = new GridBagConstraints();
				this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductos.gridy = 1;
				this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductos.add(this.jButtonGuardarCambiosTablaProductos, this.gridBagConstraintsProductos);
			}
			
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 1;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductos.add(this.jButtonDuplicarProductos, this.gridBagConstraintsProductos);
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 1;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductos.add(this.jButtonCopiarProductos, this.gridBagConstraintsProductos);
		
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 1;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductos.add(this.jButtonVerFormProductos, this.gridBagConstraintsProductos);
		
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 1;
			this.gridBagConstraintsProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductos.add(this.jButtonCerrarProductos, this.gridBagConstraintsProductos);
		
		
		
		this.jButtonRecargarInformacionProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Productos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Productos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Productos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Productos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductos.setLayout(gridaBagParametrosReportesProductos);
			this.jPanelParametrosReportesAccionesProductos.setLayout(gridaBagParametrosReportesAccionesProductos);
			
			
			this.jPanelParametrosAuxiliar1Productos.setLayout(gridaBagParametrosAuxiliar1Productos);
			this.jPanelParametrosAuxiliar2Productos.setLayout(gridaBagParametrosAuxiliar2Productos);
			this.jPanelParametrosAuxiliar3Productos.setLayout(gridaBagParametrosAuxiliar3Productos);
			this.jPanelParametrosAuxiliar4Productos.setLayout(gridaBagParametrosAuxiliar4Productos);
			//this.jPanelParametrosAuxiliar5Productos.setLayout(gridaBagParametrosAuxiliar2Productos);			
			
			
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductos.add(this.jButtonRecargarInformacionProductos, this.gridBagConstraintsProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Productos.add(this.jComboBoxTiposPaginacionProductos, this.gridBagConstraintsProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Productos.add(this.jCheckBoxConAltoMaximoTablaProductos, this.gridBagConstraintsProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Productos.add(this.jComboBoxTiposArchivosReportesProductos, this.gridBagConstraintsProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductos.add(this.jPanelParametrosAuxiliar1Productos, this.gridBagConstraintsProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Productos.add(this.jComboBoxTiposReportesProductos, this.gridBagConstraintsProductos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductos.add(this.jPanelParametrosAuxiliar4Productos, this.gridBagConstraintsProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductos.add(this.jComboBoxTiposReportesProductos, this.gridBagConstraintsProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductos.add(this.jCheckBoxGenerarReporteProductos, this.gridBagConstraintsProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductos.add(this.jPanelParametrosAuxiliar2Productos, this.gridBagConstraintsProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductos.add(this.jLabelAccionesProductos, this.gridBagConstraintsProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductos = new GridBagConstraints();
				this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductos.add(this.jButtonAbrirOrderByProductos, this.gridBagConstraintsProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductos.add(this.jComboBoxTiposSeleccionarProductos, this.gridBagConstraintsProductos);			
			
			
			/*
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductos.add(this.jCheckBoxSeleccionarTodosProductos, this.gridBagConstraintsProductos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Productos.add(this.jCheckBoxSeleccionarTodosProductos, this.gridBagConstraintsProductos);															
				
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Productos.add(this.jCheckBoxSeleccionadosProductos, this.gridBagConstraintsProductos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductos.add(this.jPanelParametrosAuxiliar3Productos, this.gridBagConstraintsProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductos.add(this.jComboBoxTiposAccionesProductos, this.gridBagConstraintsProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductos = new GridBagLayout();

			this.jScrollPanelDatosProductos.setLayout(gridaBagLayoutDatosProductos);
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = 0;
			this.gridBagConstraintsProductos.gridx = 0;
			
			this.jScrollPanelDatosProductos.add(this.jTableDatosProductos, this.gridBagConstraintsProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductos.setViewportView(this.jTableDatosProductos);
		this.jTableDatosProductos.setFillsViewportHeight(true);
		this.jTableDatosProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductos= new GridBagLayout();
		this.jPanelAccionesProductos.setLayout(gridaBagLayoutAccionesProductos);
		
		
		/*	
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = 0;
		this.gridBagConstraintsProductos.gridx = 0;
			
		this.jPanelAccionesProductos.add(this.jButtonNuevoProductos, this.gridBagConstraintsProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosProductos= new GridBagLayout();
		gridaBagLayoutBusquedaProductosProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosProductos.setLayout(gridaBagLayoutBusquedaProductosProductos);

		gridBagConstraintsProductos = new GridBagConstraints();
		gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductos.gridy = 0;
		gridBagConstraintsProductos.gridx = 0;
		jPanelBusquedaProductosProductos.add(jLabelfecha_inicioBusquedaProductosProductos, gridBagConstraintsProductos);

		gridBagConstraintsProductos = new GridBagConstraints();
		gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductos.gridy = 0;
		gridBagConstraintsProductos.gridx = 1;
		jPanelBusquedaProductosProductos.add(jDateChooserfecha_inicioBusquedaProductosProductos, gridBagConstraintsProductos);


		gridBagConstraintsProductos = new GridBagConstraints();
		gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductos.gridy = 1;
		gridBagConstraintsProductos.gridx = 0;
		jPanelBusquedaProductosProductos.add(jLabelfecha_finBusquedaProductosProductos, gridBagConstraintsProductos);

		gridBagConstraintsProductos = new GridBagConstraints();
		gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductos.gridy = 1;
		gridBagConstraintsProductos.gridx = 1;
		jPanelBusquedaProductosProductos.add(jDateChooserfecha_finBusquedaProductosProductos, gridBagConstraintsProductos);

		gridBagConstraintsProductos = new GridBagConstraints();
		gridBagConstraintsProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductos.gridy = 2;
		gridBagConstraintsProductos.gridx =1;
		jPanelBusquedaProductosProductos.add(jButtonBusquedaProductosProductos, gridBagConstraintsProductos);

		jTabbedPaneBusquedasProductos.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaProductosProductos);
		jTabbedPaneBusquedasProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductos = new GridBagConstraints();						
			this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductos.gridx = 0;		
			//this.gridBagConstraintsProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductos, this.gridBagConstraintsProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductos.gridx = 0;		
		//this.gridBagConstraintsProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductos.gridx = 0;		
			this.gridBagConstraintsProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductos, this.gridBagConstraintsProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductos, this.gridBagConstraintsProductos);								
		
		
		/*
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductos, this.gridBagConstraintsProductos);
		*/		
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductos.gridx =0;
		this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductos, this.gridBagConstraintsProductos);
				
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductos, this.gridBagConstraintsProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosProductos.setLayout(gridaBagLayoutBusquedasParametrosProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductos, this.gridBagConstraintsProductos);
			
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductos, this.gridBagConstraintsProductos);
		
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductos, this.gridBagConstraintsProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductos.setName("jPanelReporteDinamicoProductos"); 
		
		this.jPanelReporteDinamicoProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductos.setLayout(gridaBagLayoutReporteDinamicoProductos);
		
		
		this.jInternalFrameReporteDinamicoProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductos.add(this.jLabelColumnasSelectReporteProductos, this.gridBagConstraintsProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductos=new JScrollPane(this.jListColumnasSelectReporteProductos);
			
			this.jScrollColumnasSelectReporteProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductos.add(this.jListColumnasSelectReporteProductos, this.gridBagConstraintsProductos);
		this.jPanelReporteDinamicoProductos.add(this.jScrollColumnasSelectReporteProductos, this.gridBagConstraintsProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductos=new JScrollPane(this.jListRelacionesSelectReporteProductos);
			
			this.jScrollRelacionesSelectReporteProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductos.add(this.jLabelGenerarExcelReporteDinamicoProductos, this.gridBagConstraintsProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductos.setToolTipText("Generar EXCEL"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductos = new GridBagConstraints();
		//this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductos.add(this.jButtonGenerarExcelReporteDinamicoProductos, this.gridBagConstraintsProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductos.add(this.jComboBoxTiposReportesDinamicoProductos, this.gridBagConstraintsProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductos.add(this.jLabelTiposArchivoReporteDinamicoProductos, this.gridBagConstraintsProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductos.add(this.jComboBoxTiposArchivosReportesDinamicoProductos, this.gridBagConstraintsProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductos.setToolTipText("Generar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductos.add(this.jButtonGenerarReporteDinamicoProductos, this.gridBagConstraintsProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductos.setToolTipText("Cancelar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductos.add(this.jButtonCerrarReporteDinamicoProductos, this.gridBagConstraintsProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductos= new JScrollPane(jPanelReporteDinamicoProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductos);
		this.jInternalFrameReporteDinamicoProductos.getContentPane().add(this.jScrollPanelReporteDinamicoProductos, this.gridBagConstraintsProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductos.setName("jPanelImportacionProductos"); 
		
		this.jPanelImportacionProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductos.setLayout(gridaBagLayoutImportacionProductos);
		
		
		this.jInternalFrameImportacionProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductos.setResizable(true);
	    this.jInternalFrameImportacionProductos.setClosable(true);
	    this.jInternalFrameImportacionProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductos.setResizable(true);
	    this.jInternalFrameImportacionProductos.setClosable(true);
	    this.jInternalFrameImportacionProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductos = new JLabelMe();

		this.jLabelArchivoImportacionProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductos.add(this.jLabelArchivoImportacionProductos, this.gridBagConstraintsProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductos = new JFileChooser();		
		this.jFileChooserImportacionProductos.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductos = new JButtonMe();
		this.jButtonAbrirImportacionProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductos.setToolTipText("Generar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductos.add(this.jButtonAbrirImportacionProductos, this.gridBagConstraintsProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductos.add(this.jLabelPathArchivoImportacionProductos, this.gridBagConstraintsProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductos.add(this.jTextFieldPathArchivoImportacionProductos, this.gridBagConstraintsProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductos = new JButtonMe();
		this.jButtonGenerarImportacionProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductos.setToolTipText("Generar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductos.add(this.jButtonGenerarImportacionProductos, this.gridBagConstraintsProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductos = new JButtonMe();
		this.jButtonCerrarImportacionProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductos.setToolTipText("Cancelar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductos.add(this.jButtonCerrarImportacionProductos, this.gridBagConstraintsProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionProductos= new JScrollPane(jPanelImportacionProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductos = new GridBagConstraints();
		this.gridBagConstraintsProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductos);
		this.jInternalFrameImportacionProductos.getContentPane().add(this.jScrollPanelImportacionProductos, this.gridBagConstraintsProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductos = new JButtonMe();
			this.jButtonAbrirOrderByProductos.setText("Orden");
			this.jButtonAbrirOrderByProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductos";
			inputMap = this.jButtonAbrirOrderByProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductos.setName("jPanelOrderByProductos"); 
			
			this.jPanelOrderByProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductos.setLayout(gridaBagLayoutOrderByProductos);
			
			
			this.jTableDatosProductosOrderBy = new JTableMe();        
			this.jTableDatosProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosOrderBy.setViewportView(this.jTableDatosProductosOrderBy);
			this.jTableDatosProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductos.setTitle("Orden");
			this.jInternalFrameOrderByProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductos.setResizable(true);
			this.jInternalFrameOrderByProductos.setClosable(true);
			this.jInternalFrameOrderByProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductos.ipady =150;
				
			this.jPanelOrderByProductos.add(jScrollPanelDatosProductosOrderBy, this.gridBagConstraintsProductos);//this.jTableDatosProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductos = new JButtonMe();
			this.jButtonCerrarOrderByProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductos.setToolTipText("Cancelar"+" "+ProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductos.add(this.jButtonCerrarOrderByProductos, this.gridBagConstraintsProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByProductos= new JScrollPane(jPanelOrderByProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductos = new GridBagConstraints();
			this.gridBagConstraintsProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductos);
			
			this.jInternalFrameOrderByProductos.getContentPane().add(this.jScrollPanelOrderByProductos, this.gridBagConstraintsProductos);			
		
		} else {
			this.jButtonAbrirOrderByProductos = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductos.getRowHeight();//ProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductos.isSelected()) {
					iHeightTable=ProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductos.isSelected()) {
					iHeightTable=ProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductos!=null && this.jInternalFrameOrderByProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.productosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosLogic.getProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Productos> TraerProductosBeans(List<Productos> productoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(Productos productos:productoss) {
					
				if(!(ProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productos.setsDetalleGeneralEntityReporte(ProductosConstantesFunciones.getProductosDescripcion(productos));
										
						
					
						
					
				} else  {
							
					//productos.setsDetalleGeneralEntityReporte(productos.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosbeans.add(productosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoss;
    }
	//PARA REPORTES FIN
}
