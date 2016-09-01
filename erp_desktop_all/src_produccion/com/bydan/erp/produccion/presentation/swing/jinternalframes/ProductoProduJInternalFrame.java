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
import com.bydan.erp.produccion.util.ProductoProduConstantesFunciones;

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
public class ProductoProduJInternalFrame extends ProductoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProdu;
	
	protected JMenuBar jmenuBarProductoProdu;
	
	protected JMenu jmenuProductoProdu;
	protected JMenu jmenuDatosProductoProdu;
	protected JMenu jmenuArchivoProductoProdu;
	protected JMenu jmenuAccionesProductoProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProdu;	
	protected GridBagConstraints gridBagConstraintsProductoProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProduDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduSessionBean productoproduSessionBean;
		
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProdu> productoprodus;		
	public List<ProductoProdu> productoprodusEliminados;	
	public List<ProductoProdu> productoprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProdu;		
	protected JButton jButtonAbrirOrderByProductoProdu;
	
	
	//protected JPanel jPanelOrderByProductoProdu;
	//public JScrollPane jScrollPanelOrderByProductoProdu;	
	//protected JButton jButtonCerrarOrderByProductoProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProduLogic productoproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProdu;
	//public JScrollPane jScrollPanelImportacionProductoProdu;
	
	
	
	protected JPanel jPanelAccionesProductoProdu;
	
    protected JPanel jPanelPaginacionProductoProdu;
    protected JPanel jPanelParametrosReportesProductoProdu;
	protected JPanel jPanelParametrosReportesAccionesProductoProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProdu;
	protected JPanel jPanelParametrosAuxiliar2ProductoProdu;
	protected JPanel jPanelParametrosAuxiliar3ProductoProdu;
	protected JPanel jPanelParametrosAuxiliar4ProductoProdu;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProdu;
	//protected JPanel jPanelImportacionProductoProdu;
	
	
	public JTable jTableDatosProductoProdu;
	
	
	
	//public JTable jTableDatosProductoProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProdu;
	protected JButton jButtonDuplicarProductoProdu;
	protected JButton jButtonCopiarProductoProdu;
	protected JButton jButtonVerFormProductoProdu;
	protected JButton jButtonNuevoRelacionesProductoProdu;
	protected JButton jButtonModificarProductoProdu;
	
    protected JButton jButtonGuardarCambiosTablaProductoProdu;
	protected JButton jButtonCerrarProductoProdu;
	
	
	protected JButton jButtonRecargarInformacionProductoProdu;
	protected JButton jButtonProcesarInformacionProductoProdu;
	
	
	protected JButton jButtonAnterioresProductoProdu;
	protected JButton jButtonSiguientesProductoProdu;
	protected JButton jButtonNuevoGuardarCambiosProductoProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProdu;
	//protected JButton jButtonCerrarReporteDinamicoProductoProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProdu;
	//protected JButton jButtonGenerarImportacionProductoProdu;
	//protected JButton jButtonCerrarImportacionProductoProdu;
	//protected JFileChooser jFileChooserImportacionProductoProdu;
	//protected File fileImportacionProductoProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProdu;
	protected JButton jButtonDuplicarToolBarProductoProdu;
	protected JButton jButtonNuevoRelacionesToolBarProductoProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProdu;
	protected JButton jButtonCopiarToolBarProductoProdu;
	protected JButton jButtonVerFormToolBarProductoProdu;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProdu;
	protected JButton jButtonCerrarToolBarProductoProdu;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProdu;
	protected JButton jButtonProcesarInformacionToolBarProductoProdu;
	protected JButton jButtonAnterioresToolBarProductoProdu;
	protected JButton jButtonSiguientesToolBarProductoProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProdu;
	protected JButton jButtonAbrirOrderByToolBarProductoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProdu;
	protected JMenuItem jMenuItemDuplicarProductoProdu;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProdu;
	protected JMenuItem jMenuItemCopiarProductoProdu;
	protected JMenuItem jMenuItemVerFormProductoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProdu;
	protected JMenuItem jMenuItemCerrarProductoProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProdu;
	protected JMenuItem jMenuItemProcesarInformacionProductoProdu;
	protected JMenuItem jMenuItemAnterioresProductoProdu;
	protected JMenuItem jMenuItemSiguientesProductoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProdu;
	protected JMenuItem jMenuItemAbrirOrderByProductoProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProdu;
	protected JCheckBox jCheckBoxSeleccionadosProductoProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProdu;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProdu;
	protected JTextField jTextFieldValorCampoGeneralProductoProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProdu;
	//public JList<Reporte> jListColumnasSelectReporteProductoProdu;
	//public JScrollPane jScrollColumnasSelectReporteProductoProdu;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProdu;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProdu;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProdu;
	
		
	//public JLabel jLabelArchivoImportacionProductoProdu;	
	//public JLabel jLabelPathArchivoImportacionProductoProdu;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProdu;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProdu;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProdu;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProdu;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProdu;
	public JPanel jPanelFK_IdBodegaProductoProdu;
	public JButton jButtonFK_IdBodegaProductoProdu;
	public JPanel jPanelFK_IdProductoProductoProdu;
	public JButton jButtonFK_IdProductoProductoProdu;
	public JPanel jPanelFK_IdProductoDefiProduProductoProdu;
	public JButton jButtonFK_IdProductoDefiProduProductoProdu;
	public JPanel jPanelFK_IdUnidadUnadProductoProdu;
	public JButton jButtonFK_IdUnidadUnadProductoProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoProdu;
	public JButton jButtonid_bodegaFK_IdBodegaProductoProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoProdu;
	public JLabel jLabelid_productoFK_IdProductoProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoProdu;
	public JButton jButtonid_productoFK_IdProductoProductoProdu= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoProdu;
	
	public JPanel jPanelid_producto_defi_produFK_IdProductoDefiProduProductoProdu;
	public JLabel jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu;
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProdu= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadUnadProductoProdu;
	public JLabel jLabelid_unidadFK_IdUnidadUnadProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadUnadProductoProdu;
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoProdu= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadUnadProductoProduBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProdu)	{
		this.jButtonRecargarInformacionProductoProdu = jButtonRecargarInformacionProductoProdu;
	}
	
	public JButton getjButtonProcesarInformacionProductoProdu() {
		return this.jButtonProcesarInformacionProductoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProdu)	{
		this.jButtonProcesarInformacionProductoProdu = jButtonProcesarInformacionProductoProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProdu() {
		return this.jButtonRecargarInformacionProductoProdu;
	}
	
	
	public List<ProductoProdu> getproductoprodus() {
		return this.productoprodus;
	}

	public void setproductoprodus(List<ProductoProdu> productoprodus) {
		this.productoprodus = productoprodus;
	}
	
	public List<ProductoProdu> getproductoprodusAux() {
		return this.productoprodusAux;
	}

	public void setproductoprodusAux(List<ProductoProdu> productoprodusAux) {
		this.productoprodusAux = productoprodusAux;
	}
	
	public List<ProductoProdu> getproductoprodusEliminados() {
		return this.productoprodusEliminados;
	}

	public void setProductoProdusEliminados(List<ProductoProdu> productoprodusEliminados) {
		this.productoprodusEliminados = productoprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProdu() {
		return jComboBoxTiposSeleccionarProductoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProdu(
			JComboBox jComboBoxTiposSeleccionarProductoProdu) {
		this.jComboBoxTiposSeleccionarProductoProdu = jComboBoxTiposSeleccionarProductoProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProdu() {
		return jTextFieldValorCampoGeneralProductoProdu;
	}

	public void setjTextFieldValorCampoGeneralProductoProdu(
			JTextField jTextFieldValorCampoGeneralProductoProdu) {
		this.jTextFieldValorCampoGeneralProductoProdu = jTextFieldValorCampoGeneralProductoProdu;
	}

	public void setBorderResaltarValorCampoGeneralProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProdu() {
		return this.jCheckBoxSeleccionarTodosProductoProdu;
	}

	public void setjCheckBoxSeleccionarTodosProductoProdu(
			JCheckBox jCheckBoxSeleccionarTodosProductoProdu) {
		this.jCheckBoxSeleccionarTodosProductoProdu = jCheckBoxSeleccionarTodosProductoProdu;
	}

	public void setBorderResaltarSeleccionarTodosProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProdu() {
		return this.jCheckBoxSeleccionadosProductoProdu;
	}

	public void setjCheckBoxSeleccionadosProductoProdu(
			JCheckBox jCheckBoxSeleccionadosProductoProdu) {
		this.jCheckBoxSeleccionadosProductoProdu = jCheckBoxSeleccionadosProductoProdu;
	}
	
	public void setBorderResaltarSeleccionadosProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProdu() {
		return this.jComboBoxTiposArchivosReportesProductoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProdu(
			JComboBox jComboBoxTiposArchivosReportesProductoProdu) {
		this.jComboBoxTiposArchivosReportesProductoProdu = jComboBoxTiposArchivosReportesProductoProdu;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProdu() {
		return this.jComboBoxTiposReportesProductoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProdu(
			JComboBox jComboBoxTiposReportesProductoProdu) {
		this.jComboBoxTiposReportesProductoProdu = jComboBoxTiposReportesProductoProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProdu() {
	//	return jComboBoxTiposReportesDinamicoProductoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProdu) {
	//	this.jComboBoxTiposReportesDinamicoProductoProdu = jComboBoxTiposReportesDinamicoProductoProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProdu = jComboBoxTiposArchivosReportesDinamicoProductoProdu;
	//}
	
	public void setBorderResaltarTiposReportesProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProdu() {
		return this.jComboBoxTiposGraficosReportesProductoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProdu(
			JComboBox jComboBoxTiposGraficosReportesProductoProdu) {
		this.jComboBoxTiposGraficosReportesProductoProdu = jComboBoxTiposGraficosReportesProductoProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProdu() {
		return this.jComboBoxTiposPaginacionProductoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProdu(
			JComboBox jComboBoxTiposPaginacionProductoProdu) {
		this.jComboBoxTiposPaginacionProductoProdu = jComboBoxTiposPaginacionProductoProdu;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProdu() {
		return this.jComboBoxTiposRelacionesProductoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProdu() {
		return this.jComboBoxTiposAccionesProductoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProdu(
			JComboBox jComboBoxTiposRelacionesProductoProdu) {
		this.jComboBoxTiposRelacionesProductoProdu = jComboBoxTiposRelacionesProductoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProdu(
			JComboBox jComboBoxTiposAccionesProductoProdu) {
		this.jComboBoxTiposAccionesProductoProdu = jComboBoxTiposAccionesProductoProdu;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProdu() {
	//	return jCheckBoxConGraficoDinamicoProductoProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProdu) {
	//	this.jCheckBoxConGraficoDinamicoProductoProdu = jCheckBoxConGraficoDinamicoProductoProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProdu .setBorder(borderResaltar);		
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
		this.productoproduSessionBean=new ProductoProduSessionBean();
		
		this.productoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Parte Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"nuevo","nuevo","Nuevo"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"duplicar","duplicar","Duplicar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"copiar","copiar","Copiar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"ver_form","ver_form","Ver"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"recargar","recargar","Recargar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProdu,this.jTtoolBarProductoProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProdu,this.jTtoolBarProductoProdu,
							"cerrar","cerrar","Salir"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProdu;
			
				this.jButtonProcesarInformacionToolBarProductoProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProdu;
				
		//protected JButton jButtonModificarToolBarProductoProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProdu=new JMenuMe("General");
		this.jmenuArchivoProductoProdu=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProdu=new JMenuMe("Acciones");
		this.jmenuDatosProductoProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProdu.add(this.jMenuItemCerrarProductoProdu);
			
			this.jmenuAccionesProductoProdu.add(this.jMenuItemNuevoProductoProdu);
			this.jmenuAccionesProductoProdu.add(this.jMenuItemNuevoGuardarCambiosProductoProdu);
			this.jmenuAccionesProductoProdu.add(this.jMenuItemNuevoRelacionesProductoProdu);
			this.jmenuAccionesProductoProdu.add(this.jMenuItemGuardarCambiosTablaProductoProdu);		
			this.jmenuAccionesProductoProdu.add(this.jMenuItemDuplicarProductoProdu);		
			this.jmenuAccionesProductoProdu.add(this.jMenuItemCopiarProductoProdu);		
			this.jmenuAccionesProductoProdu.add(this.jMenuItemVerFormProductoProdu);		
			
			this.jmenuDatosProductoProdu.add(this.jMenuItemRecargarInformacionProductoProdu);				
			this.jmenuDatosProductoProdu.add(this.jMenuItemAnterioresProductoProdu);				
			this.jmenuDatosProductoProdu.add(this.jMenuItemSiguientesProductoProdu);				
			this.jmenuDatosProductoProdu.add(this.jMenuItemAbrirOrderByProductoProdu);				
			this.jmenuDatosProductoProdu.add(this.jMenuItemMostrarOcultarProductoProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProdu.add(this.jMenuItemGuardarCambiosProductoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProdu.add(this.jmenuArchivoProductoProdu);		
			this.jmenuBarProductoProdu.add(this.jmenuAccionesProductoProdu);		
			this.jmenuBarProductoProdu.add(this.jmenuDatosProductoProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoProdu= new JButtonMe();
		this.jButtonFK_IdBodegaProductoProdu.setText("Buscar");
		this.jButtonFK_IdBodegaProductoProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoProdu.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoProdu= new JButtonMe();
		this.jButtonFK_IdProductoProductoProdu.setText("Buscar");
		this.jButtonFK_IdProductoProductoProdu.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoProdu,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoProdu = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoProdu.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoProdu.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoProdu= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoProdu= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.setFocusable(false);

		this.jPanelFK_IdProductoDefiProduProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDefiProduProductoProdu.setToolTipText("Buscar Por Producto Defi Produ ");
		this.jButtonFK_IdProductoDefiProduProductoProdu= new JButtonMe();
		this.jButtonFK_IdProductoDefiProduProductoProdu.setText("Buscar");
		this.jButtonFK_IdProductoDefiProduProductoProdu.setToolTipText("Buscar Por Producto Defi Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDefiProduProductoProdu,"buscar_button","Buscar Por Producto Defi Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDefiProduProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu = new JLabelMe();
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setText("Producto Defi Produ :");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setToolTipText("Producto Defi Produ");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu= new JComboBoxMe();
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadUnadProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadUnadProductoProdu.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadUnadProductoProdu= new JButtonMe();
		this.jButtonFK_IdUnidadUnadProductoProdu.setText("Buscar");
		this.jButtonFK_IdUnidadUnadProductoProdu.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadUnadProductoProdu,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadUnadProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadUnadProductoProdu = new JLabelMe();
		jLabelid_unidadFK_IdUnidadUnadProductoProdu.setText("Unad :");
		jLabelid_unidadFK_IdUnidadUnadProductoProdu.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadUnadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadUnadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadUnadProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadUnadProductoProdu= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadUnadProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProdu = new ProductoProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Parte Produccion DATOS");
			this.jInternalFrameDetalleFormProductoProdu = new ProductoProduDetalleFormJInternalFrame(jDesktopPane,this.productoproduSessionBean.getConGuardarRelaciones(),this.productoproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProdu = null;//new ProductoProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProdu= new GridBagLayout();
		
		
		this.jTableDatosProductoProdu = new JTableMe();      
		
		String sToolTipProductoProdu="";
		sToolTipProductoProdu=ProductoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProdu+="(Produccion.ProductoProdu)";
		}
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProdu.setToolTipText(sToolTipProductoProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProdu);
		this.jTableDatosProductoProdu.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProdu.setRowSelectionAllowed(true);
		this.jTableDatosProductoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProdu = new JButtonMe();
		this.jButtonDuplicarProductoProdu = new JButtonMe();
		this.jButtonCopiarProductoProdu = new JButtonMe();
		this.jButtonVerFormProductoProdu = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProdu = new JButtonMe();
		this.jButtonCerrarProductoProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Parte Produccion";
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProdu=new ReporteDinamicoJInternalFrame(ProductoProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProdu=new ImportacionJInternalFrame(ProductoProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProdu.setText("Orden");
		this.jButtonAbrirOrderByProductoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProdu,false,this);
			
			//this.cargarOrderByProductoProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProdu,true,this);
			
			//this.cargarOrderByProductoProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProdu.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoProdu.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoProdu.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProductoProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProdu.setText("Nuevo");
		this.jButtonDuplicarProductoProdu.setText("Duplicar");
		this.jButtonCopiarProductoProdu.setText("Copiar");
		this.jButtonVerFormProductoProdu.setText("Ver");
		this.jButtonNuevoRelacionesProductoProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProdu.setText("Guardar");
		this.jButtonCerrarProductoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProdu,"nuevo_button","Nuevo",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProdu,"duplicar_button","Duplicar",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProdu,"copiar_button","Copiar",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProdu,"ver_form","Ver",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProdu,"nuevorelaciones_button","Nuevo Rel",this.productoproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProdu,"guardarcambiostabla_button","Guardar",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProdu,"cerrar_button","Salir",this.productoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProdu.setToolTipText("Nuevo"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProdu.setToolTipText("Duplicar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProdu.setToolTipText("Copiar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProdu.setToolTipText("Ver"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProdu.setToolTipText("Nuevo Rel"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProdu.setToolTipText("Guardar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProdu.setToolTipText("Salir"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProdu";
		inputMap = this.jButtonNuevoProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProdu";
		inputMap = this.jButtonDuplicarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProdu"));
		
		//COPIAR
		sMapKey = "CopiarProductoProdu";
		inputMap = this.jButtonCopiarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProdu"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProdu";
		inputMap = this.jButtonVerFormProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProdu";
		inputMap = this.jButtonNuevoRelacionesProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProdu";
		inputMap = this.jButtonModificarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProdu";
		inputMap = this.jButtonCerrarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProdu.setName("jPanelParametrosReportesProductoProdu"); 
		
		this.jPanelParametrosReportesAccionesProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProdu.setName("jPanelParametrosReportesAccionesProductoProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProdu = new JButtonMe();
		this.jButtonRecargarInformacionProductoProdu.setText("Recargar");
		this.jButtonRecargarInformacionProductoProdu.setToolTipText("Recargar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProdu = new JButtonMe();
		this.jButtonProcesarInformacionProductoProdu.setText("Procesar");
		this.jButtonProcesarInformacionProductoProdu.setToolTipText("Procesar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProdu.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProdu.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProdu.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProdu = new JLabelMe();
		
		this.jLabelAccionesProductoProdu.setText("Acciones");		
		this.jLabelAccionesProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProdu = new JButtonMe();
		//this.jButtonAnterioresProductoProdu.setText("<<");
        this.jButtonAnterioresProductoProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProdu = new JButtonMe();
		//this.jButtonSiguientesProductoProdu.setText(">>");
        this.jButtonSiguientesProductoProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProdu,"nuevoguardarcambios_button","Nue",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProdu";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProdu";
		inputMap = this.jButtonRecargarInformacionProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProdu";
		inputMap = this.jButtonSiguientesProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProdu";
		inputMap = this.jButtonAnterioresProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProdu.setMinimumSize(new Dimension(this.getWidth(),ProductoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProdu.setMaximumSize(new Dimension(this.getWidth(),ProductoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProdu.setPreferredSize(new Dimension(this.getWidth(),ProductoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProdu = new GridBagLayout();

			this.jPanelPaginacionProductoProdu.setLayout(gridaBagLayoutPaginacionProductoProdu);						
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 0;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProdu.add(this.jButtonAnterioresProductoProdu, this.gridBagConstraintsProductoProdu);
					
						
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProdu.gridy = 0;
			
			this.jPanelPaginacionProductoProdu.add(this.jButtonNuevoGuardarCambiosProductoProdu, this.gridBagConstraintsProductoProdu);
						
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProdu.gridy = 0;
			this.jPanelPaginacionProductoProdu.add(this.jButtonSiguientesProductoProdu, this.gridBagConstraintsProductoProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 1;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProdu.add(this.jButtonNuevoProductoProdu, this.gridBagConstraintsProductoProdu);
						
			
			
			if(!this.productoproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProdu.gridy = 1;
				this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProdu.add(this.jButtonGuardarCambiosTablaProductoProdu, this.gridBagConstraintsProductoProdu);
			}
			
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 1;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProdu.add(this.jButtonDuplicarProductoProdu, this.gridBagConstraintsProductoProdu);
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 1;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProdu.add(this.jButtonCopiarProductoProdu, this.gridBagConstraintsProductoProdu);
		
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 1;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProdu.add(this.jButtonVerFormProductoProdu, this.gridBagConstraintsProductoProdu);
		
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 1;
			this.gridBagConstraintsProductoProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProdu.add(this.jButtonCerrarProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		
		this.jButtonRecargarInformacionProductoProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProdu.setLayout(gridaBagParametrosReportesProductoProdu);
			this.jPanelParametrosReportesAccionesProductoProdu.setLayout(gridaBagParametrosReportesAccionesProductoProdu);
			
			
			this.jPanelParametrosAuxiliar1ProductoProdu.setLayout(gridaBagParametrosAuxiliar1ProductoProdu);
			this.jPanelParametrosAuxiliar2ProductoProdu.setLayout(gridaBagParametrosAuxiliar2ProductoProdu);
			this.jPanelParametrosAuxiliar3ProductoProdu.setLayout(gridaBagParametrosAuxiliar3ProductoProdu);
			this.jPanelParametrosAuxiliar4ProductoProdu.setLayout(gridaBagParametrosAuxiliar4ProductoProdu);
			//this.jPanelParametrosAuxiliar5ProductoProdu.setLayout(gridaBagParametrosAuxiliar2ProductoProdu);			
			
			
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProdu.add(this.jButtonRecargarInformacionProductoProdu, this.gridBagConstraintsProductoProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProdu.add(this.jComboBoxTiposPaginacionProductoProdu, this.gridBagConstraintsProductoProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProdu.add(this.jCheckBoxConAltoMaximoTablaProductoProdu, this.gridBagConstraintsProductoProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProdu.add(this.jComboBoxTiposArchivosReportesProductoProdu, this.gridBagConstraintsProductoProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProdu.add(this.jPanelParametrosAuxiliar1ProductoProdu, this.gridBagConstraintsProductoProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProdu.add(this.jComboBoxTiposReportesProductoProdu, this.gridBagConstraintsProductoProdu);																		
			
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProdu.add(this.jComboBoxTiposGraficosReportesProductoProdu, this.gridBagConstraintsProductoProdu);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProdu.add(this.jPanelParametrosAuxiliar4ProductoProdu, this.gridBagConstraintsProductoProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProdu.add(this.jComboBoxTiposReportesProductoProdu, this.gridBagConstraintsProductoProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProdu.add(this.jCheckBoxGenerarReporteProductoProdu, this.gridBagConstraintsProductoProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProdu.add(this.jPanelParametrosAuxiliar2ProductoProdu, this.gridBagConstraintsProductoProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProdu.add(this.jLabelAccionesProductoProdu, this.gridBagConstraintsProductoProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProdu.add(this.jButtonAbrirOrderByProductoProdu, this.gridBagConstraintsProductoProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProdu.add(this.jComboBoxTiposSeleccionarProductoProdu, this.gridBagConstraintsProductoProdu);			
			
			
			/*
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProdu.add(this.jCheckBoxSeleccionarTodosProductoProdu, this.gridBagConstraintsProductoProdu);
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProdu.add(this.jCheckBoxConGraficoReporteProductoProdu, this.gridBagConstraintsProductoProdu);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProdu.add(this.jCheckBoxSeleccionarTodosProductoProdu, this.gridBagConstraintsProductoProdu);															
				
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProdu.add(this.jCheckBoxSeleccionadosProductoProdu, this.gridBagConstraintsProductoProdu);															
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProdu.add(this.jCheckBoxConGraficoReporteProductoProdu, this.gridBagConstraintsProductoProdu);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProdu.add(this.jPanelParametrosAuxiliar3ProductoProdu, this.gridBagConstraintsProductoProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProdu.add(this.jComboBoxTiposAccionesProductoProdu, this.gridBagConstraintsProductoProdu);
	
				
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProdu.add(this.jTextFieldValorCampoGeneralProductoProdu, this.gridBagConstraintsProductoProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProdu = new GridBagLayout();

			this.jScrollPanelDatosProductoProdu.setLayout(gridaBagLayoutDatosProductoProdu);
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = 0;
			this.gridBagConstraintsProductoProdu.gridx = 0;
			
			this.jScrollPanelDatosProductoProdu.add(this.jTableDatosProductoProdu, this.gridBagConstraintsProductoProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProdu.setViewportView(this.jTableDatosProductoProdu);
		this.jTableDatosProductoProdu.setFillsViewportHeight(true);
		this.jTableDatosProductoProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProdu= new GridBagLayout();
		this.jPanelAccionesProductoProdu.setLayout(gridaBagLayoutAccionesProductoProdu);
		
		
		/*	
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 0;
			
		this.jPanelAccionesProductoProdu.add(this.jButtonNuevoProductoProdu, this.gridBagConstraintsProductoProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoProdu.setLayout(gridaBagLayoutFK_IdBodegaProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 0;
		jPanelFK_IdBodegaProductoProdu.add(jLabelid_bodegaFK_IdBodegaProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 1;
		jPanelFK_IdBodegaProductoProdu.add(jComboBoxid_bodegaFK_IdBodegaProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 1;
		gridBagConstraintsProductoProdu.gridx =1;
		jPanelFK_IdBodegaProductoProdu.add(jButtonFK_IdBodegaProductoProdu, gridBagConstraintsProductoProdu);

		jTabbedPaneBusquedasProductoProdu.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoProdu);
		jTabbedPaneBusquedasProductoProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoProdu.setLayout(gridaBagLayoutFK_IdProductoProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 0;
		jPanelFK_IdProductoProductoProdu.add(jLabelid_productoFK_IdProductoProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 1;
		jPanelFK_IdProductoProductoProdu.add(jComboBoxid_productoFK_IdProductoProductoProdu, gridBagConstraintsProductoProdu);


		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 0;
		jPanelFK_IdProductoProductoProdu.add(this.jButtonBuscarFK_IdProductoid_productoProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 1;
		gridBagConstraintsProductoProdu.gridx =1;
		jPanelFK_IdProductoProductoProdu.add(jButtonFK_IdProductoProductoProdu, gridBagConstraintsProductoProdu);

		jTabbedPaneBusquedasProductoProdu.addTab("2.-Por Producto ", jPanelFK_IdProductoProductoProdu);
		jTabbedPaneBusquedasProductoProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDefiProduProductoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDefiProduProductoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDefiProduProductoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDefiProduProductoProdu.setLayout(gridaBagLayoutFK_IdProductoDefiProduProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 0;
		jPanelFK_IdProductoDefiProduProductoProdu.add(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 1;
		jPanelFK_IdProductoDefiProduProductoProdu.add(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 1;
		gridBagConstraintsProductoProdu.gridx =1;
		jPanelFK_IdProductoDefiProduProductoProdu.add(jButtonFK_IdProductoDefiProduProductoProdu, gridBagConstraintsProductoProdu);

		jTabbedPaneBusquedasProductoProdu.addTab("3.-Por Producto Defi Produ ", jPanelFK_IdProductoDefiProduProductoProdu);
		jTabbedPaneBusquedasProductoProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadUnadProductoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadUnadProductoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadProductoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadUnadProductoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadUnadProductoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadUnadProductoProdu.setLayout(gridaBagLayoutFK_IdUnidadUnadProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 0;
		jPanelFK_IdUnidadUnadProductoProdu.add(jLabelid_unidadFK_IdUnidadUnadProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 0;
		gridBagConstraintsProductoProdu.gridx = 1;
		jPanelFK_IdUnidadUnadProductoProdu.add(jComboBoxid_unidadFK_IdUnidadUnadProductoProdu, gridBagConstraintsProductoProdu);

		gridBagConstraintsProductoProdu = new GridBagConstraints();
		gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProdu.gridy = 1;
		gridBagConstraintsProductoProdu.gridx =1;
		jPanelFK_IdUnidadUnadProductoProdu.add(jButtonFK_IdUnidadUnadProductoProdu, gridBagConstraintsProductoProdu);

		jTabbedPaneBusquedasProductoProdu.addTab("4.-Por Unad ", jPanelFK_IdUnidadUnadProductoProdu);
		jTabbedPaneBusquedasProductoProdu.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProdu.gridx = 0;		
			//this.gridBagConstraintsProductoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProdu, this.gridBagConstraintsProductoProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProdu.gridx = 0;		
		//this.gridBagConstraintsProductoProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProdu.gridx = 0;		
			this.gridBagConstraintsProductoProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProdu, this.gridBagConstraintsProductoProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProdu, this.gridBagConstraintsProductoProdu);								
		
		
		/*
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProdu, this.gridBagConstraintsProductoProdu);
		*/		
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProdu.gridx =0;
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProdu, this.gridBagConstraintsProductoProdu);
				
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProdu, this.gridBagConstraintsProductoProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProdu.setLayout(gridaBagLayoutBusquedasParametrosProductoProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProdu, this.gridBagConstraintsProductoProdu);
			
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProdu, this.gridBagConstraintsProductoProdu);
		
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProdu, this.gridBagConstraintsProductoProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProdu.setName("jPanelReporteDinamicoProductoProdu"); 
		
		this.jPanelReporteDinamicoProductoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProdu.setLayout(gridaBagLayoutReporteDinamicoProductoProdu);
		
		
		this.jInternalFrameReporteDinamicoProductoProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelColumnasSelectReporteProductoProdu, this.gridBagConstraintsProductoProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProdu=new JScrollPane(this.jListColumnasSelectReporteProductoProdu);
			
			this.jScrollColumnasSelectReporteProductoProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProdu.add(this.jListColumnasSelectReporteProductoProdu, this.gridBagConstraintsProductoProdu);
		this.jPanelReporteDinamicoProductoProdu.add(this.jScrollColumnasSelectReporteProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProdu=new JScrollPane(this.jListRelacionesSelectReporteProductoProdu);
			
			this.jScrollRelacionesSelectReporteProductoProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProdu = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProdu.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelConGraficoDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProdu.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProdu.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProdu.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jCheckBoxConGraficoDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProdu = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProdu.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelColumnaCategoriaGraficoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProdu.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProdu.add(this.jComboBoxColumnaCategoriaGraficoProductoProdu, this.gridBagConstraintsProductoProdu);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProdu = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProdu.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelColumnaCategoriaValorProductoProdu, this.gridBagConstraintsProductoProdu);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProdu.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProdu.add(this.jComboBoxColumnaCategoriaValorProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProdu = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProdu.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelColumnasValoresGraficoProductoProdu, this.gridBagConstraintsProductoProdu);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProdu = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProdu.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProdu=new JScrollPane(this.jListColumnasValoresGraficoProductoProdu);
			
			this.jScrollColumnasValoresGraficoProductoProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProdu.add(this.jListColumnasSelectReporteProductoProdu, this.gridBagConstraintsProductoProdu);
		this.jPanelReporteDinamicoProductoProdu.add(this.jScrollColumnasValoresGraficoProductoProdu, this.gridBagConstraintsProductoProdu);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProdu = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProdu.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelTiposGraficosReportesDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProdu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProdu.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProdu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProdu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelGenerarExcelReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProdu.setToolTipText("Generar EXCEL"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProdu.add(this.jButtonGenerarExcelReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProdu.add(this.jComboBoxTiposReportesDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProdu.add(this.jLabelTiposArchivoReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProdu.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProdu.setToolTipText("Generar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProdu.add(this.jButtonGenerarReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProdu.setToolTipText("Cancelar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProdu.add(this.jButtonCerrarReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProdu= new JScrollPane(jPanelReporteDinamicoProductoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProdu);
		this.jInternalFrameReporteDinamicoProductoProdu.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProdu, this.gridBagConstraintsProductoProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProdu.setName("jPanelImportacionProductoProdu"); 
		
		this.jPanelImportacionProductoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProdu.setLayout(gridaBagLayoutImportacionProductoProdu);
		
		
		this.jInternalFrameImportacionProductoProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProdu = new JLabelMe();

		this.jLabelArchivoImportacionProductoProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProdu.add(this.jLabelArchivoImportacionProductoProdu, this.gridBagConstraintsProductoProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProdu = new JFileChooser();		
		this.jFileChooserImportacionProductoProdu.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProdu = new JButtonMe();
		this.jButtonAbrirImportacionProductoProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProdu.setToolTipText("Generar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProdu.add(this.jButtonAbrirImportacionProductoProdu, this.gridBagConstraintsProductoProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProdu.add(this.jLabelPathArchivoImportacionProductoProdu, this.gridBagConstraintsProductoProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProdu.add(this.jTextFieldPathArchivoImportacionProductoProdu, this.gridBagConstraintsProductoProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProdu = new JButtonMe();
		this.jButtonGenerarImportacionProductoProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProdu.setToolTipText("Generar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProdu.add(this.jButtonGenerarImportacionProductoProdu, this.gridBagConstraintsProductoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProdu = new JButtonMe();
		this.jButtonCerrarImportacionProductoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProdu.setToolTipText("Cancelar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProdu.add(this.jButtonCerrarImportacionProductoProdu, this.gridBagConstraintsProductoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProdu= new JScrollPane(jPanelImportacionProductoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProdu);
		this.jInternalFrameImportacionProductoProdu.getContentPane().add(this.jScrollPanelImportacionProductoProdu, this.gridBagConstraintsProductoProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProdu = new JButtonMe();
			this.jButtonAbrirOrderByProductoProdu.setText("Orden");
			this.jButtonAbrirOrderByProductoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProdu";
			inputMap = this.jButtonAbrirOrderByProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProdu.setName("jPanelOrderByProductoProdu"); 
			
			this.jPanelOrderByProductoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProdu.setLayout(gridaBagLayoutOrderByProductoProdu);
			
			
			this.jTableDatosProductoProduOrderBy = new JTableMe();        
			this.jTableDatosProductoProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProduOrderBy.setViewportView(this.jTableDatosProductoProduOrderBy);
			this.jTableDatosProductoProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProdu.setTitle("Orden");
			this.jInternalFrameOrderByProductoProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProdu.setResizable(true);
			this.jInternalFrameOrderByProductoProdu.setClosable(true);
			this.jInternalFrameOrderByProductoProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProdu.ipady =150;
				
			this.jPanelOrderByProductoProdu.add(jScrollPanelDatosProductoProduOrderBy, this.gridBagConstraintsProductoProdu);//this.jTableDatosProductoProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProdu = new JButtonMe();
			this.jButtonCerrarOrderByProductoProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProdu.setToolTipText("Cancelar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProdu.add(this.jButtonCerrarOrderByProductoProdu, this.gridBagConstraintsProductoProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProdu= new JScrollPane(jPanelOrderByProductoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProdu);
			
			this.jInternalFrameOrderByProductoProdu.getContentPane().add(this.jScrollPanelOrderByProductoProdu, this.gridBagConstraintsProductoProdu);			
		
		} else {
			this.jButtonAbrirOrderByProductoProdu = new JButtonMe();
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
			&& this.productoproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProdu.getRowHeight();//ProductoProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProdu.isSelected()) {
					iHeightTable=ProductoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProdu.isSelected()) {
					iHeightTable=ProductoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProdu!=null && this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoproduLogic.getProductoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProdu> TraerProductoProduBeans(List<ProductoProdu> productoprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProdu productoprodu:productoprodus) {
					
				if(!(ProductoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoprodu.setsDetalleGeneralEntityReporte(ProductoProduConstantesFunciones.getProductoProduDescripcion(productoprodu));
										
						
					
						
					
				} else  {
							
					//productoprodu.setsDetalleGeneralEntityReporte(productoprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoprodubeans.add(productoprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoprodus;
    }
	//PARA REPORTES FIN
}
